package hu.progmatic.OOP_20220425.club_03_inheritance;

public class App {
    public static void main(String[] args) {

        Person member1 = new Person("001", "Lili", 28);
        Person member2 = new Person("002","Petra", 34);
        Person member3 = new Person("003", "Peti", 33);
        Clubcard[] clubcards = {
               new BronzeClubcard(member1, "2250.01.01.", 35),
               new SilverClubcard(member2, "2250.01.01.", 35),
               new GoldClubcard(member3, "2250.01.01.", 35),
        };

        int total = 0;

        // itt nem tudom lekérdezni pl.: hogy valaki VIP (GoldClub-nál van ilyen), mert az csak ott található
        for (Clubcard clubcard : clubcards) {
            System.out.println(clubcard);
            total += clubcard.getTotalPrice();
        }
        System.out.println(total);

       /* Clubcard clubcard = new GoldClubcard(member3, "2251.01.01.", 26);
        // kasztolás
        GoldClubcard goldClubcard = (GoldClubcard) clubcard;
        */

    }
}
