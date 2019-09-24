package com.anand.homework.db

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class DbworkUserInfo(
    @PrimaryKey
    @NonNull
    val name:String,
    val phone:String?
) {

    override fun toString(): String {
        return name + "\n" + phone
    }

}