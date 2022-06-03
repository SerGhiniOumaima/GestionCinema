package org.sid.cinema.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Categorie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	//spécifier la taille de la colonne 
	@Column(length=65)
	private String name;
	@OneToMany(mappedBy="categorie")
	private Collection<Film> films;
}
