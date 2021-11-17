package com.example.compo;

public class TV implements IHDMI {
    @Override
    public void view(byte[] data) {
        System.out.println("##### TV ########");
        System.out.println(new String(data));
        System.out.println("#################");
    }
}
