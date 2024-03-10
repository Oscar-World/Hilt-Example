package com.example.hiltexample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(ActivityComponent::class)
//@InstallIn(SingletonComponent::class)
class CarModule {

    @Provides
    fun provideCar(engine: Engine): Car {
        return Car(engine)
    }

    @Provides
    fun provideEngine() : Engine {
        return Engine()
    }

}