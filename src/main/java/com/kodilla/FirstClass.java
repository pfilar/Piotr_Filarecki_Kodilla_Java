import java.util.*;
import java.lang.*;


class Checker {

    public void printEven(ArrayList<Integer> testList) {
        int temporaryValue = 0;
        for (int i = 0; i < testList.size(); i++){
            temporaryValue = testList.get(i);
            if (temporaryValue % 2 != 0) {
                System.out.println(temporaryValue);
            }
        }
    //    System.out.println("the test list contains " + testList.size() + " objects");
    }
}

class Test {

    public static void main(String[] args) {

        ArrayList<Integer> testList = new ArrayList<Integer>();
        Random theGenerator = new Random();

        for (int i = 0; i < 20; i++) {
            testList.add(theGenerator.nextInt(500));
        }
    //    System.out.println("the test list contains " + testList.size() + " objects");

        Checker tester = new Checker();
        tester.printEven(testList);

    }
}
