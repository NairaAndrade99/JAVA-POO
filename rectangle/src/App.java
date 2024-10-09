import java.util.Scanner;

import rectangle.Rectangle.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle with and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

         System.out.println(rectangle);
    }
}
