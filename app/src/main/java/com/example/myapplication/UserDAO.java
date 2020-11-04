package com.example.myapplication;

import android.content.Context;

import androidx.room.Query;

public class UserDAO extends DAOBase {

    public static final String USER_TABLE_NAME = "USER";
    public static final String USER_KEY = "user_id";
    public static final String NAME = "name";
    public static final String FORNAME = "forname";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";

    public static final String TABLE_CREATE = "CREATE TABLE " + USER_TABLE_NAME + " (" + USER_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NAME + " TEXT, "
            + FORNAME + " TEXT, "
            + LOGIN + " TEXT, "
            + PASSWORD + " TEXT);";

    public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + USER_TABLE_NAME + ";";

    public UserDAO(Context pContext) {
        super(pContext);
    }

    /**
     * @param u l'utilisateur à ajouter à la base
     */
    public void ajouter(User u) {
        // CODE

        @UserDao
        @Query(value:"INSERT INTO" User "(user_id, name,forname,login,password)" VALUES (1, "test","test2","test3","test4");")

    }

    /**
     * @param user_id l'identifiant de l'utilisateur à supprimer
     */
    public void supprimer(long user_id) {
        // CODE
    }

    /**
     * @param u l'utilisateur modifié
     */
    public void modifier(User u) {
        // CODE
    }

    /**
     * @param user_id l'identifiant du métier à récupérer
     * @return
     */
    public long selectionner(long user_id) {
        return user_id;
    }
}
