package com.lunarclient.adventure.utils;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.pattern.ComponentPatternResult;
import com.lunarclient.adventure.transform.renderer.ComponentTransformRenderer;
import com.lunarclient.adventure.transform.transformation.Transformation;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AdventureMixins {
   @Nullable
   public static <S extends ComponentTransformRenderer.State> ComponentTransformRenderer.TransformableResult renderSelfText(
      @NotNull TextComponent var0,
      @NotNull ComponentTransformRenderer<S> var1,
      @NotNull Component var2,
      @Nullable List<Transformation<?, ?>> var3,
      @NotNull S var4
   ) {
      ComponentPattern var5 = var4.getPattern();
      String var6 = var0.content();
      Component var7 = var2;
      ArrayList var8 = null;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      Pattern var13 = var5.getPattern();
      if (var13 != null) {
         Matcher var14 = var13.matcher(var6);
         int var15 = 0;

         label114:
         while (var14.find()) {
            var4.setMatchCount(var4.getMatchCount() + 1);
            ComponentPatternResult var16 = var5.shouldMatch(var14, var4.getMatchCount(), var4.getTransformCount(), var4.getDepth());
            switch (var16) {
               case CONTINUE:
                  break;
               case BREAK:
                  break label114;
               case BREAK_NO_CHILDREN:
                  var10 = true;
                  break label114;
               case SOFT_STOP:
               case STOP:
                  var4.setRunning(false);
                  break label114;
               default:
                  if (var14.start() == 0) {
                     if (var14.end() == var6.length()) {
                        ComponentTransformRenderer.TransformationResult var17 = var1.applyTransformations(
                           var4.getTransformation(), ComponentType.TEXT, var14, var2, Component.text().content(var14.group()).style(var2.style()), var3
                        );
                        if (var17 == null) {
                           return null;
                        }

                        var7 = var17.getMatchComponent().asComponent();
                        var12 = true;
                        var11 |= var7.style().hoverEvent() != null;
                        var9 |= var17.isModifiedChildren();
                        if (var8 == null) {
                           var8 = new ArrayList(var7.children().size());
                           var8.addAll(var7.children());
                        }
                     } else {
                        var7 = Component.text("", var2.style());
                        var12 = true;
                        ComponentTransformRenderer.TransformationResult var23 = var1.applyTransformations(
                           var4.getTransformation(), ComponentType.TEXT, var14, var7, Component.text().content(var14.group()), var3
                        );
                        if (var23 == null) {
                           return null;
                        }

                        ComponentBuilder var18 = var23.getMatchComponent();
                        if (var18 != null) {
                           if (var8 == null) {
                              var8 = new ArrayList(1);
                           }

                           var8.add(var18.asComponent());
                        }
                     }
                  } else {
                     if (var8 == null) {
                        var8 = new ArrayList(var4.isFirstMatch() ? 1 : 2);
                     }

                     if (var4.isFirstMatch()) {
                        var7 = var0.content(var6.substring(0, var14.start()));
                        var12 = true;
                     } else if (var15 < var14.start()) {
                        var8.add(Component.text(var6.substring(var15, var14.start())));
                     }

                     ComponentTransformRenderer.TransformationResult var24 = var1.applyTransformations(
                        var4.getTransformation(), ComponentType.TEXT, var14, var7, Component.text().content(var14.group()), var3
                     );
                     if (var24 == null) {
                        return null;
                     }

                     ComponentBuilder var25 = var24.getMatchComponent();
                     if (var25 != null) {
                        var8.add(var25.asComponent());
                     }
                  }

                  var4.setTransformCount(var4.getTransformCount() + 1);
                  var4.setFirstMatch(false);
                  var15 = var14.end();
            }
         }

         if (var15 < var6.length() && var15 > 0) {
            if (var8 == null) {
               var8 = new ArrayList();
            }

            var8.add(Component.text(var6.substring(var15)));
         }
      } else {
         var4.setMatchCount(var4.getMatchCount() + 1);
         ComponentPatternResult var20 = var5.shouldMatch(null, var4.getMatchCount(), var4.getTransformCount(), var4.getDepth());
         boolean var21 = false;
         switch (var20) {
            case CONTINUE:
               var21 = true;
               break;
            case BREAK:
               var21 = true;
               break;
            case BREAK_NO_CHILDREN:
               var10 = true;
               var21 = true;
               break;
            case SOFT_STOP:
            case STOP:
               var4.setRunning(false);
               var21 = true;
         }

         if (!var21) {
            ComponentTransformRenderer.TransformationResult var22 = var1.applyTransformations(
               var4.getTransformation(), ComponentType.TEXT, null, var7, Component.text().content(var6).style(var2.style()), var3
            );
            if (var22 == null) {
               return null;
            }

            var7 = var22.getMatchComponent().asComponent();
            var12 = true;
            var11 |= var7.style().hoverEvent() != null;
            var9 = var22.isModifiedChildren();
            var4.setTransformCount(var4.getTransformCount() + 1);
            var4.setFirstMatch(false);
         }
      }

      if (var12 && !var11) {
         var7 = var7.hoverEvent(null);
      }

      var7 = var7.children(var8 == null ? List.of() : var8);
      return new ComponentTransformRenderer.TransformableResult(var7, var10, var9, var12);
   }

   @Nullable
   public static <S extends ComponentTransformRenderer.State> ComponentTransformRenderer.TransformableResult renderSelfTranslatable(
      @NotNull TranslatableComponent var0,
      @NotNull ComponentTransformRenderer<S> var1,
      @NotNull Component var2,
      @Nullable List<Transformation<?, ?>> var3,
      @NotNull S var4
   ) {
      Pattern var6 = var4.getPattern().getPattern();
      TranslatableComponent var5;
      if (var6 == null) {
         ComponentTransformRenderer.TransformationResult var7 = var1.applyTransformations(
            var4.getTransformation(), ComponentType.TRANSLATABLE, null, var0, Component.translatable().key(var0.key()).arguments(var0.arguments()), var3
         );
         if (var7 == null) {
            return null;
         }

         var2 = var7.getMatchComponent().asComponent();
         if (var2 instanceof TranslatableComponent var8) {
            var5 = var8;
         } else {
            var5 = null;
         }
      } else {
         var5 = var0;
      }

      if (var5 != null) {
         List var15 = var5.arguments();
         ArrayList var16 = null;
         ArrayList var9 = new ArrayList();
         int var10 = 0;

         for (int var11 = var15.size(); var10 < var11; var10++) {
            TranslationArgument var12 = (TranslationArgument)var15.get(var10);
            if (var12.value() instanceof Component var13) {
               TranslationArgument var17 = TranslationArgument.component(var1.render(var13, var9, var4));
               if (var17 != var12 && var16 == null) {
                  var16 = new ArrayList(var11);
                  if (var10 > 0) {
                     var16.addAll(var15.subList(0, var10));
                  }
               }

               if (var16 != null) {
                  var16.add(var17);
                  var1.applyParentTransformations(var9, var16);
               }
            }
         }

         if (var16 != null) {
            var2 = var5.arguments(var16);
         }
      }

      return new ComponentTransformRenderer.TransformableResult(var2.children(List.of()), false, false, true);
   }
}
