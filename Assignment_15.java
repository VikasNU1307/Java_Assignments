import java.io.*;

// Main class Assignment_15 for Java I/O operations
public class Assignment_15 {

    public static void main(String[] args) {
        String fileName = "test.txt"; // File name for testing

        // Question 1: Read text from .txt file using InputStream
        readTextUsingInputStream(fileName);

        // Question 2: Write text to .txt file using OutputStream
        writeTextUsingOutputStream(fileName, "Hello, this is OutputStream text.");

        // Question 3: Read text from .txt file using BufferedInputStream
        readTextUsingBufferedInputStream(fileName);

        // Question 4: Write text to .txt file using BufferedOutputStream
        writeTextUsingBufferedOutputStream(fileName, "Hello, this is BufferedOutputStream text.");

        // Question 5: Read text from .txt file using FileReader
        readTextUsingFileReader(fileName);

        // Question 6: Write text to .txt file using FileWriter
        writeTextUsingFileWriter(fileName, "Hello, this is FileWriter text.");

        // Question 7: Read text from .txt file using BufferedReader
        readTextUsingBufferedReader(fileName);

        // Question 8: Write text to .txt file using BufferedWriter
        writeTextUsingBufferedWriter(fileName, "Hello, this is BufferedWriter text.");

        // Question 9: Read data from properties file
        readDataFromPropertiesFile("config.properties");

        // Question 10: Read data from Excel (example code, requires Apache POI library)
        // readDataFromExcel("data.xlsx");

        // Question 11: Write data to Excel (example code, requires Apache POI library)
        // writeDataToExcel("data.xlsx");
    }

    // Helper methods for each question

    // Question 1: Read text from .txt file using InputStream
    static void readTextUsingInputStream(String fileName) {
        try (InputStream inputStream = new FileInputStream(fileName)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 2: Write text to .txt file using OutputStream
    static void writeTextUsingOutputStream(String fileName, String text) {
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            System.out.println("Question 2: Text written using OutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 3: Read text from .txt file using BufferedInputStream
    static void readTextUsingBufferedInputStream(String fileName) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 4: Write text to .txt file using BufferedOutputStream
    static void writeTextUsingBufferedOutputStream(String fileName, String text) {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            byte[] bytes = text.getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("Question 4: Text written using BufferedOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 5: Read text from .txt file using FileReader
    static void readTextUsingFileReader(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 6: Write text to .txt file using FileWriter
    static void writeTextUsingFileWriter(String fileName, String text) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
            System.out.println("Question 6: Text written using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 7: Read text from .txt file using BufferedReader
    static void readTextUsingBufferedReader(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 8: Write text to .txt file using BufferedWriter
    static void writeTextUsingBufferedWriter(String fileName, String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(text);
            System.out.println("Question 8: Text written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 9: Read data from properties file
    static void readDataFromPropertiesFile(String fileName) {
        try (InputStream inputStream = new FileInputStream(fileName)) {
            java.util.Properties prop = new java.util.Properties();
            prop.load(inputStream);

            System.out.println("Question 9: Reading properties file:");
            System.out.println("Property Key: value");
            prop.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Question 10: Read data from Excel (requires Apache POI library)
    /*
    static void readDataFromExcel(String fileName) {
        // Example code using Apache POI library to read Excel files
    }
    */

    // Question 11: Write data to Excel (requires Apache POI library)
    /*
    static void writeDataToExcel(String fileName) {
        // Example code using Apache POI library to write to Excel files
    }
    */
}
