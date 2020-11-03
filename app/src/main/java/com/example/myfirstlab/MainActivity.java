package com.example.myfirstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 *      Класс с функциями нахождения максимального и минимального числа
 *      @author  Арина Проскурина
*/
public class MainActivity extends AppCompatActivity {

    /**
     * Функция нахождения максимального значения из двух элементов
     * @param a - целое число
     * @param b - целое число
     * @return возвращает максимальное a или b
     */
    public int max(int a, int b){
        if (a >= b) {
            return a;
        }
        else
            return b;
    }
    /**
     * Функция нахождения минимального значения из двух элементов
     * @param a - целое число
     * @param b - целое число
     * @return возвращает минимальное a или b
     */
    public int min(int a, int b){
        if(a <= b) {
            return a;
        }
        else
            return b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity m = new MainActivity();
        m.max(4,7);
        m.min(-9,3);
    }
}
