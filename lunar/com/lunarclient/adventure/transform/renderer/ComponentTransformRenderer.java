package com.lunarclient.adventure.transform.renderer;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.AddPosition;
import com.lunarclient.adventure.transform.ComponentTransform;
import com.lunarclient.adventure.transform.transformation.Transformation;
import com.lunarclient.adventure.utils.BooleanHolder;
import com.lunarclient.adventure.utils.ComponentType;
import com.lunarclient.adventure.utils.Duo;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.flattener.FlattenerListener;
import com.moonsworth.lunar.lib.adventure.text.renderer.ComponentRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ComponentTransformRenderer<S extends ComponentTransformRenderer.State> extends ComponentRenderer<S> {
   @NotNull
   default Component render(@NotNull Component var1, @NotNull S var2) {
      return this.passedIgnoreChecks(var1, (S)var2) ? this.render(var1, null, (S)var2) : var1;
   }

   @NotNull
   Component render(@NotNull Component var1, @Nullable List<Transformation<?, ?>> var2, @NotNull S var3);

   default boolean passedIgnoreChecks(@NotNull Component var1, @NotNull S var2) {
      final Pattern var3 = var2.getPattern().getIgnorePattern();
      if (var3 != null) {
         final BooleanHolder var4 = new BooleanHolder(true);
         ComponentFlattener.textOnly().flatten(var1, new FlattenerListener() {
            @Override
            public void component(@NotNull String var1) {
               if (var3.matcher(var1).find()) {
                  var4.setFalse();
               }
            }

            @Override
            public boolean shouldContinue() {
               return var4.isTrue();
            }
         });
         return var4.isTrue();
      } else {
         return true;
      }
   }

   @NotNull
   S createState(ComponentPattern var1, ComponentTransform var2);

   default void applyParentTransformations(List<Transformation<?, ?>> var1, List<ComponentLike> var2) {
      if (!var1.isEmpty()) {
         int var3 = var2.size() - 1;

         for (Transformation var5 : var1) {
            switch (var5.getTransformationAction()) {
               case ADD:
                  Duo var7 = (Duo)var5.getData();
                  switch ((AddPosition)var7.key()) {
                     case START:
                        var2.add(0, (ComponentLike)var7.value());
                        var3++;
                        continue;
                     case PREPEND:
                        var2.add(var3++, (ComponentLike)var7.value());
                        continue;
                     case APPEND:
                        var2.add(var3 + 1, (ComponentLike)var7.value());
                     default:
                        continue;
                  }
               case MOVE:
                  int var6 = (Integer)var5.getData();
                  Collections.swap(var2, var3, Math.max(0, var3 - var6));
            }
         }
      }
   }

   @Nullable
   default <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransformRenderer.TransformationResult applyTransformations(
      ComponentTransform var1,
      ComponentType<C, B> var2,
      @Nullable MatchResult var3,
      Component var4,
      ComponentBuilder var5,
      @Nullable List<Transformation<?, ?>> var6
   ) {
      List var7 = this.getTransformations(var1, var2);
      if (var7 == null) {
         return new ComponentTransformRenderer.TransformationResult(var5, false);
      }

      boolean var8 = false;

      for (Transformation var10 : var7) {
         switch (var10.getTransformationAction()) {
            case ADD:
            case MOVE:
               if (var6 != null) {
                  var6.add(var10);
               }
               break;
            case REMOVE:
               return null;
            case CHILDREN:
               if (!var8) {
                  var5.append(var4.children());
                  var8 = true;
               }
            default:
               var5 = var10.applyTransformation(var3, var4, (B)var5);
         }
      }

      return new ComponentTransformRenderer.TransformationResult(var5, var8);
   }

   @Nullable
   default <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> List<Transformation<C, B>> getTransformations(
      ComponentTransform var1, ComponentType<C, B> var2
   ) {
      List var3 = var1.getTransformations(var2);
      if (var2 != ComponentType.COMPONENT) {
         List var4 = var1.getTransformations((ComponentType<C, B>)ComponentType.COMPONENT);
         if (var4 != null) {
            var3 = var3 == null ? new ArrayList() : new ArrayList(var3);
            var3.addAll(var4);
         }
      }

      return var3;
   }

   abstract class State {
      private final ComponentPattern pattern;
      private final ComponentTransform transformation;

      public abstract boolean isRunning();

      public abstract int getMatchCount();

      public abstract int getTransformCount();

      public abstract int getDepth();

      public abstract boolean isFirstMatch();

      public abstract void setRunning(boolean var1);

      public abstract void setMatchCount(int var1);

      public abstract void setTransformCount(int var1);

      public abstract void setDepth(int var1);

      public abstract void setFirstMatch(boolean var1);

      @Generated
      public ComponentPattern getPattern() {
         return this.pattern;
      }

      @Generated
      public ComponentTransform getTransformation() {
         return this.transformation;
      }

      @Generated
      public State(ComponentPattern var1, ComponentTransform var2) {
         this.pattern = var1;
         this.transformation = var2;
      }
   }

   class TransformableResult {
      @NotNull
      private final Component transformedComponent;
      private final boolean skipChildrenTransformations;
      private final boolean modifiedChildren;
      private final boolean replaced;

      @NotNull
      @Generated
      public Component getTransformedComponent() {
         return this.transformedComponent;
      }

      @Generated
      public boolean isSkipChildrenTransformations() {
         return this.skipChildrenTransformations;
      }

      @Generated
      public boolean isModifiedChildren() {
         return this.modifiedChildren;
      }

      @Generated
      public boolean isReplaced() {
         return this.replaced;
      }

      @Generated
      public TransformableResult(@NotNull Component var1, boolean var2, boolean var3, boolean var4) {
         if (var1 == null) {
            throw new NullPointerException("transformedComponent is marked non-null but is null");
         }

         this.transformedComponent = var1;
         this.skipChildrenTransformations = var2;
         this.modifiedChildren = var3;
         this.replaced = var4;
      }
   }

   class TransformationResult {
      private final ComponentBuilder<?, ?> matchComponent;
      private final boolean modifiedChildren;

      @Generated
      public ComponentBuilder<?, ?> getMatchComponent() {
         return this.matchComponent;
      }

      @Generated
      public boolean isModifiedChildren() {
         return this.modifiedChildren;
      }

      @Generated
      public TransformationResult(ComponentBuilder<?, ?> var1, boolean var2) {
         this.matchComponent = var1;
         this.modifiedChildren = var2;
      }
   }
}
