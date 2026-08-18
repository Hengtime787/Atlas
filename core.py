############# Atlas #############


 #### To Do ####
 
 # Weather
 #google maps (hopefully with directions spoken by atlas?)
 #do not disturb
 # notification readouts.
 ######### WIP ##########
 
 ## Done -- to add and upgrade heavily or not ##
 
   # Playback
   # Time and world clock sorta 
 ######## Notes ########
 #for world clock and time need to pass through country name somehow to java layer / kotlin layer.
 # X is atlas for error
 # deeper integratiojs like playerctl but for android wre like 1000000 eprcent soable just not done because ibwould need bakcgpeujd whit thet i sucl at right now plus im working ont uskonay?
 
 # right now most is print. probably change to return for tts to read.
 
 # fornrptotype ish hooks (eg. MEDIA_PAUSE) it will be in quotes so that the output looks otherwise when doing actual thing it actually might be in quotes too wait hold on a minute...
#### Placeholders are marked by lyrics from Linkin Park songs ####

# All aboard!

from datetime import datetime
from intent_engine import resolve
#from zoneinfo import ZoneInfo
#My timezones database
#from timezones import getzone
# #  # above this is obselete with new launch command instead of zoneinfobinteg with python. maybe should actually...

# Take input make it lowercase

request = input("\033[36m~/Atlas Interface/>").lower()
# input is terminal style now. STT has not been set up yet neither has TTS

# Function to throw stuff at android service #

def launch(CONTROL_SURFACE):
  print(CONTROL_SURFACE)
  
  hook = resolve(request)
  print(hook)
  
 ##### 
 #####for now without service just prints name of module activated. #####

# if checks. Catagories showing

  ####### Time / Date #######
  
  
  
if "time" in request or "date" in request or "day" in request:
  print("yay")
  
    #janky timezones 
    
  if "time" in request and "in" in request: #in is a comprimise but i need it for the prototype
    target = request.split(" in ")[-1].strip() 
    print(target)###£££
    #should be look into request find in word after in take that cut off empty space and sending it as target (to getzone soon)
    tz = getzone(target)
    print(tz)###£££
    if tz: 
      print("fs")#just making sure its alive
      final = datetime.now(ZoneInfo(tz))
      print(final)###£££
      print(final.strftime("%I:%M %p"))
    else:
      print("XFinal")
      ''
  elif "time" in request:
    print(datetime.now().strftime("%I:%M %p"))
    
      #wow the debugging is gonna be LONG on this
    #messed up i knowm just temporary
    # Date (kinda twice? i think tjis is best way to do this?)
    
    
    
  elif "day" in request or "date" in request:
    
    if "today" in request or "date" in request:
      print(datetime.now().strftime("%B %d, %Y"))
    elif "day" in request:
      print(datetime.now().strftime("%A, %B %d, %Y"))

  ##### Media #####
  
elif "play" in request:
  launch("MEDIA_PLAY")
elif "pause" in request:
  launch("MEDIA_PAUSE")
elif "next song" in request: 
  launch("MEDIA_NEXT")
elif "previous song" in request:
  launch("MEDIA_PREVIOUS")
  
  #more add look into apis for ytm and spotify and others maybe even android auto
  
  #### Battery ####

# elif "battery level"

else:
  print("X")
      

#else:
 # print("Stuck on repititions that are only hypothetical.")
    #AI