package com.example.kuit7th_api_practice.di

import com.example.kuit7th_api_practice.data.mock.InMemoryMockPostDataSource
import com.example.kuit7th_api_practice.data.mock.PostLocalDataSource
<<<<<<< HEAD
import com.example.kuit7th_api_practice.data.repository.FavoriteRepository
import com.example.kuit7th_api_practice.data.repositoryimpl.FavoriteRepositoryImpl
=======
>>>>>>> 2d00d38cb906b526729d7106c165368d9e80b23f
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class PostDataModule {

    @Binds
    @Singleton
    abstract fun bindPostLocalDataSource(
        dataSource: InMemoryMockPostDataSource
    ): PostLocalDataSource
<<<<<<< HEAD

    @Binds
    @Singleton
    abstract fun bindFavoriteRepository(
        repository: FavoriteRepositoryImpl
    ): FavoriteRepository
=======
>>>>>>> 2d00d38cb906b526729d7106c165368d9e80b23f
}
