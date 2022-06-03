package hu.progmatic.OOP_20220428.Lesson_04_employees;

public class Report {
    private int count;
    private int total;

    // final: az jelenti, hogy öröklődés során nem lehet megváltoztatni az implementációt
    // @Override nem működik
    public final void process(Employee employee) {
        // ha az adott alkalmazott bele tartozik a statisztikában,
        // akkor frissítsük az elemszámot és az új eredményt
        if (test(employee)) {
            total = aggregate(count, total, employee); // ezzel update-eljük
            count++;
        }
    }

    public String getName() {
        return null;
    }

    public final int getCount() {
        return count;
    }

    public final int getTotal() {
        return total;
    }

    @Override
    public final String toString() {
        return "Report{" +
                "name=" + getName() +
                "count=" + count +
                ", total=" + total +
                '}';
    }

    // Beletartozik-e az adott alkalmazott ebbe a statisztikába?
    protected boolean test(Employee employee) {
        return false;
    }

    // új total érték kiszámítása az éppen feldolgozott alkalmazott alapján
    protected int aggregate(int count, int total, Employee employee) {
        return total;
    }
}
