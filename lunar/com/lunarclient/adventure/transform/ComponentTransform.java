package com.lunarclient.adventure.transform;

import com.lunarclient.adventure.transform.transformation.Transformation;
import com.lunarclient.adventure.transform.transformation.TransformationAction;
import com.lunarclient.adventure.transform.transformation.TransformationAdd;
import com.lunarclient.adventure.transform.transformation.TransformationFunctor;
import com.lunarclient.adventure.transform.transformation.TransformationImpl;
import com.lunarclient.adventure.transform.transformation.TransformationMove;
import com.lunarclient.adventure.utils.ComponentType;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.text.format.MutableStyleSetter;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.MatchResult;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ComponentTransform implements Buildable<ComponentTransform, ComponentTransform.Builder>, Examinable {
   private final Map<ComponentType<?, ?>, List<Transformation<?, ?>>> transformations;

   public ComponentTransform(Map<ComponentType<?, ?>, List<Transformation<?, ?>>> var1) {
      this.transformations = var1;
   }

   @Nullable
   public <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> List<Transformation<C, B>> getTransformations(ComponentType<C, B> var1) {
      return (List<Transformation<C, B>>)this.transformations.get(var1);
   }

   @NotNull
   public static ComponentTransform replace(String var0) {
      return builder().replaceText(var0).build();
   }

   @NotNull
   public static ComponentTransform replace(ComponentBuilder var0) {
      return builder().replace(var0).build();
   }

   @NotNull
   public static ComponentTransform replace(BuildableComponent var0) {
      return builder().replace(var0).build();
   }

   @NotNull
   public static ComponentTransform textReplace(ComponentBuilder var0) {
      return builder().textReplace(var0).build();
   }

   @NotNull
   public static ComponentTransform textReplace(BuildableComponent var0) {
      return builder().textReplace(var0).build();
   }

   @NotNull
   public static ComponentTransform functor(TransformFunctor var0) {
      return builder().functor(var0).build();
   }

   @NotNull
   public static ComponentTransform textFunctor(TransformFunctor<TextComponent, TextComponent.Builder> var0) {
      return builder().functor(ComponentType.TEXT, var0).build();
   }

   @NotNull
   public static ComponentTransform style(Style var0) {
      return builder().style(var0).build();
   }

   @NotNull
   public static ComponentTransform color(TextColor var0) {
      return builder().color(var0).build();
   }

   @NotNull
   public static ComponentTransform decorate(TextDecoration var0) {
      return builder().decorate(var0).build();
   }

   @NotNull
   public static ComponentTransform prepend(Component var0) {
      return builder().prepend(var0).build();
   }

   @NotNull
   public static ComponentTransform append(Component var0) {
      return builder().append(var0).build();
   }

   @NotNull
   public static ComponentTransform remove() {
      return builder().removeComponent().build();
   }

   @NotNull
   public static ComponentTransform removeChildren() {
      return builder().removeAllChildren().build();
   }

   @NotNull
   public ComponentTransform.Builder toBuilder() {
      ComponentTransform.Builder var1 = new ComponentTransform.Builder();
      var1.transformations.putAll(this.transformations);
      return var1;
   }

   public static ComponentTransform.Builder builder() {
      return new ComponentTransform.Builder();
   }

   public static class Builder implements MutableStyleSetter<ComponentTransform.Builder>, Buildable.Builder<ComponentTransform> {
      protected final Map<ComponentType<?, ?>, List<Transformation<?, ?>>> transformations = new HashMap<>();

      @Contract("_,_ -> this")
      @NotNull
      public <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder transformation(
         @NotNull ComponentType<C, B> var1, @NotNull Transformation<C, B> var2
      ) {
         this.getTransformations(var1).add(var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder textTransformation(@NotNull Transformation<TextComponent, TextComponent.Builder> var1) {
         this.getTransformations(ComponentType.TEXT).add(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder textReplace(@NotNull ComponentBuilder var1) {
         this.addModifyTransformFunctor((var1x, var2) -> var2 instanceof TextComponent.Builder ? var1 : var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder textReplace(@NotNull BuildableComponent var1) {
         this.addModifyTransformFunctor((var1x, var2) -> var2 instanceof TextComponent.Builder ? var1.toBuilder() : var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder functor(@NotNull TransformFunctor var1) {
         return this.functor(ComponentType.COMPONENT, var1);
      }

      @Contract("_,_ -> this")
      @NotNull
      public <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder functor(
         @NotNull ComponentType<C, B> var1, @NotNull TransformFunctor<C, B> var2
      ) {
         return this.addModifyTransformFunctor(var1, var2);
      }

      @Contract("_,_ -> this")
      @NotNull
      public <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder replace(
         @NotNull ComponentType<C, B> var1, @NotNull B var2
      ) {
         this.getTransformations(var1).add(new TransformationFunctor(TransformationAction.MODIFY, (var1x, var2x) -> (B)var2));
         return this;
      }

      @Contract("_,_ -> this")
      @NotNull
      public <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder replace(
         @NotNull ComponentType<C, B> var1, @NotNull C var2
      ) {
         this.getTransformations(var1).add(new TransformationFunctor(TransformationAction.MODIFY, (var1x, var2x) -> (B)var2.toBuilder()));
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder replace(@NotNull ComponentBuilder var1) {
         return this.addModifyTransformFunctor((var1x, var2) -> var1);
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder replace(@NotNull BuildableComponent var1) {
         return this.replace(var1.toBuilder());
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder appendChild(@NotNull ComponentLike var1) {
         return this.appendChild(var1.asComponent());
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder appendChildren(@NotNull ComponentLike... var1) {
         return this.addChildrenTransformationFunctor((var1x, var2) -> var2.append(var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder appendChild(@NotNull Component var1) {
         return this.addChildrenTransformationFunctor((var1x, var2) -> var2.append(var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder appendChildren(@NotNull Component... var1) {
         return this.addChildrenTransformationFunctor((var1x, var2) -> var2.append(var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prependChild(@NotNull ComponentBuilder var1) {
         return this.addChildrenTransformationFunctor((var1x, var2) -> {
            AtomicReference var3 = new AtomicReference();
            ComponentBuilder var4 = var2.mapChildren(var2x -> {
               if (var3.get() == null) {
                  var3.set(var2x);
                  return var1.build();
               } else {
                  BuildableComponent var3x = (BuildableComponent)var3.get();
                  var3.set(var2x);
                  return var3x;
               }
            });
            BuildableComponent var5 = (BuildableComponent)var3.get();
            if (var5 != null) {
               var4.append((Component)var3.get());
            } else {
               var4.append(var1.build());
            }

            return var4;
         });
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prependChildren(@NotNull List<ComponentBuilder> var1) {
         return this.addChildrenTransformationFunctor((var1x, var2) -> {
            ArrayList var3 = new ArrayList(var1);
            ArrayList var4 = new ArrayList();
            ComponentBuilder var5 = var2.mapChildren(var2x -> {
               if (!var3.isEmpty()) {
                  var4.add(var2x);
                  return ((ComponentBuilder)var3.remove(0)).build();
               } else {
                  BuildableComponent var3x = (BuildableComponent)var4.remove(0);
                  var4.add(var2x);
                  return var3x;
               }
            });
            if (var4.isEmpty()) {
               var5.append(var2.build());
            } else {
               var5.append(var4);
            }

            return var5;
         });
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prependChild(@NotNull BuildableComponent var1) {
         return this.prependChild(var1.toBuilder());
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder removeAllChildren() {
         return this.addChildrenTransformationFunctor((var0, var1) -> var1.mapChildren(var0x -> Component.empty()));
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder removeComponent() {
         this.getTransformations(ComponentType.COMPONENT).add(new TransformationImpl(TransformationAction.REMOVE));
         return this;
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder resetStyle() {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var0, var1) -> var1.resetStyle()));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder style(@NotNull Style var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.style(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder style(@NotNull Consumer<Style.Builder> var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.style(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder mergeStyle(@NotNull Component var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.mergeStyle(var1)));
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder mergeStyle(@NotNull Component var1, Style.@NotNull Merge @NotNull ... var2) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.mergeStyle(var1, var2)));
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder mergeStyle(@NotNull Component var1, @NotNull Set<Style.Merge> var2) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.mergeStyle(var1, var2)));
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder removeAllDecorations() {
         return this.addTransformationFunctor(
            ComponentType.COMPONENT, this.createModifyTransformationFunctor((var0, var1) -> var1.decorations(Set.of(TextDecoration.values()), false))
         );
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder enableAllDecorations() {
         return this.addTransformationFunctor(
            ComponentType.COMPONENT, this.createModifyTransformationFunctor((var0, var1) -> var1.decorations(Set.of(TextDecoration.values()), true))
         );
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder decorations(@NotNull Set<TextDecoration> var1, boolean var2) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.decorations(var1, var2)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.decorations(var1)));
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder decoration(@NotNull TextDecoration var1, boolean var2) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.decoration(var1, var2)));
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder decoration(@NotNull TextDecoration var1, @NotNull TextDecoration.State var2) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.decoration(var1, var2)));
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder decorationIfAbsent(@NotNull TextDecoration var1, @NotNull TextDecoration.State var2) {
         return this.addTransformationFunctor(
            ComponentType.COMPONENT, this.createModifyTransformationFunctor((var2x, var3) -> var3.decorationIfAbsent(var1, var2))
         );
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder decorate(@NotNull TextDecoration var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.decorate(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder decorate(@NotNull TextDecoration... var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.decorate(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder font(@Nullable Key var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.font(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder color(@Nullable TextColor var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.color(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder color(@Nullable Color var1) {
         return var1 == null ? this.color((TextColor)null) : this.color(TextColor.color(var1.getRGB()));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder colorIfAbsent(@Nullable TextColor var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.colorIfAbsent(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder colorIfAbsent(@Nullable Color var1) {
         return var1 == null ? this.colorIfAbsent((TextColor)null) : this.colorIfAbsent(TextColor.color(var1.getRGB()));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder shadowColor(@Nullable ARGBLike var1) {
         return this.addTransformationFunctor(
            ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> (ComponentBuilder)var2.shadowColor(var1))
         );
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder shadowColorIfAbsent(@Nullable ARGBLike var1) {
         return this.addTransformationFunctor(
            ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> (ComponentBuilder)var2.shadowColorIfAbsent(var1))
         );
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder shadowColor(@Nullable Color var1) {
         return var1 == null ? this.shadowColor((ARGBLike)null) : this.shadowColor(ShadowColor.shadowColor(var1.getRGB()));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder clickEvent(@Nullable ClickEvent var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.clickEvent(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder hoverEvent(@Nullable HoverEventSource<?> var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.hoverEvent(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder insertion(@Nullable String var1) {
         return this.addTransformationFunctor(ComponentType.COMPONENT, this.createModifyTransformationFunctor((var1x, var2) -> var2.insertion(var1)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder move(int var1) {
         this.getTransformations(ComponentType.COMPONENT).add(new TransformationMove(var1));
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder append(@NotNull Component var1) {
         return this.add(AddPosition.APPEND, var1);
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prepend(@NotNull Component var1) {
         return this.add(AddPosition.PREPEND, var1);
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder add(@NotNull AddPosition var1, @NotNull Component var2) {
         this.getTransformations(ComponentType.COMPONENT).add(new TransformationAdd(var1, var2));
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder append(@NotNull ComponentLike var1) {
         return this.append(var1.asComponent());
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prepend(@NotNull ComponentLike var1) {
         return this.prepend(var1.asComponent());
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentTransform.Builder add(@NotNull AddPosition var1, @NotNull ComponentLike var2) {
         return this.add(var1, var2.asComponent());
      }

      @Contract("-> this")
      @NotNull
      public ComponentTransform.Builder removeText() {
         return this.addTextTransformationFunctor((var0, var1) -> var1.content(""));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder replaceText(@NotNull String var1) {
         return this.addTextTransformationFunctor((var1x, var2) -> var2.content(var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder appendText(@NotNull String var1) {
         return this.addTextTransformationFunctor((var1x, var2) -> var2.content(var2.content() + var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder prependText(@NotNull String var1) {
         return this.addTextTransformationFunctor((var1x, var2) -> var2.content(var1 + var2.content()));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder textFunctor(@NotNull Function<String, String> var1) {
         return this.addTextTransformationFunctor((var1x, var2) -> var1x == null ? var2 : var2.content((String)var1.apply(var1x.group())));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder textMatchFunctor(@NotNull Function<@Nullable MatchResult, String> var1) {
         return this.addTextTransformationFunctor((var1x, var2) -> var2.content((String)var1.apply(var1x)));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder replaceTranslatableKey(@NotNull String var1) {
         return this.addTranslatableTransformationFunctor((var1x, var2) -> var2.key(var1));
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentTransform.Builder translatableFunctor(@NotNull TransformFunctor<TranslatableComponent, TranslatableComponent.Builder> var1) {
         return this.addTranslatableTransformationFunctor(var1);
      }

      @Contract("_ -> new")
      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> TransformationFunctor<C, B> createModifyTransformationFunctor(
         @NotNull TransformFunctor<C, B> var1
      ) {
         return new TransformationFunctor<>(TransformationAction.MODIFY, var1);
      }

      @Contract("_ -> new")
      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> TransformationFunctor<C, B> createChildrenTransformationFunctor(
         @NotNull TransformFunctor<C, B> var1
      ) {
         return new TransformationFunctor<>(TransformationAction.CHILDREN, var1);
      }

      @Contract("_ -> this")
      @NotNull
      private ComponentTransform.Builder addModifyTransformFunctor(@NotNull TransformFunctor var1) {
         this.getTransformations(ComponentType.COMPONENT).add(this.createModifyTransformationFunctor(var1));
         return this;
      }

      @Contract("_,_ -> this")
      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder addModifyTransformFunctor(
         @NotNull ComponentType<C, B> var1, @NotNull TransformFunctor<C, B> var2
      ) {
         this.getTransformations(var1).add(this.createModifyTransformationFunctor(var2));
         return this;
      }

      @Contract("_,_,_ -> this")
      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder addTransformFunctor(
         @NotNull ComponentType<C, B> var1, @NotNull TransformationAction var2, @NotNull TransformFunctor<C, B> var3
      ) {
         this.getTransformations(var1).add(new TransformationFunctor(var2, var3));
         return this;
      }

      @Contract("_,_ -> this")
      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> ComponentTransform.Builder addTransformationFunctor(
         @NotNull ComponentType<C, B> var1, @NotNull TransformationFunctor<C, B> var2
      ) {
         this.getTransformations(var1).add(var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      private ComponentTransform.Builder addTextTransformationFunctor(@NotNull TransformFunctor<TextComponent, TextComponent.Builder> var1) {
         TransformationFunctor var2 = new TransformationFunctor(TransformationAction.MODIFY, var1);
         this.getTransformations(ComponentType.TEXT).add(var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      private ComponentTransform.Builder addTranslatableTransformationFunctor(
         @NotNull TransformFunctor<TranslatableComponent, TranslatableComponent.Builder> var1
      ) {
         TransformationFunctor var2 = new TransformationFunctor(TransformationAction.MODIFY, var1);
         this.getTransformations(ComponentType.TRANSLATABLE).add(var2);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      private ComponentTransform.Builder addChildrenTransformationFunctor(@NotNull TransformFunctor var1) {
         TransformationFunctor var2 = new TransformationFunctor(TransformationAction.CHILDREN, var1);
         this.getTransformations(ComponentType.COMPONENT).add(var2);
         return this;
      }

      @NotNull
      private <C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> List<Transformation<C, B>> getTransformations(ComponentType<C, B> var1) {
         return (List<Transformation<C, B>>)this.transformations.computeIfAbsent(var1, var0 -> new ArrayList<>());
      }

      @NotNull
      public ComponentTransform build() {
         return new ComponentTransform(Map.copyOf(this.transformations));
      }
   }
}
