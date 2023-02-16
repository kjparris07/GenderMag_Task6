public class Student extends Person {
    private int id;
    private boolean isCommuter;
    private int gradYear;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.isCommuter = true;
        this.gradYear = 2027;
    }

    public Student(String firstName, String lastName, int age, int id, 
        boolean isCommuter, int gradYear) {
        super(firstName, lastName, age);
        this.id = id;
        this.isCommuter = isCommuter;
        this.gradYear = gradYear; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsCommuter() {
        return isCommuter;
    }

    public void setIsCommuter(boolean isCommuter) {
        this.isCommuter = isCommuter;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String toString() {
        return String.format("Student{firstName:%s, lastName:%s, age:%d, id:%d, isCommuter:%b, gradYear:%d}",
        		getFirstName(), getLastName(), getAge(), getId(), getIsCommuter(), getGradYear());
    }
    
    public static void main(String[] args) {
    	Person jane = new Student("Jane", "Doe", 21, 1234567, true, 2023);
    	System.out.println(jane);
    }
}
