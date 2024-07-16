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
package com.veea.wifianalyzer.navigation

import android.view.MenuItem
import com.veea.wifianalyzer.MainActivity
import com.veea.wifianalyzer.R
import com.veea.wifianalyzer.navigation.availability.NavigationOption
import com.veea.wifianalyzer.navigation.availability.navigationOptionAp
import com.veea.wifianalyzer.navigation.availability.navigationOptionOff
import com.veea.wifianalyzer.navigation.availability.navigationOptionOther
import com.veea.wifianalyzer.navigation.availability.navigationOptionRating
import com.veea.wifianalyzer.navigation.availability.navigationOptionWiFiSwitchOn
import com.veea.wifianalyzer.navigation.items.NavigationItem
import com.veea.wifianalyzer.navigation.items.navigationItemAbout
import com.veea.wifianalyzer.navigation.items.navigationItemAccessPoints
import com.veea.wifianalyzer.navigation.items.navigationItemChannelAvailable
import com.veea.wifianalyzer.navigation.items.navigationItemChannelGraph
import com.veea.wifianalyzer.navigation.items.navigationItemChannelRating
import com.veea.wifianalyzer.navigation.items.navigationItemExport
import com.veea.wifianalyzer.navigation.items.navigationItemPortAuthority
import com.veea.wifianalyzer.navigation.items.navigationItemSettings
import com.veea.wifianalyzer.navigation.items.navigationItemTimeGraph
import com.veea.wifianalyzer.navigation.items.navigationItemVendors

enum class NavigationMenu(
    val icon: Int,
    val title: Int,
    val navigationItem: NavigationItem,
    val navigationOptions: List<NavigationOption> = navigationOptionOff
) {
    ACCESS_POINTS(R.drawable.ic_network_wifi, R.string.action_access_points, navigationItemAccessPoints, navigationOptionAp),
    CHANNEL_RATING(R.drawable.ic_wifi_tethering, R.string.action_channel_rating, navigationItemChannelRating, navigationOptionRating),
    CHANNEL_GRAPH(R.drawable.ic_insert_chart, R.string.action_channel_graph, navigationItemChannelGraph, navigationOptionOther),
    TIME_GRAPH(R.drawable.ic_show_chart, R.string.action_time_graph, navigationItemTimeGraph, navigationOptionOther),
    EXPORT(R.drawable.ic_import_export, R.string.action_export, navigationItemExport),
    CHANNEL_AVAILABLE(R.drawable.ic_location_on, R.string.action_channel_available, navigationItemChannelAvailable),
    VENDORS(R.drawable.ic_list, R.string.action_vendors, navigationItemVendors),
    PORT_AUTHORITY(R.drawable.ic_lan, R.string.action_port_authority, navigationItemPortAuthority),
    SETTINGS(R.drawable.ic_settings, R.string.action_settings, navigationItemSettings),
    ABOUT(R.drawable.ic_info_outline, R.string.action_about, navigationItemAbout);

    fun activateNavigationMenu(mainActivity: MainActivity, menuItem: MenuItem): Unit =
        navigationItem.activate(mainActivity, menuItem, this)

    fun activateOptions(mainActivity: MainActivity): Unit = navigationOptions.forEach { it(mainActivity) }

    fun wiFiBandSwitchable(): Boolean = navigationOptions.contains(navigationOptionWiFiSwitchOn)

    fun registered(): Boolean = navigationItem.registered

}