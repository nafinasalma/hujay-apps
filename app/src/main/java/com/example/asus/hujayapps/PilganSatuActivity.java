package com.example.asus.hujayapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PilganSatuActivity extends AppCompatActivity {
    //membuat variable baru sesuai tipe
    TextView mtvSkor, mtvSoal;
    RadioGroup mrgJawaban;
    RadioButton mrbJawaban1, mrbJawaban2, mrbJawaban3, mrbJawaban4;
    Button mbtnSubmit;
    int skor=0;
    int arr; //untuk menampung nilai panjang array
    int x; //menunjukkan konten sekarang
    String piljawaban; //menampung jawaban benar

    //membuat objek dari kelas SoalPilihanGandaSatu.java
    SoalPilihanGandaSatu soalPG = new SoalPilihanGandaSatu();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilgan_satu);

        //menyambungkan antara variabel KuisPilihanGanda.java dengan id activity_kuis_pilihan_ganda
        mtvSkor = (TextView) findViewById(R.id.tvSkor);
        mtvSoal = (TextView) findViewById(R.id.tvSoal);
        mrgJawaban = (RadioGroup) findViewById(R.id.rgJawaban);
        mrbJawaban1 = (RadioButton) findViewById(R.id.rbJawaban1);
        mrbJawaban2 = (RadioButton) findViewById(R.id.rbJawaban2);
        mrbJawaban3 = (RadioButton) findViewById(R.id.rbJawaban3);
        mrbJawaban4 = (RadioButton) findViewById(R.id.rbJawaban4);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        //set konten
        mtvSkor.setText(""+skor);
        setKonten();

        //menentukan aksi ketika button submit diklik
        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aksinya disini
                //aksinya adalah ketika button tersebut diklik maka
                //akan mengecek jawaban benar atau salah
                //kemudian konten akan berubah (next konten)
                cekJawaban();
            }
        });
    }

    //method untuk mengambil dan update konten dari SoalPilihanGanda.java
    //kemudian disetting/ditempatkan pada tempat yang telah disediakan
    public void setKonten(){
        mrgJawaban.clearCheck();
        arr = soalPG.pertanyaansatu.length;
        if(x >= arr){ //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);	//menjadikan skor menjadi string
            Intent i = new Intent(PilganSatuActivity.this, HasilSkoringActivity.class);
            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir
            //singkatnya skorAkhir = jumlahSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir",jumlahSkor);
            i.putExtra("activity","PilihanGanda");
            startActivity(i);
        }else{
            //setting text dengan mengambil text dari method getter di kelas SoalPilihanGanda
            mtvSoal.setText(soalPG.getPertanyaan(x));
            mrbJawaban1.setText(soalPG.getJawaban1(x));
            mrbJawaban2.setText(soalPG.getJawaban2(x));
            mrbJawaban3.setText(soalPG.getJawaban3(x));
            mrbJawaban4.setText(soalPG.getJawaban4(x));
            piljawaban = soalPG.getJawabanBenar(x);

        }
        x++;
    }

    public void cekJawaban(){
        if(mrbJawaban1.isChecked()){ //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbJawaban1.getText().toString().equals(piljawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);	//mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban2.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbJawaban2.getText().toString().equals(piljawaban)){
                skor = skor + 10;
                mtvSkor.setText(""+skor);	//mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban3.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (mrbJawaban3.getText().toString().equals(piljawaban)) {
                skor = skor + 10;
                mtvSkor.setText("" + skor);    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban4.isChecked()){
                //jika text yang tertulis di radio button tsb = nilai dari var jawaban
                if(mrbJawaban4.getText().toString().equals(piljawaban)){
                    skor = skor + 10;
                    mtvSkor.setText(""+skor);	//mtvSkor diset nilainya = var skor
                    Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                    setKonten(); //update next konten
                }else{
                    mtvSkor.setText(""+skor);
                    Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                    setKonten();
                }
        }else{
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
//        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
