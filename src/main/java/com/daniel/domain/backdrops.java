package com.daniel.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "backdrops") // 標記這個class對映一個collection，在(Movie)這個collection裡面操作document
@Getter
@Setter
public class backdrops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany(mappedBy="backdrop")
	private Set<Movie> movies = new HashSet<>();
	
	@Column(name = "backdrops", length = 128)
	private String backdrops;
}
