package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private float salary;


    public Employee(String name, int niNumber, float salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }



    public void raiseSalary(double increment){
        this.salary += increment;

    }

    public float payBonus(){
        return salary / 100;
    }
}
