package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import org.spongepowered.asm.mixin.extensibility.IMixinConfig;
import org.spongepowered.asm.mixin.extensibility.IMixinErrorHandler;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements IMixinErrorHandler {
   @Override
   public IMixinErrorHandler.ErrorAction onPrepareError(IMixinConfig var1, Throwable var2, IMixinInfo var3, IMixinErrorHandler.ErrorAction var4) {
      IchorAPI.getPipeline(var3)
         .map(OOROOCCIRCCRHOIOIORIHCHHOOCCOR::CCHORCOOOCRRRHHCRCRRCIHIICICCH)
         .ifPresent(var1x -> var1x.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2));
      return var4;
   }

   @Override
   public IMixinErrorHandler.ErrorAction onApplyError(String var1, Throwable var2, IMixinInfo var3, IMixinErrorHandler.ErrorAction var4) {
      IchorAPI.getPipeline(var3)
         .map(OOROOCCIRCCRHOIOIORIHCHHOOCCOR::CCHORCOOOCRRRHHCRCRRCIHIICICCH)
         .ifPresent(var1x -> var1x.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2));
      return var4;
   }
}
