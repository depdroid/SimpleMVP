package com.dicodingindepe.simplemvp.utils

import com.dicodingindepe.simplemvp.model.User

class ApiRepository {
val data  = arrayListOf(
    User("Adhika","Jl. Dr.Cipto"),
    User("Macc", "Jl. Simpang Dukuh"),
    User("Agus" ,"Jl Rungkut Asri"),
    User("Tony Stark" ,"Jl Raya Asri"),
    User("Peter Parker" ,"Jl Singapore Asri"),
    User("Bruce Banner" ,"Jl Bali Asri"),
    User("Natasha" ,"Jl Jakarta"),
    User("Stephen Vincent Strange" ,"Jl Alam")
)
        fun getListUser()= data




}