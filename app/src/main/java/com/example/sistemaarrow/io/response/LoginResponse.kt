package com.example.sistemaarrow.io.response

import com.example.sistemaarrow.model.User

class LoginResponse (val success:Boolean,
val user: User, val rol: String, val jwt: String)