package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import org.jetbrains.annotations.NotNull;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOIICCCROHCHHCHOCHHRHICIOCHIIC;
   private final boolean[] HRCCCOHOHIHOOOHOOCICCIOOHHIRII;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this(var1, new boolean[var1.size() * var1.size()]);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean[] var1) {
      this(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromGridLength(
            (int)Math.floor(Math.sqrt(var1.length))
         ),
         var1
      );
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      boolean[] var2
   ) {
      this.IOIICCCROHCHHCHOCHHRHICIOCHIIC = var1;
      this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII = var2;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCCIOOIRCRCORRCIOIOOCICIIOHCCI() {
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MEDIUM
      );
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICCHRHRORIIOICOIOCRICHOIROROCI() {
      boolean[] var1 = new boolean[this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII.length];
      System.arraycopy(this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII, 0, var1, 0, var1.length);
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IOIICCCROHCHHCHOCHHRHICIOCHIIC, var1);
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      boolean var2
   ) {
      int var3 = this.CRICOHCIOHIOOCRIHHORCOIHOROCII().size();
      int var4 = var1.size();
      if (var3 == var4) {
         return this.ICCHRHRORIIOICOIOCRICHOIROROCI();
      }

      BufferedImage var5 = new BufferedImage(var3, var3, 2);

      for (int var6 = 0; var6 < var3; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            var5.setRGB(var6, var7, this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII[var6 + var7 * var3] ? -1 : 0);
         }
      }

      BufferedImage var11 = new BufferedImage(var4, var4, 2);
      Graphics2D var12 = var11.createGraphics();
      if (var2) {
         var12.drawImage(var5, 0, 0, var4, var4, null);
      } else {
         int var8 = var4 / 2 - var3 / 2;
         var12.drawImage(var5, var8, var8, var3, var3, null);
      }

      var12.dispose();
      boolean[] var13 = new boolean[var4 * var4];

      for (int var9 = 0; var9 < var4; var9++) {
         for (int var10 = 0; var10 < var4; var10++) {
            var13[var9 + var10 * var4] = var11.getRGB(var9, var10) != 0;
         }
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13);
   }

   public boolean isEmpty() {
      for (boolean var4 : this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII) {
         if (var4) {
            return false;
         }
      }

      return true;
   }

   @NotNull
   public String IORRCHRHRHCRORORCICHCIHRIIOOHO() {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH("LCCH", this.RRIRCHROCIIIIIOROOOCCIIIICHHOR(), this.CRHCCIHHIIRIRRCCCCIHIRRCCOOIOI()).toString();
   }

   @NotNull
   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHHRCIROCCOHCHOIOHIOCHOIIHOCIO(String var0) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOHIHCIHIHRCOOIOCOHIOHROHHIOHR(var0);
      return var1 != null && var1.type().equals("LCCH")
         ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.ROROHIHORCCOHCIRHRHOCHCIIOCIIO(), var1.RIHHCROROROHHROICCIRHOICCOOIHC())
         : OCCIOOIRCRCORRCIOIOOCICIIOHCCI();
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, byte[] var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.fromGridLength(
            var0
         )
      );
      int var3 = var2.IOIICCCROHCHHCHOCHHRHICIOCHIIC.size();
      int var4 = var2.HRHRORCIRICHCCCCCHICOOICIRHRIO(var0);

      for (int var5 = 0; var5 < var0; var5++) {
         for (int var6 = 0; var6 < var0; var6++) {
            int var7 = var5 + var4 + (var6 + var4) * var3;
            if (var7 >= 0 && var7 < var3 * var3) {
               int var8 = (var5 + var6 * var0) / 8;
               int var9 = 1 << (var5 + var6 * var0) % 8;
               var2.HRCCCOHOHIHOOOHOOCICCIOOHHIRII[var7] = (var1[var8] & var9) != 0;
            }
         }
      }

      return var2;
   }

   public byte[] CRHCCIHHIIRIRRCCCCIHIRRCCOOIOI() {
      int var1 = this.IOIICCCROHCHHCHOCHHRHICIOCHIIC.size();
      int var2 = this.RRIRCHROCIIIIIOROOOCCIIIICHHOR();
      int var3 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO(var2);
      byte[] var4 = new byte[this.OCIIROIOORRIOIIIRHIRRCCIIRRROH(var2)];

      for (int var5 = 0; var5 < var2; var5++) {
         for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var6 + var3 + (var5 + var3) * var1;
            if (var7 >= 0 && var7 < var1 * var1 && this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII[var7]) {
               int var8 = (var6 + var5 * var2) / 8;
               int var9 = 1 << (var6 + var5 * var2) % 8;
               var4[var8] |= (byte)var9;
            }
         }
      }

      return var4;
   }

   public int OCIIROIOORRIOIIIRHIRRCCIIRRROH(int var1) {
      return (int)Math.ceil(var1 * var1 / 8.0F);
   }

   public int HRHRORCIRICHCCCCCHICOOICIRHRIO(int var1) {
      return (int)Math.floor((this.IOIICCCROHCHHCHOCHHRHICIOCHIIC.size() - var1) / 2.0F);
   }

   public int RRIRCHROCIIIIIOROOOCCIIIICHHOR() {
      int var1 = this.IOIICCCROHCHHCHOCHHRHICIOCHIIC.size();
      int var2 = 1;

      for (int var3 = 0; var3 < this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII.length; var3++) {
         if (this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII[var3]) {
            int var4 = var3 % var1;
            int var5 = var3 / var1;
            var2 = Math.max(var2, this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var4, var1));
            var2 = Math.max(var2, this.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var5, var1));
         }
      }

      return var2;
   }

   private int RICRIRRCOHRCOCRRHHCRHRROOIOHHR(int var1, int var2) {
      int var3 = var1 - var2 / 2;
      return var3 <= 0 ? -var3 * 2 + 1 : var3 * 2;
   }

   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRICOHCIOHIOOCRIHHORCOIHOROCII() {
      return this.IOIICCCROHCHHCHOCHHRHICIOCHIIC;
   }

   public boolean[] ICCCIHRHOCCOICCORHORCHHHROOIRC() {
      return this.HRCCCOHOHIHOOOHOOCICCIOOHHIRII;
   }
}
