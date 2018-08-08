package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        Persoon p = new Persoon();
        System.out.println("Geef je naam op");
        p.setNaam(invoer.nextLine());
        System.out.println("Geef je geboortejaar");
        int geboorteJaar = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef je geboortemaand");
        int geboorteMaand = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef je geboortedag");
        int geboorteDag = Integer.parseInt(invoer.nextLine());
        p.setGeboorteDatum(geboorteDag, geboorteMaand, geboorteJaar);
        System.out.printf(" Dag %s, je leeftijd is %d",p.getNaam(), p.getLeeftijd());




	// write your code here
    }
}
