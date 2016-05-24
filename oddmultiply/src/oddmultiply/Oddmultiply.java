/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddmultiply;

/**
 *
 * @author serjhk
 */
public class Oddmultiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, result, sum = 0, a;
        for (i = 2; i <= 2; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "*" + (i * j));
                if (j % 2 != 0) {

                    a = i * j;
                    sum += a;
                }

            }
            System.out.println(sum);
        }
    }

    // TODO code application logic here
}

}
