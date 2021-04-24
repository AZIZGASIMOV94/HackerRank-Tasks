// time exceeds because of optimization
public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = 0;
        }

        for(int i = 0; i< queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int summand = queries[i][2];

            for(int j = start-1; j<end; j++){
                arr[j] += summand;
            }
        }

        Long maxVal = Long.MIN_VALUE;
        
        for(int i= 0; i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
