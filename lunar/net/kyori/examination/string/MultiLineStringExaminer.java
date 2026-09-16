package net.kyori.examination.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import net.kyori.examination.AbstractExaminer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MultiLineStringExaminer extends AbstractExaminer<Stream<String>> {
   private static final String INDENT_2 = "  ";
   private final StringExaminer examiner;

   @NotNull
   public static MultiLineStringExaminer simpleEscaping() {
      return MultiLineStringExaminer.Instances.SIMPLE_ESCAPING;
   }

   public MultiLineStringExaminer(@NotNull StringExaminer var1) {
      this.examiner = var1;
   }

   @NotNull
   protected <E> Stream<String> array(E @NotNull [] var1, @NotNull Stream<Stream<String>> var2) {
      return this.arrayLike(var2);
   }

   @NotNull
   protected <E> Stream<String> collection(@NotNull Collection<E> var1, @NotNull Stream<Stream<String>> var2) {
      return this.arrayLike(var2);
   }

   @NotNull
   protected Stream<String> examinable(@NotNull String var1, @NotNull Stream<Entry<String, Stream<String>>> var2) {
      Stream var3 = flatten(",", var2.map(var1x -> association(this.examine((String)var1x.getKey()), " = ", (Stream<String>)var1x.getValue())));
      Stream var4 = indent(var3);
      return enclose(var4, var1 + "{", "}");
   }

   @NotNull
   protected <K, V> Stream<String> map(@NotNull Map<K, V> var1, @NotNull Stream<Entry<Stream<String>, Stream<String>>> var2) {
      Stream var3 = flatten(",", var2.map(var0 -> association((Stream<String>)var0.getKey(), " = ", (Stream<String>)var0.getValue())));
      Stream var4 = indent(var3);
      return enclose(var4, "{", "}");
   }

   @NotNull
   protected Stream<String> nil() {
      return Stream.of(this.examiner.nil());
   }

   @NotNull
   protected Stream<String> scalar(@NotNull Object var1) {
      return Stream.of(this.examiner.scalar(var1));
   }

   @NotNull
   public Stream<String> examine(boolean var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(byte var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(char var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(double var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(float var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(int var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(long var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   public Stream<String> examine(short var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   @NotNull
   protected Stream<String> array(int var1, IntFunction<Stream<String>> var2) {
      return this.arrayLike(var1 == 0 ? Stream.empty() : IntStream.range(0, var1).mapToObj(var2));
   }

   @NotNull
   protected <T> Stream<String> stream(@NotNull Stream<T> var1) {
      return this.arrayLike(var1.map(this::examine));
   }

   @NotNull
   protected Stream<String> stream(@NotNull DoubleStream var1) {
      return this.arrayLike(var1.mapToObj(this::examine));
   }

   @NotNull
   protected Stream<String> stream(@NotNull IntStream var1) {
      return this.arrayLike(var1.mapToObj(this::examine));
   }

   @NotNull
   protected Stream<String> stream(@NotNull LongStream var1) {
      return this.arrayLike(var1.mapToObj(this::examine));
   }

   @NotNull
   public Stream<String> examine(@Nullable String var1) {
      return Stream.of(this.examiner.examine(var1));
   }

   private Stream<String> arrayLike(Stream<Stream<String>> var1) {
      Stream var2 = flatten(",", var1);
      Stream var3 = indent(var2);
      return enclose(var3, "[", "]");
   }

   private static Stream<String> enclose(Stream<String> var0, String var1, String var2) {
      return enclose(var0.collect(Collectors.toList()), var1, var2);
   }

   private static Stream<String> enclose(List<String> var0, String var1, String var2) {
      return var0.isEmpty()
         ? Stream.of(var1 + var2)
         : Stream.of(Stream.of(var1), indent(var0.stream()), Stream.of(var2)).reduce(Stream.empty(), Stream::concat);
   }

   private static Stream<String> flatten(String var0, Stream<Stream<String>> var1) {
      ArrayList var2 = new ArrayList();
      var1.forEachOrdered(var2x -> {
         if (!var2.isEmpty()) {
            int var3 = var2.size() - 1;
            var2.set(var3, (String)var2.get(var3) + var0);
         }

         var2x.forEachOrdered(var2::add);
      });
      return var2.stream();
   }

   private static Stream<String> association(Stream<String> var0, String var1, Stream<String> var2) {
      return association(var0.collect(Collectors.toList()), var1, var2.collect(Collectors.toList()));
   }

   private static Stream<String> association(List<String> var0, String var1, List<String> var2) {
      int var3 = var0.size();
      int var4 = var2.size();
      int var5 = Math.max(var3, var4);
      int var6 = Strings.maxLength(var0.stream());
      String var7 = var3 < 2 ? "" : Strings.repeat(" ", var6);
      String var8 = var3 < 2 ? "" : Strings.repeat(" ", var1.length());
      ArrayList var9 = new ArrayList(var5);

      for (int var10 = 0; var10 < var5; var10++) {
         String var11 = var10 < var3 ? Strings.padEnd((String)var0.get(var10), var6, ' ') : var7;
         String var12 = var10 == 0 ? var1 : var8;
         String var13 = var10 < var4 ? (String)var2.get(var10) : "";
         var9.add(var11 + var12 + var13);
      }

      return var9.stream();
   }

   private static Stream<String> indent(Stream<String> var0) {
      return var0.map(var0x -> "  " + var0x);
   }

   private static final class Instances {
      static final MultiLineStringExaminer SIMPLE_ESCAPING = new MultiLineStringExaminer(StringExaminer.simpleEscaping());
   }
}
