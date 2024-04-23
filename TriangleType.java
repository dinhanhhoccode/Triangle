package lib;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        String result = triangleType(side1, side2, side3);
        System.out.println("Loại tam giác là: " + result);
    }

    public static String triangleType(double side1, double side2, double side3) {
        // Kiểm tra xem có phải là tam giác không
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "NotATriangle";
        }
        // Kiểm tra xem có phải là tam giác đều không
        else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        }
        // Kiểm tra xem có phải là tam giác cân không
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            // Kiểm tra xem có phải là tam giác vuông không
            if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2) ||
                    Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2) ||
                    Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
                return "RightTriangle";
            } else {
                return "Isosceles";
            }
        }
        // Kiểm tra xem có phải là tam giác thường không
        else {
            // Kiểm tra xem có phải là tam giác vuông không
            if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2) ||
                    Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2) ||
                    Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
                return "RightTriangle";
            } else {
                return "Scalene";
            }
        }
    }
}
