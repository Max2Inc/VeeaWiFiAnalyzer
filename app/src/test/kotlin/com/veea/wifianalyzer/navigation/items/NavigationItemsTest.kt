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
package com.veea.wifianalyzer.navigation.items

import android.os.Build
import android.view.View
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.veea.wifianalyzer.about.AboutFragment
import com.veea.wifianalyzer.settings.SettingsFragment
import com.veea.wifianalyzer.vendor.VendorFragment
import com.veea.wifianalyzer.wifi.accesspoint.AccessPointsFragment
import com.veea.wifianalyzer.wifi.channelavailable.ChannelAvailableFragment
import com.veea.wifianalyzer.wifi.channelgraph.ChannelGraphFragment
import com.veea.wifianalyzer.wifi.channelrating.ChannelRatingFragment
import com.veea.wifianalyzer.wifi.timegraph.TimeGraphFragment
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Build.VERSION_CODES.TIRAMISU])
class NavigationItemsTest {
    @Test
    fun testFragmentItem() {
        assertTrue((navigationItemAccessPoints as FragmentItem).fragment is AccessPointsFragment)
        assertTrue((navigationItemChannelRating as FragmentItem).fragment is ChannelRatingFragment)
        assertTrue((navigationItemChannelGraph as FragmentItem).fragment is ChannelGraphFragment)
        assertTrue((navigationItemTimeGraph as FragmentItem).fragment is TimeGraphFragment)
        assertTrue((navigationItemChannelAvailable as FragmentItem).fragment is ChannelAvailableFragment)
        assertTrue((navigationItemVendors as FragmentItem).fragment is VendorFragment)
        assertTrue((navigationItemSettings as FragmentItem).fragment is SettingsFragment)
        assertTrue((navigationItemAbout as FragmentItem).fragment is AboutFragment)
    }

    @Test
    fun testRegisteredTrue() {
        assertTrue(navigationItemAccessPoints.registered)
        assertTrue(navigationItemChannelRating.registered)
        assertTrue(navigationItemChannelGraph.registered)
        assertTrue(navigationItemTimeGraph.registered)
    }

    @Test
    fun testRegisteredFalse() {
        assertFalse(navigationItemExport.registered)
        assertFalse(navigationItemChannelAvailable.registered)
        assertFalse(navigationItemVendors.registered)
        assertFalse(navigationItemSettings.registered)
        assertFalse(navigationItemAbout.registered)
    }

    @Test
    fun testVisibility() {
        assertEquals(View.VISIBLE, navigationItemAccessPoints.visibility)
        assertEquals(View.VISIBLE, navigationItemChannelRating.visibility)
        assertEquals(View.VISIBLE, navigationItemChannelGraph.visibility)
        assertEquals(View.VISIBLE, navigationItemTimeGraph.visibility)
        assertEquals(View.VISIBLE, navigationItemChannelAvailable.visibility)
        assertEquals(View.GONE, navigationItemVendors.visibility)
        assertEquals(View.GONE, navigationItemExport.visibility)
        assertEquals(View.GONE, navigationItemSettings.visibility)
        assertEquals(View.GONE, navigationItemAbout.visibility)
    }

    @Test
    fun testExportItem() {
        assertTrue(navigationItemExport is ExportItem)
    }
}