package com.klasa3P;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int wylosowana = (int) (Math.random() * 100 + 1);
        Scanner klawiatura = new Scanner(System.in);
        //zgadywanie do momentu zgadnięcia
        int wpisana;
        int licznik=1;
        boolean czyZgadniete =false;
        System.out.println("podaj liczbę");
        wpisana = klawiatura.nextInt();
       while(wpisana != wylosowana){
            licznik++;

            if (wpisana>wylosowana){
                System.out.println("Wpisałeś za dużo");
                }
            else{
                System.out.println("wpisałeś za mało");
            }
           System.out.println("podaj liczbę");
           wpisana = klawiatura.nextInt();

        }
       System.out.println("gratulacje się udało zgadłeś za"+licznik+"razem");
    }
}
