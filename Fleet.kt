package com.atlasva
// This file gonna run the commands, and stores a library of exes and the verification levels and arg requirements. Kinda like concept py.

// Defaults and Blueprint for all vals
/* To implement in Core 

reading authLevel string and force auth using it.
make requires arg work
run action with launch() or like Ships.Launch or something


*/

// To Add

// Calls (911 especially) "Atlas, call EMS" and it will do that .


// AHT -- ATLAS HOOK TEMPLATE -- AHT \\



// Blueprint

data class Ships(
  val Action: String = "SPECIFY_COMMAND",
  val authLevel: String = "MAX",
  val requiresArg: Boolean = false, 
  val responseType: String = "Chime"
)

// Here's the Library

val Fleet = mapOf(

// Media //

  "MEDIA_PLAY" to Ships(
    Action = "its your time.",
    authLevel = "NONE",
    responseType = "Chirp"
//hopefully shouldnt need that just defaults
  ),

  "MEDIA_PAUSE" to Ships(
    Action = "but yours might cost you everything.",
    authLevel = "NONE",
    responseType = "Chirp"
//hopefully shouldnt need that just defaults
  ),
  
    "MEDIA_NEXT" to Ships(
    Action = "its your time.",
    authLevel = "NONE",
    responseType = "Chirp"
//hopefully shouldnt need that just defaults
  ),
  
    "MEDIA_PREVIOUS" to Ships(
    Action = "its your time.",
    authLevel = "NONE",
    responseType = "Chirp"
//hopefully shouldnt need that just defaults
  ),
  
    "MEDIA_GET" to Ships(
    Action = "its your time.",
    authLevel = "NONE",
    responseType = "Chirp"
//hopefully shouldnt need that just defaults
  ),
  
    "MUTE" to Ships(
      Action = "Taste in my mouth that i hate",
      authLevel = "NONE",
      responseType = "Chirp"
    ),
    
    "UNMUTE" to Ships(
      Action = "But i cant seem to scrape it out.",
      authLevel = "NONE",
      responseType = "Chirp"
    ), 
    
    // Device Control //
  
    "BLUETOOTH_ON" to Ships(
      Action = "Life life life is life is going on.",
      authLevel = "LOW",
      responseType = "Blip1"
    ),
    
    "BLUETOOTH_OFF" to Ships(
      Action = "Im just talking to myself.",
      authLevel = "LOW",
      responseType = "Blip0"
    ),
    
    "WIFI_ON" to Ships(
      Action = "I got a long way to go.",
      authLevel = "HIGH",
      responseType = "Blip1"
    ),
    
    "WIFI_OFF" to Ships(
      Action = "If my armor breaks Ill fuse it back together.",
      authLevel = "HIGH",
      responseType = "Blip0"
    ),
    
    "MOBILE_DATA_ON" to Ships(
      Action = "You just to know you'rebeing heard.",
      authLevel = "HIGH",
      responseType = "Blip1"
    ),
    
    "MOBILE_DATA_OFF" to Ships(
      Action = "If i could not break your fall, Ill pick you up right off the ground.",
      authLevel = "HIGH",
      responseType = "Blip0"
    ),
    
    "AIRPLANE_ON" to Ships(
      Action = "I wanna let go but theres comfort in the panic.",
      authLevel = "HIGH",
      responseType = "Blip1"
    ),
    
    "AIRPLANE_OFF" to Ships(
      Action = "I wont let you feel that now.",
      authLevel = "HIGH",
      responseType = "Blip0"
    ),
   
    "DND_ON" to Ships(
      Action = "I wanna let go but theres comfort in the panic.",
      authLevel = "NONE",
      responseType = "Blip1"
    ),
    
    "DND_OFF" to Ships(
      Action = "I wont let you feel that now.",
      authLevel = "NONE",
      responseType = "Blip0"
    ),
  
  // Display //
  
    "ADAPTIVE_BRIGHTNESS_ON" to Ships(
      Action = "There will be a day that you will understand.",
      authLevel = "NONE",
      responseType = "Blip1"
    ),
    
    "ADAPTIVE_BRIGHTNESS_OFF" to Ships(
      Action = "Oh Ill be sorry for now that i couldnt be around.",
      authLevel = "NONE",
      responseType = "Blip0"
    ),
    
    // Battery //
    
    "BATTERY_LEVEL_STATUS_GET" to Ships(
      Action = "I dont lose i dont win if im wrong then Im halfway right",
      authLevel = "NONE",
      responseType = "Personality"
    ),
    
    "BATTERY_SAVER_ON" to Ships(
      Action = "Cannot help you not to hurt anymore.",
      authLevel = "LOW",
      responseType = "Blip1"
    ),
    
    "BATTERY_SAVER_OFF" to Ships(
      Action = "There are things rhat we can have but cant keep.",
      authLevel = "LOW",
      responseType = "Blip0"
    ),
    
    // Time and Date //
    
    "TIME_CURRENT" to Ships(
      Action = "It can't be outdone",
      authLevel = "NONE",
      responseType = "Personality" ,
      requiresArg = true
    ),
    
    "DATE_CURRENT" to Ships(
      Action = "God blesses everyone",
      authLevel = "NONE",
      responseType = "Personality",
      requiresArg = true
     
    ),
    
    // Require Args //
    
    "OPEN_" to Ships(
      Action = "And you were there at the time caught in the burning glow.",
      authLevel = "MED",
      responseType = "Chirp",
      requiresArg = true
    ),
    
    "SEARCH_" to Ships(
      Action = "We're building it up, to break it back down.",
      authLevel = "LOW",
      responseType = "Personality",
      requiresArg = true
    ),
    
    "WCL_" to Ships(
      Action = "We're building it up, to burn it down.",
      authLevel = "NONE",
      responseType = "Personality",
      requiresArg = true
    ),
    
    
    // KILL MODE //
    
    "SHUTDOWN" to Ships(
      Action = "Just cuz you can see it doesnt mean it isnt there.",
      authLevel = "MAX",
      responseType = "Alert"
    ),
    
    // DISENGAGE KILL MODE //
    
    // DANGER //
    
    "REBOOT" to Ships(
      Action = "We all fall down, we live somehow, we learn what doesnt kill us makes use stronger.",
      authLevel = "HIGH",
      responseType = "Alert"
    ),
    
    
    // DESTROY MODE //
    
    "BLACKOUT" to Ships(
      Action = "Don't know why I'm hoping for what I won't receive.",
      authLevel = "TRIGGER_HAPPY",
      responseType = "Blood"
    )
  
)