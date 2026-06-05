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
                    panchoduro();
                    break;
                case 2:
                    multiplicacionmatrices();
                    break;
                case 3:
                    System.out.println("Saliendo del codigo");
                    break;
                default:
                    System.out.println("Error, Ingrese una opcion dentro del rango [1-2]");

            }
        } while (opc != 3);
    }    
        

    public static void panchoduro(){
        int filas = 8;
        int columnas = 7;
        char[][] refri = new char[filas][columnas];

        int filacomida = 0;
        while (filacomida < filas) {
            int columnascomida = 0;
            while (columnascomida < columnas) {
                refri[filacomida][columnascomida] = '*';
                columnascomida += 1;
            }//fin del while de columnas
            filacomida = filacomida + 1;
        }//fin del while de filas
        
        //contadores de comida 
        int verdurapodrida = 4; 
        int tortilla = 3;
        int sobras = 3;
        int pancho = 1;

        int malas = verdurapodrida + tortilla + sobras + pancho;
        int score = 0;

        while (verdurapodrida > 0) {
            int filarandy = aleatorio.nextInt();
            int colarandy = aleatorio.nextInt();
            if (refri[filarandy][colarandy] == '*') {
                refri[filarandy][colarandy] = 'V';
                verdurapodrida = verdurapodrida - 1;
            }//fin del if
        }//fin del while

        while (tortilla > 0) {
            int filarandy = aleatorio.nextInt();
            int colarandy = aleatorio.nextInt();
            if (refri[filarandy][colarandy] == '*') {
                refri[filarandy][colarandy] = 'T';
                tortilla = tortilla - 1;
            }//fin del if
        }//fin del while

        while (sobras > 0) {
            int filarandy = aleatorio.nextInt();
            int colarandy = aleatorio.nextInt();
            if (refri[filarandy][colarandy] == '*') {
                refri[filarandy][colarandy] = 'S';
                sobras = sobras - 1;
            }//fin del if
        }//fin del while

        while (pancho > 0) {
            int filarandy = aleatorio.nextInt();
            int colarandy = aleatorio.nextInt();
            if (refri[filarandy][colarandy] == '*') {
                refri[filarandy][colarandy] = 'P';
                pancho = pancho - 1;
            }//fin del if
        }//fin del while
        
        while (malas>0) {            
            System.out.println("YEPTDELR: ¿Y Ese Pancho Todo Duro en la Refri?");
            int i = 0;
            while (i<filas) {                
               int j = 0;
                while (j<columnas) {                    
                    System.out.println("[" + refri[i][j] + "]");
                    j+=1;
                }//while j
                System.out.println();
                i+=1;
            }//while i
            System.out.println("Ingrese la Fila [0-7])");
            int llenarFila = entry.nextInt();
            System.out.println("Ingrese la Columna [0-8]");
            int llenarCol = entry.nextInt();
            if (llenarFila>= 0 && llenarFila<filas && llenarCol>= 0 && llenarCol<columnas) {
                char casilla = refri[llenarFila][llenarCol];
                if (casilla=='*') {
                    System.out.println("Contiene comida buena");
                } else if (casilla==' ') {
                    System.out.println("Este espacio ya esta vacio");
                } else if (casilla=='V') {
                    score=score+1;
                    System.out.println("Comida Purgada");
                }else if (casilla=='T') {
                    score=score+2;
                    System.out.println("Comida Purgada");
                }else if (casilla=='S') {
                    score=score+3;
                    System.out.println("Comida Purgada");
                }else if (casilla=='P') {
                    score=score+5;
                    System.out.println("Comida Purgada");
                }
                refri[llenarFila][llenarCol] = ' ';
                malas=malas-1;
                System.out.println("Puntaje Total: " +score);
            }
            
        }//fin del while de malas
        
        }//fin del metodo 1
        
        public static void multiplicacionmatrices(){
            
        }
    }


