package com.example.standard;

//implementation par composition


import com.example.compo.IHDMI;

public class Adapter implements IVGA {
    private IHDMI ihdmi;

    public void setIhdmi(IHDMI ihdmi){
        this.ihdmi= ihdmi;
    }
    @Override
    public void print(String data) {
        System.out.println("............ Adapter ................");
            byte[] input = data.getBytes();
            ihdmi.view(input);
        System.out.println("............ /Adapter ................");
    }
}
