package java2Review;

public class TestIntClass {
    public static void main(String[] args) {
        IntClass intClass = new IntClass(2);
        IntClass intClass2 = new IntClass(4);

        //these two arent needed now that we made the constructor in #6
//        intClass.setValue(2);
//        intClass2.setValue(4);

        //4
        System.out.println(intClass.calcSum(intClass)); //uses intClass because not static, otherwise use arrays.tostring

        //5
        System.out.println(IntClass.calcSum(intClass, intClass2)); //notice we are using IntClass.calcSum not intClass.sum since this is static and must be called on the class and not the instance as in #4

        //7
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(IntClass.sumArray(numArray).getValue()); //adding .getValue gives actual value instead of the address/location
    }
}
