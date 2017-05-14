package com.pubuduranasinghe.nsbmbuddy;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Pubudu on 2017-05-14.
 */

public class Utils {
    private static FirebaseDatabase mDatabase;

    public static FirebaseDatabase getDatabase() {
        if(mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
//            mDatabase.setPersistenceEnabled(true);
        }
        return mDatabase;
    }
}
