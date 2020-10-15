import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



 class Result {

   /*
    * Complete the 'checkDivisibility' function below.
    *
    * The function is expected to return a STRING_ARRAY.
    * The function accepts STRING_ARRAY arr as parameter.
    */

   //look at all permutations

   //check if any are divisible by 8
   //add Yes to List if they are
   //add No to list at the end if none are divisible

   //find all permutations of a number
   // public static Arraylist<Integer> addPermutations( Arraylist<Integer>numberList, String number){
   //     if(number.length() > 1){

   //     }
   //     else{
   //         numberList.add()
   //     }

   //     return numberList;
   // }


   public static List<String> checkDivisibility(List<String> arr) {
     // Write your code here
     ArrayList<String> answerList = new ArrayList<>();
     arr.forEach(originalNumber -> {
       //loop through all permutations
       ArrayList<Integer> permutationList = new ArrayList<>();
       // addPermutations(permutationList, originalNumber);

       int count = 1;
       for (int i = 1; i <= originalNumber.length(); i++) {
         count = count * i;
       }

       for (int i = 0; i < count; i++) {



         if(Integer.parseInt(originalNumber) % 8 == 0) answerList.add("YES");
         else answerList.add("NO");
       }

       System.out.println(count);
     });

     //swaps 2 digits
     public String swapTwo(String number, int index1, int index2){
       char temp = number.charAt(index1);
       number[index1] = number.charAt(index2);
       number[index2] = temp;
       return number;
     }

		 return answerList;
		 
		}
}