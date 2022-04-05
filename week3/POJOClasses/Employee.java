package week3.POJOClasses;

public class Employee {
    private Integer empID;
    private String name;
    private EmpPosition empPosition;
    private String arrivalDate;
    private String departureDate;

    public Employee(Integer empID, String name, EmpPosition empPosition, String arrivalDate, String departureDate) {
        this.empID = empID;
        this.name = name;
        this.empPosition = empPosition;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public Employee() {
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpPosition getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(EmpPosition empPosition) {
        this.empPosition = empPosition;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
