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
package com.veea.wifianalyzer.wifi.predicate

import com.veea.wifianalyzer.wifi.model.WiFiDetail
import com.veea.wifianalyzer.wifi.model.WiFiIdentifier
import com.veea.wifianalyzer.wifi.model.WiFiSecurity
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SSIDPredicateTest {
    @Test
    fun testSSIDPredicate() {
        // setup
        val wiFiDetail = WiFiDetail(WiFiIdentifier("ssid", "bssid"), WiFiSecurity("wpa"))
        // execute & validate
        assertTrue("ssid".predicate()(wiFiDetail))
        assertTrue("id".predicate()(wiFiDetail))
        assertTrue("ss".predicate()(wiFiDetail))
        assertTrue("s".predicate()(wiFiDetail))
        assertTrue("".predicate()(wiFiDetail))
        assertFalse("SSID".predicate()(wiFiDetail))
        assertFalse("B".predicate()(wiFiDetail))
    }
}