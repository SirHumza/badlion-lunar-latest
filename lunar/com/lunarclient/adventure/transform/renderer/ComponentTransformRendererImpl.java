package com.lunarclient.adventure.transform.renderer;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.pattern.ComponentPatternResult;
import com.lunarclient.adventure.transform.ComponentTransform;
import com.lunarclient.adventure.transform.transformable.ComponentTransformable;
import com.lunarclient.adventure.transform.transformable.WrappedTransformable;
import com.lunarclient.adventure.transform.transformation.Transformation;
import com.lunarclient.adventure.utils.AdventureUtils;
import com.lunarclient.adventure.utils.ComponentType;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ComponentTransformRendererImpl implements ComponentTransformRenderer<ComponentTransformRendererImpl.StateImpl> {
   public static final ComponentTransformRendererImpl INSTANCE = new ComponentTransformRendererImpl();

   @NotNull
   public Component render(@NotNull Component var1, @Nullable List<Transformation<?, ?>> var2, @NotNull ComponentTransformRendererImpl.StateImpl var3) {
      if (!var3.running) {
         return var1;
      }

      boolean var4 = var3.firstMatch;
      var3.firstMatch = true;
      var3.depth++;
      List var5 = var1.children();
      int var6 = var5.size();
      Style var7 = var1.style();
      ArrayList var8 = null;
      boolean var9 = false;
      ComponentPattern var10 = var3.getPattern();
      if (var10.matches(var1)) {
         boolean var11 = false;
         ComponentPatternResult var12 = var10.shouldTraverse(++var3.matchCount, var3.transformCount, var3.depth);
         switch (var12) {
            case BREAK:
               var11 = true;
               break;
            case BREAK_NO_CHILDREN:
               var9 = true;
               var11 = true;
               break;
            case SOFT_STOP:
            case STOP:
               var3.running = false;
               var11 = true;
         }

         if (!var11) {
            if (AdventureUtils.IS_RUNNING_TEST) {
               var1 = WrappedTransformable.attemptWrap(var1);
            }

            if (var1 instanceof ComponentTransformable var13) {
               ComponentTransformRenderer.TransformableResult var14 = var13.renderSelf(this, var1, var2, var3);
               if (var14 == null) {
                  this.beforeReturn(var3, var4);
                  return Component.empty();
               }

               var1 = var14.getTransformedComponent();
               if (var14.isReplaced() && var1.style().hoverEvent() != null) {
                  var7 = var7.hoverEvent(null);
               }

               List var15 = var1.children();
               if (!var15.isEmpty()) {
                  var8 = new ArrayList(var6 + var15.size());
                  var8.addAll(var15);
               }

               if (var14.isModifiedChildren()) {
                  var5 = List.of();
                  var6 = 0;
               }

               var9 = var14.isSkipChildrenTransformations();
            } else {
               ComponentBuilder var22 = null;
               if (var1 instanceof ComponentBuilder var24) {
                  var22 = var24;
               } else if (var1 instanceof BuildableComponent var16) {
                  var22 = var16.toBuilder();
               }

               if (var22 != null) {
                  ComponentPatternResult var25 = var10.shouldMatch(null, var3.getMatchCount(), var3.getTransformCount(), var3.getDepth());
                  boolean var27 = false;
                  switch (var25) {
                     case BREAK:
                        var27 = true;
                        break;
                     case BREAK_NO_CHILDREN:
                        var9 = true;
                        var27 = true;
                        break;
                     case SOFT_STOP:
                     case STOP:
                        var3.setRunning(false);
                        var27 = true;
                        break;
                     case CONTINUE:
                        var27 = true;
                  }

                  if (!var27) {
                     ComponentTransformRenderer.TransformationResult var17 = this.applyTransformations(
                        var3.getTransformation(), ComponentType.COMPONENT, null, var1, var22, var2
                     );
                     if (var17 == null) {
                        this.beforeReturn(var3, var4);
                        return Component.empty();
                     }

                     var1 = var17.getMatchComponent().asComponent();
                     if (var1.style().hoverEvent() != null) {
                        var7 = var7.hoverEvent(null);
                     }
                  }
               }
            }
         }
      }

      if (var3.running) {
         HoverEvent var18 = var7.hoverEvent();
         if (var18 != null) {
            HoverEvent var19 = var18.withRenderedValue(this, var3);
            if (var18 != var19) {
               var1 = var1.style(var1x -> var1x.hoverEvent(var19));
            }
         }

         boolean var20 = true;

         for (int var21 = 0; var21 < var6; var21++) {
            Component var23 = (Component)var5.get(var21);
            if (!var9) {
               ArrayList var26 = new ArrayList();
               Component var28 = this.render(var23, var26, var3);
               if (var28 != var23) {
                  if (var8 == null) {
                     var8 = new ArrayList(var6);
                  }

                  if (var20) {
                     var8.addAll(var5.subList(0, var21));
                  }

                  var20 = false;
               }

               if (var8 != null && !var28.equals(Component.empty())) {
                  var8.add(var28);
                  this.applyParentTransformations(var26, var8);
                  var20 = false;
               }
            }
         }

         if (var20) {
            if (var8 == null) {
               var8 = new ArrayList(var6);
            }

            var8.addAll(var5);
         }
      } else if (var8 != null) {
         var8.addAll(var5);
      }

      this.beforeReturn(var3, var4);
      return var8 != null ? var1.children(var8) : var1;
   }

   @NotNull
   public ComponentTransformRendererImpl.StateImpl createState(ComponentPattern var1, ComponentTransform var2) {
      return new ComponentTransformRendererImpl.StateImpl(var1, var2);
   }

   private void beforeReturn(ComponentTransformRendererImpl.StateImpl var1, boolean var2) {
      var1.firstMatch = var2;
      var1.depth--;
   }

   public static final class StateImpl extends ComponentTransformRenderer.State {
      boolean running = true;
      int matchCount = 0;
      int transformCount = 0;
      int depth = 0;
      boolean firstMatch = true;

      public StateImpl(ComponentPattern var1, ComponentTransform var2) {
         super(var1, var2);
      }

      @Generated
      @Override
      public void setRunning(boolean var1) {
         this.running = var1;
      }

      @Generated
      @Override
      public void setMatchCount(int var1) {
         this.matchCount = var1;
      }

      @Generated
      @Override
      public void setTransformCount(int var1) {
         this.transformCount = var1;
      }

      @Generated
      @Override
      public void setDepth(int var1) {
         this.depth = var1;
      }

      @Generated
      @Override
      public void setFirstMatch(boolean var1) {
         this.firstMatch = var1;
      }

      @Generated
      @Override
      public boolean isRunning() {
         return this.running;
      }

      @Generated
      @Override
      public int getMatchCount() {
         return this.matchCount;
      }

      @Generated
      @Override
      public int getTransformCount() {
         return this.transformCount;
      }

      @Generated
      @Override
      public int getDepth() {
         return this.depth;
      }

      @Generated
      @Override
      public boolean isFirstMatch() {
         return this.firstMatch;
      }
   }
}
