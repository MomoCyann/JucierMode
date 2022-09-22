import java.util.Scanner;

public class InputTest_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the num1");
        int num1 = scan.nextInt();
        System.out.println(num1);

        System.out.println("please input the num2");
        double num2 = scan.nextDouble();
        System.out.println(num2);

        System.out.println("please input the string");
        String str = scan.next();
        char str2 = str.charAt(0); //获取索引位置0的字符
        System.out.println(str2);
    }
}
