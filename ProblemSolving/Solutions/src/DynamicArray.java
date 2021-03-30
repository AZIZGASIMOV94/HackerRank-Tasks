package Solutions.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static List<List<Integer>> dynamicArray(int N, List<List<Integer>> queries) {
        Scanner scan = new Scanner(System.in);
        int Nn = scan.nextInt();
        int Q = scan.nextInt();
        int lastAns = 0;

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        for(int i=0; i < N; i++){
            listOfLists.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < Q; i++) {
            int q = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> seq = listOfLists.get((x ^ lastAns) % N);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }
        }


        return listOfLists;
    }
}
