import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class SumNumbersFromTextFile {
 
        public static void main(String[] args) throws IOException {
 
                try {
                        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
                        String nums;
                        int sum = 0;
                        while ((nums = reader.readLine()) != null) {
                                sum += Integer.parseInt(nums);
                        }
                        System.out.println(sum);
                        reader.close();
                } catch (java.io.FileNotFoundException nfe) {
                        System.out.println("Error");
                }
        }
}
