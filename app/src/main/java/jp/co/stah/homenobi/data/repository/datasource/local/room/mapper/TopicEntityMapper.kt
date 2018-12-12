package jp.co.stah.homenobi.data.repository.datasource.local.room.mapper

import jp.co.stah.homenobi.data.entity.ActEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity

class TopicEntityMapper {
    fun convert(roomActEntity: List<RoomActEntity>) : ActEntity{
        return ActEntity("","", "")
    }
}