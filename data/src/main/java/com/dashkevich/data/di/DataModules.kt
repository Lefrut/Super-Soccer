package com.dashkevich.data.di

import com.dashkevich.data.api.API
import com.dashkevich.data.api.BASE_URL
import com.dashkevich.data.repository.ApiRepositoryImpl
import com.dashkevich.domain.repository.ApiRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



internal val retrofitModule = module{
    single<Retrofit> {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    single<API> {
        get<Retrofit>().create(API::class.java)
    }
}

internal val repositoryModule = module {

    single<ApiRepository> {
        ApiRepositoryImpl(get())
    }

}

val dataModules = module {
    includes(retrofitModule, repositoryModule)
}