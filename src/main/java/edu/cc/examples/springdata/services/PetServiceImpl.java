package edu.cc.examples.springdata.services;

import java.util.List;
import edu.cc.examples.springdata.dao.IUserDao;
import edu.cc.examples.springdata.dao.IPetDao;
import edu.cc.examples.springdata.models.User;
import edu.cc.examples.springdata.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PetServiceImpl implements IPetService {

    @Autowired
    private IUserDao usuarioDao;
    private IPetDao petDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Pet> ListPet() {
        List<Pet> listPet = (List<Pet>) petDao.findAll();
        return listPet;
    }

    @Override
    @Transactional
    public void guardarPet(Pet pet) {
        petDao.save(pet);
    }

    @Override
    @Transactional
    public void eliminarPet(Pet pet) {
        petDao.delete(pet);
    }

    @Override
    @Transactional(readOnly = true)
    public Pet findPet(Pet pet) {
        return petDao.findById(pet.getId()).orElse(null);
    }
}
