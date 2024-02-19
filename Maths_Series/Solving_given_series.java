//"WAP to print the sum of series: a - a^3 + a^5 - a^7 +......a^n"

import java.util.*;
public class Solving_given_series
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number:");
        int a=sc.nextInt();
        System.out.print("Enter \"n\":");
        int n=sc.nextInt();
        int plus_minus_decider=1;
        int sum=0;
        int power;
        for(int i=1; i<=n; i+=2)
        {
            power=1; // resetting power to 1 (I did mistake here)
            for(int j=1; j<=i; j++)
            {
                power*=a;
            }
            if(plus_minus_decider%2!=0)
                sum=sum+power;
            else
                sum=sum-power;
            
            plus_minus_decider++;
        }
        System.out.println("Result:"+sum);
        sc.close();
    }
    
}
