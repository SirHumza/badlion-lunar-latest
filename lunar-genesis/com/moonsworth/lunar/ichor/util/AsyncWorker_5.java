package com.moonsworth.lunar.ichor.util;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   public static OCOHORHCROHICRRIHCIHHRRCIHICRI IRRCCOICORICIHCHRHIHIHROIRHOCR = CRHHIRIIHRRIRCOHRIORHORCOCIHHI("Ichor");
   private final String ICRRIIIROICICHCCOIRCORIIHRCHRC;
   private Path ICRIOOOCRROOIOCROORRCRCHRCOHOC = null;
   private static final SimpleDateFormat IHRICHOIOORHRCHCHIRCCCHHICICCH = new SimpleDateFormat("HH:mm:ss");

   public OCOHORHCROHICRRIHCIHHRRCIHICRI(String var1) {
      this.ICRRIIIROICICHCCOIRCORIIHRCHRC = var1;
   }

   public static OCOHORHCROHICRRIHCIHHRRCIHICRI HRCOCHHHCCIORCORCHIOOOCCCCHICH(Class<?> var0) {
      return new OCOHORHCROHICRRIHCIHHRRCIHICRI(var0.getSimpleName());
   }

   public static OCOHORHCROHICRRIHCIHHRRCIHICRI CRHHIRIIHRRIRCOHRIORHORCOCIHHI(String var0) {
      return new OCOHORHCROHICRRIHCIHHRRCIHICRI(var0);
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI ICICIOCHHHIHOCHCOHORIHRCOHHOCR(@NotNull Path var1) {
      this.ICRIOOOCRROOIOCROORRCRCHRCOHOC = var1;

      try {
         Files.createDirectories(var1.getParent());
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return this;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Throwable var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "Catching " + var2.getClass().getName() + ": " + var2.getMessage(), var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, Object... var3) {
      PrintStream var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var4 != null) {
         try {
            String var5 = String.format(var2, var3);
            var4.printf(
               "[%s] [%s/%s/%s] %s%n",
               IHRICHOIOORHRCHCHIRCCCHHICICCH.format(new Date()),
               this.ICRRIIIROICICHCCOIRCORIIHRCHRC,
               Thread.currentThread().getName(),
               var1,
               var5
            );
            this.ICRIHROIRHIHOCOOCRCHCHRRCHOHHC(var5);
         } catch (Exception var7) {
            String var6 = var2 + "[" + Arrays.stream(var3).map(Object::toString).collect(Collectors.joining(",")) + "]";
            var4.printf(
               "[%s] [%s/%s/%s] %s%n",
               IHRICHOIOORHRCHCHIRCCCHHICICCH.format(new Date()),
               this.ICRRIIIROICICHCCOIRCORIIHRCHRC,
               Thread.currentThread().getName(),
               var1,
               var6
            );
            this.ICRIHROIRHIHOCOOCRCHCHRRCHOHHC(var6);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, var7);
            throw var7;
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, Throwable var3) {
      PrintStream var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var4 != null) {
         var4.printf(
            "[%s] [%s/%s/%s] %s%n",
            IHRICHOIOORHRCHCHIRCCCHHICICCH.format(new Date()),
            this.ICRRIIIROICICHCCOIRCORIIHRCHRC,
            Thread.currentThread().getName(),
            var1,
            var2
         );
         var3.printStackTrace(var4);
         this.ICRIHROIRHIHOCOOCRCHCHRRCHOHHC(
            var2 + "\n" + var3.getMessage() + "\n" + String.join("\n", Arrays.stream(var3.getStackTrace()).map(StackTraceElement::toString).toList()) + "\n"
         );
      }
   }

   private void ICRIHROIRHIHOCOOCRCHCHRRCHOHHC(String var1) {
      if (this.ICRIOOOCRROOIOCROORRCRCHRCOHOC != null) {
         try {
            Files.write(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC, (var1 + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   public void info(String var1, Object... var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INFO, var1, var2);
   }

   public void warn(String var1, Object... var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, var1, var2);
   }

   public void warn(String var1, Throwable var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, var1, var2);
   }

   public void fatal(String var1, Object... var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FATAL, var1, var2);
   }

   public <T extends Throwable> T throwing(T var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, "Throwing {}: {}", var1.getClass().getName(), var1.getMessage(), var1
      );
      return (T)var1;
   }

   private PrintStream RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return var1 != OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRACE
            && var1 != OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DEBUG
         ? System.out
         : null;
   }

   @Generated
   public Path ICRIOOIHHICCRHHICIRHIRIROCHCHI() {
      return this.ICRIOOOCRROOIOCROORRCRCHRCOHOC;
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      FATAL,
      ERROR,
      WARN,
      INFO,
      DEBUG,
      TRACE;
   }
}
