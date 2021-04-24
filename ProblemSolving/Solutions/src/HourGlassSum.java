public class HourGlassSum {

    public static int sumOfHourGlass(int[][] array) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
               currentSum = (array[i][j] + array[i][j + 1] + array[i][j + 2]) +
                                (array[i + 1][j + 1]) +
                                (array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);
               maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
    
}
