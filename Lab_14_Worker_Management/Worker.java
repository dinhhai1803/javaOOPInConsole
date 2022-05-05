public class Worker {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String location;

    public Worker(){

    }

    public Worker(int id, String name, int age, int salary, String location){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public int getId() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "W " + this.id + "\t" + this.name + "\t" + this.age + "\t" + this.salary + "\t";
    }
    
}
