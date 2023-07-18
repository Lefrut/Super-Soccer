package com.dashkevich.super_soccer

import android.app.Application
import com.dashkevich.data.di.dataModules
import com.dashkevich.domain.di.domainModules
import com.dashkevich.super_soccer.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class SportApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@SportApplication)
            modules(appModule)
        }
    }

}