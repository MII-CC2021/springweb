
package edu.cc.examples.springdata.services;

import java.util.List;
import edu.cc.examples.springdata.models.Pet;
import edu.cc.examples.springdata.models.User;

public interface IPetService {

	public List<Pet> listPets();
	
	public void savePet(Pet pet);
	
	public void deletePet(Pet pet);
	
	public Pet findPet(Pet pet);

	public User getUser(Pet pet);
	
}
