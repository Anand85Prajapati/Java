import java.util.Scanner;
import java.util.*;
public class javaBasics {
    public static void main(String args[]) { 
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     if(number % 2 == 0){
      System.out.println("evev");
     }
     else{
      System.out.println("odd");
     }
  }
}