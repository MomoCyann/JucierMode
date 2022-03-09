/*
== += -= *= /= %=
 */
public class SetValueTest {
    public static void main(String[] args) {
        System.out.println("");

        short s1 = 10;
        s1 += 2; //不会改变数据类型

        //+2的操作
        s1 += 2;
        //+1
        int num = 10;
        num++;

        int i = 1;
        i *= 0.1; //0
        i++; //1


        int n1 = 10;
        n1 += (n1++) + (++n1); //n1 = n1 + (n1++) + (++n1) = 10 + 10 + 12 = 32

    }
}
