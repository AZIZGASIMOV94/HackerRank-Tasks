package com.company;

public class Main {
    /*
        There is a collection of input strings and a collection of query strings.
        For each query string, determine how many times it occurs in the list of input strings.
        Return an array of the results.
    */

    public static void main(String[] args) {

        String[] strings = new String[4];
        strings[0] = "aba";
        strings[1] = "baba";
        strings[2] = "aba";
        strings[3] = "xzxb";


        String[] queries = new String[3];
        queries[0] = "aba";
        queries[1] = "xzxb";
        queries[2] = "ab";

        int[] result = matchingStrings(strings,queries);

        for(int item : result){
            System.out.println(item);
        }
    }

    static int[] matchingStrings(String[] strings, String[] queries) {


        int[] result = new int[queries.length];
        for(int i=0; i< queries.length; i++){
            int count = 0;
            for(int j=0; j< strings.length; j++){
                if(queries[i].equals(strings[j])){
                    count++;
                }
                result[i] = count;
            }
        }
        return result;
    }
}
