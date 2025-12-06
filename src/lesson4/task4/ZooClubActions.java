package lesson4.task4;

public interface ZooClubActions {
        void addPerson(Person person);

        void addPetToPerson(Person person, Pet pet);

        void removePetFromPerson(Person person, Pet pet);

        void removePerson(Person person);

        void removePetFromAllOwners(Pet pet);

        void printClub();
    }


