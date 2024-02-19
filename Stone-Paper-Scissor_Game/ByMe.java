import java.util.*;
public class ByMe
{
    public static void main(String[] args)
    {
        Random rm= new Random();
        Scanner sc=new Scanner(System.in);

        int Random;
        String comp="Invalid";

        int Input;
        String user="Invalid";

        int Comp_Count=0;
        int User_Count=0;
        int Choice=1;

        System.out.print("\nEnter number of games:");
        int tournament_size=sc.nextInt();

        while(tournament_size>0)
        {
            Random= rm.nextInt(1,4);
            if(Random == 1)
                comp="Stone";
            if(Random == 2)
                comp="Paper";
            if(Random == 3)
                comp="Scissor";

            System.out.println("\nChoice-"+Choice+":\n1 : Stone \n2 : Paper\n3 : Scissor");
            System.out.print("Choose corresponding number:");
            Input=sc.nextInt();
            Choice++;

            if(Input== 1)
                user="Stone";
            else if(Input== 2)
                user="Paper";
            else if(Input== 3)
                user="Scissor";

            System.out.println("\nComputer\'s Choice: "+comp);
            System.out.println("Your Choice: "+user+"\n");

            // 1-Stone 2-Paper 3-Scissor
            if(comp.equals(user))
                System.out.println("Match draw\n");
            //comp-->Stone
            else if(comp.equals("Stone") && user.equals("Scissor") )
            {
                Comp_Count++;
                System.out.println("Computer got 1 point.\n");
            }
            else if(comp.equals("Stone") && user.equals("Paper") )
            {
                User_Count++;
                System.out.println("You got 1 point.\n");
            }
            //comp-->Paper
            else if(comp.equals("Paper") && user.equals("Stone") )
            {
                Comp_Count++;
                System.out.println("Computer got 1 point.\n");
            }
            else if(comp.equals("Paper") && user.equals("Scissor") )
            {
                User_Count++;
                System.out.println("You got 1 point.\n");
            }
            //comp-->Scissor
            else if(comp.equals("Scissor") && user.equals("Paper") )
            {
                Comp_Count++;
                System.out.println("Computer got 1 point.\n");
            }
            else if(comp.equals("Scissor") && user.equals("Stone") )
            {
                User_Count++;
                System.out.println("You got 1 point.\n");
            }

            else
                System.out.println("Invalid input so no points...\n");

            System.out.println("--------------------------------------------------------------------------------------");
        
            tournament_size--;
        }

        //Result:
        if(Comp_Count==0 && User_Count==0)
            System.out.println("You inputs were all invalid.\nSo match abandoned...\n\n");
        else
        {
            System.out.println("Points distribution:");
            System.out.println("Compuer\'s Point: "+Comp_Count);
            System.out.println("Yours Point: "+User_Count);
    
            if(Comp_Count==User_Count)
                System.out.println("\nMatch Tie\n\n");
            else if(Comp_Count>User_Count)
                System.out.println("\nComputer Won\n\n");
            else if(Comp_Count<User_Count)
                System.out.println("\nYou Won\n\n");
        }
        sc.close();
    }
}
