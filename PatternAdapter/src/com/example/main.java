package com.example;

import com.example.compo.TV;
import com.example.standard.Adapter;
import com.example.standard.Computer;
import com.example.standard.Monitor;
import com.example.standard.VideoProj;

public class main {
    public static void main(String[] args) {
        Computer computer= new Computer();
        computer.setVga(new Monitor());
        computer.print("HELLO");
        computer.setVga(new VideoProj());
        computer.print("Hi");
        Adapter adapter = new Adapter();
        adapter.setIhdmi(new TV());
        computer.setVga(adapter);
        computer.print("Test");

    }
}
