public class Pegawai {
    public String nama;
    //Salah tipe data harusnya String bukan Char
    //public char asal;
    public String asal;
    public String jabatan;
    //Disini variabel umur belum ada value nya sehingga ketika di run hasilnya akan nol, oleh dari itu harusnya di beri nilai
    //public int umur;
    public int umur = 17;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Tidak adanya parameter untuk di isi sedangkan di class main terdapat isi paramter Assassin
    //Disini juga this.jabatan = j ; adalah salah karena this harus nya merujuk/ refer ke variabel global yang diatas
    //yaitu jabatan.
    /*public void setJabatan() {
        this.jabatan = j;
    }*/
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
