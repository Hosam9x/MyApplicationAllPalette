package com.input.hosam.myapplication

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Hosamo on 30/12/17.
 */
class Person constructor(firstName:String,lastName: String) {

    var name: String = firstName
    var last: String = lastName
    var age: Int = 0

    fun getFullName():String
    {
        return name + " " + last + age
    }
}

