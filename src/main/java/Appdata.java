import java.io.*;

public class Appdata {
    private static String[] header;
    private static int[][] data;

    public static void main(String[] args) {
        header = new String[]{"Value1", "Value2", "Value3"};
        data = new int[][]{{123, 12, 54}, {89, 87, 73}};


        saveRecord(header, data);
        readFromFile();

    }

    public static void saveRecord(String[] header, int[][] data) {
        String[] arr = new String[data.length + 1];
        String headers = "";

        for (int c = 0; c < header.length; c++) {
            headers += header[c];
            if (c != header.length - 1) {
                headers += ";";
            }
        }
        arr[0] = headers;

        for (int i = 0; i < data.length; i++) {
            int[] inner = data[i];
            String str = "";
            for (int j = 0; j < inner.length; j++) {
                str += inner[j];
                if (j != inner.length - 1) {
                    str += ";";
                }
            }
            arr[i + 1] = str;

        }
        try {
            writeToFile(arr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void writeToFile(String[] arr) throws IOException {
        FileWriter fileWriter = new FileWriter("array.csv");
        for (String str : arr) {
            fileWriter.write(str + System.lineSeparator());
        }
        fileWriter.close();
    }

    static void readFromFile() {
        try (BufferedReader fileReader
                     = new BufferedReader(new FileReader("array.csv"))) {
            String line = "";

            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
