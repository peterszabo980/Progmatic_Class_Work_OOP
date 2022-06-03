package hu.progmatic.OOP_20220428.Lesson_02_declaration;

public class Main {
    public static void main(String[] args) {
        Declaration[] declaration = {
                new Declaration("SZJA", 2020, 10000),
                new Declaration("SZJA", 2021, 20000),
                new Declaration("ÁFA", 2020, 100000),
                new Declaration("ÁFA", 2021, 200000),
                new Declaration("ÁFA", 2020, 500000)
        };

        // hány darav új bevallást adtunk be korrekciók nélkül?
        // egy bevallás akkor korrekció, ha létezik vele azonos korábbi bevallás

        int counter = 0;

        for (int i = 0; i < declaration.length; i++) {
            boolean correction = false;
            for (int j = 0; j < i; j++) {
                // meghívjuk a Declaration osztályban lévő equals() generált metódust
                if (declaration[j].equals(declaration[i])) {
                    correction = true;
                    break;
                }

            }
            if (!correction) {
                counter++;
            }
        }

        System.out.println("Új bevallások száma: " + counter);
    }
}
