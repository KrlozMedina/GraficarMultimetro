
import java.awt.*;

public class Escala_1 extends Canvas {
    
    Control_mult  form1;
    int px=0,py=150,ancho = 0,pxx=0,pyy=0;
    int acceso = 0,limin=0, limax=0, lims=limax+limin;;
    
    /** Creates a new instance of Escala_1 */
    public Escala_1(Control_mult    R) {
        this.form1 = R;
    }
    
    public void asignacion (int prx, int pry, int d){
        
        this.px = prx;
        this.py = pry;
        this.ancho = d;
       

    }
    
     public void paint(Graphics lapiz){      
     lapiz.setColor(new Color (0,0,255));
     lapiz.drawLine(0,150,400,150);
     lapiz.drawLine(200,0,200,300);

   }

     



public void borrar (int b){
     this.acceso=b;
}

   
public void update (Graphics lapiz){

     if(acceso==0){
     lapiz.setColor(new Color (0,60,0));
     lapiz.drawLine(px, py, pxx, pyy);
    

     pxx=px;
     pyy=py;
     }
      else{
     lapiz.clearRect(0, 0, 400, 300);
     lapiz.setColor(new Color (0,0,255));
     lapiz.drawLine(0,150,400,150);
     lapiz.drawLine(200,0,200,300);

     
     pxx=0;
      }
     acceso=0;
     
     }
    
}

