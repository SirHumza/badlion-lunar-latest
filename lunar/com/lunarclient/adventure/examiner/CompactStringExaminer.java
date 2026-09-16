package com.lunarclient.adventure.examiner;

import com.lunarclient.adventure.utils.AdventureUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import net.kyori.examination.string.StringExaminer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@TestOnly
public class CompactStringExaminer extends StringExaminer {
   protected static final Collector<CharSequence, ?, String> COMMA_CURLY = Collectors.joining(", ", "{", "}");
   protected static final Collector<CharSequence, ?, String> COMMA_SQUARE = Collectors.joining(", ", "[", "]");
   private final boolean showEmptyCollections;

   public CompactStringExaminer() {
      this(AdventureUtils.DEFAULT_ESCAPER, true);
   }

   public CompactStringExaminer(@NotNull Function<String, String> var1, boolean var2) {
      super(var1);
      this.showEmptyCollections = var2;
   }

   protected Collector<CharSequence, ?, String> getCommaCurly() {
      return COMMA_CURLY;
   }

   protected Collector<CharSequence, ?, String> getCommaSquare() {
      return COMMA_SQUARE;
   }

   protected void increaseDepth() {
   }

   protected void decreaseDepth() {
   }

   protected int bracketSize() {
      return 2;
   }

   protected String modifyField(String var1) {
      return var1;
   }

   protected String modifyValue(String var1) {
      return var1;
   }

   @NotNull
   @Override
   protected String examinable(@NotNull String var1, @NotNull Stream<Entry<String, String>> var2) {
      this.increaseDepth();
      String var3 = var2.filter(var1x -> this.shouldIncludeValue((String)var1x.getValue()))
         .map(var1x -> this.modifyField((String)var1x.getKey()) + "=" + this.modifyValue((String)var1x.getValue()))
         .collect(this.getCommaCurly());
      this.decreaseDepth();
      return !this.showEmptyCollections && var3.length() <= this.bracketSize() ? "" : this.prettifyName(var1) + var3;
   }

   @NotNull
   @Override
   protected <K, V> String map(@NotNull Map<K, V> var1, @NotNull Stream<Entry<String, String>> var2) {
      this.increaseDepth();
      String var3 = var2.filter(var1x -> this.shouldIncludeValue((String)var1x.getValue()))
         .map(var1x -> this.modifyField((String)var1x.getKey()) + "=" + this.modifyValue((String)var1x.getValue()))
         .collect(this.getCommaCurly());
      this.decreaseDepth();
      return !this.showEmptyCollections && var3.length() <= this.bracketSize() ? "" : var3;
   }

   @NotNull
   @Override
   protected <E> String array(E @NotNull [] var1, @NotNull Stream<String> var2) {
      this.increaseDepth();
      String var3 = var2.filter(this::shouldIncludeValue).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var3.length() <= this.bracketSize() ? "" : var3;
   }

   @NotNull
   @Override
   protected <E> String collection(@NotNull Collection<E> var1, @NotNull Stream<String> var2) {
      this.increaseDepth();
      String var3 = var2.filter(this::shouldIncludeValue).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var3.length() <= this.bracketSize() ? "" : var3;
   }

   @NotNull
   @Override
   protected <T> String stream(@NotNull Stream<T> var1) {
      this.increaseDepth();
      String var2 = var1.<CharSequence>map(this::examine).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var2.length() <= this.bracketSize() ? "" : var2;
   }

   @NotNull
   @Override
   protected String stream(@NotNull DoubleStream var1) {
      this.increaseDepth();
      String var2 = var1.<CharSequence>mapToObj(this::examine).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var2.length() <= this.bracketSize() ? "" : var2;
   }

   @NotNull
   @Override
   protected String stream(@NotNull IntStream var1) {
      this.increaseDepth();
      String var2 = var1.<CharSequence>mapToObj(this::examine).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var2.length() <= this.bracketSize() ? "" : var2;
   }

   @NotNull
   @Override
   protected String stream(@NotNull LongStream var1) {
      this.increaseDepth();
      String var2 = var1.<CharSequence>mapToObj(this::examine).collect(this.getCommaSquare());
      this.decreaseDepth();
      return !this.showEmptyCollections && var2.length() <= this.bracketSize() ? "" : var2;
   }

   private boolean shouldIncludeValue(String var1) {
      return !var1.isEmpty() && !var1.equals("not_set") && !var1.equals("null");
   }

   private String prettifyName(String var1) {
      return var1.endsWith("Impl") ? var1.substring(0, var1.length() - 4) : var1;
   }
}
