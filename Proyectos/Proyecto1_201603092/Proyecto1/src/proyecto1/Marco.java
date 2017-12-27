/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import proyecto1.LaminaBienbenida.DameTextos;


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Marco extends JFrame {
        public ImageIcon fondoPanel;
        private JTextField campoTexto1; // campo de texto con tamaño fijo private JTextField campoTexto2; // campo de texto construido con texto
        private JTextField campoTexto2;
        private JTextField campoTexto4;
        private JTextField campoTexto3; // campo de texto con texto y tamaño
        private JTextField campoTexto5;
     
    public Marco(){
          campoTexto1 = new JTextField( 10 );
    campoTexto1.setBounds(200, 100, 150, 20);
     campoTexto2 = new JTextField( 10 );
    campoTexto2.setBounds(200, 200, 150, 20);
     campoTexto3 = new JTextField( 10 );
    campoTexto3.setBounds(500, 100, 150, 20);
     campoTexto4 = new JTextField( 10 );
    campoTexto4.setBounds(500, 200, 150, 20);
    campoTexto5 = new JTextField( 10 );
    campoTexto5.setBounds(200, 300, 150, 20);
    Dametexto i=new Dametexto();
    Dametexto i1=new Dametexto();
    Dametexto i2=new Dametexto();
    Dametexto i3=new Dametexto();
    Dametexto i4=new Dametexto();
    Dametexto i5=new Dametexto();
    Dametexto info=new Dametexto();
    
    Font fuente=new Font("Dialog", Font.BOLD, 50);
  i. setFont ( fuente ) ;
   info.setText("COLOCA TUS DATOS:");
   info.setBounds(100, 50, 150, 20);
    i1.setText("USUARIO 1");
    i1.setBounds(100, 100, 150, 20);
     i2.setText("USUARIO 2");
      i2.setBounds(100, 200, 150, 20);
     
      i3.setText("DAME TU ORDEN");
       i3.setBounds(380, 100, 150, 20);
       i4.setText("DAME TU ORDEN");
        i4.setBounds(380, 200, 150, 20);
        i5.setText("DEMEN SU TAMAÑO:");
        i5.setBounds(100, 250, 150, 20);
        
 
    i.setText("MEDIEVIL  "
            + "Bienvenidos..!");
    LaminaBienbenida eeee=new LaminaBienbenida(i,campoTexto1);
    LaminaBienbenida iiii=new LaminaBienbenida();
    LaminaBienbenida pideInformacion=new LaminaBienbenida(info,i1,campoTexto1 ,i2,campoTexto2,i3,campoTexto3,i4,campoTexto4,i5,campoTexto5   );
    eeee.setBounds(100, 25, 800, 100);
    iiii.setBounds(800, 400, 800, 200);
    iiii.setBackground(Color.green);
    eeee.setBackground(Color.GRAY);
    pideInformacion.setBounds(100, 150, 800, 500);
    pideInformacion.setBackground(Color.YELLOW);
    add(pideInformacion);
    add(eeee);
    add(iiii);
    }
    private class ManejadorCampoTexto implements ActionListener
 {
 // procesa los eventos de campo de texto
 public void actionPerformed( ActionEvent evento )
 {
 String usuario = ""; // declara la cadena a mostrar

 // el usuario oprimió Intro en el objeto JTextField campoTexto1
 if ( evento.getSource() == campoTexto1 )
 usuario = String.format( "campoTexto1: %s",
 evento.getActionCommand() );
 }}    
}
//------PANEL DEL USUARIO------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class LaminaBienbenida extends JPanel implements ActionListener{
  public JTextField usuario1;
  public JTextField usuario2;
  public JTextField orden1;
  public JTextField orden2;
  public  JTextField tamano;
  public static int tam=1;
  public static String or1[];
  public static String usu1=" ";
     public static String usu2=" ";
     public static String ordenSplit1;
     public static String ordenSplit2;
  public static String or2[];
   JButton botonCerrar;//////////////////////////////
   
    public LaminaBienbenida(){
        
    }
    public LaminaBienbenida(JLabel texto){
        DameCamposDETexto www=new DameCamposDETexto();
        
        //setBounds(100,100,100,200);
        add(texto);
     
        
        //setBackground(Color.green);
    }
    public LaminaBienbenida(JLabel intro,JLabel texto,JTextField escribirtexto,JLabel texto2,JTextField escribirtexto2,JLabel texto3,JTextField escribirtexto3,JLabel texto4,JTextField escribirtexto4,JLabel texto5,JTextField escribirtexto5){
        DameCamposDETexto www=new DameCamposDETexto();
        setLayout(null);
        //setBounds(100,100,100,200);
        //intro.setBounds(100, 750, 200, 25);
        
        usuario1=escribirtexto;
        usuario2=escribirtexto2;
        orden1=escribirtexto3;
        orden2=escribirtexto4;
        tamano=escribirtexto5;
        add(intro);
        add(texto);
        add(escribirtexto);
        add(texto2);
        add(escribirtexto2);
        add(texto3);
        add(escribirtexto3);
        add(texto4);
        add(escribirtexto4);
        add(texto5);
        add(escribirtexto5);
        botonCerrar=new JButton("cerrar Todo");
        botonCerrar.setBounds(400, 350, 150, 50);
        add(botonCerrar);
        JButton botonNuevo=new JButton("Jugar");
         botonNuevo.setBounds(550, 350, 150, 50);
        add(botonNuevo);
        OyenteNuevo miOyente=new OyenteNuevo();
        botonNuevo.addActionListener(miOyente);
        
        JButton miboton=new JButton("dale");
        DameTextos mievento=new DameTextos();
        miboton.addActionListener(mievento);
        miboton.setBounds(250, 350, 150, 50);
        add(miboton);
        
        //setBackground(Color.green);
    }
     private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
       MarcoEmergente marco2=new MarcoEmergente(botonCerrar);
        marco2.setVisible(true);
        }
        
    }
    class DameTextos implements ActionListener{
     
     
     //public static String or2[];
    // public  int tam; 
     
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(usuario1.getText().trim());
            System.out.println(usuario2.getText().trim());
            System.out.println(orden1.getText().trim());
            System.out.println(orden2.getText().trim());
            usu1=usuario1.getText().trim();
            usu2=usuario2.getText().trim();
            ordenSplit1=orden1.getText().trim();
            ordenSplit2=orden2.getText().trim();
            System.out.println(usu1);
            
          or1=ordenSplit1.split(",");
          for(int i=0;i<or1.length;i++){
              System.out.println(or1[i]);
          }
          or2=ordenSplit2.split(",");
          for(int i=0;i<or2.length;i++){
              System.out.println(or2[i]);
          }
          tam=Integer.parseInt(tamano.getText().trim());
            System.out.println(tam);
        }
        
    } 
 public LaminaBienbenida(JLabel texto,JTextField escribirtexto){
        DameCamposDETexto www=new DameCamposDETexto();
        
        //setBounds(100,100,100,200);
        add(texto);
        add(escribirtexto);
        
        
        //setBackground(Color.green);
    }

    
    public void actionPerformed(ActionEvent e) {
   setBackground(Color.BLUE);
    }
}
class Dametexto extends JLabel{
    public Dametexto(){
        
    }
}
class DameCamposDETexto extends JTextField{
    public DameCamposDETexto(){
     
    }
}
//-----MARCO DEL JUEGO----------------------------------------------------------------------------------------------------------------------------------------------------------------------
class MarcoEmergente extends JFrame{
    int numAleatorio1;//me da numeros de posisione de minas y vidas
    int numAleatorio2;
    
