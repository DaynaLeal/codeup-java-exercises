import java.util.Arrays;

public class Practice2 {
  public static void main(String[] args){
    // System.out.println("Hello world");

    // System.out.println(countTrue(testBoolArr)); //2
    // System.out.println(formatPhoneNumber(testIntArr)); // (123)456-7890

    // System.out.println(checkEnding(str1, str2)); //true
    // System.out.println(checkEndingStr(str1, str2)); //true

    // System.out.println(getWord("book", "ish")); //Bookish
    // System.out.println(discount(89, 20)); //71.2
    // System.out.println(programmers(147, 33, 526)); //493

    // System.out.println(getXO("zpzpzpp")); //true
    // System.out.println(getXO("zzoo")); //false
    // System.out.println(getXO("ooxXm")); //true
    // System.out.println(getXO("xooxx")); //false

    System.out.println(isAvgWhole2(testIntArr2));
    System.out.println(isAvgWhole2(testIntArr3));

  }

  public static boolean[] testBoolArr = {true, false, false, true, false};
  public static int[] testIntArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  public static String str1 = "book";
  public static String str2 = "ish";
  public static int[] testIntArr2 = {1, 2, 3, 4};
  public static int[] testIntArr3 = {9, 2, 2, 5};

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
  

  public static boolean getXO (String str) {
		int xs = 0;
		int os = 0;
    char[] letters = str.toCharArray();
    
		for(char letter: letters){
			if(letter == 'x' || letter == 'X'){
				xs++;
			} else if (letter == 'o' || letter == 'O'){
				os++;
			} 
		}
		return xs == os;
  }


  public static int triangularNumSequence(int n) {
		return (n * (n + 1))/2;
  }

  //one refactor
  public static boolean isAvgWhole(int[] arr) {
		double bucket = 0;
		for(int num: arr){
			bucket += num;
		}
		double avg = bucket / arr.length;
		return avg == Math.round(avg);
  }
  public static boolean isAvgWhole2(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		return sum % arr.length == 0;
  }
  

  public static boolean changeEnough(int[] change, double amountDue) {
		double total = (change[0] * .25) + (change[1] * .1) + (change[2] * .05) + (change[3] * .01);
		return total >= amountDue;
  }
  

  public static String bomb(String str) {
		str = str.toUpperCase();
		if(str.contains("BOMB")){
			return "DUCK!";
		} else {
			return "Relax, there's no bomb.";
		}
  }
  

  public static String fizzBuzz(int n) {
		if(n % 3 == 0 && n % 5 == 0){
			return "FizzBuzz";
		} else if (n % 3 == 0){
			return "Fizz";
		} else if (n % 5 == 0){
			return "Buzz";
		} else {
			return Integer.toString(n);
		}
  }


  //with refactor
  public static String reverse(final String str) {
		char[] arr = str.toCharArray();
		String reversed = "";
    for(int i = arr.length - 1; i >= 0; i--){
			reversed += arr[i];
		}
		return reversed;
  }
  public static String reverse2(final String str) {
    return new StringBuilder(str).reverse().toString();
  }

  //with refactor
  public static boolean isInOrder(String str){
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String sorted = new String(charArr);
		return str.equals(sorted);
  }
  public static boolean isInOrder2(String str) {
		String[] arr = str.split("");
		java.util.Arrays.sort(arr);
		return String.join("", arr).equals(str);
  }

  //with refactor
  public static int[] numberSplit(int n) {
		return new int[] {(int)Math.floor(n/2.0), (int)Math.ceil(n/2.0)};
  }
  public static int[] numberSplit2(int n) {
		int[] arr = new int[2];
		if(n%2==0){
			arr[0]=n/2;
			arr[1]=n/2;
		}
		else{
			arr[0]=(n+1)/2;
			arr[1]=n-arr[0];
		}
		Arrays.sort(arr);
		return arr;
  }
  

  //Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between sum of even and odd numbers.
  public static int warOfNumbers(int[]numbers){
		int odds = 0;
		int evens = 0;
		for(int num: numbers){
			if(num % 2 == 0){
				evens += num;
			} else {
				odds += num;
			}
		}
		return Math.abs(odds - evens);
  }


  public static int[][] squarePatch(int n) {
		int[][] finalArray = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				finalArray[i][j] = n;
			}
		}
		return finalArray;
  }
  

  public static String rockPaperScissors(String s1, String s2) {
		if(s1.equals(s2)){
			return "TIE";
		} else if((s1.equals("rock") && s2.equals("scissors"))||(s1.equals("scissors") && s2.equals("paper"))||(s1.equals("paper") && s2.equals("rock"))){
			return "Player 1 wins";
		} else {
			return "Player 2 wins";
		}
  }
  

  public static int emptySq(int step) {
		return 4*step*(step-1);
  }


  public static String tpChecker(int people, int tp) {
    if ((tp * 500)/(people * 57) >= 14){
      return "Your TP will last " + (tp * 500)/(people * 57) + " days, no need to panic!";
    } else{
      return "Your TP will only last " + (tp * 500)/(people * 57) + " days, buy more!";
    }

}
