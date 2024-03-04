package com.daniel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.daniel.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>,JpaSpecificationExecutor<Movie>{

}
