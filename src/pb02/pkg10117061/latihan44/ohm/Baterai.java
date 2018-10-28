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
public class Baterai {
  private float kuatArus,hambatan;

    
public Baterai(){
    System.out.println("===Ohm===");
    System.out.println("Kuat arus yang mengalir pada suatu kawat penghatar");
    System.out.println("akan sebading lurus dengan beda potensial");
    System.out.println("pada ujung-ujung kawat penghantar tersebut");
    System.out.println("asalkan suhu kawat di jaga konstan.");
}
public Baterai(float kuatArus,float hambatan){
this.hambatan=hambatan;
this.kuatArus=kuatArus;
}

    public float getKuatArus() {
        return kuatArus=3;
    }

    public float getHambatan() {
        return hambatan=12;
    }


public float hitungTegangan(){
return kuatArus*hambatan;
}
  
  
}
