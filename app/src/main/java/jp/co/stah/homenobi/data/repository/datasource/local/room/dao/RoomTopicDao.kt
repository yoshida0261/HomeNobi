package jp.co.stah.homenobi.data.repository.datasource.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomTopicEntity

@Dao
interface RoomTopicDao {
    @Query("SELECT * FROM topic")
    fun getAll(): List<RoomTopicEntity>

    @Insert
    fun insertAll(vararg topics: RoomTopicEntity)

    @Delete
    fun delete(topic: RoomTopicEntity)
}
