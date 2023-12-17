package com.mehmetkaanaydenk.gamelibrary.data.di

import com.mehmetkaanaydenk.gamelibrary.data.remote.GameAPI
import com.mehmetkaanaydenk.gamelibrary.data.repository.GameRepositoryImpl
import com.mehmetkaanaydenk.gamelibrary.domain.repository.GameRepository
import com.mehmetkaanaydenk.gamelibrary.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGameApi(): GameAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GameAPI::class.java)

    }

    @Provides
    @Singleton
    fun provideGameRepository(api: GameAPI): GameRepository {
        return GameRepositoryImpl(api = api)
    }

}