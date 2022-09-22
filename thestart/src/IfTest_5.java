import java.util.Scanner;

public class IfTest_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = scan.nextDouble();
        if(grade == 100){
            System.out.println("BMW");
        }else if(grade > 80){
            System.out.println("iphone");
        }else if(grade >= 60){
            System.out.println("ipad");
        }else{
            System.out.println("nothing");
        }
        // &&并列

    }
}
