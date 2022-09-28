import java.util.Arrays;

public class ArraysTools_11 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{1,3,2,4};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println(isEqual);

        System.out.println(Arrays.toString(array1));

        Arrays.fill(array1, 10);
        System.out.println(Arrays.toString(array1));

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[]{1,2,3,4,10,20};
        int index = Arrays.binarySearch(array3, 20);
        System.out.println(index);
    }
}
