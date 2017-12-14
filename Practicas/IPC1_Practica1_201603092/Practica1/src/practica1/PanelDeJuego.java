
package practica1;

import java.util.Scanner;


public class PanelDeJuego {
       private String marco[][];//pocicion en el juego
       public String marco1[][];
       public int puntos=0;
       
       
       private int cuerpoCordenadas[][];
       int n=1;
       int tamano=5;
       int x=50;
       int y=12;
               
       
       
       private String cuerpo [][];
       private String mov;
       private int tam=3;
       private String cuerpoSnake[];
       private String cabeza [][]=new String[1][1];
       private int posx;
       private int posy;
       private int posyAnterior;
       private int posxAnterior;
       private int numAleatorio1;
       private int numAleatorio2;

    
    
    public PanelDeJuego(){
     this.marco=new String[70][35];
     this.marco1=new String[70][35];
     this.cuerpo=new String[200][200];
       posx=3;
       posy=3;
       posxAnterior=2;
       posyAnterior=3;
        cuerpoSnake=new String[30];
        cuerpoCordenadas=new int[200][20];
    }
     public PanelDeJuego(int ancho,int largo){
     this.marco=new String[ancho][largo];
    }
     
    public void establecerCabeza(){
      
    cabeza[0][0]="@";
    cuerpo[0][0]=cabeza[0][0];
    //marco[posx][posy]=cuerpo[0][0];
} 
     public void esblecerCuerpoSnake(){
       
           
       }  
     
