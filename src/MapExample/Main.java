package MapExample;

import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("Enter 1, if you want to add new member to the club");
        System.out.println("Enter 2, if you want to add new animal to member");
        System.out.println("Enter 3, if you want to delete animal without member");
        System.out.println("Enter 4, if you want to delete member");
        System.out.println("Enter 5, if you want to print all animals of specific owner");
        System.out.println("Enter 6, if you want to print zoo club");
        System.out.println("Enter 7, if you want exit program");
    }

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        menu();

        while (true) {
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                    zooClub.addMember();
                }
                break;
                case 2: {
                    zooClub.addAnimalToMember();
                }
                break;
                case 3: {
                    zooClub.deleteAnimalOfMember();
                }
                break;
                case 4: {
                    zooClub.deleteMember();
                }
                break;
                case 5: {
                    zooClub.printAllAnimals();
                }
                break;
                case 6: {
                    zooClub.printZooClub();
                }
                break;
                case 7: {
                    System.exit(0);
                }
                break;
            }
        }
    }
}
