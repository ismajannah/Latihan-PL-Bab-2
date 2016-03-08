
package tugas_prak;

public class Mahasiswa {
    String nim_mahasiswa, nama;
    int jumlahPutaran;
    int jumlah_waktu;
  
    
    public void set_nim(String nim_mahasiswa){
        this.nim_mahasiswa = nim_mahasiswa;
    }
    public void set_nama(String nama){
        this.nama = nama;
    }
    public void set_jumlahPutaran(int jumlahPutaran){
        this.jumlahPutaran = jumlahPutaran;
    }
    public void set_jumlah_waktu(int jumlah_waktu){
        this.jumlah_waktu = jumlah_waktu;
    }
    public int hitungPutaran(Lapangan a){
        return this.jumlahPutaran*a.getKeliling();
    }
    
}
