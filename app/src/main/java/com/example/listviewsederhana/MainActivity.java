package com.example.listviewsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]hewan={"kuda","sapi","kabing","domba","kerbau","semut","kucing","ikan","ayam","bebek","jerapah","harimau"};
    ListView lvHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvHewan=(ListView)findViewById(R.id.lv_hewan);
        ArrayAdapter<String>hewanAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,hewan);
        lvHewan.setAdapter(hewanAdapter);
        lvHewan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String pilihan;
                pilihan=parent.getAdapter().getItem(position).toString();
                Toast.makeText(getApplicationContext(),pilihan, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
