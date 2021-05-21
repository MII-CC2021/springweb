package edu.cc.examples.springdata.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import User;

@Entity
@Data
@Table(name="pets")
public class Pet implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nombre;
	private String type;
	private User user; 
	
}