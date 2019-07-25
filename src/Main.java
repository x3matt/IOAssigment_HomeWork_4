import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		List<Person> persons = Arrays.asList(new Person("Ivan", "Ivanov", 18),new Person("Piotr","Andreew", 20));
		printPersons(persons,"file.csv");
	}
	public static void printPersons(List<Person> persons,String fileName) throws Exception{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
	    persons.stream().forEach(a -> pw.println(printPerson(a)));
	    pw.flush();
	    pw.close();
	}
	public static String printPerson(Person person) {
		return person.getFirstName()+","+person.getLastName()+","+person.getAge();
	}
}
