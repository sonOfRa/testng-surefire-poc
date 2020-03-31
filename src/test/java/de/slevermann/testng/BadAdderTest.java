package de.slevermann.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class BadAdderTest {

    private BadAdder badAdder = new BadAdder();

    @DataProvider
    public static Object[][] values() {
        List<Integer[]> pairs = new ArrayList<Integer[]>();
        pairs.add(new Integer[]{1, 2});
        pairs.add(new Integer[]{2, 3});
        pairs.add(new Integer[]{4, 10});
        pairs.add(new Integer[]{10, 4});
        return pairs.toArray(new Object[0][]);
    }

    @Test(dataProvider = "values")
    public void testAddBadly(int a, int b) {
        assertEquals(badAdder.addBadly(a, b), a + b);
    }

    @Test
    public void testAddBadlyNoParams() {
        assertEquals(badAdder.addBadly(10, 4), 10 + 4);
    }

    @Test
    public void testAddBadlyNoParamsAgain() {
        assertEquals(badAdder.addBadly(1,4), 1 + 4);
    }
}
