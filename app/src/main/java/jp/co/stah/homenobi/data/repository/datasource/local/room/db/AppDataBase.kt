package jp.co.stah.homenobi.data.repository.datasource.local.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import jp.co.stah.homenobi.data.repository.datasource.local.room.dao.RoomActDao
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity


@Database(entities = arrayOf(RoomActEntity::class), version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun topicDao(): RoomActDao
}