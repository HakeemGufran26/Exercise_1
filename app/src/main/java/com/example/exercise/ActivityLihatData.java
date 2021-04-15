package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelpon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("MIKA A");
                tvnomor.setText("082222222221");
                break;
            case "Ilham":
                tvnama.setText("MIKI I");
                tvnomor.setText("082222222222");
                break;
            case "Eris":
                tvnama.setText("MIKU U");
                tvnomor.setText("082222222223");
                break;
            case "Fikri":
                tvnama.setText("MIKE E");
                tvnomor.setText("082222222224");
                break;
            case "Maul":
                tvnama.setText("MIKO O");
                tvnomor.setText("082222222225");
                break;
            case "Intan":
                tvnama.setText("MOKA A");
                tvnomor.setText("082222222221");
                break;
            case "Vina":
                tvnama.setText("MOKI I");
                tvnomor.setText("082222222222");
                break;
            case "Gita":
                tvnama.setText("MOKU U");
                tvnomor.setText("082222222223");
                break;
            case "Vian":
                tvnama.setText("MOKE E");
                tvnomor.setText("082222222224");
                break;
            case "Luthfi":
                tvnama.setText("MOKO O");
                tvnomor.setText("082222222225");
                break;
        }
    }
}
