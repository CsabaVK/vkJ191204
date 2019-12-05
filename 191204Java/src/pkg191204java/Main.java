/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg191204java;

import java.util.Scanner;

/**
 *
 * @author csabavk
 */
class Osztaly
{
    public int kamat;
    public int felvettOsszeg;
    public int evekSzama;
    public double kezelesiKoltseg = 0.05;

    public Osztaly(int kamat, int felvettOsszeg, int evekSzama, int kezelesiKoltseg) {
        this.kamat = kamat;
        this.felvettOsszeg = felvettOsszeg;
        this.evekSzama = evekSzama;
        this.kezelesiKoltseg = kezelesiKoltseg;
    }
    public double visszafizetendo()
    {
        return felvettOsszeg + (felvettOsszeg * kamat) + (felvettOsszeg * kezelesiKoltseg);
    }
    public double haviTorleszto()
    {
        return visszafizetendo() / (evekSzama * 12);
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner be = new Scanner(System.in);
        
        System.out.println("Kérem a kamatot");
        int kamat = be.nextInt();
        System.out.println("Kérem a felvett összeget");
        int felve = be.nextInt();
        System.out.println("Kérem az évek számát!");
        int evekSzama = be.nextInt();
        
        Osztaly o = new Osztaly(kamat, felve, evekSzama, evekSzama)
        {
            o.visszafizetendo();
        }
        
        System.out.println(visszafizetendo() + haviTorleszto());
    }
    
}
