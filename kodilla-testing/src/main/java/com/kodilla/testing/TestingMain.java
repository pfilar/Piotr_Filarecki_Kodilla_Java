package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

    //  test of SimpleUser
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    // test of Calculator
        Calculator checkerMethod = new Calculator();
        int resultOfAdd = checkerMethod.add(2, 2);
        int resultOfSubtract = checkerMethod.subtract(4, 2);
        if ((resultOfAdd == 4) && (resultOfSubtract == 2)) {
            System.out.println("code is right");
        } else{
            System.out.println("code dosen't right");
        }
    }
}
