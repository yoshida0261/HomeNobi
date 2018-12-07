package jp.co.stah.homenobi.data.repository.datasource.local

import jp.co.stah.homenobi.data.entity.ActEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.db.AppDataBase
import jp.co.stah.homenobi.data.repository.datasource.local.room.entity.RoomActEntity
import jp.co.stah.homenobi.data.repository.datasource.local.room.mapper.TopicEntityMapper

class HomeNobiRoomDataSource(db : AppDataBase, mapper: TopicEntityMapper): HomeNobiLocalDataSource {
    private val db = db
    private val mapper = mapper

    override fun getTopicRepositories(topic: String): ActEntity {
        val repoTopic = db.topicDao().getAll()
        return mapper.convert(repoTopic)


    }

    override fun insertTopic(acts: List<RoomActEntity>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(act: RoomActEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}