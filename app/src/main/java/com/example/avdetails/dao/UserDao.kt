package com.example.avdetails.dao

import androidx.room.*
import com.example.avdetails.entity.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE nickname = :nickname AND password = :password")
    suspend fun getUser(nickname: String, password: String): User?

    @Query("SELECT * FROM users WHERE role = :role")
    suspend fun getUsersByRole(role: String): List<User> // Получение пользователей по роли

    @Query("SELECT role FROM users WHERE nickname = :nickname")
    suspend fun getUserRole(nickname: String): String? // Получение роли пользователя по никнейму

    @Query("SELECT id FROM users WHERE nickname = :nickname")
    suspend fun getUserIdByNickname(nickname: String): Int?
}
