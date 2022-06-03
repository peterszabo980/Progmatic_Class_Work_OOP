package hu.progmatic.OOP_20220425.club_03_inheritance;
// ez lesz az Ősosztály
public class Clubcard {
    private Person owner;
    private String expiration;
    private int admissions;

    public Clubcard() {

    }

    public Clubcard(Person owner, String expiration, int admissions) {
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
        return 0 ;
    }

    public String getCardType() {
        return null;
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

