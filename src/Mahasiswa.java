
package tugas_prak;

public class Mahasiswa {
    String nim_mahasiswa[], nama[];
    int jumlahPutaran[];  
    int jumlah_waktu[];
  
    
    public Mahasiswa(String nim_mahasiswa[], String nama[], int jumlahPutaran[], int jumlah_waktu[]){
        this.nim_mahasiswa = nim_mahasiswa;
   
        this.nama = nama;
 
        this.jumlahPutaran = jumlahPutaran;
   
        this.jumlah_waktu = jumlah_waktu;
    }
    
    public int hitungJarak(Lapangan a, int i){
        return this.jumlahPutaran[i]*a.getKeliling();
    }
    public void Tampil(Lapangan b, int i){
        System.out.println(nama[i]+" " + hitungJarak(b,i));

    }
}
