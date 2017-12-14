
package practica1;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class MenuJuego {
    PanelDeJuego tablero= new PanelDeJuego();
     private String marco[][];
     int mes;
     int dia;
     int aaa;
     int CantidadUsuarios;
    
    Usuario[] ListaUsuarios;
private String nombre;
    private int opcion;
    Usuario actual;
     private int opcion1;
    private int punteo; 
      int opcion2=0;
 public void iniciarJuego(){
     while(opcion!=4){
         
         
         System.out.println("\n\n¿Que desea hacer?:\n\n"
                    + "   1. Iniciar Juego\n"
                    + "   2. Regresar Juego\n"
                    + "   3. Historial\n"
                    + "   4. Salir\n\n"
                    + "    Ingrese su opcion...!");
         
         opcion = (new Scanner(System.in)).nextInt();
                           
         switch (opcion) {
                case 1:                                         //Gestionar Diccionario
                    
                    while(opcion1 != 5){
                        System.out.println("\nEscriba su nombre de usuario: ");
         nombre= (new Scanner(System.in)).nextLine();
                        System.out.println("\nEscriba el dia que nacio: ");
                        dia= (new Scanner(System.in)).nextInt();
                        System.out.println("Escriba el No.Mes de nacimiento: ");
                        mes=(new Scanner(System.in)).nextInt();
                        System.out.println("Escriba el No.Año de nacimiento: ");
                        aaa=(new Scanner(System.in)).nextInt();
                   System.out.println("Se inicia el juego. Haga su primer movimiento...!");
                           tablero.establecerBordesHorizontales();
                           tablero.establecerEspaciosenblanco();
                           tablero.establecerBordesVerticales();
                           tablero.establecerFrutosBuenos();
                           tablero.establecerFrutosMalos();
                           tablero.establecerParedes();
                           
                           
                           
                           while(true ){
                              
                             String m=(new Scanner(System.in)).next();
                           tablero.movimientoDelSnake(m);
                           tablero.establecerMarco();
                           tablero.guardarMarco();
                           if( !"x".equals(m)){
                               System.out.println("Nombre: "+nombre+"    Punteo: "+tablero.puntos);
                               System.out.println("Da tu siguiente movimiento...!");
                               System.out.println("Sigue el juego. Si quieres pausarlo pulsa x");}
                           else if(tablero.puntos==100){System.out.println("Ha ganado...!");
                           break;
                           }
                           else {
                               System.out.println("Pausa...");
                               break;
                               }
                           }
                           System.out.println("Pulse \"5\" si quiere volver a menu y salir o reiniciar...! ");
                           opcion1 = (new Scanner(System.in)).nextInt();
                           tablero.guardarMarco();
                    }
                    System.out.println("Su juego esta en pausa...!");
                    opcion1+=1;
                    
                    break;
                case 2:
                    tablero.guardarMarco();
                    tablero.devolverMarco1();
                    System.out.println("Se reinicia el juego...!");
                    System.out.println("Sigue moviendo...!");
                   while(opcion1 !=5 ){
                     while(true ){
                              
                             String m=(new Scanner(System.in)).next();
                           tablero.movimientoDelSnake(m);
                           tablero.establecerMarco();
                           if( !"m".equals(m)){
                               System.out.println("Nombre: "+nombre+"    Punteo: "+tablero.puntos);
                               System.out.println("Da tu siguiente movimiento...!");
                               System.out.println("Sigue el juego. Si quieres pausarlo pulsa m");}
                           else if(tablero.puntos==100){System.out.println("Ha ganado...!");
                           break;
                           }
                           else {
                               System.out.println("Pausa...");
                               break;
                               }
                           }
                           System.out.println("Pulse \"5\" si quiere volver a menu y salir o reiniciar...! ");
                           opcion1 = (new Scanner(System.in)).nextInt();
                           tablero.guardarMarco();
                    }
                    System.out.println("Su juego esta en pausa...!");
                    opcion1+=1;
                    break;
                    /* tablero.establecerMarcoGuardado();
                    
                    
                    opcion1 = (new Scanner(System.in)).nextInt();
                    punteo=(new Scanner(System.in)).nextInt();
                    if(tablero.puntos==100){
                        System.out.println("ha ganado");
                        break;
                    }
                    }
                   
                    System.out.println("Su juego esta de nuevo en pausa...!");
                    break;*/
                case 3:
                    System.out.println("Muestra historia");
                    System.out.println("Nombre: "+nombre+" Su fecha de nacimiento es: "+ dia+"/"+mes+"/"+aaa +" y su punteo es: "+tablero.puntos);
                    System.out.println("Quiere volver a menu...?\n1.Si\n2.No");
                    while(true){opcion2 = (new Scanner(System.in)).nextInt();
                    if(opcion2==1){
                        break;}
                    }
                    
     }
         
         
 }

    
}}
