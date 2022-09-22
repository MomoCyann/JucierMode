public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        // 获取数组长度
        System.out.println(array.length);
        // 遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
/*      数组默认初始化值
        整型：0
        浮点型 0.0
        char 0
        boolean false
        引用数据类型 null
*/
        // 二维数组
        int[][] array1 = new int[][] {{3,2}, {3,4}};

        int[] array_simple = {1,2,3};

    }
}
