package jp.co.stah.homenobi.data.repository.datasource.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity

@Dao
interface RoomActDao {
    @Query("SELECT * FROM act")
    fun getAll(): List<RoomActEntity>

    @Insert
    fun insertAll(vararg acts: RoomActEntity)

    @Delete
    fun delete(act: RoomActEntity)
}
