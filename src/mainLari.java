package tugas_prak;

import java.util.Scanner;

public class mainLari {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       

     
        int jumlah = in.nextInt();
        Mahasiswa m[] = new Mahasiswa[jumlah];

        int panjang = in.nextInt();
        int lebar = in.nextInt();
        Lapangan lap = new Lapangan(panjang, lebar);

        for (int i = 0; i < m.length; i++) {

            
            
            String nama_mahasiswa[] = new String[m.length];
            String nim[] = new String[m.length];
            int jumlahPutaran[] = new int[m.length];
            int jumlah_waktu[] = new int[m.length];

            String a = in.next();
            String b = in.next();
            String c = in.next();
            String d = in.next();
           
            
            
            String Tulisan = a +","+ b +","+ c +","+ d;
            String[] pecah = Tulisan.split(",");
            
            int c1 = Integer.parseInt(pecah[4]);
            int d1 = Integer.parseInt(pecah[6]);
            
            nim[i] = pecah[0];

            nama_mahasiswa[i] = pecah[2];

            jumlahPutaran[i] = c1;

            jumlah_waktu[i] = d1;
            

            m[i] = new Mahasiswa(nim, nama_mahasiswa, jumlahPutaran, jumlah_waktu);

        }
 
        System.out.println("OUTPUT");

        for (int i = 0; i < m.length; i++) {
       
            m[i].Tampil(lap, i);
        }

    }

}
