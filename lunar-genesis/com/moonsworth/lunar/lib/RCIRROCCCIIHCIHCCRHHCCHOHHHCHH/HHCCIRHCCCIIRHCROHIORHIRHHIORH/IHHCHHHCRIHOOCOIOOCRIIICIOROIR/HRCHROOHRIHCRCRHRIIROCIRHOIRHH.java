package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.util.Collection;
import java.util.Map;

public enum HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   Array,
   Collection,
   Map,
   POJO,
   Untyped,
   Integer,
   Float,
   Boolean,
   Enum,
   Textual,
   Binary,
   DateTime,
   OtherScalar;

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH fromClass(Class<?> var0, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      if (var0.isEnum()) {
         return Enum;
      } else if (var0.isArray()) {
         return var0 == byte[].class ? Binary : Array;
      } else if (Collection.class.isAssignableFrom(var0)) {
         return Collection;
      } else if (Map.class.isAssignableFrom(var0)) {
         return Map;
      } else {
         return var0 == String.class ? Textual : var1;
      }
   }
}
