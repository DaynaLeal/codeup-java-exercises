import java.util.Arrays;

public class Practice2 {
  public static void main(String[] args){
    System.out.println("Hello world");

    // System.out.println(countTrue(testBoolArr)); //2
    // System.out.println(formatPhoneNumber(testIntArr)); // (123)456-7890
    // System.out.println(checkEnding(str1, str2)); //true
    // System.out.println(checkEndingStr(str1, str2)); //true
    // System.out.println(getWord("book", "ish")); //Bookish
    System.out.println(discount(89, 20)); //71.2
    System.out.println(programmers(147, 33, 526)); //493
  }

  public static boolean[] testBoolArr = {true, false, false, true, false};
  public static int[] testIntArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  public static String str1 = "book";
  public static String str2 = "ish";

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


  //with refactor
  public static boolean checkEnding(String str1, String str2) {
    String substr = str1.substring(str1.length() - str2.length());
    return substr.equals(str2);  
  }
  public static boolean checkEndingStr(String str1, String str2) {
    return str1.endsWith(str2);
  }


  //with refactor
  public static String getWord(String left, String right) {
    String capitalized = left.substring(0, 1).toUpperCase() + left.substring(1);
		String word = capitalized + right;
    return word;
  }
  public static String getWordRefactored(String left, String right) {
    return left.substring(0, 1).toUpperCase() + left.substring(1) + right;
  }
  

  public static double discount(int price, int percentage) {
		double discount = price * (percentage * .01);
		double total = price - discount;
		return total;
  }
  
  
  //two refactors
  public static int programmers(int one, int two, int three) {
		int[] arr = {one, two, three};
		int min = arr[0];
		int max = 0;
		for(int salary: arr){
			if(salary < min){
				min = salary;
			} else if (salary > max){
				max = salary;
			} else {
				continue;
			}
		}
		return max - min;
  }
  public static int programmers2(int one, int two, int three) {
    int [] arr =  {one, two, three};
    Arrays.sort(arr);
    return arr[2] - arr[0];
 }
  public static int programmers3(int one, int two, int three) {
		int max = Math.max(Math.max(one, two), three);
		int min = Math.min(Math.min(one, two), three);
		return max - min;
	}

}
