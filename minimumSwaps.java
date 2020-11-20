public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int i = 0, j = 0,
            len = arr.length,
            swapCount = 0;
        while (i < len) {
            j = arr[i] - 1;
            if (i != j)
                swapCount += swap(i, j, arr);
            else
                i++;
        }
        return swapCount;
    }
    
    static int swap(int a, int b, int[] arr) {
        System.out.println("swap (" + a + "," + b + ")");
        int item = arr[a];
        arr[a] = arr[b];
        arr[b] = item;
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}