package com.daniel.service.impl;

import com.daniel.dao.MovieRepository;
import com.daniel.domain.Movie;
import com.daniel.service.MovieService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
	
	@Resource
	private MovieRepository movieRepository;
	
	@Override
	public Movie allMovies() {
		System.out.println("123");
		return movieRepository.findById(1).get();
	}
	
}
