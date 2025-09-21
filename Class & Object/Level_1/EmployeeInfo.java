class EmployeeInfo {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo();
        e.id = 101;
        e.name = "Aditya";
        e.salary = 50000;
        e.display();
    }
}