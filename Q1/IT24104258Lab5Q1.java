import java.util.Scanner;
public class IT24104258Lab5Q1 {
    public static void main(String[] args) {

        int num1,num2,num3;

        

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the 1st number : ");
        num1 = input.nextInt();

        System.out.print("Enter the 2nd number : ");
        num2 = input.nextInt();

        System.out.print("Enter the 3rd number : ");
        num3 = input.nextInt();

        System.out.println("User enterd numbers are : " +num1+" "+ num2+" " + num3 );

        int  smallest,largest;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        System.out.println("The Smallest number is : " + smallest);
        System.out.println("The Largest number is : " + largest);
        
    }
} 
