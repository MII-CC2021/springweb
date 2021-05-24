

package edu.cc.examples.springdata.services;

import java.util.List;
import edu.cc.examples.springdata.dao.IUserDao;
import edu.cc.examples.springdata.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PetServiceImpl implements IPetService {

    @Autowired
    private IPetDao petDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Pet> listPets() {
        List<Pet> listpets = (List<Pet>) petDao.findAll();
        return listUsers;
    }

    @Override
    @Transactional
    public void savePet(Pet pet) {
        petDao.save(pet);
    }

    @Override
    @Transactional
    public void deletePet(Pet pet) {
        petDao.delete(pet);
    }

    @Override
    @Transactional(readOnly = true)
    public User findPet(Pet pet) {
        return petDao.findById(pet.getId()).orElse(null);
    }
    
     @Override
    @Transactional(readOnly = true)
    public User getUser(Pet pet) {
        
        Pet pet = petDao.findById(pet.getId()).orElse(null);
        return pet.User;
    }
}
}