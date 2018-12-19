package Assignment1;

// Assignment #: 1
//         Name: Your name
//    StudentID: Your Student ID
//      Lecture: Your Lecture Time, e.g.MWF 9:00-9:50am etc.
//  Description: (1)This class reads an integer from a keyboard and prints it out
//               along with other messages.
//				 (2)The purpose of this assignment is let you be familiar with the assignments submission
//				 server. Make sure to modify the original program in such a way that your outputs match
//				 exactly the outputs we provided!
import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment1 {
    public static void main (String[] args) {

        int number;

        Scanner console = new Scanner(System.in);

        number = console.nextInt();     // read an integer entered by a user

        // display the number with other messages
        System.out.print("This program reads an integere from a keyboard,\n"
                + "and print it out on the display screen.\n"
                + "The number is: " + number + ".\n"
                + "make sure that you get the exact same output as the expected one!\n");
    }
}

