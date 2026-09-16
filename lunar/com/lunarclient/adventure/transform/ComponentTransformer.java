package com.lunarclient.adventure.transform;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.renderer.ComponentTransformRenderer;
import com.lunarclient.adventure.transform.renderer.ComponentTransformRendererImpl;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.function.BiFunction;
import java.util.regex.Pattern;
import lombok.Generated;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;

public class ComponentTransformer {
   private final ComponentPattern pattern;
   private final ComponentTransform transform;

   @NotNull
   public Component transform(@NotNull Component var1) {
      return ComponentTransformRendererImpl.INSTANCE.render(var1, new ComponentTransformRendererImpl.StateImpl(this.pattern, this.transform));
   }

   @NotNull
   public <S extends ComponentTransformRenderer.State> Component transform(@NotNull ComponentTransformRenderer<S> var1, @NotNull Component var2) {
      return var1.render(var2, var1.createState(this.pattern, this.transform));
   }

   @NotNull
   public <S extends ComponentTransformRenderer.State> Component transform(
      @NotNull ComponentTransformRenderer<S> var1, @NotNull S var2, @NotNull Component var3
   ) {
      return var1.render(var3, var2);
   }

   @NotNull
   public <S extends ComponentTransformRenderer.State> Component transform(
      @NotNull ComponentTransformRenderer<S> var1, @NotNull BiFunction<ComponentPattern, ComponentTransform, S> var2, @NotNull Component var3
   ) {
      return var1.render(var3, (S)var2.apply(this.pattern, this.transform));
   }

   @NotNull
   public static ComponentTransformer replaceLiteral(String var0, String var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replaceLiteral(String var0, ComponentBuilder var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.textReplace(var1));
   }

   @NotNull
   public static ComponentTransformer replaceLiteral(String var0, BuildableComponent var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.textReplace(var1));
   }

   @NotNull
   public static ComponentTransformer replaceRegex(@RegExp String var0, String var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replaceRegex(@RegExp String var0, ComponentBuilder var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replaceRegex(@RegExp String var0, BuildableComponent var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replacePattern(Pattern var0, String var1) {
      return new ComponentTransformer(ComponentPattern.pattern(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replacePattern(Pattern var0, ComponentBuilder var1) {
      return new ComponentTransformer(ComponentPattern.pattern(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer replacePattern(Pattern var0, BuildableComponent var1) {
      return new ComponentTransformer(ComponentPattern.pattern(var0), ComponentTransform.replace(var1));
   }

   @NotNull
   public static ComponentTransformer colorLiteral(String var0, TextColor var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.color(var1));
   }

   @NotNull
   public static ComponentTransformer colorRegex(@RegExp String var0, TextColor var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.color(var1));
   }

   @NotNull
   public static ComponentTransformer styleLiteral(String var0, Style var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.style(var1));
   }

   @NotNull
   public static ComponentTransformer styleRegex(@RegExp String var0, Style var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.style(var1));
   }

   @NotNull
   public static ComponentTransformer appendLiteral(String var0, Component var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.append(var1));
   }

   @NotNull
   public static ComponentTransformer appendRegex(@RegExp String var0, Component var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.append(var1));
   }

   @NotNull
   public static ComponentTransformer prependLiteral(String var0, Component var1) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.prepend(var1));
   }

   @NotNull
   public static ComponentTransformer prependRegex(@RegExp String var0, Component var1) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.prepend(var1));
   }

   @NotNull
   public static ComponentTransformer removeLiteral(String var0) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.remove());
   }

   @NotNull
   public static ComponentTransformer removeRegex(@RegExp String var0) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.remove());
   }

   @NotNull
   public static ComponentTransformer removeChildrenLiteral(String var0) {
      return new ComponentTransformer(ComponentPattern.literal(var0), ComponentTransform.removeChildren());
   }

   @NotNull
   public static ComponentTransformer removeChildrenRegex(@RegExp String var0) {
      return new ComponentTransformer(ComponentPattern.regex(var0), ComponentTransform.removeChildren());
   }

   public static ComponentTransformer of(String var0, ComponentTransform var1) {
      return of(ComponentPattern.literal(var0), var1);
   }

   public static ComponentTransformer of(Pattern var0, ComponentTransform var1) {
      return of(ComponentPattern.pattern(var0), var1);
   }

   public static ComponentTransformer of(ComponentPattern var0, ComponentTransform var1) {
      return new ComponentTransformer(var0, var1);
   }

   public static ComponentTransformer of(ComponentPattern.Builder var0, ComponentTransform var1) {
      return new ComponentTransformer(var0.build(), var1);
   }

   public static ComponentTransformer of(ComponentPattern var0, ComponentTransform.Builder var1) {
      return new ComponentTransformer(var0, var1.build());
   }

   public static ComponentTransformer of(ComponentPattern.Builder var0, ComponentTransform.Builder var1) {
      return new ComponentTransformer(var0.build(), var1.build());
   }

   @Generated
   public ComponentPattern getPattern() {
      return this.pattern;
   }

   @Generated
   public ComponentTransform getTransform() {
      return this.transform;
   }

   @Generated
   private ComponentTransformer(ComponentPattern var1, ComponentTransform var2) {
      this.pattern = var1;
      this.transform = var2;
   }
}
