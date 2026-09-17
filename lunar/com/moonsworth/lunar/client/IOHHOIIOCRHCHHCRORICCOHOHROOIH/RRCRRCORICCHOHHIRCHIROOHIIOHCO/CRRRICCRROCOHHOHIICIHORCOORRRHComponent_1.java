package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private String server;
   private String world;
   private String name;
   private Double x;
   private Double y;
   private Double HICOICIRCCRIRRCCCIRHHRORHCIRCO;

   @Override
   protected void RIROICHCRROROHCCROOCCCCOCHCCRI(JsonObject var1) {
      if (this.server != null && this.world != null && this.name != null) {
         JsonObject var2 = new JsonObject();
         var2.addProperty("server", this.server);
         var2.addProperty("world", this.world);
         var2.addProperty("name", this.name);
         var1.add("waypoint", var2);
      }

      if (this.x != null && this.y != null && this.HICOICIRCCRIRRCCCIRHHRORHCIRCO != null) {
         JsonObject var3 = new JsonObject();
         var3.addProperty("x", this.x);
         var3.addProperty("y", this.y);
         var3.addProperty("z", this.HICOICIRCCRIRRCCCIRHHRORHCIRCO);
         var1.add("location", var3);
      }

      super.RIROICHCRROROHCCROOCCCCOCHCCRI(var1);
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3, Double var4, Double var5, Double var6) {
      this.server = var1;
      this.world = var2;
      this.name = var3;
      this.x = var4;
      this.y = var5;
      this.HICOICIRCCRIRRCCCIRHHRORHCIRCO = var6;
   }

   @Generated
   public static com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIHRICICCICOROHIHCIIOCOIRRHIH() {
      return new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Generated
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @Generated
      private String server;
      @Generated
      private String world;
      @Generated
      private String name;
      @Generated
      private Double x;
      @Generated
      private Double y;
      @Generated
      private Double HICOICIRCCRIRRCCCIRHHRORHCIRCO;

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHCICOOHOICHHROOIRICCHHHHOHIOR(
         String var1
      ) {
         this.server = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROCICHRHCOCRHHHRHCOIOROOORHHHI(
         String var1
      ) {
         this.world = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIRCHICICRHIOOOHRIRIRHHRHICOHC(
         String var1
      ) {
         this.name = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIHRRHORCRCROCHHOHORCHCROCIHRO(
         Double var1
      ) {
         this.x = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOHORHCROHICRRIHCIHHRRCIHICRI(
         Double var1
      ) {
         this.y = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIOHHCORHRCCRICCCORIHCRHCCCRRR(
         Double var1
      ) {
         this.HICOICIRCCRIRRCCCIRHHRORHCIRCO = var1;
         return this;
      }

      @Generated
      public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRIOHIOCOCOICCOICOHROORHOIRHII() {
         return new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.server, this.world, this.name, this.x, this.y, this.HICOICIRCCRIRRCCCIRHHRORHCIRCO
         );
      }

      @Generated
      @Override
      public String toString() {
         return "ConfigureWaypointProps.ConfigureWaypointPropsBuilder(server="
            + this.server
            + ", world="
            + this.world
            + ", name="
            + this.name
            + ", x="
            + this.x
            + ", y="
            + this.y
            + ", z="
            + this.HICOICIRCCRIRRCCCIRHHRORHCIRCO
            + ")";
      }
   }
}
