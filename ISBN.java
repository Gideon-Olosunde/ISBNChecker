
/**
 * Write a description of class ISBN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ISBN
{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input ISBN Number");
        String ISBN = input.nextLine();
        int total = 0;

        while (ISBN.length() != 13){
            System.out.println("Please input a valid ISBN number");
            ISBN = input.nextLine();
        }

        for(int i=0;i<ISBN.length();i++){
            String charstring = Character.toString(ISBN.charAt(i));
            int number = Integer.parseInt(charstring);
            total=total + number;

        }
       
        int Checker = total%10;
        if (Checker == 0 ){
            System.out.println("This ISBN number is valid");
        }else if (Checker >0){
            System.out.println("This ISBN number is not valid");
        }
    }
}