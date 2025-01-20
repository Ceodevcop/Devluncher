package com.devluncher

import com.devluncher.controllers.UserController
import com.devluncher.services.UserService

fun main() {
    println("Welcome to Devluncher!")

    // Initialize services and controllers
    val userService = UserService()
    val userController = UserController(userService)

    // Sample operations
    val user1 = userController.createUser(1, "John Doe", "john.doe@example.com")
    val user2 = userController.createUser(2, "Jane Doe", "jane.doe@example.com")

    println("Created Users:")
    println("User 1: ${user1.name} - ${user1.email}")
    println("User 2: ${user2.name} - ${user2.email}")

    // Retrieve and display a user
    val retrievedUser = userController.getUserById(1)
    if (retrievedUser != null) {
        println("Retrieved User: ${retrievedUser.name} - ${retrievedUser.email}")
    } else {
        println("User not found.")
    }
}
