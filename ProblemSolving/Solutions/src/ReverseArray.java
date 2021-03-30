package Solutions.src;

public class ReverseArray {
    public static int[] reverse(int[] array){

        int[] newArray = new int[array.length];
        for (int i = array.length-1; i >= 0; ){
            for (int j =0; j < newArray.length; j++){
                newArray[j] = array[i];
                i--;
            }
        }
        return newArray;
    }
}
