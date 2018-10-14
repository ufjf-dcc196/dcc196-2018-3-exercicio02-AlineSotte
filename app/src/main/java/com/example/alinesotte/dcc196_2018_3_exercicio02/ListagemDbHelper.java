package com.example.alinesotte.dcc196_2018_3_exercicio02;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ListagemDbHelper extends SQLiteOpenHelper {
    public final static int DATABASE_VERSION = 1;
    public final static String  DATABASE_NAME = "Listagem.db";

    public ListagemDbHelper (Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ListagemC.Lista.CREATE_SERIE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ListagemC.Lista.DROP_SERIE);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db,oldVersion,newVersion);
    }
}
