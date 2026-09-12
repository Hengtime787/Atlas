// REASON FOR DEPRECATION
// switched architecture to map thst supports multiple attributes for berification, args, amd other.
//KEEP REASON 
// fallback

//package com.AtlasVA.actions or something

// Actions / Executions inside {} pls

fun mediaPlay() {}
fun mediaPause() {}
fun mediaNext() {}
fun mediaPrevious() {}
fun mute() {}
fun unmute() {}
fun bluetoothOn() {}
fun bluetoothOff() {}
fun wifiOn() {}
fun wifiOff() {}
fun mobileDataOn() {}
fun mobileDataOff() {}
fun airplaneOn() {}
fun airplaneOff() {}
fun dndOn() {}
fun dndOff() {}
fun adaptiveBrightnessOn() {}
fun adaptiveBrightnessOff() {}
fun batteryLevelStatusGet() {}
fun batterySaverOn() {}
fun batterySaverOff() {}
fun shutdown() {}
fun reboot() {}
fun blackout() {}

//bouta use ai to compile lists. it is zero brain power btw
// map with the functions is best route. learned there are two ways.

// One -- two is worse actuslly just do this


// makes a library thst connects to the functions above
 val commands: Map<String, () -> Unit> = mapOf(
 
  "MEDIA_PLAY" to ::mediaPlay,
  "MEDIA_PAUSE" to::mediaPause,
  "MEDIA_NEXT" to ::mediaNext,
  "MEDIA_PREVIOUS" to ::mediaPrevious,
  
  "MUTE" to ::Mute,
  "UNMUTE" to ::Unmute,
  
  "BLUETOOTH_ON" to ::bluetoothOn,
  "BLUETOOTH_OFF" to ::bluetoothOff,
  
  "WIFI_ON" to ::wifiOn,
  "WIFI_OFF" to ::wifiOff,
  
  "MOBILE_DATA_ON" to ::mobileDataOn,
  "MOBILE_DATA_OFF" to ::mobileDataOff,
  
  "AIRPLANE_ON" to ::airplaneOn,
  "AIRPLANE_OFF" to ::airplaneOff,
  
  "DND_ON" to ::dndOn,
  "DND_OFF" to ::dndOff,
  
  "ADAPTIVE_BRIGHTNESS_ON" to ::adaptiveBrightnessOn,
  
  "ADAPTIVE_BRIGHTNESS_OFF" to ::adaptiveBrightnessOff,
  
  "BATTERY_LEVEL_STATUS_GET" to ::batteryLevelStatusGet,
  
  "BATTERY_SAVER_ON" to ::batterySaverOn,
  
  "BATTERY_SAVER_OFF" to ::batterySaverOff,
  
  "SHUTDOWN" to ::shutdown,
  
  "REBOOT" to ::reboot,
  
  "BLACKOUT" to ::blackout
  
  
  
)
