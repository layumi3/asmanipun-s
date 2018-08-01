package com.example.lacorp.myname;

import java.util.ArrayList;

/**
 * Created by lacorp on 8/2/2018.
 */

public class InfoData {
    public static String[] [] data = new String[][]{
            {"Soekarno","Presiden RI","jtt.jpg"},
            {"Soekarno","Presiden RI","jtt.jpg"},
            {"Soekarno","Presiden RI","jtt.jpg"},
            {"Soekarno","Presiden RI","jtt.jpg"}

    };

    public static ArrayList<Informasi> getListData(){
        Informasi informasi = null;
        ArrayList<Informasi> list = new ArrayList<>();
        for (int i = 0;i <data.length; i++){
            informasi = new Informasi();
            informasi.setName(data[i][0]);
            informasi.setRemarks(data[i][1]);
            informasi.setPhoto(data[i][2]);
            list.add(informasi);
        }
        return list;
    }
}
