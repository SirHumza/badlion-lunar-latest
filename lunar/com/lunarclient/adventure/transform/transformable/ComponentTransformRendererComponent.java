package com.lunarclient.adventure.transform.transformable;

import com.lunarclient.adventure.transform.renderer.ComponentTransformRenderer;
import com.lunarclient.adventure.transform.transformation.Transformation;
import com.lunarclient.adventure.utils.AdventureMixins;
import com.lunarclient.adventure.utils.AdventureUtils;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ComponentIteratorFlag;
import com.moonsworth.lunar.lib.adventure.text.ComponentIteratorType;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import com.moonsworth.lunar.lib.adventure.text.PatternReplacementResult;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TextReplacementConfig;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.text.format.ShadowColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.StyleBuilderApplicable;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import com.moonsworth.lunar.lib.adventure.util.IntFunction2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import lombok.Generated;
import net.kyori.examination.ExaminableProperty;
import net.kyori.examination.Examiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@TestOnly
public class WrappedTransformable implements ComponentTransformable, Component {
   private final Component delegate;

   @Nullable
   @Override
   public <S extends ComponentTransformRenderer.State> ComponentTransformRenderer.TransformableResult renderSelf(
      @NotNull ComponentTransformRenderer<S> var1, @NotNull Component var2, @Nullable List<Transformation<?, ?>> var3, @NotNull S var4
   ) {
      if (var2 instanceof WrappedTransformable var5) {
         var2 = var5.getDelegate();
      }

      if (var2 instanceof TextComponent var7) {
         return AdventureMixins.renderSelfText(var7, var1, var2, var3, var4);
      } else {
         return var2 instanceof TranslatableComponent var6 ? AdventureMixins.renderSelfTranslatable(var6, var1, var2, var3, var4) : null;
      }
   }

   public static Component attemptWrap(Component var0) {
      if (!AdventureUtils.IS_RUNNING_TEST) {
         throw new RuntimeException("WrappedTransformable shouldn't be used outside of tests!");
      } else {
         return !(var0 instanceof TextComponent) && !(var0 instanceof TranslatableComponent) ? var0 : new WrappedTransformable(var0);
      }
   }

   @Generated
   public Component getDelegate() {
      return this.delegate;
   }

   @Generated
   private WrappedTransformable(Component var1) {
      this.delegate = var1;
   }

   @Generated
   @Override
   public List<Component> children() {
      return this.getDelegate().children();
   }

   @Generated
   @Override
   public Component children(List<? extends ComponentLike> var1) {
      return this.getDelegate().children(var1);
   }

   @Generated
   @Override
   public boolean contains(Component var1) {
      return this.getDelegate().contains(var1);
   }

