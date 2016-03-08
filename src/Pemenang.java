
package tugas_prak;

public class Pemenang {
    int jarak[];
    int jumlah_waktu[];
    int jumlahPutaran[];
        
    public int cari_pemenang(String nim[],String nama_mahasiswa[], Lapangan b,int i, int jumlah_waktu[], int jumlahPutaran[]){
        Mahasiswa m[] = new Mahasiswa[4];
        for(i = 0; i < 4 ; i++){
            m[i] = new Mahasiswa(nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);
           return m[i].hitungJarak(b, i)/jumlah_waktu[i];
            
        }
   
        
    

