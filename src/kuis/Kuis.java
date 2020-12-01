package kuis;

import java.util.Scanner;

public class Kuis {
    public static void main(String[] args) {
        char menu;
        int pilih, pilihMenu;
        String nama, NIK;
        double tulis, coding, wawancara;
        
        Scanner input = new Scanner(System.in);
        Form form;
        Android android;
        Web web;

        
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form: ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1: System.out.println("FORM PENDAFTARAN\n");
                    System.out.print("Input NIK   : ");
                    NIK = input.next();
                    System.out.print("Input Nama  : ");
                    input.nextLine(); 
                    nama = input.nextLine(); 
                    System.out.print("Input Nilai Tes Tulis       : ");
                    tulis = input.nextDouble();
                    System.out.print("Input Nilai Tes Coding      : ");
                    coding = input.nextDouble();
                    System.out.print("Input Nilai Tes Wawancara   : ");
                    wawancara = input.nextDouble();
                    
                    form = new Form(NIK, nama, tulis, coding, wawancara);
                    android = new Android(NIK, nama, tulis, coding, wawancara);
                    
                    do{
                        System.out.println("MENU");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih: ");
                        pilihMenu = input.nextInt();

                        switch(pilihMenu){
                            case 1: System.out.print("Input Nilai Tes Tulis       : ");
                                    tulis = input.nextDouble();
                                    System.out.print("Input Nilai Tes Coding      : ");
                                    coding = input.nextDouble();
                                    System.out.print("Input Nilai Tes Wawancara   : ");
                                    wawancara = input.nextDouble();

                                    android = new Android(tulis, coding, wawancara);

                                break;
                            case 2: System.out.println("Nilai Akhir : " + android.NilaiAkhir());
                                    System.out.print("KETERANGAN  : ");
                                    if(android.Keterangan()==true){
                                        System.out.println("LOLOS");
                                        System.out.println("Selamat kepada " + android.nama + " Telah diterima sebagai Android Developer\n\n");
                                    }else{
                                        System.out.println("GAGAL");
                                        System.out.println("Mohon maaf kepada " + android.nama + " Telah ditolak sebagai Android Developer\n\n");
                                    }
                                break;
                        }
                    }while(pilihMenu==1||pilihMenu==2);
                    
                break;
            case 2: System.out.println("FORM PENDAFTARAN\n");
                    System.out.print("Input NIK   : ");
                    NIK = input.next();
                    System.out.print("Input Nama  : ");
                    input.nextLine(); 
                    nama = input.nextLine(); 
                    System.out.print("Input Nilai Tes Tulis       : ");
                    tulis = input.nextDouble();
                    System.out.print("Input Nilai Tes Coding      : ");
                    coding = input.nextDouble();
                    System.out.print("Input Nilai Tes Wawancara   : ");
                    wawancara = input.nextDouble();
                    
                    form = new Form(NIK, nama, tulis, coding, wawancara);
                    web = new Web(NIK, nama, tulis, coding, wawancara);
                    
                    do{
                        System.out.println("MENU");
                        System.out.println("1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih: ");
                        pilihMenu = input.nextInt();

                        switch(pilihMenu){
                            case 1: System.out.print("Input Nilai Tes Tulis       : ");
                                    tulis = input.nextDouble();
                                    System.out.print("Input Nilai Tes Coding      : ");
                                    coding = input.nextDouble();
                                    System.out.print("Input Nilai Tes Wawancara   : ");
                                    wawancara = input.nextDouble();

                                    web = new Web(tulis, coding, wawancara);

                                break;
                            case 2: System.out.println("Nilai Akhir : " + web.NilaiAkhir());
                                    System.out.print("KETERANGAN  : ");
                                    if(web.Keterangan()==true){
                                        System.out.println("LOLOS");
                                        System.out.println("Selamat kepada " + web.nama + " Telah diterima sebagai Web Developer\n\n");
                                    }else{
                                        System.out.println("GAGAL");
                                        System.out.println("Mohon maaf kepada " + web.nama + " Telah ditolak sebagai Web Developer\n\n");
                                    }
                                break;
                        }
                    }while(pilihMenu==1||pilihMenu==2);
                break;
            
        }
    }
    
}
