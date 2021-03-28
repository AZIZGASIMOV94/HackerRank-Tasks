package Solutions.src;

public class Main {
    static int R = 5;
    static int C = 5;
    public static void main(String[] args) throws Exception {
        //#region Hour Glass Demonstration 
            int arr[][] = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0},
            };
            System.out.println(HourGlassSum.sumOfHourGlass(arr));
        //#endregiond 

        //#region Diagonal Sum Demonstration
        DiagonalSum.diagonalSum();
        //#endregion

        //#region Traverse linkedList Demonstration
            TraverseLinkedList linkedList = new TraverseLinkedList();
            for (int i=5; i>0; --i)
            {
                linkedList.push(i);
                linkedList.printList();
            }
        //#endregion
        
        //#region Reverse Array Demonstration
            int sampleArr[] = {1,2,3};
            int res[] = ReverseArray.reverse(sampleArr);
            for (int elem : res){
                System.out.print(elem+" ");
            }
        //#endregion

        //#region SparseArray
            String[] strings = new String[4];
            strings[0] = "aba";
            strings[1] = "baba";
            strings[2] = "aba";
            strings[3] = "xzxb";


            String[] queries = new String[3];
            queries[0] = "aba";
            queries[1] = "xzxb";
            queries[2] = "ab";

            int[] result = SparseArray.matchingStrings(strings,queries);

            for(int item : result){
                System.out.println(item);
            }
        //#endregion
    }
}
