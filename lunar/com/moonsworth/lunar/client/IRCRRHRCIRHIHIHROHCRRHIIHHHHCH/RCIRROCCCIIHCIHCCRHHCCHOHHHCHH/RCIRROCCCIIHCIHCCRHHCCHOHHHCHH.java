package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   private final int red;
   private final int green;
   private final int blue;
   private final int alpha;
   private final boolean CRRICRIOIIRCORRHRIIIOOOCROCOCO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, int var3, int var4, boolean var5) {
      this.red = var1;
      this.green = var2;
      this.blue = var3;
      this.alpha = var4;
      this.CRRICRIOIIRCORRHRIIIOOOCROCOCO = var5;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHIOICIOCRRHOOCOHRORIHICHRCRR(JsonElement var0) {
      if (var0 != null && var0.isJsonObject()) {
         JsonObject var1 = var0.getAsJsonObject();
         JsonElement var2 = var1.get("color");
         if (var2 != null && var2.isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject();
            String var4 = var1.has("mode") ? var1.get("mode").getAsString() : "STATIC";
            boolean var5 = "RAINBOW".equalsIgnoreCase(var4) || "CHROMA".equalsIgnoreCase(var4);
            return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IIHRRHORCRCROCHHOHORCHCROCIHRO(var3, "red"),
               IIHRRHORCRCROCHHOHORCHCROCIHRO(var3, "green"),
               IIHRRHORCRCROCHHOHORCHCROCIHRO(var3, "blue"),
               IIHRRHORCRCROCHHOHORCHCROCIHRO(var3, "alpha"),
               var5
            );
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static int IIHRRHORCRCROCHHOHORCHCROCIHRO(JsonObject var0, String var1) {
      return var0.has(var1) ? var0.get(var1).getAsInt() & 0xFF : 255;
   }

   public int HICOHOOHRHRRCIHRRCORRRHCIHOOCO() {
      return (this.alpha & 0xFF) << 24 | (this.red & 0xFF) << 16 | (this.green & 0xFF) << 8 | this.blue & 0xFF;
   }

   public boolean ICCICOOROCORCIHCOHCOORIHRRIRCO() {
      return this.CRRICRIOIIRCORRHRIIIOOOCROCOCO;
   }
}
