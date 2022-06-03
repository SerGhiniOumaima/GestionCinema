package org.sid.cinema.entities;

import java.util.Collection;
import javax.persistence.*;

import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString


public class Ticket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String nomClient;
	private double prix;
	@Column(unique=true)
	private int codePayement;
	private boolean reserve;
	@ManyToOne
	private Place place;
	@ManyToOne
	private Projection projection ;

}
