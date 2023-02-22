import builderEntities.Company;
import builderEntities.Employee;
import builderEntities.Employee.EmployeeBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = directBuild(Employee.getBuilder());
        System.out.println(employee);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static Employee directBuild(EmployeeBuilder builder) {
        return builder.withName("Tommaso")
                .withLastName("Giovannelli")
                .withAge(25)
                .withAddress("Barcelona-Carrer de Joaquin Costa-56-08001")
                .withCompany(new Company("Bitrock", "IT consulting"))
                .withSkills(Arrays.asList("Java","Spring Boot","SQL"))
                .build();
    }

}
