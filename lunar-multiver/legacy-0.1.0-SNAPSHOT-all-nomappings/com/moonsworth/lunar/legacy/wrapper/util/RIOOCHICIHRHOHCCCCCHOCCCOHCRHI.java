package com.moonsworth.lunar.legacy.wrapper.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import lombok.Generated;
import net.minecraft.client.resources.data.IMetadataSectionSerializer_v1_7;
import net.minecraft.util.JsonUtils;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements JsonDeserializer<RRCRRCORICCHOHHIRCHIROOHIIOHCO>, IMetadataSectionSerializer_v1_7 {
   public static final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HCICHOCRHICIHIRIOOCRROHHRIRIRI = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();

   public String getSectionName() {
      return "lunar";
   }

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IHCRORHRORIICHRHRCHRRIRRHHOCOO(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = JsonUtils.getElementAsJsonObject$v1_7(var1, "lunar");
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         JsonUtils.getJsonObjectStringFieldValueOrDefault$v1_7(var4, "emissive", null),
         JsonUtils.getJsonObjectBooleanFieldValueOrDefault$v1_7(var4, "emissiveAnimated", true)
      );
   }

   @Generated
   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   }
}
