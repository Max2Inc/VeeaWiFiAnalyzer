<h1>VeeaWiFiAnalyzer</h1>

VeeaWifiAnalyzer, inspired by the open-source WiFi Analyzer app. We've added several functionalities and customized it to meet our specific needs.

## Attribution

This project uses [WiFiAnalyzer](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer) by VREMSoftwareDevelopment, licensed under the GNU General Public License v3.0 (GPLv3). 
Please [click here](https://github.com/VREMSoftwareDevelopment/WiFiAnalyzer?tab=GPL-3.0-1-ov-file) to check the original license. 


## Table of Contents

- [Features](#features)
- [Usage Tips](#usage-tips)
- [License](#license)
- [Privacy policy](#privacy-policy)
- [How to build project](#build-project)

## Features

* Identify nearby Access Points
* Graph channels signal strength
* Graph Access Point signal strength over time
* Analyze WiFi networks to rate channels
* HT/VHT Detection - 40/80/160MHz (Requires Android OS 6+)
* 2.4 GHz, 5 GHz and 6 GHz WiFi bands (Requires hardware support)
* Access Point view complete or compact
* Estimated Distance to the Access Points
* Export access points details
* Dark, Light and System theme available
* Pause/Resume scanning
* Available filters: WiFi band, Signal strength, Security and SSID
* Vendor/OUI Database Lookup
* The application has too many features to mention them all

**Please note VeeaWifiAnalyzer is not a WiFi password cracking or phishing tool.**

## Usage Tips

* Tap the title bar to switch between 2.4, 5 and 6 GHz WiFi band.
* SSID with `***` or `*hidden*` means it is hidden.
* Access Point security:
    * <img src="images/ic_lock_black_18dp.png" alt="WPA2/WPA" height="20"> WPA3(SAE)/WPA2/WPA 
    * <img src="images/ic_lock_outline_black_18dp.png" alt="WEP/WPS" height="20"> WEP/WPS
    * <img src="images/ic_lock_open_black_18dp.png" alt="Disabled" height="20"> Disabled
* Wi-Fi Standard (Requires Android OS 11+):
    * <img src="images/ic_wifi_legacy.png" alt="Wi-Fi 802.11a/b/g" height="20"> Wi-Fi 802.11a/b/g
    * <img src="images/ic_wifi_4.png" alt="Wi-Fi 802.11n" height="20"> Wi-Fi 802.11n
    * <img src="images/ic_wifi_5.png" alt="Wi-Fi 802.11ac" height="20"> Wi-Fi 802.11ac
    * <img src="images/ic_wifi_6.png" alt="Wi-Fi 802.11ax" height="20"> Wi-Fi 802.11ax

## License

[<img src="https://www.gnu.org/graphics/gplv3-127x51.png" alt="GPLv3" >](http://www.gnu.org/licenses/gpl-3.0.html)

VeeaWifiAnalyzer is licensed under the GNU General Public License v3.0 (GPLv3).

### GPLv3 License key requirements:

* Disclose Source
* License and Copyright Notice
* Same License
* State Changes

[GNU General Public License v3.0 (GPLv3) Explained in Plain English](https://tldrlegal.com/license/gnu-general-public-license-v3-(gpl-3))

[GNU General Public License v3.0 (GPLv3)](http://www.gnu.org/licenses/gpl-3.0.html).

## Privacy policy

* VeeaWifiAnalyzer does not collect any personal/device information.
* VeeaWifiAnalyzer is designed to use as few permissions as possible. It asks for just enough to perform the analysis. 
* Plus, it is all open source so nothing is hidden! 
* Most notably, this application does not require access to internet, so you can be sure it does not send any personal/device information to any other source and it does not 


## Build project

1. Install Android Studio
2. Import project into Android Studio
    * In Welcome to Android Studio Screen select Import project ...
    * Select the root directory of the VeeaWifiAnalyzer repository and click "OK".
    * VeeaWifiAnalyzer will build automatically.

### Running lint, unit tests and jacoco coverage report

```
./gradlew lintDebug jacocoTestCoverageVerification
```

- lint report: `app/build/reports/lint-results.html`
- unit test report: `app/build/reports/tests/testDebugUnitTest/index.html`
- code coverage report: `app/build/reports/jacoco/jacocoTestReport/html/index.html`
