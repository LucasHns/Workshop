package com.example.myapplication;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHandler extends SQLiteOpenHelper {
    //attributs user
    public static final String USER_KEY = "user_id";
    public static final String NAME = "name";
    public static final String FORNAME = "forname";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    //public static final String USER_FOREIGN_KEY = "user_foreign_key";

    // attributs produits
    public static final String PRODUCT_KEY = "product_id";
    public static final String PRODUCT_NAME = "product_name";
    public static final String PRODUC_TYPE = "product_type";

    //attributs outils
    public static final String TOOLS_KEY = "tools_id";
    public static final String TOOLS_NAME = "tools_name";

    //attributs terrain
    public static final String FIELD_KEY = "field_id";
    public static final String FIELD_SIZE = "field_size";


    public static final String USER_TABLE_NAME = "USER";
    public static final String USER_TABLE_CREATE =
            "CREATE TABLE " + USER_TABLE_NAME + " (" +
                    USER_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME + " TEXT, " +
                    FORNAME + " TEXT, " +
                    LOGIN + " TEXT, " +
                    PASSWORD + " TEXT);";

    public static final String PRODUCT_TABLE_NAME = "PRODUCT";
    public static final String PRODUCT_TABLE_CREATE =
            "CREATE TABLE " + PRODUCT_TABLE_NAME + " (" +
                    PRODUCT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PRODUCT_NAME + " TEXT, " +
                    PRODUC_TYPE+ " TEXT); " ;

    public static final String TOOLS_TABLE_NAME = "TOOLS";
    public static final String TOOLS_TABLE_CREATE =
            "CREATE TABLE " + TOOLS_TABLE_NAME + " (" +
                    TOOLS_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TOOLS_NAME+ " TEXT); " ;

    public static final String FIELD_TABLE_NAME = "FIELD";
    public static final String FIELD_TABLE_CREATE =
            "CREATE TABLE " + FIELD_TABLE_NAME + " (" +
                    FIELD_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    FIELD_SIZE+ " INTEGER); " ;

    public static final String CALL_TABLE_NAME = "CALL";
    public static final String CALL_TABLE_CREATE =
            "CREATE TABLE " + CALL_TABLE_NAME + " (" +
                    "FOREIGN_KEY(USER_KEY,PRODUCT_KEY) REFERENCES USER,PRODUCT);" ;

    public static final String LEASING_TABLE_NAME = "LEASING";
    public static final String LEASING_TABLE_CREATE =
            "CREATE TABLE " + LEASING_TABLE_NAME + " (" +
                    "FOREIGN_KEY(USER_KEY,TOOLS_KEY) REFERENCES USER,TOOLS);" ;

    public static final String OFFER_TABLE_NAME = "OFFER";
    public static final String OFFER_TABLE_CREATE =
            "CREATE TABLE " + OFFER_TABLE_NAME + " (" +
                    "FOREIGN_KEY(USER_KEY,FIELD_KEY) REFERENCES USER,FIELD);" ;


    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(USER_TABLE_CREATE);
        db.execSQL(PRODUCT_TABLE_CREATE);
        db.execSQL(TOOLS_TABLE_CREATE);
        db.execSQL(FIELD_TABLE_CREATE);
        db.execSQL(CALL_TABLE_CREATE);
        db.execSQL(LEASING_TABLE_CREATE);
        db.execSQL(OFFER_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}


