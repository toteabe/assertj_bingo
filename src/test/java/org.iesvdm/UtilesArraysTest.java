package org.iesvdm;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;


    public class UtilesArraysTest {
        @Test
        public void limpiarTest1() {
            int[] limpio = UtilesArrays.limpiar();
                assertThat(limpio).isEmpty();
        }

        @Test
        public void rellenarTest1() {
            //When
            int[] valorCero = UtilesArrays.rellenar(new int[3], 0);

            //Do then
            for (int i = 0; i < valorCero.length; i++) {
                if (valorCero[i] != 0) {
                    fail("El valor no es igual a cero");
                }
            }
        }

        @Test
        public void rellenar2Test1() {
            //When
            int[] valorConcreto = UtilesArrays.rellenar(new int[4], 3);

            //Do then
            for (int i = 0; i < valorConcreto.length; i++) {
                if (valorConcreto[i] != 3) {
                    fail("En la posicion: "+i+", su valor no es 3, sino:"+valorConcreto[i]);
                }
            }
        }

        @Test
        public void insertarAlFinalTest1() {
            //When
            int numero = 2;
            int[] array = {4, 7};
            int[] array2 = UtilesArrays.insertarAlFinal(array, numero);
                assertThat(array2).hasSize(3);

            //Do
            for (int i = 0; i < array.length; i++) {
                assertThat(array2[i]).isEqualTo(array[i]);
            }

            //Then
                assertThat(array2[array2.length - 1]).isEqualTo(numero);
        }

        @Test
        public void insertarAlPrincipioTest1() {
            //When
            int numero = 2;
            int[] array = {4, 7};
            int[] array2 = UtilesArrays.insertarAlPrincipio(array, numero);
                assertThat(array2).hasSize(3);
                assertThat(array2[0]).isEqualTo(numero);

            //Do then
            for (int i = 1; i < array2.length; i++) {
                assertThat(array2[i]).isEqualTo(array[i-1]);
            }
        }

        @Test
        public void insertarEnPosicionTest1() {
            //When
            int posicion = 1;
            int numero = 2;
            int[] array = {4, 7};
            int[] array2 = UtilesArrays.insertarEnPosicion(array, numero, posicion);
                assertThat(array2).hasSize(3);

            //Do then
            for (int i = 0; i < posicion; i++) {
                assertThat(array2[i]).isEqualTo(array[i]);
            }
                assertThat(array2[posicion]).isEqualTo(numero);

            for (int i = posicion + 1; i < array2.length; i++) {
                assertThat(array2[i]).isEqualTo(array[i-1]);
            }
        }

        @Test
        public void insertarOrdenadoTest1() {
            //When
            int numero = 2;
            int[] array = {4, 7};
            int[] array2 = UtilesArrays.insertarOrdenado(array, numero);
                assertThat(array2).hasSize(3);

            //Do then
                assertThat(array2).isSorted();
        }

        @Test
        public void eliminarUltimoTest1() {
            //When
            int[] array = {4, 7};
            int[] array2 = {4};

            //Do then
            int[] arrayFinal = UtilesArrays.eliminarUltimo(array);
                assertThat(arrayFinal).isEqualTo(array2);
        }


        @Test
        public void eliminarPrimeroTest1() {
            //When
            int[] array = {4, 7};
            int[] array2 = {7};

            //Do then
            int[] arrayPrimero = UtilesArrays.eliminarPrimero(array);
                assertThat(arrayPrimero).isEqualTo(array2);
        }

        @Test
        public void eliminarPosicionTest1() {
            //When
            int posicion = 1;
            int[] array = {4, 7, 5};
            int[] array2 = {4, 5};
            int[] arrayFinal = UtilesArrays.eliminarPosicion(array, posicion);

            //Do then
                assertThat(arrayFinal).hasSize(3);
                assertThat(arrayFinal).isEqualTo(array2);
        }

        @Test
        public void eliminarTest1() {
            //When
            int numero = 7;
            int[] array = {4, 7, 9};
            int[] array2 = {4, 9};
            int[] arrayFinal = UtilesArrays.eliminar(array, numero);

            //Do then
                assertThat(arrayFinal).hasSize(array2.length);
                assertThat(arrayFinal).containsExactlyInAnyOrder(array2);
        }

        @Test
        public void ordenarTest1() {
            //when
            int[] array = {4, 7, 9};
            int[] arrayFinal = UtilesArrays.ordenar(array);

            //Do then
                assertThat(arrayFinal).isSorted();
        }

        @Test
        public void desordenarTest1() {
            //When
            int[] arrayFinal = {4, 7, 9};

            //Do
            UtilesArrays.desordenar(arrayFinal);

            //Then
                assertThat(arrayFinal).isNotEqualTo(UtilesArrays.ordenar(arrayFinal));
        }

        @Test
        public void invertirTest() {
            //When
            int[] array = {4, 7, 9};
            int[] array2 = {9, 4, 7};

            //Do
            int[] arrayFinal = UtilesArrays.invertir(array);

            //Then
                assertThat(arrayFinal).isEqualTo(array2);
        }

        @Test
        public void estaOrdenadoTest1() {
            //When
            int[] array = {4, 7, 9};
            int[] array2 = {9, 4, 7};

            //Do then
                assertThat(UtilesArrays.estaOrdenado(array)).isTrue();
                assertThat(UtilesArrays.estaOrdenado(array2)).isFalse();
        }


        @Test
        public void buscarTest1() {
            //When
            int numero = 7;
            int[] array = {4, 7, 9};
            int posicion = UtilesArrays.buscar(array, numero);

            //Do then
                assertThat(posicion).isEqualTo(1);
        }
        @Test
        public void buscarTest2() {
            int elemento = 9;
            int[] array = {4, 7};
            int posicion = UtilesArrays.buscar(array, elemento);
            assertThat(posicion).isEqualTo(-1);
        }
        @Test
        public void partirPorTest1() {
            //When
            int[] array = {4, 7, 9, 5};
            int posicion1 = 1;
            int posicion2 = 3;

            //Do
            int[] arrayFinal = UtilesArrays.partirPor(array, posicion1, posicion2);
                assertThat(arrayFinal).hasSize(2);

            //Then
                assertThat(arrayFinal).containsExactly(7, 9);
        }

        @Test
        public void partirPorTest2() {
            //When
            int[] array = {4, 7, 9, 5};
            int posicion1 = 0;
            int posicion2 = 5;

            //Do then
            int[] arrayFinal = UtilesArrays.partirPor(array, posicion1, posicion2);
                assertThat(arrayFinal).hasSize(0);

        }

        @Test
        public void partirPorTest3() {
            //When
            int[] array = {4, 7, 9, 5};
            int posicion1 = 3;
            int posicion2 = 3;

            //Do then
            int[] arrayFinal = UtilesArrays.partirPor(array, posicion1, posicion2);
                assertThat(arrayFinal).hasSize(0);
        }
        @Test
        public void sonIgualesTest1() {
            //When
            int[] array1 = {4, 7, 9};
            int[] array2 = {4, 7, 9};
            int[] array3 = {1, 2, 3};

            //Do then
                assertThat(UtilesArrays.sonIguales(array1, array2)).isTrue();
                assertThat(UtilesArrays.sonIguales(array1, array3)).isFalse();
        }

        @Test
        public void concatenarArraysTest1() {
            //When
            int[] array1 = {4, 7, 9};
            int[] array2 = {6, 5, 8};

            //Do
            int[] arrayFinal = UtilesArrays.concatenarArrays(array1, array2);
                assertThat(arrayFinal).hasSize(6);

            //Then
                assertThat(arrayFinal).containsSequence(4, 7, 9, 6, 5, 8);
        }

}
