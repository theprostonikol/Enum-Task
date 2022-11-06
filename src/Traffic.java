import java.util.Scanner;

public class Traffic {
    static Scanner scanner;
    static Lights lights;

    public static void main(String[] args) {

        dataInput();

    }

    public static void dataInput() {

        scanner = new Scanner(System.in);
        System.out.print("What color do you see?: ");
        lights = Lights.valueOf(scanner.nextLine());
        switch (lights) {
            case RED:
                System.out.println("STOP!!! Don't move");
                break;
            case YELLOW:
                System.out.println("Prepare to move");
                break;
            case GREEN:
                System.out.println("You can go");
                break;
            default:
                System.out.println("Undefined!");
                scanner.close();

        }
    }
}


