package jp.co.stah.homenobi.data.repository

import jp.co.stah.homenobi.data.entity.ActEntity

interface HomeNobiRepository {

    fun getTopicRepositories(topic:String ): List<ActEntity>

}