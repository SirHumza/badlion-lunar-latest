package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements Serializable {
   private static final long OIOHOOCCRRIRRRHHOIHIHHCORRCOHH = 1L;
   protected final HashMap<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH, Class<?>> RHHIHOICCIOCCOOIOHICIRRIOROORI = new HashMap<>();

   public <T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Class<T> var1, Class<? extends T> var2) {
      if (var1 == var2) {
         throw new IllegalArgumentException("Cannot add mapping from class to itself");
      }

      if (!var1.isAssignableFrom(var2)) {
         throw new IllegalArgumentException(
            "Cannot add mapping from class " + var1.getName() + " to " + var2.getName() + ", as latter is not a subtype of former"
         );
      }

      if (!Modifier.isAbstract(var1.getModifiers())) {
         throw new IllegalArgumentException("Cannot add mapping from class " + var1.getName() + " since it is not abstract");
      }

      this.RHHIHOICCIOCCOOIOHICIRRIOROORI
         .put(
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1
            ),
            var2
         );
      return this;
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      Class var3 = var2.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      Class var4 = this.RHHIHOICCIOCCOOIOHICIRRIOROORI
         .get(
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var3
            )
         );
      return var4 == null ? null : var1.CRRIRCRIRCHCHIRCICOROIIOIIICCC().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
   }

   @Deprecated
   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      return null;
   }

   @Override
   public OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
   ) {
      return null;
   }
}
