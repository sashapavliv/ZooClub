package ListExample;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String surmane;
    private int age;
    private List<Animal> animals = new ArrayList<>();

    public Person(int id, String name, String surmane, int age) {
        this.id = id;
        this.name = name;
        this.surmane = surmane;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }
    public List<Animal> getAnimals() {
        return animals;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", surmane: " + surmane  + ", age: "+ age+" Animals: "+animals;
    }
}
