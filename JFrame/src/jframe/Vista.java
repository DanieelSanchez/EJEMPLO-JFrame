
package jframe;

import javax.swing.JFrame;



public class Vista extends JFrame{

    public Vista() {
        this.setTitle(" JFrame Formulario");
        this.setSize(450,380);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Vista v= new Vista();
        v.setVisible(true);
    }
    //CECyTEM TECAMAC :vv
    
}
