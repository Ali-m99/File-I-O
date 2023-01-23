import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] names = {"John", "Carl", "Sam", "Mike", "Ali"};

        BufferedWriter writeFile = new BufferedWriter(new FileWriter("names.txt"));

        writeFile.write("Here are the list of names:" + "\n");

        for (int i = 0; i < names.length; i++) {
            writeFile.write(names[i] + "\n");
        }

        writeFile.close();

        BufferedReader readFile = new BufferedReader(new FileReader("names.txt"));

        String line;
        while ((line = readFile.readLine()) != null) {
            System.out.println(line);
        }

        readFile.close();
        
    }
}