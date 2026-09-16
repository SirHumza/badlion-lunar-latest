package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   private final int RCRIRHRRIIHHCCHIOOHRHIOOCOHHHI;
   private final int ROCOOHICCCIIIROOOHCOOOHHHIIORI;
   private final int HCOHRIIOIIIRORHOIORCHRHIIRRORR;
   private final int OCCIOORHIIOIRHRRHOIRHOHRHCROIH;
   private final boolean RIOOOHRHOCORRHIIRCIHIICRIRRORI;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2, int var3, int var4, boolean var5) {
      this.RCRIRHRRIIHHCCHIOOHRHIOOCOHHHI = var1;
      this.ROCOOHICCCIIIROOOHCOOOHHHIIORI = var2;
      this.HCOHRIIOIIIRORHOIORCHRHIIRRORR = var3;
      this.OCCIOORHIIOIRHRRHOIRHOHRHCROIH = var4;
      this.RIOOOHRHOCORRHIIRCIHIICRIRRORI = var5;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH ICHIOROOHIICRORCCROHOROHCCORRI(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String[] var1 = var0.split("/");
         if (var1.length == 0) {
            return null;
         }

         boolean var2 = false;
         byte var3 = 0;
         if (!OICHCCCIOCICCICCIROHOOCRCRHHCR(var1[0])) {
            var2 = Boolean.parseBoolean(var1[0]);
            var3 = 1;
         }

         int var4 = var1.length - var3;
         if (var4 != 3 && var4 != 4) {
            return null;
         }

         try {
            int var5 = ICCIRICOHOCCCICROHCRCIOHOIRIIC(Integer.parseInt(var1[var3].trim()));
            int var6 = ICCIRICOHOCCCICROHCRCIOHOIRIIC(Integer.parseInt(var1[var3 + 1].trim()));
            int var7 = ICCIRICOHOCCCICROHCRCIOHOIRIIC(Integer.parseInt(var1[var3 + 2].trim()));
            int var8 = var4 == 4 ? ICCIRICOHOCCCICROHCRCIOHOIRIIC(Integer.parseInt(var1[var3 + 3].trim())) : 255;
            return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5, var6, var7, var8, var2);
         } catch (NumberFormatException var9) {
            return null;
         }
      } else {
         return null;
      }
   }

   public int HICOHOOHRHRRCIHRRCORRRHCIHOOCO() {
      return (this.OCCIOORHIIOIRHRRHOIRHOHRHCROIH & 0xFF) << 24
         | (this.RCRIRHRRIIHHCCHIOOHRHIOOCOHHHI & 0xFF) << 16
         | (this.ROCOOHICCCIIIROOOHCOOOHHHIIORI & 0xFF) << 8
         | this.HCOHRIIOIIIRORHOIORCHRHIIRRORR & 0xFF;
   }

   private static boolean OICHCCCIOCICCICCIROHOOCRCRHHCR(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         for (int var1 = 0; var1 < var0.length(); var1++) {
            if (!Character.isDigit(var0.charAt(var1))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static int ICCIRICOHOCCCICROHCRCIOHOIRIIC(int var0) {
      return Math.max(0, Math.min(255, var0));
   }

   public int red() {
      return this.RCRIRHRRIIHHCCHIOOHRHIOOCOHHHI;
   }

   public int green() {
      return this.ROCOOHICCCIIIROOOHCOOOHHHIIORI;
   }

   public int blue() {
      return this.HCOHRIIOIIIRORHOIORCHRHIIRRORR;
   }

   public int alpha() {
      return this.OCCIOORHIIOIRHRRHOIRHOHRHCROIH;
   }

   public boolean ICCICOOROCORCIHCOHCOORIHRRIRCO() {
      return this.RIOOOHRHOCORRHIIRCIHIICRIRRORI;
   }
}
