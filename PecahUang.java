import java.util.Scanner;

class PecahUang {
    public static void main(String[]args){
        Scanner inputduit = new Scanner(System.in); //Input

        //kode untuk membuat sistem inputnya
        System.out.println("NAMA : AIRLANGGA PERMANA PUTRA // D3RPLA-4401");
        System.out.println("NIM  : 6706202024");
        System.out.println("Memecah Uang dengan program java");
        System.out.println(" ");
        System.out.print("Silahkan masukkan jumlah uangnya = ");
        int jumlahduit = inputduit.nextInt(); //menggunakan int untuk penghitungan matematika

        //kode memecah uang menggunakan operator modulus dan pembagian

        // perhitungan 100k
        int seratusribu = (jumlahduit/100000);
        int sisabagi = (jumlahduit%100000);
        // perhitungan 50K

        int limapuluhribu = (sisabagi/50000);
        sisabagi = sisabagi % 50000;

        int duapuluhribu = (sisabagi/20000);
        sisabagi = sisabagi%20000;

        // perhitungan 10K
        int sepuluhribu = (sisabagi/10000);
        sisabagi = sisabagi%10000;

        // perhitungan 5K
        int limaribu = (sisabagi/5000);
        sisabagi = (sisabagi%5000);

        // perhitungan 2K
        int duaribu = (sisabagi/2000);
        sisabagi = (sisabagi%2000);

        // perhitungan 1K
        int seribu = (sisabagi/1000);
        sisabagi = (sisabagi%1000);

        // perhitungan gope
        int limaratus = (sisabagi/500);
        sisabagi = (sisabagi%500);

        // perhitungan 200perak
        int duaratus = (sisabagi/200);
        sisabagi = (sisabagi%200);

        // perhitungan 100perak
        int seratus = (sisabagi/100);
        sisabagi = (sisabagi%100);

        // perhitungan 50perak
        int limapuluh = (sisabagi/50);
        sisabagi = (sisabagi%50);

        // perhitungan sen
        int sen = (sisabagi);



        // mencetak hasil dari perhitungan
        System.out.println("Nilai / inputan uang yang mau dihitung = " + jumlahduit);
        System.out.println(" ");

        System.out.println( seratusribu + " lembar pecahan 100000");
        System.out.println( limapuluhribu + " lembar pecahan 50000");
        System.out.println( duapuluhribu + " lembar pecahan 20000");
        System.out.println( sepuluhribu + " lembar pecahan 10000");
        System.out.println( limaribu + " lembar pecahan 5000 ");
        System.out.println( duaribu + " lembar pecahan 2000");
        System.out.println(" ");
        System.out.println( seribu + " lembar pecahan 1000");

        System.out.println( limaratus + " keping pecahan 500");
        System.out.println( duaratus + " keping pecahan 200 ");
        System.out.println( seratus + " keping pecahan 100 ");
        System.out.println(" ");
        System.out.println( limapuluh + " keping pecahan 50");
        System.out.println(" ");
        System.out.println( sen + " keping pecahan sen ");
        
        





    }

}