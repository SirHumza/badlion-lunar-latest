package net.minecraft.launchwrapper;

import com.moonsworth.lunar.ichor.util.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.HashMap;
import java.util.Map;

@Deprecated
@CRICCOOHHHCHOORCICOCOHIHOIRHOO
public class Launch {
   public static Map<String, Object> blackboard = new HashMap<>();

   static {
      blackboard.put("fml.deobfuscatedEnvironment", true);
      blackboard.put("forgeLaunchArgs", new HashMap());
   }
}
