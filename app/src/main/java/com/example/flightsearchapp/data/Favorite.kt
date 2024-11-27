package com.example.flightsearchapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.flightsearchapp.data.Airport
import com.example.flightsearchapp.data.AirportConverter

@Entity(tableName = "favorite")
@TypeConverters(AirportConverter::class)
data class Favorite(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "departure_code")
    val departureAirport: Airport,
    @ColumnInfo(name = "destination_code")
    val destinationAirport: Airport
)


