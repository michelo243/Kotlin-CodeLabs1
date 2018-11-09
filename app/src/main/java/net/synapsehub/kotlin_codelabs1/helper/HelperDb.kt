package net.synapsehub.kotlin_codelabs1.helper

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import net.synapsehub.kotlin_codelabs1.model.Humain

val DATABASE_NAME="codelabs.db"
val TABLE_NAME="Users"
val COL_NAME="name"
val COL_USERNAME="username"
val COL_PASSWORD="password"
val COL_ID="_id"


class HelperDb(var context: Context) :SQLiteOpenHelper(context, DATABASE_NAME, null,1){


    override fun onCreate(db: SQLiteDatabase?) {
        val tableCREATE="CREATE TABLE "+ TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_NAME + " VARCHAR (100)," +
                COL_USERNAME + " VARCHAR," +
                COL_PASSWORD + " VARCHAR)"
        db?.execSQL(tableCREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insererDonnees(humain:Humain){
        val db=this.writableDatabase
        val contentValues=ContentValues()

        contentValues.put(COL_NAME,humain.name)
        contentValues.put(COL_USERNAME,humain.username)
        contentValues.put(COL_PASSWORD,humain.password)

        var result= db.insert(TABLE_NAME,null,contentValues)

        if(result == -1.toLong())
            Toast.makeText(context,"Echec d'enregistrement",Toast.LENGTH_LONG).show()
        else
            Toast.makeText(context,"Enregistrement reussi",Toast.LENGTH_LONG).show()


    }


}
