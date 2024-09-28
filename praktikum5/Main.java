/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
       
        Mobil mobil1 = new Mobil("Toyota Avanza", 120, 5);
        SepedaMotor sepedaMotor1 = new SepedaMotor("Yamaha NMAX", 110, "125cc");

        
        mobil1.tampilkanInfoMobil();  
        sepedaMotor1.tampilkanInfo();  
    }
}