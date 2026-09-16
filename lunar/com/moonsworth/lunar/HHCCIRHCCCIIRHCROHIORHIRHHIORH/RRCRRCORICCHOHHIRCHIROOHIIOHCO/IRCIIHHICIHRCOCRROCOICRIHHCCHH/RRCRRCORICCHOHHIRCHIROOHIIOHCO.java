package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

public interface RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   void lunar$setColorHolder(@Nullable Function<Float, Integer> var1);

   @Nullable
   Function<Float, Integer> lunar$getColorHolder();

   void lunar$setShadowState(boolean var1);

   boolean lunar$getShadowState();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   default String bridge$getFormattedText(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   default String bridge$getUnFormattedText(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   float bridge$getStringWidth(String var1);

   float bridge$getStringWidth(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   );

   default float bridge$getStringWidth(Component var1) {
      return this.bridge$getStringWidth(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var1)
      );
   }

   float bridge$drawShadow(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      int var5
   );

   default float bridge$drawShadow(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      int var5
   ) {
      return this.bridge$drawShadow(var1, this.bridge$getFormattedText(var2), var3, var4, var5);
   }

   default float bridge$drawShadow(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      int var5
   ) {
      return this.bridge$drawShadow(
         var1,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(var2),
         var3,
         var4,
         var5 == -1 && var2.color() != null ? var2.color().value() : var5
      );
   }

   default float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      this.lunar$setColorHolder(var5);
      int var7 = (Integer)var5.apply(var3 + var4);
      if (var6) {
         this.lunar$setShadowState(true);
         this.bridge$drawShadow(var1, var2, var3, var4, var7);
         this.lunar$setShadowState(false);
      }

      float var8 = this.bridge$drawString(var1, var2, var3, var4, var7, false);
      this.lunar$setColorHolder(null);
      return var8;
   }

   float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   );

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7;
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().HOCIHRRRCOORHOROCHCRRCCORHCOIH()
         && var1.OOICHHIHHIHROCCRRRIIIIRIRICCIH()
         && (var7 = var1.OCRIHHORCRCHOCRRORHIIRHOCCCIIH().OHIROCOCCHORRCCHIOICOCOHRHORCC().orElse(null)) != null) {
         var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var2, Math.round(var3), Math.round(var4), var5, var6);
         return this.bridge$getStringWidth(var2);
      } else {
         return this.bridge$drawString(var1, var2, var3, var4, var5, var6);
      }
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7;
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().HOCIHRRRCOORHOROCHCRRCCORHCOIH()
         && var1.OOICHHIHHIHROCCRRRIIIIRIRICCIH()
         && (var7 = var1.OCRIHHORCRCHOCRRORHIIRHOCCCIIH().OHIROCOCCHORRCCHIOICOCOHRHORCC().orElse(null)) != null) {
         var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var2),
            Math.round(var3),
            Math.round(var4),
            var5,
            var6
         );
         return this.bridge$getStringWidth(var2);
      } else {
         return this.bridge$drawString(var1, var2, var3, var4, var5, var6);
      }
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7;
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().HOCIHRRRCOORHOROCHCRRCCORHCOIH()
         && var1.OOICHHIHHIHROCCRRRIIIIRIRICCIH()
         && (var7 = var1.OCRIHHORCRCHOCRRORHIIRHOCCCIIH().OHIROCOCCHORRCCHIOICOCOHRHORCC().orElse(null)) != null) {
         var7.bridge$drawString$v1_20_0(this, var2, Math.round(var3), Math.round(var4), var5, var6);
      } else {
         this.bridge$drawString(var1, var2, var3, var4, var5, var6);
      }
   }

   default float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      return this.bridge$drawString(var1, this.bridge$getFormattedText(var2), var3, var4, var5, var6);
   }

   default float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.bridge$drawString(var1, this.bridge$getFormattedText(var2), var3, var4, var5, var6);
   }

   default float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      return this.bridge$drawString(
         var1,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(var2),
         var3,
         var4,
         var2.color() == null ? var5 : var1x -> var2.color().value(),
         var6
      );
   }

   default float bridge$drawString(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.bridge$drawString(
         var1,
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContentForRendering(var2),
         var3,
         var4,
         var5 == -1 && var2.color() != null ? var2.color().value() : var5,
         var6
      );
   }

   private float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Supplier<Float> var2,
      Runnable var3,
      boolean var4
   ) {
      if (var4) {
         var3.run();
         var1.translate(0.0, 0.0, -0.5);
         float var5 = (Float)var2.get();
         var1.translate(0.0, 0.0, 0.5);
         return var5 + 1.0F;
      } else {
         return (Float)var2.get();
      }
   }

   private float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      float var2,
      float var3,
      Function<Float, Integer> var4,
      IntFunction<Float> var5,
      IntConsumer var6,
      boolean var7
   ) {
      this.lunar$setColorHolder(var4);
      int var8 = (Integer)var4.apply(var2 + var3);
      if (var7) {
         this.lunar$setShadowState(true);
         var6.accept(var8);
         this.lunar$setShadowState(false);
         var1.translate(0.0, 0.0, -0.5);
         float var10 = (Float)var5.apply(var8);
         var1.translate(0.0, 0.0, 0.5);
         this.lunar$setColorHolder(null);
         return var10 + 1.0F;
      } else {
         float var9 = (Float)var5.apply(var8);
         this.lunar$setColorHolder(null);
         return var9;
      }
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      TextComponent var2,
      float var3,
      float var4,
      int var5,
      boolean var6,
      boolean var7
   ) {
      int var8 = var5;
      if (var2.style().color() != null) {
         var8 = var5 & 0xFF000000 | var2.style().color().value() & 16777215;
      }

      if (var7) {
         BuildableComponent var9 = Component.text().content(var2.content()).style(var2.style()).color(null).build();
         var3 = this.bridge$drawString(var1, var9, var3, var4, var8, var6);
      } else {
         var3 = this.bridge$drawString(var1, var2.content(), var3, var4, var8, var6);
      }

      List var14 = var2.children();

      for (int var10 = 0; var10 < var14.size(); var10++) {
         Component var11 = (Component)var14.get(var10);
         if (var11 instanceof TextComponent var12) {
            var3 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var12, var3, var4, var5, var6, var7);
         } else {
            var3 = this.bridge$drawString(var1, var11, var3, var4, var5, var6);
         }
      }

      return var3;
   }

   default float IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, () -> this.bridge$drawString(var1, var2, var3, var4, var5, false), () -> this.bridge$drawShadow(var1, var2, var3, var4, var5), var6
      );
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         var3,
         var4,
         var5,
         var5x -> this.bridge$drawString(var1, var2, var3, var4, var5x, false),
         var5x -> this.bridge$drawShadow(var1, var2, var3, var4, var5x),
         var6
      );
   }

   default float IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, () -> this.bridge$drawString(var1, var2, var3, var4, var5, false), () -> this.bridge$drawShadow(var1, var2, var3, var4, var5), var6
      );
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         var3,
         var4,
         var5,
         var5x -> this.bridge$drawString(var1, var2, var3, var4, var5x, false),
         var5x -> this.bridge$drawShadow(var1, var2, var3, var4, var5x),
         var6
      );
   }

   default float IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, () -> this.bridge$drawString(var1, var2, var3, var4, var5, false), () -> this.bridge$drawShadow(var1, var2, var3, var4, var5), var6
      );
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      Function<Float, Integer> var5,
      boolean var6
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         var3,
         var4,
         var5,
         var5x -> this.bridge$drawString(var1, var2, var3, var4, var5x, false),
         var5x -> this.bridge$drawShadow(var1, var2, var3, var4, var5x),
         var6
      );
   }

   default float HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      String var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.bridge$drawString(var1, var2, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3), var4, var5, var6);
   }

   default float HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      Component var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.bridge$drawString(var1, var2, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3), var4, var5, var6);
   }

   default float HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      float var3,
      float var4,
      int var5,
      boolean var6
   ) {
      return this.bridge$drawString(var1, var2, this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3), var4, var5, var6);
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, float var2) {
      float var3 = this.bridge$getStringWidth(var1);
      return var2 - var3 / 2.0F;
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      float var2
   ) {
      float var3 = this.bridge$getStringWidth(var1);
      return var2 - var3 / 2.0F;
   }

   default float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Component var1, float var2) {
      float var3 = this.bridge$getStringWidth(var1);
      return var2 - var3 / 2.0F;
   }

   List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$wrapLines(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2
   );

   default int OHRCIORHOCHOORCRHHOHRRRCCOICCO() {
      return 9;
   }

   default void tick() {
   }

   default void clearCaches() {
   }

   default float bridge$boldWidth() {
      return 1.0F;
   }

   @Nullable
   default RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getCodepointCharData(int var1) {
      return null;
   }

   @Nullable
   default RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] IICRCOCCHCORCRHHHOIHROCHIROIHH(String var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var2 = new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[var1.length()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.bridge$getCodepointCharData(var1.codePointAt(var3));
         var2[var3] = var4;
      }

      return var2;
   }

   record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final float HRHRRRIROIRIOOCHROIHCRHIROCOIH;
      private final float OIIHHROICRCRHOHCCOCIHRHIRIICRC;
      private final boolean IOHOHIHHHOOHOOHRRIOCRIRRORICIO;
      private final int IRRICCOOOOHCHIROHCRHICROHCHHCH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var1, float var2, boolean var3, int var4) {
         this.HRHRRRIROIRIOOCHROIHCRHIROCOIH = var1;
         this.OIIHHROICRCRHOHCCOCIHRHIRIICRC = var2;
         this.IOHOHIHHHOOHOOHRRIOCRIRRORICIO = var3;
         this.IRRICCOOOOHCHIROHCRHICROHCHHCH = var4;
      }

      public float OOCHIIROORIOCCCCCOORRIRIOHOORH() {
         return this.HRHRRRIROIRIOOCHROIHCRHIROCOIH;
      }

      public float RIROOOIRCIRHOHIHROCICIOICCRICR() {
         return this.OIIHHROICRCRHOHCCOCIHRHIRIICRC;
      }

      public boolean CCOIROOCRICIOIHOHCHRRHCCIHCRCO() {
         return this.IOHOHIHHHOOHOOHRRIOCRIRRORICIO;
      }

      public int index() {
         return this.IRRICCOOOOHCHIROHCRHICROHCHHCH;
      }
   }
}
