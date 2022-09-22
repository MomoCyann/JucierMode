public class LoopTest_6 {
    public static void main(String[] args) {
        int num = 1;
        for(System.out.println("a"); num <= 3; System.out.println("c"), num++){
            System.out.println("b");
        }
        //结果 abcbcbc

        //for(;;)   while(true)
    }
}
