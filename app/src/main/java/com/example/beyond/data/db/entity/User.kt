package com.example.beyond.data.db.entity

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    val name: String? = null,
    val password: String,
    val languageId: String,
    val gender: String,
    val email: String,
    val datingGender: String,
    val createdAt: String,
    val age: String
    ) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}