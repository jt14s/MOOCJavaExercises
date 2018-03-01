package exercise46.reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import exercise46.reference.domain.Film;
import exercise46.reference.domain.Rating;


public class FilmComparator implements Comparator<Film> {

	private Map<Film, List<Rating>> ratings;
	
	public FilmComparator(Map<Film, List<Rating>> ratings) {
		this.ratings = ratings;
	}

	@Override
	public int compare(Film film1, Film film2) {
		List<Integer> film1Ratings = ratings.get(film1).stream().map(rating -> rating.getValue()).collect(Collectors.toList());
		List<Integer> film2Ratings = ratings.get(film2).stream().map(rating -> rating.getValue()).collect(Collectors.toList());
		
		int film1Avg = 0;
		for (int score : film1Ratings)
			film1Avg += score;
		film1Avg /= film1Ratings.size();
		
		int film2Avg = 0;
		for (int score : film2Ratings)
			film2Avg += score;
		film2Avg /= film2Ratings.size();

		return film2Avg - film1Avg;
	}
}
