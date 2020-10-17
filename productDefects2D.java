class Result {

    /*
     * Complete the 'largestArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY samples as parameter.
     */

    public static int largestArea(List<List<Integer>> samples) {
    // Write your code here
        // Determine the size of largest square area of defective products
        // Defective -> 1
        // Non-defective -> 0
        // Square area
        // 
        // Find sub-matrices
        // Keep track of the largest size of sub-matrix
        int largestSize = 0;
        
        // Loop through the grid
        // n x n size
        // 
        // Double for loop
        // Loop through each row
        // Once you hit a 1, start counting
        // Stop when you hit a 0, start a new count when you hit a 1.
        
        for(int row = 0; row < samples.size(); row++){
            int count = 0;
            for(int col = 0; col < samples.get(0).size(); col++){
                if(samples.get(row).get(col) == 0){
                    if(count > largestSize){
                        largestSize = count;
                    }
                    count = 0;
                    continue;
                }
                count++;
            }
        }
        
        return largestSize;
        

    }

}