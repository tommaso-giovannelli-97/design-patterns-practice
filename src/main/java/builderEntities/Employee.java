package builderEntities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String lastName;
    private Integer age;
    private Address address;
    private Company company;
    private List<Skill> skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Employee() {
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    //Builder
    public static class EmployeeBuilder {

        private String name;
        private String lastName;
        private Integer age;
        private Address address;
        private Company company;
        private List<Skill> skills;
        private Employee employee;

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder withAddress(String address) {

            //We suppose to pass the address as a single string
            // with the fields separated by "-"
            String[] addressFields = address.split("-");
            this.address = new Address(addressFields[0], addressFields[1]
                    , Integer.valueOf(addressFields[2]), addressFields[3]);

            return this;
        }

        public EmployeeBuilder withCompany(Company company) {
            this.company = company;
            return this;
        }

        public EmployeeBuilder withSkills(List<String> skills) {
            this.skills = new ArrayList<>();
            //We suppose to not specify the skill level, and so to
            // assign a default value of six
            skills.forEach(s -> this.skills.add(new Skill(s, 6)));
            return this;
        }


        public Employee build() {
            this.employee = new Employee();
            employee.setName(name);
            employee.setLastName(lastName);
            employee.setAge(age);
            employee.setAddress(address);
            employee.setCompany(company);
            employee.setSkills(skills);
            return this.employee;
        }

        public Employee getEmployee() {
            return this.employee;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", company=" + company +
                ", skills=" + skills +
                '}';
    }
}
