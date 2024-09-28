/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soalpbo5;

/**
 *
 * @author HP
 */
public class Hewan {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    public void tampilkanInfo(){
        System.out.println("Nama hewan = "+ nama);
        System.out.println("Jenis hewan = "+ jenis);
    }
}
