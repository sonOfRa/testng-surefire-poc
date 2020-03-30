package de.slevermann.testng;

public class BadAdder {

    public int addBadly(int a, int b) {
        if (a < 10) {
            return a + b;
        } else {
            return a;
        }
    }
}
