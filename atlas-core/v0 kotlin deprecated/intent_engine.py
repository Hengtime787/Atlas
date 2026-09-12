#All fucking aboard

from intent_model import MODEL

#this file started out as chatgpt generated but it inly took the gia""nt thing i gave it and ripped itnintobthis list so i didnt have to maually copy. id call this not vibe coding but assisted coding ;) YO YO YO NOT ANYMKRE HA!

#hers a diceontisotn yeyryry axtuslly lirbary sound cooler

#Commands Library

COMMANDS = {

"MEDIA_PLAY": {},

"MEDIA_PAUSE": {},

"MEDIA_NEXT": {},

"MEDIA_PREVIOUS": {},

"MEDIA_GET": {},

"VOLUME_UP": {
    "arg_type": "percent"
},

"VOLUME_DOWN": {
    "arg_type": "percent"
},

"MUTE_ON": {},

"MUTE_OFF": {},

"WCL_<Country>": {
    "arg_type": "country"
},

"BATTERY_LEVEL_STATUS_GET": {},

"BATTERY_SAVER_ON": {},

"BATTERY_SAVER_OFF": {},

"BATTERY_SAVER_STATUS": {},

"SHUTDOWN": {},

"LOCK": {},

"REBOOT": {},

"BLUETOOTH_OFF": {},

"BLUETOOTH_ON": {},

"WIFI_OFF": {},

"WIFI_ON": {},

"MOBILE_DATA_OFF": {},

"MOBILE_DATA_ON": {},

"AIRPLANE_ON": {},

"AIRPLANE_OFF": {},

"DND_ON": {},

"DND_OFF": {},

"BRIGHTNESS_UP": {
    "arg_type": "percent"
},

"BRIGHTNESS_DOWN": {
    "arg_type": "percent"
},

"ADAPTIVE_BRIGHTNESS_ON": {},

"ADAPTIVE_BRIGHTNESS_OFF": {},

"OPEN_<Appname>": {
    "arg_type": "app"
},

"SEARCH_<Query>": {
    "arg_type": "query"
},

"BLACKOUT": {}

#function for resolving or understanding what the fuck that senile human is saying.

#NTIM = Not Implemented

def resolve(request):
    print("NTIM")

# adding in like response types for this as attributes for the hooks

# if confirmation_level:

###### add this to the Android layer but maybe here as well.

# it will stay as an attribute in allabs() that require it just in case.

# hey and instead of these shitty if checks below then just do

# if confirmation_level == MAX:

# if response_type == "Alert":
#     print("ntim")

# elif response_type == "Chirp":
#     print("ntim")  # chirp 1 and chirp 2 ill just call chirp and chime.

# NTS RECORD OWN SOUNDS + have sound picker in the app somehow.

# elif response_type == "Chime":
#     print("ntim")

# elif response_type == "personality":
#     print("ntim")