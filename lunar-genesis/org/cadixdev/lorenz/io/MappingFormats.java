package org.cadixdev.lorenz.io;

import java.util.ServiceLoader;
import org.cadixdev.lorenz.util.Registry;

public final class MappingFormats {
   public static final Registry<MappingFormat> REGISTRY = new Registry<>();
   public static final TextMappingFormat SRG;
   public static final TextMappingFormat CSRG;
   public static final TextMappingFormat TSRG;
   public static final TextMappingFormat XSRG;

   public static MappingFormat byId(String var0) {
      return REGISTRY.byId(var0);
   }

   private MappingFormats() {
   }

   static {
      for (MappingFormat var1 : ServiceLoader.load(MappingFormat.class)) {
         REGISTRY.register(var1.toString(), var1);
      }

      SRG = (TextMappingFormat)byId("srg");
      CSRG = (TextMappingFormat)byId("csrg");
      TSRG = (TextMappingFormat)byId("tsrg");
      XSRG = (TextMappingFormat)byId("xsrg");
   }
}
