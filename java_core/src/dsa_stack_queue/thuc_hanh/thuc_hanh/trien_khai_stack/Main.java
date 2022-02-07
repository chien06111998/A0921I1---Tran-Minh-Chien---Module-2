package dsa_stack_queue.thuc_hanh.thuc_hanh.trien_khai_stack;

public class Main {
    public static void main(String[] args) {
        GenericStackClient genericStackClient = new GenericStackClient();
        System.out.println("1. Stack of integers");
        genericStackClient.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        genericStackClient.stackOfIStrings();
    }
}
