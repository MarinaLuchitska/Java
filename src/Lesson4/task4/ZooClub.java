package Lesson4.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ZooClub implements ZooClubActions {
    private Map<Person, List<Pet>> club;

    public ZooClub() {
        club = new HashMap<>();
    }

    // 1) додати учасника
    @Override
    public void addPerson(Person person) {
        club.put(person,new ArrayList<>());
    }

    // 2) додати тваринку до учасника
    @Override
    public void addPetToPerson(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        pets.add(pet);
    }

    // 3) видалити тваринку з власника

    @Override
    public void removePetFromPerson(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        pets.remove(pet);
    }

    // 4) видалити учасника клубу
    public void removePerson(Person person) {
        club.remove(person);
    }

    // 5) видалити конкретну тваринку з усіх власників
    @Override
    public void removePetFromAllOwners(Pet pet) {
        for (List<Pet> pets:club.values() ) {
            pets.remove(pet);
        }
    }
    // 6) вивести клуб
    @Override
    public void printClub() {
        for (Person person : club.keySet()) {
            System.out.print(person.getName() + ": ");
            List<Pet> pets = club.get(person);
            for (Pet pet : pets) {
                System.out.print(pet.getType() + " " + pet.getName() + ", ");
            }
            System.out.println();
        }
    }
}

