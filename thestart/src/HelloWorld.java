public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");
        int r1 = 12;
        int r2 = 5;
        double res = r1 / r2; //2.0
        double res2 = r1 / (r2 + 0.0); //2.4
        double res3 = (double)r1 / r2; //2,4

        int a1 = 10; //11
        int b1 = a1++; //10
        System.out.println(a1 + " " + b1);
        int a2 = 10; //11
        int b2 = ++a2; //11

        short s1 = 10;
        //s1 = s1 + 1;
        s1 = (short)(s1 + 1);
        s1++; //自增1不会改变数据类型

        byte bb1 = 127;
        bb1++; //-128
    }
}
