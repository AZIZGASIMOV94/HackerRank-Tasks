/*
* HackerRank task no:1
* */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int res[] = reverse(arr);
        for (int elem : res){
            System.out.print(elem+" ");
        }
    }

    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        for (int i = array.length-1; i >= 0; ){
            for (int j =0; j< newArray.length; j++){
                newArray[j] = array[i];
                i--;
            }
        }
        return newArray;
    }
}
