package com.miempresa.laboratorio9.room

import androidx.room.Database
import com.miempresa.laboratorio9.model.Stopwatch

@Database(entities = [Stopwatch::class], version = 1, exportSchema = false)
abstract class StopwatchDataBase {
    abstract fun stopDao(): StopwatchDataDao
}