package com.example.avdetails.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.avdetails.dao.UserDao
import com.example.avdetails.dao.FlightDao
import com.example.avdetails.dao.BookingDao
import com.example.avdetails.entity.User
import com.example.avdetails.entity.Flight
import com.example.avdetails.entity.Booking

@Database(entities = [User::class, Flight::class, Booking::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun flightDao(): FlightDao
    abstract fun bookingDao(): BookingDao
}
