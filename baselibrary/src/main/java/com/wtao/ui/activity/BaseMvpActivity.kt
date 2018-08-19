package com.wtao.ui.activity

import com.wtao.presenter.BasePresenter
import com.wtao.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(),BaseView{

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}