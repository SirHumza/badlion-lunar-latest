package com.moonsworth.lunar.client.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.BiFunction;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.jspecify.annotations.NonNull;

public final class OHCIIOCHHOHOHCOHHCRRHHCRHOIICC {
   public static boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, boolean var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsBoolean() : var2;
   }

   public static byte RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, byte var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsByte() : var2;
   }

   public static short RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, short var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsShort() : var2;
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, int var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsInt() : var2;
   }

   public static long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, long var2) {
      JsonElement var4 = var0.get(var1);
      return var4 != null && !var4.isJsonNull() ? var4.getAsLong() : var2;
   }

   public static float HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, float var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsFloat() : var2;
   }

   public static double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, double var2) {
      JsonElement var4 = var0.get(var1);
      return var4 != null && !var4.isJsonNull() ? var4.getAsDouble() : var2;
   }

   public static Number RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, Number var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsNumber() : var2;
   }

   public static String CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var0, String var1, String var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsString() : var2;
   }

   public static <E extends Enum<E>> E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, E var2) {
      String var3 = CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1, "");

      for (Enum var7 : (Enum[])var2.getDeclaringClass().getEnumConstants()) {
         if (var7.name().equalsIgnoreCase(var3)) {
            return (E)var7;
         }
      }

      return (E)var2;
   }

   public static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, JsonObject var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsJsonObject() : var2;
   }

   public static JsonArray RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, JsonArray var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? var3.getAsJsonArray() : var2;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, boolean var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsBoolean(), var2);
   }

   public static byte RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, byte var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsByte(), var2);
   }

   public static short RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, short var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsShort(), var2);
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, int var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsInt(), var2);
   }

   public static long RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, long var1, String... var3) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2 -> var2 == null ? var1 : var2.getAsLong(), var3);
   }

   public static float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, float var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsFloat(), var2);
   }

   public static double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, double var1, String... var3) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var2 -> var2 == null ? var1 : var2.getAsDouble(), var3);
   }

   public static Number RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, Number var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsNumber(), var2);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsString(), var2);
   }

   public static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, JsonObject var1, String... var2) {
      for (String var6 : var2) {
         JsonElement var7 = var0.get(var6);
         if (var7 == null || var7.isJsonNull()) {
            return var1;
         }

         var0 = var7.getAsJsonObject();
      }

      return var0;
   }

   public static JsonArray RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, JsonArray var1, String... var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1x -> var1x == null ? var1 : var1x.getAsJsonArray(), var2);
   }

   public static <T> @NonNull T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, Function<@Nullable JsonElement, @NonNull T> var1, String... var2) {
      int var3 = var2.length - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = var2[var4];
         JsonElement var6 = var0.get(var5);
         if (var6 == null || var6.isJsonNull()) {
            return (T)var1.apply(null);
         }

         var0 = var6.getAsJsonObject();
      }

      return (T)var1.apply(var0.get(var2[var3]));
   }

   public static boolean CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var0, String var1, boolean var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isBoolean() ? var3.getAsBoolean() : var2;
   }

   public static byte IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, byte var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var3.getAsByte() : var2;
   }

   public static short IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, short var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var3.getAsShort() : var2;
   }

   public static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, int var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var3.getAsInt() : var2;
   }

   public static long IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, long var2) {
      return var0.get(var1) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsLong() : var2;
   }

   public static float CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var0, String var1, float var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var3.getAsFloat() : var2;
   }

   public static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, double var2) {
      return var0.get(var1) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsDouble() : var2;
   }

   public static Number IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, Number var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var3.getAsNumber() : var2;
   }

   public static String RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var0, String var1, String var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isString() ? var3.getAsString() : var2;
   }

   public static JsonObject IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, JsonObject var2) {
      return var0.get(var1) instanceof JsonObject var3 ? var3 : var2;
   }

   public static JsonArray IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, JsonArray var2) {
      return var0.get(var1) instanceof JsonArray var3 ? var3 : var2;
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, boolean var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isBoolean() ? var2x.getAsBoolean() : var1, var2);
   }

   public static byte IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, byte var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isNumber() ? var2x.getAsByte() : var1, var2);
   }

   public static short IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, short var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isNumber() ? var2x.getAsShort() : var1, var2);
   }

   public static int IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, int var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isNumber() ? var2x.getAsInt() : var1, var2);
   }

   public static long IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, long var1, String... var3) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2 -> var2 instanceof JsonPrimitive var3x && var3x.isNumber() ? var3x.getAsLong() : var1, var3);
   }

   public static float IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, float var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isNumber() ? var2x.getAsFloat() : var1, var2);
   }

   public static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, double var1, String... var3) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2 -> var2 instanceof JsonPrimitive var3x && var3x.isNumber() ? var3x.getAsDouble() : var1, var3);
   }

   public static Number IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, Number var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isNumber() ? var2x.getAsNumber() : var1, var2);
   }

   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonPrimitive var2x && var2x.isString() ? var2x.getAsString() : var1, var2);
   }

   public static JsonObject IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, JsonObject var1, String... var2) {
      for (String var6 : var2) {
         if (!(var0.get(var6) instanceof JsonObject var7)) {
            return var1;
         }

         var0 = var7;
      }

      return var0;
   }

   public static JsonArray IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, JsonArray var1, String... var2) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var1x -> var1x instanceof JsonArray var2x ? var2x : var1, var2);
   }

   public static <T> @NonNull T IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, Function<@Nullable JsonElement, @NonNull T> var1, String... var2) {
      int var3 = var2.length - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = var2[var4];
         if (!(var0.get(var5) instanceof JsonObject var6)) {
            return (T)var1.apply(null);
         }

         var0 = var6;
      }

      return (T)var1.apply(var0.get(var2[var3]));
   }

   public static Optional<Boolean> IOIICIRIICICIIOORHCIIIIRRIHRHI(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isBoolean() ? Optional.of(var2.getAsBoolean()) : Optional.empty();
   }

   public static Optional<Byte> HHRIICOIOORCHCOIICOOIHIRHHICRI(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var2.getAsByte()) : Optional.empty();
   }

   public static Optional<Short> ORHIOICIOCRRHOOCOHRORIHICHRCRR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var2.getAsShort()) : Optional.empty();
   }

   public static OptionalInt RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalInt.of(var2.getAsInt()) : OptionalInt.empty();
   }

   public static OptionalLong IHCRORHRORIICHRHRCHRRIRRHHOCOO(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalLong.of(var2.getAsLong()) : OptionalLong.empty();
   }

   public static Optional<Float> ICICIOCHHHIHOCHCOHORIHRCOHHOCR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var2.getAsFloat()) : Optional.empty();
   }

   public static OptionalDouble IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalDouble.of(var2.getAsDouble()) : OptionalDouble.empty();
   }

   public static Optional<Number> RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var2.getAsNumber()) : Optional.empty();
   }

   public static Optional<String> OIHCOHRCICCCRHRCROOCIOIRRHHHIH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isString() ? Optional.of(var2.getAsString()) : Optional.empty();
   }

   public static Optional<JsonObject> ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonObject var2 ? Optional.of(var2) : Optional.empty();
   }

   public static Optional<JsonArray> IOHIHIIHCCCCCIHRORIOIOORCIOHII(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonArray var2 ? Optional.of(var2) : Optional.empty();
   }

   public static Optional<Boolean> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isBoolean() ? Optional.of(var1x.getAsBoolean()) : Optional.empty(), var1
      );
   }

   public static Optional<Byte> IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? Optional.of(var1x.getAsByte()) : Optional.empty(), var1
      );
   }

   public static Optional<Short> HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? Optional.of(var1x.getAsShort()) : Optional.empty(), var1
      );
   }

   public static OptionalInt CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0,
         OptionalInt.empty(),
         var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? OptionalInt.of(var1x.getAsInt()) : OptionalInt.empty(),
         var1
      );
   }

   public static OptionalLong RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0,
         OptionalLong.empty(),
         var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? OptionalLong.of(var1x.getAsLong()) : OptionalLong.empty(),
         var1
      );
   }

   public static Optional<Float> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? Optional.of(var1x.getAsFloat()) : Optional.empty(), var1
      );
   }

   public static OptionalDouble HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0,
         OptionalDouble.empty(),
         var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? OptionalDouble.of(var1x.getAsDouble()) : OptionalDouble.empty(),
         var1
      );
   }

   public static Optional<Number> OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isNumber() ? Optional.of(var1x.getAsNumber()) : Optional.empty(), var1
      );
   }

   public static Optional<String> CORCOCICIRIOHROHROIIOOHICCHCRR(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         var0, var0x -> var0x instanceof JsonPrimitive var1x && var1x.isString() ? Optional.of(var1x.getAsString()) : Optional.empty(), var1
      );
   }

   public static Optional<JsonObject> CRICCOOHHHCHOORCICOCOHIHOIRHOO(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var0x -> var0x instanceof JsonObject var1x ? Optional.of(var1x) : Optional.empty(), var1);
   }

   public static Optional<JsonArray> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(JsonObject var0, String... var1) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var0x -> var0x instanceof JsonArray var1x ? Optional.of(var1x) : Optional.empty(), var1);
   }

   public static <T> Optional<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, Function<JsonElement, Optional<T>> var1, String... var2) {
      int var3 = var2.length - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = var2[var4];
         if (!(var0.get(var5) instanceof JsonObject var6)) {
            return Optional.empty();
         }

         var0 = var6;
      }

      return (Optional<T>)var1.apply(var0.get(var2[var3]));
   }

   private static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, T var1, Function<JsonElement, T> var2, String... var3) {
      int var4 = var3.length - 1;

      for (int var5 = 0; var5 < var4; var5++) {
         String var6 = var3[var5];
         if (!(var0.get(var6) instanceof JsonObject var7)) {
            return (T)var1;
         }

         var0 = var7;
      }

      return (T)var2.apply(var0.get(var3[var4]));
   }

   public static JsonElement RCIROOOOICRHCCRRCIORHHIRCOIIIC(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      if (var2 == null) {
         throw new JSONException("Failed to find key \"" + var1 + "\" in: \"" + var0 + "\"");
      } else {
         return var2;
      }
   }

   public static boolean OOCCRCRCOHIIORCCORCRCIRRROIOOR(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isBoolean()) {
         return var3.getAsBoolean();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static byte OHIIIOHIRIRCCRRIOIICCHHIORRHOH(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsByte();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static short IHICORCROOROHCIHIHCOIHRRHICICO(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsShort();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static int HCHRIROHHHCORIOCROOCHRCIOROOCI(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsInt();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static long CCIHHRIOOOOCOHRCIHOHROOICIORCC(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsLong();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static float CRHROHHHCIHHCOHCOORCRIHHIICROR(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsFloat();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static double RORCHCIIICOHIRROOORHOCCCCIOCCI(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsDouble();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static String IOHHOIIOCRHCHHCRORICCOHOHROOIH(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonPrimitive var3 && var3.isString()) {
         return var3.getAsString();
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static JsonObject IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonObject var3) {
         return var3;
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static JsonArray RHCHRCOCCOIIIHCHRHIRCORHRHRICR(JsonObject var0, String var1) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonArray var3) {
         return var3;
      } else {
         throw new JSONException("Key \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static JsonElement IIHRRHORCRCROCHHOHORCHCROCIHRO(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::RCIROOOOICRHCCRRCIORHHIRCOIIIC, var1);
   }

   public static boolean OCOHORHCROHICRRIHCIHHRRCIHICRI(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::OOCCRCRCOHIIORCCORCRCIRRROIOOR, var1);
   }

   public static byte CIOHHCORHRCCRICCCORIHCRHCCCRRR(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::OHIIIOHIRIRCCRRIOIICCHHIORRHOH, var1);
   }

   public static short IHHCHHHCRIHOOCOIOOCRIIICIOROIR(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::IHICORCROOROHCIHIHCOIHRRHICICO, var1);
   }

   public static int IIRHCHHOICHRICOOCRORCCIOOIHOIR(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::HCHRIROHHHCORIOCROOCHRCIOROOCI, var1);
   }

   public static long OHHRIOHROOIHOROCIRHCHORIHRRRRI(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::CCIHHRIOOOOCOHRCIHOHROOICIORCC, var1);
   }

   public static float RHOCHHIRRCHHHOHOIRROIROHHHIHIO(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::CRHROHHHCIHHCOHCOORCRIHHIICROR, var1);
   }

   public static double IRRCCOICORICIHCHRHIHIHROIRHOCR(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::RORCHCIIICOHIRROOORHOCCCCIOCCI, var1);
   }

   public static String RICRIRRCOHRCOCRRHHCRHRROOIOHHR(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::IOHHOIIOCRHCHHCRORICCOHOHROOIH, var1);
   }

   public static JsonObject HICRRICCHCCROOHHCHOCOCCHOIHHOC(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::IIHRHCCOOHOOOOCHRRCOROOIOHCOOO, var1);
   }

   public static JsonArray RIROICHCRROROHCCROOCCCCOCHCCRI(JsonObject var0, String... var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC::RHCHRCOCCOIIIHCHRHIRCORHRHRICR, var1);
   }

   public static <T> @NonNull T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, BiFunction<JsonObject, String, @NonNull T> var1, String... var2) {
      int var3 = var2.length - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         String var5 = var2[var4];
         var0 = IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var0, var5);
      }

      return (T)var1.apply(var0, var2[var3]);
   }

   public static <T> T[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, Function<JsonElement, T> var1) {
      List var2 = var0.asList();
      Object[] var3 = new Object[var2.size()];

      for (int var4 = 0; var4 < var2.size(); var4++) {
         var3[var4] = var1.apply((JsonElement)var2.get(var4));
      }

      return (T[])var3;
   }

   public static <T> T[] RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, Function<JsonElement, T> var2) {
      return (T[])(var0.get(var1) instanceof JsonArray var3 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2) : new Object[0]);
   }

   public static <T> T[] IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, Function<JsonElement, T> var2) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonArray var3) {
         return (T[])RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
      } else {
         throw new JSONException("Key \"" + var1 + "\" isn't a array in: \"" + var0 + "\"");
      }
   }

   public static <T> List<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, Function<JsonElement, @Nullable T> var2) {
      if (var0.get(var1) instanceof JsonArray var3) {
         List var9 = var3.asList();
         ArrayList var5 = new ArrayList(var9.size());

         for (JsonElement var7 : var9) {
            Object var8 = var2.apply(var7);
            if (var8 != null) {
               var5.add(var8);
            }
         }

         return var5;
      } else {
         return List.of();
      }
   }

   public static <T> List<T> CRRRICCRROCOHHOHIICIHORCOORRRH(JsonObject var0, String var1, Function<JsonElement, @Nullable T> var2) {
      if (RCIROOOOICRHCCRRCIORHHIRCOIIIC(var0, var1) instanceof JsonArray var3) {
         List var9 = var3.asList();
         ArrayList var5 = new ArrayList(var9.size());

         for (JsonElement var7 : var9) {
            Object var8 = var2.apply(var7);
            if (var8 != null) {
               var5.add(var8);
            }
         }

         return var5;
      } else {
         throw new JSONException("Key \"" + var1 + "\" isn't a list in: \"" + var0 + "\"");
      }
   }

   public static Optional<JsonElement> RCCCROCHCICCROHCOCCRRROCIIHCCH(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && !var2.isJsonNull() ? Optional.of(var2) : Optional.empty();
   }

   public static <T> Optional<T> RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var0, String var1, Function<JsonElement, T> var2) {
      JsonElement var3 = var0.get(var1);
      return var3 != null && !var3.isJsonNull() ? Optional.of((T)var2.apply(var3)) : Optional.empty();
   }

   public static JsonElement OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      if (var2 == null) {
         throw new JSONException("Failed to find key \"" + var1 + "\" in: \"" + var0 + "\"");
      } else if (var2.isJsonNull()) {
         throw new JSONException("Key \"" + var1 + "\" is null in: \"" + var0 + "\"");
      } else {
         return var2;
      }
   }

   public static <T> T RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonObject var0, String var1, Function<JsonElement, T> var2) {
      return (T)var2.apply(OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0, var1));
   }

   @Nullable
   public static JsonElement RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && !var2.isJsonNull() ? var2 : null;
   }

   @Nullable
   public static <T> T HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonObject var0, String var1, Function<@NotNull JsonElement, T> var2) {
      JsonElement var3 = var0.get(var1);
      return (T)(var3 != null && !var3.isJsonNull() ? var2.apply(var3) : null);
   }

   public static boolean IIOIROIHIHHCCRICRCOOCHIICHRCOI(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && !var2.isJsonNull();
   }

   public static boolean RHOORRIIOCHIRRHOHOOHIROHCRICRO(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      if (var2 != null && var2.isJsonNull()) {
         var0.remove(var1);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   public static JsonElement CCHHCIRHICHHHHRRIHIORCCORCCIHR(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && !var2.isJsonNull() ? var0.remove(var1) : null;
   }

   @Nullable
   public static <T> T OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonObject var0, String var1, Function<@NotNull JsonElement, T> var2) {
      JsonElement var3 = var0.get(var1);
      return (T)(var3 != null && !var3.isJsonNull() ? var2.apply(var0.remove(var1)) : null);
   }

   public static Optional<Boolean> COIHORRCHRRCHOCIRHHRRIOIHRIHCC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isBoolean() ? Optional.of(var0.remove(var1).getAsBoolean()) : Optional.empty();
   }

   public static Optional<Byte> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var0.remove(var1).getAsByte()) : Optional.empty();
   }

   public static Optional<Short> IOIOHIORIROHRRCOOOHCROHORCOIIH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var0.remove(var1).getAsShort()) : Optional.empty();
   }

   public static OptionalInt IIOCHOIICCIORCOROIROHICCHIOHIC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalInt.of(var0.remove(var1).getAsInt()) : OptionalInt.empty();
   }

   public static OptionalLong RICRIHOOHROHICCHHIIHRHCORHIOHR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalLong.of(var0.remove(var1).getAsLong()) : OptionalLong.empty();
   }

   public static Optional<Float> RIIHIHHCRHCHRCICHOROHCHIIHCICH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var0.remove(var1).getAsFloat()) : Optional.empty();
   }

   public static OptionalDouble IHIIIRHOOCHRCCCCIORIROCOIRRHCC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? OptionalDouble.of(var0.remove(var1).getAsDouble()) : OptionalDouble.empty();
   }

   public static Optional<Number> HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? Optional.of(var0.remove(var1).getAsNumber()) : Optional.empty();
   }

   public static Optional<String> HRRHRCCOOIOIIIRORIOOORORHOORIH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isString() ? Optional.of(var0.remove(var1).getAsString()) : Optional.empty();
   }

   public static Optional<JsonObject> OHRRHHOCROROCCIRROIHOCCHCIHCIR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonObject ? Optional.of(var0.remove(var1).getAsJsonObject()) : Optional.empty();
   }

   public static Optional<JsonArray> RCOCRROHHROHHOCRCCCHCIROIIOORC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonArray ? Optional.of(var0.remove(var1).getAsJsonArray()) : Optional.empty();
   }

   @Nullable
   public static Boolean ORCOCORROHIROCCIORORRRRCHIOOCH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isBoolean() ? var0.remove(var1).getAsBoolean() : null;
   }

   @Nullable
   public static Byte HOIHOROOIOOCOIHCRIRIRIRRICIIHC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsByte() : null;
   }

   @Nullable
   public static Short OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsShort() : null;
   }

   @Nullable
   public static Integer RRORCOIRRIICOOICOIOCORHORCHCOC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsInt() : null;
   }

   @Nullable
   public static Long RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsLong() : null;
   }

   @Nullable
   public static Float RRHOOOORORHHOOIHRCCHIIHHIIIIOH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsFloat() : null;
   }

   @Nullable
   public static Double HIHHOCRHHRORRHHRORRRIIHHORIHOC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsDouble() : null;
   }

   @Nullable
   public static Number OOCHRIIIRIHRRCRIORHCROIIHCRRIC(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isNumber() ? var0.remove(var1).getAsNumber() : null;
   }

   @Nullable
   public static String OCIROOIHIHRHOCCHIIIROOCRIIOCRR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonPrimitive var2 && var2.isString() ? var0.remove(var1).getAsString() : null;
   }

   @Nullable
   public static JsonObject HRCOCHHHCCIORCORCHIOOOCCCCHICH(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonObject ? var0.remove(var1).getAsJsonObject() : null;
   }

   @Nullable
   public static JsonArray IIHHICHCCCOHCHROIRIHICCHHOROCR(JsonObject var0, String var1) {
      return var0.get(var1) instanceof JsonArray ? var0.remove(var1).getAsJsonArray() : null;
   }

   public static boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var0, String var1, boolean var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isBoolean() ? var0.remove(var1).getAsBoolean() : var2;
   }

   public static byte HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, byte var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var0.remove(var1).getAsByte() : var2;
   }

   public static short HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, short var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var0.remove(var1).getAsShort() : var2;
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, int var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var0.remove(var1).getAsInt() : var2;
   }

   public static long HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, long var2) {
      return var0.get(var1) instanceof JsonPrimitive var4 && var4.isNumber() ? var0.remove(var1).getAsLong() : var2;
   }

   public static float RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonObject var0, String var1, float var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var0.remove(var1).getAsFloat() : var2;
   }

   public static double HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, double var2) {
      return var0.get(var1) instanceof JsonPrimitive var4 && var4.isNumber() ? var0.remove(var1).getAsDouble() : var2;
   }

   public static Number HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, Number var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isNumber() ? var0.remove(var1).getAsNumber() : var2;
   }

   @NotNull
   public static String RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonObject var0, String var1, @NotNull String var2) {
      return var0.get(var1) instanceof JsonPrimitive var3 && var3.isString() ? var0.remove(var1).getAsString() : var2;
   }

   @NotNull
   public static JsonObject HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, @NotNull JsonObject var2) {
      return var0.get(var1) instanceof JsonObject ? var0.remove(var1).getAsJsonObject() : var2;
   }

   @NotNull
   public static JsonArray HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var0, String var1, @NotNull JsonArray var2) {
      return var0.get(var1) instanceof JsonArray ? var0.remove(var1).getAsJsonArray() : var2;
   }

   public static boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonObject var0, String var1, String var2) {
      if (!var1.equals(var2)) {
         JsonElement var3 = var0.get(var1);
         if (var3 != null && !var3.isJsonNull()) {
            var0.remove(var1);
            var0.add(var2, var3);
            return true;
         }
      }

      return false;
   }

   public static JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, JsonElement var2) {
      JsonElement var3 = var0.get(var1);
      return var3 == null ? var2 : var3;
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, boolean var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isBoolean() ? var4.getAsBoolean() : var2;
   }

   public static byte RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, byte var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsByte() : var2;
   }

   public static short RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, short var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsShort() : var2;
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, int var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsInt() : var2;
   }

   public static float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, float var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isNumber() ? var4.getAsFloat() : var2;
   }

   public static double RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, double var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var5 && var5.isNumber() ? var5.getAsDouble() : var2;
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, String var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonPrimitive var4 && var4.isString() ? var4.getAsString() : var2;
   }

   public static JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, JsonObject var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonObject var4 ? var4 : var2;
   }

   public static JsonArray RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1, JsonArray var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, (JsonElement)null) instanceof JsonArray var4 ? var4 : var2;
   }

   public static JsonElement RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonArray var0, int var1) {
      JsonElement var2 = var0.get(var1);
      if (var2 == null) {
         throw new JSONException("Failed to find index \"" + var1 + "\" in: \"" + var0 + "\"");
      } else {
         return var2;
      }
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isBoolean()) {
         return var3.getAsBoolean();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static byte HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsByte();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static short CRRRICCRROCOHHOHIICIHORCOORRRH(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsShort();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static int RRCRRCORICCHOHHIRCHIROOHIIOHCO(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsInt();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static float RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsFloat();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static double HRCHROOHRIHCRCRHRIIROCIRHOIRHH(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isNumber()) {
         return var3.getAsDouble();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static String OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonPrimitive var3 && var3.isString()) {
         return var3.getAsString();
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static JsonObject CORCOCICIRIOHROHROIIOOHICCHCRR(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonObject var3) {
         return var3;
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   public static JsonArray CRICCOOHHHCHOORCICOCOHIHOIRHOO(JsonArray var0, int var1) {
      if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1) instanceof JsonArray var3) {
         return var3;
      } else {
         throw new JSONException("Index \"" + var1 + "\" was the wrong type in: \"" + var0 + "\"");
      }
   }

   @Generated
   private OHCIIOCHHOHOHCOHHCRRHHCRHOIICC() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
