package com.dicodingindepe.simplemvp.view

import com.dicodingindepe.simplemvp.model.User

interface MainView {
    fun showUserList(data:List<User>)
}