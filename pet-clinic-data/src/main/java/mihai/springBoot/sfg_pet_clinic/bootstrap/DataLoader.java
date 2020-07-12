package mihai.springBoot.sfg_pet_clinic.bootstrap;

import mihai.springBoot.sfg_pet_clinic.model.Owner;
import mihai.springBoot.sfg_pet_clinic.model.Vet;
import mihai.springBoot.sfg_pet_clinic.services.OwnerService;
import mihai.springBoot.sfg_pet_clinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Ion");
        owner1.setLastName("Coaie");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Greu");
        owner2.setLastName("Boss");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Colo");
        vet1.setLastName("Ciolo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Trolo");
        vet2.setLastName("Ciumeg");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
