package hu.progmatic.OOP_20220425.club_03_inheritance;

public class GoldClubcard extends Clubcard {
    private boolean isVIP;

    public GoldClubcard() {
        super();
    }

    public GoldClubcard(Person owner, String expiration, int admissions) {
        super(owner, expiration, admissions );
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    @Override
    public int getTotalPrice() {
        return 25000;
    }

    @Override
    public String getCardType() {
        return "Gold";
    }
}
