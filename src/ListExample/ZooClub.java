package ListExample;

import java.util.*;

public class ZooClub {
    List<Person> zoo = new ArrayList<>();

    public void addMember() {
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("Enter name of person");
        sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter surname of person");
        sc = new Scanner(System.in);
        String surname = sc.next();
        System.out.println("Enter age of person");
        sc = new Scanner(System.in);
        int age = sc.nextInt();
        zoo.add(new Person(id, name, surname, age));
        System.out.println("New member " + name + " " + surname + " added to zoo club");
    }

    public void addAnimalToMember() {
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Person i : zoo) {
            if (id == i.getId()) {
                System.out.println("You want add new animal to " + i.getName() + " " + i.getSurmane());
                System.out.println("If it's true, enter 'y', else 'n'");
                sc = new Scanner(System.in);
                if (sc.next().toLowerCase().equals("y")) {
                    System.out.println("Enter name of animal");
                    sc = new Scanner(System.in);
                    String nameAnimal = sc.next();
                    System.out.println("Enter nickname of animal");
                    sc = new Scanner(System.in);
                    String nicknameAnimal = sc.next();
                    System.out.println("Enter age of animal");
                    sc = new Scanner(System.in);
                    int ageAnimal = sc.nextInt();
                    System.out.println("Enter 'yes' if animal is angry or 'on' if not");
                    sc = new Scanner(System.in);
                    boolean isAngry = false;
                    if (sc.next().toLowerCase().equals("yes")) {
                        isAngry = true;
                    } else if (sc.next().toLowerCase().equals("no")) {
                        isAngry = false;
                    }
                    i.getAnimals().add(new Animal(nameAnimal, nicknameAnimal, ageAnimal, isAngry));
                    System.out.println(nameAnimal + " " + nicknameAnimal + " is added to " + i.getName() + " " + i.getSurmane());
                }
            }
        }
    }

    public void deleteAnimalWihtoutMember() {
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Person i : zoo) {
            if (id == i.getId()) {
                System.out.println("You want delete  animal without " + i.getName() + " " + i.getSurmane());
                System.out.println("If it's true, enter 'y', else 'n'");
                sc = new Scanner(System.in);
                if (sc.next().toLowerCase().equals("y")) {
                    System.out.println("What nickname of animal you want to delete?");
                    sc = new Scanner(System.in);
                    String nickname = sc.next();
                    for (Animal a : i.getAnimals()) {
                        if(nickname.equalsIgnoreCase(a.getNiknameAnimal())){
                            System.out.println(a.getNiknameAnimal());
                        }
//                        Iterator<Animal> iter = i.getAnimals().iterator();
//                        while (iter.hasNext()) {
//                            Animal animal = iter.next();
//                            if (nickname.equalsIgnoreCase(a.getNiknameAnimal())) {
//                                iter.remove();
//                            }
//                        }
                    }
                } else {
                    addAnimalToMember();
                }
            } else {
                System.out.println("There is no such member in the club, try again");
                addAnimalToMember();
            }
        }
    }

    public void deleteMember() {
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Person i : zoo) {
            if (id == i.getId()) {
                System.out.println("You want delete " + i.getName() + " " + i.getSurmane()+" without club?");
                System.out.println("If it's true, enter 'y', else 'n'");
                sc = new Scanner(System.in);
                if (sc.next().toLowerCase().equals("y")) {
                    Iterator<Person> iterator = zoo.iterator();
                    while (iterator.hasNext()){
                        Person person = iterator.next();
                        if(id==i.getId()){
                            iterator.remove();
                        }
                    }
                }
            }
        }
    }

    public void printAllAnimals(){
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Person i : zoo) {
            if (id == i.getId()) {
                System.out.println(i.getName()+" "+i.getSurmane()+" have:");
                    i.getAnimals().forEach(animal -> System.out.println(animal));
            }
        }
    }


    public void printZooClub() {
        System.out.println("---Zoo Club---");
        zoo.forEach(zoo -> System.out.println(zoo));
    }
}
