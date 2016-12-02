package Set_C;

import java.util.Arrays;

public class C5 {

    public static void main(String[] args) {
        int[] arr = new int[4];
        
        Arrays.fill(arr, 7);
        
        for(int i : arr){
            System.out.print(i+", ");
        }
    }
}
