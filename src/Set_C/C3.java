package Set_C;

public class C3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        arr[3] = 77;
        
        System.out.print("{"+arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", "+i);
        }
        System.out.println("}");
    }
}
