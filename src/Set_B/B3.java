package Set_B;

public class B3 {

    public static void main(String[] args) {
        String[] a = {"Charlie"};
        String[] b = a;
        a[0] = "delta";
        
        System.out.println(a[0] + " ~ " + b[0]);
    }
}
