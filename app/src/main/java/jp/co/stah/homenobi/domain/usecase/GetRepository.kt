package jp.co.stah.homenobi.domain.usecase

import jp.co.stah.homenobi.data.entity.ActEntity
import jp.co.stah.homenobi.data.repository.HomeNobiInfraRepository

object GetRepository {

    // 取得処理
    fun getActList(): List<ActEntity> {
        val repo = HomeNobiInfraRepository()
        return repo.getTopicRepositories("act")
    }
}