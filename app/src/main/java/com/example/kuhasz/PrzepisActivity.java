package com.example.kuhasz;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrzepisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_przepis);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        int indeks = getIntent().getIntExtra("INDEKS", 0);
        String kategoria = getIntent().getStringExtra("KATEGORIA");
        Przepis przepis = null;
        if(indeks>=0){
            przepis = RepozytoriumPrzepisow.zwrocPrzepisZDanejKategorii(kategoria).get(indeks);
            //Toast.makeText(this, przepis.getNazwyPrzepisu(), Toast.LENGTH_SHORT).show();
            wyswietlPrzepis(przepis);
        }
    }
    private void wyswietlPrzepis(Przepis przepis){
        
    }
}