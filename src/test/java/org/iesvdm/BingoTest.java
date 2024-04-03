package org.iesvdm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BingoTest {

    @Test
    void testPrueba() {
        assertThat(1!=1).isTrue();
    }


    @Test
    void testPonerBlancos(){
        // Genero los arrays columnas:
//        int[] col0 = new int[3];
//        int[] col1 = new int[3];
//        int[] col2 = new int[3];
//        int[] col3 = new int[3];
//        int[] col4 = new int[3];
//        int[] col5 = new int[3];
//        int[] col6 = new int[3];
//        int[] col7 = new int[3];
//        int[] col8 = new int[3];
//
//        // Los paso a mi matriz o array bidimensional:
//        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        int[][] cartonDirecto = new int[9][3];

        Bingo.ponerBlancos(cartonDirecto);
        String[] filas = {"", "", ""};
        for( int[] col : cartonDirecto ) {
            for(int j = 0; j < 3; j++) {
                filas[j] += (col[j] == 0 ? " 0": col[j]) +" ";
            }
        }

        for(String fila : filas)
            System.out.println(fila);





    }


}
