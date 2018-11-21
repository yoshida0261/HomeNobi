package jp.co.stah.homenobi.data.repository.datasource.local.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import jp.co.stah.homenobi.data.repository.datasource.local.room.dao.RoomTopicDao
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomTopicEntity


@Database(entities = arrayOf(RoomTopicEntity::class), version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun topicDao(): RoomTopicDao
}