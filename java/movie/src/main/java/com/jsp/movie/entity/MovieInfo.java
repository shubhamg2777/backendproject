package com.jsp.movie.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jsp.movie.constant.EntityConstant;
@Entity
@Table(name= EntityConstant.MOVIE_INFO)
public class MovieInfo implements Serializable {
@Id
@Column(name="id")
	private int id;
@Column(name="movie_name")
	private String moviename;
@Column(name="actor_name")
	private String actorname;
@Column(name="actress_name")
	private String actressname;
@Column(name="budget")
	private String budget;

public MovieInfo() {
	
}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getActressname() {
		return actressname;
	}
	public void setActressname(String actressname) {
		this.actressname = actressname;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	

}
 