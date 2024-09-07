package com.example.project_mvvm.ui.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.project_mvvm.R
import com.example.project_mvvm.databinding.ActivityLoginBinding
import com.example.project_mvvm.util.makeToast

class LoginActivity : AppCompatActivity(),AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
        val dataBinding:ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewmodel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        dataBinding.viewmodel = viewmodel
        viewmodel.authListener=this

    }

    override fun onStarted() {
        makeToast("Started")
    }

    override fun onSuccess() {
        makeToast("Success")
    }

    override fun onFailure(message: String) {
        makeToast(message)
    }
}