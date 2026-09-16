package net.optifine.util;

import java.util.HashMap;
import java.util.Map;

public class FrameEvent {
   private static Map<String, Integer> mapEventFrames = new HashMap<>();

   public static boolean isActive(String name, int frameInterval) {
      synchronized (mapEventFrames) {
         int frameCount = ave.A().o.ae;
         Integer frameCountLastObj = mapEventFrames.get(name);
         if (frameCountLastObj == null) {
            frameCountLastObj = new Integer(frameCount);
            mapEventFrames.put(name, frameCountLastObj);
         }

         int frameCountLast = frameCountLastObj;
         if (frameCount > frameCountLast && frameCount < frameCountLast + frameInterval) {
            return false;
         }

         mapEventFrames.put(name, new Integer(frameCount));
         return true;
      }
   }
}
