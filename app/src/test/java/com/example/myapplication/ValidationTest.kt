package com.example.myapplication

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class ValidationTest {
    @Test
    fun password_Blank(){
        val validation = Validation()
        val result = validation.isValidPassword("  ")
        assertEquals("Password is blank", result)
    }
    @Test
    fun password_Empty(){
        val validation = Validation()
        val result = validation.isValidPassword("")
        assertEquals("Password is empty", result)
    }
    @Test
    fun passwordLessthan6Char() {
        val validation = Validation()
        val result = validation.isValidPassword("ab")
        assertEquals("Password length should be more than 6 char", result)
    }
    @Test
    fun passwordGreaterThan15Char() {
        val validation = Validation()
        val result = validation.isValidPassword("qwertyuiopasdf323gh")
        assertEquals("Password length should be less than 15 char", result)
    }
    fun password_Valid() {
        val validation = Validation()
        val result = validation.isValidPassword("password123")
        assertEquals("Valid", result)
    }
}