package com.company;

public class Baterai {
    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n" +
                "akan berbanding lurus dengan beda ptensial\n" +
                "pada ujung-ujung kawat penghantar tersebut\n" +
                "asalkan suhu kawat dijaga konstan");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
