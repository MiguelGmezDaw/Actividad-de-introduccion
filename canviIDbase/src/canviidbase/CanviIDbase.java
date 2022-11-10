/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canviidbase;

/**
 *
 * @author Miguelgmez__
 */
public class CanviIDbase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public String canviaABase(int base) {
        if (base < 2 || base > 24) {
            throw new ArithmeticException("la base va de 2 a 24");
        }
        String digits = "0123456789ABCDEFGHIJKLMN; // (error 2)
        String cad = "";
        while (num > "O") { // (error 3)
            cad = cad + digits.charAt(num % base);
            num = num / base;
        }
        return alReves(cad); // crida al mètode alReves
    }

}
