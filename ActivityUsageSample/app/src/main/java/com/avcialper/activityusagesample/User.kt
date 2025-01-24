package com.avcialper.activityusagesample

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val name: String, val surname: String) : Parcelable