package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public final class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final char ICRIOOIHHICCRHHICIRHIRIROCHCHI = '=';
   private static final Pattern RROIIHHHRIRIIRHOCIHIHRHROIOOCH = Pattern.compile("^[a-z0-9_.-]+:[a-z0-9_./-]+$");
   private static final Pattern ORHOCOOIORICRROHIOOIRCCRCRHHHR = Pattern.compile("^[A-Z0-9_:;-]+$");

   public static @Nullable String ORHOOHRCIHIORCCRCOOOOCIROHRHCO(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      if (var1.isEmpty()) {
         return null;
      }

      if (var1.indexOf(58) < 0) {
         var1 = "minecraft:" + var1;
      }

      return RROIIHHHRIRIIRHOCIHIHRHROIOOCH.matcher(var1).matches() ? var1 : null;
   }

   public static boolean IRCHOCHCRIOORIOOHCHOIOCHOHRROR(String var0) {
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
         .HCCCIIHICHIROIHHIIHCIIICCORCCR(var0);
      return var1 != null
         && var1
            != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO()
               .HCICHICRRHORRORIRRRIHOROCOOIHO();
   }

   public static @Nullable String RHCRCHICRORHICCHIRROIHIHOCHHRR(String var0) {
      String var1 = var0.trim().toUpperCase(Locale.ROOT);
      return ORHOCOOIORICRROHIOOIRCCRCRHHHR.matcher(var1).matches() ? var1 : null;
   }

   public static String HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(String var0, String var1) {
      return var0 + "=" + var1;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCRRCHCOCHRIIRIHOOIOCCOHHCORHR(String var0) {
      int var1 = var0.indexOf(61);
      if (var1 < 0) {
         return null;
      }

      String var2 = RHCRCHICRORHICCHIRROIHIHOCHHRR(var0.substring(0, var1));
      String var3 = ORHOOHRCIHIORCCRCOOOOCIROHRHCO(var0.substring(var1 + 1));
      return var2 != null && var3 != null ? new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3) : null;
   }

   public static Map<String, String> RRHHORICORICIRHICOHHROHIIHICCH(List<String> var0) {
      HashMap var1 = new HashMap();

      for (String var3 : var0) {
         int var4 = var3.indexOf(61);
         if (var4 > 0) {
            var1.put(var3.substring(0, var4), var3.substring(var4 + 1));
         }
      }

      return Map.copyOf(var1);
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHIIIOHIRIRCCRRIOIICCHHIORRHOH<String> var0, String var1) {
      String var2 = var1 + "=";

      for (String var4 : new ArrayList((Collection)var0.get())) {
         if (var4.startsWith(var2)) {
            return var0.remove(var4);
         }
      }

      return false;
   }

   @Generated
   private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String OCCRHIOCHRRHHRHHIHHCIOHCHICICO;
      private final String CHOOOHOIIRRCRCIHRORHIOOCIHHOHC;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
         this.OCCRHIOCHRRHHRHHIHHCIOHCHICICO = var1;
         this.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC = var2;
      }

      public String encode() {
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(this.OCCRHIOCHRRHHRHHIHHCIOHCHICICO, this.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC);
      }

      public String CCIIROHCRIHIHIRHHICIHHHHRHHRHI() {
         return this.OCCRHIOCHRRHHRHHIHHCIOHCHICICO;
      }

      public String itemId() {
         return this.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC;
      }
   }
}
