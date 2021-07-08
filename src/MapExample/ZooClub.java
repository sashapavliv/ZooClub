package MapExample;

import java.util.*;

public class ZooClub {

    Map<Person, ArrayList<Animal>> zoo = new HashMap<>();

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
        zoo.put(new Person(id, name, surname, age), new ArrayList<Animal>());
        System.out.println("New member " + name + " " + surname + " added to zoo club");
    }

    public void addAnimalToMember() {
        System.out.println("Enter id of person");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Map.Entry<Person, ArrayList<Animal>> entry : zoo.entrySet()) {
            if (id == entry.getKey().getId()) {
                System.out.println("You want add new animal to " + entry.getKey().getName() + " " + entry.getKey().getSurmane());
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
                    }

                    entry.getValue().add(new Animal(nameAnimal, nicknameAnimal, ageAnimal, isAngry));
                    System.out.println(nameAnimal + " " + nicknameAnimal + " is added to " + entry.getKey().getName() + " " + entry.getKey().getSurmane());
                }
            }
        }
    }

    public void deleteAnimalOfMember() {
        System.out.println("Enter id of person, which animal you want to delete");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("What nickname of animal you want to delete?");
        sc = new Scanner(System.in);
        String nickname = sc.next();

        zoo.entrySet().removeIf(e -> e.getKey().getId() == id && e.getValue().get(0).getNiknameAnimal().equalsIgnoreCase(nickname));
        System.out.println(String.format("You deleted %s of member with id %s", nickname, id));

    }

    public void deleteMember() {
        System.out.println("Enter id of person, who you want to delete");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (Map.Entry<Person, ArrayList<Animal>> entry : zoo.entrySet()) {
            if (id == entry.getKey().getId()) {
                System.out.println("You want delete " + entry.getKey().getName() + " " + entry.getKey().getSurmane() + " without club?");
                System.out.println("If it's true, enter 'y', else 'n'");
                sc = new Scanner(System.in);
                if (sc.next().toLowerCase().equals("y")) {
                    zoo.entrySet().removeIf(e -> e.getKey().getId() == id);
                }
            }
        }
    }

    public void printAllAnimals() {
        System.out.println("Enter id of person, which animals you want to see");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (zoo.entrySet().isEmpty())
            System.out.println("You don't have any animals");
        else
            for (Map.Entry<Person, ArrayList<Animal>> entry : zoo.entrySet()) {
                if (id == entry.getKey().getId()) {

                    System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurmane() + " have:");
                    entry.getValue().forEach(System.out::println);


                }
            }
    }

    public void printZooClub() {
        System.out.println("---Zoo Club---");
        zoo.entrySet().forEach(System.out::println);
    }
}
