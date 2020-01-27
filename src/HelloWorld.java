public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 99;
        System.out.println(myFavoriteNumber);

        String myString = "Happy Birthday Briana!";
        System.out.println(myString);

//        myString = 3.14159;

//        long myNumber = 123;
        float myNumber = 3.14f; //or float myNumber = (float) 3.14;

//        int x = 5;
//        System.out.println(x++); //doesnt return the increment
//        System.out.println(x); //returns the increment

//        int x = 5;
//        System.out.println(++x); //returns with the increment
//        System.out.println(x); //returns with the increment

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //these return an "exception in thread..."

//        int three = (int) "three"; //a string is not an int

//        int x = 4;
////        x = x + 5; //original
//        x += 5; //rewritten
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x; //original
//        y *= x; //rewritten
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);


    }
}

