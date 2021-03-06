package org.sid.cinema.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Projection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private Date dateProjection;
	private double prix;
	@ManyToOne
	private Salle salle ;
	@ManyToOne
	private Film film;
	@OneToMany(mappedBy="projection")
	private Collection<Ticket> tickets;
	//unidirectionnel pas besoin de modifier seance
	@ManyToOne
	private Seance seance;

}