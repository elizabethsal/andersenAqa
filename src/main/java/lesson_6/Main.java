package lesson_6;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"K", "h", "tr", ";"}, {"p", "L", "I", ")"},
                {"f", "q", "e", "*"}, {"Q", "R", "T", "+"}};
        try {
            try {
                int res = approach(arr);
                System.out.println(res);
            } catch (MyArraySizeException e) {
                System.out.println("Array size is exceeded");

            }
        } catch (MyArrayDataException e) {
            System.out.println("Invalid value");
            System.out.println("Invalid value in: " + e.i + e.j);

        } finally {
            System.out.println("Everything is all right");
        }
    }


    public static int approach(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
