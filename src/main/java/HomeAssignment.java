
public class HomeAssignment {
    public static void main(String[] args) {

        System.out.println("Сумма лежит в пределе от 10 до 20:  " + integerTwo(8, 79));
        System.out.println(negativeVar(-5));
        System.out.println(positive(-5));
        lineConsole("Let's go!", 5);
        replace();
        arrayHundred();
        arraySix();
        dimensionalArr();
        year(2022);


    }


    static boolean integerTwo(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    static String negativeVar(int n) {
        if (n >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }

    }

    static boolean positive(int v) {
        return (v >= 0);
    }

    static void lineConsole(String str, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + " " + str);
        }
    }

    static void replace() {
        int[] arr = {1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);

        }

    }

    static void arrayHundred() {
        int[] arrH = new int[100];
        for (int i = 0; i < arrH.length; i++) {
            arrH[i] = i + 1;
            System.out.println(arrH[i]);
        }
    }

    static void arraySix() {
        int[] arrSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrSix.length; i++) {
            if (arrSix[i] < 6) {
                arrSix[i] *= 2;
            }
            System.out.println(arrSix[i]);
        }
    }

    static void dimensionalArr() {
        int[][] arrD = new int[3][3];

        for (int i = 0; i < arrD.length; i++) {

            arrD[arrD.length - i - 1][i] = 1;
            System.out.println(arrD[i][i]);

        }
    }


    static boolean year(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
}


//*

//***






