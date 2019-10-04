package com.bere.mibasedatos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MiDB extends SQLiteOpenHelper {

    final private String SCRIPT_TABLE_CONTACTOS = "create table contactos ( " +
            "_id integer primary key autoincrement," +
            "usuario text not null," +
            "email text not null," +
            "tel text not null);";

    public static final String[] COLUMNS_CONTACTOS = {"_id","usuario", "email","tel"};
    public static final String TABLE_NAME_CONTACTOS = "contactos";

    public MiDB(Context context) {
        super(context, "DBFile", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SCRIPT_TABLE_CONTACTOS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
