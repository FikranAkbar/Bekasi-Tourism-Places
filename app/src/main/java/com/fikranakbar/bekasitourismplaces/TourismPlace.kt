package com.fikranakbar.bekasitourismplaces

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TourismPlace(
    var name: String = "",
    var desc: String = "",
    var location: String = "",
    var operationHour: String = "",
    var ticketPrice: String = "",
    var imageHeader: Int = 0
) : Parcelable
