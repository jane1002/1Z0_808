package ch02;

public class Q88 {

    static float var1 = 12_345.01 >= 123_45.00 ? 12_456: 124_56.02f;
    static float var2 = var1 + 1024;

    public static void main (String args[]) {
        System.out.println(Q88.var2);
    }
}
