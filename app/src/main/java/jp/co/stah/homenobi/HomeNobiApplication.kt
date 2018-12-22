package jp.co.stah.homenobi

import android.app.Application
import android.os.SystemClock
import timber.log.Timber
import java.util.concurrent.TimeUnit

class HomeNobiApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        SystemClock.sleep(TimeUnit.MILLISECONDS.toMillis(1300))

    }

}