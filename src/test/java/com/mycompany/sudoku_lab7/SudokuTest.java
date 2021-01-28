/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sudoku_lab7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author WILL
 */
public class SudokuTest {
    
    public SudokuTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    //Test para ver el numero de casillas
    @Test
    public void testSudokuOrden2Tiene16Casillas() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int totalCasillas = sudoku.getTotalCasillas();
        assertEquals(16, totalCasillas);
    }
    
    @Test
    public void testSudokuOrden3Tiene81Casillas() {
        int orden=3;
        int[][] sudo = { 
            { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
            { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
            { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
            { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
            { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
            { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
            { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
            { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
            { 5, 2, 8, 6, 3, 9, 4, 1, 7 } 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int totalCasillas = sudoku.getTotalCasillas();
        assertEquals(81, totalCasillas);
    }
    
    //Test para ver el numero de cuadrados
    @Test
    public void testSudokuOrden2Tiene4Cuadrados() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int totalCuadrados = sudoku.getTotalCuadrado();
        assertEquals(4, totalCuadrados);
    }
    
    @Test
    public void testSudokuOrden3Tiene9Cuadrados() {
        int orden=3;
        int[][] sudo = { 
            { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
            { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
            { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
            { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
            { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
            { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
            { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
            { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
            { 5, 2, 8, 6, 3, 9, 4, 1, 7 } 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int totalCuadrados = sudoku.getTotalCuadrado();
        assertEquals(9, totalCuadrados);
    }
    

    //Test para ver el numero de maximo que debe tener cada casilla deacuerdo al orden
    @Test
    public void testSudokuOrden2TieneNumeroMaximo4() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int numeroMaximoCasillas = sudoku.getNumeroMaximoCasillas();
        assertEquals(4, numeroMaximoCasillas);
    }
    
    @Test
    public void testSudokuOrden3TieneNumeroMaximo9() {
        int orden=3;
        int[][] sudo = { 
            { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
            { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
            { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
            { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
            { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
            { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
            { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
            { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
            { 5, 2, 8, 6, 3, 9, 4, 1, 7 } 
        };
        Sudoku sudoku = new Sudoku(orden,sudo);
        int numeroMaximoCasillas = sudoku.getNumeroMaximoCasillas();
        assertEquals(9, numeroMaximoCasillas);
    }
    
    
    // VALIDAR TEST SUDOKU REFACTORIZADO
    
    //TEST VALIDAR SUDOKU 2X2
    
    //TEST VALIDAR SUDOKU 2X2 VALIDO
    @Test
    public void testValidarSudoku_2x2() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertTrue(resultado);
    }
    
    //TEST VALIDAR SUDOKU 2X2 SI EL NUMERO NO ESTE EN EL RANGO DE 1 A 4
    @Test
    public void testValidarSudoku_2x2NumeroRango1y4() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 5},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 2X2 SI HAY REPETIDO EN FILAS
    @Test
    public void testValidarSudoku_2x2FilaRepetida() {
        int orden=2;
        int[][] sudo = { 
            { 1, 1, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 2X2 SI HAY REPETIDO EN COLUMNAS
    @Test
    public void testValidarSudoku_2x2ColumnaRepetida() {
        int orden=2;
        int[][] sudo = { 
            { 2, 1, 3, 4},
            { 3, 4, 2, 1},
            { 2, 1, 4, 3},
            { 4, 3, 1, 2} 
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 2X2 SI EN UN CUADRADO SE REPITE UN NUMERO 
    @Test
    public void testValidarSudoku_2x2CuadradoNumeroRepetido() {
        int orden=2;
        int[][] sudo = { 
            { 1, 2, 3, 4},
            { 2, 3, 4, 1},
            { 3, 4, 1, 2},
            { 4, 1, 2, 3} 
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 3X3
    //TEST VALIDAR SUDOKU 3X3 VALIDO
    @Test
    public void testValidarSudoku_3x3() {
        int orden=3;
        int[][] sudo = {
            {5, 6, 8, 3, 2, 9, 7, 4, 1},
            {4, 2, 1, 6, 5, 7, 3, 8, 9},
            {7, 3, 9, 1, 8, 4, 5, 2, 6},
            {8, 7, 5, 4, 3, 1, 9, 6, 2},
            {3, 9, 4, 2, 6, 8, 1, 5, 7},
            {2, 1, 6, 7, 9, 5, 4, 3, 8},
            {9, 5, 3, 8, 7, 6, 2, 1, 4},
            {6, 4, 7, 5, 1, 2, 8, 9, 3},
            {1, 8, 2, 9, 4, 3, 6, 7, 5}
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertTrue(resultado);
    }
    
    //TEST VALIDAR SUDOKU 3X3 SI EL NUMERO NO ESTE EN EL RANGO DE 1 A 9
    @Test
    public void testValidarSudoku_3x3NumeroRango1y9() {
        int orden=3;
        int[][] sudo = {
            {15, 6, 8, 3, 2, 9, 7, 4, 1},
            {5, 2, 1, 6, 5, 7, 3, 8, 9},
            {7, 3, 9, 1, 8, 4, 5, 2, 6},
            {8, 7, 5, 4, 3, 1, 9, 6, 2},
            {3, 9, 4, 2, 6, 8, 1, 5, 7},
            {2, 1, 6, 7, 9, 5, 4, 3, 8},
            {9, 5, 3, 8, 7, 6, 2, 1, 4},
            {6, 4, 7, 5, 1, 2, 8, 9, 3},
            {1, 8, 2, 9, 4, 3, 6, 7, 5}
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 3X3 SI HAY REPETIDO EN FILAS
    @Test
    public void testValidarSudoku_3x3FilaRepetida() {
        int orden=3;
        int[][] sudo = {
            {5, 5, 8, 3, 2, 9, 7, 4, 1},
            {4, 2, 1, 6, 5, 7, 3, 8, 9},
            {7, 3, 9, 1, 8, 4, 5, 2, 6},
            {8, 7, 5, 4, 3, 1, 9, 6, 2},
            {3, 9, 4, 2, 6, 8, 1, 5, 7},
            {2, 1, 6, 7, 9, 5, 4, 3, 8},
            {9, 5, 3, 8, 7, 6, 2, 1, 4},
            {6, 4, 7, 5, 1, 2, 8, 9, 3},
            {1, 8, 2, 9, 4, 3, 6, 7, 5}
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 3X3 SI HAY REPETIDO EN COLUMNAS
    @Test
    public void testValidarSudoku_3x3ColumnaRepetida() {
        int orden=3;
        int[][] sudo = {
            {5, 6, 8, 3, 2, 9, 7, 4, 1},
            {4, 1, 2, 6, 5, 7, 3, 8, 9},
            {7, 3, 9, 1, 8, 4, 5, 2, 6},
            {8, 7, 5, 4, 3, 1, 9, 6, 2},
            {3, 9, 4, 2, 6, 8, 1, 5, 7},
            {2, 1, 6, 7, 9, 5, 4, 3, 8},
            {9, 5, 3, 8, 7, 6, 2, 1, 4},
            {6, 4, 7, 5, 1, 2, 8, 9, 3},
            {1, 8, 2, 9, 4, 3, 6, 7, 5}
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
    
    //TEST VALIDAR SUDOKU 3X3 SI EN UN CUADRADO SE REPITE UN NUMERO 
    @Test
    public void testValidarSudoku_3x3CuadradoNumeroRepetido() {
        int orden=2;
        int[][] sudo = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        Sudoku sudoku = new Sudoku(orden, sudo);
        boolean resultado=sudoku.validarSudoku();
        assertFalse(resultado);
    }
}
