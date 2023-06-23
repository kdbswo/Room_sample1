package com.loci.room_sample1.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "text_table")
data class TextEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "text")
    val text: String,
    @ColumnInfo(name = "text2", defaultValue = "text2 default")
    val text2: String
)