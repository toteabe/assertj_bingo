package org.iesvdm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.*;

public class BingoTest {


    @Test
    void test1(){
        assertThat(1==1).isTrue();
    }
    @Test
    void rellenarNumerosCartonTest1(){
        //when
        int[] arrayBi={4};
        //Do
        //Then
    }

    @Test
    void ponerBlancos(){
        //When
            //Genero los arryas columnas
            int[] col0=new int[3];
            int[] col1=new int[3];
            int[] col2=new int[3];
            int[] col3=new int[3];
            int[] col4=new int[3];
            int[] col5=new int[3];
            int[] col6=new int[3];
            int[] col7=new int[3];
            int[] col8=new int[3];

//
            int[][] carton={col0,col1,col2,col3,col4,col5,col6,col7,col8};

            //for(int[]col:carton)
            // System.out.println(Arrays.toString(col));

            Bingo.ponerBlancos(carton);

            //for (int[] col: carton)
            //System.out.println(Arrays.toString(col));

            for(int j=0; j< carton[0].length;j++){
                for(int i=0; i< carton.length;i++){
                    System.out.printf((carton[i][j]==0?" 0" : carton[i][j])+" ");
                }
                System.out.println("");
            }

            int contTotal=0;
            for(int[] col:carton) {
                int contB=0;
                for(int celda:col){
                    if (celda == -1) {
                        contB++;
                        contTotal++;
                    }
                }
                assertThat(contB).isLessThan(3);

            }
            assertThat(contTotal).isEqualTo(12);


            for(int j=0; j< carton[0].length;j++){
                int contFilas=0;
                for(int i=0; i< carton.length;i++){
                    if (carton[i][j] == -1) {
                        contFilas++;
                    }
                }
                assertThat(contFilas).isEqualTo(4);
            }


            }
    @Test
    void buscarFilaTest() {

        int[][] carton = {{1, 2, 3}, {4, -1, 6}, {7, 8, 9}};

        boolean encontrar = Bingo.buscarFila(carton, 1, 2);
        assertThat(encontrar).isTrue();

        encontrar = Bingo.buscarFila(carton, 1, 0);
        assertThat(encontrar).isFalse();
    }

    @Test
    void buscarColumna(){

    }

    @Test
    void buscarValorRepetido(){

    }

    @Test
    void pintarCarton(){

    }

    @Test
    void insertarAlFinal(){

    }

    @Test
    void ordenar(){

    }

}
