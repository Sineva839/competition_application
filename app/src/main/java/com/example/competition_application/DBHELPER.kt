package com.example.competition_application

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.TableLayout
import android.widget.Toast

class DBHELPER(val context: Context, val factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context,"appdata",factory,1){
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE user (id INT PRIMARY KEY, login TEXT, pass TEXT, course BYTEARRAY)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS user ")
        onCreate(db)
    }

    fun addUser(user: UserInfo){
        val values = ContentValues()
        values.put("login",user.login)
        values.put("pass",user.password)
        values.put("course",user.courses)

        val db = this.writableDatabase
        db.insert("user",null,values)
        db.close()

    }



}