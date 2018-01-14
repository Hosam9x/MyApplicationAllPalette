package com.input.hosam.myapplication

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Hosamo on 30/12/17.
 */
class Person(firstName:String,lastName: String) {

    var name: String = firstName
    var last: String = lastName
    var age: Int = 0

    override fun toString(): String {
        return name + " " + last + " " + age
    }

    fun getFullName():String
    {
        return name + " " + last + age
    }
}

