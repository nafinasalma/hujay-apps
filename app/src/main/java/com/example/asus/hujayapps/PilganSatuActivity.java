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
    TextView mtvSkor, mtvSoal;
    RadioGroup mrgJawaban;
    RadioButton mrbJawaban1, mrbJawaban2, mrbJawaban3, mrbJawaban4;
    Button mbtnSubmit;
    int skor=0;
    int arr;
    int x;
    String piljawaban;

    SoalPilihanGandaSatu soalPG = new SoalPilihanGandaSatu();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilgan_satu);

        mtvSkor = (TextView) findViewById(R.id.tvSkor);
        mtvSoal = (TextView) findViewById(R.id.tvSoal);
        mrgJawaban = (RadioGroup) findViewById(R.id.rgJawaban);
        mrbJawaban1 = (RadioButton) findViewById(R.id.rbJawaban1);
        mrbJawaban2 = (RadioButton) findViewById(R.id.rbJawaban2);
        mrbJawaban3 = (RadioButton) findViewById(R.id.rbJawaban3);
        mrbJawaban4 = (RadioButton) findViewById(R.id.rbJawaban4);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        mtvSkor.setText(""+skor);
        setKonten();

        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    public void setKonten(){
        mrgJawaban.clearCheck();
        arr = soalPG.pertanyaansatu.length;
        if(x >= arr){
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(PilganSatuActivity.this, HasilSkoringActivity.class);
            i.putExtra("skorAkhir",jumlahSkor);
            i.putExtra("activity","PilihanGanda");
            startActivity(i);
            finish();
        }else{
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
        if(mrbJawaban1.isChecked()){
            if(mrbJawaban1.getText().toString().equals(piljawaban)){
                skor = skor + 20;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban2.isChecked()){
            if(mrbJawaban2.getText().toString().equals(piljawaban)){
                skor = skor + 20;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban3.isChecked()) {
            if (mrbJawaban3.getText().toString().equals(piljawaban)) {
                skor = skor + 20;
                mtvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            } else {
                mtvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbJawaban4.isChecked()){
            if(mrbJawaban4.getText().toString().equals(piljawaban)){
                skor = skor + 20;
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        super.onBackPressed();
    }
}
