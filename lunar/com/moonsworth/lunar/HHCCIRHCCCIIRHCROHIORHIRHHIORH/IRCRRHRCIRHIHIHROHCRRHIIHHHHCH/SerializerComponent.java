package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   public static HICRRICCHCCROOHHCHOCOCCHOIHHOC CCHHHHCICRCCCIOOIOICOOCRCRHCCR = new HICRRICCHCCROOHHCHOCOCCHOIHHOC(
      new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F)
   );
   public Vector3f IHIHHCICIRHOCHCIOCIORCCOCHORHC;
   public Vector3f IHCHHRRIIIORORCHIICIIOORCOIOIO;
   public Vector3f RCRHICHHOOHCRHHCCCHCHIIRRHHRRH;

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.IHIHHCICIRHOCHCIOCIORCCOCHORHC = new Vector3f(var1);
      this.IHCHHRRIIIORORCHIICIIOORCOIOIO = new Vector3f(var2);
      this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH = new Vector3f(var3);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      boolean var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2
   ) {
      if (this != CCHHHHCICRCCCIOOIOICOOCRCRHCCR) {
         float var3 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.x();
         float var4 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.y();
         float var5 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.z();
         if (var1) {
            var4 = -var4;
            var5 = -var5;
         }

         int var6 = var1 ? -1 : 1;
         var2.bridge$translate(var6 * this.IHCHHRRIIIORORCHIICIIOORCOIOIO.x(), this.IHCHHRRIIIORORCHIICIIOORCOIOIO.y(), this.IHCHHRRIIIORORCHIICIIOORCOIOIO.z());
         var2.bridge$mulPose(CIOHHCORHRCCRICCCORIHCRHCCCRRR(Math.toRadians(var3), Math.toRadians(var4), Math.toRadians(var5)));
         var2.bridge$scale(this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.x(), this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.y(), this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.z());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      boolean var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR var2
   ) {
      if (this != CCHHHHCICRCCCIOOIOICOOCRCRHCCR) {
         float var3 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.x();
         float var4 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.y();
         float var5 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.z();
         if (var1) {
            var4 = -var4;
            var5 = -var5;
         }

         int var6 = var1 ? -1 : 1;
         var2.translate(var6 * this.IHCHHRRIIIORORCHIICIIOORCOIOIO.x(), this.IHCHHRRIIIORORCHIICIIOORCOIOIO.y(), this.IHCHHRRIIIORORCHIICIIOORCOIOIO.z());
         var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR(Math.toRadians(var3), Math.toRadians(var4), Math.toRadians(var5)));
         var2.scale(this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.x(), this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.y(), this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.z());
      }
   }

   public static Quaternionf CIOHHCORHRCCRICCCORIHCRHCCCRRR(double var0, double var2, double var4) {
      float var6 = (float)Math.sin(0.5 * var0);
      float var7 = (float)Math.cos(0.5 * var0);
      float var8 = (float)Math.sin(0.5 * var2);
      float var9 = (float)Math.cos(0.5 * var2);
      float var10 = (float)Math.sin(0.5 * var4);
      float var11 = (float)Math.cos(0.5 * var4);
      float var12 = var6 * var9 * var11 + var7 * var8 * var10;
      float var13 = var7 * var8 * var11 - var6 * var9 * var10;
      float var14 = var6 * var8 * var11 + var7 * var9 * var10;
      float var15 = var7 * var9 * var11 - var6 * var8 * var10;
      return new Quaternionf(var12, var13, var14, var15);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      HICRRICCHCCROOHHCHOCOCCHOIHHOC var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC)var1;
      return this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.equals(var2.IHIHHCICIRHOCHCIOCIORCCOCHORHC)
         && this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.equals(var2.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH)
         && this.IHCHHRRIIIORORCHIICIIOORCOIOIO.equals(var2.IHCHHRRIIIORORCHIICIIOORCOIOIO);
   }

   @Override
   public int hashCode() {
      int var1 = this.IHIHHCICIRHOCHCIOCIORCCOCHORHC.hashCode();
      var1 = 31 * var1 + this.IHCHHRRIIIORORCHIICIIOORCOIOIO.hashCode();
      return 31 * var1 + this.RCRHICHHOOHCRHHCCCHCHIIRRHHRRH.hashCode();
   }

   public static JsonArray RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static JsonArray IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonElement var0, String var1) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray");
      }
   }

   public static float HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float");
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements JsonDeserializer<HICRRICCHCCROOHHCHOCOCCHOIHHOC> {
      public static Vector3f HHRIHOIIOIRRCHRHRIHIRICOIHRHRO = new Vector3f(0.0F, 0.0F, 0.0F);
      public static Vector3f RCRRCCORORHORHOOIOIRCROCIROOCR = new Vector3f(0.0F, 0.0F, 0.0F);
      public static Vector3f OIOOIHRRCRIIOCCRROOOROOIOCCOHO = new Vector3f(1.0F, 1.0F, 1.0F);
      public static float CICIHRIOIHHROIRHIIRORIOIIRCIRR;
      public static float MAX_SCALE;

      public HICRRICCHCCROOHHCHOCOCCHOIHHOC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonElement var1, Type var2, JsonDeserializationContext var3) {
         JsonObject var4 = var1.getAsJsonObject();
         Vector3f var5 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "rotation", HHRIHOIIOIRRCHRHRIHIRICOIHRHRO);
         Vector3f var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "translation", RCRRCCORORHORHOOIOIRCROCIROOCR);
         var6.mul(0.0625F);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, -5.0F, 5.0F);
         Vector3f var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, "scale", OIOOIHRRCRIIOCCRROOOROOIOCCOHO);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, -4.0F, 4.0F);
         return new HICRRICCHCCROOHHCHOCOCCHOIHHOC(var5, var6, var7);
      }

      private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3f var0, float var1, float var2) {
         var0.set(clamp(var0.x, var1, var2), clamp(var0.y, var1, var2), clamp(var0.z, var1, var2));
      }

      public static float clamp(float var0, float var1, float var2) {
         return Math.min(var2, Math.max(var0, var1));
      }

      public Vector3f RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var1, String var2, Vector3f var3) {
         if (!var1.has(var2)) {
            return var3;
         }

         JsonArray var4 = HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
         if (var4.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var4.size());
         }

         float[] var5 = new float[3];

         for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6] = HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4.get(var6), var2 + "[" + var6 + "]");
         }

         return new Vector3f(var5[0], var5[1], var5[2]);
      }
   }
}
