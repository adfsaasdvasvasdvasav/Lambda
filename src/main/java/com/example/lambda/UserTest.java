package com.example.lambda;

import java.util.List;

import static com.example.lambda.UserDemo.*;

public class UserTest {
    public static void main(String[] args) {

        List<User> strongMan = findStrongMan();
        System.out.println(strongMan);

        List<User> strongMan2 = findStrongMan2();
        System.out.println(strongMan2);

        List<User> girl = findGirl();
        System.out.println(girl);
    }
}
