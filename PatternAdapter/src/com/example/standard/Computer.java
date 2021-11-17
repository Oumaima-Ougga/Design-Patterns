package com.example.standard;


public class Computer {

    private  IVGA vga;

    public void setVga(IVGA vga){
        this.vga=vga;
    }

    public void print(String str){
        System.out.println("--------------- Computer----------------------------");
        vga.print(str);
        System.out.println("--------------- /Computer----------------------------");

    }
}
