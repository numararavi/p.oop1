/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soalpbo5;

/**
 *
 * @author HP
 */
public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama, "kucing ");
    }
    @Override 
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("suara : meow");
    }
    
}
