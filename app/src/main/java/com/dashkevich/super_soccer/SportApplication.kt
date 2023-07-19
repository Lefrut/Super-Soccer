package com.dashkevich.super_soccer

import android.app.Application
import com.dashkevich.data.di.dataModules
import com.dashkevich.domain.di.domainModules
import com.dashkevich.super_soccer.di.appModule
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

const val ONESIGNAL_APP_ID = "2b6dfcd5-2951-4ea7-96f4-cd8f266e551d"

class SportApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@SportApplication)
            modules(appModule)
        }
        try {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(ONESIGNAL_APP_ID)
            OneSignal.promptForPushNotifications()
        }finally {}
    }

}