package hu.progmatic.OOP_20220511;

import java.util.ArrayList;
import java.util.Locale;

public class List {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Dezideráta");
        firstName.add("Jukundusz");
        firstName.add("Pompónia");
        firstName.add("Szemirámisz");
        firstName.add("Tonuzóba");
        firstName.add("Zseraldina");

        String[] namesToAdd = {"Ajna", "Arlen", "Buzád", "Csinszka", "Dorián", "Dusán", "Hágár", "Hümér", "Katapán", "Kocsárd", "Manó", "Muriel", "Oberon", "Patony", "Samu", "Soma", "Szidónia", "Tádé", "Zerind"};

       /*
       //így is hozzá lehet adni a listához tömb elemeket
       for (int i = 0; i < namesToAdd.length; i++) {
            firstName.add(namesToAdd[i]);
        }
        */

        // így is hozzá lehet adni a listához tömb elemeket
        /*for (String name : namesToAdd) {
            firstName.add(name);
        }*/

        for (String name : namesToAdd) {
            firstName.add(name);
        }

        System.out.println(firstName);

        addNames(firstName, namesToAdd);

        addNames(firstName, "Ajna", "Arlen", "Buzád", "Csinszka", "Dorián", "Dusán", "Hágár", "Hümér",
                "Katapán", "Kocsárd", "Manó", "Muriel", "Oberon", "Patony", "Samu", "Soma", "Szidónia", "Tádé", "Zerind");

        addNames(firstName, "Peti");

        System.out.println(search(firstName, "Muriel"));

        // primitív adattípusból (pl.: int)  nem tudunk listát létre hozni
        // wrapped classes - primitív adattípusokból objektum adattípusok
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Boolean> booleans = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();
        addNumbers(numbers, 1, 100);

        System.out.println(numbers);



    }

    public static void addOneName(ArrayList<String> firstName, String newName) {
        /* Ez is egy jó megoldás!
        if (firstName.contains(newName)) {
            System.out.println("A név már szerepel a listában.");
        } else {
            firstName.add(newName);
        }*/

        // vagy ez is, hogy nem törénik semmi, ha szerepel, csak akkor ír, ha nem szerepel benne új név
        if (!firstName.contains(newName)) {
            firstName.add(newName);
        }
    }

    // VARARGS-os megoldás
    public static void addNames(ArrayList<String> names, String... newNames) {
        for (String newName : newNames) {
            if (!names.contains(newName)) {
                names.add(newName);
            }
        }
    }

    public static void addNames2(ArrayList<String> names, String... newNames) {
        for (String newName : newNames) {
            if (!names.contains(newName)) {
                names.add(newName);
            }
        }
    }

    // adott név keresése a listában és vissza adni az index számot
    public static int search(ArrayList<String> names, String name) {
       /* for (int i = 0; i < names.size(); i++) {
            //String nameFromList = names.get(i); // ha a tömb names[i]
            if (names.get(i).equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;*/

    // vagy csak egy sor
    return names.indexOf(name);
    }

    public static ArrayList<String> findNamesContain(ArrayList<String> names, String searchFor) {
        // 61237, 765, 981887, 123, 321, 12, 12330, 123123

        int x = 1230;
        int y = 1123;
        // x == 123;
        // x / 10 == 123;

        String xString = "" + x; // az x számból szöveget csináltam
        xString.contains("123"); // igazat fog vissza adni, mert az 123 szerepel az x-nek megadott számban

        String yString = String.valueOf(y);
        yString.contains("123"); // igazat fog vissza adni, mert az 123 szerepel a y-nak megadott számban


        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.toLowerCase().contains(searchFor.toLowerCase())) {
                result.add(name);
            }
        }
        return result;
    }

        public static void addNumbers( ArrayList<Integer> numbers, int from, int to ) {
            for (int i = from; i <= to; i++) {
                numbers.add(i);
            }
            if (from <= to) {
                numbers.add(to);
            }

        }


}
