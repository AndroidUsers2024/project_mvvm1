
package com.example.project_mvvm.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password : String? = null

    var authListener: AuthListener? = null

    fun onButtonClicked(view : View) {
        authListener?.onStarted()
        if(email.isNullOrEmpty()||password.isNullOrEmpty()){
            //popup
            authListener?.onFailure("Invalid ")
            return
        }
        //success
        authListener?.onSuccess()

    }
}