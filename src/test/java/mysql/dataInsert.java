package mysql;

import com.daniel.MainStarter;
import com.daniel.dao.MovieRepository;
import com.daniel.domain.Movie;
import com.daniel.domain.backdrops;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainStarter.class)
public class dataInsert {
	@Resource
	private MovieRepository movieRepository;
	
	@Test
	public void testInsert() {
		Movie movie = new Movie();
		movie.setImdbId("tt3915174");
		movie.setTitle("Puss in Boots: The Last Wish");
		movie.setReleaseDate("2022-12-21");
		movie.setTrailerLink("https://www.youtube.com/watch?v=tHb7WlgyaUc");
		movie.setPoster("https://image.tmdb.org/t/p/w500/1NqwE6LP9IEdOZ57NCT51ftHtWT.jpg");
		
		backdrops b0 = new backdrops();
		b0.setBackdrops("https://image.tmdb.org/t/p/original/r9PkFnRUIthgBp2JZZzD380MWZy.jpg");
		b0.getMovies().add(movie);
		movie.setBackdrop(b0);

		movieRepository.save(movie);
	}
}