    public void movimientoDelSnake(String mov){
       this.mov=mov;
       switch (mov) {
                case "d":                                         //Gestionar Diccionario
                    System.out.println("derecha");
                    if(marco[x][y+1]==" "){
                   /* marco[posx][posy]=" ";
                    marco[posx][posy+1]=cuerpo[0][0];
                    posy++;
                    break;*/
                    
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    

                    y++;
                    break;
                    }
                    else if(marco[x][y+1]=="%"){
                        System.out.println("Crece el Snake");
                        tamano+=1;
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    y++;
                        
                       puntos+=10;
                        
                        break;
                    }
                    else if(marco[x][y+1]=="$"){
                        System.out.println("disminuye snake el Snake");
                         tamano-=1;
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    y++;
                        puntos-=10; 
                        break;
                    }
                    else if(marco[x][y+1]=="#"||marco[x-1][y]=="@"){
                        System.out.println("Movimiento no permitido. Vuelva a intentarlo...!");    
                         break;
                    }else
                  
                    break;
                case "a":
                    System.out.println("izquierda");
                    /*marco[posx][posy]=" ";
                    marco[posx][posy-1]=cuerpo[0][0];
                    posy--;
                        break;*/
                     if(marco[x][y-1]==" "){
                    /*
                         marco[posx][posy]=" ";
                    marco[posx][posy-1]=cuerpo[0][0];
                    posy--;
                    break;
                         */
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    y--;
                     
                    break;
                    }
                    else if(marco[x][y-1]=="%"){
                        System.out.println("Crece el Snake");
                        tamano+=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    y--;
                        puntos+=10;
                        break;
                    }
                    else if(marco[x][y-1]=="$"){
                        System.out.println("Disminuye el Snake");
                        tamano-=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    y--;
                        puntos-=10;
                        break;
                    }
                    else if(marco[posx][posy-1]=="#"||marco[x-1][y]=="@"){
                        System.out.println("Movimiento no permitido. Vuelva a intentarlo...!");    
                        break;
                    }else
                  
                    break;
                  
                case "s":
                    System.out.println("abajo");
                    /*marco[posx][posy]=" ";
                    marco[posx+1][posy]=cuerpo[0][0];
                    posx++;
                    break;*/
                     if(marco[x+1][y]==" "){
                    /*marco[posx][posy]=" ";
                    marco[posx+1][posy]=cuerpo[0][0];
                    posx++;
                    break;*/
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x++;
                    
                    break;
                    }
                    else if(marco[x+1][y]=="%"){
                        System.out.println("Crece el Snake");
                        tamano+=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x++;
                        puntos+=10;
                        break;
                    }
                    else if(marco[x+1][y-1]=="$"){
                        System.out.println("disminuye snake el Snake");
                        tamano-=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x++;
                        puntos-=10;
                        break;
                    }
                    else if(marco[x+1][y-1]=="#"||marco[x-1][y]=="@"){
                        System.out.println("Movimiento no permitido. Vuelva a intentarlo...!");   
                         break;
                    }else
                            
                  
                    break;
                case "w":
                    System.out.println("arriba");
                    /*marco[posx][posy]=" ";
                    marco[posx-1][posy]=cuerpo[0][0];
                    posx--;
                    break;*/
                     if(marco[x-1][y]==" "){
                    /*marco[posx][posy]=" ";
                    marco[posx-1][posy]=cuerpo[0][0];
                    posx--;
                    break;*/
                    guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x--;
                         
                        
                    break;
                    }
                    else if(marco[x-1][y]=="%"){
                        System.out.println("Crece el Snake");
                        tamano+=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x--;
                        puntos+=10;
                        break;
                    }
                    else if(marco[x-1][y]=="$"){
                        System.out.println("disminuye snake el Snake");
                        tamano-=1;
                        guardarPosicion();
                    dibujarCuerpo();
                    borrarCuerpo();
                    x--;
                        puntos+=10;
                        break;
                    }
                    else if(marco[x-1][y]=="#"||marco[x-1][y]=="@"){
                        System.out.println("Movimiento no permitido. Vuelva a intentarlo...!");   
                         break;
                    }else
                  
                    break;
     }
     }
     public void establecerpunto(){
         this.marco[25][25]="&";
     }
      public void guardarMarco(){
           for ( int fila = 0; fila < 70; fila++ ){  // itera a través de las columnas de la ﬁla actual           
               for ( int columna = 0; columna < 35; columna++ ){            
                marco1[ fila ][ columna ]=marco[ fila ][ columna ];
            }
            } 
          
      }
      public void devolverMarco1(){
       for ( int fila = 0; fila < 70; fila++ ){  // itera a través de las columnas de la ﬁla actual           
               for ( int columna = 0; columna < 35; columna++ ){            
                marco[ fila ][ columna ]=marco1[ fila ][ columna ];
            }
      }
      }
     public void establecerBordesHorizontales(){
        for ( int fila = 0; fila  < 70; fila ++ ){
            this.marco[fila ][0]="#";
            this.marco[fila ][34]="#";
        }
    }
     public void establecerBordesVerticales(){
        for ( int columna = 1; columna < 35; columna++ ){
            this.marco[0][columna]="#";
            this.marco[69][columna]="#";
        }
    }
     public void establecerEspaciosenblanco(){
        for ( int fila = 1; fila < 70; fila++ ){  // itera a través de las columnas de la ﬁla actual
           
               for ( int columna = 1; columna < 34; columna++ ){
            
                this.marco[ fila ][ columna ]=" ";
                
           
  
            }
            }
        }// ﬁn de for externo             
    public void establecerMarco(){
        for ( int fila = 0; fila < 70; fila++ ){  // itera a través de las columnas de la ﬁla actual
           
               for ( int columna = 0; columna < 35; columna++ ){
            
                System.out.print(marco[ fila ][ columna ]);
                
           
  
            }
            System.out.println();} 
        }// ﬁn de for externo 
    public void establecerMarcoGuardado(){
        for ( int fila = 0; fila < 70; fila++ ){  // itera a través de las columnas de la ﬁla actual
           
               for ( int columna = 0; columna < 35; columna++ ){
            
                System.out.print(marco1[ fila ][ columna ]);
                
           
  
            }
            System.out.println();} 
        }
    public void establecerFrutosBuenos(){
        int i=0;
        while(i<40){
            
       numAleatorio1=(int)(Math.random()*100)+2;
       numAleatorio2=(int)(Math.random()*100)+2; 
      
           if(numAleatorio1<70 && numAleatorio2<35){
          if(marco[numAleatorio1][numAleatorio2]==" "){
          marco[numAleatorio1][numAleatorio2]="%";
          i++; 
       }
       
        }
        }
    }
    public void establecerFrutosMalos(){
        int i=0;
        while(i<30){
            
       numAleatorio1=(int)(Math.random()*100)+2;
       numAleatorio2=(int)(Math.random()*100)+2; 
      
           if(numAleatorio1<70 && numAleatorio2<35){
          if(marco[numAleatorio1][numAleatorio2]==" "){
          marco[numAleatorio1][numAleatorio2]="$";
          i++; 
       }
       
        }
        }
    }
    public void establecerParedes(){
        int i=0;
        while(i<52){
            
       numAleatorio1=(int)(Math.random()*100)+2;
       numAleatorio2=(int)(Math.random()*100)+2; 
      
           if(numAleatorio1<70 && numAleatorio2<35){
          if(marco[numAleatorio1][numAleatorio2]==" "){
          marco[numAleatorio1][numAleatorio2]="#";
          i++; 
       }
       
        }
        }
    }
public void establecerCoordenadas(){
    cuerpoCordenadas[1][1]=6;
} 
public void guardarPosicion(){
    cuerpoCordenadas[n][0]=x;
    cuerpoCordenadas[n][1]=y;
    //n++;
    //if(n==tamano)n=1;
}
public void dibujarCuerpo(){
    
    for(int i=1;i<tamano+1;i++){
        marco[cuerpoCordenadas[i][0]][cuerpoCordenadas[i][1]]="@";
        n++;
        if(n==tamano){
            n=1;
            marco[cuerpoCordenadas[n][0]][cuerpoCordenadas[n][1]]=" ";
        }
       
    }
    
    
}
public void borrarCuerpo(){
    
        marco[cuerpoCordenadas[n][0]][cuerpoCordenadas[n][1]]=" ";
    
    
}
}

