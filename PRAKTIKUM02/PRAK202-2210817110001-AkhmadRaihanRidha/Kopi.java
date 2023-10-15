public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String Pembeli;
    String Penjual;
    double pajak;
    public String setPembeli(String Pembeli){
        this.Pembeli=Pembeli;
        return Pembeli;
    }
    public String getPembeli(){
        return Pembeli;
    }
    public void setPenjual(String Penjual){
        this.Penjual=Penjual;
    }
    public double getPajak() {
        pajak = 0.11 * harga; // 11% pajak dari harga
        return pajak;
    }
    void info(){
        System.out.println("Nama Kopi : "+namaKopi);
        System.out.println("Ukuran : "+ukuran);
        System.out.println("Harga : Rp. "+harga);
    }
}
