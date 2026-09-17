package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import lombok.Generated;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   CLASSIC("classic", "Steve", "http://textures.minecraft.net/texture/1a4af718455d4aab528e7a61f86fa25e6a369d1768dcb13f7df319a713eb810b"),
   SLIM("slim", "Alex", "http://textures.minecraft.net/texture/3b60a1f6d562f52aaebbf1434f1de147933a3affe0e764fa49ea057536623cd3");

   private final String name;
   private final String userFriendlyName;
   private final String defaultSkinUrl;

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("name", this.name);
      var1.addProperty("userFriendlyName", this.userFriendlyName);
      var1.addProperty("defaultSkinUrl", this.defaultSkinUrl);
      return var1;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getUserFriendlyName() {
      return this.userFriendlyName;
   }

   @Generated
   public String getDefaultSkinUrl() {
      return this.defaultSkinUrl;
   }

   @Generated
   RRCRRCORICCHOHHIRCHIROOHIIOHCO(String var3, String var4, String var5) {
      this.name = var3;
      this.userFriendlyName = var4;
      this.defaultSkinUrl = var5;
   }
}
