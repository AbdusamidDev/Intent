package com.example.homework8.models

import java.io.Serializable

class User : Serializable {
    var name: String? = null
    var age: Int? = null

    constructor(name: String?, age: Int?) {
        this.name = name
        this.age = age
    }
}