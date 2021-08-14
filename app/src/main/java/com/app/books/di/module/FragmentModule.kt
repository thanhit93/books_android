package com.app.books.di.module

import com.app.books.api.ApiServiceInterface
import com.app.books.ui.about.AboutContract
import com.app.books.ui.about.AboutPresenter
import com.app.books.ui.list.ListContract
import com.app.books.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}