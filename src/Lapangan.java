
package tugas_prak;

public class Lapangan { 
    
   final int panjang, lebar;
    
    public Lapangan(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
    }
 
    int getKeliling(){
        return (2*panjang)+(2*lebar);
    }
}
