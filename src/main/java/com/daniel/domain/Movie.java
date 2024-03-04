package com.daniel.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies") // 標記這個class對映一個collection，在(Movie)這個collection裡面操作document
//@AllArgsConstructor
//@NoArgsConstructor
//@Data // getter + setter + equals + hashCode + toString
@Getter
@Setter
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "imdbId")
	private String imdbId;

	@Column(name = "title")
	private String title;

	@Column(name = "releaseDate",length = 10)
	private String releaseDate;

	@Column(name = "trailerLink")
	private String trailerLink;

	@Column(name = "poster")
	private String poster;

	@ManyToOne(cascade=CascadeType.PERSIST)
	//@JoinColumn：维护外键字段 fk
	@JoinColumn(name="genresfk")
	private genres genre;

	@ManyToOne(cascade=CascadeType.PERSIST)
	//@JoinColumn：维护外键字段 fk
	@JoinColumn(name="backdropsfk")
	private backdrops backdrop;

	@ManyToOne(cascade=CascadeType.PERSIST)
	//@JoinColumn：维护外键字段 fk
	@JoinColumn(name="reviewIdsfk")
	private reviewIds reviewId;

}

