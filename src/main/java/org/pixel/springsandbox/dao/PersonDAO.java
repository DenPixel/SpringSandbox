package org.pixel.springsandbox.dao;

import org.pixel.springsandbox.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int COUNT_PEOPLE;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++COUNT_PEOPLE, "qwerty"));
        people.add(new Person(++COUNT_PEOPLE, "asdfgh"));
        people.add(new Person(++COUNT_PEOPLE, "zxcvbn"));
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person getPerson(int id) {
        return getPeople().stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElseThrow();
    }

    public void save(Person person) {
        person.setId(++COUNT_PEOPLE);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personForUp = getPerson(id);
        personForUp.setName(person.getName());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
