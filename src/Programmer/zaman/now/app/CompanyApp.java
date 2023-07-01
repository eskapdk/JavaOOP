package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Eska Enterprise");

        Company.Employee employee = company.new Employee();
        employee.setName("Eska");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Boyolali Enterprise");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Bayu");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
        
    }
}
