package hu.progmatic.OOP_20220428.Lesson_04_employees.App;

import hu.progmatic.OOP_20220428.Lesson_04_employees.Employee;
import hu.progmatic.OOP_20220428.Lesson_04_employees.Report;
import hu.progmatic.OOP_20220428.Lesson_04_employees.ReportMenSalarySum;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("001", "Józsi", 25, false, 4600000),
                new Employee("002", "Pista", 55, false, 5600000),
                new Employee("003", "Alma", 35, true, 7600000),
                new Employee("003", "Mária", 19, true, 2650000)
        };

        Report[] reports = {
            new ReportMenSalarySum()
        };

        for (Report report : reports) {
            // minden riportnál feldolgozzuk az összes alkalmazottat
            for (Employee employee : employees) {
                report.process(employee);
            }

            System.out.println(report);
        }
    }
}
