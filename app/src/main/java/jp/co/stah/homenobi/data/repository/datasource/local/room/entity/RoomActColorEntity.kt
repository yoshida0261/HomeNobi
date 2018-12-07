package jp.co.stah.homenobi.data.repository.datasource.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoomActColorEntity(
    @PrimaryKey var uid: Int,
    @ColumnInfo(name = "background_color") var backgoundColor: String,
    @ColumnInfo(name = "text_color") var textColor: String
)
