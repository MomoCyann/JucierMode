import java.io.StringReader;
import java.util.Scanner;
public class SwitchCaseTest_7 {
    public static void main(String[] args) {
        int num = 2;
        // 找一个入口，依次执行。直到break或者结束
        // 限制： byte short char int 枚举 string类型
        
        switch (num){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println(2);
                break;
                //不加break 会一直执行下去
            case 3:
                System.out.println(3);
            default:
                System.out.println("unknown");
        }

        // 多个执行语句相同，可以合并
        int score = 60;
        switch (score / 10) {
            case 1:
            case 2:
            case 3:
                System.out.println("不合格");
                // 30分以下都不合格
            case 4:
            case 5:
            case 6:
                System.out.println("合格");
        }

        // 输入月份和天，输出是第几天
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int result = 0;
        switch (month) {
            case 12:
            case 11:
            // ……
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    result += 29;
                }else {
                    result += 28;
                }
                result += 28;
            case 1:
                result += day;
        }
        System.out.println("这是2019年的第" + result + "天");
    }
}
