import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
​
public class Solution {
    // 1 Start array from array from the end
    // 2 Compare the one next in order to the current one
    // 3 And increment the number of bribes
    // 4 If not greater than 2 then print Too Chaotic
​
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] people) {
        
        int bribe = 0;
        int currentPerson = 0;
        //boolean chaotic = false;
        int[] queue = people;
        int minBribes = 0;
​
        for(int i = 0; i < queue.length; i++) {
            
            // i + 1 == Next Person In Line
​
            // If out of bounds break the loop.
            // 
            if (i + 1 == queue.length) {
                System.out.println(minBribes);
                return;
            }
​
            
            if(queue[i] > queue[i + 1]) {
                /*
                int temp = queue[i + 1];
                queue[i + 1] = queue[i];
                queue[i] = temp;
                */
                if (currentPerson == queue[i]) {
                    bribe += 1;
                } else {
                    currentPerson = queue[i];
                }
                minBribes++;
            }
            else{
                bribe = 0;
            }
​
            if (currentPerson == queue[i] && bribe > 2) {
                System.out.println("Too chaotic");
                return;
            }
​
              
        }
​
        
        //System.out.println(minBribes);
​
        /*
        
        */
​
    }
​
    private static final Scanner scanner = new Scanner(System.in);
​
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
​
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
​
            int[] q = new int[n];
​
            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
​
            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
​
            minimumBribes(q);
        }
​
        scanner.close();
    }
}