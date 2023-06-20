import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner input = new Scanner(System.in);

        int x1,x2,y1,y2;
        System.out.println("Enter x1 value: ");
        x1 = input.nextInt();
        System.out.println("Enter x2 value: ");
        x2 = input.nextInt();
        System.out.println("Enter y1 value: ");
        y1 = input.nextInt();
        System.out.println("Enter y2 value: ");
        y2 = input.nextInt();

        int x3,x4,y3,y4;
        System.out.println("Enter x3 value: ");
        x3 = input.nextInt();
        System.out.println("Enter x4 value: ");
        x4 = input.nextInt();
        System.out.println("Enter y3 value: ");
        y3 = input.nextInt();
        System.out.println("Enter y4 value: ");
        y4 = input.nextInt();

        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.println("Length of the first line between points " + "(" + x1 + "," + y1 + ")," +
                "(" + x2 + "," + y2 + ") = " + length1);
        System.out.println("Length of the second line between points " + "(" + x3 + "," + y3 + ")," +
                "(" + x4 + "," + y4 + ") = " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal!!");
        }else if (length1 > length2){
            System.out.println("First line is greater than Second line!!");
        }else if (length1 < length2) {
            System.out.println("Second line is greater than First line!!");
        }
    }
}
