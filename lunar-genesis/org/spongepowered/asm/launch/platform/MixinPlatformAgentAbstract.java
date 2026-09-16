package org.spongepowered.asm.launch.platform;

import java.lang.reflect.Method;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.IConsumer;

public abstract class MixinPlatformAgentAbstract implements IMixinPlatformAgent {
   protected static final ILogger logger = MixinService.getService().getLogger("mixin");
   protected MixinPlatformManager manager;
   protected IContainerHandle handle;

   protected MixinPlatformAgentAbstract() {
   }

   @Override
   public IMixinPlatformAgent.AcceptResult accept(MixinPlatformManager var1, IContainerHandle var2) {
      this.manager = var1;
      this.handle = var2;
      return IMixinPlatformAgent.AcceptResult.ACCEPTED;
   }

   @Override
   public String getPhaseProvider() {
      return null;
   }

   @Override
   public void prepare() {
   }

   @Override
   public void initPrimaryContainer() {
   }

   @Override
   public void inject() {
   }

   @Override
   public String toString() {
      return String.format("PlatformAgent[%s:%s]", this.getClass().getSimpleName(), this.handle);
   }

   protected static String invokeStringMethod(ClassLoader var0, String var1, String var2) {
      try {
         Class var3 = Class.forName(var1, false, var0);
         Method var4 = var3.getDeclaredMethod(var2);
         return ((Enum)var4.invoke(null)).name();
      } catch (Exception var5) {
         return null;
      }
   }

   @Deprecated
   public void wire(MixinEnvironment.Phase var1, IConsumer<MixinEnvironment.Phase> var2) {
   }

   @Deprecated
   public void unwire() {
   }
}
