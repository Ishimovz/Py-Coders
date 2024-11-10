package pycoders;

import java.util.Scanner;

public class PyCoders {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//       System.out.print("Enter a number: ");
//       int number = input.nextInt();
//       System.out.println("You entered "+number);
//System.out.print("Enter your name: ");
//String name = input.nextLine();
//String name2 = "Frederic";
//System.out.println("My name is " + name2);
        double num2 = 1.7;
        System.out.println("Double value: " + num2);
        int castedValue = (int) num2;
        System.out.println("Casted value: " + castedValue);

        String number = "23";

        int sum = Integer.parseInt(number) + 4;

        String output = String.valueOf(sum);

        System.out.println("Sum is: " + sum);

    }

}
