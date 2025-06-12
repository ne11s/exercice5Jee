package org.example.exercice5jee.service;

import org.example.exercice5jee.dao.DogDao;
import org.example.exercice5jee.models.Dog;
import org.example.exercice5jee.util.SessionFactorySingleton;

import java.time.LocalDate;
import java.util.List;

public class ChenileService {

    private DogDao dogDao = new DogDao(SessionFactorySingleton.getSession());

    public void creatdog( String name, String breed, LocalDate birthday) {
        Dog dog = Dog.builder().name(name).breed(breed).birthday(birthday).build();
        dogDao.save(dog);
    }
    public Dog getDog(int id) {
        return dogDao.get(id);
    }
    public List<Dog> getAllDogs() {
        return dogDao.get();
    }
    public void updateDog(Dog dog) {
        dogDao.update(dog);
    }
    public void deleteDog(int id) {
        dogDao.delete(dogDao.get(id));
    }

}
