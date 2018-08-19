package com.wtao.usercenter.presenter.view

import com.wtao.presenter.view.BaseView

open interface RegisterView : BaseView{

    fun onRegisterResult(success : Boolean)
}