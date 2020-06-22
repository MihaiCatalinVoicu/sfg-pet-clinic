package mihai.springBoot.sfg_pet_clinic.services;

import mihai.springBoot.sfg_pet_clinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long>{

    Owner findByLastName(String lastName);

}
