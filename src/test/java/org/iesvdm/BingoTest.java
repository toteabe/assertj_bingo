package org.iesvdm;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BingoTest {

    @Test
    void test1() {

        assertThat(1==1).isTrue();


    }

    @Test
    void soloenramatestponerblancos(){

    }


    /*
    Carton de ponerBlancos
    -1 -1 -1  0  0 -1  0  0  0
    -1  0  0  0 -1  0 -1  0 -1
     0 -1  0 -1  0  0 -1  0 -1
     */
    @Test
    void ponerBlancos() {

        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        // Los paso a mi matriz o array bidimensional:
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        //int[][] carton2 = new int[3][9];

        Bingo.ponerBlancos(carton);

        //for (int[] col: carton)
        //    System.out.println(Arrays.toString(col));
        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }

        int contBlancos=0;
        for (int[] col: carton){
            int cont = 0;
            for (int celda: col) {
                if (celda == -1) {
                    cont++;
                    contBlancos++;
                }
            }
            assertThat(cont).isLessThan(3);
        }
        assertThat(contBlancos).isEqualTo(12);

    }
}
