package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.websocket.serverdiscovery.v1.Announcement;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import org.jetbrains.annotations.Nullable;

public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   @SerializedName("text")
   private final String CHCRHROIORCIIHOIORCIIHICORIRHC;
   @SerializedName("countDownTo")
   @Nullable
   private final Long RRICIIHORCHIHIICHOOCHORORCCCHR;
   @SerializedName("countUpFrom")
   @Nullable
   private final Long ICIIRRHHHHOHICCHHRRIIROOHOOCRH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, @Nullable Long var2, @Nullable Long var3) {
      this.CHCRHROIORCIIHOIORCIIHICORIRHC = var1;
      this.RRICIIHORCHIHIICHOOCHORORCCCHR = var2;
      this.ICIIRRHHHHOHICCHHRRIIROOHOOCRH = var3;
   }

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Announcement var0) {
      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.getText(),
         var0.hasCountDownTo() ? CCHORHIOORICCIRIHRIIHIICORIORO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.getCountDownTo()) : null,
         var0.hasCountUpFrom() ? CCHORHIOORICCIRIHRIIHIICORIORO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.getCountUpFrom()) : null
      );
   }

   @SerializedName("text")
   public String text() {
      return this.CHCRHROIORCIIHOIORCIIHICORIRHC;
   }

   @SerializedName("countDownTo")
   @Nullable
   public Long CHCOOCCHCHCHIOIRHIIIRCOCROCCCR() {
      return this.RRICIIHORCHIHIICHOOCHORORCCCHR;
   }

   @SerializedName("countUpFrom")
   @Nullable
   public Long OOORCCRIICRRIOROOOCOIOROHCIRCR() {
      return this.ICIIRRHHHHOHICCHHRRIIROOHOOCRH;
   }
}
