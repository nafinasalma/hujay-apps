package com.example.asus.hujayapps;

public class SoalPilihanGandaSatu {
    //membuat array untuk pertanyaan
    public String pertanyaansatu[] = {
            "Huruf apa yang penulisannya tegak lurus? ",
            "Huruf yang ketika dibaca mempunya qolqolah yaitu.. ",
            "Huruf yang dapat disambung tapi tidak bisa menyambung adalah huruf.. ",
            "Urutan huruf hijaiyah di bawah ini yang benar adalah..",
            "Huruf apa yang penulisannya dari atas garis lalu melewati garis bawah? ",
    };

    //membuat array untuk pilihan jawaban
    private String jawabansatu[][] = {
            {"Jim","Alif","Tsa","Ba"},
            {"Ba","Ta","Tsa","Alif"},
            {"Jim","Ta","Tsa","Alif"},
            {"Jim-Tsa-Ta-Alif-Ba","Ta-Ba-Jim-Alif","Alif-Ba-Ta-Tsa-Jim","Ba-Ta-Alif-Tsa"},
            {"Ta","Alif","Tsa","Jim"},
    };

    //membuat array untuk jawaban benar
    private String jawabanbenarsatu[] = {
            "Alif",
            "Ba",
            "Alif",
            "Alif-Ba-Ta-Tsa-Jim",
            "Jim",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x) {
        String soal = pertanyaansatu[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban
    public String getJawaban1(int x) {
        String jawaban1 = jawabansatu[x][0];
        return jawaban1;
    }

    public String getJawaban2(int x) {
        String jawaban2 = jawabansatu[x][1];
        return jawaban2;
    }

    public String getJawaban3(int x) {
        String jawaban3 = jawabansatu[x][2];
        return jawaban3;
    }

    public String getJawaban4(int x) {
        String jawaban4 = jawabansatu[x][3];
        return jawaban4;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanbenarsatu[x];
        return jawaban;
    }
}