package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Nullable
   private final String HOROHRIRROROCOCICCIHRHHORCCCRO;
   private boolean HIHORIRRIROCIRHCIICCCRHORORHII = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1) {
      super(var1);
      this.HOROHRIRROROCOCICCIHRHHORCCCRO = null;
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, Int2ObjectMap<Object> var2) {
      super(var1, var2);
      this.HOROHRIRROROCOCICCIHRHHORCCCRO = null;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, @Nullable String var2) {
      super(var1);
      this.HOROHRIRROROCOCICCIHRHHORCCCRO = var2;
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var1, @Nullable String var2, Int2ObjectMap<Object> var3) {
      super(var1, var3);
      this.HOROHRIRROROCOCICCIHRHHORCCCRO = var2;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH HRHRIHRROHHORROCHCOHICRROHRRIO(boolean var1) {
      this.HIHORIRRIROCIRHCIICCCRHORORHII = var1;
      return this;
   }

   public String HCHIRCHOCCRCCRCCOCOHOCHCORRICR() {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH(this);
   }

   public List<String> ICRCIIRIRRROIOIHRCHOHHCOIRCICC() {
      List var1 = OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
      if (!var1.isEmpty()) {
         this.HICHCHOHCOHIIHOIHRHHHHCICIHROC("Validation found " + var1.size() + " errors:");

         for (String var3 : var1) {
            this.HICHCHOHCOHIIHOIHRHHHHCICIHROC("  - " + var3);
         }
      }

      return var1;
   }

   public String OIHCOHRCICCCRHRCROOCIOIRRHHHIH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ORORICHHRHHRRORHHIOCORRIROIOHO(), var1);
   }

   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?> var1) {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.ORORICHHRHHRRORHHIOCORRIROIOHO(), var1);
   }

   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, @Nullable T var2) {
      Object var3 = super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      if (var3 != var2) {
         String var4 = this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId());
         this.IHHIOHORCCRRHOHRCICCOROHCRIIHC(
            "Set trait " + var4 + " (" + var1.getId() + ") to " + (var2 != null ? var2 : "null") + " - Previous value was: " + var3
         );
      }

      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T set(int var1, @Nullable T var2) {
      Object var3 = super.set(var1, var2);
      if (var3 != var2) {
         String var4 = this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1);
         this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Set trait " + var4 + " (" + var1 + ") to " + (var2 != null ? var2 : "null") + " - Previous value was: " + var3);
      }

      return (T)var3;
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, Function<OHHRIOHROOIHOROCIRHCHORIHRRRRI<T>, ? extends @NotNull T> var2) {
      Object var3 = var2.apply(var1);
      boolean var4 = this.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var1);
      Object var5 = super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1x -> (T)var3);
      if (var4 && var5 != var3) {
         String var6 = this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId());
         this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Computed present trait " + var6 + " (" + var1.getId() + ") to " + var3 + " - Previous value was: " + var5);
      }

      return (T)var5;
   }

   @Override
   public <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> var1, Function<OHHRIOHROOIHOROCIRHCHORIHRRRRI<T>, ? extends @NotNull T> var2) {
      Object var3 = var2.apply(var1);
      boolean var4 = this.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var1);
      Object var5 = super.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var1x -> (T)var3);
      if (!var4) {
         String var6 = this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId());
         this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Computed absent trait " + var6 + " (" + var1.getId() + ") to " + var3);
      }

      return (T)var5;
   }

   @Nullable
   @Override
   public <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<? extends T> var1) {
      Object var2 = super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      if (var2 != null) {
         String var3 = this.ORORICHHRHHRRORHHIOCORRIROIOHO().HHOOIRORCCOOORRIIIOCRCRHIICOCH(var1.getId());
         this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Removed trait " + var3 + " (" + var1.getId() + ") - Previous value was: " + var2);
      }

      return (T)var2;
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Applying tweaks to container");
      super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Setting all traits from another container");
      super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Override
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH OCRHRHHOCIIRRIICIRRCIOCCHIHRIR() {
      this.IHHIOHORCCRRHOHRCICCOROHCRIIHC("Creating a copy of this container");
      CRRRICCRROCOHHOHIICIHORCOORRRH var1 = (CRRRICCRROCOHHOHIICIHORCOORRRH)super.OCRHRHHOCIIRRIICIRRCIOCCHIHRIR();
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         this.ORORICHHRHHRRORHHIOCORRIROIOHO(), this.HOROHRIRROROCOCICCIHRHHORCCCRO == null ? null : this.HOROHRIRROROCOCICCIHRHHORCCCRO + "Copy"
      );
      var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      var2.HRHRIHRROHHORROCHCOHICRROHRRIO(this.HIHORIRRIROCIRHCIICCCRHORORHII);
      return var2;
   }

   private void IHHIOHORCCRRHOHRCICCOROHCRIIHC(String var1) {
      if (this.HIHORIRRIROCIRHCIICCCRHORORHII) {
         if (this.HOROHRIRROROCOCICCIHRHHORCCCRO != null) {
            System.out.println("[DEBUG_TRAIT] [" + this.HOROHRIRROROCOCICCIHRHHORCCCRO + "] INFO: " + var1);
         } else {
            System.out.println("[DEBUG_TRAIT] INFO: " + var1);
         }
      }
   }

   private void HICHCHOHCOHIIHOIHRHHHHCICIHROC(String var1) {
      if (this.HIHORIRRIROCIRHCIICCCRHORORHII) {
         if (this.HOROHRIRROROCOCICCIHRHHORCCCRO != null) {
            System.out.println("[DEBUG_TRAIT] [" + this.HOROHRIRROROCOCICCIHRHHORCCCRO + "] WARNING: " + var1);
         } else {
            System.out.println("[DEBUG_TRAIT] WARNING: " + var1);
         }
      }
   }
}
