/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
class Mobil extends Kendaraan{
    private int jumlahPintu; 
    
    public Mobil(String nama, int kecepatan, int jumlahPintu){
        super(nama,kecepatan);
        this.jumlahPintu = jumlahPintu ;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Mobil: " + nama + ", Kecepatan: " + kecepatan + " km/jam, Jumlah Pintu: " + jumlahPintu);
    }
    public void tampilkanInfoMobil() {
        tampilkanInfo();
    }
}
