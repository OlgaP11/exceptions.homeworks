package homework1;

public class extraTask {
    public static void main(String[] args) {
            int[] nums1 = new int[]{6, 8, 4};
            int[] nums2 = new int[]{3, 4, 2};
            int[] newArr = divisionOfArrays(nums1, nums2);
            printArray(newArr);

            int[] nums3 = new int[]{6, 8, 4, 10};
            int[] nums4 = new int[]{3, 4, 2};
            int[] newArr2 = divisionOfArrays(nums3, nums4);
            printArray(newArr2);
    }

    public static int [] divisionOfArrays (int [] arr1, int [] arr2) throws RuntimeException{
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны.");
        } else {
            int[] result = new int[arr1.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = arr1[i] / arr2[i];
            }
            return result;
        }
    }

    public static void printArray (int [] arr){
        for (Integer n: arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
