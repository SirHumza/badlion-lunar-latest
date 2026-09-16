package com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements CORCOCICIRIOHROHROIIOOHICCHCRR {
   PRE_INIT,
   PRE_FORGE_PATCH,
   PRE_OPTIFINE_PATCH,
   FORGE_PATCH,
   OPTIFINE_PATCH,
   POST_FORGE_PATCH,
   POST_OPTIFINE_PATCH,
   INIT,
   INITIAL_REMAP,
   POST_REMAP,
   OMNIMIXIN_PROCESSING,
   EXTERNAL_REMAP,
   ACCESS_WIDEN,
   PRE_META_MIXIN,
   META_MIXIN(true, true),
   POST_META_MIXIN,
   PRE_MIXIN,
   MIXIN(true, false),
   POST_MIXIN,
   FINAL;

   private final boolean mixinRuntime;
   private final boolean sandboxMixinRuntime;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this(false, false);
   }

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var3, boolean var4) {
      this.mixinRuntime = var3;
      this.sandboxMixinRuntime = var4;
   }

   @Override
   public boolean hasMixinRuntime() {
      return this.mixinRuntime;
   }

   @Override
   public boolean shouldUseParentAsMixinRuntime() {
      return !this.sandboxMixinRuntime;
   }

   @Override
   public boolean shouldUseClassBytes() {
      return this.ordinal() < POST_FORGE_PATCH.ordinal();
   }

   public static List<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> getApplicableStages(
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (var1 == null) {
         var1 = FINAL;
      }

      if (var0 == null) {
         var0 = INIT;
      }

      ArrayList var2 = new ArrayList();

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : values()) {
         if (var6.ordinal() >= var0.ordinal()) {
            if (var6.ordinal() > var1.ordinal()) {
               break;
            }

            var2.add(var6);
         }
      }

      return var2;
   }
}
