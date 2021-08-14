package com.app.books.ui.list

import com.app.books.ui.base.BaseContract
import com.app.books.models.DetailsViewModel
import com.app.books.models.Post

/**
 * Created by tt on 20/02/2021.
 */
class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}