import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        do {
            int[] point1 = getPoint("Enter the first coordinate in (x, y) format:");
            int[] point2 = getPoint("Enter the second coordinate in (x, y) format:");

            if (point1[0] == point2[0]) {
                System.out.println("The line is vertical. The equation is x = " + point1[0]);
            } else {
                LinearEquation equation = new LinearEquation(point1[0], point1[1], point2[0], point2[1]);
                System.out.println(equation.lineInfo());

                System.out.print("Enter an x value to find the corresponding point on the line: ");
                double xValue = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Point on line: " + equation.coordinateForX(xValue));
            }
        } while (wantsToContinue());
    }

    private int[] getPoint(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine().replaceAll("[()\\s]", "");
        String[] parts = input.split(",");
        return new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
    }

    private boolean wantsToContinue() {
        System.out.print("Do you want to enter another pair of coordinates? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
