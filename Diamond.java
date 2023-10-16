//Connor Mulligan
import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

public class Diamond {
  public static void main(String[] args) {
    int UserInput;
    int length = 1;
    double diameter;

    //Saves user input for later
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a whole number:");
    UserInput = scan.nextInt();

    diameter = Math.floor(UserInput/2);
    System.out.println(diameter);

    if(UserInput % 2 != 0){
      while(length < UserInput){
        for(int a = 0; a < (UserInput-length)/2; a++){
          System.out.print(" ");
        }
        for(int a = 0; a < length; a++){
          System.out.print("*");
        }
        System.out.println("");
        length+=2;
      }
      if(length == UserInput){
        for(int a = 0; a < UserInput; a++){
          System.out.print("*");
        }
      }
      length-=2;
      System.out.println("");
      while(length>0){
        for(int a = 0; a < (UserInput-length)/2; a++){
          System.out.print(" ");
        }
        for(int a = 0; a < length; a++){
          System.out.print("*");
        }
        System.out.println("");
        length-=2;
      }
    }
    else{
      length = 1;
      while(length < 2){
        for(int a = 0; a < (UserInput-length); a++){
          System.out.print(" ");
        }
        for(int a = 0; a < length; a++){
          System.out.print("*");
        }
        System.out.println("");
        length = 2;
      }
      while(length<UserInput){
        for (int a = 0; a < (UserInput-length); a++){
          System.out.print(" ");
        }
        for(int a = 0; a<length; a++){
          System.out.print("*");
        }
        System.out.print("");
        length+=2;
      }
      if(length>=UserInput){
        for(int a = 0; a < UserInput; a++){
          System.out.print("*");
        }
      }
      length = UserInput-2;
      System.out.println("");
      while(length>0){
        for (int a = 0; a < (UserInput-length); a++){
          System.out.print(" ");
        }
        for(int a = 0; a<length; a++){
          System.out.print("*");
        }
        System.out.println("");
        length=length-2;
      }
      length = 1;
      while(length < 2){
        for(int a = 0; a < (UserInput-length); a++){
          System.out.print(" ");
        }
        for(int a = 0; a<length; a++){
          System.out.print("*");
        }
        length=2;
      }
    }
    scan.close();
  }
}
