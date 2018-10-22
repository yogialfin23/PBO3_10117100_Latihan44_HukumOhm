package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
	Baterai bat = new Baterai();
	Baterai bat1 = new Baterai(3,12);
        System.out.println();
        System.out.println("Kuat Arus : " +bat1.getKuatArus());
        System.out.println("Hambatan  : " +bat1.getHambatan());
        System.out.println("Hasil Tegangan : " +bat1.hitungTegangan());

    }
}
