package com.moonsworth.lunar.client.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import lombok.Generated;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static void CORCOCICIRIOHROHROIIOOHICCHCRR(File var0, String var1) {
      var0.getParentFile().mkdirs();
      File var2 = new File(var0.getParentFile(), var0.getName() + ".tmp");
      Files.writeString(var2.toPath(), var1);

      try {
         Files.move(var2.toPath(), var0.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } catch (AtomicMoveNotSupportedException var4) {
         Files.move(var2.toPath(), var0.toPath(), StandardCopyOption.REPLACE_EXISTING);
      }
   }

   @Generated
   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
