package jp.co.stah.homenobi.data.repository.datasource.local

import jp.co.stah.homenobi.data.entity.ActEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity

interface HomeNobiLocalDataSource {

    fun getTopicRepositories(act: String): ActEntity
    fun insertTopic(acts: List<RoomActEntity>)
    fun delete(act: RoomActEntity)
}