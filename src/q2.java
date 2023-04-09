import java.lang.Runtime;
public class q2 {
    public static void main(String[] args) {
//        long freeMem =
        System.out.println("Free space in your program: " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory taken by your program: " + Runtime.getRuntime().freeMemory());
        System.out.println("Maximum memory provided to your program: " + Runtime.getRuntime().maxMemory());
    }
}


