import javax.swing.*;
import java.util.Scanner;

/**
 * @author Fırat YILDIRIM
 * @since 20.12.2021
 */
public class Main {
    public static void main(String[] args) {
        //Create variables
        int math,physics,chemistry,turkish,history,music;
        //Scanner library
        Scanner input = new Scanner(System.in);
        //Get values from user
        System.out.println("Your math grade : ");
        math = input.nextInt();

        System.out.println("Your physics grade : ");
        physics = input.nextInt();

        System.out.println("Your chemistry grade : ");
        chemistry = input.nextInt();

        System.out.println("Your turkish grade : ");
        turkish = input.nextInt();

        System.out.println("Your history grade : ");
        history = input.nextInt();

        System.out.println("Your music grade : ");
        music = input.nextInt();

        int total = (math+physics+chemistry+turkish+history+music);
        double average = total/6.0;


        String check = average>60 ? "Passed" : "Failed";

        System.out.println("Your average is : "+ average);
        System.out.println(check);


    }

}
