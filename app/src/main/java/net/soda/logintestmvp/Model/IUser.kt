package net.soda.logintestmvp.Model

interface IUser {
    fun getEmail(): String
    fun getPassword(): String
    fun isValidData(): Boolean
}