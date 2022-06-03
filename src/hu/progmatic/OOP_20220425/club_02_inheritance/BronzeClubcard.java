package hu.progmatic.OOP_20220425.club_02_inheritance;

public class BronzeClubcard {
    private Person owner;
    private String expiration;
    private int admissions;

    public BronzeClubcard() {

    }

    public BronzeClubcard(Person owner, String expiration, int admissions) {
        this.owner = owner;
        this.expiration = expiration;
        this.admissions = admissions;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getAdmissions() {
        return admissions;
    }

    public void setAdmissions(int admissions) {
        this.admissions = admissions;
    }

    public int getTotalPrice() {
        return admissions * 1000;
    }

    public String getCardType() {
        return "Bronze";
    }

    @Override
    public String toString() {
        return "Clubcard{" +
                "owner=" + owner +
                ", expiration='" + expiration + '\'' +
                ", admissions=" + admissions + '\'' +
                ", totalPrice=" + getTotalPrice() + '\'' +
                ", cardType=" + getCardType() +
                '}';
    }
}
