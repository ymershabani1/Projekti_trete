package com.pt.projekti_trete.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    public static String KEY_SHARED_PREFERENCES = "com.pt.projekti_trete";

    public static SharedPreferences getPrefs(Context context){
        return context.getSharedPreferences(KEY_SHARED_PREFERENCES,Context.MODE_PRIVATE);
    }

    //save boolean
    public static void saveBoolean(Context context,String key,boolean value){
        getPrefs(context).edit().putBoolean(key,value).commit();
    }

    //get boolean
    public static boolean getBoolean(Context context, String key){
        return getPrefs(context).getBoolean(key,false);
    }


    //save String
    public static void saveString(Context context, String key, String value){
        getPrefs(context).edit().putString(key,value).commit();
    }

    //get String
    public static String getString(Context context, String key){
        return getPrefs(context).getString(key,"");
    }









}
