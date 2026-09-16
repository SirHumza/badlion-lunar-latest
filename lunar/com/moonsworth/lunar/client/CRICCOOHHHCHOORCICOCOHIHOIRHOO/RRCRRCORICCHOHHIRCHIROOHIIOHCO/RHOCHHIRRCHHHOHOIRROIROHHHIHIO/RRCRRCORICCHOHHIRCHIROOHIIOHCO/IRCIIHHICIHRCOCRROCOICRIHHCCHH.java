package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import lombok.Generated;

@CORCOCICIRIOHROHROIIOOHICCHCRR
public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   SKIP_UNBIND_FRAME_BUFFER(() -> IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 29 && isNvidia()),
   BETTER_TEXT_BATCHING(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 35),
   MULTIPLE_BUFFERS_PER_FENCE(true),
   ADD_SYNC_TO_FENCE(true),
   GECKO_CURRENT_PROGRAM_CACHE(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6),
   CACHE_RESOURCELOCATION_TOSTRING(true, false),
   FASTER_PACK_LOADING(true),
   ALLOW_TURBO_ENTITIES(true),
   ALLOW_TURBO_BLOCK_ENTITIES(true),
   FAST_TURBO_EXTRACT(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 33),
   VULKAN_RENDER_PASS_COALESCING(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 39),
   ENABLE_RESOURCE_TRACKING(false),
   FASTER_ARMORSTAND_TICK(true),
   CULL_DISPLAY_ENTITIES(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 16),
   FAST_FRAMEBUFFER(true),
   FAST_TEXT(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 36),
   FRUSTUM_IMPROVEMENTS(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 39);

   private Boolean enabledByDefault;
   private final boolean canChangeAtRuntime;
   private final Supplier<Boolean> enabledSupplier;
   private static final AtomicReference<Object> toggleableEnabledOptis = new AtomicReference<>();
   private static final AtomicReference<Object> enabledOptis = new AtomicReference<>();
   private static final AtomicReference<Object> toggleableDisabledOptis = new AtomicReference<>();

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3) {
      this(var3, true);
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, boolean var4) {
      this.enabledByDefault = var3;
      this.canChangeAtRuntime = var4;
      this.enabledSupplier = () -> var3;
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(Supplier<Boolean> var3) {
      this(var3, true);
   }

   IRCIIHHICIHRCOCRROCOICRIHHCCHH(Supplier<Boolean> var3, boolean var4) {
      this.enabledByDefault = null;
      this.canChangeAtRuntime = var4;
      this.enabledSupplier = var3;
   }

   public boolean isEnabledByDefault() {
      if (this.enabledByDefault == null) {
         this.enabledByDefault = this.enabledSupplier.get();
      }

      return this.enabledByDefault;
   }

   public boolean isEnabled() {
      return !this.canChangeAtRuntime ? this.isEnabledByDefault() : HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   public static boolean isNvidia() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .IIIORCCOIHHRCIRHOCIIICOHOOCHIH();
      String var1 = var0.ORROCCOHRCROHICHCHIIOOIRRRRHHH.toLowerCase(Locale.ROOT);
      String var2 = var0.HCRRCHCOCHRIIRIHOOIOCCOHHCORHR.toLowerCase(Locale.ROOT);
      return var1.contains("nvidia") || var2.contains("nvidia");
   }

   @Generated
   public boolean isCanChangeAtRuntime() {
      return this.canChangeAtRuntime;
   }

   @Generated
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH[] getToggleableEnabledOptis() {
      Object var0 = toggleableEnabledOptis.get();
      if (var0 == null) {
         synchronized (toggleableEnabledOptis) {
            var0 = toggleableEnabledOptis.get();
            if (var0 == null) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var2 = Arrays.stream(values())
                  .filter(var0x -> var0x.isEnabledByDefault() && var0x.canChangeAtRuntime)
                  .toArray(IRCIIHHICIHRCOCRROCOICRIHHCCHH[]::new);
               var0 = var2 == null ? toggleableEnabledOptis : var2;
               toggleableEnabledOptis.set(var0);
            }
         }
      }

      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH[])(var0 == toggleableEnabledOptis ? null : var0);
   }

   @Generated
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH[] getEnabledOptis() {
      Object var0 = enabledOptis.get();
      if (var0 == null) {
         synchronized (enabledOptis) {
            var0 = enabledOptis.get();
            if (var0 == null) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var2 = Arrays.stream(values())
                  .filter(IRCIIHHICIHRCOCRROCOICRIHHCCHH::isEnabledByDefault)
                  .toArray(IRCIIHHICIHRCOCRROCOICRIHHCCHH[]::new);
               var0 = var2 == null ? enabledOptis : var2;
               enabledOptis.set(var0);
            }
         }
      }

      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH[])(var0 == enabledOptis ? null : var0);
   }

   @Generated
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH[] getToggleableDisabledOptis() {
      Object var0 = toggleableDisabledOptis.get();
      if (var0 == null) {
         synchronized (toggleableDisabledOptis) {
            var0 = toggleableDisabledOptis.get();
            if (var0 == null) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var2 = Arrays.stream(values())
                  .filter(var0x -> !var0x.isEnabledByDefault() && var0x.canChangeAtRuntime)
                  .toArray(IRCIIHHICIHRCOCRROCOICRIHHCCHH[]::new);
               var0 = var2 == null ? toggleableDisabledOptis : var2;
               toggleableDisabledOptis.set(var0);
            }
         }
      }

      return (IRCIIHHICIHRCOCRROCOICRIHHCCHH[])(var0 == toggleableDisabledOptis ? null : var0);
   }
}
