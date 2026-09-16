package com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.jspecify.annotations.Nullable;

abstract class CRRRICCRROCOHHOHIICIHORCOORRRH<T> implements HHCCIRHCCCIIRHCROHIORHIRHHIORH<T> {
   private final Class<T> IHIIHHIRICOORHORHHCOCOROIHRRII;

   CRRRICCRROCOHHOHIICIHORCOORRRH(Class<T> var1) {
      this.IHIIHHIRICOORHORHHCOCOROIHRRII = var1;
   }

   @Override
   public Class<T> type() {
      return this.IHIIHHIRICOORHORHHCOCOROIHRRII;
   }

   static IllegalArgumentException IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, Class<?> var1, @Nullable String var2) {
      throw new IllegalArgumentException("Do not know how to turn value '" + var0 + "' into a " + var1.getName() + (var2 == null ? "" : ": " + var2));
   }

   static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      static HHCCIRHCCCIIRHCROHIORHIRHHIORH<String> IOCCOHCICIHRRRRIRCHHIHROHCHCIR = new CRRRICCRROCOHHOHIICIHORCOORRRH<String>(String.class) {
         public String IRIRHCHIORRHIOHOICORICRIHRCRHI(String var1) {
            return var1;
         }
      };
      static HHCCIRHCCCIIRHCROHIORHIRHHIORH<Boolean> RROICRROIROHICHIOHCIROHOORORHC = new CRRRICCRROCOHHOHIICIHORCOORRRH<Boolean>(Boolean.class) {
         public Boolean IHRCOHHOHRHHOCCCCRHOIICHCOCORC(String var1) {
            if (var1.equalsIgnoreCase("true")) {
               return Boolean.TRUE;
            } else if (var1.equalsIgnoreCase("false")) {
               return Boolean.FALSE;
            } else {
               throw IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Boolean.class, null);
            }
         }
      };
      static HHCCIRHCCCIIRHCROHIORHIRHHIORH<Integer> IRRORHIORORRIOOOHRRHRRCHORCCIR = new CRRRICCRROCOHHOHIICIHORCOORRRH<Integer>(Integer.class) {
         public Integer HHHCIHORICHROCOCRRRCCCICOCOORI(String var1) {
            try {
               return Integer.decode(var1);
            } catch (NumberFormatException var3) {
               throw IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Integer.class, var3.getMessage());
            }
         }
      };
      static HHCCIRHCCCIIRHCROHIORHIRHHIORH<Double> RIOHCOICRHIOCHCCCCCOICHIIOIHOC = new CRRRICCRROCOHHOHIICIHORCOORRRH<Double>(Double.class) {
         public Double ORCOCHRRIORRRCCROHIRIHHCCROCHO(String var1) {
            try {
               return Double.parseDouble(var1);
            } catch (NumberFormatException var3) {
               throw IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Double.class, var3.getMessage());
            }
         }
      };

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E extends Enum<E>> extends CRRRICCRROCOHHOHIICIHORCOORRRH<E> {
      private final Map<String, E> OHCOCCHIRHIOOHHCRICCOHIOCIIOOI = new HashMap<>();

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<E> var1) {
         super(var1);

         for (Enum var5 : (Enum[])var1.getEnumConstants()) {
            this.OHCOCCHIRHIOOHHCRICCOHIOCIIOOI.put(var5.name().toLowerCase(Locale.ROOT), (E)var5);
         }
      }

      public E CIRIOIHIRCCCRORHRCHIRCHOCHHCHH(String var1) {
         Enum var2 = this.OHCOCCHIRHIOOHHCRICCOHIOCIIOOI.get(var1.toLowerCase(Locale.ROOT));
         if (var2 == null) {
            throw IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, this.type(), null);
         } else {
            return (E)var2;
         }
      }
   }
}
