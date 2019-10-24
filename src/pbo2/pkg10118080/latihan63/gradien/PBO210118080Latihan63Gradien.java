/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan63.gradien;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan63Gradien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat gr = new Koordinat(2, 5, 10, 7);
        System.out.println("Garis yang melalui titik ("+gr.getX1()+","+gr.getY1()+") dan ("+gr.getX2()+","+gr.getY2()+")");
        System.out.println("memiliki gradien sebesar "+gr.hitungGradien());
        
        Koordinat gr2 = new Koordinat(5, 3, 1, 12);
        System.out.println("Garis yang melalui titik ("+gr2.getX1()+","+gr2.getY1()+") dan ("+gr2.getX2()+","+gr2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+gr2.hitungGradien());
        
    }
    
}
