package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public record CRRRICCRROCOHHOHIICIHORCOORRRH() {
   private final String IOCIOCRCHHOCIIOOHHIOIIIOHICIHO;
   private static final SimpleDateFormat ROCORRHROCRIHHRHCIHRRIICCCIRCR = new SimpleDateFormat("HH:mm:ss");

   public CRRRICCRROCOHHOHIICIHORCOORRRH(String var1) {
      this.IOCIOCRCHHOCIIOOHHIOIIIOHICIHO = var1;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH HOHORCIHRHCIRHIHHRCHIIOHORHCRH(String var0) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Throwable var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, "Catching {}: {}", var2.getClass().getName(), var2.getMessage(), var2
      );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, Object... var3) {
      PrintStream var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var4 != null) {
         String var5 = String.format(var2, var3);
         var4.printf("[%s] [%s/%s] %s%n", ROCORRHROCRIHHRHCIHRRIICCCIRCR.format(new Date()), this.IOCIOCRCHHOCIIOOHHIOIIIOHICIHO, var1, var5);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, Throwable var3) {
      PrintStream var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var4 != null) {
         var4.printf("[%s] [%s/%s] %s%n", ROCORRHROCRIHHRHCIHRRIICCCIRCR.format(new Date()), this.IOCIOCRCHHOCIIOOHHIOIIIOHICIHO, var1, var2);
         var3.printStackTrace(var4);
      }
   }

   public void info(String var1, Object... var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INFO, var1, var2);
   }

   public <T extends Throwable> T throwing(T var1) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.WARN, "Throwing {}: {}", var1.getClass().getName(), var1.getMessage(), var1
      );
      return (T)var1;
   }

   private PrintStream RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return var1 != CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.TRACE
            && var1 != CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DEBUG
         ? System.out
         : null;
   }

   public String id() {
      return this.IOCIOCRCHHOCIIOOHHIOIIIOHICIHO;
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
