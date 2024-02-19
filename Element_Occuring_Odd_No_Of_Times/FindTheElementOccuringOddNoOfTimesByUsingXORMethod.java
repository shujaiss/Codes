/* 
    Find The Element That Appears Once In An Array Where Every Other Element Appears 
    Twice by using XOR (^) operator...

Solution:-

        The logic behind this code is based on the following properties of XOR:

        XOR of a number with itself is zero, e.g. 5^5=0

        XOR of a number with zero is the number itself, e.g. 5^0=5

        XOR is commutative and associative, e.g. (5^3)^2=5^(3^2)

        So, when we XOR all the elements in the array, the elements that appear twice 
        will cancel out each other and the result will be the unique element. 

        For example, if the array is [1, 2, 3, 4, 3, 2, 1], the XOR of all elements will be:
                            1^2^3^4^3^2^1
                            =(1^1)^(2^2)^(3^3)^4
                            =0^0^0^4
                            =4
simply: its like switch jo bits 3 ke wajah se on hoga wo bits baad me 3 ke wajah se 
        fir off ho jayega aur jiska bits on reh gya wo element bach jayega.
*/
//import java.util.*;
public class FindTheElementOccuringOddNoOfTimesByUsingXORMethod
{
    public static void main(String[] args) 
    {
            int[] arr={5,3,4,5,2,3,4};
            int result =0;
            for (int i = 0; i < arr.length; i++) 
            {
                result ^= arr[i];
            }
            System.out.println("The element is: " + result);
    }
}