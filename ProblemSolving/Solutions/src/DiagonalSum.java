package Solutions.src;
 //not finished!
public class DiagonalSum {
    public static void diagonalSum() {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum;
        for (int i=0; i < 2; ){
            for (int j = 0; j < 2; j++){
                if(arr[i+1][j] < arr[i+1][j+1]){

                    sum = arr[i][j] + arr[i+1][j+1];
                    System.out.println(sum);
                    i++;
                }
            }
        }
    }
    
}
