package com.example.standard;

import com.example.standard.IVGA;

public class VideoProj implements IVGA {
    @Override
    public void print(String data) {
        System.out.println("================= Video Projecteur ======================");
        System.out.println(data);
        System.out.println("================== /Video Projecteur ====================== ");
    }
}
