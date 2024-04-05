package Ch36Prac.Domain.Service;

import java.util.List;

import Ch36Prac.Domain.Dao.MovieDaoImpl;
import Ch36Prac.Domain.Dto.MovieDto;

public class MovieServiceImpl {
	private MovieDaoImpl dao;
	
	public MovieServiceImpl() throws Exception{
		dao = new MovieDaoImpl();
	}
	
	public boolean MovieRegister(MovieDto dto) throws Exception {
		return dao.Insert(dto);
	}
	public List<MovieDto> getAllMovies() throws Exception {
		return dao.SelectAll();
	}
	public MovieDto getMovie(int 영화_id) throws Exception {
		return dao.Select(영화_id);
	}
}