package com.moonsworth.lunar.client.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import net.minecraft.client.renderer.WorldRenderer;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends WorldRenderer {
   private final WorldRenderer RRHROIOCOOIROHRHRHOHORIOCHCCIC;
   private final com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICIOCOOIORIRHOIIOCRCHIOHHCICHH;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(WorldRenderer var1) {
      super(0);
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC = var1;
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH = com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCHHROCIRRRICRHROHROHOCCCHOIOH;
   }

   public WorldRenderer pos(double var1, double var3, double var5) {
      com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH;
      float[] var8 = var7.RCRRCIIOOORIOCHOIORHHORHRHRIOC;
      int var9 = var7.size;
      var8[var9] = (float)var1;
      var8[var9 + 1] = (float)var3;
      var8[var9 + 2] = (float)var5;
      var7.size += 3;
      return this;
   }

   public WorldRenderer tex(double var1, double var3) {
      com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH;
      float[] var6 = var5.RCRRCIIOOORIOCHOIORHHORHRHRIOC;
      int var7 = var5.size;
      var6[var7] = (float)var1;
      var6[var7 + 1] = (float)var3;
      var5.size += 2;
      return this;
   }

   public WorldRenderer color(float var1, float var2, float var3, float var4) {
      int var5 = (int)(var1 * 255.0F) & 0xFF;
      int var6 = ((int)(var2 * 255.0F) & 0xFF) << 8;
      int var7 = ((int)(var3 * 255.0F) & 0xFF) << 16;
      int var8 = ((int)(var4 * 255.0F) & 0xFF) << 24;
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.RCRRCIIOOORIOCHOIORHHORHRHRIOC[this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size++] = Float.intBitsToFloat(
         var8 | var7 | var6 | var5
      );
      return this;
   }

   public WorldRenderer color(int var1, int var2, int var3, int var4) {
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.RCRRCIIOOORIOCHOIORHHORHRHRIOC[this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size++] = Float.intBitsToFloat(
         var4 << 24 | var3 << 16 | var2 << 8 | var1
      );
      return this;
   }

   public WorldRenderer lightmap(int var1, int var2) {
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.RCRRCIIOOORIOCHOIORHHORHRHRIOC[this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size++] = Float.intBitsToFloat(var1 << 16 | var2);
      return this;
   }

   public void endVertex() {
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(this.vertexFormat.getIntegerSize());
   }

   public void flush() {
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC.begin(this.drawMode, this.vertexFormat);
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC.vertexCount = this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size / this.vertexFormat.getIntegerSize();
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC.growBuffer(0);
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC.byteBuffer.clear();
      this.RRHROIOCOOIROHRHRHOHORIOCHCCIC
         .byteBuffer
         .asFloatBuffer()
         .put(this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.RCRRCIIOOORIOCHOIORHHORHRHRIOC, 0, this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size);
      this.ICIOCOOIORIRHOIIOCRCHIOHHCICHH.size = 0;
   }

   public WorldRenderer HCHOOHRCCOOCHICOICORCHHCOOIHOC() {
      return this.RRHROIOCOOIROHRHRHOHORIOCHCCIC;
   }
}
