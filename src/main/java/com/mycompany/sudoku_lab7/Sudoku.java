/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sudoku_lab7;
import java.io.*;
import java.util.*;

/**
 *
 * @author WILL
 */
public class Sudoku {
    private final int orden;
    private int sudo[][];
    
    Sudoku(int orden, int sudo[][]){
        this.orden=orden;
        this.sudo = sudo;
    }
    
    private int cuadrado(int n){
        return n*n;
    }
    
    int getTotalCasillas(){
        return cuadrado(cuadrado(this.orden));
    }
    
    int getTotalCuadrado(){
        return cuadrado(this.orden);
    }
    
    int getNumeroMaximoCasillas(){
        return cuadrado(this.orden);
    }
    
    
    //test sudoku refractorizado
    
    
    boolean validarSudoku(){

        if (esValido(this.sudo, cuadrado(this.orden), this.orden))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public static boolean esValido (int matriz[][], int n, int orden)
    {
        //comprobar si los numeros estan en el rango del orden 3 [1, 9]
        //comprobar si los numeros estan en el rango del orden 2 [1, 4]
        if (esRango(matriz,n) == false)
        {
            return false;
        }
        // alamacenar valor unico de 1 a N
        boolean[] unique = new boolean[n + 1];
        //recorrer cada fila
        for(int i = 0; i < n; i++)
        {
            // inicializar array en falso
            Arrays.fill(unique, false);
            //recorrer cada columna de cada fila
            for(int j = 0; j < n; j++)
            {
                // guardar en valor board[i][j]
                int Z = matriz[i][j];

                // verificar si la fila se almaceno un valor duplicado
                if (unique[Z])
                {
                    return false;
                }
                unique[Z] = true;
            }
        }

        //recorrer cada columna
        for(int i = 0; i < n; i++) 
        {
            // inicializar array en falso
            Arrays.fill(unique, false);
            //recorrer cada fila de cada columna
            for(int j = 0; j < n; j++)
            {
                // guardar en valor board[j][i]
                int Z = matriz[j][i];

                // verificar si la columna se almaceno un valor duplicado
                if (unique[Z]) 
                {
                    return false;
                }
                unique[Z] = true;
            }
        }

        // recorrer cada cuadrado de tamaño n * n de la matriz sudo[][]
        for(int i = 0; i < n; i += orden) 
        {
            // j almacena la primera columna de cada cuadrado de n*n
            for(int j = 0; j < n; j += orden)
            {
                // inicializar array en falso
                Arrays.fill(unique, false);
                // recorrer cada cuadrado
                for(int k = 0; k < orden; k++)
                {
                    for(int l = 0; l < orden; l++)
                    {
                        // almacenaremos el numero fila del cuadrado
                        int X = i + k;
                        // almacenaremos el numero columna del cuadrado
                        int Y = j + l;
                        // almacena el valor de la matriz board[X][Y]
                        int Z = matriz[X][Y];
                        // verificar si el cuadrado almacena un valor duplicado
                        if (unique[Z])
                        {
                            return false;
                        }
                        unique[Z] = true;
                    }
                }
            }
        }
        // si cumple toda las condiciones
        return true;
    }
    
    static boolean esRango(int[][] matriz, int n)
    {
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                // comprobar si la matriz se encuentra en el rango de numeros
                if (matriz[i][j] <= 0 || matriz[i][j] > n)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
