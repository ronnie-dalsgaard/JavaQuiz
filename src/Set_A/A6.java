package Set_A;

public class A6 {

    public static void main(String[] args) {
        int x = 7;
        
        if(49 % x-- == 0 && 42 % x == 0){
            if(x % 2 == 1) System.out.println("Todd");
            else System.out.println("Steven");
        } else {
            System.out.println("x="+x);
        }
    }
}
