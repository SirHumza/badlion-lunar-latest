package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.renderer.ComponentRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TextReplacementRenderer implements ComponentRenderer<TextReplacementRenderer.State> {
   static final TextReplacementRenderer INSTANCE = new TextReplacementRenderer();

   private TextReplacementRenderer() {
   }

   @NotNull
   public Component render(@NotNull Component var1, @NotNull TextReplacementRenderer.State var2) {
      if (!var2.running) {
         return var1;
      }

      boolean var3 = var2.firstMatch;
      var2.firstMatch = true;
      List var4 = var1.children();
      int var5 = var4.size();
      Style var6 = var1.style();
      ArrayList var7 = null;
      Component var8 = var1;
      if (var1 instanceof TextComponent) {
         String var9 = ((TextComponent)var1).content();
         Matcher var10 = var2.pattern.matcher(var9);
         int var11 = 0;

         while (var10.find()) {
            PatternReplacementResult var12 = var2.continuer.shouldReplace(var10, ++var2.matchCount, var2.replaceCount);
            if (var12 != PatternReplacementResult.CONTINUE) {
               if (var12 == PatternReplacementResult.STOP) {
                  var2.running = false;
                  break;
               }

               if (var10.start() == 0) {
                  if (var10.end() == var9.length()) {
                     ComponentLike var13 = var2.replacement.apply(var10, Component.text().content(var10.group()).style(var1.style()));
                     var8 = var13 == null ? Component.empty() : var13.asComponent();
                     if (var8.style().hoverEvent() != null) {
                        var6 = var6.hoverEvent(null);
                     }

                     var8 = var8.style(var8.style().merge(var1.style(), Style.Merge.Strategy.IF_ABSENT_ON_TARGET));
                     if (var7 == null) {
                        var7 = new ArrayList(var5 + var8.children().size());
                        var7.addAll(var8.children());
                     }
                  } else {
                     var8 = Component.text("", var1.style());
                     ComponentLike var26 = var2.replacement.apply(var10, Component.text().content(var10.group()));
                     if (var26 != null) {
                        if (var7 == null) {
                           var7 = new ArrayList(var5 + 1);
                        }

                        var7.add(var26.asComponent());
                     }
                  }
               } else {
                  if (var7 == null) {
                     var7 = new ArrayList(var5 + 2);
                  }

                  if (var2.firstMatch) {
                     var8 = ((TextComponent)var1).content(var9.substring(0, var10.start()));
                  } else if (var11 < var10.start()) {
                     var7.add(Component.text(var9.substring(var11, var10.start())));
                  }

                  ComponentLike var27 = var2.replacement.apply(var10, Component.text().content(var10.group()));
                  if (var27 != null) {
                     var7.add(var27.asComponent());
                  }
               }

               var2.replaceCount++;
               var2.firstMatch = false;
               var11 = var10.end();
            }
         }

         if (var11 < var9.length() && var11 > 0) {
            if (var7 == null) {
               var7 = new ArrayList(var5);
            }

            var7.add(Component.text(var9.substring(var11)));
         }
      } else if (var8 instanceof TranslatableComponent) {
         List var16 = ((TranslatableComponent)var8).arguments();
         ArrayList var19 = null;
         int var22 = 0;

         for (int var24 = var16.size(); var22 < var24; var22++) {
            TranslationArgument var28 = (TranslationArgument)var16.get(var22);
            TranslationArgument var14 = var28.value() instanceof Component ? TranslationArgument.component(this.render((Component)var28.value(), var2)) : var28;
            if (var14 != var28 && var19 == null) {
               var19 = new ArrayList(var24);
               if (var22 > 0) {
                  var19.addAll(var16.subList(0, var22));
               }
            }

            if (var19 != null) {
               var19.add(var14);
            }
         }

         if (var19 != null) {
            var8 = ((TranslatableComponent)var8).arguments(var19);
         }
      }

      if (var2.running) {
         if (var2.replaceInsideHoverEvents) {
            HoverEvent var17 = var6.hoverEvent();
            if (var17 != null) {
               HoverEvent var20 = var17.withRenderedValue(this, var2);
               if (var17 != var20) {
                  var8 = var8.style(var1x -> var1x.hoverEvent(var20));
               }
            }
         }

         boolean var18 = true;

         for (int var21 = 0; var21 < var5; var21++) {
            Component var23 = (Component)var4.get(var21);
            Component var25 = this.render(var23, var2);
            if (var25 != var23) {
               if (var7 == null) {
                  var7 = new ArrayList(var5);
               }

               if (var18) {
                  var7.addAll(var4.subList(0, var21));
               }

               var18 = false;
            }

            if (var7 != null) {
               var7.add(var25);
               var18 = false;
            }
         }
      } else if (var7 != null) {
         var7.addAll(var4);
      }

      var2.firstMatch = var3;
      return var7 != null ? var8.children(var7) : var8;
   }

   static final class State {
      final Pattern pattern;
      final BiFunction<MatchResult, TextComponent.Builder, @Nullable ComponentLike> replacement;
      final TextReplacementConfig.Condition continuer;
      final boolean replaceInsideHoverEvents;
      boolean running = true;
      int matchCount = 0;
      int replaceCount = 0;
      boolean firstMatch = true;

      State(
         @NotNull Pattern var1,
         @NotNull BiFunction<MatchResult, TextComponent.Builder, @Nullable ComponentLike> var2,
         TextReplacementConfig.@NotNull Condition var3,
         boolean var4
      ) {
         this.pattern = var1;
         this.replacement = var2;
         this.continuer = var3;
         this.replaceInsideHoverEvents = var4;
      }
   }
}
