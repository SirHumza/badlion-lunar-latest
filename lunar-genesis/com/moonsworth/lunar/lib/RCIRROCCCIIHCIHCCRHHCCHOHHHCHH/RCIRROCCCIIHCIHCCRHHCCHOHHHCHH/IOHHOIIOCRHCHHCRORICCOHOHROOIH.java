package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

public enum IOHHOIIOCRHCHHCRORICCOHOHROOIH {
   TRUE,
   FALSE,
   DEFAULT;

   public Boolean asBoolean() {
      if (this == DEFAULT) {
         return null;
      } else {
         return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
      }
   }

   public boolean asPrimitive() {
      return this == TRUE;
   }

   public static IOHHOIIOCRHCHHCRORICCOHOHROOIH fromBoolean(Boolean var0) {
      if (var0 == null) {
         return DEFAULT;
      } else {
         return var0 ? TRUE : FALSE;
      }
   }

   public static boolean equals(Boolean var0, Boolean var1) {
      return var0 == null ? var1 == null : var0.equals(var1);
   }
}
