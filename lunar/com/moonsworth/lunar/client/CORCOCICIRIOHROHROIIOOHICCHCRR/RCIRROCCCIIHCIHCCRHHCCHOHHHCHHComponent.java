package com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import lombok.Generated;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final Map<Class<? extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IOCCRRIOOOHOOCHICHCIHOOORRRHOR = new ConcurrentHashMap<>();

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0) {
      Class var1 = null;

      for (Class var5 : var0.getClass().getInterfaces()) {
         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.isAssignableFrom(var5)) {
            var1 = var5;
         }
      }

      if (var1 == null) {
         throw new RuntimeException("Unable to find ExternalLink interface for class: " + var0.getClass().getName());
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "[Ichor/External Link]", "Registering external class %s as %s.", var0.getClass().getName(), var1.getName()
      );
      IOCCRRIOOOHOOCHICHCIHOOORRRHOR.put(var1, var0);
   }

   public static <T extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> Optional<T> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Class<T> var0) {
      return Optional.ofNullable((T)IOCCRRIOOOHOOCHICHCIHOOORRRHOR.get(var0));
   }

   public static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<? extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var0, Supplier<T> var1, Supplier<T> var2) {
      return (T)(IOCCRRIOOOHOOCHICHCIHOOORRRHOR.containsKey(var0) ? var1.get() : var2.get());
   }

   @Generated
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
