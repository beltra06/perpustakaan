public class Perpus {
    String dataString;
    int indexAng = 0; // memberi inisialisasi harga index anggota 0
    int indexPjm = 0; // memberi inisialisasi harga index pinjam 0
    // variabel array anggota, array pinjam
    String[][] anggota = new String[10][2];
    String[][] pinjam = new String[10][5];
    // variabel array buku yaitu daftar buku yang dapat dipinjam
    String[][] buku = {
            {"01","Kamus","Kamus Inggris-Indonesia"},
            {"02","Kamus","Kamus Indonesia-Inggris"},
            {"03","Kamus","Kamus Bahasa Jawa"},
            {"04","Majalah","Komputek"},
            {"05","Majalah","Chip"},
            {"06","Majalah","Info Linux"},
            {"07","Textbook","Algoritma & Pemrograman"},
            {"08","Textbook","Pemrograman Berorientasi Obyek"},
            {"09","Textbook","Database Managements System"},
            {"10","Textbook","Computer Network"}
    };

    // method Menu Utama
    public void Menu() {
        int menu = 0;

        //membuat tampilan menu utama
        System.out.println ("\r");
        System.out.println (" Menu Utama: ");
        System.out.println (" -------------------------");
        System.out.println (" 1. Anggota ");
        System.out.println (" 2. Daftar Buku ");
        System.out.println (" 3. Peminjaman ");
        System.out.println (" 4. Pengembalian ");
        System.out.println (" 5. Exit ");
        System.out.println (" -------------------------");
        System.out.print("\r Masukkan menu pilihan anda: ");
        dataString = InputKeyboard.inputString();
        // ubah variabel dataString dari tipe data String ke int
        menu = Integer.valueOf(dataString).intValue();

        switch(menu) {
            case 1 :
                MenuAnggota(); // memanggil method Menu Anggota
                break;

            case 2 :
                DaftarBuku(); //memanggil method Daftar Buku
                break;

            case 3 :
                MenuPinjam(); //memanggil method Menu Pinjam
                break;

            case 4 :
                Pengembalian(); //memanggil method Pengembalian
                break;

            case 5 :
                System.out.println("Terima kasih");
                System.exit(0); // keluar dari program
                break;

            default :
                System.out.println ("\r");
                System.out.println("Maaf, pilihan yang Anda masukkan salah!");
                Menu(); //memanggil method pilihMenu jika pilihan selain 1 - 5
                break;
        }
    }

    // method Menu Anggota
    public void MenuAnggota() {
        int menu = 0;

        //membuat tampilan menu anggota
        System.out.println ("\r");
        System.out.println (" Menu Anggota: ");
        System.out.println (" -------------------------");
        System.out.println (" 1. Pendaftaran Anggota");
        System.out.println (" 2. Daftar Anggota ");
        System.out.println (" 3. Menu Utama ");
        System.out.println (" -------------------------");
        System.out.print("\r Masukkan menu pilihan anda: ");
        dataString = InputKeyboard.inputString();
        // ubah variabel dataString dari tipe data String ke int
        menu = Integer.valueOf(dataString).intValue();

        switch(menu) {
            case 1 :
                PendaftaranAnggota();// memanggil method Pendaftaran Anggota
                break;

            case 2 :
                DaftarAnggota(); //memanggil method Daftar Anggota
                break;

            case 3 :
                Menu(); //memanggil method Menu Utama
                break;

            default :
                System.out.println ("\r");
                System.out.println("Maaf, pilihan yang Anda masukkan salah!");
                MenuAnggota(); //memanggil method Menu Anggota jika pilihan selain 1 - 3
                break;
        }
    }

    // method Menu Peminjaman Buku
    public void MenuPinjam() {
        int menu = 0;

        //membuat tampilan Menu Peminjaman
        System.out.println ("\r");
        System.out.println (" Menu Peminjaman: ");
        System.out.println (" -------------------------");
        System.out.println (" 1. Peminjaman ");
        System.out.println (" 2. Daftar Peminjaman ");
        System.out.println (" 3. Menu Utama ");
        System.out.println (" -------------------------");
        System.out.print("\r Masukkan menu pilihan anda: ");
        dataString = InputKeyboard.inputString();
        // ubah variabel dataString dari tipe data String ke int
        menu = Integer.valueOf(dataString).intValue();

        switch(menu) {
            case 1 :
                Peminjaman();// memanggil method Peminjaman Buku
                break;

            case 2 :
                DaftarPinjam(); //memanggil method Daftar Peminjaman
                break;

            case 3 :
                Menu(); //memanggil method Menu Utama
                break;

            default :
                System.out.println ("\r");
                System.out.println("Maaf, pilihan yang Anda masukkan salah!");
                MenuPinjam(); //memanggil method Menu Pinjam jika pilihan selain 1 - 3
                break;
        }
    }

    // method Pendaftaran Anggota
    public void PendaftaranAnggota(){

        //membuat tampilan Menu Pendaftaran Anggota
        System.out.println ("\r");
        System.out.println ("Pendaftaran Anggota ");
        System.out.println ("-------------------------");
        System.out.print("Nomor Anggota : ");
        String nomorAnggota = InputKeyboard.inputString(); // input nomor anggota
        System.out.print("Nama Anggota : ");
        String namaAnggota = InputKeyboard.inputString(); // input nama anggota

        // Data Anggota disimpan ke dalam variabel Array anggota[][]
        anggota[indexAng][0]=nomorAnggota;
        anggota[indexAng][1]=namaAnggota;

        System.out.println ("\r");
        System.out.println ("Data Anggota sudah tersimpan!");

        // indeks record array anggota ditambah 1
        indexAng++;
        PilihMenu("Menu Anggota"); // memanggil method Pilih Menu dengan variabel "Menu Anggota"
    }

    // method Pemilihan Menu
    public void PilihMenu(String nmMenu){
        int pilihMenu = 0;
        String msgMenu = "" ;

        // cek isi variabe nmMenu
        if (nmMenu=="Menu Anggota"){
            msgMenu = "2.Kembali ke Menu Anggota ";
        }
        if (nmMenu=="Menu Peminjaman"){
            msgMenu = "2.Kembali ke Menu Peminjaman ";
        }
        if (nmMenu=="Menu"){
            msgMenu = "";
        }

        System.out.println ("\r");
        System.out.println("1.Kembali ke Menu Utama "+msgMenu+"3.Keluar"); // cetak daftar pemilihan menu
        System.out.print("Masukkan menu pilihan anda: ");
        dataString=InputKeyboard.inputString();
        // ubah variabel dataString dari tipe data String ke int
        pilihMenu = Integer.valueOf(dataString).intValue();

        switch(pilihMenu) {
            case 1 :
                Menu(); // memanggil method Menu Utama
                break;

            case 2 :
                if (nmMenu=="Menu Anggota"){
                    MenuAnggota(); // jika nmMenu="Menu Anggota, panggil method Menu Anggota
                }
                if (nmMenu=="Menu Peminjaman"){
                    MenuPinjam(); // jika nmMenu="Menu Peminjaman, panggil method Menu Peminjaman
                }
                break;

            case 3 :
                System.out.println("Terima kasih");
                System.exit(0); // keluar dari program
                break;

            default :
                System.out.println ("\r");
                System.out.print("Maaf, pilihan yang Anda masukkan salah!");
                PilihMenu(nmMenu); // memanggil method Pilih Menu dengan variabel isi variabel nmMenu
                break;
        }
    }

    // method Daftar Buku
    public void DaftarBuku(){

        //membuat tampilan Menu Pendaftaran Anggota
        System.out.println ("\r");
        System.out.println("No Kategori   Nama");
        System.out.println("------------------------------------------------------");

        // untuk setiap record buku yang ada di variabel array buku ditampilkan
        for (int i=0;i<buku.length;i++)
            System.out.println(buku[i][0]+"."+buku[i][1]+"   "+buku[i][2]);

        System.out.println("------------------------------------------------------");
        PilihMenu("Menu"); // memanggil method Pilih Menu dengan variabel "Menu"
    }

    // method Cari Buku
    public void CariBuku(int no){
        no--; // variabel no dikurangi 1 untuk menyesuaikan urutan di array yg dimulai dgn angka 0
        System.out.println(">> "+buku[no][0]+"."+buku[no][1]+"   "+buku[no][2]);
    }

    // method Cari Anggota
    public void CariAnggota(int no){
        no--; // variabel no dikurangi 1 untuk menyesuaikan urutan di array yg dimulai dgn angka 0
        System.out.println(">> "+anggota[no][0]+"."+anggota[no][1]);
    }

    // method Peminjaman
    public void Peminjaman(){
        int noAnggota = 0, noBuku = 0, sewa =0;

        // membuat tampilan peminjaman buku
        System.out.println ("\r");
        System.out.println ("Peminjaman Buku: ");
        System.out.println ("-------------------------");
        System.out.print("Nomor Anggota : ");
        String nomorAnggota = InputKeyboard.inputString(); // input nomor anggota
        noAnggota= Integer.valueOf(nomorAnggota).intValue();
        CariAnggota(noAnggota); // memanggil method Cari Anggota dengan isi variabel noAnggota
        noAnggota--; // noAnggota dikurangi 1 utk proses cetak bukti pinjam

        System.out.print("Nomor Buku dipinjam  : ");
        String nomorBuku = InputKeyboard.inputString(); // input nomor buku
        noBuku= Integer.valueOf(nomorBuku).intValue();
        CariBuku(noBuku);
        noBuku--; // noBukua dikurangi 1 utk proses cetak bukti pinjam

        if (buku[noBuku][1]=="Kamus"){
            sewa = 3000; // jika kategori buku="Kamus", maka biaya sewa Rp.3000,-
        }
        if (buku[noBuku][1]=="Majalah"){
            sewa = 1000;  // jika kategori buku="Majalah", maka biaya sewa Rp.1000,-
        }
        if (buku[noBuku][1]=="Textbook"){
            sewa = 2000;  // jika kategori buku="Textbook", maka biaya sewa Rp.2000,-
        }
        System.out.println("Biaya sewa 1 minggu : ");
        System.out.println(">> Rp. "+sewa+",-"); // cetak biaya sewa

        System.out.print("Tanggal Pinjam (dd/mm/yy): ");
        String tglPinjam = InputKeyboard.inputString(); // input tanggal pinjam

        System.out.print("Tanggal Kembali (dd/mm/yy): ");
        String tglKembali = InputKeyboard.inputString(); // input tanggal kembali

        // mencetak bukti peminjaman buku
        System.out.println("\n");
        System.out.println("No Anggota   : "+anggota[noAnggota][0]+"                Tanggal Pinjam  : "+tglPinjam);
        System.out.println("Nama Anggota : "+anggota[noAnggota][1]+"       Tanggal Kembali : "+tglKembali);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" No    Kategori   Nama buku");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(buku[noBuku][0]+"  "+buku[noBuku][1]+"   "+buku[noBuku][2]);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                                Total Biaya Sewa : Rp."+sewa+",-");

        // simpan data peminjaman ke variabel array pinjam[][]
        pinjam[indexPjm][0]=nomorAnggota;
        pinjam[indexPjm][1]=nomorBuku;
        pinjam[indexPjm][2]=tglPinjam;
        pinjam[indexPjm][3]=tglKembali;
        pinjam[indexPjm][4]=Integer.toString(sewa);

        System.out.println ("\r");
        System.out.println ("Data Pinjam sudah tersimpan!");

        indexPjm++; // indeks record variabel array pinjam ditambah 1

        PilihMenu("Menu Peminjaman"); // memanggil method Pilih Menu dengan variabel "Menu Peminjaman"
    }

    // method Daftar Peminjaman
    public void DaftarPinjam(){
        int noAngg =0, noBuku = 0;

        // mencetak daftar peminjaman buku
        System.out.println ("\r");
        System.out.println("Daftar Peminjaman Buku");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" No.Nama Ang  No.Nama Buku      Tgl.Pinjam   Tgl.Kembali         Biaya Sewa");
        System.out.println("------------------------------------------------------------------------------");

        // untuk setiap record pinjam yang ada di variabel array pinjam ditampilkan
        for (int i=0;i<indexPjm;i++) {

            noAngg = Integer.valueOf(pinjam[i][0]).intValue();
            noAngg--;
            noBuku = Integer.valueOf(pinjam[i][1]).intValue();
            noBuku--;
            System.out.println(pinjam[i][0]+"."+anggota[noAngg][1]+"      "+pinjam[i][1]+"."+buku[noBuku][1]+"."+buku[noBuku][2]+"    "+pinjam[i][2]+"    "+pinjam[i][3]+"    "+pinjam[i][4]);

        }
        System.out.println("------------------------------------------------------------------------------");
        PilihMenu("Menu Peminjaman"); // memanggil method Pilih Menu dengan variabel "Menu Peminjaman"
    }

    // method Daftar Anggota
    public void DaftarAnggota(){

        // mencetak daftar anggota
        System.out.println ("\r");
        System.out.println("Daftar Anggota");
        System.out.println("------------------------------------------------------");

        // untuk setiap record anggota yang ada di variabel array anggota ditampilkan
        for (int i=0;i<indexAng;i++)
            System.out.println(anggota[i][0]+"."+anggota[i][1]);

        System.out.println("------------------------------------------------------");
        PilihMenu("Menu Anggota"); // memanggil method Pilih Menu dengan variabel "Menu Anggota"
    }

    // method Pengembalian
    public void Pengembalian(){
        // deklrasi variabel
        int noAngg = 0, noBuku = 0;
        String noAng="";

        // membuat tampilan pengembalian buku
        System.out.println ("\r");
        System.out.println ("Pengembalian Buku: ");
        System.out.println ("-------------------------");
        System.out.print("Nomor Anggota : ");
        String nomorAnggota = InputKeyboard.inputString(); // input nomor anggota

        for (int i=0;i<indexPjm;i++){
            noAng = pinjam[i][0];

            // mencari data peminjaman buku di variabel array pinjam berdasarkan nomor anggota
            if (noAng.equalsIgnoreCase(nomorAnggota)){

                // jika ketemu, maka data peminjaman akan dicetak
                System.out.println("------------------------------------------------------------------------------");
                System.out.println(" No.Nama Ang  No.Nama Buku      Tgl.Pinjam   Tgl.Kembali         Biaya Sewa");
                System.out.println("------------------------------------------------------------------------------");

                noAngg = Integer.valueOf(pinjam[i][0]).intValue();// ubah variabel string noAngg ke int
                noAngg--;
                noBuku = Integer.valueOf(pinjam[i][1]).intValue(); // ubah variabel string noBuku ke int
                noBuku--;

                System.out.println(pinjam[i][0]+"."+anggota[noAngg][1]+"      "+pinjam[i][1]+"."+buku[noBuku][1]+"."+buku[noBuku][2]+"    "+pinjam[i][2]+"    "+pinjam[i][3]+"    "+pinjam[i][4]);
                System.out.println("------------------------------------------------------------------------------");

                System.out.print("Terlambat (hari) : ");
                String jmlHari = InputKeyboard.inputString(); // input data keterlambatan dalam hari
                int noHari= Integer.valueOf(jmlHari).intValue();
                System.out.println("Denda : Rp. "+(noHari*500)+",-"); // cetak total denda dari rupiah denda per hari dikalikan dgn hari keterlambatan
            }
        }
        PilihMenu("Menu"); // memanggil method Pilih Menu dengan variabel "Menu Anggota"
    }

}