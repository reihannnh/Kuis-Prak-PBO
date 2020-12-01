package kuis;

public class Form {
    protected String NIK;
    protected String nama;
    protected double tulis;
    protected double coding;
    protected double wawancara;

    public Form(String NIK, String nama, double tulis, double coding, double wawancara) {
        this.NIK = NIK;
        this.nama = nama;
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    public Form(String NIK, String nama) {
        this.NIK = NIK;
        this.nama = nama;
    }
    

    public Form(double tulis, double coding, double wawancara) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTulis() {
        return tulis;
    }

    public void setTulis(double tulis) {
        this.tulis = tulis;
    }

    public double getCoding() {
        return coding;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public double getWawancara() {
        return wawancara;
    }

    public void setWawancara(double wawancara) {
        this.wawancara = wawancara;
    }
    
    
}
