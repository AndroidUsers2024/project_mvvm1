package com.example.project_mvvm.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message : String)
}