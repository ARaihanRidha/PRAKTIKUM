import java.util.Scanner;
public class PRAK102_2210817110001_AkhmadRaihanRidha {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Angka awal deret : ");
        int barisAngka=scanner.nextInt();
        int i=0;
        int deretAngka=0;
        while (i<11) {
            if (barisAngka % 5 == 0){
                deretAngka = barisAngka / 5 - 1;
            }
            else {
                deretAngka = barisAngka;
            }
            i++;
            barisAngka++;
            System.out.print(deretAngka);
            if (i <12-1) {
                System.out.print(",");
            }
        }
    }
}
