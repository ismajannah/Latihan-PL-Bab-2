package tugas_prak;

import java.util.Scanner;

public class mainLari {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inn = new Scanner(System.in);
        Scanner innn = new Scanner(System.in);

        int jumlah = in.nextInt();
        Mahasiswa m[] = new Mahasiswa[jumlah];

        int panjang = in.nextInt();
        int lebar = in.nextInt();
        Lapangan lap = new Lapangan(panjang, lebar);

        for (int i = 0; i < m.length; i++) {

            m[i] = new Mahasiswa();

            String nama[] = new String[m.length];
            String nim[] = new String[m.length];

            System.out.println("nim : ");
            nim[i] = innn.nextLine();
            System.out.println("nama : ");
            nama[i] = innn.nextLine();

            m[i].set_nim(nim[i]);
            m[i].set_nama(nama[i]);

            int jumlahPutaran[] = new int[m.length];
            int jumlah_waktu[] = new int[m.length];

            System.out.println("putaran : ");
            jumlahPutaran[i] = in.nextInt();
            System.out.println("waktu : ");
            jumlah_waktu[i] = inn.nextInt();

            m[i].set_jumlahPutaran(jumlahPutaran[i]);
            m[i].set_jumlah_waktu(jumlah_waktu[i]);

            System.out.print(nama[i]);
            System.out.println(" " + lap.getKeliling() * jumlahPutaran[i]);

        }

    }

}


