package com.klasa3P;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wylosowana = (int) (Math.random() * 100 + 1);
        Scanner klawiatura = new Scanner(System.in);
        //zgadywanie do momentu zgadnięcia
        int wpisana;
        int licznik=0;
        boolean czyZgadniete =false;

        //DRY
        do
       {
            licznik++;
           System.out.println("podaj liczbę");
           wpisana = klawiatura.nextInt();
            if (wpisana>wylosowana){
                System.out.println("Wpisałeś za dużo");
                }
            else{
                System.out.println("wpisałeś za mało");
            }
        }while(wpisana != wylosowana);
       System.out.println("gratulacje się udało zgadłeś za"+licznik+"razem");
    }
}
