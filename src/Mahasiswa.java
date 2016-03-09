
package tugas_prak;

public class Mahasiswa {
    String nim_mahasiswa, nama;
    int jumlahPutaran;  
    int jumlah_waktu;
   

    
    public Mahasiswa(String nim_mahasiswa, String nama, int jumlahPutaran, int jumlah_waktu){
        this.nim_mahasiswa = nim_mahasiswa;
   
        this.nama = nama;
 
        this.jumlahPutaran = jumlahPutaran;
   
        this.jumlah_waktu = jumlah_waktu;
        
       
        
    }
    
    public int hitungJarak(Lapangan a){
        return this.jumlahPutaran*a.getKeliling();
    }
    public void Tampil(Lapangan b){
        System.out.println(nama+" " + hitungJarak(b));

    }
    public int hitung(Lapangan a){
        return hitungJarak(a)/jumlah_waktu;
    }
    public void Pemenang(Mahasiswa b[],Lapangan a){
        double min;
        int k = 0;
        min = b[0].hitung(a);
        for(int i=0;i<b.length;i++){
           if(min < b[i].hitung(a)) {
               min = b[i].hitung(a);
               k++;
           }
        }
        System.out.println((b[k].nama)+" "+b[k].hitung(a));
    }

    
   
   
 
   
    

     
}

