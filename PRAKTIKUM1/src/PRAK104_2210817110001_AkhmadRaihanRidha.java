import java.util.Scanner;
public class PRAK104_2210817110001_AkhmadRaihanRidha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abu1 = scanner.next().toUpperCase();
        String abu2 = scanner.next().toUpperCase();
        String abu3 = scanner.next().toUpperCase();
        System.out.print("Tangan Bagas: ");
        String Bagas1 = scanner.next().toUpperCase();
        String Bagas2 = scanner.next().toUpperCase();
        String Bagas3 = scanner.next().toUpperCase();
        int poinAbu = 0;
        int poinBagas = 0;
        if (abu1.equals("B") && Bagas1.equals("G") ||
                abu1.equals("G") && Bagas1.equals("K") ||
                abu1.equals("K") && Bagas1.equals("B")) {
            poinAbu++;
        } else if (Bagas1.equals("B") && abu1.equals("G") ||
                Bagas1.equals("G") && abu1.equals("K") ||
                Bagas1.equals("K") && abu1.equals("B")) {
            poinBagas++;
        }
        if (abu2.equals("B") && Bagas2.equals("G") ||
                abu2.equals("G") && Bagas2.equals("K") ||
                abu2.equals("K") && Bagas2.equals("B")) {
            poinAbu++;
        } else if (Bagas2.equals("B") && abu2.equals("G") ||
                Bagas2.equals("G") && abu2.equals("K") ||
                Bagas2.equals("K") && abu2.equals("B")) {
            poinBagas++;
        }
        if (abu3.equals("B") && Bagas3.equals("G") ||
                abu3.equals("G") && Bagas3.equals("K") ||
                abu3.equals("K") && Bagas3.equals("B")) {
            poinAbu++;
        } else if (Bagas3.equals("B") && abu3.equals("G") ||
                Bagas3.equals("G") && abu3.equals("K") ||
                Bagas3.equals("K") && abu3.equals("B")) {
            poinBagas++;
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        scanner.close();
    }
}