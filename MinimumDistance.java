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
import static java.util.stream.Collectors.toList;​

class Result {
​
    public static int minimumDistances(List<Integer> a) {
    // Write your code here
        int minDistance = Integer.MAX_VALUE;
        int firstIndex = 0;
        int secondIndex = a.size()-1;
        int numOfPairs = 0;
        System.out.println("current distance: "+ (secondIndex - firstIndex));
        System.out.println("a.size() / 2:  "+ (a.size() / 2));
        while(firstIndex < (a.size() / 2)){
                System.out.println("2current distance: "+ (secondIndex - firstIndex));
            
            if(a.get(secondIndex) == a.get(firstIndex)){
                if((secondIndex - firstIndex) < minDistance){
                    minDistance = secondIndex - firstIndex;
                }
                System.out.println("3current distance: "+ (secondIndex - firstIndex));
                numOfPairs++;
            }
            firstIndex++;
            secondIndex--;
        }
        if(numOfPairs == 0){
            return -1;
        }else{
            return minDistance;
        }
    }
​
}​

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
​
        int n = Integer.parseInt(bufferedReader.readLine().trim());
​
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
​
        int result = Result.minimumDistances(a);
​
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
​
        bufferedReader.close();
        bufferedWriter.close();
    }
}