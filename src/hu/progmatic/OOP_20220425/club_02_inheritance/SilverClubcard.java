package hu.progmatic.OOP_20220425.club_02_inheritance;

public class SilverClubcard extends BronzeClubcard {
    public SilverClubcard() {
        super();
    }

    public SilverClubcard(Person owner, String expiration, int admissions) {
        super(owner, expiration, admissions );
    }

    @Override
     public int getTotalPrice() {
         return getAdmissions() * 500 + 5000;
     }

     @Override
     public String getCardType() {
        return "Silver";
    }
}
