package com.app.books.di.component

import com.app.books.BaseApp
import com.app.books.di.module.ApplicationModule
import dagger.Component

/**
 * Created by tt on 20/02/2021.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}