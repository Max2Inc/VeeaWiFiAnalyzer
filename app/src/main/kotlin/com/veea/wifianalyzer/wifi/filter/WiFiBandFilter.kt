/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2024 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.veea.wifianalyzer.wifi.filter

import android.app.AlertDialog
import com.veea.wifianalyzer.R
import com.veea.wifianalyzer.wifi.band.WiFiBand
import com.veea.wifianalyzer.wifi.filter.adapter.WiFiBandAdapter

internal class WiFiBandFilter(wiFiBandAdapter: WiFiBandAdapter, alertDialog: AlertDialog) :
    EnumFilter<WiFiBand, WiFiBandAdapter>(
        mapOf(
            WiFiBand.GHZ2 to R.id.filterWifiBand2,
            WiFiBand.GHZ5 to R.id.filterWifiBand5,
            WiFiBand.GHZ6 to R.id.filterWifiBand6
        ),
        wiFiBandAdapter,
        alertDialog,
        R.id.filterWiFiBand
    )