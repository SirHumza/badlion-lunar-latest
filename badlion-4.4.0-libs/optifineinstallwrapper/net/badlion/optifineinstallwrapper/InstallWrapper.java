package net.badlion.optifineinstallwrapper;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

public class InstallWrapper {
   public static void main(String[] args) {
      File dirMc = new File(args[0]);
      File fileJson = new File(dirMc, "launcher_profiles.json");

      try {
         if (!fileJson.exists() || !fileJson.isFile()) {
            fileJson.delete();

            try (FileWriter fileWriter = new FileWriter(fileJson)) {
               fileWriter.write("{\"profiles\":{}}");
            }

            fileJson.deleteOnExit();
         }

         System.out.println("Running optifine install wrapper!");
         Class<?> c = Class.forName("optifine.Installer");
         Object installer = c.newInstance();
         Method doInstall = c.getDeclaredMethod("doInstall", File.class);
         System.out.println("Invoking do install with file: " + args[0]);
         doInstall.invoke(installer, dirMc);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
