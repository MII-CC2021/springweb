package edu.cc.examples.springdata.dao;

import edu.cc.examples.springdata.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetDao extends JpaRepository<Pet, Long>{

	// ya temdriamos los prinicpales métodos CRUD
	// y podemos crear nuestros propios métodos
}