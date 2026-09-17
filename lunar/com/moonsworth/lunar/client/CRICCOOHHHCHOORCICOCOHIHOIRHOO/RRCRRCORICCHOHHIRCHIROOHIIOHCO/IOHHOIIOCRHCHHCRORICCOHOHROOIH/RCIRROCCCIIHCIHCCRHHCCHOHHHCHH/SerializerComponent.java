package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   @SerializedName("value")
   @NotNull
   private final String CIIRRHOOHICIHHOCHHHRROIRCHIHCI;
   @SerializedName("state")
   @NotNull
   private final CRRRICCRROCOHHOHIICIHORCOORRRH OCICIICIRIOOIROORICIHORHRRCICR;
   public static final JsonSerializer<RRCRRCORICCHOHHIRCHIROOHIIOHCO> OCROCRRRHHCIICHOHCHRCCRRCCHHRR = (var0, var1, var2) -> {
      JsonObject var3 = new JsonObject();
      var3.addProperty("value", var0.CIIRRHOOHICIHHOCHHHRROIRCHIHCI);
      if (var0.OCICIICIRIOOIROORICIHORHRRCICR != CRRRICCRROCOHHOHIICIHORCOORRRH.CIIICRRCCOHIOHOCORCCCOHCIRICCC && var0.OCICIICIRIOOIROORICIHORHRRCICR.isEmpty()
         )
       {
         var3.addProperty("state", var0.OCICIICIRIOOIROORICIHORHRRCICR.value());
      }

      return var3;
   };
   public static final JsonDeserializer<RRCRRCORICCHOHHIRCHIROOHIIOHCO> HIICOIIOCHIOHICIOHIOICRHOHRIRH = (var0, var1, var2) -> {
      JsonObject var3 = var0.getAsJsonObject();
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var3.get("value").getAsString(),
         var3.has("state")
            ? CRRRICCRROCOHHOHIICIHORCOORRRH.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(var3.get("state").getAsString())
            : CRRRICCRROCOHHOHIICIHORCOORRRH.OORIOHCICHIHCIRRIIOHCCHCIHCOIH()
      );
   };

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(@NotNull String var1, @NotNull CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
      this.CIIRRHOOHICIHHOCHHHRROIRCHIHCI = var1;
      this.OCICIICIRIOOIROORICIHORHRRCICR = var2;
   }

   @SerializedName("value")
   @NotNull
   public String value() {
      return this.CIIRRHOOHICIHHOCHHHRROIRCHIHCI;
   }

   @SerializedName("state")
   @NotNull
   public CRRRICCRROCOHHOHIICIHORCOORRRH OCORHORCCCCRHORIOHIROOHIOHCCCC() {
      return this.OCICIICIRIOOIROORICIHORHRRCICR;
   }
}
