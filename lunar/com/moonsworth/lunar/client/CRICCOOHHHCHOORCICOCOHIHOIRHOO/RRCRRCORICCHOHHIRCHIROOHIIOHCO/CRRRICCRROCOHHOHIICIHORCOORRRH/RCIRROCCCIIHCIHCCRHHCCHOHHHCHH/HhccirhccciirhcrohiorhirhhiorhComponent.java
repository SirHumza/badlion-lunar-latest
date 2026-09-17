package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import java.util.HashMap;
import java.util.Map.Entry;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIRHHIHRRHRHORHCCHCCORCRHRHIHH;
   private boolean CRIOCCIIRCRIICORCHOHCOHOHRHHHC;
   private int[] OHHOICCOCOHIIORCIIROOOIHIRRHCC = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
   private boolean CRIHIROOHORHCORRCRHIIRHIIHIOIC;
   private static final HashMap<String, Integer> CHHCHCHHHIIOHOIRHOCCHOIIHCIICR = new HashMap<>();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH = var1;
   }

   public void IRHCCIIHRROHIHHCHHRCCOCCICOOCC() {
      if (this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IHOIHCIHROOCOORRRIOORHOCCIRCOO()
         && this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.isEnabled()
         && this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.RHOICHOOHHCCHCOHCHOIOCORORRHRI().get()) {
         com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
            .RRRCHORHHHIHOCIOCRICCOIOOHHCOO();
         this.CRIOCCIIRCRIICORCHOHCOHOHRHHHC = var1.HRCOCIRHOIRHCHRCOHHIROHIORRRIH.equals("BEDWARS") && var1.CHCCORCICOHOCHICRHIRORIORHOICC != null;
      } else {
         this.CRIOCCIIRCRIICORCHOHCOHOHRHHHC = false;
      }
   }

   private int[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var1) {
      int[] var2 = new int[8];

      for (int var3 = 0; var3 < var1.size(); var3++) {
         JsonPrimitive var4 = var1.get(var3).getAsJsonPrimitive();
         if (var4.isString()) {
            var2[var3] = CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.getOrDefault(var4.getAsString(), 5);
         } else {
            var2[var3] = var4.getAsInt();
         }
      }

      return var2;
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, JsonElement var2) {
      if (var2 == null) {
         return false;
      } else if (var2 instanceof JsonArray) {
         this.OHHOICCOCOHIIORCIIROOOIHIRRHCC = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getAsJsonArray());
         return true;
      } else {
         String var3 = var2.getAsString();
         var2 = var1.get(var3);
         if (var2 instanceof JsonArray) {
            this.OHHOICCOCOHIIORCIIROOOIHIRRHCC = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2.getAsJsonArray());
            return true;
         } else {
            return false;
         }
      }
   }

   public void RHOOHCOHIRCIRRCIICHHHIOHCHOORO() {
      if (this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH() != null) {
         com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
            .RRRCHORHHHIHOCIOCRICCOIOOHHCOO();
         if (var1.CHCCORCICOHOCHICRHIRORIORHOICC != null) {
            JsonObject var2 = this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH().get("map").getAsJsonObject();
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH(), var2.get(var1.CHCCORCICOHOCHICRHIRORIORHOICC)
            )) {
               return;
            }
         }

         if (var1.CIOCCCICHORIOIRROOOCCCRHHORRRI != null) {
            JsonObject var5 = this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH().get("modes").getAsJsonObject();

            for (Entry var4 : var5.entrySet()) {
               if (var1.CIOCCCICHORIOIRROOOCCCRHHORRRI.contains((CharSequence)var4.getKey())
                  && this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH(), (JsonElement)var4.getValue())) {
                  return;
               }
            }
         }

         this.OHHOICCOCOHIIORCIIROOOIHIRRHCC = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.IIRHHIHRRHRHORHCCHCCORCRHRHIHH.IIIHCHIIOCRCCIOIRCCRHRRORHCOOH().get("default").getAsJsonArray()
         );
      }
   }

   @Generated
   public boolean HCCOHHHOHHRIHRCHIRIHOORHRICCIO() {
      return this.CRIOCCIIRCRIICORCHOHCOHOHRHHHC;
   }

   @Generated
   public int[] RRCRRRHIOIIIRHIOOCHHOIHCOOIRII() {
      return this.OHHOICCOCOHIIORCIIROOOIHIRRHCC;
   }

   @Generated
   public void OCIIROIOORRIOIIIRHIRRCCIIRRROH(boolean var1) {
      this.CRIHIROOHORHCORRCRHIIRHIIHIOIC = var1;
   }

   @Generated
   public boolean CCICHIRHRCROIHCRCHCHHORCOHHCHI() {
      return this.CRIHIROOHORHCORRCRHIIRHIIHIOIC;
   }

   static {
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("yellow", 0);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("cyan", 1);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("aqua", 1);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("white", 2);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("pink", 3);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("gray", 4);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("red", 5);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("blue", 6);
      CHHCHCHHHIIOHOIRHOCCHOIIHCIICR.put("green", 7);
   }
}
