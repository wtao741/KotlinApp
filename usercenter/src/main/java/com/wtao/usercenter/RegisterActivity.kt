package com.wtao.usercenter

import android.os.Bundle
import com.wtao.ui.activity.BaseMvpActivity
import com.wtao.usercenter.presenter.RegisterPresenter
import com.wtao.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>() , RegisterView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter();
        mPresenter.mView = this

        mBtregister.setOnClickListener {
            mPresenter.register("","")
        }
    }

    override fun onRegisterResult(success: Boolean) {
        toast("成功")
    }

}