package com.example.competition_application

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.TableLayout
import android.widget.Toast

class DBHELPER(val context: Context, val factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context,"appdata",factory,1){
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE user (id INT PRIMARY KEY, login TEXT, pass TEXT)")
        db!!.execSQL("CREATE TABLE courses (id INT PRIMARY KEY, c_id, name TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS user ")
        onCreate(db)
    }

    fun addUser(user: UserInfo){
        val values = ContentValues()
        values.put("login",user.login)
        values.put("pass",user.password)
        //Toast.makeText(context,"${user.login} зареган",Toast.LENGTH_SHORT).show()



        val db = this.writableDatabase
        db.insert("user",null,values)
        db.close()
    }

    fun addCourse(name: String , id: Int){
        val values = ContentValues()
        values.put("c_id",name)
        values.put("name",id)
       // Toast.makeText(context,"${user.login} зареган",Toast.LENGTH_SHORT).show()



        val db = this.writableDatabase
        db.insert("courses",null,values)
        db.close()
    }
    fun checkUser(): Boolean {
        val db = this.readableDatabase
        val result = db.rawQuery("SELECT * FROM user WHERE login = '*'",null)
        return result.moveToFirst()
    }

    fun checkCourse(id: Int): Boolean {
        val db = this.readableDatabase
        val result = db.rawQuery("SELECT * FROM courses WHERE c_id = '$id'",null)
        return result.moveToFirst()
    }

   fun updateFunc(items: ArrayList<ItemCls>) {
        val db = DBHELPER(context, factory)

        if (db.checkUser()) {
            for (i in items) {
                i.access_valid = db.checkCourse(i.id)
            }
        }
    }


}