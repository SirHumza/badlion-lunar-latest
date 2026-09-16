package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.Generated;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private float CIOHOHIRHCOHIOIOIORICOOHRCRHOI;
   private float HIICOICOOOHRCCHHHCRHOHHIOOCCOO;
   private int RIICHHHHRCRHOIHIRIOCRCIICIOOOO;
   private boolean reset;

   @Override
   public void load(JsonObject var1) {
      JsonElement var2 = var1.get("panelIndex");
      if (var2 != null && !var2.isJsonNull()) {
         this.OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(var2.getAsInt());
      } else {
         this.OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(0);
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      int var2 = this.IRHHCOICHOHCOORHORHRHCOIHOHRHC();
      if (var2 != 0) {
         var1.addProperty("panelIndex", var2);
      }
   }

   @Generated
   @Override
   public float OHOROIHROOIIHORCCRCRCHIRIOHRCO() {
      return this.CIOHOHIRHCOHIOIOIORICOOHRCRHOI;
   }

   @Generated
   @Override
   public float IRHOROCHICIIHROIRORIHCOIIIRIIO() {
      return this.HIICOICOOOHRCCHHHCRHOHHIOOCCOO;
   }

   @Generated
   @Override
   public int IRHHCOICHOHCOORHORHRHCOIHOHRHC() {
      return this.RIICHHHHRCRHOIHIRIOCRCIICIOOOO;
   }

   @Generated
   @Override
   public boolean IIRIRHHOOICICIOHIHOIROIIRIIIOR() {
      return this.reset;
   }

   @Generated
   @Override
   public void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(float var1) {
      this.CIOHOHIRHCOHIOIOIORICOOHRCRHOI = var1;
   }

   @Generated
   @Override
   public void RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(float var1) {
      this.HIICOICOOOHRCCHHHCRHOHHIOOCCOO = var1;
   }

   @Generated
   @Override
   public void OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(int var1) {
      this.RIICHHHHRCRHOIHIRIOCRCIICIOOOO = var1;
   }

   @Generated
   @Override
   public void OHRRHHOCROROCCIRROIHOCCHCIHCIR(boolean var1) {
      this.reset = var1;
   }
}
