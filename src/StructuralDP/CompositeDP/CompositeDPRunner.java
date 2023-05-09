package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeDPRunner {

    public static void main(String[] args) {

        compositeDemo();

    }

    public static void compositeDemo(){

        // child departmanlarimi olusturuyorum
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department argeDepartment = new Arge();
        // GenelDepartman objemin constructor ina child departmanlarimi veriyorum
        Department regionalDepartment = new RegionalDepartment(
                Arrays.asList(financeDepartment,salesDepartment,argeDepartment));

        System.out.println(regionalDepartment.getName()); // Finance, Sales, Arge
        System.out.println("--------------------------");
        System.out.println(regionalDepartment.getEmployees()); // [F1, F2, F3, S1, S2, S3, A1, A2]

    }

}
