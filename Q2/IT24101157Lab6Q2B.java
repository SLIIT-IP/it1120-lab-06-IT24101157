import java.util.Scanner;

public class IT24101157Lab6Q2B{
  public static void main(String[]args){
    Scanner mykey=new Scanner(System.in);
//create ane array to enter 10 numbers

    int[] numbers=new int[10];
    System.out.println("Enter the 10 numbers:");
    
    int i=0;

    while(i<10){
      System.out.print("Enter number "+(i+1)+": ");
      numbers[i]=mykey.nextInt();
      i++;
    }
    System.out.println("You entered the folllowing numbers:");
    i=0;

    while(i<10){
      System.out.print(numbers[i]+" ");
      i++;

    }

    System.out.println();
  }
}