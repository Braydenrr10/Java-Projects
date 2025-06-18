import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
public class Palidrone

{
	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   Scanner scanner = new Scanner(new File("input.txt"));
   
   String userWord;
   int i;
   
   userWord = scnr.nextLine();
   String reverse = "";
   
   for ( i = userWord.length() - 1; i >=0; i-- ){
   reverse += userWord.charAt(i);
   }
   
   boolean palindrome = true;
   for ( i = 0; i < userWord.length(); i++) {
      if (userWord.charAt(i) != reverse.charAt(i)) {
      palindrome = false;
      }
      }
   
   if(palindrome) {
      System.out.println("True");
      } else {
         System.out.println("False");
         }
   }
   }