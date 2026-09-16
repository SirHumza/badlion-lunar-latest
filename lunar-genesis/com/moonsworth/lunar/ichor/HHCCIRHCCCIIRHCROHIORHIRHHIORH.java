package com.moonsworth.lunar.ichor;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public record HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   private final Path ROROOOHRCOHRHRIHCOIIROORIHIROH;
   private final Path ROCCOHCCHCOCHROOIRCCROHIICRROH;
   @Nullable
   private final Path RCOORIHCHOCICICIRHRIRRRRCIORRH;
   private final com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH HCOOCHHRRCOIORIHHRIOCCIOHRIOOR;
   @Nullable
   private final List<com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOCIOOIHHOCIRORCHORHRRRHCOHROC;
   @Nullable
   private final List<String> CCOIIRRHHICOICHCHIHHHCROCIRCIH;
   @Nullable
   private final List<String> COOICOIHOCCIIHOIHHRCCORCOHOIRI;
   private final Map<String, Object> HHOHHIOOICICOICHROCOCHOIOHOCCC;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Path var1,
      Path var2,
      @Nullable Path var3,
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4,
      @Nullable List<com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var5,
      @Nullable List<String> var6,
      @Nullable List<String> var7,
      Map<String, Object> var8
   ) {
      this.ROROOOHRCOHRHRIHCOIIROORIHIROH = var1;
      this.ROCCOHCCHCOCHROOIRCCROHIICRROH = var2;
      this.RCOORIHCHOCICICIRHRIRRRRCIORRH = var3;
      this.HCOOCHHRRCOIORIHHRIOCCIOHRIOOR = var4;
      this.HOCIOOIHHOCIRORCHORHRRRHCOHROC = var5;
      this.CCOIIRRHHICOICHCHIHHHCROCIRCIH = var6;
      this.COOICOIHOCCIIHOIHHRCCORCOHOIRI = var7;
      this.HHOHHIOOICICOICHROCOCHOIOHOCCC = var8;
   }

   Optional<com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHIIIOHIRIRCCRRIOIICCHHIORRHOH(Collection<String> var1) {
      if (this.HOCIOOIHHOCIRORCHORHRRRHCOHROC != null) {
         for (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.HOCIOOIHHOCIRORCHORHRRRHCOHROC) {
            Optional var4 = var3.HCHRIROHHHCORIOCROOCHRCIOROOCI(var1);
            if (var4.isPresent()) {
               return var4;
            }
         }
      }

      return Optional.empty();
   }

   public Path classpathDir() {
      return this.ROROOOHRCOHRHRIHCOIIROORIHIROH;
   }

   public Path OIHRORHIHICRRIOIIHHIRHRCCHRCRI() {
      return this.ROCCOHCCHCOCHROOIRCCROHIICRROH;
   }

   @Nullable
   public Path overridesDir() {
      return this.RCOORIHCHOCICICIRHRIRRRRCIORRH;
   }

   public com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH CCIHOOIRHRHHHCRCIHOCHICHRROCRO() {
      return this.HCOOCHHRRCOIORIHHRIOCCIOHRIOOR;
   }

   @Nullable
   public List<com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCOIIICIOOHRICOHOOCIOOOIRORCCC() {
      return this.HOCIOOIHHOCIRORCHORHRRRHCOHROC;
   }

   @Nullable
   public List<String> classesToDump() {
      return this.CCOIIRRHHICOICHCHIHHHCROCIRCIH;
   }

   @Nullable
   public List<String> HCRHCROHCRHIHICHCCOCCOCHIHCOCC() {
      return this.COOICOIHOCCIIHOIHHRCCORCOHOIRI;
   }

   public Map<String, Object> OIIOOOICRROIHRIROICHOCOHIHHRHH() {
      return this.HHOHHIOOICICOICHROCOCHOIOHOCCC;
   }
}
