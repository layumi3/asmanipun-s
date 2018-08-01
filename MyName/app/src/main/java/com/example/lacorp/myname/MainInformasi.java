package com.example.lacorp.myname;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by lacorp on 8/2/2018.
 */

public class MainInformasi extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Informasi>list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(InfoData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListInformasiAdapter listInformasiAdapter= new ListInformasiAdapter(this);

        listInformasiAdapter.setListInformasi(list);
        rvCategory.setAdapter(listInformasiAdapter);
    }
}
