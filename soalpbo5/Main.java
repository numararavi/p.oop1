/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soalpbo5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("oyen");
        Anjing anjing = new Anjing("doggy");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();
    }
}
