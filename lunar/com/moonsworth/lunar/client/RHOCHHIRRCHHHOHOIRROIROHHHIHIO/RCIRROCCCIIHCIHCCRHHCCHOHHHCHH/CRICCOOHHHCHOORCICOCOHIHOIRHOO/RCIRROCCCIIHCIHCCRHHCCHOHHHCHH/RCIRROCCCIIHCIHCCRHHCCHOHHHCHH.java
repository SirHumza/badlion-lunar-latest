package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.eliotlash.molang.ParseException;
import com.eliotlash.molang.ast.Evaluatable;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import org.json.JSONException;
import software.bernie.geckolib3.core.builder.Animation;
import software.bernie.geckolib3.core.keyframe.BoneAnimation;
import software.bernie.geckolib3.core.keyframe.EventKeyFrame;
import software.bernie.geckolib3.core.keyframe.ParticleEventKeyFrame;
import software.bernie.geckolib3.core.keyframe.VectorKeyFrameList;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static Set<Entry<String, JsonElement>> RHCHRCOCCOIIIHCHRHIRCORHRHRICR(JsonObject var0) {
      return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var0.getAsJsonObject("animations"));
   }

   public static List<Entry<String, JsonElement>> RCCCROCHCICCROHCOCCRRROCIIHCCH(JsonObject var0) {
      JsonObject var1 = var0.getAsJsonObject("bones");
      return var1 == null ? new ArrayList<>() : new ArrayList<>(OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1));
   }

   public static Set<Entry<String, JsonElement>> OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(JsonObject var0) {
      if (!var0.has("rotation")) {
         return ImmutableSet.of();
      } else {
         JsonElement var1 = var0.get("rotation");
         if (var1.isJsonArray()) {
            return ImmutableSet.of(new SimpleEntry<>("0", var1.getAsJsonArray()));
         } else if (var1.isJsonPrimitive()) {
            JsonPrimitive var2 = var1.getAsJsonPrimitive();
            Gson var3 = new Gson();
            JsonElement var4 = var3.toJsonTree(Arrays.asList(var2, var2, var2));
            return ImmutableSet.of(new SimpleEntry<>("0", var4));
         } else {
            return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1.getAsJsonObject());
         }
      }
   }

   public static Set<Entry<String, JsonElement>> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(JsonObject var0) {
      if (!var0.has("position")) {
         return ImmutableSet.of();
      } else {
         JsonElement var1 = var0.get("position");
         if (var1.isJsonArray()) {
            return ImmutableSet.of(new SimpleEntry<>("0", var1.getAsJsonArray()));
         } else if (var1.isJsonPrimitive()) {
            JsonPrimitive var2 = var1.getAsJsonPrimitive();
            Gson var3 = new Gson();
            JsonElement var4 = var3.toJsonTree(Arrays.asList(var2, var2, var2));
            return ImmutableSet.of(new SimpleEntry<>("0", var4));
         } else {
            return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1.getAsJsonObject());
         }
      }
   }

   public static Set<Entry<String, JsonElement>> IIOIROIHIHHCCRICRCOOCHIICHRCOI(JsonObject var0) {
      if (!var0.has("scale")) {
         return ImmutableSet.of();
      } else {
         JsonElement var1 = var0.get("scale");
         if (var1.isJsonArray()) {
            return ImmutableSet.of(new SimpleEntry<>("0", var1.getAsJsonArray()));
         } else if (var1.isJsonPrimitive()) {
            JsonPrimitive var2 = var1.getAsJsonPrimitive();
            Gson var3 = new Gson();
            JsonElement var4 = var3.toJsonTree(Arrays.asList(var2, var2, var2));
            return ImmutableSet.of(new SimpleEntry<>("0", var4));
         } else {
            return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1.getAsJsonObject());
         }
      }
   }

   public static ArrayList<Entry<String, JsonElement>> RHOORRIIOCHIRRHOHOOHIROHCRICRO(JsonObject var0) {
      JsonObject var1 = var0.getAsJsonObject("sound_effects");
      return var1 == null ? new ArrayList<>() : new ArrayList<>(OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1));
   }

   public static ArrayList<Entry<String, JsonElement>> CCHHCIRHICHHHHRRIHIORCCORCCIHR(JsonObject var0) {
      JsonObject var1 = var0.getAsJsonObject("particle_effects");
      return var1 == null ? new ArrayList<>() : new ArrayList<>(OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1));
   }

   public static ArrayList<Entry<String, JsonElement>> COIHORRCHRRCHOCIRHHRRIOIHRIHCC(JsonObject var0) {
      JsonObject var1 = var0.getAsJsonObject("timeline");
      return var1 == null ? new ArrayList<>() : new ArrayList<>(OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(var1));
   }

   private static JsonElement HHCCIRHCCCIIRHCROHIORHIRHHIORH(Set<Entry<String, JsonElement>> var0, String var1) {
      return (JsonElement)var0.stream()
         .filter(var1x -> ((String)var1x.getKey()).equals(var1))
         .findFirst()
         .orElseThrow(() -> new JSONException("Could not find key: " + var1))
         .getValue();
   }

   public static Entry<String, JsonElement> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(JsonObject var0, String var1) {
      return new SimpleEntry<>(var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH(RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var0), var1));
   }

   public static Set<Entry<String, JsonElement>> OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(JsonObject var0) {
      return var0.entrySet();
   }

   public static Animation RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Entry<String, JsonElement> var0, RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      Animation var2 = new Animation();
      JsonObject var3 = ((JsonElement)var0.getValue()).getAsJsonObject();
      var2.animationName = (String)var0.getKey();
      JsonElement var4 = var3.get("animation_length");
      var2.animationLength = var4 == null
         ? null
         : com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(
            var4.getAsDouble()
         );
      var2.boneAnimations = new com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      JsonElement var5 = var3.get("loop");
      var2.loop = var5 != null && var5.getAsBoolean();
      ArrayList var6 = RHOORRIIOCHIRRHOHOOHIROHCRICRO(var3);
      if (var6 != null) {
         for (Entry var8 : var6) {
            var2.soundKeyFrames
               .add(
                  new EventKeyFrame(
                     Double.parseDouble((String)var8.getKey()) * 20.0, ((JsonElement)var8.getValue()).getAsJsonObject().get("effect").getAsString()
                  )
               );
         }
      }

      ArrayList var22 = CCHHCIRHICHHHHRRIHIORCCORCCIHR(var3);
      if (var22 != null) {
         for (Entry var9 : var22) {
            JsonObject var10 = ((JsonElement)var9.getValue()).getAsJsonObject();
            JsonElement var11 = var10.get("effect");
            JsonElement var12 = var10.get("locator");
            JsonElement var13 = var10.get("pre_effect_script");
            var2.particleKeyFrames
               .add(
                  new ParticleEventKeyFrame(
                     Double.parseDouble((String)var9.getKey()) * 20.0,
                     var11 == null ? "" : var11.getAsString(),
                     var12 == null ? "" : var12.getAsString(),
                     var13 == null ? "" : var13.getAsString()
                  )
               );
         }
      }

      ArrayList var24 = COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var3);
      if (var24 != null) {
         for (Entry var27 : var24) {
            var2.customInstructionKeyframes
               .add(
                  new EventKeyFrame(
                     Double.parseDouble((String)var27.getKey()) * 20.0,
                     IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR((JsonElement)var27.getValue())
                  )
               );
         }
      }

      boolean var26 = false;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RCRIHICIRICIOIRHHICCICRHCIOOIR()
         .HHOCHIICIORCICOCROOORHOOOIHRHC()) {
         var26 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RCRIHICIRICIOIRHHICCICRHCIOOIR()
            .OHRHIIIOCRORCRHCOHHIRIORHCORRH
            .get();
      }

      for (Entry var30 : RCCCROCHCICCROHCOCCRRROCIIHCCH(var3)) {
         BoneAnimation var31 = new BoneAnimation();
         var31.boneName = (String)var30.getKey();
         JsonObject var14 = ((JsonElement)var30.getValue()).getAsJsonObject();

         try {
            Set var15 = IIOIROIHIHHCCRICRCOOCHIICHRCOI(var14);
            var31.scaleKeyFrames = IRCIIHHICIHRCOCRROCOICRIHHCCHH.IORRORCRRHRRORHIRHRROHCRRIHRII(new ArrayList<>(var15));
         } catch (ParseException var20) {
            if (var26) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Invalid molang in file %s at scale keyframe: %s", var1.toString(), var14.get("rotation").toString()
               );
               var20.printStackTrace();
            }

            var31.scaleKeyFrames = new VectorKeyFrameList();
         } catch (Exception var21) {
            var31.scaleKeyFrames = new VectorKeyFrameList();
         }

         try {
            Set var32 = RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(var14);
            var31.positionKeyFrames = IRCIIHHICIHRCOCRROCOICRIHHCCHH.IORRORCRRHRRORHIRHRROHCRRIHRII(new ArrayList<>(var32));
         } catch (ParseException var18) {
            if (var26) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Invalid molang in file %s at position keyframe: %s", var1.toString(), var14.get("rotation").toString()
               );
               var18.printStackTrace();
            }

            var31.positionKeyFrames = new VectorKeyFrameList();
         } catch (Exception var19) {
            var31.positionKeyFrames = new VectorKeyFrameList();
         }

         try {
            Set var33 = OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var14);
            var31.rotationKeyFrames = IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIICIRRCOOCIHRHOIOIOOROCRHCHIC(new ArrayList<>(var33));
         } catch (ParseException var16) {
            if (var26) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "Invalid molang in file %s at rotation keyframe: %s", var1.toString(), var14.get("rotation").toString()
               );
               var16.printStackTrace();
            }

            var31.rotationKeyFrames = new VectorKeyFrameList();
         } catch (Exception var17) {
            var31.rotationKeyFrames = new VectorKeyFrameList();
         }

         var2.boneAnimations.put(var31.boneName, var31);
      }

      if (var2.animationLength == null) {
         var2.animationLength = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2.boneAnimations.values());
      }

      return var2;
   }

   private static double RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Collection<BoneAnimation> var0) {
      double var1 = 0.0;

      for (BoneAnimation var4 : var0) {
         double var5 = var4.rotationKeyFrames.getLastKeyframeTime();
         double var7 = var4.positionKeyFrames.getLastKeyframeTime();
         double var9 = var4.scaleKeyFrames.getLastKeyframeTime();
         var1 = RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1, var5, var7, var9);
      }

      return var1 == 0.0 ? Double.MAX_VALUE : var1;
   }

   static List<Evaluatable> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonArray var0) {
      return new Gson().fromJson(var0, ArrayList.class);
   }

   public static double RHOCHHIRRCHHHOHOIRROIROHHHIHIO(double... var0) {
      double var1 = 0.0;

      for (double var6 : var0) {
         var1 = Math.max(var6, var1);
      }

      return var1;
   }
}
