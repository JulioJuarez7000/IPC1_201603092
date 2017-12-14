
package practica1;


public class ObjetosDelPanel extends PanelDeJuego{
   private String cuerpo [][];
   private int n=1;
   private int tam=3;
   private String cabeza [][]=new String[1][1];

public ObjetosDelPanel(){
    super();
   this.cuerpo=new String[200][2];
   
}
public void establecerCabeza(){
    cabeza[0][0]="@";
    cabeza[0][0]=cuerpo[0][0];

}
public void imprimirCabezaPanel(){
    
}
}