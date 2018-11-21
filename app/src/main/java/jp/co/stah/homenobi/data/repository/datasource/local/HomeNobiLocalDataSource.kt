package jp.co.stah.homenobi.data.repository.datasource.local

import jp.co.stah.homenobi.data.entity.TopicEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomTopicEntity

interface HomeNobiLocalDataSource {

    fun getTopicRepositories(topic: String): TopicEntity
    fun insertTopic(topics: List<RoomTopicEntity>)
    fun delete(topic: RoomTopicEntity)
}