package net.minecraft.launchwrapper;

import com.moonsworth.lunar.ichor.util.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.io.File;
import java.util.List;

@Deprecated
@CRICCOOHHHCHOORCICOCOHIHOIRHOO
public interface ITweaker {
   void acceptOptions(List<String> var1, File var2, File var3, String var4);

   void injectIntoClassLoader(LaunchClassLoader var1);

   String getLaunchTarget();

   String[] getLaunchArguments();
}
