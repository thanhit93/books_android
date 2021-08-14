package com.app.books.di.component

import com.app.books.di.module.FragmentModule
import com.app.books.ui.about.AboutFragment
import com.app.books.ui.list.ListFragment
import dagger.Component

/**
 * Created by tt on 20/02/2021.
 */
@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}