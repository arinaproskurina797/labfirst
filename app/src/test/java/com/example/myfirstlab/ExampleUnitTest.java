package com.example.myfirstlab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    /**
     * Тест для функции max() со входными днными 3 и 8 - пройден
     */
    @Test
    public void max1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(3,8), 8);
    }

    /**
     * Тест для функции max() со входными данными 7 и -3 - пройден
     */
    @Test
    public void max2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(7,-3), 7);
    }

    /**
     * Тест для функции max() со входными данными 0 и 0 - пройден
     */
    @Test
    public void max3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(0,0), 0);
    }

    /**
     * Тест для функции max() со входными даными -7 и 0 - пройден
     */
    @Test
    public void max4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.max(-7,0), 0);
    }

    /**
     * Тест для функции min() со входными даными 2 и 5 - пройден
     */
    @Test
    public void min1_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(2,5), 2);
    }

    /**
     * Тест для функции min() со входными данными 4 и 1 - пройден
     */
    @Test
    public void min2_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(4,1), 1);
    }

    /**
     * Тест для функции min() со входными даными 0 и 0 - пройден
     */
    @Test
    public void min3_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(0,0), 0);
    }

    /**
     * Тест для функции min() со входными даными -8 и 0 - пройден
     */
    @Test
    public void min4_isCorrect() {
        MainActivity m = new MainActivity();
        assertEquals(m.min(-8,0), -8);
    }
}