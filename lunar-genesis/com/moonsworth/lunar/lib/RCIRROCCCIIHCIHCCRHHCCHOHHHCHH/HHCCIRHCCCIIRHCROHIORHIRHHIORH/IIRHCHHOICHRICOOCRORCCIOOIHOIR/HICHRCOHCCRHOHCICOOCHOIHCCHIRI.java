package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements Serializable {
   private static final long HHIOCIROHORRIRCRIHOICCCHHROOCI = 1L;
   protected final Class<Enum<?>> HIHCHRCHIRRRIOCOHHIOIHORORRIIR;
   protected final Enum<?>[] CCHOIHHIIROCOCIOCICHRHRCRRIIHR;
   protected final HashMap<String, Enum<?>> OCOICICIOHHIICIOIHHOCOORRCHICR;
   protected final Enum<?> OCORCIICIICORCCHORHHIHHOHCCRCR;
   protected final boolean HHORRHRHIOOIHOCOROCHRIOORHCHCI;
   protected final boolean HIIHIIIHHOHHCRCCOCRCIOCRCCHORC;

   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Class<Enum<?>> var1, Enum<?>[] var2, HashMap<String, Enum<?>> var3, Enum<?> var4, boolean var5, boolean var6) {
      this.HIHCHRCHIRRRIOCOHHIOIHORORRIIR = var1;
      this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR = var2;
      this.OCOICICIOHHIICIOIHHOCOORRCHICR = var3;
      this.OCORCIICIICORCCHORHHIHHOHCCRCR = var4;
      this.HHORRHRHIOOIHOCOROCHRIOORHCHCI = var5;
      this.HIIHIIIHHOHHCRCCOCRCIOCRCCHORC = var6;
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<?> var1
   ) {
      return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0, var1);
   }

   protected static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<?> var1
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var0.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      boolean var3 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ACCEPT_CASE_INSENSITIVE_ENUMS
      );
      Class var4 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1);
      Enum[] var5 = ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
      String[] var6 = var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, new String[var5.length]);
      String[][] var7 = new String[var6.length][];
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var7);
      HashMap var8 = new HashMap();
      int var9 = 0;

      for (int var10 = var5.length; var9 < var10; var9++) {
         Enum var11 = var5[var9];
         String var12 = var6[var9];
         if (var12 == null) {
            var12 = var11.name();
         }

         var8.put(var12, var11);
         String[] var13 = var7[var9];
         if (var13 != null) {
            for (String var17 : var13) {
               var8.putIfAbsent(var17, var11);
            }
         }
      }

      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var4, var5, var8, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4), var3, false);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<?> var1
   ) {
      return CRICCOOHHHCHOORCICOCOHIHOIRHOO(var0, var1);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<Enum<?>> var1
   ) {
      return CORCOCICIRIOHROHROIIOOHICCHCRR(var0, var1);
   }

   private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI CORCOCICIRIOHROHROIIOOHICCHCRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<Enum<?>> var1
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var0.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      boolean var3 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ACCEPT_CASE_INSENSITIVE_ENUMS
      );
      Class var4 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1);
      Enum[] var5 = ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
      HashMap var6 = new HashMap();
      int var7 = var5.length;

      while (--var7 >= 0) {
         Enum var8 = var5[var7];
         var6.put(String.valueOf(var7), var8);
      }

      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var4, var5, var6, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4), var3, false);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      Class<?> var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2
   ) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2);
   }

   private static HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      Class<?> var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var0.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      boolean var4 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ACCEPT_CASE_INSENSITIVE_ENUMS
      );
      Class var5 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1);
      Enum[] var6 = ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
      HashMap var7 = new HashMap();
      int var8 = var6.length;

      while (--var8 >= 0) {
         Enum var9 = var6[var8];
         String var10 = var2.OICIIIIHOCRRHCOOHOOCOCCRIIOCHH(var9.name());
         var7.put(var10, var9);
      }

      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5, var6, var7, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var5), var4, false);
   }

   protected static HICHRCOHCCRHOHCICOOCHOIHCCHIRI CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0, Class<?> var1
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = var0.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      boolean var3 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ACCEPT_CASE_INSENSITIVE_ENUMS
      );
      Class var4 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1);
      Enum[] var5 = ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
      HashMap var6 = new HashMap();
      String[][] var7 = new String[var5.length][];
      if (var2 != null) {
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var7);
      }

      int var8 = var5.length;

      while (--var8 >= 0) {
         Enum var9 = var5[var8];
         var6.put(var9.toString(), var9);
         String[] var10 = var7[var8];
         if (var10 != null) {
            for (String var14 : var10) {
               var6.putIfAbsent(var14, var9);
            }
         }
      }

      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var4, var5, var6, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4), var3, false);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      Class<?> var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2
   ) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1, var2);
   }

   protected static HICHRCOHCCRHOHCICOOCHOIHCCHIRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0,
      Class<?> var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var0.RCRORHCOCRIIOHICORIHOHRIIRIORH();
      boolean var4 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.ACCEPT_CASE_INSENSITIVE_ENUMS
      );
      Class var5 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1);
      Enum[] var6 = ORICICIICROCRICRHRHHRCHHRCRHOR(var1);
      HashMap var7 = new HashMap();
      int var8 = var6.length;

      while (--var8 >= 0) {
         Enum var9 = var6[var8];

         try {
            Object var10 = var2.getValue(var9);
            if (var10 != null) {
               var7.put(var10.toString(), var9);
            }
         } catch (Exception var11) {
            throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + var9 + ": " + var11.getMessage());
         }
      }

      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         var5, var6, var7, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var5), var4, HOCRHOROHIHRCRHCRIIIHCHRRHOIIC(var2.getRawType())
      );
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR HCOOOOCRIORIICCCHIRIHCIIRIOHOI() {
      return CORCOCICIRIOHROHROIIOOHICCHCRR.IOCIIROIRCOHIRHHHROHCOOHIICIHI(this.OCOICICIOHHIICIOIHHOCOORRCHICR);
   }

   protected static Class<Enum<?>> RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(Class<?> var0) {
      return var0;
   }

   protected static Enum<?>[] ORICICIICROCRICRHRHHRCHHRCRHOR(Class<?> var0) {
      Enum[] var1 = RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var0).getEnumConstants();
      if (var1 == null) {
         throw new IllegalArgumentException("No enum constants for class " + var0.getName());
      } else {
         return var1;
      }
   }

   protected static Enum<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, Class<?> var1
   ) {
      return var0 != null ? var0.OCOROCROIRCHIHIHHOOIRIIIRRCRHI(RRRIRIOCCHRHRIRHIRIIHCOHRHHIIC(var1)) : null;
   }

   protected static boolean HOCRHOROHIHRCRHCRIIIHCHRRHOIIC(Class<?> var0) {
      if (var0.isPrimitive()) {
         var0 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHHIRCIIIRRCORHHRICIRCOORORCH(var0);
      }

      return var0 == Long.class || var0 == Integer.class || var0 == Short.class || var0 == Byte.class;
   }

   @Deprecated
   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Class<Enum<?>> var1, Enum<?>[] var2, HashMap<String, Enum<?>> var3, Enum<?> var4, boolean var5) {
      this(var1, var2, var3, var4, var5, false);
   }

   public Enum<?> OICCIICHOOHHCCRCRCCRHCOCHHROCO(String var1) {
      Enum var2 = this.OCOICICIOHHIICIOIHHOCOORRCHICR.get(var1);
      return var2 == null && this.HHORRHRHIOOIHOCOROCHRIOORHCHCI ? this.IRIRIIIOOCOIIICRHHRHROHHCHORCI(var1) : var2;
   }

   protected Enum<?> IRIRIIIOOCOIIICRHHRHROHHCHORCI(String var1) {
      for (Entry var3 : this.OCOICICIOHHIICIOIHHOCOORRCHICR.entrySet()) {
         if (var1.equalsIgnoreCase((String)var3.getKey())) {
            return (Enum<?>)var3.getValue();
         }
      }

      return null;
   }

   public Enum<?> RHCCHRRHCHOHHOCRCOHOHHROOOOCCC(int var1) {
      return var1 >= 0 && var1 < this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR.length ? this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR[var1] : null;
   }

   public Enum<?> RORRICHOOOHOORIHHRICIRHIICIRHC() {
      return this.OCORCIICIICORCCHORHHIHHOHCCRCR;
   }

   public Enum<?>[] OHIHCHCIHRHIHRORCRICHOCHIRHOOR() {
      return this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR;
   }

   public List<Enum<?>> CICRHHIIHOICHIRROCHCHCOIIOICIH() {
      ArrayList var1 = new ArrayList(this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR.length);

      for (Enum var5 : this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR) {
         var1.add(var5);
      }

      return var1;
   }

   public Collection<String> CHHCHCCCCCIOORORIIHICHICCOCORO() {
      return this.OCOICICIOHHIICIOIHHOCOORRCHICR.keySet();
   }

   public Class<Enum<?>> IRRCRHOROHRORORIHOOCRRRHCROHOH() {
      return this.HIHCHRCHIRRRIOCOHHIOIHORORRIIR;
   }

   public int HIOOOIROHHRORCCHRHHHHRCHHIICRH() {
      return this.CCHOIHHIIROCOCIOCICHRHRCRRIIHR.length - 1;
   }

   public boolean ROHROHHOROOHRIHHOOHORRCRCCRCII() {
      return this.HIIHIIIHHOHHCRCCOCRCIOCRCCHORC;
   }
}
