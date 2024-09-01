import java.util.Scanner;
public class IT24101157Lab6Q1{
   public static void main(String[]args){
     Scanner scanner=new Scanner(System.in);
     
     System.out.print("Enter a number: ");
     double number=scanner.nextDouble();

     double square=Math.pow(number, 2);
     double squareroot=Math.sqrt(number);

     System.out.println("The square of " +number+"is"+square);
     System.out.println("The squareroot of"+number+"is"+squareroot);
   }
}