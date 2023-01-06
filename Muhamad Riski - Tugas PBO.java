import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataWarga{
    String nama,nik,alamat,notelp,jenis_pekerjaan,alamat_kantor,status,nama_pasangan;
    Integer jml_anak;

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNoTelp(){
        return notelp;
    }
    public void setNoTelp(String notelp){
        this.notelp = notelp;
    }
    public String getJenisPekerjaan(){
        return jenis_pekerjaan;
    }
    public void setJenisPekerjaan(String jenis_pekerjaan){
        this.jenis_pekerjaan = jenis_pekerjaan;
    }
    public String getAlamatKantor(){
        return alamat_kantor;
    }
    public void setALamatKantor(String alamat_kantor){
        this.alamat_kantor = alamat_kantor;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getNamaPasangan(){
        return nama_pasangan;
    }
    public void setNamaPasangan(String nama_pasangan){
        this.nama_pasangan = nama_pasangan;
    }
    public Integer getjml_anak(){
        return jml_anak;
    }
    public void setjml_anak(Integer jml_anak){
        this.jml_anak = jml_anak;
    }
}

class IuranWarga{
    Integer NIK,Sampah,Keamanan,Sumbangan;

    public Integer getNIK(){
        return NIK;
    }
    public void setNIK(Integer NIK){
        this.NIK = NIK ;
    }
    public Integer getSampah(){
        return Sampah;
    }
    public void setSampah(Integer Sampah){
        this.Sampah = Sampah ;
    }
    public Integer getKeamanan(){
        return Keamanan;
    }
    public void setKeamanan(Integer Keamanan){
        this.Keamanan = Keamanan ;
    }
    public Integer getSumbangan(){
        return Sumbangan;
    }
    public void setSumbangan(Integer Sumbangan){
        this.Sumbangan = Sumbangan ;
    }
}

class Overloading {
    public DataWarga inputDataWarga(){
        DataWarga dataWarga = new DataWarga();
        Scanner sc = new Scanner(System.in);
        System.out.println("**Data Warga**");
        System.out.println("Masukkan Nama :");

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataWarga{
    String nama,nik,alamat,notelp,jenis_pekerjaan,alamat_kantor,status,nama_pasangan;
    Integer jml_anak;

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNoTelp(){
        return notelp;
    }
    public void setNoTelp(String notelp){
        this.notelp = notelp;
    }
    public String getJenisPekerjaan(){
        return jenis_pekerjaan;
    }
    public void setJenisPekerjaan(String jenis_pekerjaan){
        this.jenis_pekerjaan = jenis_pekerjaan;
    }
    public String getAlamatKantor(){
        return alamat_kantor;
    }
    public void setALamatKantor(String alamat_kantor){
        this.alamat_kantor = alamat_kantor;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getNamaPasangan(){
        return nama_pasangan;
    }
    public void setNamaPasangan(String nama_pasangan){
        this.nama_pasangan = nama_pasangan;
    }
    public Integer getjml_anak(){
        return jml_anak;
    }
    public void setjml_anak(Integer jml_anak){
        this.jml_anak = jml_anak;
    }
}

class IuranWarga{
    Integer NIK,Sampah,Keamanan,Sumbangan;

    public Integer getNIK(){
        return NIK;
    }
    public void setNIK(Integer NIK){
        this.NIK = NIK ;
    }
    public Integer getSampah(){
        return Sampah;
    }
    public void setSampah(Integer Sampah){
        this.Sampah = Sampah ;
    }
    public Integer getKeamanan(){
        return Keamanan;
    }
    public void setKeamanan(Integer Keamanan){
        this.Keamanan = Keamanan ;
    }
    public Integer getSumbangan(){
        return Sumbangan;
    }
    public void setSumbangan(Integer Sumbangan){
        this.Sumbangan = Sumbangan ;
    }
}

class Overloading {
    public DataWarga inputDataWarga(){
        DataWarga dataWarga = new DataWarga();
        Scanner sc = new Scanner(System.in);
        System.out.println("**Data Warga**");
        System.out.println("Masukkan Nama :");
        dataWarga.setNama(sc.nextLine());
        System.out.println("Masukkan NIK :");
        dataWarga.setNik(sc.nextLine());
        System.out.println("Masukkan Alamat :");
        dataWarga.setAlamat(sc.nextLine());
        System.out.println("Masukkan No.Telp :");
        dataWarga.setNoTelp(sc.nextLine());

        System.out.println("[------------------------------]");
        System.out.println("**Data Pekerjaan**");
        System.out.println("Masukkan Pekerjaan :");
        dataWarga.setJenisPekerjaan(sc.nextLine());
        System.out.println("Masukkan Alamat Kantor :");
        dataWarga.setALamatKantor(sc.nextLine());
        System.out.println("[------------------------------]");
        
        System.out.println("**Data Status**");
        System.out.println("Masukkan Status :");
        dataWarga.setStatus(sc.nextLine());
        System.out.println("Masukkan Nama Pasangan :");
        dataWarga.setNamaPasangan(sc.nextLine());
        System.out.println("Masukkan Jumlah Anak :");
        dataWarga.setjml_anak(sc.nextInt());

        return dataWarga;
    }
}

class Overriding extends IuranWarga{

    public void inputDataIuran(String nik){
        Integer NIK = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("**Data Iuran Pokok**");

        do{
            System.out.println("NIK :");
            NIK = sc.nextInt();
            if(!NIK.toString().equalsIgnoreCase(nik)){
                System.out.println("NIK Tidak Sesuai");
            }
            setNIK(NIK);
        }while(!NIK.toString().equalsIgnoreCase(nik));

        System.out.println("Masukkan Iuran Sampah :");
        setSampah(sc.nextInt());
        System.out.println("Masukkan Iuran Keamanan :");
        setKeamanan(sc.nextInt());
        System.out.println("**Data Iuran Sekunder**");
        System.out.println("Masukkan Iuran Sumbangan :");
        setSumbangan(sc.nextInt());
        
        }
    public List<Integer>getResult(){
        List<Integer>dataReturn = new ArrayList();

        dataReturn.add(getNIK());
        dataReturn.add(getSampah()+getKeamanan()+getSumbangan());

        return dataReturn;
    }
}

class Main extends IuranWarga {
    public static void main(String[] args) {
        Integer pilih = 0;
        String lanjut;
        DataWarga dataWarga = new DataWarga();

        Overloading overloading = new Overloading();
        Overriding overriding = new Overriding();
        List<Integer> result = new ArrayList<Integer>();
        do{
            Scanner sc = new Scanner(System.in);
            if(dataWarga.getNama()!=null){
                System.out.println("Lanjut Bayar Iuran ?");
                lanjut = sc.nextLine();
                if(lanjut.equalsIgnoreCase("ya")){
                    pilih = 2;
                }else{
                    pilih = 0;
                }
            }else{
                System.out.println("[--------------------------------------]");
                System.out.println("Pendataan dan Pembayaran Iuran Warga");
                System.out.println("[--------------------------------------]");
                System.out.println("1. Input Data Warga");
                System.out.println("2. Input Iuran Warga");
                System.out.println("Pilih Menu");
                pilih = sc.nextInt();
            }
            System.out.println("[--------------------------------------]");
            if(pilih == 1 ){
                dataWarga = overloading.inputDataWarga();
                }else if (pilih == 2){
                    overriding.inputDataIuran(dataWarga.getNik());
                    result = overriding.getResult();
                }
            }while(pilih!= 0);
        System.out.printf("||%-28 || %-10s","NIK",result.get(0));
        System.out.println();
        System.out.printf("||%-10 || %-5s","Total Pembayaran Iuran Warga",result.get(1));
        System.out.println();
        System.out.println(" Terimakasih" +dataWarga.getNama()+"Iuran Anda Sudah Dibayarkan");
    }
}