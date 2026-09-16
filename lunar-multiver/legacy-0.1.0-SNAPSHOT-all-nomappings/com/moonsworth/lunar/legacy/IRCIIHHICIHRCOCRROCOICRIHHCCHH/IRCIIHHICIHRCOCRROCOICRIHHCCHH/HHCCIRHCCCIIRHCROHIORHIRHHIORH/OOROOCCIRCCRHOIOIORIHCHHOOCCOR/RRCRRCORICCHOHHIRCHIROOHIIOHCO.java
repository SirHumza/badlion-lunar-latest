package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.google.common.util.concurrent.Futures;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import net.minecraft.client.resources.SkinManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(SkinManager.class)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @ModifyVariable(method = {"loadProfileTextures$v1_8", "func_152790_a$v1_7"}, at = @At("HEAD"), argsOnly = true)
   private boolean lunar$unsecureHostedWorldSkins(boolean var1) {
      if (!var1) {
         return false;
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR() != null
            ? !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOOIIOOHHRRRORIHROOCHHCICOIIOC()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOIRIHORHICIIOIIIRCOROROICCICR()
            : true;
      }
   }

   @WrapOperation(
      method = {"loadProfileTextures$v1_8", "func_152790_a$v1_7"},
      at = @At(value = "INVOKE", target = "Ljava/util/concurrent/ExecutorService;submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;")
   )
   private Future<?> lunar$rewindNonThreadedSkinsLoading(ExecutorService var1, Runnable var2, Operation<Future<?>> var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var2.run();
         return Futures.immediateFuture(null);
      } else {
         return (Future<?>)var3.call(new Object[]{var1, var2});
      }
   }
}
