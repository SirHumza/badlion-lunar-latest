package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   private String id;
   private String name;

   @Override
   public void load(JsonObject var1) {
      this.id = var1.get("id").getAsString();
      this.name = var1.get("name").getAsString();
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      JsonObject var2 = new JsonObject();
      var1.add("minecraftProfile", var2);
      var2.addProperty("id", this.id);
      var2.addProperty("name", this.name);
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public void setId(String var1) {
      this.id = var1;
   }

   @Generated
   public void setName(String var1) {
      this.name = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else {
         String var3 = this.getId();
         String var4 = var2.getId();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.getName();
            String var6 = var2.getName();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.getId();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getName();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "MinecraftProfile(id=" + this.getId() + ", name=" + this.getName() + ")";
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var1, String var2) {
      this.id = var1;
      this.name = var2;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   }
}
