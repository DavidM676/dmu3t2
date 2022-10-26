import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response
        int num = (int)(Math.random()*6);
        
//        if (num==0) {
//            System.out.println("It is certain");
//        } else if (num==1) {
//            System.out.println("It is decidedly so");
//        } else if (num==2) {
//            System.out.println("Reply hazy, try again");
//        } else if (num==3) {
//            System.out.println("Ask again later");
//        } else if (num==4) {
//            System.out.println("Don't count on it");
//        } else (num==5) {
//            System.out.println("My reply is no");
//        }

        if (num==0) {
            System.out.println("It is certain");
        }
        if (num==1) {
            System.out.println("It is decidedly so");
        }
        if (num==2) {
            System.out.println("Reply hazy, try again");
        }
        if (num==3) {
            System.out.println("Ask again later");
        }
        if (num==4) {
            System.out.println("Don't count on it");
        }
        if (num==5) {
            System.out.println("My reply is no");
        }

        System.out.println(response);  // print response
    }
}
