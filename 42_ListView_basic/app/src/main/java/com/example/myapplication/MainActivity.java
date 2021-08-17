package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;

    ArrayList<String> arrayCourse;

    Button btnThem,btnCapNhat;
    EditText edtMonHoc;

    int vitri = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc = (ListView) findViewById(R.id.listviewMonhoc);
        btnThem =(Button) findViewById(R.id.buttonThem);
        btnCapNhat = (Button) findViewById(R.id.buttonCapNhat);
        edtMonHoc = (EditText) findViewById(R.id.editTextMonHoc);

        arrayCourse = new ArrayList<>();

        arrayCourse.add("Android");
        arrayCourse.add("PHP");
        arrayCourse.add("iOS");
        arrayCourse.add("Unity");
        arrayCourse.add("ASP.Net");

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCourse
        );
    lvMonHoc.setAdapter(adapter);

    btnThem.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            String monhoc = edtMonHoc.getText().toString();
            arrayCourse.add(monhoc);
            adapter.notifyDataSetChanged();

        }
    });

    lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
            edtMonHoc.setText(arrayCourse.get(i));

            vitri = i;
        }
    });

    btnCapNhat.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){

            arrayCourse.set(vitri, edtMonHoc.getText().toString());

            adapter.notifyDataSetChanged();

        }
    });
    lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long l) {

            arrayCourse.remove(i);
            adapter.notifyDataSetChanged();
            return false;
        }
    });

        }
}
