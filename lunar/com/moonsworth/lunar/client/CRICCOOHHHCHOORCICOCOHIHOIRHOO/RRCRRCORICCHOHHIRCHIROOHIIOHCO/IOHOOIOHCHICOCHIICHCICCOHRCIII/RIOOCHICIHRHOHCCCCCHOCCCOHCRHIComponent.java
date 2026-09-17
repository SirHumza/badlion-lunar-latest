package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import java.util.UUID;
import javax.annotation.Nullable;
import lombok.Generated;
import lombok.NonNull;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @NonNull
   private UUID id;
   @NonNull
   private String name;
   @Nullable
   private String server;
   private boolean visible;
   private int RORRRHIIHIOHHIIRCICIHHORCHOIOH;
   private boolean isDefault;
   private long COHIRRIHHIOOOIIORIOOHCRIHOIOIH;
   private boolean IIOHHORORHICIHHOIIOOCHHIHICCIO;
   private CRRRICCRROCOHHOHIICIHORCOORRRH OCHCCRIHCHCCHOCRIROIOOOOHOIOII;
   private boolean HOIHHROHHCICCOHCCCIHCCOIHCIIIH;

   @Override
   public JsonElement HRRORHCRHHRROHIOROOOORRIRRCCIC() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("id", this.id.toString());
      var1.addProperty("name", this.name);
      if (this.server != null) {
         var1.addProperty("server", this.server);
      }

      var1.addProperty("visible", this.visible);
      var1.addProperty("sortIndex", this.RORRRHIIHIOHHIIRCICIHHORCHOIOH);
      var1.addProperty("isDefault", this.isDefault);
      var1.addProperty("renderOptionsOverrideMembers", this.ICHHOIHHRCHCRIHIOCOCHRHOIRICOH());
      var1.add("renderConfig", this.OCHCCRIHCHCCHOCRIROIOOOOHOIOII.HRRORHCRHHRROHIOROOOORRIRRCCIC());
      var1.addProperty("addedAt", RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRHRORCIRICHCCCCCHICOOICIRHRIO(this.COHIRRIHHIOOOIIORIOOHCRIHOIOIH));
      return var1;
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.addProperty("id", this.getId().toString());
      var1.addProperty("name", this.getName());
      var1.addProperty("visible", this.isVisible());
      var1.addProperty("sortIndex", this.IRIHRHCIRORRRHOHCOICRIOOIOIOIC());
      var1.addProperty("isDefault", this.isDefault());
      var1.addProperty("addedAtMs", this.OHRCHRHOCOOOCOCOICIROHRHOOCOOR());
      var1.addProperty("renderOptionsOverrideMembers", this.ICHHOIHHRCHCRIHIOCOCHRHOIRICOH());
      if (this.getServer() != null) {
         var1.addProperty("server", this.getServer());
      }

      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = this.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR();
      JsonObject var3 = new JsonObject();
      var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
      var1.add("renderConfig", var3);
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRRICCRROCOHHOHIICIHORCOORRRH(String var0, JsonObject var1) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = new CRRRICCRROCOHHOHIICIHORCOORRRH();
      var2.load(var1.get("renderConfig").getAsJsonObject());
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = OHHROHIOOHCCIOIHOOOHIOOCHCRRHC()
         .HIHHOCRHHRORRHHRORRRIIHHORIHOC(UUID.fromString(var0))
         .CHHOOIOHHRCIRIRRHHHOOCRCCHHOOR(var1.get("name").getAsString())
         .ICORIROICCORCRROCRCIRRRHHHOOIR(var1.get("visible").getAsBoolean())
         .OOCHIIROORIOCCCCCOORRIRIOHOORH(var1.get("sortIndex").getAsInt())
         .OICOHRRRRCOICCHOIOROHOCOORCHII(var1.get("isDefault").getAsBoolean())
         .RIIHIHHCRHCHRCICHOROHCHIIHCICH(var1.get("addedAtMs").getAsLong())
         .RHIIOORHHCCOCIORHIRCICHCHRRIII(var1.get("renderOptionsOverrideMembers").getAsBoolean())
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2)
         .HOOOOIOORROCRICOOOCRORCCCICROI();
      if (var1.has("server")) {
         var3.IOHHICHRIHCRCIIIROCCHICCIRCIII(var1.get("server").getAsString());
      }

      return var3;
   }

   @Generated
   private static UUID RIIHHCCHCIORHICRICOROOOHOHCICO() {
      return UUID.randomUUID();
   }

   @Generated
   private static String CRRRIHORHHRRRIIOCCICORCICIRIHC() {
      return "";
   }

   @Generated
   private static boolean HRROHIORCHICICCCHOCHHORRRHHICC() {
      return true;
   }

   @Generated
   private static int OIIIIIROICIRIRHCRHORHOCRCRCCOC() {
      return -1;
   }

   @Generated
   private static boolean HRIHOCRRROHIHCICCCCCCCRCCCHIRR() {
      return false;
   }

   @Generated
   private static long IOHOCOIHHOHIHHIOIIHOHRHOCOHCOC() {
      return System.currentTimeMillis();
   }

   @Generated
   private static boolean ROOICIORCOIHCCOIOCOCOHROHHIHHO() {
      return false;
   }

   @Generated
   private static CRRRICCRROCOHHOHIICIHORCOORRRH ICHCCOCHROCRHHHRHCCCIHRRRIRHCC() {
      return CRRRICCRROCOHHOHIICIHORCOORRRH.RIOICCHIORRRRCROIIHCRCOIIRIOOH;
   }

   @Generated
   private static boolean OOCCIHIRHCCOHIRROHHCROIIROOCIO() {
      return false;
   }

   @Generated
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHHROHIOOHCCIOIHOOOHIOOCHCRRHC() {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   @Generated
   public void HHRIICOIOORCHCOIICOOIHIRHHICRI(@NonNull UUID var1) {
      if (var1 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      this.id = var1;
   }

   @Generated
   public void setName(@NonNull String var1) {
      if (var1 == null) {
         throw new NullPointerException("name is marked non-null but is null");
      }

      this.name = var1;
   }

   @Generated
   public void IOHHICHRIHCRCIIIROCCHICCIRCIII(@Nullable String var1) {
      this.server = var1;
   }

   @Generated
   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   @Generated
   public void OCRHORIRHHHIIOCOOCHICOOCIHORCC(int var1) {
      this.RORRRHIIHIOHHIIRCICIHHORCHOIOH = var1;
   }

   @Generated
   public void setDefault(boolean var1) {
      this.isDefault = var1;
   }

   @Generated
   public void IIOCHOIICCIORCOROIROHICCHIOHIC(long var1) {
      this.COHIRRIHHIOOOIIORIOOHCRIHOIOIH = var1;
   }

   @Generated
   public void RIROOOIRCIRHOHIHROCICIOICCRICR(boolean var1) {
      this.IIOHHORORHICIHHOIIOOCHHIHICCIO = var1;
   }

   @Generated
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.OCHCCRIHCHCCHOCRIROIOOOOHOIOII = var1;
   }

   @Generated
   public void CCOIROOCRICIOIHOHCHRRHCCIHCRCO(boolean var1) {
      this.HOIHHROHHCICCOHCCCIHCCOIHCIIIH = var1;
   }

   @NonNull
   @Generated
   public UUID getId() {
      return this.id;
   }

   @NonNull
   @Generated
   public String getName() {
      return this.name;
   }

   @Nullable
   @Generated
   public String getServer() {
      return this.server;
   }

   @Generated
   public boolean isVisible() {
      return this.visible;
   }

   @Generated
   public int IRIHRHCIRORRRHOHCOICRIOOIOIOIC() {
      return this.RORRRHIIHIOHHIIRCICIHHORCHOIOH;
   }

   @Generated
   public boolean isDefault() {
      return this.isDefault;
   }

   @Generated
   public long OHRCHRHOCOOOCOCOICIROHRHOOCOOR() {
      return this.COHIRRIHHIOOOIIORIOOHCRIHOIOIH;
   }

   @Generated
   public boolean isOrdered() {
      return this.IIOHHORORHICIHHOIIOOCHHIHICCIO;
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH HOHOIICHHIRIOIIIOHRHOCCRRRRIHR() {
      return this.OCHCCRIHCHCCHOCRIROIOOOOHOIOII;
   }

   @Generated
   public boolean ICHHOIHHRCHCRIHIOCOCHRHOIRICOH() {
      return this.HOIHHROHHCICCOHCCCIHCCOIHCIIIH;
   }

   @Generated
   @Override
   public String toString() {
      return "WaypointGroup(id="
         + this.getId()
         + ", name="
         + this.getName()
         + ", server="
         + this.getServer()
         + ", visible="
         + this.isVisible()
         + ", sortIndex="
         + this.IRIHRHCIRORRRHOHCOICRIOOIOIOIC()
         + ", isDefault="
         + this.isDefault()
         + ", addedAtMs="
         + this.OHRCHRHOCOOOCOCOICIROHRHOOCOOR()
         + ", isOrdered="
         + this.isOrdered()
         + ", renderConfig="
         + this.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR()
         + ", renderOptionsOverrideMembers="
         + this.ICHHOIHHRCHCRIHIOCOCHRHOIRICOH()
         + ")";
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      @NonNull UUID var1,
      @NonNull String var2,
      @Nullable String var3,
      boolean var4,
      int var5,
      boolean var6,
      long var7,
      boolean var9,
      CRRRICCRROCOHHOHIICIHORCOORRRH var10,
      boolean var11
   ) {
      if (var1 == null) {
         throw new NullPointerException("id is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("name is marked non-null but is null");
      }

      this.id = var1;
      this.name = var2;
      this.server = var3;
      this.visible = var4;
      this.RORRRHIIHIOHHIIRCICIHHORCHOIOH = var5;
      this.isDefault = var6;
      this.COHIRRIHHIOOOIIORIOOHCRIHOIOIH = var7;
      this.IIOHHORORHICIHHOIIOOCHHIHICCIO = var9;
      this.OCHCCRIHCHCCHOCRIROIOOOOHOIOII = var10;
      this.HOIHHROHHCICCOHCCCIHCCOIHCIIIH = var11;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      this.id = RIIHHCCHCIORHICRICOROOOHOHCICO();
      this.name = CRRRIHORHHRRRIIOCCICORCICIRIHC();
      this.visible = HRROHIORCHICICCCHOCHHORRRHHICC();
      this.RORRRHIIHIOHHIIRCICIHHORCHOIOH = OIIIIIROICIRIRHCRHORHOCRCRCCOC();
      this.isDefault = HRIHOCRRROHIHCICCCCCCCRCCCHIRR();
      this.COHIRRIHHIOOOIIORIOOHCRIHOIOIH = IOHOCOIHHOHIHHIOIIHOHRHOCOHCOC();
      this.IIOHHORORHICIHHOIIOOCHHIHICCIO = ROOICIORCOIHCCOIOCOCOHROHHIHHO();
      this.OCHCCRIHCHCCHOCRIROIOOOOHOIOII = ICHCCOCHROCRHHHRHCCCIHRRRIRHCC();
      this.HOIHHROHHCICCOHCCCIHCCOIHCIIIH = OOCCIHIRHCCOHIRROHHCROIIROOCIO();
   }

   @Generated
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @Generated
      private boolean HHRHHIOOHOHIHRCHCHRORRRIIRIIHO;
      @Generated
      private UUID HOOHORRHROCRORCHCOCCRRICIIRIOH;
      @Generated
      private boolean RRHRIHIRROOIOCRCIHRCIOOHRIRHRR;
      @Generated
      private String RCRORHCOCRIIOHICORIHOHRIIRIORH;
      @Generated
      private String server;
      @Generated
      private boolean HIIOORCIRRRRCRRCHRORRRHOHOORCO;
      @Generated
      private boolean IHROCHRICRIOOORHCHHRCHHOOIHRHH;
      @Generated
      private boolean IHICOOIOCRHRCHIIOHRHICRIOHHIOR;
      @Generated
      private int RCCIOIICIOCROOHHORRHROIRRIOCOC;
      @Generated
      private boolean RRRCCRIOIHHIHIOIOOHIROHIOHRICR;
      @Generated
      private boolean OOIHOHRRRCCCCOHOIORRHOOHCOOORH;
      @Generated
      private boolean HHROCIIOCOHOOIHIROHHRRCORORHOI;
      @Generated
      private long HROCCHHCCOCHRHCIOROHRIORIRIRRI;
      @Generated
      private boolean CRCORIOIHCIIRRRORROCIORRRHHICR;
      @Generated
      private boolean HOOIIHOHCOCOCHRORICRICIIHOHIIO;
      @Generated
      private boolean RCHROORCIOOCHOIHRICIOROCHIRCIC;
      @Generated
      private CRRRICCRROCOHHOHIICIHORCOORRRH ROCRIIOHCCICHCOOCRRIICOCHRCHHR;
      @Generated
      private boolean RIHORRHRCROORRIIRICHRRRICCICOO;
      @Generated
      private boolean RCCRIHIHOIICHCIICCOHHHIRICOHHC;

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIHHOCRHHRORRHHRORRRIIHHORIHOC(@NonNull UUID var1) {
         if (var1 == null) {
            throw new NullPointerException("id is marked non-null but is null");
         }

         this.HOOHORRHROCRORCHCOCCRRICIIRIOH = var1;
         this.HHRHHIOOHOHIHRCHCHRORRRIIRIIHO = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHHOOIOHHRCIRIRRHHHOOCRCCHHOOR(@NonNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("name is marked non-null but is null");
         }

         this.RCRORHCOCRIIOHICORIHOHRIIRIORH = var1;
         this.RRHRIHIRROOIOCRCIHRCIOOHRIRHRR = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCHCIRORCRCCICIHRCIIIHIIRCRHRC(@Nullable String var1) {
         this.server = var1;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICORIROICCORCRROCRCIRRRHHHOOIR(boolean var1) {
         this.IHROCHRICRIOOORHCHHRCHHOOIHRHH = var1;
         this.HIIOORCIRRRRCRRCHRORRRHOHOORCO = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOCHIIROORIOCCCCCOORRIRIOHOORH(int var1) {
         this.RCCIOIICIOCROOHHORRHROIRRIOCOC = var1;
         this.IHICOOIOCRHRCHIIOHRHICRIOHHIOR = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OICOHRRRRCOICCHOIOROHOCOORCHII(boolean var1) {
         this.OOIHOHRRRCCCCOHOIORRHOOHCOOORH = var1;
         this.RRRCCRIOIHHIHIOIOOHIROHIOHRICR = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIHIHHCRHCHRCICHOROHCHIIHCICH(long var1) {
         this.HROCCHHCCOCHRHCIOROHRIORIRIRRI = var1;
         this.HHROCIIOCOHOOIHIROHHRRCORORHOI = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COCCOIROHORRRHIHICORRHRRORIIIH(boolean var1) {
         this.HOOIIHOHCOCOCHRORICRICIIHOHIIO = var1;
         this.CRCORIOIHCIIRRRORROCIORRRHHICR = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
         this.ROCRIIOHCCICHCOOCRRIICOCHRCHHR = var1;
         this.RCHROORCIOOCHOIHRICIOROCHIRCIC = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHIIOORHHCCOCIORHIRCICHCHRRIII(boolean var1) {
         this.RCCRIHIHOIICHCIICCOHHHIRICOHHC = var1;
         this.RIHORRHRCROORRIIRICHRRRICCICOO = true;
         return this;
      }

      @Generated
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH HOOOOIOORROCRICOOOCRORCCCICROI() {
         UUID var1 = this.HOOHORRHROCRORCHCOCCRRICIIRIOH;
         if (!this.HHRHHIOOHOHIHRCHCHRORRRIIRIIHO) {
            var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIIHHCCHCIORHICRICOROOOHOHCICO();
         }

         String var2 = this.RCRORHCOCRIIOHICORIHOHRIIRIORH;
         if (!this.RRHRIHIRROOIOCRCIHRCIOOHRIRHRR) {
            var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRIHORHHRRRIIOCCICORCICIRIHC();
         }

         boolean var3 = this.IHROCHRICRIOOORHCHHRCHHOOIHRHH;
         if (!this.HIIOORCIRRRRCRRCHRORRRHOHOORCO) {
            var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRROHIORCHICICCCHOCHHORRRHHICC();
         }

         int var4 = this.RCCIOIICIOCROOHHORRHROIRRIOCOC;
         if (!this.IHICOOIOCRHRCHIIOHRHICRIOHHIOR) {
            var4 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIIIIIROICIRIRHCRHORHOCRCRCCOC();
         }

         boolean var5 = this.OOIHOHRRRCCCCOHOIORRHOOHCOOORH;
         if (!this.RRRCCRIOIHHIHIOIOOHIROHIOHRICR) {
            var5 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRIHOCRRROHIHCICCCCCCCRCCCHIRR();
         }

         long var6 = this.HROCCHHCCOCHRHCIOROHRIORIRIRRI;
         if (!this.HHROCIIOCOHOOIHIROHHRRCORORHOI) {
            var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOHOCOIHHOHIHHIOIIHOHRHOCOHCOC();
         }

         boolean var8 = this.HOOIIHOHCOCOCHRORICRICIIHOHIIO;
         if (!this.CRCORIOIHCIIRRRORROCIORRRHHICR) {
            var8 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOICIORCOIHCCOIOCOCOHROHHIHHO();
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH var9 = this.ROCRIIOHCCICHCOOCRRIICOCHRCHHR;
         if (!this.RCHROORCIOOCHOIHRICIOROCHIRCIC) {
            var9 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICHCCOCHROCRHHHRHCCCIHRRRIRHCC();
         }

         boolean var10 = this.RCCRIHIHOIICHCIICCOHHHIRICOHHC;
         if (!this.RIHORRHRCROORRIIRICHRRRICCICOO) {
            var10 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOCCIHIRHCCOHIRROHHCROIIROOCIO();
         }

         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, this.server, var3, var4, var5, var6, var8, var9, var10);
      }

      @Generated
      @Override
      public String toString() {
         return "WaypointGroup.WaypointGroupBuilder(id$value="
            + this.HOOHORRHROCRORCHCOCCRRICIIRIOH
            + ", name$value="
            + this.RCRORHCOCRIIOHICORIHOHRIIRIORH
            + ", server="
            + this.server
            + ", visible$value="
            + this.IHROCHRICRIOOORHCHHRCHHOOIHRHH
            + ", sortIndex$value="
            + this.RCCIOIICIOCROOHHORRHROIRRIOCOC
            + ", isDefault$value="
            + this.OOIHOHRRRCCCCOHOIORRHOOHCOOORH
            + ", addedAtMs$value="
            + this.HROCCHHCCOCHRHCIOROHRIORIRIRRI
            + ", isOrdered$value="
            + this.HOOIIHOHCOCOCHRORICRICIIHOHIIO
            + ", renderConfig$value="
            + this.ROCRIIOHCCICHCOOCRRIICOCHRCHHR
            + ", renderOptionsOverrideMembers$value="
            + this.RCCRIHIHOIICHCIICCOHHHIRICOHHC
            + ")";
      }
   }
}
