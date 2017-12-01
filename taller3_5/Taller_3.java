/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 *
 * @author HOME
 */
public class Taller_3 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int m;
        Random r = new Random();
        bw.write("Cual operacion desea: ");
        bw.flush();
        m = Integer.parseInt(bf.readLine());
        int[][] rombo_1 = new int[m][m];
        int[][] rombo_2 = new int[m][m];

        int mitad = m / 2;
        int mitad_2 = mitad-1;
        
        for (int i = 0; i < rombo_1.length; i++) {
            for (int j = 0; j < rombo_1.length; j++) {
                rombo_1[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        for (int i = 0; i < rombo_1.length; i++) {
            bw.write("\n");
            for (int j = 0; j < rombo_1.length; j++) {

                bw.write("[" + rombo_1[i][j] + "]");
                bw.flush();
            }
        }bw.write("\n");
                bw.flush();
        for (int i = 0; i < rombo_1.length; i++) {
            bw.write("\n");
            for (int j = 0; j < rombo_1.length; j++) {

                bw.write("[" + rombo_1[j][i] + "]");
                bw.flush();
            }
        }
        
        
        bw.write("\n");
        bw.flush();
                
        for (int i = 0; i < rombo_1.length; i++) {
            for (int j = 0; j < rombo_1.length; j++) {

                rombo_2[i][j] = 0;
            }
        }

        for (int i = 0; i < mitad; i++) {

            rombo_2[i][mitad - i] = rombo_1[i][mitad - i];
            rombo_2[i][mitad + i] = rombo_1[i][mitad + i];// modifica la parte superior para modificar su valor
            
            rombo_2[i][mitad_2] = rombo_1[i][mitad_2];
            rombo_2[i][mitad] = rombo_1[i][mitad];// mitad superior
            
            
            
            
            rombo_2[m - i - 1][mitad_2] = rombo_1[m - i - 1][mitad_2];
            rombo_2[m - i - 1][mitad] = rombo_1[m - i - 1][mitad];
           
            
            rombo_2[i][mitad_2 - i] = rombo_1[i][mitad_2 - i];
            rombo_2[i][mitad_2 + i] = rombo_1[i][mitad_2 + i];
            
            rombo_2[m - i - 1][mitad - i] = rombo_1[m - i - 1][mitad - i];
            rombo_2[m - i - 1][mitad + i] = rombo_1[m - i - 1][mitad - i];
            
            rombo_2[m - i - 1][mitad_2 - i] = rombo_1[m - i - 1][mitad_2 - i];
            rombo_2[m - i - 1][mitad_2 + i] = rombo_1[m - i - 1][mitad_2 - i];

        }

        for (int i = 0; i < rombo_2.length; i++) {
            bw.write("\n");
            for (int j = 0; j < rombo_2.length; j++) {

                bw.write("[" + rombo_2[i][j] + "]");
                bw.flush();
            }
        }

    }
}
