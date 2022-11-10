/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Miguelgmez__
 */
public class NumB10 {

    private int num;

    /**
     * constructor de NumB10. número en base 10
     *
     * @param num valor del número en base 10
     */

    public NumB10(int num) {
        this.num = num;
    }

    /**
     * assigna el valor al número.
     *
     * @param num valor a assignar
     */
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num; // (error 1)
    }

}
