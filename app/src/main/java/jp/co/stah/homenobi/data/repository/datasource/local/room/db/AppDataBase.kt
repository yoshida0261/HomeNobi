package jp.co.stah.homenobi.data.repository.datasource.local.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import jp.co.stah.homenobi.data.repository.datasource.local.room.dao.RoomActDao
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity


@Database(entities = arrayOf(RoomActEntity::class), version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun topicDao(): RoomActDao

    companion object {
        private var INSTANCE: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase? {
            if (INSTANCE == null) {
                synchronized(AppDataBase::class) {
                    /*
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        RoomActEntity::class.java, "MyDatabase.db")
                        .build()*/
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}