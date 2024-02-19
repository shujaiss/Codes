import java.util.*;
public class FindTheElementOccuringOddNoOfTimes
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the array:");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) 
        {
            arr[i] = Integer.parseInt(input[i]);
        }
        int flag = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                }
            }
            if (count % 2 != 0) 
            {
                flag = arr[i];
                break;
            }
        }
        System.out.println("The element occurring odd number of times is: " + flag);

        sc.close();
    }     

}


// Theory:
// In Java, `Integer.parseInt()` is a method used to convert a string into an integer¹³⁴. The method takes a string as an argument and returns an integer¹³⁴. 

// Here's the basic syntax of `Integer.parseInt()`:

// ```java
// int num = Integer.parseInt(str);
// ```

// In this syntax, `str` is a string that you want to convert into an integer, and `num` is the integer value that results from the conversion¹³⁴.

// For example, if you have a string `"123"`, you can convert it into an integer using `Integer.parseInt()` like this:

// ```java
// String str = "123";
// int num = Integer.parseInt(str);
// System.out.println(num);  // Outputs: 123
// ```

// This code will output `123` as an integer¹³⁴.

// Please note that if the string cannot be parsed to an integer (for example, if it contains non-numeric characters), `Integer.parseInt()` will throw a `NumberFormatException`¹³⁴.