package com.example.asus.hujayapps;

public class SoalPilihanGandaSatu {
    //membuat array untuk pertanyaan
    public String pertanyaansatu[] = {
            "Huruf apa yang penulisannya tegak lurus? ",
            "Makhroj hurufnya adalah bibir atas dan bibir bawah dirapatkan bersama-sama",
            "Huruf Tsa memiliki berapa titik?",
            "Makhroj Huruf ini adalah ujung lidah menempel pada pangkal gigi seri atas sambil mengenai gusinya, yaitu..",
            "Huruf Jim apabila diberi harokat Dhomah maka dibaca.. ",
    };

    //membuat array untuk pilihan jawaban
    private String jawabansatu[][] = {
            {"Jim","Alif","Tsa","Ba"},
            {"Ba","Ta","Tsa","Alif"},
            {"Satu titik","Dua titik","Tiga titik","Tidak punya titik"},
            {"Alif","Jim","Ba","Ta"},
            {"Ja","Ji","Ju","Jo"},
    };

    //membuat array untuk jawaban benar
    private String jawabanbenarsatu[] = {
            "Alif",
            "Ba",
            "Tiga titik",
            "Ta",
            "Ju",
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