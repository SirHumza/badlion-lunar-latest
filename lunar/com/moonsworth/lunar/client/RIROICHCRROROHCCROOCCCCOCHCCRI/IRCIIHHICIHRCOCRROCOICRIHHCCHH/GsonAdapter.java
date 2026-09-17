package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @SerializedName("id")
   private final int OHIHCRCHRCRRHHOHOIHCCROHHICHOH;
   @SerializedName("name")
   private final String OHORRIOICROCIIRCIOIRIIRROOICHI;
   @JsonAdapter(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class)
   @SerializedName("resource")
   private final String resource;
   @SerializedName("category")
   private final String CIROOIRRIIRRCCIHOORHCRIRCICHIC;
   @SerializedName("indexType")
   private final String ROCCIHRIIOHRCHIRRCHHRHHCOICIHR;
   @SerializedName("morph")
   private final String RCHCICHOCORHICROORCIHORROORHHC;
   @SerializedName("morphDuration")
   private final Integer RRIRCRCRRCOROIIRCCOCHOORHCCHOH;
   @SerializedName("geckolibCosmetic")
   private final boolean RIIOHROCCCICOCOOHHHORROORCROCR;
   @SerializedName("special")
   private final boolean RHOOROCCHICHRHRHIICIHCOCIIOCHR;
   @SerializedName("animated")
   private final boolean OHRCOCIOHRRIHROHHIOOCCIRRIHORH;
   @SerializedName("item_material")
   private final CORCOCICIRIOHROHROIIOOHICCHCRR CIRIIHOOROHHHCROCCCRHCCCHHOHOR;
   @SerializedName("hideOnProfileExternal")
   private final boolean IOHRHCOCHRIOHRCCRCCCRRCRIIHOOI;
   @SerializedName("colors")
   private final List<String> OOOHHCCROIRHCCRIIRIHIORRHIIHCO;
   @SerializedName("tags")
   private final List<String> IHHCROCOIIIIIIIOORCIOOHRROOICC;
   @SerializedName("releasedAt")
   private final Date CHHRCHORROICOIROIRCHHOHCIRROCO;
   private boolean RHHHHHIRRCOOCIHIIIIOHIIHCRCHHO;

   public String CHRROHIRHRCRHHCRCHHIIRHOCHHCOO() {
      int var1 = this.resource.indexOf(58);
      return var1 >= 0 ? this.resource.substring(var1 + 1) : this.resource;
   }

   public Optional<HHCCIRHCCCIIRHCROHIORHIRHHIORH> HCHCOCRCHHRHROOORIIOCOCCOOHHOI() {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH.from(this.CIROOIRRIIRRCCIHOORHCRIRCICHIC);
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      return this.HCHCOCRCHHRHROOORIIOCOCCOOHHOI().map(var1::equals).orElse(false);
   }

   @Generated
   public int getId() {
      return this.OHIHCRCHRCRRHHOHOIHCCROHHICHOH;
   }

   @Generated
   public String getName() {
      return this.OHORRIOICROCIIRCIOIRIIRROOICHI;
   }

   @Generated
   public String RORRIHRRIHOHCRHIIRHRHCCCRIRIRO() {
      return this.resource;
   }

   @Generated
   public String CIOIHRCOCIHROHCOCOIHROOICIOIOR() {
      return this.ROCCIHRIIOHRCHIRRCHHRHHCOICIHR;
   }

   @Generated
   public String COHHOIIOCICRCOHIIICRRORROHOORO() {
      return this.RCHCICHOCORHICROORCIHORROORHHC;
   }

   @Generated
   public Integer CRCOCOOIHIIOOHOCCCICCIIHOHHIRO() {
      return this.RRIRCRCRRCOROIIRCCOCHOORHCCHOH;
   }

   @Generated
   public boolean OIIRHCIHCIHHOIOICHICICIOICROHH() {
      return this.RIIOHROCCCICOCOOHHHORROORCROCR;
   }

   @Generated
   public boolean isSpecial() {
      return this.RHOOROCCHICHRHRHIICIHCOCIIOCHR;
   }

   @Generated
   public boolean ICCRCOIRIROHCRHCCCCHCOIIRHHHOC() {
      return this.OHRCOCIOHRRIHROHHIOOCCIRRIHORH;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR IIIOORCCCROORROOORROOCIRHOIORI() {
      return this.CIRIIHOOROHHHCROCCCRHCCCHHOHOR;
   }

   @Generated
   public boolean IOHROIIHRCOCHOCIOIOOIRCIHRROIC() {
      return this.IOHRHCOCHRIOHRCCRCCCRRCRIIHOOI;
   }

   @Generated
   public List<String> getColors() {
      return this.OOOHHCCROIRHCCRIIRIHIORRHIIHCO;
   }

   @Generated
   public List<String> RRCRICRRCIOOIOICRHIOOIORHHHOHH() {
      return this.IHHCROCOIIIIIIIOORCIOOHRROOICC;
   }

   @Generated
   public Date HOHRRHHIRHORHCOOHOIOICCOIIIROI() {
      return this.CHHRCHORROICOIROIRCHHOHCIRROCO;
   }

   @Generated
   public boolean OCROIROOCHIRIICORRRRIIHCCHIORR() {
      return this.RHHHHHIRRCOOCIHIIIIOHIIHCRCHHO;
   }

   @Generated
   @Override
   public String toString() {
      return "CosmeticIndexEntry(id="
         + this.getId()
         + ", name="
         + this.getName()
         + ", resource="
         + this.RORRIHRRIHOHCRHIIRHRHCCCRIRIRO()
         + ", category="
         + this.HCHCOCRCHHRHROOORIIOCOCCOOHHOI()
         + ", indexType="
         + this.CIOIHRCOCIHROHCOCOIHROOICIOIOR()
         + ", morph="
         + this.COHHOIIOCICRCOHIIICRRORROHOORO()
         + ", morphDuration="
         + this.CRCOCOOIHIIOOHOCCCICCIIHOHHIRO()
         + ", geckolibCosmetic="
         + this.OIIRHCIHCIHHOIOICHICICIOICROHH()
         + ", special="
         + this.isSpecial()
         + ", animated="
         + this.ICCRCOIRIROHCRHCCCCHCOIIRHHHOC()
         + ", itemRenderMaterial="
         + this.IIIOORCCCROORROOORROOCIRHOIORI()
         + ", hideOnProfileExternal="
         + this.IOHROIIHRCOCHOCIOIOOIRCIHRROIC()
         + ", colors="
         + this.getColors()
         + ", tags="
         + this.RRCRICRRCIOOIOICRHIOOIORHHHOHH()
         + ", releasedAt="
         + this.HOHRRHHIRHORHCOOHOIOICCOIIIROI()
         + ", isDev="
         + this.OCROIROOCHIRIICORRRRIIHCCHIORR()
         + ")";
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      int var1,
      String var2,
      String var3,
      String var4,
      String var5,
      String var6,
      Integer var7,
      boolean var8,
      boolean var9,
      boolean var10,
      CORCOCICIRIOHROHROIIOOHICCHCRR var11,
      boolean var12,
      List<String> var13,
      List<String> var14,
      Date var15,
      boolean var16
   ) {
      this.OHIHCRCHRCRRHHOHOIHCCROHHICHOH = var1;
      this.OHORRIOICROCIIRCIOIRIIRROOICHI = var2;
      this.resource = var3;
      this.CIROOIRRIIRRCCIHOORHCRIRCICHIC = var4;
      this.ROCCIHRIIOHRCHIRRCHHRHHCOICIHR = var5;
      this.RCHCICHOCORHICROORCIHORROORHHC = var6;
      this.RRIRCRCRRCOROIIRCCOCHOORHCCHOH = var7;
      this.RIIOHROCCCICOCOOHHHORROORCROCR = var8;
      this.RHOOROCCHICHRHRHIICIHCOCIIOCHR = var9;
      this.OHRCOCIOHRRIHROHHIOOCCIRRIHORH = var10;
      this.CIRIIHOOROHHHCROCCCRHCCCHHOHOR = var11;
      this.IOHRHCOCHRIOHRCCRCCCRRCRIIHOOI = var12;
      this.OOOHHCCROIRHCCRIIRIHIORRHIIHCO = var13;
      this.IHHCROCOIIIIIIIOORCIOOHRROOICC = var14;
      this.CHHRCHORROICOIROIRCHHOHCIRROCO = var15;
      this.RHHHHHIRRCOOCIHIIIIOHIIHCRCHHO = var16;
   }

   @Generated
   public void IOICICOROHHHOHROOOHCRCCOIRIOHO(boolean var1) {
      this.RHHHHHIRRCOOCIHIIIIOHIIHCRCHHO = var1;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<String> {
      public void write(JsonWriter var1, String var2) {
         var1.value(var2);
      }

      public String read(JsonReader var1) {
         String var2 = var1.nextString();
         int var3 = var2.indexOf(58);
         if (var3 >= 0) {
            var2 = var2.substring(var3 + 1);
         }

         return "lunar-jit:" + var2;
      }
   }
}
