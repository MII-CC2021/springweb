
package edu.cc.examples.springdata.services;

import java.util.List;
import edu.cc.examples.springdata.models.Pet;

public interface IUserService {

	public List<Pet> listadoUsuarios();
	
	public void guardarUsuario(Pet pet);
	
	public void eliminarUsuario(Pet pet);
	
	public Pet findUsuario(Pet pet);
	
}
