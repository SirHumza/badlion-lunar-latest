package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.TupleIntJsonSerializable;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StatisticsManager.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public Map field_150875_a$v1_7;
   @Final
   @Shadow
   public Map<StatBase, TupleIntJsonSerializable> statsData$v1_8;
   @Unique
   private static final int CONVERSION_CACHE_SIZE = 30;
   @Unique
   private static final Object2ObjectLinkedOpenHashMap<String, String> lunar$quickConversionCache = new Object2ObjectLinkedOpenHashMap<String, String>(
      30, 0.25F
   ) {
      protected void rehash(int var1) {
      }
   };
   @Unique
   private static final List<String> IGNORED_STATS = List.of("stat.playOneMinute", "stat.timeSinceDeath");
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private static final Map<String, String> FULL_CONVERSIONS = Map.copyOf(new HashMap<String, String>() {
      {
         this.put("cakeSlicesEaten", "eat_cake_slice");
         this.put("cauldronFilled", "fill_cauldron");
         this.put("cauldronUsed", "use_cauldron");
         this.put("armorCleaned", "clean_armor");
         this.put("bannerCleaned", "clean_banner");
         this.put("brewingstandInteraction", "interact_with_brewingstand");
         this.put("beaconInteraction", "interact_with_beacon");
         this.put("dropperInspected", "inspect_dropper");
         this.put("hopperInspected", "inspect_hopper");
         this.put("dispenserInspected", "inspect_dispenser");
         this.put("noteblockPlayed", "play_noteblock");
         this.put("noteblockTuned", "tune_noteblock");
         this.put("flowerPotted", "pot_flower");
         this.put("trappedChestTriggered", "trigger_trapped_chest");
         this.put("enderchestOpened", "open_enderchest");
         this.put("itemEnchanted", "enchant_item");
         this.put("recordPlayed", "play_record");
         this.put("furnaceInteraction", "interact_with_furnace");
         this.put("craftingTableInteraction", "interact_with_crafting_table");
         this.put("chestOpened", "open_chest");
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.put("shulkerBoxOpened", "open_shulker_box");
         }
      }
   });
   @Unique
   private static final Map<String, String> CONVERT_TYPES = Map.copyOf(new HashMap<String, String>() {
      {
         this.put("mineBlock", "mined");
         this.put("useItem", "used");
         this.put("killEntity", "killed");
         this.put("craftItem", "crafted");
         this.put("breakItem", "broken");
         this.put("entityKilledBy", "killed_by");
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            this.put("drop", "dropped");
            this.put("pickup", "picked_up");
         }
      }
   });

   @Shadow
   public abstract int readStat$v1_8(StatBase var1);

   @Shadow
   public abstract int writeStat$v1_7(StatBase var1);

   @Shadow
   public abstract void increaseStat$v1_8(EntityPlayer var1, StatBase var2, int var3);

   @Shadow
   public abstract void func_150871_b$v1_7(EntityPlayer var1, StatBase var2, int var3);

   @Inject(method = {"func_150873_a$v1_7", "unlockAchievement$v1_8"}, at = @At("HEAD"))
   private void lunar$getOriginalStatAmt(EntityPlayer var1, StatBase var2, int var3, CallbackInfo var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() != null) {
            int var5 = this.readStat$v1_8(var2);
            this.bridge$recordStat(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2, var3 - var5
            );
         }
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentServerData() == null) {
         if (!var1.world.isRemote) {
            int var6 = this.writeStat$v1_7(var2);
            this.bridge$recordStat(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2, var3 - var6
            );
         }
      } else if (var1.world.isRemote) {
         int var7 = this.writeStat$v1_7(var2);
         this.bridge$recordStat(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2, var3 - var7
         );
      }
   }

   public void bridge$increment(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.increaseStat$v1_8((EntityPlayer)var1, (StatBase)var2, var3);
      } else {
         this.func_150871_b$v1_7((EntityPlayer)var1, (StatBase)var2, var3);
      }
   }

   public void bridge$setValueFromPacket(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2,
      int var3
   ) {
      TupleIntJsonSerializable var4;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var4 = this.statsData$v1_8.computeIfAbsent((StatBase)var2, var0 -> new TupleIntJsonSerializable());
      } else {
         var4 = this.field_150875_a$v1_7.computeIfAbsent((StatBase)var2, var0 -> new TupleIntJsonSerializable());
      }

      var4.setIntegerValue(var3);
   }

   public void bridge$recordStat(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2
   ) {
      StatBase var3 = (StatBase)var1;
      String var4 = var3.statId;
      if (!IGNORED_STATS.contains(var4)) {
         if (var4.contains("achievement")) {
            return;
         }

         String var5 = (String)lunar$quickConversionCache.getAndMoveToFirst(var4);
         if (var5 == null) {
            int var6 = var4.lastIndexOf(".");
            String var7 = var4.substring(var6 + 1);
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && FULL_CONVERSIONS.containsKey(var7)) {
               var5 = "minecraft.custom:minecraft." + FULL_CONVERSIONS.get(var4);
            } else {
               String var8 = var4.substring(0, var6);
               int var9 = var8.lastIndexOf(".");
               if (var9 != -1) {
                  String var10 = var8.substring(var9 + 1);
                  if (var10.equals("minecraft")) {
                     String var11 = var8.substring(0, var9);
                     int var12 = var11.indexOf(".");
                     var10 = var11.substring(var12 + 1);
                  }

                  var5 = this.lunar$toModernNaming(CONVERT_TYPES.getOrDefault(var10, null), var7);
               } else {
                  var5 = this.lunar$toModernNaming(null, var7);
               }
            }

            lunar$quickConversionCache.putAndMoveToFirst(var4, var5);
            if (lunar$quickConversionCache.size() == 30) {
               lunar$quickConversionCache.removeLast();
            }
         }

         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OOCROCIOHHCIIROICOCRHCCCHRCIOI().CIOHHCORHRCCRICCCORIHCRHCCCRRR("stat:" + var5, var2);
      }
   }

   @Unique
   private String lunar$toModernNaming(@Nullable String var1, String var2) {
      return "minecraft." + (var1 == null ? "custom" : var1) + ":minecraft." + this.lunar$convertToLowerSnakeCase(var2);
   }

   @Unique
   private String lunar$convertToLowerSnakeCase(String var1) {
      var1 = var1.replace("-", "_");
      StringBuilder var2 = new StringBuilder(String.valueOf(Character.toLowerCase(var1.charAt(0))));
      boolean var3 = false;

      for (int var4 = 1; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (var5 == '_') {
            var3 = true;
            var2.append(var5);
         } else if (Character.isLowerCase(var5)) {
            var3 = false;
            var2.append(var5);
         } else {
            if (!var3) {
               var2.append("_");
            }

            var3 = true;
            var2.append(Character.toLowerCase(var5));
         }
      }

      return var2.toString();
   }
}
