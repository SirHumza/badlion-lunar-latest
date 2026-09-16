package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final Pattern RCORROCRRCHROICOICHOIOOHRHRHCC = Pattern.compile("[A-Za-z0-9_]{3,16}");
   private static final String CIOROOHRIOHIOORIIORRIIOHHHOROH = "»›:>";
   private static final String OCHCORCRHCCRRIICRCROOICORRIOHC = "»›>";
   private static final int HRRIOHHIHHROHHHRHHCCOOHHHRICRR = 40;
   private static final int OIOIHCROOHROOCIOOHHCICCCOIOROO = 1200;
   private static final Set<String> IRCIICRCORIOICRIOHRHRICCOOIIRR = Set.of(
      "reminder",
      "warning",
      "notice",
      "alert",
      "info",
      "note",
      "tip",
      "error",
      "score",
      "winner",
      "winners",
      "loser",
      "losers",
      "vote",
      "store",
      "shop",
      "discord",
      "website",
      "server",
      "status",
      "online",
      "offline",
      "total",
      "members",
      "team",
      "guild",
      "party",
      "level",
      "rank"
   );
   private final Int2ObjectLinkedOpenHashMap<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH> RRRRHICICRCIORIHCRROOHOOORIHIH = new Int2ObjectLinkedOpenHashMap();

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = this.ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(
         var1.OIHOIRRICORHHRHOIOIHORCHOIRCOO()
      );
      if (var2 != null) {
         this.RRRRHICICRCIORIHCRROOHOOORIHIH.put(var1.COIHCRRRROOOIOOIHRHHIOIHOHOROO(), var2);

         while (this.RRRRHICICRCIORIHCRROOHOOORIHIH.size() > 1200) {
            this.RRRRHICICRCIORIHCRROOHOOORIHIH.remove(this.RRRRHICICRCIORIHCRROOHOOORIHIH.firstIntKey());
         }
      }
   }

   public @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(String var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getClientPacketListener();
      if (var2 == null) {
         return null;
      }

      List var3 = var2.bridge$getPlayerInfoMap();
      if (var3 != null && !var3.isEmpty()) {
         HashMap var4 = new HashMap(var3.size());

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var6 : var3) {
            GameProfile var7 = var6.bridge$getGameProfile();
            if (var7 != null && var7.getName() != null) {
               var4.put(var7.getName().toLowerCase(Locale.ROOT), var6);
            }
         }

         String var8 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var4.keySet());
         return var8 == null
            ? null
            : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.get(
               var8.toLowerCase(Locale.ROOT)
            );
      } else {
         return null;
      }
   }

   public @Nullable String CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, Set<String> var2) {
      Matcher var3 = RCORROCRRCHROICOICHOIOOHRHRHCC.matcher(var1);

      while (var3.find()) {
         if (var3.start() > 40) {
            return null;
         }

         if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3) && var2.contains(var3.group().toLowerCase(Locale.ROOT))) {
            return var3.group();
         }
      }

      return null;
   }

   public @Nullable String COOCCCHCCRCCORRICRHCRROIOCOOIH(String var1) {
      Matcher var2 = RCORROCRRCHROICOICHOIOOHRHRHCC.matcher(var1);

      while (var2.find()) {
         if (var2.start() > 40) {
            return null;
         }

         if (HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2)) {
            return var2.group();
         }

         char var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
         if (var3 != 0 && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3)) {
            return var2.group();
         }
      }

      return null;
   }

   public @Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC IOCIIROIRCOHIRHHHROHCOOHIICIHI(int var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH)this.RRRRHICICRCIORIHCRROOHOOORIHIH
         .get(var1);
      if (var2 == null) {
         return null;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return var2.bridge$getLocationSkin();
      }

      GameProfile var3 = var2.bridge$getGameProfile();
      return var3 == null
         ? null
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSkinManager().bridge$getSkinLocation(var3, Type.SKIN).orElse(null);
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Matcher var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var1) || IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1) != 0;
   }

   private static char IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, Matcher var1) {
      int var2 = CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1.end());
      if (var2 < var0.length() && var0.charAt(var2) == '[') {
         int var3 = var0.indexOf(93, var2);
         if (var3 == -1) {
            return '\u0000';
         }

         var2 = CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var3 + 1);
      }

      return var2 < var0.length() && "»›:>".indexOf(var0.charAt(var2)) != -1 ? var0.charAt(var2) : '\u0000';
   }

   private static boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var0, Matcher var1) {
      return var1.start() > 0 && var0.charAt(var1.start() - 1) == '<' && var1.end() < var0.length() && var0.charAt(var1.end()) == '>';
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, Matcher var1, char var2) {
      int var3 = var1.start() - 1;

      while (var3 >= 0) {
         char var4 = var0.charAt(var3);
         if ("»›>".indexOf(var4) != -1) {
            return true;
         }

         if (!IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4)) {
            if (var4 == ']') {
               int var6 = var0.lastIndexOf(91, var3);
               if (var6 == -1) {
                  return false;
               }

               var3 = var6 - 1;
            } else {
               var3--;
            }
         } else {
            if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3, "From") || RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var3, "To")) {
               return true;
            }

            int var5 = var3;

            while (var5 > 0 && IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.charAt(var5 - 1))) {
               var5--;
            }

            if (!CCRCIRCCOCHRCROCCOIORCIOHROCRH(var0.substring(var5, var3 + 1))) {
               return false;
            }

            var3 = var5 - 1;
         }
      }

      return var2 != '>' && !CCRCIRCCOCHRCROCCOIORCIOHROCRH(var1.group()) && !IRCIICRCORIOICRIOHRHRICCOOIIRR.contains(var1.group().toLowerCase(Locale.ROOT));
   }

   private static boolean CCRCIRCCOCHRCROCCOIORCIOHROCRH(String var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (!Character.isUpperCase(var3)) {
            return false;
         }

         var1 = true;
      }

      return var1;
   }

   private static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, int var1, String var2) {
      int var3 = var1 - var2.length() + 1;
      return var3 >= 0 && var0.regionMatches(var3, var2, 0, var2.length()) && (var3 == 0 || var0.charAt(var3 - 1) == ' ');
   }

   private static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(char var0) {
      return Character.isLetterOrDigit(var0) || var0 == '_';
   }

   private static int CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, int var1) {
      while (var1 < var0.length() && var0.charAt(var1) == ' ') {
         var1++;
      }

      return var1;
   }
}
