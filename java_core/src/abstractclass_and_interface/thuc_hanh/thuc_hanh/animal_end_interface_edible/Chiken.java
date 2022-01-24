package abstractclass_and_interface.thuc_hanh.thuc_hanh.animal_end_interface_edible;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Quac quac";
    }

    @Override
    public String howToEat() {
        return "Cỏ";
    }
}
