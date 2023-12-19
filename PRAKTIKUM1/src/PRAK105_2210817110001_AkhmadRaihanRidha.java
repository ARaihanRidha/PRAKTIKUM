import java.util.Scanner;
public class PRAK105_2210817110001_AkhmadRaihanRidha {
    public static final double phi= 3.14;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        float jari_jari=scanner.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        float tinggi=scanner.nextFloat();
        double volumeTabung=phi*(jari_jari*jari_jari)*tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jari_jari, tinggi, volumeTabung);
    }
}
