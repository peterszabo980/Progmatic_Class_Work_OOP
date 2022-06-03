package hu.progmatic.OOP_20220425.club_01_practice;

public class SilverClubcard {
    Person owner;
    private String expiration;
    private int admissions;
    private int totalPrice = 5000 + admissions * 500;

    public SilverClubcard(Person owner, String expiration, int admissions) {
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
        return admissions * 500 + 5000;
    }

    @Override
    public String toString() {
        return "SilverClubcard{" +
                "owner=" + owner +
                ", expiration='" + expiration + '\'' +
                ", admissions=" + admissions + '\'' +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
