package com.wtao.presenter

import com.wtao.presenter.view.BaseView

open class BasePresenter<T:BaseView>{
    lateinit var mView : T
}