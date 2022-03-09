public class CalculateTest {
    public static void main(String[] args) {
        //随意给出一个三位数整数，打印他的百位数十位数个位数
        int num = 648;
        int hun = num / 100;
        int ten = (num % 100) / 10;
        int sing = num % 10;
        System.out.println("百位数为：" + hun + "十位数为：" + ten + "个位数为：" + sing);
    }
}
