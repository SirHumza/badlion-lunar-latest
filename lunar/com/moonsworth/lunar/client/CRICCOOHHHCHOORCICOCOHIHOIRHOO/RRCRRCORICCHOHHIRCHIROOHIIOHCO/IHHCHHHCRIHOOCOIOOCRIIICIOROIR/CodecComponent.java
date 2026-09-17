package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   private final String RHHRIRCHCHIOCHOCOIRORRCRORCIHR;
   private final int IRRRCHRRICOCIRIICOHRHRHOHHCCCR;
   private final byte[] ROHRROIOROHCHIOCOOCHICIIRORROO;
   private static final String RHICORCICRHORCHRHOCCIIOHICIIHC = "#";

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, int var2, byte[] var3) {
      this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR = var1;
      this.IRRRCHRRICOCIRIICOHRHRHOHHCCCR = var2;
      this.ROHRROIOROHCHIOCOOCHICIIRORROO = var3;
   }

   @Nullable
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHIHCIHIHRCOOIOCOHIOHROHHIOHR(String var0) {
      String[] var1 = var0.trim().split("-");
      if (var1.length != 3) {
         return null;
      }

      String var2 = var1[0];
      if (!"LCCH".equals(var2) && !"LCCS".equals(var2)) {
         return null;
      }

      int var3;
      try {
         var3 = Integer.parseInt(var1[1]);
      } catch (NumberFormatException var7) {
         return null;
      }

      byte[] var4;
      try {
         var4 = decode(var1[2]);
      } catch (DataFormatException var6) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("Crosshair code data parse failed " + var0, var6);
         return null;
      }

      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var3, var4);
   }

   @Override
   public String toString() {
      if (!this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR.equals("LCCH") && !this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR.equals("LCCS")) {
         throw new IllegalArgumentException("Invalid crosshair type " + this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR);
      } else {
         return this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR + "-" + this.IRRRCHRRICOCIRIICOHRHRHOHHCCCR + "-" + encode(this.ROHRROIOROHCHIOCOOCHICIIRORROO);
      }
   }

   @NotNull
   private static String encode(byte[] var0) {
      Deflater var1 = new Deflater();
      var1.setLevel(9);
      var1.setInput(var0);
      var1.finish();
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      byte[] var3 = new byte[1024];

      while (!var1.finished()) {
         int var4 = var1.deflate(var3);
         var2.write(var3, 0, var4);
      }

      var1.end();
      String var6 = Base64.getEncoder().encodeToString(var0);
      String var5 = Base64.getEncoder().encodeToString(var2.toByteArray()) + "#";
      return var5.length() < var6.length() ? var5 : var6;
   }

   @NotNull
   private static byte[] decode(String var0) {
      if (!var0.endsWith("#")) {
         return Base64.getDecoder().decode(var0);
      }

      var0 = var0.substring(0, var0.length() - 1);
      byte[] var1 = Base64.getDecoder().decode(var0);
      Inflater var2 = new Inflater();
      var2.setInput(var1);
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte[] var4 = new byte[1024];

      while (!var2.finished()) {
         int var5 = var2.inflate(var4);
         var3.write(var4, 0, var5);
      }

      var2.end();
      return var3.toByteArray();
   }

   public String type() {
      return this.RHHRIRCHCHIOCHOCOIRORRCRORCIHR;
   }

   public int ROROHIHORCCOHCIRHRHOCHCIIOCIIO() {
      return this.IRRRCHRRICOCIRIICOHRHRHOHHCCCR;
   }

   public byte[] RIHHCROROROHHROICCIRHOICCOOIHC() {
      return this.ROHRROIOROHCHIOCOOCHICIIRORROO;
   }
}
