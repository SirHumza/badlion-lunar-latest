package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.serializer.plain.PlainTextComponentSerializer;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @NonNull
   private Component CIHORCCRORHIICRIRORIOIOIHRIHIC;
   @NonNull
   private final Component RCOORCIHRIHOORROICOCHHOOIIORIH;
   @NotNull
   private String ORHHROIRHRHOHCOCORCHROHRICCHOO;
   @NonNull
   private final String IHORCCORHOCIHHIHRRHOOHHOIRORRH;
   @NonNull
   private final String IICHOOIOHOOOHOIROCHHIOCCRRCRRR;
   public boolean ORIRHOHRHHROCHHRRIOOCRIHRIIIOC = false;
   private boolean CIIIRIRRROOIOIHCRRORORRCCCOCII = false;
   private boolean changed = false;

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NotNull Component var1) {
      this.CIHORCCRORHIICRIRORIOIOIHRIHIC = var1;
      this.RCOORCIHRIHOORROICOCHHOOIIORIH = var1;
      this.ORHHROIRHRHOHCOCORCHROHRICCHOO = PlainTextComponentSerializer.plainText().serialize(var1);
      this.IHORCCORHOCIHHIHRRHOOHHOIRORRH = this.ORHHROIRHRHOHCOCORCHROHRICCHOO;
      this.IICHOOIOHOOOHOIROCHHIOCCRRCRRR = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(
         var1
      );
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(@NotNull Component var1) {
      this.changed = true;
      this.CIHORCCRORHIICRIRORIOIOIHRIHIC = var1;
      this.ORHHROIRHRHOHCOCORCHROHRICCHOO = PlainTextComponentSerializer.plainText().serialize(var1);
   }

   @NonNull
   @Generated
   public Component OIOORCCOCHRRIRRORRICOCOCROICII() {
      return this.CIHORCCRORHIICRIRORIOIOIHRIHIC;
   }

   @NonNull
   @Generated
   public Component RRCIOIRIRCCHCRCOOICRRORCRIHHRC() {
      return this.RCOORCIHRIHOORROICOCHHOOIIORIH;
   }

   @NotNull
   @Generated
   public String HOHOCHHHOIHRRHOCRRRIRRRCOIHOCO() {
      return this.ORHHROIRHRHOHCOCORCHROHRICCHOO;
   }

   @NonNull
   @Generated
   public String OCOCIORRCHHHHHHHOOIHRRHOIHICRH() {
      return this.IHORCCORHOCIHHIHRRHOOHHOIRORRH;
   }

   @NonNull
   @Generated
   public String OIHOIRRICORHHRHOIOIHORCHOIRCOO() {
      return this.IICHOOIOHOOOHOIROCHHIOCCRRCRRR;
   }

   @Generated
   public boolean OIOOHRIICIIHRORHORHHOOHCOIICIH() {
      return this.ORIRHOHRHHROCHHRRIOOCRIHRIIIOC;
   }

   @Generated
   public boolean IHCOIIHICICRRHHRHIHOOOHIHICIOH() {
      return this.CIIIRIRRROOIOIHCRRORORRCCCOCII;
   }

   @Generated
   public boolean isChanged() {
      return this.changed;
   }

   @Generated
   public void RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(boolean var1) {
      this.CIIIRIRRROOIOIHCRRORORRCCCOCII = var1;
   }

   public static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      @Nullable
      private final Component HIHOICOIOCRHRCIRRRHHIRRCOIRORH;
      @Nullable
      private final String HHRCIHOCOCHOHIOIIORRRIIRRIIIIO;
      private final int HRHOCRICHORRROCRRCIHROHRRCOCRH;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH(@Nullable Component var1, int var2) {
         this.HIHOICOIOCRHRCIRRRHHIRRCOIRORH = var1;
         this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO = var1 == null ? null : PlainTextComponentSerializer.plainText().serialize(var1);
         this.HRHOCRICHORRROCRRCIHROHRRCOCRH = var2;
      }

      @Nullable
      @Generated
      public Component getComponent() {
         return this.HIHOICOIOCRHRCIRRRHHIRRCOIRORH;
      }

      @Nullable
      @Generated
      public String ROORHOHOCCCCHORIRHIRRIICCICCCI() {
         return this.HHRCIHOCOCHOHIOIIORRRIIRRIIIIO;
      }

      @Generated
      public int getType() {
         return this.HRHOCRICHORRROCRRCIHROHRRCOCRH;
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final int IHIROHIRRIHOHOCHHIOCHHOIORIHRI;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NotNull Component var1, int var2) {
         super(var1);
         this.IHIROHIRRIHOHOCHHIOCHHOIORIHRI = var2;
      }

      @Generated
      public int COIHCRRRROOOIOOIHRHHIOIHOHOROO() {
         return this.IHIROHIRRIHOHOCHHIOCHHOIORIHRI;
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull Component var1) {
         super(var1);
      }
   }
}
