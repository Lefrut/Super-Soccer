package com.dashkevich.data.di

import android.content.Context
import androidx.room.Room
import com.dashkevich.data.api.ApiSoccer
import com.dashkevich.data.api.BASE_URL
import com.dashkevich.data.database.SportDatabase
import com.dashkevich.data.repository.ApiRepositoryImpl
import com.dashkevich.data.repository.DatabaseRepositoryImpl
import com.dashkevich.domain.repository.ApiRepository
import com.dashkevich.domain.repository.DatabaseRepository
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.get
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal const val DBName = "database"

internal val roomModule = module {
    single<SportDatabase> {
        Room.databaseBuilder(
            get(Context::class.java),
            SportDatabase::class.java,
            DBName
        ).build()
    }
}

internal val retrofitModule = module {
    single<Retrofit> {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    single<ApiSoccer> {
        get<Retrofit>().create(ApiSoccer::class.java)
    }
}

internal val repositoryModule = module {

    single<ApiRepository> {
        ApiRepositoryImpl(get())
    }

    single<DatabaseRepository> {
        DatabaseRepositoryImpl(get())
    }

}

val dataModules = module {
    includes(retrofitModule, repositoryModule, roomModule)
}
