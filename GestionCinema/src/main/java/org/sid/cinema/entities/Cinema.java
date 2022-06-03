package org.sid.cinema.entities;

import java.io.Serializable;
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

//serializable n'est pas importante => comprendre la notion de serialisation
@Entity
//c est data qui genrerent les getters et setters
@Data
//générer auto un constructeur avec tous les paramètres et sans para
@AllArgsConstructor @NoArgsConstructor @ToString
public class Cinema implements Serializable {
	@Id
	//Cette annotation indique que la clé primaire est générée de façon automatique lors de l’insertion en base
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double longitude,latitude,altitude;
	private int nombresalles;
	@OneToMany(mappedBy="cinema")
	private Collection<Salle> salles;
	@ManyToOne
	private Ville ville;

}
