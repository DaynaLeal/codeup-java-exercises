package java2Review;

public class IntClass {
    //2
    private int value;

    //default constructor
//    public IntClass(){
//
//    }

    //6
    //Constructor
    public IntClass(int val){
        this.value = val;
    }

    //3
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    //4
    public int calcSum(IntClass myInt){ //if this was static, we couldnt access it in the TestIntClass
        return this.value + myInt.getValue();
    }

    //5
    public static int calcSum(IntClass valOne, IntClass valTwo){
        return valOne.getValue() + valTwo.getValue();
    }

    //7
    public static IntClass sumArray(int[] x){
        int sum = 0;

        for(int number : x){
            sum += number;
        }

        return new IntClass(sum);
    }
}
