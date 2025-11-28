package com.example.kuhasz;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;
    private static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("tiramisu", "ciasta","Jajecka, kakałko, ekspresso, mascarpone" , "pyszne", R.drawable.tiramisu));
        przepisy.add(new Przepis("wuzetka", "ciasta","kakałko, jajecka, krym pyszny, chęci" , "wow, das schmeckt gut", R.drawable.wuzetka));
        przepisy.add(new Przepis("pomidorowy soczek", "napoje","Pomidorki, słoik" , "Ich finde der Saft lecker", R.drawable.pomidorowySok));
        przepisy.add(new Przepis("Burgjer", "desery","😍👍😘💕❤️" , "das ist so gut", R.drawable.burger));
    }
    public static ArrayList<Przepis> zwrocPrzepisy(){
        return przepisy;
    }
}
