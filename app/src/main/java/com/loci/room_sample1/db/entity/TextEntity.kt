package com.loci.room_sample1.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.util.Date


@Entity(tableName = "text_table")
data class TextEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "text")
    val text: String,
    @ColumnInfo(name = "currentDate")
    val currentDate: Date
)

class MyConverters {

    @TypeConverter
    fun fromTimestampToDate(value: Long): Date {
        return Date(value)
    }

    @TypeConverter
    fun fromDateToTimestamp(date: Date): Long {
        return date.time
    }
}


