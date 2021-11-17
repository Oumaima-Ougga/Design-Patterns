package com.example.standard;

import com.example.standard.IVGA;

public class Monitor implements IVGA {
    @Override
    public void print(String data) {
        System.out.println("********************Monitor**************************");
        System.out.println(data);
        System.out.println("******************* /Monitor ************************* ");
    }
}
