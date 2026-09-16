package com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.util.FatalIchorError;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final Pattern IRHRRHCIOCCIRCIOIHCRROCCRICCCR = Pattern.compile("in ([a-zA-Z$_.]*)\\. No refMap loaded");
   private static final Pattern CHCIRRHCHCCOROHICHOOHCRIIROOIH = Pattern.compile("mixins\\.([a-zA-Z$_.]*)\\.json:([a-zA-Z$_.]*) from mod");
   private static boolean enabled;
   private static IRCIIHHICIHRCOCRROCOICRIHHCCHH OIOCCRIRIHRICOHHRCICIHRRRCRHCC;
   private static boolean HCICHIROROOOCRCRRCIIOHHIORCCRR;
   private static List<com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HORRHCOIOORRCHHHROOIHRROCORIIR;

   public static void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0) {
      enabled = true;
      System.setProperty("mixin.checks.interfaces", "true");
      System.setProperty("ichor.failOnMixinError", "true");
      var0.CCHORCOOOCRRRHHCRCRRCIHIICICCH().RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var0x -> HCICHIROROOOCRCRRCIIOHHIORCCRR = true);
      System.setErr(new PrintStream(System.err) {
         @Override
         public PrintStream printf(@NotNull String var1, Object... var2) {
            if (var2.length == 1 && var2[0] instanceof String var3 && var3.contains("Total unimplemented:")) {
               com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCICHIROROOOCRCRRCIIOHHIORCCRR = true;
            }

            return super.printf(var1, var2);
         }
      });
      System.setOut(new PrintStream(System.out) {
         @Override
         public void print(String var1) {
            if (com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OIRHCCHIOOIIIOIRCHCOHOHOIOCIOC(var1)) {
               com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HCICHIROROOOCRCRRCIIOHHIORCCRR = true;
            }

            super.print(var1);
         }
      });
   }

   public static void IRRCCOICORICIHCHRHIHIHROIRHOCR(IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      if (enabled && var0.OCOIIRHCCOOHRHHCOCHIHIICRORRHR().hasMixinRuntime()) {
         OIOCCRIRIHRICOHHRCICIHRRRCRHCC = var0;
      }
   }

   public static void HROHCRIOCIHCORHOHIOCIHOHHCIIRH(Object var0) {
      if (enabled) {
         System.out.println("Force-loading all unloaded mixin targets.");
         if (OIOCCRIRIHRICOHHRCICIHRRRCRHCC == null) {
            throw new FatalIchorError("Failed to find Mixin ClassLoader? Was Mixin initialized?");
         }

         OIOCCRIRIHRICOHHRCICIHRRRCRHCC.ICOOIHIHOCCCIRCRHOOHOCRCRIRHCH().audit(var0.getClass().getClassLoader());
         if (HCICHIROROOOCRCRRCIIOHHIORCCRR && !Boolean.parseBoolean(System.getProperty("ichor.testing.ignoreMixinFailures", "false"))) {
            CHCRRIORHRCOICRHHRRIHIHRHORCRH();
            throw new AssertionError("Caught one or more mixin errors! Check the log for more info");
         }
      }
   }

   private static void CHCRRIORHRCOICRHHRRIHIHRHORCRH() {
      if (HCICHIROROOOCRCRRCIIOHHIORCCRR && HORRHCOIOORRCHHHROOIHRROCORIIR != null && !HORRHCOIOORRCHHHROOIHRROCORIIR.isEmpty()) {
         StringBuilder var0 = new StringBuilder();
         var0.append("ExceptionName,McClassPath,LunarClassId,ErrorMsg");

         for (com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : HORRHCOIOORRCHHHROOIHRROCORIIR) {
            if (!var0.isEmpty()) {
               var0.append("\n");
            }

            var0.append(var2.toString());
         }

         Path var4 = Paths.get(".ichor/audit/mixin_error_report.csv");

         try {
            Files.createDirectories(var4.getParent());
            Files.write(var4, var0.toString().getBytes());
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   private static boolean OIRHCCHIOOIIIOIRCHCOHOHOIOCIOC(String var0) {
      if (var0.startsWith("org.spongepowered.asm") && var0.contains("throwables")) {
         Matcher var2 = IRHRRHCIOCCIRCIOIHCRROCCRICCCR.matcher(var0);
         if (var2.find()) {
            String var1 = var2.group(1).replace(".", "/");
            int var3 = var0.indexOf(":");
            String var4 = var0.substring(0, var3);
            int var5 = var4.lastIndexOf(".") + 1;
            String var6 = var4.substring(var5).replace(".", "/");
            String var7 = "-";
            var2 = CHCIRRHCHCCOROHICHOOHCRIIROOIH.matcher(var0);
            if (var2.find()) {
               var7 = var2.group(1) + ":" + var2.group(2).replace(".", "/");
            }

            com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = new com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var6, var1, var7, var0
            );
            if (HORRHCOIOORRCHHHROOIHRROCORIIR == null) {
               HORRHCOIOORRCHHHROOIHRROCORIIR = new ArrayList<>();
               HORRHCOIOORRCHHHROOIHRROCORIIR.add(var8);
            } else if (!HORRHCOIOORRCHHHROOIHRROCORIIR.contains(var8)) {
               HORRHCOIOORRCHHHROOIHRROCORIIR.add(var8);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Generated
   public static boolean isEnabled() {
      return enabled;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final String RHIIIOORRCIHCRHCHIRRHHIOCOHCCI;
      private final String RHRHHHRICRHHOOORRIRHRIHRRCCHCR;
      private final String OIRIRORHCOORICRIHCHOICCIRIRORH;
      private final String HRCROHRRIHOIOHOHRRIROHRHOHIOOH;

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else {
            return !(
                  var1 instanceof com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
               )
               ? false
               : Objects.equals(var2.RHIIIOORRCIHCRHCHIRRHHIOCOHCCI, this.RHIIIOORRCIHCRHCHIRRHHIOCOHCCI)
                  && Objects.equals(var2.RHRHHHRICRHHOOORRIRHRIHRRCCHCR, this.RHRHHHRICRHHOOORRIRHRIHRRCCHCR)
                  && Objects.equals(var2.OIRIRORHCOORICRIHCHOICCIRIRORH, this.OIRIRORHCOORICRIHCHOICCIRIRORH);
         }
      }

      @Override
      public String toString() {
         return this.RHIIIOORRCIHCRHCHIRRHHIOCOHCCI
            + ","
            + this.RHRHHHRICRHHOOORRIRHRIHRRCCHCR
            + ","
            + this.OIRIRORHCOORICRIHCHOICCIRIRORH
            + ","
            + this.HRCROHRRIHOIOHOHRRIROHRHOHIOOH;
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, String var4) {
         this.RHIIIOORRCIHCRHCHIRRHHIOCOHCCI = var1;
         this.RHRHHHRICRHHOOORRIRHRIHRRCCHCR = var2;
         this.OIRIRORHCOORICRIHCHOICCIRIRORH = var3;
         this.HRCROHRRIHOIOHOHRRIROHRHOHIOOH = var4;
      }
   }
}
