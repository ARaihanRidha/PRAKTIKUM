package Soal2;
public class Anjing  extends HewanPeliharaan{
    private String warnaBulu;
    private String[] kemampuan;
    public Anjing(String r, String n, String warnaBulu, String[] k) {
        super(r, n);
        this.warnaBulu = warnaBulu;
        this.kemampuan = k;
    }
    public void displayDetailAnjing(){
        super.display();
        System.out.print("Memiliki kemampuan : ");
        for (String i : kemampuan){
            System.out.print(i+" ");
        }
    }
}
