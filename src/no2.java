import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println("Algoritma Bagian A:");
            System.out.println(algoritmaBagianA(n));
            System.out.println("Algoritma Bagian B:");
            System.out.println(algoritmaBagianB(n));
            System.out.println("Algoritma Bagian C:");
            System.out.println(algoritmaBagianC(n));
            System.out.println("Algoritma Bagian D:");
            System.out.println(algoritmaBagianD(n));
        }else{
            System.out.println("Input harus dalam bentuk angka bulat");
        }
    }

    public static String algoritmaBagianA(int n) {
        StringBuilder container = new StringBuilder();
        boolean flag = true;

        for (int i = 1; i <= n; i++) {
            container.append(i);
            int cekking = i;
            flag = true;

            while (flag) {
                if (cekking - 1 == 0) {
                    flag = false;
                    container.append("\n");
                } else {
                    container.append(i);
                    cekking--;
                }
            }
        }
        return container.toString();
    }

    public static String algoritmaBagianB(int n) {
        StringBuilder container = new StringBuilder();
        boolean flag = true;

        for (int i = 1; i <= n; i++) {
            container.append(i);
            int cekking = i;
            flag = true;

            while (flag) {
                if (cekking - 1 == 0) {
                    flag = false;
                    container.append("\n");
                } else {
                    container.append(cekking - 1);
                    cekking--;
                }
            }
        }
        return container.toString();
    }

    public static String algoritmaBagianC(int n) {
        StringBuilder container = new StringBuilder();
        int cekking = 1;
        boolean flag = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                container.append(cekking);

                if (cekking == n) {
                    cekking--;
                    flag = false;
                } else if (cekking == 1 && !flag) {
                    cekking++;
                    flag = true;
                } else if (!flag) {
                    cekking--;
                } else {
                    cekking++;
                }

                if (j == i) {
                    container.append("\n");
                    break;
                }
            }
        }
        return container.toString();
    }

    public static String algoritmaBagianD(int n) {
        int[][] matrix = new int[n][n];
        int value = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = value++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrix[j][i] = value++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString().trim();
    }
}
