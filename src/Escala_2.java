/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author Alejandro
 */
public class Escala_2 extends Canvas{
Control_mult form2;

int px1 ,py1 ,pxx1, pyy1;
int a1 , b1,c1,d1, e1,f1,g1,h1, i1,j1, k1,l1, m1,n1,o1,a2 , b2,c2,d2, e2,f2,g2,h2, i2,j2, k2,l2, m2,n2,o2;

    /** Creates a new instance of pincel */
    public Escala_2(Control_mult   K) {
        this.form2 = K;
    }
    public void rrepintar(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1, int i1, int j1, int k1, int l1, int m1, int n1, int o1,
            int a2, int b2, int c2, int d2, int e2, int f2, int g2, int h2, int i2, int j2, int k2, int l2, int m2, int n2, int o2){
        this.a1 = a1;
        this.b1= b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        this.a2 = a2;
        this.b2= b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;
        this.g2 = g2;
        this.h2 = h2;
        this.i2 = i2;
        this.j2 = j2;
        this.k2 = k2;
        this.l2 = l2;
        this.m2 = m2;
        this.n2 = n2;
        this.o2 = o2;

    }


     public void paint (Graphics pen){ // Metodo de pintado
    //Canvas papel = this;
         pen.setColor(new Color (255,0,255));
     pen.drawLine(0,150,400,150);
     pen.drawLine(200,0,200,300);
     pen.setColor(new Color(255,255,0));
     pen.drawLine(a1  , 150,a2 , 100);
     pen.drawLine(b1 , 100,b2, 200);
     pen.drawLine(c1 , 200,c2, 100);
     pen.drawLine(d1, 100,d2, 200);
     pen.drawLine(e1, 200,e2, 100);
     pen.drawLine(f1, 100,f2, 200);
     pen.drawLine(g1, 200,g2, 100);
     pen.drawLine(h1, 100,h2, 200);
     pen.drawLine(i1, 200,i2, 100);
     pen.drawLine(j1, 100,j2, 200);
     pen.drawLine(k1, 200,k2, 100);
     pen.drawLine(l1, 100,l2, 200);
     pen.drawLine(m1, 200,m2, 100);
     pen.drawLine(n1, 100,n2, 200);
     pen.drawLine(o1, 200,o2, 100);

      
    }

     public void repaint (Graphics pen){
         

     }
    }
