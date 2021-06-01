package com.company;
public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
            names[0] = "Ahmed";
            names[1] = "Umar";
            names[2] = "Mahmud";

        for (String name : names
             ) {
            switch (name) {
                case "Ahmed":
                    System.out.println("С добрым утром " + names[0]);
                    break;
                case "Umar":
                    System.out.println("Доброго дня " + names[1]);
                    break;
                case "Mahmud":
                    System.out.println("Доброго вечера " + names[2]);
                    break;

            }
        }
        System.out.println("Здрастуйте " + names[0] + ", " + names[1] + " и " + names[2]);

    }
}
