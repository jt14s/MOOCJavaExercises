package exercise46;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercise46.reference.RatingRegister;
import exercise46.reference.comparator.FilmComparator;
import exercise46.reference.comparator.PersonComparator;
import exercise46.reference.domain.Film;
import exercise46.reference.domain.Person;
import exercise46.reference.domain.Rating;

class Main {

	public static void main(String[] args) {
		 RatingRegister ratings = new RatingRegister();

		    Film goneWithTheWind = new Film("Gone with the Wind");
		    Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
		    Film eraserhead = new Film("Eraserhead");

		    Person matti = new Person("Matti");
		    Person pekka = new Person("Pekka");
		    Person mikke = new Person("Mikke");

		    ratings.addRating(matti, goneWithTheWind, Rating.BAD);
		    ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
		    ratings.addRating(matti, eraserhead, Rating.FINE);

		    ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
		    ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
		    ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

		    ratings.addRating(mikke, eraserhead, Rating.BAD);

		    Map<Film, List<Rating>> filmRatings = ratings.filmRatings();

		    List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
		    System.out.println("The films before sorting: " + films);

		    Collections.sort(films, new FilmComparator(filmRatings));
		    System.out.println("The films after sorting: " + films);
	}
}
