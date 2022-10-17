/*
 * Control_mult.java
 *
 * 
 */
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.Timer;
/**
 *
 * @author  K-rloz
 */
public class Control_mult extends javax.swing.JFrame {
    private ArrayList listeners;
     WriterPort  emisor;
     ReaderPort  reader;
     String a="";
    String datoba,b,datolma,datolmi,datodel;
    int brr =0,lima,limi,var;
    Escala_1  lienzo;
    Escala_2  lienzo2;
    Timer reloj,reloj2;
    int conta=0, py,variacion=199 ;
    char [] j= new char [256];
    int [] u= new int [256];
    /** Creates new form Control_mult */
    public Control_mult() {
        initComponents();
        this.emisor= WriterPort.getInstance();

        this.reader = ReaderPort.getInstance();
        this.reader.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ActionEventPort actionEventPort = (ActionEventPort)evt;
                portReadData(actionEventPort);
            }
        }
        );
        lienzo = new Escala_1(this);
        lienzo.setBackground(new java.awt.Color(236, 233, 216));
        getContentPane().add(lienzo);
        lienzo.setBounds(160,20,400,200);
        lienzo2 = new Escala_2(this);
        lienzo2.setBackground(new java.awt.Color(236, 233, 216));
        getContentPane().add(lienzo2);
        lienzo2.setBounds(160,20,400,200);
        
        
        reloj= new Timer (16,new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTO_RELOJ5(evt);
                }
                
        });
        reloj2= new Timer (1000,new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTO_RELOJ2(evt);
                }

        });
        this.reloj2.start();
    this.reloj.start();
    
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cp2 = new javax.swing.JTextField();
        r200k = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        r50 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cp3 = new javax.swing.JTextField();
        cp5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(c1);
        c1.setBounds(80, 370, 80, 20);

        jLabel1.setText("Escala");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 370, 50, 20);

        jLabel2.setText("Valor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 400, 50, 20);
        getContentPane().add(c2);
        c2.setBounds(80, 400, 160, 40);
        getContentPane().add(cp);
        cp.setBounds(260, 390, 160, 40);

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 470, 140, 30);
        getContentPane().add(cp2);
        cp2.setBounds(260, 450, 180, 50);

        r200k.setLayout(null);

        jLabel3.setText("0 OHMS");
        r200k.add(jLabel3);
        jLabel3.setBounds(60, 200, 60, 14);

        r50.setLayout(null);

        jLabel7.setText("0 OHMS");
        r50.add(jLabel7);
        jLabel7.setBounds(60, 200, 60, 14);

        jLabel9.setText("50 Ohms");
        r50.add(jLabel9);
        jLabel9.setBounds(50, 150, 60, 14);

        jLabel11.setText("200 Ohms");
        r50.add(jLabel11);
        jLabel11.setBounds(40, 0, 70, 14);

        jLabel12.setText("150 Ohms");
        r50.add(jLabel12);
        jLabel12.setBounds(40, 50, 80, 14);

        jLabel10.setText("100 Ohms");
        r50.add(jLabel10);
        jLabel10.setBounds(40, 100, 80, 14);

        r200k.add(r50);
        r50.setBounds(0, 0, 110, 220);

        getContentPane().add(r200k);
        r200k.setBounds(30, 10, 110, 220);
        getContentPane().add(cp3);
        cp3.setBounds(450, 390, 130, 20);
        getContentPane().add(cp5);
        cp5.setBounds(450, 450, 120, 50);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-587)/2, (screenSize.height-554)/2, 587, 554);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String enc11,enc22,o,E1,E2,E3,U="",bin,F="",ran,hex,hex1,hex2,dato1,dato2,
        dato3,decimal,ent1,ent2,ent3,valor,valorT,coma;
char R,V1,V2,l,signo,punto,enc1,enc2,rang;
int D,I,com;
          a=cp.getText();

o=a.substring(1,4);
enc1=a.charAt(0); enc2=a.charAt(4); rang=a.charAt(4);
enc11=aascii(enc1); enc22=aascii(enc2);
R= o.charAt(0); V1=o.charAt(1);
V2=o.charAt(2); E1=aascii(R);
E2=aascii(V1); E3=aascii(V2);
U=E3+E2;
ran=rango(E1);
if(E1.equals("12")){
    r200k.setVisible(true);
    r50.setVisible(false);
}
cp3.setText(""+enc11+"  "+E1+"  "+E2+"  "+E3+"   "+enc22);
D=Integer.parseInt(E2);
hex1=Integer.toHexString(D);
I=Integer.parseInt(E3);
hex2=Integer.toHexString(I);
hex=hex2+hex1;
for(int i=0; i<hex.length();i++){
    l=hex.charAt(i);
    bin=abin(l);
    F=F+bin;
    }
