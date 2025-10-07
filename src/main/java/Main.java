import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        String input;

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
