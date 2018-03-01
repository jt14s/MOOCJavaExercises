package exercise46.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercise46.reference.domain.Film;
import exercise46.reference.domain.Person;
import exercise46.reference.domain.Rating;

public class RatingRegister {

	private Map<Film, List<Rating>> filmRatings;
	private Map<Person, Map<Film, Rating>> personalRatings;
	
	public RatingRegister() {
		filmRatings = new HashMap<>();
		personalRatings = new HashMap<>();
	}
	
	public void addRating(Film film, Rating rating) {
		if (filmRatings.containsKey(film))
			filmRatings.get(film).add(rating);
		else
			filmRatings.put(film, new ArrayList<>(Arrays.asList(rating)));
	}
	
	public List<Rating> getRatings(Film film) {
		if (filmRatings.containsKey(film))
			return filmRatings.get(film);
		
		return null;
	}
	
	public Map<Film, List<Rating>> filmRatings() {
		return filmRatings;
	}
	
	public void addRating(Person person, Film film, Rating rating) {
		if (personalRatings.containsKey(person)) {
			if (!personalRatings.get(person).containsKey(film)) {
				personalRatings.get(person).put(film, rating);
				
				addRating(film, rating);
			}
		} else {
			Map<Film, Rating> personalFilmRating = new HashMap<>();
			personalFilmRating.put(film, rating);
			personalRatings.put(person, personalFilmRating);
			
			addRating(film, rating);
		}
	}
	
	public Rating getRating(Person person, Film film) {
		if (personalRatings.containsKey(person)) {
			for (Map<Film, Rating> personalRating : personalRatings.values()) {
				if (personalRating.containsKey(film))
					return personalRating.get(film);
			}
		}
		
		return Rating.NOT_WATCHED;
	}
	
	public Map<Film, Rating> getPersonalRatings(Person person) {
		if (personalRatings.containsKey(person))
			return personalRatings.get(person);
		
		return null;
	}
	
	public List<Person> reviewers() {
		List<Person> people = new ArrayList<>();
		
		for (Person person : personalRatings.keySet())
			people.add(person);
		
		return people;
	}
}
