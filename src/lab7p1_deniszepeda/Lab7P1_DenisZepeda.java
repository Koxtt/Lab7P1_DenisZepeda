/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_deniszepeda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class Lab7P1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    public static Scanner entry = new Scanner(System.in);
    public static Random r = new Random();
    public static Random aleatorio = new Random();
    
    public static void main(String[] args) {
        int opc = 0;
        do {
            System.out.println("MENU");
            System.out.println("1) YEPTDELR: ¿Y Ese Pancho Todo Duro en la Refri?");
            System.out.println("2) Multiplicación de Matrices");
            System.out.println("3) SALIR");
            opc = entry.nextInt();
            switch (opc) {
                case 1:
                    YEPTDELR();
                    break;
                case 2:
                    multiplicacionmatrices()
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Error, Ingrese una opcion dentro del rango [1-2]");
             
            }
        } while (opc!=3);
        
        public static void YEPTDELR(){
            int filas = 8;
            int columnas = 7;
            char[][] refri = new char [filas][columnas];
            
            int filacomida = 0;
            while (filacomida<filas) {                
                int columnascomida=0;
                while (columnascomida<columnas) {                    
                    refri[filacomida][columnascomida] = '*';
                    columnascomida+=1;
                }//fin del while de columnas
                filacomida=filacomida+1;
            }//fin del while de filas
            int verdurapodrida=4;
            int tortilla =3;
            int sobras = 3;
            int pancho=1;
            
            int malas = verdurapodrida+tortilla+sobras+pancho;
            int score = 0;
            
            while (verdurapodrida>0) {                
                int filarandy = aleatorio.nextInt();
                int colarandy = aleatorio.nextInt();
                if (refri[filarandy][colarandy] == '*') {
                    
                }
            }
            
        }
        
        public static void multiplicacionmatrices(){
            
        }
    }

}
