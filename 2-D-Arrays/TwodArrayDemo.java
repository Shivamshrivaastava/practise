import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scn.nextLine();
        System.out.println("Input provided: " + input);
        scn.close();
    }
}