public class Practice2 {
  public static void main(String[] args){
    System.out.println("Hello world");

    System.out.println(countTrue(testBoolArr));
    System.out.println(formatPhoneNumber(testIntArr));
  }

  public static boolean[] testBoolArr = {true, false, false, true, false};
  public static int[] testIntArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

  public static int countTrue(boolean[] arr) {
    int total = 0;
    for(boolean el: arr){
      if(el == true){
        total++;
      }
    }
    return total;
  }

  public static String formatPhoneNumber(int[] nums) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1], nums[2], nums[3], nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
  }

}
