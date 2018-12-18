package jp.co.stah.homenobi

import android.app.Application
import timber.log.Timber

class HomeNobiApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }

}