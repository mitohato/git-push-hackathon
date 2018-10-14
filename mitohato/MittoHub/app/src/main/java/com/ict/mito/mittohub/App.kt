package com.ict.mito.mittohub

import androidx.multidex.MultiDexApplication
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

/**
 * Created by mito on 2018/10/14.
 */
class App : MultiDexApplication() {
    
    override fun onCreate() {
        super.onCreate()
        startKoin(
                this,
                listOf(module)
        )
    }
    
    private val module: Module = module {
    }
}