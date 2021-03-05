import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int lastAns = 0;

    }
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i < n; i++){
            result.add(new ArrayList<Integer>());
        }

        return res;
    }
}
