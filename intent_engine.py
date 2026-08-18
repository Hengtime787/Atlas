# this file started out as chatgpt generated but it inly took the giant thing i gave it and ripped itnintobthis list so i didnt have to maually copy. id call this not vibe coding but assisted coding ;)

COMMANDS = [
    "MEDIA_PLAY",
    "MEDIA_PAUSE",
    "MEDIA_NEXT",
    "MEDIA_PREVIOUS",
    "MEDIA_GET",

    "VOLUME_UP",
    "VOLUME_DOWN",

    "BATTERY_LEVEL_STATUS_GET",
# MAKE FAILSAFE
   # "POWER_OFF",
  #  "LOCK",
  #  "REBOOT",

    "BLUETOOTH_ON",
    "BLUETOOTH_OFF",
    "WIFI_ON",
    "WIFI_OFF",
    "DATA_ON",
    "DATA_OFF",
    "DND_ON",
    "DND_OFF",

    "ADAPTIVE_BRIGHTNESS_ON",
    "ADAPTIVE_BRIGHTNESS_OFF",

    "OPEN",
    "WCL",
    "SEARCH",
]

# function for resolving or understanding what the fuck that senile human is saying.

def resolve(request):
    if "pause" in request:
        return "MEDIA_PAUSE"
        
    return "I'm so sick of the tension"