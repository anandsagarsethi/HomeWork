package com.anand.homework.db

import androidx.room.Database
import androidx.room.RoomDatabase

import com.anand.homework.db.dao.DBuserinfoDao

@Database(entities = [DbworkUserInfo::class], version = 1)
//@TypeConverters(StudentTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun dBUserInfoDao(): DBuserinfoDao

}