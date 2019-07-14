package com.bootcamp.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "Upss. No result";

        try {
            result = secondChallenge.probablyIWillThrowException(2, 3);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            System.out.println(result);
        }
    }
}
