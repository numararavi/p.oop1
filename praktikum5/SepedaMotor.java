/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
class SepedaMotor extends Kendaraan{
    private String jenisMesin;
    
    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);  // Memanggil constructor dari kelas induk
        this.jenisMesin = jenisMesin;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis mesin :"+ jenisMesin);
    }
}
