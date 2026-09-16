package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.StatCrafting;
import net.minecraft.stats.StatList;
import net.minecraft.util.IChatComponent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(StatList.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Redirect(method = "func_151181_c$v1_7", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Block;getEnableStats()Z"))
   private static boolean lunar$useItemName$mineBlock(Block var0, @Share("mineId") LocalRef<String> var1) {
      if (!var0.getEnableStats()) {
         return false;
      }

      Item var2 = Item.getItemFromBlock(var0);
      String var3 = lunar$getFormattedItemName(var2);
      if (var3 == null) {
         return false;
      }

      var1.set("stat.mineBlock." + var3);
      return true;
   }

   @Redirect(method = "func_151181_c$v1_7", at = @At(value = "NEW", target = "net/minecraft/stats/StatCrafting"))
   private static StatCrafting lunar$modifyStatId$mineBlock(String var0, IChatComponent var1, Item var2, @Share("mineId") LocalRef<String> var3) {
      return new StatCrafting((String)var3.get(), var1, var2);
   }

   @Redirect(method = "initCraftableStats", at = @At(value = "INVOKE", target = "Ljava/util/Iterator;next()Ljava/lang/Object;", ordinal = 2))
   private static Object lunar$useItemName$craftItem(Iterator<Item> var0, @Share("craftId") LocalRef<String> var1) {
      Item var2 = (Item)var0.next();
      String var3 = lunar$getFormattedItemName(var2);
      if (var3 == null) {
         return null;
      }

      var1.set("stat.craftItem." + var3);
      return var2;
   }

   @Redirect(method = "initCraftableStats", at = @At(value = "NEW", target = "net/minecraft/stats/StatCrafting"))
   private static StatCrafting lunar$modifyStatId$craftItem$v1_7(String var0, IChatComponent var1, Item var2, @Share("craftId") LocalRef<String> var3) {
      return new StatCrafting((String)var3.get(), var1, var2);
   }

   @Redirect(method = "initStats", at = @At(value = "INVOKE", target = "Ljava/util/Iterator;next()Ljava/lang/Object;", ordinal = 0))
   private static Object lunar$useItemName$useItem(Iterator<Item> var0, @Share("useId") LocalRef<String> var1) {
      Item var2 = (Item)var0.next();
      String var3 = lunar$getFormattedItemName(var2);
      if (var3 == null) {
         return null;
      }

      var1.set("stat.useItem." + var3);
      return var2;
   }

   @Redirect(method = "initStats", at = @At(value = "NEW", target = "net/minecraft/stats/StatCrafting"))
   private static StatCrafting lunar$modifyStatId$useItem$v1_7(String var0, IChatComponent var1, Item var2, @Share("useId") LocalRef<String> var3) {
      return new StatCrafting((String)var3.get(), var1, var2);
   }

   @Redirect(method = "func_151179_e$v1_7", at = @At(value = "INVOKE", target = "Ljava/util/Iterator;next()Ljava/lang/Object;", ordinal = 0))
   private static Object lunar$useItemName$breakItem(Iterator<Item> var0, @Share("breakId") LocalRef<String> var1) {
      Item var2 = (Item)var0.next();
      String var3 = lunar$getFormattedItemName(var2);
      if (var3 == null) {
         return null;
      }

      var1.set("stat.breakItem." + var3);
      return var2;
   }

   @Redirect(method = "func_151179_e$v1_7", at = @At(value = "NEW", target = "net/minecraft/stats/StatCrafting"))
   private static StatCrafting lunar$modifyStatId$breakItem(String var0, IChatComponent var1, Item var2, @Share("breakId") LocalRef<String> var3) {
      return new StatCrafting((String)var3.get(), var1, var2);
   }

   @Unique
   @Nullable
   private static String lunar$getFormattedItemName(Item var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = Item.itemRegistry$v1_7.getNameForObject(var0);
      if (var1 == null) {
         return null;
      }

      int var2 = var1.indexOf(":");
      if (var2 != -1) {
         var1 = var1.substring(var2 + 1);
      }

      return var1;
   }
}
