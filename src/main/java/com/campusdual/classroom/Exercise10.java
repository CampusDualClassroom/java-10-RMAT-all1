package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {



    public static void main(String[] args) {
        int blueCount = 0; //contador
        do {
            String color = getBall(); //Obtener color
            System.out.println(" La bola es de color: " + color); //Imprimir color
            if (color.equals("azul")) {
                blueCount++; //suma si es azul
            }
        } while (blueCount < 2); //repetir hasta 2 azules

    }

    public static String getBall() {
        int randomNum = randomWithRange(1, 4);
        String color;
        switch (randomNum) {
            case 1:
                color = "rojo";
                break;
            case 2:
                color = "azul";
                break;
            case 3:
                color = "verde";
                break;
            default:
                color = "desconocido";
                break;

        }
        return color;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}