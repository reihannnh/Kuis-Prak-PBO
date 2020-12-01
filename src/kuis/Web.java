package kuis;

public class Web extends Form implements Menu{

    public Web(String NIK, String nama, double tulis, double coding, double wawancara) {
        super(NIK, nama, tulis, coding, wawancara);
    }

    public Web(double tulis, double coding, double wawancara) {
        super(tulis, coding, wawancara);
    }
    
    
    
    @Override
    public double NilaiAkhir(){
        return ((tulis*40/100) + (coding*35/100) + (wawancara*25/100));
        
    }
    
    @Override
    public boolean Keterangan(){
        if(((tulis*20/100) + (coding*50/100) + (wawancara*30/100))>= 85){
            return true;
        }else{
            return false;
        } 
    }
}
