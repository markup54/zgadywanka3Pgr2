package com.klasa3P;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wylosowana = (int) (Math.random() * 100 + 1);
        System.out.println(wylosowana);
        Scanner klawiatura = new Scanner(System.in);
        //zgadywanie 10 razy
        int wpisana;
        int licznik=0;
        boolean czyZgadniete =false;
        for(int i = 0 ;i<10;i++){
            licznik++;
            System.out.println("podaj liczbę");
            wpisana = klawiatura.nextInt();
            if (wpisana == wylosowana) {
                System.out.println("Gratulacje");
                czyZgadniete =true;
                break;
            }
            else{
                if (wpisana>wylosowana){
                    System.out.println("Wpisałeś za dużo");
                }
                else{
                    System.out.println("wpisałeś za mało");
                }
            }
        }
        if(!czyZgadniete){
            System.out.println("słabiutko użyj algorytmu wyszukiwania binarnego");
        }
    }
}
