package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.provider.BaseColumns;

public final class ListagemContract {

    public final class Lista implements BaseColumns {
        public final static String TABLE_NAME = "Serie";
        public final static String COLUMN_NAME_SERIE = "nome_serie";
        public final static String COLUMN_NAME_TEMPORADA = "temporada";
        public final static String COLUMN_NAME_EPISODIO = "episodio";
        public final static String CREATE_SERIE =
                "CREATE TABLE " + Lista.TABLE_NAME + " ("
                        + Lista._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + Lista.COLUMN_NAME_SERIE+ " TEXT, "
                        + Lista.COLUMN_NAME_TEMPORADA+ " TEXT, "
                        + Lista.COLUMN_NAME_EPISODIO+ " INTEGER"
                        +")";
        public final static String DROP_SERIE = "DROP TABLE IF EXISTS "
                + Lista.TABLE_NAME;
    }

}