signo=F.charAt(15);
    if(signo=='1'){c1.setText("+"+ran);}  else   {c1.setText("-"+ran);}
punto=F.charAt(14);

dato1=F.substring(10,14);
dato1=volteo(dato1);
dato2=F.substring(6,10);
dato2=volteo(dato2);
dato3=F.substring(2,6);
dato3=volteo(dato3);
decimal=F.substring(0,2);
decimal=volteo(decimal);
ent1=dbin(dato1); ent2=dbin(dato2); ent3=dbin(dato3); coma=dbin(decimal);
com=Integer.parseInt(coma);
valor=ent1+ent2+ent3;
valorT=valor.substring(0,com+1)+"."+valor.substring(com+1,valor.length());
c2.setText(valorT);
cp2.setText(F+"    " +punto+"   "+signo+"   "+dato1+"    "+hex);

        
        /*try {
        String datos;

        datos = cp.getText();

        this.emisor.escribir(datos);


        cp.setText("");


        }
        catch(IOException iOException){

        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

 public void portReadData(ActionEventPort actionEventPort){
String enc11,enc22,o,E1,E2,E3,U="",bin,F="",ran,hex,hex1,hex2,dato1,dato2,
        dato3,decimal,ent1,ent2,ent3,valor,valorT,coma;
char R,V1,V2,l,signo,punto,enc1,enc2,rang;
int D,I,com;
          a+=actionEventPort.getReaded();

o=a.substring(1,4);
enc1=a.charAt(0); enc2=a.charAt(4); rang=a.charAt(4);
enc11=aascii(enc1); enc22=aascii(enc2);
R= o.charAt(0); V1=o.charAt(1);
V2=o.charAt(2); E1=aascii(R);
E2=aascii(V1); E3=aascii(V2);
U=E3+E2;
ran=rango(E1);
if(E1.equals("12")){
    r200k.setVisible(true);
    r50.setVisible(false);
}
cp3.setText(""+enc11+"  "+E1+"  "+E2+"  "+E3+"   "+enc22);
D=Integer.parseInt(E2);
hex1=Integer.toHexString(D);
I=Integer.parseInt(E3);
hex2=Integer.toHexString(I);
hex=hex2+hex1;
for(int i=0; i<hex.length();i++){
    l=hex.charAt(i);
    bin=abin(l);
    F=F+bin;
    }
signo=F.charAt(15);
    if(signo=='1'){c1.setText("+"+ran);}  else   {c1.setText("-"+ran);}
punto=F.charAt(14);

dato1=F.substring(10,14);
dato1=volteo(dato1);
dato2=F.substring(6,10);
dato2=volteo(dato2);
dato3=F.substring(2,6);
dato3=volteo(dato3);
decimal=F.substring(0,2);
decimal=volteo(decimal);
ent1=dbin(dato1); ent2=dbin(dato2); ent3=dbin(dato3); coma=dbin(decimal);
com=Integer.parseInt(coma);
valor=ent1+ent2+ent3;
valorT=valor.substring(0,com+1)+"."+valor.substring(com+1,valor.length());
c2.setText(valorT);
cp2.setText(F+"    " +punto+"   "+signo+"   "+dato1+"    "+hex);

 a="";   
 variacion=Integer.parseInt(valor.substring(0,com+1));
 variacion=variacion+150;

 }
String volteo(String l){
    String N="";
    char e;
   for(int i=0;i<l.length();i++){
    e=l.charAt(i);
    N=e+N;
    }
    return N;
}
String rango(String x){
    String p="";
    if(x.equals("0")){p="200mV";}
    if(x.equals("1")){p="2V";}
    if(x.equals("2")){p="20V";}
    if(x.equals("3")){p="200V";}
    if(x.equals("4")){p="1000V";}
    if(x.equals("5")){p="KHz/MHz";}
    if(x.equals("6")){p="continuidad";}
    if(x.equals("8")){p="200 ohms";}
    if(x.equals("9")){p="2K ohms";}
    if(x.equals("10")){p="20k ohms";}
    if(x.equals("12")){p="200k ohms";}
    if(x.equals("16")){p="2M ohms";}
    if(x.equals("17")){p="20M ohms";}
    
    if (x.equals("18")){p="20uF";}
    if (x.equals("20")){p="2uF";}
    if (x.equals("24")){p="200nF";}
    if (x.equals("32")){p="2000pF";}
    if (x.equals("33")){p="DCA 20A";}
    if (x.equals("34")){p="DCA 200mA";}
    if (x.equals("36")){p="DCA 20mA";}
    if (x.equals("40")){p="DCA 2mA";}
    if (x.equals("48")){p="DCA 200uA";}
    if(x.equals("64")){p="TEMP 200ºF";}
    if (x.equals("65")){p="TEMP 2000ºF";}
    if (x.equals("66")){p="TEMP 200ºC";}
    if (x.equals("68")){p="TEMP 1370ºC";}
    if (x.equals("128")){p="ACV 200mV";}
    if (x.equals("129")){p="ACV 2V";}
    if (x.equals("130")){p="ACV 20V";}
    if (x.equals("131")){p="ACV 200V";}
    if (x.equals("132")){p="ACV 750V";}
    if (x.equals("161")){p="ACA 20A";}
    if (x.equals("162")){p="ACA 200mA";}
    if (x.equals("164")){p="ACA 20mA";}
    if (x.equals("168")){p="ACA 2mA";}
    if (x.equals("176")){p="ACA 200uA";}
    if (x.equals("255")){p="HOLD";
    }    return p;

}
String dbin(String x){
    String h="";
    if(x.equals("00")){h="0";}
    if(x.equals("01")){h="1";}
    if(x.equals("10")){h="2";}
    if(x.equals("11")){h="3";}
    if(x.equals("0000")){h="0";}
    if(x.equals("0001")){h="1";}
    if(x.equals("0010")){h="2";}
    if(x.equals("0011")){h="3";}
    if(x.equals("0100")){h="4";}
    if(x.equals("0101")){h="5";}
    if(x.equals("0110")){h="6";}
    if(x.equals("0111")){h="7";}
    if(x.equals("1000")){h="8";}
    if(x.equals("1001")){h="9";}
    if(x.equals("1010")){h="a";}
    if(x.equals("1011")){h="b";}
    if(x.equals("1100")){h="c";}
    if(x.equals("1101")){h="d";}
    if(x.equals("1110")){h="e";}
    if(x.equals("1111")){h="f";}
return h;
}
String abin(int x){
    String h="";
    if(x=='0'){h="0000";}
    if(x=='1'){h="0001";}
    if(x=='2'){h="0010";}
    if(x=='3'){h="0011";}
    if(x=='4'){h="0100";}
    if(x=='5'){h="0101";}
    if(x=='6'){h="0110";}
    if(x=='7'){h="0111";}
    if(x=='8'){h="1000";}
    if(x=='9'){h="1001";}
    if(x=='a'){h="1010";}
    if(x=='b'){h="1011";}
    if(x=='c'){h="1100";}
    if(x=='d'){h="1101";}
    if(x=='e'){h="1110";}
    if(x=='f'){h="1111";}
return h;
}
String dascci (int p){
    String G="";
        for(int i=0; i<256;i++){
            j[i]= (char)(i);
        if(p==j[i]){
           G=String.valueOf(j[i]);
        }
        }

    return G;
    }
String aascii (char x){
        String n="";

        for(int i=0; i<256;i++){
            u[i]= (int)(i);
        if(x==u[i]){
           n=String.valueOf(u[i]);
        }
        }
    return n;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control_mult().setVisible(true);
            }
        });
    }
    
    public void  EVENTO_RELOJ5(java.awt.event.ActionEvent evt){

// ojo var es variacion y lmi es limi,lima es lma por si havy que corregir 
        conta++;
        
        if (conta<400){
            
            this.lienzo.asignacion(conta,variacion,2);
            this.lienzo.repaint();
            a="";
           
        }
        else{
            a="";
            this.lienzo.borrar(1);
            this.lienzo.repaint();
            conta=0;
        }

   

    
    }
        public void  EVENTO_RELOJ2(java.awt.event.ActionEvent evt){


        }
      
    


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField cp2;
    private javax.swing.JTextField cp3;
    private javax.swing.JTextField cp5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel r200k;
    private javax.swing.JPanel r50;
    // End of variables declaration//GEN-END:variables
    
}
