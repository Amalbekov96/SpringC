package ru.otus.junit.dao;

import ru.otus.junit.domain.Person;

import java.util.List;

public class PersonDaoImpl implements PersonDao {

    // TODO: добавить поле - список Person-ов

//Me
    public void listOfPersons(){
        List<Person> persons = getAll();

        for(int i =0; i < persons.size(); i++){
            System.out.println("Name :" + persons.get(i).getName() + " Age : " + persons.get(i).getAge());
        }

    }
//


    @Override
    public Person getByName(String name) throws PersonNotFoundException {
        // TODO: реализовать поиск в списке по имени (по технике Test-First)
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом
        return null;
    }

    @Override
    public List<Person> getAll() {
        // TODO: реализовать получние всех Person (по технике Test-First)
        return null;
    }

    @Override
    public void deleteByName(String name) throws PersonNotFoundException {
        // TODO: реализовать удаление по имени (по технике Test-First)
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом
    }

    @Override
    public void save(Person person) {
        // TODO: этот метод должен найти по имени в списке
        // TODO: если такой есть - заменить
        // TODO: если такого нет - добавить
    }
}
