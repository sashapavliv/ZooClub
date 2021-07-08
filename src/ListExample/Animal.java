package ListExample;

public class Animal {
   private String name;
   private String niknameAnimal;
   private int age;
   private boolean isAngry;

   Animal(){

   }
    public Animal(String name,String niknameAnimal, int age, boolean isAngry) {
        this.name = name;
        this.age = age;
        this.isAngry = isAngry;
        this.niknameAnimal = niknameAnimal;
    }

    public String getName() {
        return name;
    }
    public String getNiknameAnimal() {
        return niknameAnimal;
    }

    public int getAge() {
        return age;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNiknameAnimal(String niknameAnimal) {
        this.niknameAnimal = niknameAnimal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsAngry(boolean isAngry) {
        isAngry = isAngry;
    }

    @Override
    public String toString() {
        return "name: " + name +", nikname: " +niknameAnimal+ ", age: " + age + ", isPredator: " + isAngry;
    }
}
