public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][] = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0},
        };
        System.out.println(sumOfHourGlass(arr));
    }

    public static int sumOfHourGlass(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               int currentSum = (array[i][j] + array[i][j + 1] + array[i][j + 2]) +
                                (array[i + 1][j + 1]) +
                                (array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]);
               maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
