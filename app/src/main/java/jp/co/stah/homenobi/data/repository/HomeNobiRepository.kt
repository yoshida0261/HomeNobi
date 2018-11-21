package jp.co.stah.homenobi.data.repository

import jp.co.stah.homenobi.data.entity.TopicEntity

interface HomeNobiRepository {

    fun getTopicRepositories(topic:String ): List<TopicEntity>

}