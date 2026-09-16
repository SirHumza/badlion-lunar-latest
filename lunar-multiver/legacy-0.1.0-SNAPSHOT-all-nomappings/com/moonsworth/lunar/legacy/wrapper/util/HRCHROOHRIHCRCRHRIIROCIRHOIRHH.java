package com.moonsworth.lunar.legacy.wrapper.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import lombok.Generated;
import net.minecraft.client.resources.data.IMetadataSectionSerializer_v1_8;
import net.minecraft.util.JsonUtils;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 5)
public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements IMetadataSectionSerializer_v1_8<RRCRRCORICCHOHHIRCHIROOHIIOHCO> {
   public static final HRCHROOHRIHCRCRHRIIROCIRHOIRHH OHOOOHOCRHHRHHCHRHRRHHHOCIOHOR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();

   public String getSectionName() {
      return "lunar";
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IHCRORHRORIICHRHRCHRRIRRHHOCOO(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = JsonUtils.getJsonObject$v1_8(var1, "lunar");
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonUtils.getString$v1_8(var4, "emissive", null), JsonUtils.getBoolean$v1_8(var4, "emissiveAnimated", true));
   }

   @Generated
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
   }
}
