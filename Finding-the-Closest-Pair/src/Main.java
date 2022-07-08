import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many points do you want to enter in the cartesian coordinate system?: ");
        int totalPoint = input.nextInt();
        System.out.println();

        int points[][] = new int[totalPoint][2];

        for (int rows = 0; rows < points.length; rows++) {
            for (int columns = 0; columns < points[rows].length; columns++) {
                if (columns % 2 == 0) {
                    System.out.print("Please enter x-coordinate of the point:  ");
                    int xPoint = input.nextInt();
                    points[rows][columns] = xPoint;
                    System.out.println();
                } else {
                    System.out.print("Please enter the y-coordinate of the point: ");
                    int yPoint = input.nextInt();
                    points[rows][columns] = yPoint;
                    System.out.println();
                }
            }
        }
        double result = findClosestPair(points);
        System.out.println(result);

    }

    static double findClosestPair(int[][] points) {
        double minPair;
        double x0 = points[0][0];
        double y0 = points[0][1];

        double x1 = points[1][0];
        double y1 = points[1][1];
        double xDistance = Math.pow(points[1][0] - points[0][0], 2);
        double yDistance = Math.pow(points[1][1] - points[0][1], 2);
        double distance = Math.sqrt(xDistance + yDistance);
        minPair = distance;

        for (int rows = 0; rows < points.length - 1; rows++) {
            for (int z = rows + 1; z < points.length; z++) {
                xDistance = Math.pow(points[z][0] - points[rows][0], 2);
                yDistance = Math.pow(points[z][1] - points[rows][1], 2);
                distance = Math.sqrt(xDistance + yDistance);
                if (distance < minPair) {
                    minPair = distance;
                }
            }

        }
        return minPair;
    }
}
