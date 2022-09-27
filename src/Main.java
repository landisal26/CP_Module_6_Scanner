import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double salary = 0;
        int favNum = 0;
        String name = "";
        int age = 0 ;
        String trash = "";

        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is " + name);

        // This is an unprotected read of a number value which will fail if it is not a valid number
/*         System.out.println("\nEnter your age: ");
           age = in.nextInt();

         System.out.println("You said your age was " +age);
*/
        System.out.println("\nEnter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            System.out.println("You said your age was " +age);
        }
        else
        {

            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
        }
        System.out.print("Enter your salary: ");

        if (in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); //Have to clear the buffer after reading a number
            System.out.println("\n You said you salary was $" + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " Is not a valid input");
        }

        // Fav Number 1-10
        System.out.print("Enter your Favorite Number [1-10]: ");
            if (in.hasNextInt())
            {
                favNum = in.nextInt();
                in.nextLine();
                if(favNum >= 1 && favNum <= 10)

            System.out.println("\n You said your Favorite Number is " + favNum);

            else

            System.out.println("You said your Favorite Number is " +favNum + " but that is out of range");
        }


    }
}