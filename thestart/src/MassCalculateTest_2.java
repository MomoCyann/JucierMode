public class MassCalculateTest_2 {
    public static void main(String[] args) {
        //获取两个整数较大值
        int m = 10;
        int n = 10;
        int max = (m > n)? m : n;
        System.out.println(max);

        String maxStr = (m > n)? "M大" : "n大";
        System.out.println(maxStr);

        String maxStr2 = (m > n)? "M大" : ((m == n)? "m等于n" : "n大");
        System.out.println(maxStr2);

        //获取三个数的最大值
        int a = 10;
        int b = 20;
        int c = 50;

        int max1 = (a > b)? a : b;
        int max2 = (max1 > c)? max1 : c;
        System.out.println(max2);
        int max3 = (((a > b)? a : b) > c)? ((a > b)? a : b) : c; //可读性太差

        //三元运算符都可以改为if-else
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        //优先三元，比if-else效率更高，但是if-else可以写的更复杂，如果本身很简单就不推荐if-else


    }
}
