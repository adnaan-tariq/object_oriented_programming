
import java.util.*;

class Animal {
    protected
    String name;
    int age;
    Animal(String name, int age){
        this.name =name;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void dis(){
        System.out.println("This is Main Animal Class");
    }
    void display()
    {
        System.out.println("Name is "+ name);
        System.out.println("Age is "+ age);

    }
    void MakeSound(){
        System.out.println("Class make sound");
    }
};
class Mammal extends Animal {
    String fur;
    Scanner scan = new Scanner(System.in);

    Mammal(String name, int age, String fur) {
        super(name, age);
        this.fur=fur;
    }
    public String getFur(){
        return fur;
    }
    @Override
    void display()
    {   super.display();
        System.out.println("Fur is"+fur);

    }
    @Override
    void MakeSound() {
        super.MakeSound();
    }
}
class Bird extends Animal {
    String size;
    Scanner scan = new Scanner(System.in);

    Bird(String name, int age, String size) {
        super(name, age);
        this.size= size;
    }
    public String getSize(){
        return size;
    }
    @Override
    void display()
    {   super.display();
        System.out.println("Bird Size: "+size);

    }
    @Override
    void MakeSound() {
        super.MakeSound();
    }
}
class fish extends Animal{
    String specie;
    Scanner scan = new Scanner(System.in);
    fish(String name, int age, String specie) {
        super(name, age);
        this.specie=specie;
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Fish Specie is: "+specie);
    }
    @Override
    void MakeSound(){
        super.MakeSound();
    }
}

public class Main {

    public static void main(String[] args) {

        Animal b1 = new Animal("Zebra", 12);
        b1.dis();

        b1.display();
        b1.MakeSound();


        Mammal p1 = new Mammal("Cow",15,"Black Fur");
        p1.display();

        Bird b2 = new Bird("Crow",3,"small");
        b2.display();

        fish s1 = new fish("Gold Fish",1,"Black Mask Specie");
        s1.display();


    }

}