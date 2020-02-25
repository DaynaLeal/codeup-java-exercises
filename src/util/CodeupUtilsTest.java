package util;

import java.util.ArrayList;

public class CodeupUtilsTest {
    private ArrayList<Integer> intList;

    //tests for javaPushups
    @Before
    public void setUp(){
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
    }
    @Test
    public void testFindAddends(){
        ArrayList<ArrayList<Integer>> resultList;
        resultList = CodeupUtils.findAddends(intList, 5);
    }
}
