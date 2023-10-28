package Soal1;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class DaduMain {
    public static void main(String[] args) {
        Collection<Dadu> angkaDadu= new LinkedList<Dadu>();
        Dadu angka1= new Dadu(1);
        Dadu angka2= new Dadu(2);
        Dadu angka3= new Dadu(3);
        Dadu angka4= new Dadu(4);
        Dadu angka5= new Dadu(5);
        Dadu angka6= new Dadu(6);
        angkaDadu.add(angka1);
        angkaDadu.add(angka2);
        angkaDadu.add(angka3);
        angkaDadu.add(angka4);
        angkaDadu.add(angka5);
        angkaDadu.add(angka6);
        System.out.print("Masukkan Banyak Dadu : ");
        Scanner input= new Scanner(System.in);
        int jumlahDadu=input.nextInt();
        int valueAcak;
        int total=0;
        for (int i=0;i<jumlahDadu;i++){
            Random rand= new Random();
            int size=angkaDadu.size();
            int indeksAcak= rand.nextInt(size);
            Dadu daduAcak=((LinkedList<Dadu>)angkaDadu).get(indeksAcak);
            valueAcak = daduAcak.getAngkaDadu();
            total+=valueAcak;
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + valueAcak);
        }
        System.out.println("Total nilai dadu keseluruhan "+total);
    }
}
