package com.anand.homework.db.dao

import androidx.room.*
import com.anand.homework.db.DbworkUserInfo


@Dao
interface DBuserinfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(recording: DbworkUserInfo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(recordingList: List<DbworkUserInfo>)

    @Query("SELECT * FROM DbworkUserInfo WHERE name = :name")
    fun get(name: String): DbworkUserInfo?

    @Query("SELECT * FROM DbworkUserInfo ORDER BY name DESC")
    fun getAll(): List<DbworkUserInfo>?

    @Query("SELECT * FROM DbworkUserInfo ORDER BY name DESC LIMIT :limit OFFSET :offset")
    fun getAllByOffsetAndLimit(offset: Int, limit: Int): List<DbworkUserInfo>?

    @Delete
    fun delete(recording: DbworkUserInfo)
}