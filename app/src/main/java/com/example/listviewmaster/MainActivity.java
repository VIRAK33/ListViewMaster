package com.example.listviewmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> casheirList;
    private Button edit;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit =findViewById(R.id.edit) ;

        casheirList = new ArrayList<Model>();
        ListView lview = (ListView) findViewById(R.id.listview);
        ListViewAdapter adapter = new ListViewAdapter(this, casheirList);
        lview.setAdapter(adapter);

        listCaheirs();

        adapter.notifyDataSetChanged();

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String sno = ((TextView)view.findViewById(R.id.no)).getText().toString();
                String product = ((TextView)view.findViewById(R.id.name)).getText().toString();
                String category = ((TextView)view.findViewById(R.id.login)).getText().toString();


                Toast.makeText(getApplicationContext(),
                        "S no : " + sno +"\n"
                                +"Name : " + product +"\n"
                                +"Login : " +category, Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void listCaheirs() {

        Model item, item1, item2, item3, item4, item5,item6;

        item1 = new Model("1", "Seam Virak", "Virak");
        casheirList.add(item1);

        item2 = new Model("2", "Seirey Chhunheng", "Chhunheng");
        casheirList.add(item2);

        item3 = new Model("3", "Sareun Saret", "Saret");
        casheirList.add(item3);

        item4 = new Model("4", "Yen Ritha", "Ritha");
        casheirList.add(item4);

        item5 = new Model("5", "Sok Vanna", "Vanna");
        casheirList.add(item5);


    }





}
