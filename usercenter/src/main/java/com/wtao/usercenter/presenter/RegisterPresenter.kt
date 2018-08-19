package com.wtao.usercenter.presenter

import com.wtao.presenter.BasePresenter
import com.wtao.usercenter.presenter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String) {
        mView.onRegisterResult(true)
    }
}