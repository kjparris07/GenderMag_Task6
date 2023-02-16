import java.io.File;
import java.io.FileWriter;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1 instanceof Person);
		
		Person p2 = new Student();
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);
		
		Person p3 = new Student("Jane", "Doe", 25);
		Person p4 = new Student("John", "Doe", 27, 7654321, false, 2023);
		
		System.out.println(p3 + "\n" + p4);

        try {
            File file = new File("testFile.txt");
            FileWriter writer = new FileWriter("testFile.txt");
            writer.write(p4.toString());
            writer.close();
        } catch (Exception e) {
            System.out.println("oops.");
        }
	}
}