package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHIHIIHCCCCCIHRORIOIOORCIOHII;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private String id;
   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIROHRORIHIICRHIRIHICHHIRHHRRO;
   private String HRRCHICRCIROCOCOCHORHROCCHCOHC;
   private Object defaultValue;
   private float RIOIHICIIHIHOIIIIIOIROIIHHICOR = 0.0F;
   private float RCCCIHCHIRHRIROOIHHIHRORHIRRRR = 100.0F;
   private List<String> HRHCCICCCHCHIICIOOOIOHHCOIOOCH = new ArrayList<>();

   @Override
   public JsonElement provide() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.id);
      var1.add("defaultValue", HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.getJsonPrimitive(this.defaultValue));
      return var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2)) {
         return false;
      } else {
         if (!var2.canEqual(this)) {
            return false;
         }

         if (Float.compare(this.HCORIRROHHCIIRIHCOCCIHIRORCRIH(), var2.HCORIRROHHCIIRIHCOCCIHIRORCRIH()) != 0) {
            return false;
         }

         if (Float.compare(this.ICHORCHIRRCCOHHCCHRCIIIHRHCOHC(), var2.ICHORCHIRRCCOHHCCHRCIIIHRHCOHC()) != 0) {
            return false;
         }

         String var3 = this.getId();
         String var4 = var2.getId();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = this.CRIIHCHHHOHCIOCCCOHRHRRHROHCOC();
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var2.CRIIHCHHHOHCIOCCCOHRHRRHROHCOC();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.HIIHHOCOCOHRHRRHRIIORHIOCCRCCR();
               String var8 = var2.HIIHHOCOCOHRHRRHRIIORHIOCCRCCR();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  Object var9 = this.getDefaultValue();
                  Object var10 = var2.getDefaultValue();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     List var11 = this.IHORHIICHRHICIOIRIIRCCCOIHCCIO();
                     List var12 = var2.IHORHIICHRHICIOIRIIRCCCOIHCCIO();
                     return var11 == null ? var12 == null : var11.equals(var12);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.HCORIRROHHCIIRIHCOCCIHIRORCRIH());
      var2 = var2 * 59 + Float.floatToIntBits(this.ICHORCHIRRCCOHHCCHRCIIIHRHCOHC());
      String var3 = this.getId();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.CRIIHCHHHOHCIOCCCOHRHRRHROHCOC();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.HIIHHOCOCOHRHRRHRIIORHIOCCRCCR();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      Object var6 = this.getDefaultValue();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      List var7 = this.IHORHIICHRHICIOIRIIRCCCOIHCCIO();
      return var2 * 59 + (var7 == null ? 43 : var7.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "GeckolibCosmeticOption(id="
         + this.getId()
         + ", type="
         + this.CRIIHCHHHOHCIOCCCOHRHRRHROHCOC()
         + ", molangQuery="
         + this.HIIHHOCOCOHRHRRHRIIORHIOCCRCCR()
         + ", defaultValue="
         + this.getDefaultValue()
         + ", minValue="
         + this.HCORIRROHHCIIRIHCOCCIHIRORCRIH()
         + ", maxValue="
         + this.ICHORCHIRRCCOHHCCHRCIIIHRHCOHC()
         + ", enumValues="
         + this.IHORHIICHRHICIOIRIIRCCCOIHCCIO()
         + ")";
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("id")
   @Generated
   public String getId() {
      return this.id;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("id")
   @Generated
   public void setId(String var1) {
      this.id = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("type")
   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CRIIHCHHHOHCIOCCCOHRHRRHROHCOC() {
      return this.RIROHRORIHIICRHIRIHICHHIRHHRRO;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("type")
   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.RIROHRORIHIICRHIRIHICHHIRHHRRO = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("molang_query")
   @Generated
   public String HIIHHOCOCOHRHRRHRIIORHIOCCRCCR() {
      return this.HRRCHICRCIROCOCOCHORHROCCHCOHC;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("molang_query")
   @Generated
   public void CRIHHIRCHOOCIIRRRRCCRCCCRCOIHI(String var1) {
      this.HRRCHICRCIROCOCOCHORHROCCHCOHC = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("default")
   @Generated
   public Object getDefaultValue() {
      return this.defaultValue;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("default")
   @Generated
   public void IOHHOIIOCRHCHHCRORICCOHOHROOIH(Object var1) {
      this.defaultValue = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("min")
   @Generated
   public float HCORIRROHHCIIRIHCOCCIHIRORCRIH() {
      return this.RIOIHICIIHIHOIIIIIOIROIIHHICOR;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("min")
   @Generated
   public void OOHRIIOOHROIOHCIRIHRHRRICRRHOI(float var1) {
      this.RIOIHICIIHIHOIIIIIOIROIIHHICOR = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("max")
   @Generated
   public float ICHORCHIRRCCOHHCCHRCIIIHRHCOHC() {
      return this.RCCCIHCHIRHRIROOIHHIHRORHIRRRR;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("max")
   @Generated
   public void RHHIOCHRCICCHOHCIHOOHOIHCCHRCO(float var1) {
      this.RCCCIHCHIRHRIROOIHHIHRORHIRRRR = var1;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("enum_values")
   @Generated
   public List<String> IHORHIICHRHICIOIRIIRCCCOIHCCIO() {
      return this.HRHCCICCCHCHIICIOOOIOHHCOIOOCH;
   }

   @ORHIOICIOCRRHOOCOHRORIHICHRCRR("enum_values")
   @Generated
   public void IRRCHICCRHCHRRCHIOHIIRIORIRHRI(List<String> var1) {
      this.HRHCCICCCHCHIICIOOOIOHHCOIOOCH = var1;
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      INT,
      FLOAT,
      BOOLEAN,
      ENUM;

      public static void loadDefaults(
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var0,
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
      ) {
         JsonObject var2 = var0.IHIRCRORCHIOICOROIOHIIOCIHCHRC();
         if (!var2.has(var1.id)) {
            var2.add(var1.id, getJsonPrimitive(var1.defaultValue));
         }
      }

      public static HCHRIROHHHCORIOCROOCHRCIOROOCI getOption(
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var0,
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
      ) {
         loadDefaults(var0, var1);
         JsonObject var2 = var0.IHIRCRORCHIOICOROIOHIIOCIHCHRC();
         String var3 = findOrFormatName("settings", var1.id);

         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var4 = switch (var1.CRIIHCHHHOHCIOCCCOHRHRRHROHCOC()) {
            case BOOLEAN -> {
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var8 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
                     var1.id
                  )
                  .RICIORHICRROHOCHRRCRIHCROOCIIC((Boolean)var1.getDefaultValue())
                  .HICOHCCCIROCOIHCORCHOCROCIIOCI(var3)
                  .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
               var8.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2.get(var1.id).getAsBoolean());
               yield var8;
            }
            case INT -> {
               RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var7 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICHOCHHROIHCROICCIRIHHCHRHROCO(var1.id)
                  .RCIICICHIIRIIRHHROCOOOHRROOIIC(((Number)var1.getDefaultValue()).intValue())
                  .OCIROOIHIHRHOCCHIIIROOCRIIOCRR(Math.round(var1.RIOIHICIIHIHOIIIIIOIROIIHHICOR), Math.round(var1.RCCCIHCHIRHRIROOIHHIHRORHIRRRR))
                  .HICOHCCCIROCOIHCORCHOCROCIIOCI(var3)
                  .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
               var7.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2.get(var1.id).getAsInt());
               yield var7;
            }
            case FLOAT -> {
               IHIRRIIORRHORHRORIHOROIRCORCOO var6 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.HOOIORHIHOIHOIIOORHROICRCOHCOH(var1.id)
                  .RROIIRROOOOHIORHRICHOCHIHCRRCH(((Number)var1.getDefaultValue()).floatValue())
                  .CRHROHHHCIHHCOHCOORCRIHHIICROR(var1.RIOIHICIIHIHOIIIIIOIROIIHHICOR, var1.RCCCIHCHIRHRIROOIHHIHRORHIRRRR)
                  .HICOHCCCIROCOIHCORCHOCROCIIOCI(var3)
                  .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
               var6.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var2.get(var1.id).getAsFloat());
               yield var6;
            }
            case ENUM -> {
               IOHIHIIHCCCCCIHRORIOIOORCIOHII var5 = IOHHOIIOCRHCHHCRORICCOHOHROOIH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1.id, var2.get(var1.id).getAsString())
                  .CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var1.HRHCCICCCHCHIICIOOOIOHHCOIOOCH)
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(Codec.STRING)
                  .HICOHCCCIROCOIHCORCHOCROCIIOCI(var3)
                  .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
               var5.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var2.get(var1.id).getAsString());
               yield var5;
            }
         };
         var4.IIOCHOIICCIORCOROIROHICCHIOHIC(var2x -> var2.add(var1.id, getJsonPrimitive(var2x)));
         return var4;
      }

      private static String findOrFormatName(String var0, String var1) {
         return !com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RRORCOIRRIICOOICOIOCORHORCHCOC(var0, var1)
            ? WordUtils.capitalize(var1.replaceAll("_", " "))
            : com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
      }

      public static JsonPrimitive getJsonPrimitive(Object var0) {
         if (var0 instanceof String var1) {
            return new JsonPrimitive(var1);
         } else if (var0 instanceof Number var2) {
            return new JsonPrimitive(var2);
         } else if (var0 instanceof Boolean var3) {
            return new JsonPrimitive(var3);
         } else {
            throw new IllegalArgumentException("Must be a string, number, or boolean");
         }
      }
   }
}
