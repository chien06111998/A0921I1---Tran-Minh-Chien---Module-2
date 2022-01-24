package abstractclass_and_interface.thuc_hanh.thuc_hanh.animal_end_interface_edible;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Chiken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chiken) {
                Edible edible = (Chiken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
