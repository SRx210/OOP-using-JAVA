import java.util.Scanner;

public class Volume {
    double pi = 3.14;

    void vol_cylinder(double r, double h) {
        double vol = pi * r * r * h;
        System.out.println("Volume of Cylinder = " + vol);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double h = scanner.nextDouble();
        scanner.close();

        // Create an instance of Volume class
        Volume volumeCalculator = new Volume();

        // Call the instance method vol_cylinder on the instance
        volumeCalculator.vol_cylinder(r, h);
    }
}
