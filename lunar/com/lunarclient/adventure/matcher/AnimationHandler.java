package com.lunarclient.adventure.matcher;

import com.google.common.collect.Iterators;
import com.google.common.collect.PeekingIterator;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.pattern.ComponentPatternResult;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ComponentMatchPerformerImpl<S extends ComponentMatchPerformerImpl.State> implements ComponentMatchPerformer<S> {
   protected static final ComponentMatchPerformerImpl<ComponentMatchPerformerImpl.State> INSTANCE = new ComponentMatchPerformerImpl<>();

   public boolean matches(@NotNull Component var1, @NotNull S var2) {
      var2.depth++;
      Deque var3 = var2.getStyleDeque();
      if (var3 != null) {
         ComponentMatchPerformerImpl.StyleFrame var4 = new ComponentMatchPerformerImpl.StyleFrame();
         if (!var3.isEmpty()) {
            var4.set((ComponentMatchPerformerImpl.StyleFrame)var3.getLast());
         }

         var4.apply(var1.style());
         var3.push(var4);
      }

      boolean var15 = false;

      label189:
      while (var2.patternIterator.hasNext()) {
         ComponentPattern var5 = (ComponentPattern)var2.patternIterator.peek();
         boolean var6 = false;
         if (var3 != null) {
            var1 = var1.style(((ComponentMatchPerformerImpl.StyleFrame)var3.getLast()).applyTo(var1.style()));
         }

         if (var5.matches(var1)) {
            boolean var7 = false;
            ComponentPatternResult var8 = var5.shouldTraverse(++var2.matchCount, var2.singlePatternCount + 1, var2.depth);
            switch (var8) {
               case NEXT_COMPONENT:
                  var6 = true;
                  break;
               case BREAK:
                  var7 = true;
                  break;
               case BREAK_NO_CHILDREN:
                  var15 = true;
                  var7 = true;
                  break;
               case SOFT_STOP:
                  var2.patternIterator.next();
                  var2.successfulMatches++;
                  continue;
               case STOP:
                  var2.patternIterator.next();
                  var2.running = false;
                  break label189;
            }

            if (!var7 && !var6) {
               if (var1 instanceof TextComponent var9) {
                  String var10 = var9.content();
                  Pattern var11 = var5.getIgnorePattern();
                  if (var11 != null && var11.matcher(var10).find()) {
                     var2.running = false;
                     return false;
                  }

                  Pattern var12 = var5.getPattern();
                  if (var12 != null) {
                     Matcher var13 = var12.matcher(var10);

                     label170:
                     while (var13.find()) {
                        ComponentPatternResult var14 = var5.shouldMatch(var13, var2.matchCount, var2.singlePatternCount + 1, var2.depth);
                        switch (var14) {
                           case NEXT_COMPONENT:
                              var2.singlePatternCount++;
                              var6 = true;
                           case BREAK:
                              break label170;
                           case BREAK_NO_CHILDREN:
                              var15 = true;
                              break label170;
                           case SOFT_STOP:
                              var2.patternIterator.next();
                              var2.successfulMatches++;
                              continue label189;
                           case STOP:
                              var2.patternIterator.next();
                              var2.running = false;
                              break label189;
                           case CONTINUE:
                              break;
                           default:
                              if (var2.successfulMatches > 0 && !var2.gapsBetween && (var13.start() != 0 || var13.end() != var10.length())) {
                                 var2.running = false;
                                 break label189;
                              }

                              var2.singlePatternCount++;
                              var2.successfulMatches++;
                        }
                     }

                     if (!var6) {
                        if (var2.singlePatternCount > 0) {
                           var2.singlePatternCount = 0;
                           var2.patternIterator.next();
                           var2.firstMatch = false;
                        } else if (var2.successfulMatches > 0 && !var2.gapsBetween) {
                           var2.running = false;
                           return false;
                        }
                     }
                  } else {
                     var2.patternIterator.next();
                     var2.successfulMatches++;
                  }
               } else {
                  var2.patternIterator.next();
                  var2.successfulMatches++;
               }

               if (var2.firstMatch && var2.startsWith) {
                  var2.running = false;
                  return false;
               }

               if (var2.successfulMatches == var2.requiredMatches) {
                  return true;
               }
            }
         } else if (var2.firstMatch && var2.startsWith || var2.successfulMatches > 0 && !var2.gapsBetween || var2.singlePatternCount > 0) {
            var2.running = false;
            return false;
         }

         var2.firstMatch = false;
         if (!var15 && var2.running) {
            List var16 = var1.children();
            int var17 = var16.size();

            for (int var18 = 0; var18 < var17; var18++) {
               Component var19 = (Component)var16.get(var18);
               if (this.matches(var19, (S)var2)) {
                  if (!var2.endsWith || !var2.patternIterator.hasNext() && var18 == var17 - 1) {
                     return true;
                  }

                  var2.running = false;
                  return false;
               }

               if (!var2.running) {
                  break label189;
               }
            }
         }
         break;
      }

      if (!var2.running || var2.successfulMatches != var2.requiredMatches || var2.endsWith && var2.patternIterator.hasNext()) {
         if (var2.getStyleDeque() != null) {
            var2.getStyleDeque().pop();
         }

         var2.depth--;
         return false;
      } else {
         return true;
      }
   }

   public static class State {
      final PeekingIterator<ComponentPattern> patternIterator;
      final boolean startsWith;
      final boolean endsWith;
      final boolean gapsBetween;
      final int requiredMatches;
      boolean running = true;
      boolean firstMatch = true;
      int singlePatternCount = 0;
      int matchCount = 0;
      int successfulMatches = 0;
      int depth = -1;

      public State(List<ComponentPattern> var1, boolean var2, boolean var3, boolean var4, int var5) {
         this.patternIterator = Iterators.peekingIterator(var1.iterator());
         this.startsWith = var2;
         this.endsWith = var3;
         this.gapsBetween = var4;
         this.requiredMatches = var5;
      }

      public State(PeekingIterator<ComponentPattern> var1, boolean var2, boolean var3, boolean var4, int var5) {
         this.patternIterator = var1;
         this.startsWith = var2;
         this.endsWith = var3;
         this.gapsBetween = var4;
         this.requiredMatches = var5;
      }

      @Nullable
      public Deque<ComponentMatchPerformerImpl.StyleFrame> getStyleDeque() {
         return null;
      }
   }

   public static class StateInherit extends ComponentMatchPerformerImpl.State {
      private final Deque<ComponentMatchPerformerImpl.StyleFrame> styleDeque = new ArrayDeque<>();

      public StateInherit(List<ComponentPattern> var1, boolean var2, boolean var3, boolean var4, int var5) {
         super(var1, var2, var3, var4, var5);
      }

      @Generated
      @Override
      public Deque<ComponentMatchPerformerImpl.StyleFrame> getStyleDeque() {
         return this.styleDeque;
      }
   }

   protected static final class StyleFrame {
      private int color = -1;
      private int style = 0;

      void set(@NotNull ComponentMatchPerformerImpl.StyleFrame var1) {
         this.color = var1.color;
         this.style = var1.style;
      }

      public Style applyTo(@NotNull Style var1) {
         Style var2 = var1;
         if (this.color != -1) {
            var2 = var2.color(TextColor.color(this.color));
         }

         for (TextDecoration var6 : TextDecoration.values()) {
            if ((this.style & var6.ordinal() * 2) != 0) {
               var2 = var2.decoration(var6, true);
            }
         }

         return var2;
      }

      public void apply(@NotNull Style var1) {
         this.applyColor(var1);

         for (TextDecoration var5 : TextDecoration.values()) {
            this.applyDecoration(var1, var5);
         }
      }

      private void applyColor(Style var1) {
         TextColor var2 = var1.color();
         if (var2 != null) {
            this.color = var2.value();
         }
      }

      private void applyDecoration(Style var1, TextDecoration var2) {
         switch (var1.decoration(var2)) {
            case TRUE:
               this.style = this.style | var2.ordinal() * 2;
               break;
            case FALSE:
               this.style = this.style & ~(var2.ordinal() * 2);
         }
      }

      @Generated
      public StyleFrame() {
      }
   }
}
