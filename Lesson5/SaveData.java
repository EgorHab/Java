package JavaCore.Lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveData {
    private String[] header = {"Value 1", "Value 2", "Value 3"};
    private int[] data = {100, 200, 123,};

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public SaveData() {

    }

    public void writeFile() {
        try (FileWriter fileWriter = new FileWriter("example.csv", true)) {
            int j;
            new FileWriter("example.csv", false);

            for (j = 0; j < header.length; j++) {
                fileWriter.append(String.valueOf(header[j]));

                if (j != header.length - 1) {
                    fileWriter.write("; ");
                }
                if (j == header.length - 1) {
                    fileWriter.write("\n");
                }


            }


            for (int i = 0; i < data.length; i++) {
                fileWriter.append(String.valueOf(data[i]));
                if (i != data.length - 1) {
                    fileWriter.write("; ");
                }

            }
            fileWriter.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void readFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }







}
