package com.app.books.ui.main

import com.app.books.ui.base.BaseContract

/**
 * Created by tt on 20/02/2021.
 */
class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        fun onDrawerOptionAboutClick()
    }
}