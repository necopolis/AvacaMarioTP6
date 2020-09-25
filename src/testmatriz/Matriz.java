/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatriz;

/**
 *
 * @author MArio
 */
public class Matriz {
    
    
    public void armar(){
        int matriz[][]=new int[4][];
        int relleno=3;
        matriz[0]=new int[4];
        matriz[1]=new int[3];
        matriz[2]=new int[5];
        matriz[3]=new int[2];
            for(int[] fila:matriz){
                for(int columna=0; columna<fila.length;columna++){
                    fila[columna]=relleno;
                    relleno+=3;
                }//fin segundo for
            }//fin primer for
            for(int fila=0; fila< matriz.length;fila++){
                    System.out.print("Fila "+(fila+1)+"-");
                for(int columna=0; columna<matriz[fila].length;columna++){
                    if((matriz[fila][columna]%2)==0){
                            System.out.print(" "+matriz[fila][columna]);
                    }
                }
                    System.out.println(" ");
            }
    }
}
