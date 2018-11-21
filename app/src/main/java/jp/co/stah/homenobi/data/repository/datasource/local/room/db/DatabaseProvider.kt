package jp.co.stah.homenobi.data.repository.datasource.local.room.db

import android.content.Context
import androidx.room.Room

class DatabaseProvider {
    private val DB_NAME: String = "homenobi_db"

    fun createDatabase(context: Context): AppDataBase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDataBase::class.java, DB_NAME
        )
            .allowMainThreadQueries()
            .build()
    }

    companion object Factory {
        lateinit var instance: AppDataBase

        fun getInstance(context:Context):AppDataBase{
            if(instance==null){
                instance = DatabaseProvider().createDatabase(context)
            }
            return instance
        }
    }
}