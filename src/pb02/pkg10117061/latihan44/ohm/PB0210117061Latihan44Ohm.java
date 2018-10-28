/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan44.ohm;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung tegangan
 */
public class PB0210117061Latihan44Ohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Baterai bt = new Baterai();
    System.out.println("");
    System.out.println("Kuat arus : " +bt.getKuatArus()+" ampere");
    System.out.println("Hambatan : " +bt.getHambatan()+" ohm");
    System.out.println("Hasil Tegangan : " +bt.hitungTegangan()+" volt" );
    
    }
    
}
