package com.example.myapplication

class Validation {
    fun isValidPassword(password:String) = when{

        password.isEmpty() ->{
            "Password is empty"
        }
        password.isBlank() ->{
            "Password is blank"
        }
        password.length < 6 ->{
          "Password length should be more than 6 char"
        }
        password.length > 15 ->{
            "Password length should be less than 15 char"

        }else ->{
            "Valid"
        }
//        if (password.isEmpty())
//            print("Password is empty")
//        }
    }
}