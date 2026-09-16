package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IHIRRIIORRHORHRORIHOROIRCORCOO
   extends com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements Serializable {
   private static final Logger HOHHRHCIOCRCHCOOOHORROICORCCCC = Logger.getLogger(IHIRRIIORRHORHRORIHOROIRCORCOO.class.getName());
   public static final Map<String, Class<?>> RICIORHICRROHOCHRRCRIHCROOCIIC = new HashMap<>();

   public IHIRRIIORRHORHRORIHOROIRCORCOO() {
      super("oneOf", Boolean.FALSE);
   }

   public IHIRRIIORRHORHRORIHOROIRCORCOO(Object var1) {
      super("oneOf", Boolean.FALSE);
      this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
   }

   @Override
   public Map<String, Class<?>> OCIROOIHIHRHOCCHIIIROOCRIIOCRR() {
      return RICIORHICRROHOCHRRCRIHCROOCIIC;
   }

   @Override
   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object var1) {
      if (var1 instanceof ORHIOICIOCRRHOOCOHRORIHICHRCRR) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof IHCRORHRORIICHRHRCHRRIRRHHOCOO) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else if (var1 instanceof RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO) {
         super.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      } else {
         throw new RuntimeException("Invalid instance type. Must be GameRewindLayerAudio, GameRewindLayerEffect, GameRewindLayerGameplay");
      }
   }

   @Override
   public Object HRCOCHHHCCIORCORCHIOOOCCCCHICH() {
      return super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR CIROHHHIOIHIROHCHICORCCCRROHCC() {
      return (ORHIOICIOCRRHOOCOHRORIHICHRCRR)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public IHCRORHRORIICHRHRCHRRIRRHHOCOO IOROHHOIORHORCOHRHCCHCRHOCHCCI() {
      return (IHCRORHRORIICHRHRCHRRIRRHHOCOO)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO ROIOROHRIHRRHIHRRRIHHHIICCHIOI() {
      return (RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)super.HRCOCHHHCCIORCORCHIOOOCCCCHICH();
   }

   public static void validateJsonElement(JsonElement var0) {
      int var1 = 0;
      ArrayList var2 = new ArrayList();

      try {
         ORHIOICIOCRRHOOCOHRORIHICHRCRR.validateJsonElement(var0);
         var1++;
      } catch (Exception var6) {
         var2.add(String.format("Deserialization for GameRewindLayerAudio failed with `%s`.", var6.getMessage()));
      }

      try {
         IHCRORHRORIICHRHRCHRRIRRHHOCOO.validateJsonElement(var0);
         var1++;
      } catch (Exception var5) {
         var2.add(String.format("Deserialization for GameRewindLayerGameplay failed with `%s`.", var5.getMessage()));
      }

      try {
         RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.validateJsonElement(var0);
         var1++;
      } catch (Exception var4) {
         var2.add(String.format("Deserialization for GameRewindLayerEffect failed with `%s`.", var4.getMessage()));
      }

      if (var1 != 1) {
         throw new IOException(
            String.format(
               "The JSON string is invalid for GameRewindLayer with oneOf schemas: GameRewindLayerAudio, GameRewindLayerEffect, GameRewindLayerGameplay. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
               var1,
               var2,
               var0.toString()
            )
         );
      }
   }

   public static IHIRRIIORRHORHRORIHOROIRCORCOO RROIIRROOOOHIORHRICHOCHIHCRRCH(String var0) {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .fromJson(var0, IHIRRIIORRHORHRORIHOROIRCORCOO.class);
   }

   public String IOHOOIOHCHICOCHIICHCICCOHRCIII() {
      return com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCOCRROHHROHHOCRCCCHCIROIIOORC()
         .toJson(this);
   }

   static {
      RICIORHICRROHOCHRRCRIHCROOCIIC.put("GameRewindLayerAudio", ORHIOICIOCRRHOOCOHRORIHICHRCRR.class);
      RICIORHICRROHOCHRRCRIHCROOCIIC.put("GameRewindLayerGameplay", IHCRORHRORIICHRHRCHRRIRRHHOCOO.class);
      RICIORHICRROHOCHRRCRIHCROOCIIC.put("GameRewindLayerEffect", RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.class);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements TypeAdapterFactory {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         if (!IHIRRIIORRHORHRORIHOROIRCORCOO.class.isAssignableFrom(var2.getRawType())) {
            return null;
         }

         final TypeAdapter var3 = var1.getAdapter(JsonElement.class);
         final TypeAdapter var4 = var1.getDelegateAdapter(this, TypeToken.get(ORHIOICIOCRRHOOCOHRORIHICHRCRR.class));
         final TypeAdapter var5 = var1.getDelegateAdapter(this, TypeToken.get(IHCRORHRORIICHRHRCHRRIRRHHOCOO.class));
         final TypeAdapter var6 = var1.getDelegateAdapter(this, TypeToken.get(RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.class));
         return (TypeAdapter<T>)(new TypeAdapter<IHIRRIIORRHORHRORIHOROIRCORCOO>() {
               public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, IHIRRIIORRHORHRORIHOROIRCORCOO var2x) {
                  if (var2x == null || var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() == null) {
                     var3.write(var1, null);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof ORHIOICIOCRRHOOCOHRORIHICHRCRR) {
                     JsonElement var5x = var4.toJsonTree((ORHIOICIOCRRHOOCOHRORIHICHRCRR)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var5x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof IHCRORHRORIICHRHRCHRRIRRHHOCOO) {
                     JsonElement var4x = var5.toJsonTree((IHCRORHRORIICHRHRCHRRIRRHHOCOO)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var4x);
                  } else if (var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH() instanceof RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO) {
                     JsonElement var3x = var6.toJsonTree((RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)var2x.HRCOCHHHCCIORCORCHIOOOCCCCHICH());
                     var3.write(var1, var3x);
                  } else {
                     throw new IOException(
                        "Failed to serialize as the type doesn't match oneOf schemas: GameRewindLayerAudio, GameRewindLayerEffect, GameRewindLayerGameplay"
                     );
                  }
               }

               public IHIRRIIORRHORHRORIHOROIRCORCOO IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(JsonReader var1) {
                  Object var2x = null;
                  JsonElement var3x = (JsonElement)var3.read(var1);
                  int var4x = 0;
                  ArrayList var5x = new ArrayList();
                  TypeAdapter var6x = var3;

                  try {
                     ORHIOICIOCRRHOOCOHRORIHICHRCRR.validateJsonElement(var3x);
                     var6x = var4;
                     var4x++;
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC.log(Level.FINER, "Input data matches schema 'GameRewindLayerAudio'");
                  } catch (Exception var10) {
                     var5x.add(String.format("Deserialization for GameRewindLayerAudio failed with `%s`.", var10.getMessage()));
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC
                        .log(Level.FINER, "Input data does not match schema 'GameRewindLayerAudio'", var10);
                  }

                  try {
                     IHCRORHRORIICHRHRCHRRIRRHHOCOO.validateJsonElement(var3x);
                     var6x = var5;
                     var4x++;
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC.log(Level.FINER, "Input data matches schema 'GameRewindLayerGameplay'");
                  } catch (Exception var9) {
                     var5x.add(String.format("Deserialization for GameRewindLayerGameplay failed with `%s`.", var9.getMessage()));
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC
                        .log(Level.FINER, "Input data does not match schema 'GameRewindLayerGameplay'", var9);
                  }

                  try {
                     RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.validateJsonElement(var3x);
                     var6x = var6;
                     var4x++;
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC.log(Level.FINER, "Input data matches schema 'GameRewindLayerEffect'");
                  } catch (Exception var8) {
                     var5x.add(String.format("Deserialization for GameRewindLayerEffect failed with `%s`.", var8.getMessage()));
                     IHIRRIIORRHORHRORIHOROIRCORCOO.HOHHRHCIOCRCHCOOOHORROICORCCCC
                        .log(Level.FINER, "Input data does not match schema 'GameRewindLayerEffect'", var8);
                  }

                  if (var4x == 1) {
                     IHIRRIIORRHORHRORIHOROIRCORCOO var7 = new IHIRRIIORRHORHRORIHOROIRCORCOO();
                     var7.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var6x.fromJsonTree(var3x));
                     return var7;
                  } else {
                     throw new IOException(
                        String.format(
                           "Failed deserialization for GameRewindLayer: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
                           var4x,
                           var5x,
                           var3x.toString()
                        )
                     );
                  }
               }
            })
            .nullSafe();
      }
   }
}
