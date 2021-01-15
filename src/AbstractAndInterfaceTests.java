import animal.Animal;
import animal.Chicken;
import animal.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());
        }
        Chicken c =(Chicken) animals[1];
        System.out.println(c.makeSound() +" "+ c.howToEat());
    }
}
