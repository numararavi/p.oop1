/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author HP
 */
public class Main {
    public static void main (String[]args){
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
      
        kucing.makan(" ikan", 4);
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan(" daging dimakan anjing", 5);
    }
    
}
