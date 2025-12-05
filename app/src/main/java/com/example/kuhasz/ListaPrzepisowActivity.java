package com.example.kuhasz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ArrayList<Przepis> przepisArrayList;
    private ListView listViewPrzepisy;
    private ArrayAdapter<Przepis> arrayAdapter;
    private ListView listViewListaPrzepisow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_przepisow);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String wybranaKategoria = getIntent().getStringExtra("KATEGORIA");
        przepisArrayList = RepozytoriumPrzepisow.zwrocPrzepisZDanejKategorii(wybranaKategoria);
        listViewPrzepisy = findViewById(R.id.listViewListaPrzepisow);
        arrayAdapter = new ArrayAdapter<>(
                ListaPrzepisowActivity.this,
                android.R.layout.simple_list_item_1,
                przepisArrayList
        );
        listViewPrzepisy.setAdapter(arrayAdapter);
        listViewPrzepisy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int indeksKliknietegoElementu = i;
                String kategoria = wybranaKategoria;
                Intent intent = new Intent(ListaPrzepisowActivity.this, PrzepisActivity.class);
                intent.putExtra("INDEKS", indeksKliknietegoElementu);
                intent.putExtra("KATEGORIA", kategoria);
                startActivity(intent);
            }
        });
    }
}