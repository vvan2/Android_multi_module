package org.umc.eatthis_compose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class EatthisApplication : Application() {
    @Inject
    override fun onCreate() {
        super.onCreate()
    }
}