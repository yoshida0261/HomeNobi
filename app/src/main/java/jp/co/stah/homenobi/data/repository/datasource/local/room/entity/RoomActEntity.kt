package jp.co.stah.homenobi.data.repository.datasource.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "act"
    //  indices = {@Index(value = )}
)
data class RoomActEntity(
    @PrimaryKey var uid: Int,
    @ColumnInfo(name = "topic_name") var topicName: String?,
    @ColumnInfo(name = "option") var option: String?,
    @ColumnInfo(name = "icon") var icon: String?,
    @ColumnInfo(name = "topic_color") var actColor: RoomActColorEntity
)