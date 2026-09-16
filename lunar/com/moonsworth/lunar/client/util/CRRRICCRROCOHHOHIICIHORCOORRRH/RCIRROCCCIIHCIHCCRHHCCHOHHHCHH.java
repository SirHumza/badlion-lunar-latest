package com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.JsonElement;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.Decoder;
import com.lunarclient.dfu.serialization.Dynamic;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.JavaOps;
import com.lunarclient.dfu.serialization.JsonOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import com.lunarclient.dfu.serialization.codecs.BaseMapCodec;
import com.lunarclient.dfu.serialization.codecs.RecordCodecBuilder;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.CIHCOICOOICHOCCHICIHRCOCIHRIOC;
import com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.ICOHIIIRCIORCORHRRROOOOCOOROIC;
import com.moonsworth.lunar.client.util.OCIOROHIHRROROOIRRHRRCCHHRRRHI;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.mutable.MutableObject;
import org.joml.AxisAngle4f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final Codec<JsonElement> HHHRRCRRICIOHRIOHCCRHOOOIICOCC = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonOps.INSTANCE);
   public static final Codec<Object> HROIORCHHIOCORICCHORIOHCRCCOHR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JavaOps.INSTANCE);
   public static final Codec<Vector3f> RHRIRHRICCIICCRIICRRROCICOCCIC = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((List<Float>)var0, 3)
            .map(var0x -> new Vector3f(var0x.get(0), var0x.get(1), var0x.get(2))),
         var0 -> List.of(var0.x(), var0.y(), var0.z())
      );
   public static final Codec<Vector4f> IIIRORCCCIORHOHRRHCOCRRIRIHIOR = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((List<Float>)var0, 4)
            .map(var0x -> new Vector4f(var0x.get(0), var0x.get(1), var0x.get(2), var0x.get(3))),
         var0 -> List.of(var0.x(), var0.y(), var0.z(), var0.w())
      );
   public static final Codec<Quaternionf> RHIHHHIHOOOHRHRCICRHCOHIRIRHOO = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((List<Float>)var0, 4)
            .map(var0x -> new Quaternionf(var0x.get(0), var0x.get(1), var0x.get(2), var0x.get(3)).normalize()),
         var0 -> List.of(var0.x, var0.y, var0.z, var0.w)
      );
   public static final Codec<AxisAngle4f> CIHIIHOICHCOCICHRHCIRIROOHIIRO = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.FLOAT.fieldOf("angle").forGetter(var0x -> var0x.angle),
            RHRIRHRICCIICCRIICRRROCICOCCIC.fieldOf("axis").forGetter(var0x -> new Vector3f(var0x.x, var0x.y, var0x.z))
         )
         .apply(var0, AxisAngle4f::new)
   );
   public static final Codec<Quaternionf> HOCCOOIORICHORCIIICCCRRHHCCHIH = Codec.withAlternative(
      RHIHHHIHOOOHRHRCICRHCOHIRIRHOO, CIHIIHOICHCOCICHRHCIRIROOHIIRO.xmap(Quaternionf::new, AxisAngle4f::new)
   );
   public static final Codec<Matrix4f> HIROIOOORIIICOIROCCIIIIHIIOOHR = Codec.FLOAT
      .listOf()
      .comapFlatMap(var0 -> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((List<Float>)var0, 16).map(var0x -> {
         Matrix4f var1 = new Matrix4f();

         for (int var2 = 0; var2 < var0x.size(); var2++) {
            var1.setRowColumn(var2 >> 2, var2 & 3, var0x.get(var2));
         }

         return var1.determineProperties();
      }), var0 -> {
         FloatArrayList var1 = new FloatArrayList(16);

         for (int var2 = 0; var2 < 16; var2++) {
            var1.add(var0.getRowColumn(var2 >> 2, var2 & 3));
         }

         return var1;
      });
   public static final Codec<Integer> IRHOICOHHOOOCHIOOOOOHCHHCRHICC = Codec.withAlternative(
      Codec.INT, IIIRORCCCIORHOHRRHCOCRRIRIHIOR, var0 -> OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(var0.w(), var0.x(), var0.y(), var0.z())
   );
   public static final Codec<Integer> IHRIHIIOCHIIOOOCIIIIHICHHHOCOC = Codec.BYTE
      .flatComapMap(
         UnsignedBytes::toInt,
         var0 -> var0 > 255 ? DataResult.error(() -> "Unsigned byte was too large: " + var0 + " > 255") : DataResult.success(var0.byteValue())
      );
   public static final Codec<Integer> IRIICOORROROCCHHOHRRCRIICCRHIH = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      0, Integer.MAX_VALUE, var0 -> "Value must be non-negative: " + var0
   );
   public static final Codec<Integer> OCHIRIOHORICRRHCHCOOCORCOORCHC = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      1, Integer.MAX_VALUE, var0 -> "Value must be positive: " + var0
   );
   public static final Codec<Float> ICICOIIOHHCHRRHCHROOHCROCROHII = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      0.0F, Float.MAX_VALUE, var0 -> "Value must be positive: " + var0
   );
   public static final Codec<Pattern> OCHRRIOCOCCCHCHROCIOIIIRCOCROI = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(Pattern.compile(var0));
      } catch (PatternSyntaxException var2) {
         return DataResult.error(() -> "Invalid regex pattern '" + var0 + "': " + var2.getMessage());
      }
   }, Pattern::pattern);
   public static final Codec<Instant> OHORCCIRRRCCHCOHIIHCRORCIIIHII = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(DateTimeFormatter.ISO_INSTANT)
      .xmap(Instant::from, Function.identity());
   public static final Codec<byte[]> ROCHHIHRCHHOOCIOCRCIRRORICHIII = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(Base64.getDecoder().decode(var0));
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Malformed base64 string");
      }
   }, var0 -> Base64.getEncoder().encodeToString(var0));
   public static final Codec<String> RRCOIORCHOHIHIHOOHIHORIORCRCIR = Codec.STRING
      .comapFlatMap(var0 -> DataResult.success(StringEscapeUtils.unescapeJava(var0)), StringEscapeUtils::escapeJava);
   public static final Codec<CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHROOHRRHHHHOOHRCCHHIOHHCCOORR = Codec.STRING
      .comapFlatMap(
         var0 -> var0.startsWith("#")
            ? HOICCHRHOCIORIICICCOOIHRRHIIOR(var0.substring(1)).map(var0x -> new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0x, true))
            : HOICCHRHOCIORIICICCOOIHRRHIIOR(var0).map(var0x -> new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0x, false)),
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::RHRIHIIROIROIIROOCRHOHROHIOOHH
      );
   public static final Codec<BitSet> ROHICRORHORHRCRCRHIORIIHIIHRCR = Codec.LONG_STREAM
      .xmap(var0 -> BitSet.valueOf(var0.toArray()), var0 -> Arrays.stream(var0.toLongArray()));
   public static final Codec<IntSet> CHRRICHCRIRHORHIIROIIIROIHHROI = Codec.INT_STREAM
      .xmap(var0 -> IHCRORHRORIICHRHRCHRRIRRHHOCOO(var0.toArray()), var0 -> Arrays.stream(var0.toIntArray()));
   public static final Codec<LongSet> HCOROIICHRCORCOCHORCOHOIIHORCC = Codec.LONG_STREAM
      .xmap(var0 -> IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0.toArray()), var0 -> Arrays.stream(var0.toLongArray()));
   public static final Codec<Integer> OHOCCOROIOIOICROOIOHIORHHIHCCO = Codec.STRING
      .comapFlatMap(
         var0 -> {
            try {
               return var0.startsWith("#")
                  ? DataResult.success((int)Long.parseLong(var0.substring(1), 16), Lifecycle.stable())
                  : DataResult.success(Integer.decode(var0), Lifecycle.stable());
            } catch (IllegalArgumentException var2) {
               return DataResult.error(() -> "Invalid Integer " + var0 + ": " + var2.getMessage());
            }
         },
         var0 -> var0 + ""
      );
   public static final Codec<Int2IntMap> OORICCIRCCRRCHHCHHIHHICHRHROIO = Codec.unboundedMap(OHOCCOROIOIOICROOIOHIORHHIHCCO, Codec.INT)
      .xmap(Int2IntArrayMap::new, Int2IntArrayMap::new);
   public static final Codec<String> HCROOHOOOICIIRCRIIHOOCIHOOCOIH = Codec.string(0, 16)
      .validate(
         var0 -> ICOHIIIRCIORCORHRRROOOOCOOROIC.IOICCCHOCCOIIHICRCIRIRROHRCHCC(var0)
            ? DataResult.success(var0)
            : DataResult.error(() -> "Player name contained disallowed characters: '" + var0 + "'")
      );
   public static final Codec<UUID> RRRRHCIIRIHIOIRCHHROIIIHOHRCHH = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> CIHCOICOOICHOCCHICIHRCOCIHRIOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 4).map(OCIOROHIHRROROOIRRHRRCCHHRRRHI::RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO),
         var0 -> Arrays.stream(OCIOROHIHRROROOIRRHRRCCHHRRRHI.RICHHRCCHRIICHROOROCCICOIRRHCR(var0))
      );
   public static final Codec<Set<UUID>> ROROCCRHRIIOIOCHRIOCIIROCOROHI = Codec.list(RRRRHCIIRIHIOIRCHHROIIIHOHRCHH).xmap(Sets::newHashSet, Lists::newArrayList);
   public static final Codec<Set<UUID>> CCHCOCHOHOCIOOIIIIRORIRHRROHHR = Codec.list(RRRRHCIIRIHIOIRCHHROIIIHOHRCHH)
      .xmap(Sets::newLinkedHashSet, Lists::newArrayList);
   public static final Codec<UUID> COIIRCHICCORCRRIOHIHRIHIROOHRC = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(UUID.fromString(var0), Lifecycle.stable());
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Invalid UUID " + var0 + ": " + var2.getMessage());
      }
   }, UUID::toString);
   public static final Codec<UUID> RCICICIROOIHCCIRRIOHROOIIIOIOI = Codec.withAlternative(Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(OCIOROHIHRROROOIRRHRRCCHHRRRHI.IHIHHCICIRHOCHCIOCIORCCOCHORHC(var0), Lifecycle.stable());
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Invalid UUID " + var0 + ": " + var2.getMessage());
      }
   }, OCIOROHIHRROROOIRRHRRCCHHRRRHI::HRCROCOHHHICRHIHHOOCIIRRRCCIRR), RRRRHCIIRIHIOIRCHHROIIIHOHRCHH);
   public static final Codec<UUID> OHICICRHRICRORRHHRCCRIIIICOORO = Codec.withAlternative(RRRRHCIIRIHIOIRCHHROIIIHOHRCHH, COIIRCHICCORCRRIOHIHRIHIROOHRC);
   public static final Codec<String> HHORIROHICOCRRCIRROHOHOHIIRRHI = Codec.STRING
      .validate(var0 -> var0.isEmpty() ? DataResult.error(() -> "Expected non-empty string") : DataResult.success(var0));
   public static final Codec<Integer> OCOHRCICCHIHIIHIOIIRHCCIOOHORO = Codec.STRING.comapFlatMap(var0 -> {
      int[] var1 = var0.codePoints().toArray();
      return var1.length != 1 ? DataResult.error(() -> "Expected one codepoint, got: " + var0) : DataResult.success(var1[0]);
   }, Character::toString);
   public static final Codec<String> RCIHHRICHHOIRIIRRHIOOOCOOCIOHC = Codec.STRING
      .validate(
         var0 -> !RCIROOOOICRHCCRRCIORHHIRCOIIIC.isValidPath(var0)
            ? DataResult.error(() -> "Invalid string to use as a resource path element: " + var0)
            : DataResult.success(var0)
      );
   public static final Codec<Boolean> OHROHCOOOOCHOCOOIRHOHCICOOCIHI = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(Boolean.parseBoolean(var0), Lifecycle.stable());
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Invalid Boolean " + var0 + ": " + var2.getMessage());
      }
   }, var0 -> var0 + "");
   public static final Codec<Boolean> HRRICCHCOCICCIOIHOOOORIOHRHCCO = Codec.withAlternative(Codec.BOOL, OHROHCOOOOCHOCOOIRHOHCICOOCIHI);
   public static final MapCodec<GameProfile> CHOHHRRRIRHHORRCCIOOOCHICOCIRO = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            RCICICIROOIHCCIRRIOHROOIIIOIOI.fieldOf("id").forGetter(GameProfile::getId),
            HCROOHOOOICIIRCRIIHOOCIHOOCOIH.fieldOf("name").forGetter(GameProfile::getName)
         )
         .apply(var0, GameProfile::new)
   );
   public static final Function<Optional<Long>, OptionalLong> RHOHHROHRHHOOROHHIIRIIRRCIRHIC = var0 -> var0.map(OptionalLong::of)
      .orElseGet(OptionalLong::empty);
   public static final Function<OptionalLong, Optional<Long>> IRIRIOIRHCHIHIOIHIIORHRHRCCCRI = var0 -> var0.isPresent()
      ? Optional.of(var0.getAsLong())
      : Optional.empty();

   public static Codec<Byte> IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte var0, byte var1) {
      Function var2 = checkRange(var0, var1);
      return Codec.BYTE.flatXmap(var2, var2);
   }

   public static Codec<Long> RRCRRCORICCHOHHIRCHIROOHIIOHCO(long var0, long var2) {
      Function var4 = checkRange(var0, var2);
      return Codec.LONG.flatXmap(var4, var4);
   }

   public static Codec<Short> IRCIIHHICIHRCOCRROCOICRIHHCCHH(short var0, short var1) {
      Function var2 = checkRange(var0, var1);
      return Codec.SHORT.flatXmap(var2, var2);
   }

   public static <T> Codec<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DynamicOps<T> var0) {
      return Codec.PASSTHROUGH.xmap(var1 -> var1.convert(var0).getValue(), var1 -> new Dynamic(var0, (T)var1));
   }

   public static <A> Codec.ResultFunction<A> CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(final A var0) {
      return new Codec.ResultFunction<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1, T var2, DataResult<Pair<A, T>> var3) {
            MutableObject var4 = new MutableObject();
            Optional var5 = var3.resultOrPartial(var4::setValue);
            return var5.isPresent() ? var3 : DataResult.error(() -> "(" + (String)var4.getValue() + " -> using default)", Pair.of((A)var0, (T)var2));
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1, A var2, DataResult<T> var3) {
            return var3;
         }

         @Override
         public String toString() {
            return "OrElsePartial[" + var0 + "]";
         }
      };
   }

   public static <E> Codec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ToIntFunction<E> var0, IntFunction<E> var1, int var2) {
      return Codec.INT
         .flatXmap(
            var1x -> Optional.ofNullable(var1.apply(var1x)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown element id: " + var1x)),
            var2x -> {
               int var3 = var0.applyAsInt(var2x);
               return var3 == var2 ? DataResult.error(() -> "Element with unknown id: " + var2x) : DataResult.success(var3);
            }
         );
   }

   public static <E> Codec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final Codec<E> var0, final Codec<E> var1) {
      return new Codec<E>() {
         @Override
         public <T> DataResult<T> encode(E var1x, DynamicOps<T> var2, T var3) {
            return var2.compressMaps() ? var1.encode(var1x, var2, (T)var3) : var0.encode(var1x, var2, (T)var3);
         }

         @Override
         public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1x, T var2) {
            return var1x.compressMaps() ? var1.decode(var1x, (T)var2) : var0.decode(var1x, (T)var2);
         }

         @Override
         public String toString() {
            return var0 + " orCompressed " + var1;
         }
      };
   }

   public static <E> MapCodec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final MapCodec<E> var0, final MapCodec<E> var1) {
      return new MapCodec<E>() {
         @Override
         public <T> RecordBuilder<T> encode(E var1x, DynamicOps<T> var2, RecordBuilder<T> var3) {
            return var2.compressMaps() ? var1.encode(var1x, var2, var3) : var0.encode(var1x, var2, var3);
         }

         @Override
         public <T> DataResult<E> decode(DynamicOps<T> var1x, MapLike<T> var2) {
            return var1x.compressMaps() ? var1.decode(var1x, var2) : var0.decode(var1x, var2);
         }

         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1x) {
            return var1.keys(var1x);
         }

         @Override
         public String toString() {
            return var0 + " orCompressed " + var1;
         }
      };
   }

   public static <E> Codec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Codec<E> var0, final Function<E, Lifecycle> var1, final Function<E, Lifecycle> var2) {
      return var0.mapResult(new Codec.ResultFunction<E>() {
         @Override
         public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> var1x, T var2x, DataResult<Pair<E, T>> var3) {
            return var3.result().map(var2xxx -> var3.setLifecycle((Lifecycle)var1.apply(var2xxx.getFirst()))).orElse(var3);
         }

         @Override
         public <T> DataResult<T> coApply(DynamicOps<T> var1x, E var2x, DataResult<T> var3) {
            return var3.setLifecycle((Lifecycle)var2.apply(var2x));
         }

         @Override
         public String toString() {
            return "WithLifecycle[" + var1 + " " + var2 + "]";
         }
      });
   }

   public static <E> Codec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Codec<E> var0, Function<E, Lifecycle> var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var1);
   }

   public static <K, V> CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Codec<K> var0, Codec<V> var1) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0, var1);
   }

   public static Codec<Integer> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, int var1, Function<Integer, String> var2) {
      return Codec.INT
         .validate(var3 -> var3.compareTo(var0) >= 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   public static Codec<Float> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var0, float var1, Function<Float, String> var2) {
      return Codec.FLOAT
         .validate(var3 -> var3.compareTo(var0) > 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   public static <T> Codec<List<T>> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Codec<List<T>> var0) {
      return var0.validate(var0x -> var0x.isEmpty() ? DataResult.error(() -> "List must have contents") : DataResult.success(var0x));
   }

   public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> OHHRIOHROOIHOROCIRHCHORIHRRRRI(Function<E, T> var0) {
      return var1 -> {
         Iterator var2 = var1.iterator();
         if (var2.hasNext()) {
            Object var3 = var0.apply(var2.next());

            while (var2.hasNext()) {
               Object var4 = var2.next();
               Object var5 = var0.apply(var4);
               if (var5 != var3) {
                  return DataResult.error(() -> "Mixed type list: element " + var4 + " had type " + var5 + ", but list is of type " + var3);
               }
            }
         }

         return DataResult.success(var1, Lifecycle.stable());
      };
   }

   public static <A> Codec<A> CRRRICCRROCOHHOHIICIHORCOORRRH(final Codec<A> var0) {
      return Codec.of(var0, new Decoder<A>() {
         @Override
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
            try {
               return var0.decode(var1, (T)var2);
            } catch (Exception var4) {
               return DataResult.error(() -> "Caught exception decoding " + var2 + ": " + var4.getMessage());
            }
         }
      });
   }

   public static Codec<TemporalAccessor> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(DateTimeFormatter var0) {
      Function var1 = var1x -> {
         try {
            return DataResult.success(var0.parse(var1x));
         } catch (Exception var3) {
            return DataResult.error(var3::getMessage);
         }
      };
      return Codec.STRING.comapFlatMap(var1, var0::format);
   }

   public static MapCodec<OptionalLong> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MapCodec<Optional<Long>> var0) {
      return var0.xmap(RHOHHROHRHHOOROHHIIRIIRRCIRHIC, IRIRIOIRHCHIHIOIHIIORHRHRCCCRI);
   }

   public static <K, V> Codec<Map<K, V>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Codec<Map<K, V>> var0, int var1) {
      return var0.validate(
         var1x -> var1x.size() > var1
            ? DataResult.error(() -> "Map is too long: " + var1x.size() + ", expected range [0-" + var1 + "]")
            : DataResult.success(var1x)
      );
   }

   public static <T> Codec<Object2BooleanMap<T>> RRCRRCORICCHOHHIRCHIROOHIIOHCO(Codec<T> var0) {
      return Codec.unboundedMap(var0, Codec.BOOL).xmap(Object2BooleanOpenHashMap::new, Object2ObjectOpenHashMap::new);
   }

   public static <A> Codec<Optional<A>> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(final Codec<A> var0) {
      return new Codec<Optional<A>>() {
         @Override
         public <T> DataResult<Pair<Optional<A>, T>> decode(DynamicOps<T> var1, T var2) {
            return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, (T)var2)
               ? DataResult.success(Pair.of(Optional.empty(), (T)var2))
               : var0.decode(var1, var2).map(var0xx -> (Pair<Optional<A>, T>)var0xx.mapFirst(Optional::of));
         }

         public <T> DataResult<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Optional<A> var1, DynamicOps<T> var2, T var3) {
            return var1.isEmpty() ? DataResult.success((T)var2.emptyMap()) : var0.encode(var1.get(), var2, (T)var3);
         }

         private static <T> boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(DynamicOps<T> var0x, T var1) {
            Optional var2 = var0x.getMap(var1).result();
            return var2.isPresent() && ((MapLike)var2.get()).entries().findAny().isEmpty();
         }
      };
   }

   public static DataResult<RCIROOOOICRHCCRRCIORHHIRCOIIIC> HOICCHRHOCIORIICICCOOIHRRHIIOR(String var0) {
      try {
         return DataResult.success(RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var0));
      } catch (Exception var2) {
         return DataResult.error(() -> "Not a valid resource location: " + var0 + " " + var2.getMessage());
      }
   }

   public static <T> Codec<Set<T>> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Codec<T> var0) {
      return Codec.list(var0).xmap(Sets::newHashSet, Lists::newArrayList);
   }

   public static <T> Codec<Set<T>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Codec<T> var0, int var1, int var2) {
      return Codec.list(var0, var1, var2).xmap(Sets::newHashSet, Lists::newArrayList);
   }

   public static <E extends Enum<E>> Codec<E> HIHHOCRHHRORRHHRORRRIIHHORIHOC(Supplier<E[]> var0) {
      Enum[] var1 = (Enum[])var0.get();
      if (var1.length == 0) {
         throw new IllegalArgumentException("Empty enum");
      }

      Class var2 = var1[0].getClass();
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E[])var1, Enum::name, var1x -> Enum.valueOf(var2, var1x), Enum::ordinal);
   }

   public static <E extends Enum<E>> Codec<E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      E[] var0, Function<E, String> var1, Function<String, E> var2, ToIntFunction<E> var3
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         Codec.stringResolver(var1, var2), RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var1x -> (E)(var1x >= 0 && var1x < var0.length ? var0[var1x] : null), -1)
      );
   }

   public static <N extends Number & Comparable<N>> Function<N, DataResult<N>> checkRange(N var0, N var1) {
      return var2 -> var2.compareTo(var0) >= 0 && var2.compareTo(var1) <= 0
         ? DataResult.success(var2)
         : DataResult.error(() -> "Value " + var2 + " outside of range [" + var0 + ":" + var1 + "]");
   }

   private static IntSet IHCRORHRORIICHRHRCHRRIRRHHOCOO(int... var0) {
      Object var1 = var0.length <= 4 ? new IntArraySet(var0.length) : new IntOpenHashSet(var0.length);

      for (int var5 : var0) {
         if (!var1.add(var5)) {
            throw new IllegalArgumentException("Duplicate element: " + var5);
         }
      }

      return (IntSet)var1;
   }

   private static LongSet IRCIIHHICIHRCOCRROCOICRIHHCCHH(long... var0) {
      Object var1 = var0.length <= 4 ? new LongArraySet(var0.length) : new LongOpenHashSet(var0.length);

      for (long var5 : var0) {
         if (!var1.add(var5)) {
            throw new IllegalArgumentException("Duplicate element: " + var5);
         }
      }

      return (LongSet)var1;
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final RCIROOOOICRHCCRRCIORHHIRCOIIIC CROHRHOOIHIIHIIICHHORRHORIIHOH;
      private final boolean CIRORCICHORCHORRRCROOHOCOIOOHO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, boolean var2) {
         this.CROHRHOOIHIIHIIICHHORRHORIIHOH = var1;
         this.CIRORCICHORCHORRRCROOHOCOIOOHO = var2;
      }

      @Override
      public String toString() {
         return this.RHRIHIIROIROIIROOCRHOHROHIOOHH();
      }

      public String RHRIHIIROIROIIROOCRHOHROHIOOHH() {
         return this.CIRORCICHORCHORRRCROOHOCOIOOHO ? "#" + this.CROHRHOOIHIIHIIICHHORRHORIIHOH : this.CROHRHOOIHIIHIIICHHORRHORIIHOH.toString();
      }

      public RCIROOOOICRHCCRRCIORHHIRCOIIIC OHCCRHHIIIOIHCORICROCHIOIHOIHC() {
         return this.CROHRHOOIHIIHIIICHHORRHORIIHOH;
      }

      public boolean CIICRRIHRCIRIOIIORIOCOIHCCRORI() {
         return this.CIRORCICHORCHORRRCROOHOCOIOOHO;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>() implements Codec<Map<K, V>>, BaseMapCodec<K, V> {
      private final Codec<K> RRRRRIIORHCHCRIRCCOIHRCHOROORC;
      private final Codec<V> HCHRRCIIHCCIORORICOIORRORORRRO;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Codec<K> var1, Codec<V> var2) {
         this.RRRRRIIORHCHCRIRCCOIHRCHOROORC = var1;
         this.HCHRRCIIHCCIORORICOIORRORORRRO = var2;
      }

      @Override
      public <T> DataResult<Map<K, V>> decode(DynamicOps<T> var1, MapLike<T> var2) {
         Builder var3 = ImmutableMap.builder();

         for (Pair var5 : var2.entries().toList()) {
            DataResult var6 = this.keyCodec().parse(var1, var5.getFirst());
            DataResult var7 = this.elementCodec().parse(var1, var5.getSecond());
            DataResult var8 = var6.apply2stable(Pair::of, var7);
            Optional var9 = var8.error();
            if (var9.isPresent()) {
               String var11 = ((DataResult.Error)var9.get()).message();
               return DataResult.error(() -> var6.result().isPresent() ? "Map entry '" + var6.result().get() + "' : " + var11 : var11);
            }

            if (var8.result().isEmpty()) {
               return DataResult.error(() -> "Empty or invalid map contents are not allowed");
            }

            Pair var10 = (Pair)var8.result().get();
            var3.put(var10.getFirst(), var10.getSecond());
         }

         return DataResult.success(var3.build());
      }

      @Override
      public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> var1, T var2) {
         return var1.getMap(var2)
            .setLifecycle(Lifecycle.stable())
            .flatMap(var2x -> this.decode(var1, (MapLike<Object>)var2x))
            .map(var1x -> Pair.of((Map<K, V>)var1x, (T)var2));
      }

      public <T> DataResult<T> encode(Map<K, V> var1, DynamicOps<T> var2, T var3) {
         return this.<T>encode(var1, var2, var2.mapBuilder()).build((T)var3);
      }

      @Override
      public String toString() {
         return "StrictUnboundedMapCodec[" + this.RRRRRIIORHCHCRIRCCOIHRCHOROORC + " -> " + this.HCHRRCIIHCCIORORICOIORRORORRRO + "]";
      }

      @Override
      public Codec<K> keyCodec() {
         return this.RRRRRIIORHCHCRIRCCOIHRCHOROORC;
      }

      @Override
      public Codec<V> elementCodec() {
         return this.HCHRRCIIHCCIORORICOIORRORORRRO;
      }
   }
}
