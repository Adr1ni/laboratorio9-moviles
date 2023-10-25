package com.miempresa.laboratorio9.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import com.miempresa.laboratorio9.model.Stopwatch


@Dao
interface StopwatchDataDao {

    @Query("SELECT * FROM stopwatch")
    fun getStopWatch(): Flow<List<Stopwatch>>

    @Query("SELECT * FROM stopwatch WHERE id = :id")
    fun getStopWatchById(id: Long): Flow<Stopwatch>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(stopwatch: Stopwatch)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(stopwatch: Stopwatch)

    @Delete
    suspend fun delete(stopwatch: Stopwatch)
}