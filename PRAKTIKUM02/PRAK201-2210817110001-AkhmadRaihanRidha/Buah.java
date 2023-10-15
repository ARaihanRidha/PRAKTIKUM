public class Buah {
        String nama;
        double Berat;
        double Harga;
        double jumlahBeli;
        double hargaSebelumDiskon;
        double totalDiskon;
        double hargaSetelahDiskon;
        public Buah(String nama, double Berat, double Harga, double hargaSebelumDiskon,double jumlahBeli){
            this.nama=nama;
            this.Berat=Berat;
            this.Harga=Harga;
            this.hargaSebelumDiskon=hargaSebelumDiskon;
            this.jumlahBeli=jumlahBeli;
        }
            public void hitungTotaldiskon(){
                totalDiskon= (Math.floor(jumlahBeli/4) *0.02* Harga*4);
                hargaSetelahDiskon=hargaSebelumDiskon-totalDiskon;
                System.out.printf("Total diskon :Rp%.2f\n", totalDiskon);
                System.out.printf("Harga setelah diskon :Rp%.2f\n", hargaSetelahDiskon);
            }
        void buahInfo(){
            System.out.println("Nama buah : "+nama);
            System.out.println("Berat : "+Berat);
            System.out.println("Harga : "+Harga);
            System.out.println("Jumlah Beli  : "+jumlahBeli+"Kg");
            System.out.printf("Harga sebelum diskon  :Rp%.2f\n",hargaSebelumDiskon);
            hitungTotaldiskon();
        }
}
