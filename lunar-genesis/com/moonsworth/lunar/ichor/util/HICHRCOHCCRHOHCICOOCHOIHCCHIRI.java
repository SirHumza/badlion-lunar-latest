package com.moonsworth.lunar.ichor.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends PrintStream {
   private final PrintStream RCHRCOIIIHICOCOOOIIRIRHIIHHIHI;
   private final boolean RIHIORRIOCRHIRHIRCCOIIOCHRCRCO;
   private final Path ICRIOOOCRROOIOCROORRCRCHRCOHOC;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(PrintStream var1, String var2, boolean var3) {
      super(var1);
      this.RCHRCOIIIHICOCOOOIIRIRHIIHHIHI = var1;
      this.RIHIORRIOCRHIRHIRCCOIIOCHRCRCO = System.out == var1;
      this.ICRIOOOCRROOIOCROORRCRCHRCOHOC = new File(var2).toPath();

      try {
         Files.createDirectories(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC.getParent());
         if (!var3) {
            Files.write(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC, new byte[0], StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
         } else if (!Files.exists(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC)) {
            Files.createFile(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC);
         }
      } catch (IOException var5) {
         throw new RuntimeException("Failed to create log file", var5);
      }
   }

   @Override
   public void println(@Nullable String var1) {
      super.println(var1);
      this.HIRROHCROOOIRHOOCRIRRORORIIRCI("\n");
   }

   @Override
   public void println(Object var1) {
      super.println(var1);
      this.HIRROHCROOOIRHOOCRIRRORORIIRCI("\n");
   }

   @Override
   public void print(String var1) {
      super.print(var1);
      this.HIRROHCROOOIRHOOCRIRRORORIIRCI(var1);
   }

   @Override
   public void print(Object var1) {
      super.print(var1);
      this.HIRROHCROOOIRHOOCRIRRORORIIRCI(String.valueOf(var1));
   }

   protected void HIRROHCROOOIRHOOCRIRRORORIIRCI(@Nullable String var1) {
      if (var1 != null) {
         if ((!this.RIHIORRIOCRHIRHIRCCOIIOCHRCRCO || System.out instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI)
            && (this.RIHIORRIOCRHIRHIRCCOIIOCHRCRCO || System.err instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI)) {
            try {
               Files.write(this.ICRIOOOCRROOIOCROORRCRCHRCOHOC, var1.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException var3) {
               throw new RuntimeException(var3);
            }
         }
      }
   }

   @Generated
   public PrintStream OORCOROORIORCCRRHCOOORICHOCOCH() {
      return this.RCHRCOIIIHICOCOOOIIRIRHIIHHIHI;
   }
}
