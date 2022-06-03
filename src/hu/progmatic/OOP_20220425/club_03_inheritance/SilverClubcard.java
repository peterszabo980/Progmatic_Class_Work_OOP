package hu.progmatic.OOP_20220425.club_03_inheritance;

public class SilverClubcard extends Clubcard {
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
