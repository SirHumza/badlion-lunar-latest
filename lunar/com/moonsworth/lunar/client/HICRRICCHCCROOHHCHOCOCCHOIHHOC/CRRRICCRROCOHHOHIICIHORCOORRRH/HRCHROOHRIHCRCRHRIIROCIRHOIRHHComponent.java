package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.net.MediaType;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import lombok.Generated;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   public static final MediaType IIIOIOCRHCOHHCROOIIROICRCCIHHC = MediaType.PNG;
   private final String CIROIIIIOHCIOHRHHOHOROCOIIHCII;
   private final String imageUrl;
   private final String COROCCIOCRRRCIRIRHRCIRHCICOHOO;
   private String HCICRICIOIIOOCOIIRHORICIHHRCOR = "backgrounds/post-default-403x171.png";

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3) {
      this.CIROIIIIOHCIOHRHHOHOROCOIIHCII = var1;
      this.imageUrl = var2;
      this.COROCCIOCRRRCIRIRHRCIRHCICOHOO = var3;
   }

   public String getHash() {
      return Hashing.md5().hashString(this.imageUrl, Charsets.UTF_8).toString();
   }

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("title", this.CIROIIIIOHCIOHRHHOHOROCOIIHCII);
      var1.addProperty("imageUrl", this.HCICRICIOIIOOCOIIRHORICIHHRCOR);
      var1.addProperty("link", this.COROCCIOCRRRCIRIRHRCIRHCICOHOO);
      return var1;
   }

   @Generated
   public String getTitle() {
      return this.CIROIIIIOHCIOHRHHOHOROCOIIHCII;
   }

   @Generated
   public String getImageUrl() {
      return this.imageUrl;
   }

   @Generated
   public String HROIRIROCICIROHHHRRCRHCHCHCCOI() {
      return this.COROCCIOCRRRCIRIRHRCIRHCICOHOO;
   }

   @Generated
   public String COCRRRHCRCORHIOIHCOIIIIRCHCORH() {
      return this.HCICRICIOIIOOCOIIRHORICIHHRCOR;
   }

   @Generated
   public void HROICORRORCIOIHHOROICROHIOCHIO(String var1) {
      this.HCICRICIOIIOOCOIIRHORICIHHRCOR = var1;
   }
}
