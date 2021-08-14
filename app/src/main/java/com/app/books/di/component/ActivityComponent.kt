package com.app.books.di.component

import com.app.books.di.module.ActivityModule
import com.app.books.ui.main.MainActivity
import dagger.Component

/**
 * Created by tt on 20/02/2021.
 */
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}