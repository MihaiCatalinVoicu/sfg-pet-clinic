package mihai.springBoot.sfg_pet_clinic.services.map;

import mihai.springBoot.sfg_pet_clinic.model.Pet;
import mihai.springBoot.sfg_pet_clinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

@Override
public Set<Pet> findAll() {
    return super.findAll();
}

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
