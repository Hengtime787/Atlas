############# Atlas #############


 #### To Do ####
 
 # Weather
 #playback
 #google maps (hopefully with directions spoken by atlas?)
 ######### WIP ##########
 #Time ans date __ need timezone shit
 ## Done ##
 
 
 ######## Notes ########
 # X is atlas for error
 # deeper integratiojs like playerctl but for android wre like 1000000 eprcent soable just not done because ibwould need bakcgpeujd whit thet i sucl at right now plus im working ont uskonay?
#### Placeholders are marked by lyrics from Linkin Park songs ####

# All aboard!

from datetime import datetime
from zoneinfo import ZoneInfo
#My timezones database
from timezones import getzone


# Take input make it lowercase

request = input(">").lower()
# input is terminal style now. STT has not been set up yet neither has TTS

# if checks. Catagories showing

  ####### Time / Date #######
if "time" in request or "date" in request or "day" in request:
  print("yay")
    
    #janky timezones 
    
  if "time" in request and "in" in request: #in is a comprimise but i need it for the prototype
    target = request.split(" in ")[-1].strip() #should be look into request find in word after in take that cut off empty space and sending it as target (to getzone soon)
    tz = getzone(target)
    if tz: #just making sure its alive
      final = datetime.now(ZoneInfo(tz))
      print(final.strftime("%I:%M %p"))
    else:
      print("XFinal")
      
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
      
else:
  print("X")
      

#else:
 # print("Stuck on repititions that are only hypothetical.")
    #AI