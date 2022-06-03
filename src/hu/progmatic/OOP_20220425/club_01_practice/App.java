package hu.progmatic.OOP_20220425.club_01_practice;

public class App {
    public static void main(String[] args) {

        Person member1 = new Person("001", "Lili", 28);
        Person member2 = new Person("002","Petra", 34);
        Person member3 = new Person("003", "Peti", 42);
        BronzeClubcard bc = new BronzeClubcard(member1, "2022.06.25.", 30);
        SilverClubcard sc = new SilverClubcard(member2, "2022.07.15.", 41);
        GoldClubcard gd = new GoldClubcard(member3, "2022.05.25.", 13);

        System.out.println(bc);
        System.out.println(sc);
        System.out.println(gd);

    }
}
