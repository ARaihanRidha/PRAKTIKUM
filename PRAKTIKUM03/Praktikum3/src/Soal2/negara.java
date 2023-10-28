package Soal2;
public class negara {
    private String nama;
    private String jenis_kepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private String bulanKemerdekaan;
    private int tahunKemerdekaan;
    public negara(String nama, String jenis_kepemimpinan, String namaPemimpin, int tanggalKemerdekaan, String bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis_kepemimpinan() {
        return jenis_kepemimpinan;
    }
    public void setJenis_kepemimpinan(String jenis_kepemimpinan) {
        this.jenis_kepemimpinan = jenis_kepemimpinan;
    }
    public String getNamaPemimpin() {
        return namaPemimpin;
    }
    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }
    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }
    public void setTanggalKemerdekaan(int tanggalKemerdekaan) {
        this.tanggalKemerdekaan = tanggalKemerdekaan;
    }
    public String getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }
    public void setBulanKemerdekaan(String bulanKemerdekaan) {
        this.bulanKemerdekaan = bulanKemerdekaan;
    }
    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
    public void setTahunKemerdekaan(int tahunKemerdekaan) {
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
}
