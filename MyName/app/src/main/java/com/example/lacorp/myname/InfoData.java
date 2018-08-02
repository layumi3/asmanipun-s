package com.example.lacorp.myname;

import java.util.ArrayList;

/**
 * Created by lacorp on 8/2/2018.
 */

public class InfoData {
    public static String[] [] data = new String[][]{
            {"Hashirama Senju","Hokage Pertama","https://vignette.wikia.nocookie.net/naruto/images/3/30/Hokage_Hashirama.png"},
            {"Tobirama Senju","Hokage Kedua, anggota dari klan Senju, yang bersama dengan saudara tertuanya serta klan Uchiha, mendirikan desa shinobi pertama","https://vignette.wikia.nocookie.net/naruto/images/8/8f/Tobirama_Senju_Muka.png/revision/latest?cb=20160621171438&path-prefix=id"},
            {"Hiruzen Sarutobi","Hokage Ketiga","https://vignette.wikia.nocookie.net/naruto/images/e/e4/Hiruzen_Sarutobi.png"},
            {"Minato Namikaze","Hokage Keempat, sangat dikenal karena kecepatannya, membuatnya mendapat julukan Si Kilat Kuning Konoha","https://vignette.wikia.nocookie.net/naruto/images/1/11/Hokage_Minato.png"},
            {"Tsunade","Hokage Kelima, salah seorang Sannin dari Konohagakure. Dia mempunyai gelar Tsunade si Putri Siput dari Konoha (木ノ葉のナメクジ綱手姫, Konoha no Namekuji Tsunade-hime)","https://vignette.wikia.nocookie.net/naruto/images/a/a2/Tsunade_as_Hokage.png/revision/latest?cb=20140406070654&path-prefix=id"},
            {"Danzo Shimura","Hokage Keenam,seorang tetua dari Konohagakure.","https://vignette.wikia.nocookie.net/naruto/images/2/24/Danzo_as_hokage.png/revision/latest?cb=20141019193339&path-prefix=id"},
            {"Kakashi Hatake","Hokage Ketujuh, shinobi Konohagakure dari klan Hatake","https://vignette.wikia.nocookie.net/naruto/images/a/a1/Kakashi_hokage.png/revision/latest?cb=20150523144033&path-prefix=id"},
            {"Naruto Uzumaki","Hokage Kedelapan","https://vignette.wikia.nocookie.net/naruto/images/5/57/Naruto_Boruto_Movie.png"}

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
