package com.example.beyond.data.network

import android.util.Log
import com.example.beyond.data.db.entity.User
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

abstract class UserFB {
    private val TAG = "UserFB"

    // [START declare_database_ref]
    private lateinit var db: DatabaseReference

    // [START rtdb_write_new_user]
    fun writeNewUser(userId: String,
                     name: String,
                     password: String,
                     languageId: String,
                     gender: String,
                     email: String,
                     datingGender: String,
                     createdAt: String,
                     age: String) {
        val user = User(name, password, languageId, gender, email, datingGender, createdAt, age)

        db.child("users").child(userId).setValue(user)
    }
    fun writeNewUserWithTaskListeners(userId: String,
                                      name: String,
                                      password: String,
                                      languageId: String,
                                      gender: String,
                                      email: String,
                                      datingGender: String,
                                      createdAt: String,
                                      age: String)
    {
        val user = User(name, password, languageId, gender, email, datingGender, createdAt, age)

        // [START rtdb_write_new_user_task]
        db.child("users").child(userId).setValue(user)
            .addOnSuccessListener {
                // Write was successful!
                // ...
            }
            .addOnFailureListener {
                // Write failed
                // ...
            }
        // [END rtdb_write_new_user_task]
    }
    private fun addUserInfoEventListener(userInfoReference: DatabaseReference) {
        // [START user_value_event_listener]
        val userInfoListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get user object and use the values to update the UI
                val userInfo = dataSnapshot.getValue<User>()
                println(userInfo)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadUser:onCancelled", databaseError.toException())
            }
        }
        userInfoReference.addValueEventListener(userInfoListener)
        // [END post_value_event_listener]
    }

}
