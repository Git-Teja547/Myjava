import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.print("What's your name? ");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        scanner.close();
    }
}