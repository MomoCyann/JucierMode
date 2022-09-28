public class BubbleSort_10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -3, 2, -5, -30, 20};

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 时间复杂度O(n2)
    }
}
