package hu.progmatic.OOP_20220411;

public class Lesson_20220411_01_min_max {
    public static void main(String[] args) {
        String[] from = {"Föld", "Föld", "Hold"};
        String[] to = {"Hold", "Mars", "Z123"};
        int[] time = {100, 350, 2500};
        int[] price = {1000, 3500, 21000};

        //legolcsóbb utazás adatai
        int minPrice = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        // legdrágább utazás adatai
        int maxPrice = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < from.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < from.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
                maxIndex = i;
            }
        }

        System.out.println("A legolcsóbb utazás adatai.");
        System.out.println("Indulás: " + from[minIndex]);
        System.out.println("Cél: " + to[minIndex]);
        System.out.println("Hossz: " + time[minIndex]);
        System.out.println("Ár: " + price[minIndex]);
        System.out.println();
        System.out.println("A legdrágább utazás adatai.");
        System.out.println("Indulás: " + from[maxIndex]);
        System.out.println("Cél: " + to[maxIndex]);
        System.out.println("Hossz: " + time[maxIndex]);
        System.out.println("Ár: " + price[maxIndex]);

    }
}
