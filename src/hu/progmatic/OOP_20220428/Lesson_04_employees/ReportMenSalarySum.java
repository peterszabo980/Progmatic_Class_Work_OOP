package hu.progmatic.OOP_20220428.Lesson_04_employees;

public class ReportMenSalarySum extends Report {
    @Override
    public String getName() {
        return "ReportMenSalarySum";
    }

    @Override
    protected boolean test(Employee employee) {
        return !employee.isFemale();
    }

    @Override
    protected int aggregate(int count, int total, Employee employee) {
        return total + employee.getSalaty();
    }
}
