import java.util.Scanner;

public class reesestudytracker
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("        ");
        System.out.println("Welcome to the Study Tracker!");
        System.out.println("        ");
        System.out.println("-----------------------------");

        System.out.println("        ");

        System.out.print("Enter number of days to track your study hours: ");
        int numberofdays = scanner.nextInt();

        if (numberofdays <= 0)
        {
            System.out.println("Invalid number of days.");
        } else
        {
            int totalstudyhours = 0;

            for (int day = 1; day <= numberofdays; day++)
            {
                System.out.print("Enter study hours for Day " + day + ": ");
                int studyhours = scanner.nextInt();

                if (studyhours < 0)
                {
                    System.out.println("Invalid study hours.");
                    day--;
                } else
                {
                    totalstudyhours += studyhours;
                }
            }

            System.out.println("        ");
            System.out.println("-----------------------------");
            System.out.println("        ");
            System.out.println("Study Summary:");
            System.out.println("        ");
            System.out.println("-----------------------------");
            System.out.println("        ");

            System.out.println("Total Study Hours: " + totalstudyhours);

            if (numberofdays > 0)
            {
                double averagedailystudytime = (double) totalstudyhours / numberofdays;
                System.out.println("Average Daily Study Time: " + averagedailystudytime + " hours");

            }
        }


    }
}
