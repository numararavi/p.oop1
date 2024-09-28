/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
public class Kendaraan {
    protected String nama;
    protected int kecepatan;
    
    public Kendaraan(String nama, int kecepatan){
        this.nama =nama;
        this.kecepatan = kecepatan ;
        
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan = "+ nama);
        System.out.println("kecepatan = "+ kecepatan+"km/jam");
        
    }
    
}