   @Generated
   @Override
   public boolean contains(Component var1, BiPredicate<? super Component, ? super Component> var2) {
      return this.getDelegate().contains(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public void detectCycle(Component var1) {
      this.getDelegate().detectCycle(var1);
   }

   @Generated
   @Override
   public Component append(Component var1) {
      return this.getDelegate().append(var1);
   }

   @Generated
   @Override
   public Component append(ComponentLike var1) {
      return this.getDelegate().append(var1);
   }

   @Generated
   @Override
   public Component append(ComponentBuilder<?, ?> var1) {
      return this.getDelegate().append(var1);
   }

   @Generated
   @Override
   public Component appendNewline() {
      return this.getDelegate().appendNewline();
   }

   @Generated
   @Override
   public Component appendSpace() {
      return this.getDelegate().appendSpace();
   }

   @Generated
   @Override
   public Component append(ComponentLike... var1) {
      return this.getDelegate().append(var1);
   }

   @Generated
   @Override
   public Component append(List<? extends ComponentLike> var1) {
      return this.getDelegate().append(var1);
   }

   @Generated
   @Override
   public Component applyFallbackStyle(Style var1) {
      return this.getDelegate().applyFallbackStyle(var1);
   }

   @Generated
   @Override
   public Component applyFallbackStyle(StyleBuilderApplicable... var1) {
      return this.getDelegate().applyFallbackStyle(var1);
   }

   @Generated
   @Override
   public Style style() {
      return this.getDelegate().style();
   }

   @Generated
   @Override
   public Component style(Style var1) {
      return this.getDelegate().style(var1);
   }

   @Generated
   @Override
   public Component style(Consumer<Style.Builder> var1) {
      return this.getDelegate().style(var1);
   }

   @Generated
   @Override
   public Component style(Consumer<Style.Builder> var1, Style.Merge.Strategy var2) {
      return this.getDelegate().style(var1, var2);
   }

   @Generated
   @Override
   public Component style(Style.Builder var1) {
      return this.getDelegate().style(var1);
   }

   @Generated
   @Override
   public Component mergeStyle(Component var1) {
      return this.getDelegate().mergeStyle(var1);
   }

   @Generated
   @Override
   public Component mergeStyle(Component var1, Style.Merge... var2) {
      return this.getDelegate().mergeStyle(var1, var2);
   }

   @Generated
   @Override
   public Component mergeStyle(Component var1, Set<Style.Merge> var2) {
      return this.getDelegate().mergeStyle(var1, var2);
   }

   @Generated
   @Override
   public Key font() {
      return this.getDelegate().font();
   }

   @Generated
   @Override
   public Component font(Key var1) {
      return this.getDelegate().font(var1);
   }

   @Generated
   @Override
   public TextColor color() {
      return this.getDelegate().color();
   }

   @Generated
   @Override
   public ShadowColor shadowColor() {
      return this.getDelegate().shadowColor();
   }

   @Generated
   @Override
   public Component color(TextColor var1) {
      return this.getDelegate().color(var1);
   }

   @Generated
   @Override
   public Component colorIfAbsent(TextColor var1) {
      return this.getDelegate().colorIfAbsent(var1);
   }

   @Generated
   @Override
   public Component shadowColor(ARGBLike var1) {
      return this.getDelegate().shadowColor(var1);
   }

   @Generated
   @Override
   public Component shadowColorIfAbsent(ARGBLike var1) {
      return this.getDelegate().shadowColorIfAbsent(var1);
   }

   @Generated
   @Override
   public boolean hasDecoration(TextDecoration var1) {
      return this.getDelegate().hasDecoration(var1);
   }

   @Generated
   @Override
   public Component decorate(TextDecoration var1) {
      return this.getDelegate().decorate(var1);
   }

   @Generated
   @Override
   public TextDecoration.State decoration(TextDecoration var1) {
      return this.getDelegate().decoration(var1);
   }

   @Generated
   @Override
   public Component decoration(TextDecoration var1, boolean var2) {
      return this.getDelegate().decoration(var1, var2);
   }

   @Generated
   @Override
   public Component decoration(TextDecoration var1, TextDecoration.State var2) {
      return this.getDelegate().decoration(var1, var2);
   }

   @Generated
   @Override
   public Component decorationIfAbsent(TextDecoration var1, TextDecoration.State var2) {
      return this.getDelegate().decorationIfAbsent(var1, var2);
   }

   @Generated
   @Override
   public Map<TextDecoration, TextDecoration.State> decorations() {
      return this.getDelegate().decorations();
   }

   @Generated
   @Override
   public Component decorations(Map<TextDecoration, TextDecoration.State> var1) {
      return this.getDelegate().decorations(var1);
   }

   @Generated
   @Override
   public ClickEvent clickEvent() {
      return this.getDelegate().clickEvent();
   }

   @Generated
   @Override
   public Component clickEvent(ClickEvent var1) {
      return this.getDelegate().clickEvent(var1);
   }

   @Generated
   @Override
   public HoverEvent<?> hoverEvent() {
      return this.getDelegate().hoverEvent();
   }

   @Generated
   @Override
   public Component hoverEvent(HoverEventSource<?> var1) {
      return this.getDelegate().hoverEvent(var1);
   }

   @Generated
   @Override
   public String insertion() {
      return this.getDelegate().insertion();
   }

   @Generated
   @Override
   public Component insertion(String var1) {
      return this.getDelegate().insertion(var1);
   }

   @Generated
   @Override
   public boolean hasStyling() {
      return this.getDelegate().hasStyling();
   }

   @Generated
   @Override
   public Component replaceText(Consumer<TextReplacementConfig.Builder> var1) {
      return this.getDelegate().replaceText(var1);
   }

   @Generated
   @Override
   public Component replaceText(TextReplacementConfig var1) {
      return this.getDelegate().replaceText(var1);
   }

   @Generated
   @Override
   public Component compact() {
      return this.getDelegate().compact();
   }

   @Generated
   @Override
   public Component compact(Style var1) {
      return this.getDelegate().compact(var1);
   }

   @Generated
   @Override
   public Iterable<Component> iterable(ComponentIteratorType var1, ComponentIteratorFlag... var2) {
      return this.getDelegate().iterable(var1, var2);
   }

   @Generated
   @Override
   public Iterable<Component> iterable(ComponentIteratorType var1, Set<ComponentIteratorFlag> var2) {
      return this.getDelegate().iterable(var1, var2);
   }

   @Generated
   @Override
   public Iterator<Component> iterator(ComponentIteratorType var1, ComponentIteratorFlag... var2) {
      return this.getDelegate().iterator(var1, var2);
   }

   @Generated
   @Override
   public Iterator<Component> iterator(ComponentIteratorType var1, Set<ComponentIteratorFlag> var2) {
      return this.getDelegate().iterator(var1, var2);
   }

   @Generated
   @Override
   public Spliterator<Component> spliterator(ComponentIteratorType var1, ComponentIteratorFlag... var2) {
      return this.getDelegate().spliterator(var1, var2);
   }

   @Generated
   @Override
   public Spliterator<Component> spliterator(ComponentIteratorType var1, Set<ComponentIteratorFlag> var2) {
      return this.getDelegate().spliterator(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(String var1, ComponentLike var2) {
      return this.getDelegate().replaceText(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(Pattern var1, Function<TextComponent.Builder, ComponentLike> var2) {
      return this.getDelegate().replaceText(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceFirstText(String var1, ComponentLike var2) {
      return this.getDelegate().replaceFirstText(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceFirstText(Pattern var1, Function<TextComponent.Builder, ComponentLike> var2) {
      return this.getDelegate().replaceFirstText(var1, var2);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(String var1, ComponentLike var2, int var3) {
      return this.getDelegate().replaceText(var1, var2, var3);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(Pattern var1, Function<TextComponent.Builder, ComponentLike> var2, int var3) {
      return this.getDelegate().replaceText(var1, var2, var3);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(String var1, ComponentLike var2, IntFunction2<PatternReplacementResult> var3) {
      return this.getDelegate().replaceText(var1, var2, var3);
   }

   @Deprecated
   @Generated
   @Override
   public Component replaceText(Pattern var1, Function<TextComponent.Builder, ComponentLike> var2, IntFunction2<PatternReplacementResult> var3) {
      return this.getDelegate().replaceText(var1, var2, var3);
   }

   @Generated
   @Override
   public void componentBuilderApply(ComponentBuilder<?, ?> var1) {
      this.getDelegate().componentBuilderApply(var1);
   }

   @Generated
   @Override
   public Component asComponent() {
      return this.getDelegate().asComponent();
   }

   @Generated
   @Override
   public HoverEvent<Component> asHoverEvent(UnaryOperator<Component> var1) {
      return this.getDelegate().asHoverEvent(var1);
   }

   @Generated
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return this.getDelegate().examinableProperties();
   }

   @Generated
   @Override
   public String examinableName() {
      return this.getDelegate().examinableName();
   }

   @Generated
   @Override
   public <R> R examine(Examiner<R> var1) {
      return this.getDelegate().examine(var1);
   }

   @Generated
   @Override
   public HoverEvent<Component> asHoverEvent() {
      return this.getDelegate().asHoverEvent();
   }

   @Generated
   public Component decorate(TextDecoration... var1) {
      return this.getDelegate().decorate(var1);
   }

   @Generated
   public Component decorations(Set<TextDecoration> var1, boolean var2) {
      return this.getDelegate().decorations(var1, var2);
   }
}
