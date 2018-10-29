package com.dicodingindepe.simplemvp.presenter

import android.util.Log
import com.dicodingindepe.simplemvp.model.User
import com.dicodingindepe.simplemvp.utils.ApiRepository
import com.dicodingindepe.simplemvp.view.MainView

class MainPresenter(val mainView: MainView, val api:ApiRepository ) {
    fun getUserData(){
        val data = api.getListUser()

        mainView.showUserList(data)
    }

    fun removeUser(name:String){
        Log.d("test","remove")
        val data = api.getListUser().apply {
            val user = this.find { it.name.contentEquals(name) }
            Log.d("test",user.toString())
            this.remove(user)
        }

        mainView.showUserList(data)
    }



}