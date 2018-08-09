package com.example.asus.hujayapps;

public class SoalPilihanGandaEnam {
    //membuat array untuk pertanyaan
    public String pertanyaanenam[] = {
            "Huruf apa yang bisa disambung tapi tidak bisa menyambung huruf setelahnya ",
            "Makhrojnya mengangkat ujung lidah, disentuhkan dengan langit-langit, adalah huruf ",
            "Makhrojnya dikeluarkan dari tenggorokan bagian bawah",
            "Biasanya diwadahi huruf Alif Wau dan Ya",
            "Penulisannya dari atas sampai ke bawah garis, bentuknya seperti bebek dan terdapat dua titik di bawahnya ",
    };

    //membuat array untuk pilihan jawaban
    private String jawabanenam[][] = {
            {"Ha","Wau","Ya","Hamzah"},
            {"Lam Alif","Ya","Wau","Hamzah"},
            {"Wau","Ya","Lam Alif","Ha"},
            {"Wau","Ha","Hamzah","Ya"},
            {"Ya","Lam Alif","Wau","Ha"},
    };

    //membuat array untuk jawaban benar
    private String jawabanbenarenam[] = {
            "Wau",
            "Lam Alif",
            "Ha",
            "Hamzah",
            "Ya",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x) {
        String soal = pertanyaanenam[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban
    public String getJawaban1(int x) {
        String jawaban1 = jawabanenam[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabanenam[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabanenam[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabanenam[x][3];
        return jawaban4;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanbenarenam[x];
        return jawaban;
    }
}
