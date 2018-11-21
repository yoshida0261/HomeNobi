package jp.co.stah.homenobi.data.repository.datasource.local.room.mapper

import jp.co.stah.homenobi.data.entity.TopicEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomTopicEntity

class TopicEntityMapper {
    fun convert(roomTopicEntity: List<RoomTopicEntity>) : TopicEntity{
        return TopicEntity()
    }
}