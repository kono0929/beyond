package com.example.beyond.data.repository

import com.example.beyond.data.db.entity.User
import com.example.beyond.data.network.UserFB

class UserRepository  constructor(
     private val webservice: UserFB
){
   // suspend fun getUser(userId: String): User {
//        val cached: User = userCache.get(userId)
//        if (cached != null) {
//            return cached
//        }

//         This implementation is still suboptimal but better than before.
//         A complete implementation also handles error cases.
//        val freshUser = webservice.getUser(userId)
//        userCache.put(userId, freshUser)
       // webservice.initializeDbRef()
        //webservice.addUserInfoEventListener(userId)


   // }

}
