import java.util.Scanner;
public class PRAK103_2210817110001_AkhmadRaihanRidha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int jumlahDeret = scanner.nextInt();
        int bilanganPertama = scanner.nextInt();
        int bilanganSekarang = bilanganPertama;
        int i = 0;
        do {
            if (bilanganSekarang % 2 != 0) {
                System.out.print(bilanganSekarang);
                if (i < jumlahDeret -1) {
                    System.out.print(",");
                }
                i++;
            }
            bilanganSekarang++;
        } while (i < jumlahDeret);
        scanner.close();
    }
}
