package builderEntities;

public class Company {
    private String name;
    private String sector;

    public Company(String name, String sector) {
        this.name = name;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
