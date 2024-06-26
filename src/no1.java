import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka akhir perulangan yang diinginkan : ");
        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++){
                if (i % 3 == 0 && i % 4 == 0){
                    System.out.print("OKYES ");
                } else if (i % 3 == 0) {
                    System.out.print("YES ");
                } else if (i % 4 == 0) {
                    System.out.print("OK ");
                }else{
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Input harus berupa angka bulat");
        }
    }
}