import java.util.Scanner;


public class IfTest2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三个数字");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if(num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }else{
            if(num3 >= num2){
                System.out.println(num3 + " " + num2 + " " + num1);
            }else if(num3 <= num1){
                System.out.println(num2 + " " + num1 + " " + num3);
            }else{
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }

    }
}
