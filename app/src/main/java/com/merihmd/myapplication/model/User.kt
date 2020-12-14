package com.merihmd.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val name : String,
    val jurusan : String,
    val semester : String
    ) : Parcelable