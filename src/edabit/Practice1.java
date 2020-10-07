package edabit;

public class Practice1 {
    public static void main(String[] args){
        int[] numberArray = {1, 2, 3, 4, 5};
        System.out.println(arraySum(numberArray));
        System.out.println(indexMultiplier(numberArray));
        System.out.println(check(numberArray, 2));
        System.out.println(search(numberArray, 6));
        System.out.println(difference(numberArray));

    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int el : arr){
            sum += el;
        }
        return sum;
    }

    public static int indexMultiplier(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] * i);
        }
        return sum;
    }

    public static boolean check(int[] arr, int el) {
        for(int num : arr){
            if (num == el){
                return true;
            }
        }
        return false;
    }

    public static int search(int[] arr, int item) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static int difference(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                max = nums[i];
            }
            if (min > nums[i]){
                min = nums[i];
            }
        }
        return max - min;
    }

}
