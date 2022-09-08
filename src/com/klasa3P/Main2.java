package com.klasa3P;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("witaj w Javie");
        //program typu zgadnij liczbę
        int wylosowana = (int) (Math.random() * 100 + 1);
        //random() zakres <0,1)
        //wylosowana z zakresu 1,100
        double inna = wylosowana;
        //typy proste float,double,boolean,char, byte,short,int,long
        System.out.println(wylosowana);
        Scanner klawiatura = new Scanner(System.in);
        int wpisana = klawiatura.nextInt();
        System.out.println("podaj liczbę");
        System.out.println(wpisana);
        if (wpisana == wylosowana) {
            System.out.println("Gratulacje");
        } else {
            int roznica = wpisana > wylosowana ? wpisana - wylosowana : wylosowana - wpisana;
            // wyrazenie ? jezeli prawda : jeżeli fałsz
            //wyrazenie zwraca wartość
            //instrukcja nie zwraca wartosci
            //roznica /=10;
            roznica =roznica/10; //dzielenie całkowite
            switch (roznica){
                case 0:
                    System.out.println("było blisko");
                    break;
                case 1:
                    System.out.println("całkiem nieźle");
                    break;
                case 2:
                    System.out.println("trochę brakowało");
                    break;
                default:
                    System.out.println("Spróbuj szczęścia gdzieś indziej");
            }
            System.out.println(
                    switch (roznica){
                        case 0 ->"Było blisko";
                        case 1-> "całkiem nieźle";
                        case 2 -> "trochę brakowało";
                        default -> "Spróbuj innych gier";
                    }
            );
            System.out.println("nie trafione");
        }
    }
}
