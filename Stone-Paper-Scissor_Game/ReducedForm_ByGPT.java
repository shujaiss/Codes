import java.util.*;
public class ReducedForm_ByGPT
{
    public static void main(String[] args)
    {
        Random rm= new Random();
        Scanner sc=new Scanner(System.in);

        int compChoice;
        int userChoice;

        int compCount=0;
        int userCount=0;

        System.out.print("\nEnter number of games:");
        int tournamentSize=sc.nextInt();

        while(tournamentSize>0)
        {
            compChoice = rm.nextInt(1,4);

            System.out.println("\nChoices:\n1 : Stone \n2 : Paper\n3 : Scissor");
            System.out.print("Choose corresponding number:");
            userChoice = sc.nextInt();

            System.out.println("\nComputer's Choice: "+compChoice);
            System.out.println("Your Choice: "+userChoice+"\n");

            // 1-Stone 2-Paper 3-Scissor
            if(compChoice == userChoice)
                System.out.println("Match draw\n");
            else if((compChoice == 1 && userChoice == 3) || (compChoice == 2 && userChoice == 1) || (compChoice == 3 && userChoice == 2))
            {
                compCount++;
                System.out.println("Computer got 1 point.\n");
            }
            else
            {
                userCount++;
                System.out.println("You got 1 point.\n");
            }

            System.out.println("--------------------------------------------------------------------------------------");
        
            tournamentSize--;
        }

        //Result:
        if(compCount==0 && userCount==0)
            System.out.println("Your inputs were all invalid.\nSo match abandoned...\n\n");
        else
        {
            System.out.println("Points distribution:");
            System.out.println("Computer's Point: "+compCount);
            System.out.println("Your Point: "+userCount);
    
            if(compCount==userCount)
                System.out.println("\nMatch Tie\n\n");
            else if(compCount>userCount)
                System.out.println("\nComputer Won\n\n");
            else if(compCount<userCount)
                System.out.println("\nYou Won\n\n");
        }
        sc.close();
    }
}
