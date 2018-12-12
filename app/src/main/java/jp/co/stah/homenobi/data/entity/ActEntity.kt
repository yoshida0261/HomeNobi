package jp.co.stah.homenobi.data.entity

import androidx.room.Entity

@Entity
data class ActEntity (
    val name:String,
    val date:String,
    val image:Int,
    val discription : String)
