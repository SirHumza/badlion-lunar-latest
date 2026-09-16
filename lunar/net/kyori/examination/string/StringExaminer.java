package net.kyori.examination.string;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import net.kyori.examination.AbstractExaminer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StringExaminer extends AbstractExaminer<String> {
   private static final Function<String, String> DEFAULT_ESCAPER = var0 -> var0.replace("\"", "\\\"")
      .replace("\\", "\\\\")
      .replace("\b", "\\b")
      .replace("\f", "\\f")
      .replace("\n", "\\n")
      .replace("\r", "\\r")
      .replace("\t", "\\t");
   private static final Collector<CharSequence, ?, String> COMMA_CURLY = Collectors.joining(", ", "{", "}");
   private static final Collector<CharSequence, ?, String> COMMA_SQUARE = Collectors.joining(", ", "[", "]");
   private final Function<String, String> escaper;

   @NotNull
   public static StringExaminer simpleEscaping() {
      return StringExaminer.Instances.SIMPLE_ESCAPING;
   }

   public StringExaminer(@NotNull Function<String, String> var1) {
      this.escaper = var1;
   }

   @NotNull
   protected <E> String array(E @NotNull [] var1, @NotNull Stream<String> var2) {
      return var2.collect(COMMA_SQUARE);
   }

   @NotNull
   protected <E> String collection(@NotNull Collection<E> var1, @NotNull Stream<String> var2) {
      return var2.collect(COMMA_SQUARE);
   }

   @NotNull
   protected String examinable(@NotNull String var1, @NotNull Stream<Entry<String, String>> var2) {
      return var1 + var2.<CharSequence>map(var0 -> (String)var0.getKey() + '=' + (String)var0.getValue()).collect(COMMA_CURLY);
   }

   @NotNull
   protected <K, V> String map(@NotNull Map<K, V> var1, @NotNull Stream<Entry<String, String>> var2) {
      return var2.<CharSequence>map(var0 -> (String)var0.getKey() + '=' + (String)var0.getValue()).collect(COMMA_CURLY);
   }

   @NotNull
   protected String nil() {
      return "null";
   }

   @NotNull
   protected String scalar(@NotNull Object var1) {
      return String.valueOf(var1);
   }

   @NotNull
   public String examine(boolean var1) {
      return String.valueOf(var1);
   }

   @NotNull
   public String examine(byte var1) {
      return String.valueOf(var1);
   }

   @NotNull
   public String examine(char var1) {
      return Strings.wrapIn(this.escaper.apply(String.valueOf(var1)), '\'');
   }

   @NotNull
   public String examine(double var1) {
      return Strings.withSuffix(String.valueOf(var1), 'd');
   }

   @NotNull
   public String examine(float var1) {
      return Strings.withSuffix(String.valueOf(var1), 'f');
   }

   @NotNull
   public String examine(int var1) {
      return String.valueOf(var1);
   }

   @NotNull
   public String examine(long var1) {
      return String.valueOf(var1);
   }

   @NotNull
   public String examine(short var1) {
      return String.valueOf(var1);
   }

   @NotNull
   protected <T> String stream(@NotNull Stream<T> var1) {
      return var1.<CharSequence>map(this::examine).collect(COMMA_SQUARE);
   }

   @NotNull
   protected String stream(@NotNull DoubleStream var1) {
      return var1.<CharSequence>mapToObj(this::examine).collect(COMMA_SQUARE);
   }

   @NotNull
   protected String stream(@NotNull IntStream var1) {
      return var1.<CharSequence>mapToObj(this::examine).collect(COMMA_SQUARE);
   }

   @NotNull
   protected String stream(@NotNull LongStream var1) {
      return var1.<CharSequence>mapToObj(this::examine).collect(COMMA_SQUARE);
   }

   @NotNull
   public String examine(@Nullable String var1) {
      return var1 == null ? this.nil() : Strings.wrapIn(this.escaper.apply(var1), '"');
   }

   @NotNull
   protected String array(int var1, IntFunction<String> var2) {
      StringBuilder var3 = new StringBuilder();
      var3.append('[');

      for (int var4 = 0; var4 < var1; var4++) {
         var3.append((String)var2.apply(var4));
         if (var4 + 1 < var1) {
            var3.append(", ");
         }
      }

      var3.append(']');
      return var3.toString();
   }

   private static final class Instances {
      static final StringExaminer SIMPLE_ESCAPING = new StringExaminer(StringExaminer.DEFAULT_ESCAPER);
   }
}