    JPanel panel2;
    int tamano2;//da el tamaño del tablero
    public ImageIcon mago1_1;
    Icon mag1,mina,vida,mago2,guerrero1,guerrero2,princesa1,princesa2;//imagenes del juego
    JPanel panel3;
    static int vida1=9;
    static int vida2=10;
    JPanel panelDeMov;
    JButton botonArriba;
    JButton botonAbajo;
    JButton botonDerecha;
    JButton botonIzquierda;
    //-------------------------------------------------
    JPanel vidasPanel;
    JPanel vidasPanel1;
    static boolean turno=true;
    JLabel [][] boton;
    JLabel [][] boton2;
    static JLabel [][]corazonVidas;
    static JLabel [][]corazonVidas1;
    private static int contador=0;
    static int numero=0;
    static int numero1=0;
    static int x=0;
    static int y=0;
    static int x1=0;
    static int y1=0;
    LaminaBienbenida iiii=new LaminaBienbenida();
    JLabel titus1,titus2,titusod1_1,titusod1_2,titusod1_3,titusod2_1,titusod2_2,titusod2_3;
    public MarcoEmergente(){
        
        
    }
    public MarcoEmergente(JButton botonPrincipal){
        corazonVidas=new JLabel[5][2];
        corazonVidas1=new JLabel[5][2];
        vidasPanel=new JPanel();
        vidasPanel1=new JPanel();
        Icon mago1=new ImageIcon(getClass().getResource("/Imagenes/mago1.png"));
        Icon mago2=new ImageIcon(getClass().getResource("/Imagenes/mago2.png"));
        panel3=new JPanel();
        panelDeMov=new JPanel();
        setBackground(Color.blue);
        setLayout(null);
        //Vidas Panel--------------------------------
        vidasPanel.setBounds(10,50, 200, 100);
        vidasPanel.setLayout(new GridLayout(2,5));
        
        vidasPanel1.setBounds(10,350, 200, 100);
        vidasPanel1.setLayout(new GridLayout(2,5));
        
        LaminaBienbenida iiia2=new LaminaBienbenida();
        LaminaBienbenida iiia=new LaminaBienbenida();
        //LaminaBienbenida panelDeMov=new LaminaBienbenida();
        iiia.setLayout(null);
        titus1=new JLabel();
        titus2=new JLabel();
        titusod1_1=new JLabel();
        titusod1_2=new JLabel();
        titusod1_3=new JLabel();
        titusod2_1=new JLabel();
        titusod2_2=new JLabel();
        titusod2_3=new JLabel();
        titus1.setText("Usuario1: "+iiia.usu1+ "Su orden es: ");
        titus1.setBackground(Color.blue);
        titus1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titus1.setBounds(10, 10, 350, 35);
        titus2.setText("Usuario1: "+iiia.usu1+ " Su orden es: ");
        titus2.setBackground(Color.blue);
        titus2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titus2.setBounds(10, 300, 350, 35);
        titusod1_1.setText(iiia.or1[0]);
        titusod1_1.setBackground(Color.blue);
        titusod1_1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod1_1.setBounds(260, 50, 100, 35);
        titusod1_2.setText(iiia.or1[1]);
        titusod1_2.setBackground(Color.blue);
        titusod1_2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod1_2.setBounds(260, 85, 100, 35);
        titusod1_3.setText(iiia.or1[2]);
        titusod1_3.setBackground(Color.blue);
        titusod1_3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod1_3.setBounds(260, 120, 100, 35);
        titusod2_1.setText(iiia.or2[0]);
        titusod2_1.setBackground(Color.blue);
        titusod2_1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod2_1.setBounds(260, 340, 100, 35);
        titusod2_2.setText(iiia.or2[1]);
        titusod2_2.setBackground(Color.blue);
        titusod2_2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod2_2.setBounds(260, 375, 100, 35);
        titusod2_3.setText(iiia.or2[2]);
        titusod2_3.setBackground(Color.blue);
        titusod2_3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        titusod2_3.setBounds(260, 410, 100, 35);
        //Botones-----------------------------------------------------------
        tamano2=iiia.tam;
        panel3.setLayout(new GridLayout(tamano2,tamano2));
        iiia.setBounds(550, 15, 400, 640);
        panel3.setBounds(12,12,500,500);
        iiia.add(vidasPanel);
        iiia.add(titus1);
        iiia.add(titus2);
        iiia.add(titusod1_1);
        iiia.add(titusod1_2);
        iiia.add(titusod1_3);
        iiia.add(titusod2_1);
        iiia.add(titusod2_2);
        iiia.add(titusod2_3);
        iiia.setBackground(Color.yellow);
        System.out.println(tamano2);
        y=tamano2/2;//pociciones iniciales
        x1=tamano2-1;
        y1=tamano2/2;
        pB("rotulo",tamano2);
        //--------------------------------
        establecerPanelVidas(vida1,vidasPanel,corazonVidas);
        iiia.add(vidasPanel);
        establecerPanelVidas(vida2,vidasPanel1,corazonVidas1);
        
        iiia.add(vidasPanel1);
        establecerMinas(tamano2);
        establecerVidas(tamano2);
        add(panel3);
        add(iiia);
        setLayout(null);
        panelDeMov.setLayout(null);
        botonArriba=new JButton("Arriba");//Arriba
        botonArriba.setBounds(200, 5, 100, 35);
        panelDeMov.add(botonArriba);
        
        botonAbajo=new JButton("abajo");//abajo
        botonAbajo.setBounds(200, 55, 100, 35);
        panelDeMov.add(botonAbajo);
        
        botonDerecha=new JButton("Derecha");//
        botonDerecha.setBounds(310, 35, 100, 35);
        panelDeMov.add(botonDerecha);
        
        botonIzquierda=new JButton("Izquierda");
        botonIzquierda.setBounds(90, 35, 100, 35);
        panelDeMov.add(botonIzquierda);
        
        panelDeMov.setBounds(15, 530, 500, 125);
        panelDeMov.setBackground(Color.BLUE);
        add(panelDeMov);
        
        
        contador++;
        setTitle("Juego "+contador);
        setBounds(40*contador,0,1000,700);
        CierraTodos oyentecerrar=new CierraTodos();
        botonPrincipal.addActionListener(oyentecerrar);
        AccionMov moverArriba=new AccionMov(1,0,1,tamano2,iiia.or1,iiia.or2);
        AccionMov moverAbajo=new AccionMov(-1,0,1,tamano2,iiia.or1,iiia.or2);
        AccionMov moverDerecha=new AccionMov(0,1,1,tamano2,iiia.or1,iiia.or2);
        AccionMov moverIzquierda=new AccionMov(0,-1,1,tamano2,iiia.or1,iiia.or2);
        
        botonAbajo.addActionListener(moverArriba);
        botonArriba.addActionListener(moverAbajo);
        botonDerecha.addActionListener(moverDerecha);
        botonIzquierda.addActionListener(moverIzquierda);
    }
    public void borarPanelvidas(JLabel corazonVida[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                
            corazonVida[i][j] = new JLabel(String.valueOf(" "));
            corazonVida[i][j].setIcon(null);
            }
        }
    }
    public void establecerPanelVidas(int vidas,JPanel vidasPanels,JLabel corazonVida[][]){
        //corazonVidas=new JLabel[5][2];
        Icon vida=new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
        Icon novida=new ImageIcon(getClass().getResource("/Imagenes/novida.png"));
        int contador=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(contador<vidas){
            corazonVida[i][j] = new JLabel(String.valueOf(" "));
            corazonVida[i][j].setIcon(vida);
            vidasPanels.add(corazonVida[i][j]);
            contador++;
            }else if(contador<10){
                corazonVida[i][j] = new JLabel(String.valueOf(" "));
            corazonVida[i][j].setIcon(novida);
            vidasPanels.add(corazonVida[i][j]);
            contador++;    
                    }
            }
        }
    }
     public void establecePanelVidas(int vidas,JLabel corazonVida[][]){
        //corazonVidas=new JLabel[5][2];
        Icon vida=new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
        Icon novida=new ImageIcon(getClass().getResource("/Imagenes/novida.png"));
        int contador=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(contador<vidas){
            corazonVida[i][j] = new JLabel(String.valueOf(" "));
            corazonVida[i][j].setIcon(vida);
            contador++;
            }else if(contador<10){
                corazonVida[i][j] = new JLabel(String.valueOf(" "));
            corazonVida[i][j].setIcon(novida);
            contador++;    
                    }
            }
        }
    }
    //--MINAS----------------------------------------------------------------------------------------------------------------------------------------------
    public void establecerMinas(int num){
        Icon mina=new ImageIcon(getClass().getResource("/Imagenes/mina.png"));
        int i=0;
        int restriccion=(num*num)*10/100;
        while(i<restriccion){

       numAleatorio1=(int)(Math.random()*num+1);
       numAleatorio2=(int)(Math.random()*num+1); 
            System.out.println(numAleatorio1);
            System.out.println(numAleatorio2);
           if(numAleatorio1<num && numAleatorio2<num){
          if( boton[numAleatorio1][numAleatorio2].getIcon()==null){
          boton[numAleatorio1][numAleatorio2].setIcon(mina);
          i++; 
       }
       
        }
        }
    }
    ///VIDAS----------------------------------------------------------------------------------------------------------------------------------------
      public void establecerVidas(int num){
        Icon vida=new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
        int i=0;
        int restriccion=(num*num)*5/100;
        while(i<restriccion){

       numAleatorio1=(int)(Math.random()*num+1);
       numAleatorio2=(int)(Math.random()*num+1); 
            System.out.println(numAleatorio1);
            System.out.println(numAleatorio2);
           if(numAleatorio1<num && numAleatorio2<num){
          if( boton[numAleatorio1][numAleatorio2].getIcon()==null){
          boton[numAleatorio1][numAleatorio2].setIcon(vida);
          i++; 
       }
       
        }
        }
    }
    //---ESTABLECE TABLERO-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     private void pB(String rotulo,int tam){//poner boton
         boton=new JLabel[tam][tam];
         boton2=new JLabel[tam][tam];
        Icon mago1=new ImageIcon(getClass().getResource("/Imagenes/mago1.png"));
        Icon mago11=new ImageIcon(getClass().getResource("/Imagenes/mago1.1.png"));
          Icon mago2=new ImageIcon(getClass().getResource("/Imagenes/mago2.png"));
        for (int i=0; i< tam;i++) {
        for (int j=0; j<tam;j++) {
            boton[i][j] = new JLabel(String.valueOf(" "));
            boton2[i][j]=new JLabel(String.valueOf(" "));
            boton[i][j].setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
            panel3.add(boton[i][j]); 
        }        
    }
        boton[x][y].setIcon(mago1);
            boton[x1][y1].setIcon(mago2);
    }
    //---CIERRA VENTANAS JUEGO-------------------------------------------------------------------------------------------------------------------------
     private class CierraTodos implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        dispose();
        contador=0;
        }
    }
    private class AccionMov extends Thread implements ActionListener{
    Icon mago1=new ImageIcon(getClass().getResource("/Imagenes/mago1.png"));
     Icon mago2=new ImageIcon(getClass().getResource("/Imagenes/mago2.png"));
     Icon princesa=new ImageIcon(getClass().getResource("/Imagenes/princesa1.png"));
     Icon princesa1=new ImageIcon(getClass().getResource("/Imagenes/princesa2.png"));
     Icon guerrero=new ImageIcon(getClass().getResource("/Imagenes/guerrero1.png"));
     Icon guerrero1=new ImageIcon(getClass().getResource("/Imagenes/guerrero2.png"));
       private  int xx;
       private  int yy;
       private  int mov;
       private  int tama;
       
       String jj[]=new String[3];
       String ji[]=new String[3];
       public AccionMov(int w,int z,int mov,int tam,String mm[],String mn[]){
           xx=w;
           yy=z;
           this.mov=(int)(Math.random()*6+1);
           tama=tam;
           for(int i=0;i<3;i++){
               jj[i]=mm[i];
               ji[i]=mn[i];
               
           }
        }
       
      public void actionPerformed(ActionEvent ae) {
         
          System.out.println(mov);
          if(turno){
          if(ji[numero].equalsIgnoreCase("mago")){
          for(int i=0;i<mov;i++){
            
            if(x>=0&&y>=0&&x<tama&&y<tama){
             x+=xx;
             y+=yy;   
            panel3.repaint();
            //----------------------------
         
            if(x<0||y<0||x>=tama||y>=tama){
          boton[x-xx][y-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(mago1);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x=tama/2;
          y=tama/2;
          turno=false;
          
          break;
          } 
            
            boton[x][y].setIcon(mago1);
            boton[x-xx][y-yy].setIcon(null);
            panel3.repaint();
            }
          }
          }
          if(ji[numero].equalsIgnoreCase("guerrero")){
          for(int i=0;i<mov;i++){
            
            if(x>=0&&y>=0&&x<tama&&y<tama){
             x+=xx;
             y+=yy;   
            panel3.repaint();
            //----------------------------
            
            if(x<0||y<0||x>=tama||y>=tama){
          boton[x-xx][y-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(guerrero1);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x=tama/2;
          y=tama/2;
          turno=false;
          
          break;
          } 
            
            boton[x][y].setIcon(guerrero1);
            boton[x-xx][y-yy].setIcon(null);
            panel3.repaint();
            }
          }
          }
          if(ji[numero].equalsIgnoreCase("princesa")){
          for(int i=0;i<mov;i++){
            
            if(x>=0&&y>=0&&x<tama&&y<tama){
             x+=xx;
             y+=yy;   
            panel3.repaint();
            //----------------------------
            /*if(boton[x][y].getIcon()==mina){
             vida1--;
             borarPanelvidas(corazonVidas);
             establecePanelVidas(vida1,corazonVidas);
             //------------------------------------------
            }*/
            if(x<0||y<0||x>=tama||y>=tama){
          boton[x-xx][y-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(princesa1);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x=tama/2;
          y=tama/2;
          turno=false;
          
          break;
          } 
            
            boton[x][y].setIcon(princesa1);
            boton[x-xx][y-yy].setIcon(null);
            panel3.repaint();
            }
          }
          }
          numero++;
          if(numero==3){
              numero=0;
          }
              
              
              turno=false;
          }
          
          else if(turno==false){
              if(jj[numero1].equalsIgnoreCase("mago")){
               for(int i=0;i<mov;i++){
            
            if(x1>=0&&y1>=0&&x1<tama&&y1<tama){
             x1+=xx;
             y1+=yy;   
          
            panel3.repaint();
            if(x1<0||y1<0||x1>=tama||y1>=tama){
          boton[x1-xx][y1-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(mago2);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x1=tama/2;
          y1=tama/2;
          turno=true;
          
          break;
          }
            boton[x1][y1].setIcon(mago2);
            boton[x1-xx][y1-yy].setIcon(null);
            panel3.repaint();
            }
          }   
              }
              if(jj[numero1].equalsIgnoreCase("guerrero")){
               for(int i=0;i<mov;i++){
            
            if(x1>=0&&y1>=0&&x1<tama&&y1<tama){
             x1+=xx;
             y1+=yy;   
          
            panel3.repaint();
            if(x1<0||y1<0||x1>=tama||y1>=tama){
          boton[x1-xx][y1-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(guerrero2);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x1=tama/2;
          y1=tama/2;
          turno=true;
          
          break;
          }
            boton[x1][y1].setIcon(guerrero2);
            boton[x1-xx][y1-yy].setIcon(null);
            panel3.repaint();
            }
          }   
              }
              if(jj[numero].equalsIgnoreCase("princesa")){
               for(int i=0;i<mov;i++){
            
            if(x1>=0&&y1>=0&&x1<tama&&y1<tama){
             x1+=xx;
             y1+=yy;   
          
            panel3.repaint();
            if(x1<0||y1<0||x1>=tama||y1>=tama){
          boton[x1-xx][y1-yy].setIcon(null);
          boton[tama/2][tama/2].setIcon(princesa2);
          System.out.println("movimiento no permitido. Ha perdido 1 vida");
          x1=tama/2;
          y1=tama/2;
          turno=true;
          
          break;
          }
            boton[x1][y1].setIcon(princesa2);
            boton[x1-xx][y1-yy].setIcon(null);
            panel3.repaint();
            }
          }   
        }
           numero1++;
          if(numero1==3){
              numero1=0;
          }   
          turno=true;
          }
      
    try {
              Thread.sleep(50);
          } catch (InterruptedException ex) {
             }
        }  
        }
    public void run(){
        
    }//metodo rum prueba
    }

 class LaminaMatriz extends JPanel{
     JPanel fondo;
     JPanel menus;
public LaminaMatriz(){
    setLayout(new BorderLayout());
    /*fondo=new JPanel();
    fondo.setBounds(700, 700, 700, 700);
    fondo.setBackground(Color.red);
    add(fondo);*/
    //setBounds(50,50,700,700);
    //setBackground(Color.BLUE);
     setLayout(new GridLayout());
}

 }

class Hilos implements Runnable{

    
    public void run() {
    
    }
    
}

//class LaminaMatriz2 extends Jpanel