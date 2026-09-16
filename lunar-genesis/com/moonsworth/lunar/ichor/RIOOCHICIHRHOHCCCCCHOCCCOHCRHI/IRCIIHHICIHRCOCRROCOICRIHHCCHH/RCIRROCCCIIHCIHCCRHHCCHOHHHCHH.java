package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.logging.LoggerAdapterAbstract;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends LoggerAdapterAbstract {
   private static final SimpleDateFormat IOHCIIOCIIIRORRCCHROCIICIRHIHH = new SimpleDateFormat("HH:mm:ss");
   private PrintStream debug;
   private CORCOCICIRIOHROHROIIOOHICCHCRR IICOCROOIIRIOHIHOIROIRIHIIIOHC;
   public static final String OCORRCCIOOCOHICCICOCCHHCOHOHHH = "@Mixin target %s is public in %s and should be specified in value";
   public static final String IOCIRHOIHRCICHHHRHCHCHOIHIHRRI = "If this is a development environment you can ignore this message";
   public static final List<String> IIIHOOOCCOCIIRHCHOCIROCHOIHOOO = List.of(
      "@Mixin target %s is public in %s and should be specified in value", "If this is a development environment you can ignore this message"
   );

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, CORCOCICIRIOHROHROIIOOHICCHCRR var2) {
      super(var1 == null ? "" : var1);
      this.IICOCROOIIRIOHIHOIROIRIHIIIOHC = var2;
   }

   @Override
   public String getType() {
      return "Ichor Console Logger";
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(PrintStream var1) {
      this.debug = var1;
      return this;
   }

   @Override
   public void catching(Level var1, Throwable var2) {
      if (var2.getMessage() == null || !var2.getMessage().contains("IchorClassLoader(MIXIN) couldn't find class bytes for")) {
         this.log(Level.WARN, "Catching {}: {}", var2.getClass().getName(), var2.getMessage(), var2);
      }
   }

   @Override
   public void log(Level var1, String var2, Object... var3) {
      if (!var2.contains("Error loading class: ") && (!var2.contains("@Mixin target") || !var2.contains("was not found"))) {
         PrintStream var4 = this.getOutputStream(var1);
         if (var4 != null) {
            LoggerAdapterAbstract.FormattedMessage var5 = new LoggerAdapterAbstract.FormattedMessage(var2, var3);
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               String.format(
                  "[%s] [%s(%s)/%s] %s%n",
                  IOHCIIOCIIIRORRCCHROCIICIRHIHH.format(new Date()),
                  this.getId(),
                  this.IICOCROOIIRIOHIHOIROIRIHIIIOHC.toString(),
                  var1,
                  var5
               ),
               var4
            )) {
               return;
            }

            if (var5.hasThrowable()) {
               Throwable var6 = var5.getThrowable();
               if (var6.getMessage() != null && !var6.getMessage().contains("IchorClassLoader(MIXIN) couldn't find class bytes for")) {
                  var6.printStackTrace(var4);
               }
            }

            var4.flush();
         }
      }
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
      PrintStream var4 = this.getOutputStream(var1);
      if (var4 != null) {
         if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            String.format(
               "[%s] [%s(%s)/%s] %s%n",
               IOHCIIOCIIIRORRCCHROCIICIRHIHH.format(new Date()),
               this.getId(),
               this.IICOCROOIIRIOHIHOIROIRIHIIIOHC.toString(),
               var1,
               var2
            ),
            var4
         )) {
            return;
         }

         var3.printStackTrace(var4);
         var4.flush();
      }
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, PrintStream var2) {
      for (String var4 : IIIHOOOCCOCIIRHCHOCIROCHOIHOOO) {
         if (var1.contains(var4)) {
            return true;
         }
      }

      var2.print(var1);
      return false;
   }

   @Override
   public <T extends Throwable> T throwing(T var1) {
      this.log(Level.WARN, "Throwing {}: {}", var1.getClass().getName(), var1.getMessage(), var1);
      return (T)var1;
   }

   private PrintStream getOutputStream(Level var1) {
      return var1 != Level.TRACE && var1 != Level.DEBUG ? System.out : null;
   }
}
