package org.spongepowered.tools.agent;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;
import org.spongepowered.asm.mixin.transformer.ext.IHotSwap;
import org.spongepowered.asm.mixin.transformer.throwables.MixinReloadException;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.service.ServiceNotAvailableError;
import org.spongepowered.asm.transformers.MixinClassReader;
import org.spongepowered.asm.util.asm.ASM;

public class MixinAgent implements IHotSwap {
   public static final byte[] ERROR_BYTECODE = new byte[]{1};
   static final MixinAgentClassLoader classLoader = new MixinAgentClassLoader();
   static Instrumentation instrumentation = null;
   private static List<MixinAgent> agents = new ArrayList<>();
   final IMixinTransformer classTransformer;

   public MixinAgent(IMixinTransformer var1) {
      this.classTransformer = var1;
      agents.add(this);
      if (instrumentation != null) {
         this.initTransformer();
      }
   }

   private void initTransformer() {
      instrumentation.addTransformer(new MixinAgent.Transformer(), true);
   }

   @Override
   public void registerMixinClass(String var1) {
      classLoader.addMixinClass(var1);
   }

   @Override
   public void registerTargetClass(String var1, ClassNode var2) {
      classLoader.addTargetClass(var1, var2);
   }

   public static void init(Instrumentation var0) {
      instrumentation = var0;
      if (!instrumentation.isRedefineClassesSupported()) {
         log(Level.ERROR, "The instrumentation doesn't support re-definition of classes");
      }

      for (MixinAgent var2 : agents) {
         var2.initTransformer();
      }
   }

   public static void premain(String var0, Instrumentation var1) {
      System.setProperty("mixin.hotSwap", "true");
      init(var1);
   }

   public static void agentmain(String var0, Instrumentation var1) {
      init(var1);
   }

   public static void log(Level var0, String var1, Object... var2) {
      try {
         MixinService.getService().getLogger("mixin.agent").log(var0, var1, var2);
      } catch (ServiceNotAvailableError var4) {
         System.err.printf("MixinAgent: %s: %s", var0.name(), String.format(var1, var2));
      }
   }

   class Transformer implements ClassFileTransformer {
      @Override
      public byte[] transform(ClassLoader var1, String var2, Class<?> var3, ProtectionDomain var4, byte[] var5) {
         if (var3 == null) {
            return null;
         }

         byte[] var6 = MixinAgent.classLoader.getFakeMixinBytecode(var3);
         if (var6 != null) {
            ClassNode var7 = new ClassNode(ASM.API_VERSION);
            MixinClassReader var8 = new MixinClassReader(var5, var2);
            var8.accept(var7, 8);
            List var9 = this.reloadMixin(var2, var7);
            return var9 != null && this.reApplyMixins(var9) ? var6 : MixinAgent.ERROR_BYTECODE;
         }

         try {
            MixinAgent.log(Level.INFO, "Redefining class {}", var2);
            return MixinAgent.this.classTransformer.transformClassBytes(null, var2.replace('/', '.'), var5);
         } catch (Throwable var10) {
            MixinAgent.log(Level.ERROR, "Error while re-transforming class {}", var2, var10);
            return MixinAgent.ERROR_BYTECODE;
         }
      }

      private List<String> reloadMixin(String var1, ClassNode var2) {
         MixinAgent.log(Level.INFO, "Redefining mixin {}", var1);

         try {
            return MixinAgent.this.classTransformer.reload(var1.replace('/', '.'), var2);
         } catch (MixinReloadException var4) {
            MixinAgent.log(Level.ERROR, "Mixin {} cannot be reloaded, needs a restart to be applied: {} ", var4.getMixinInfo(), var4.getMessage());
         } catch (Throwable var5) {
            MixinAgent.log(Level.ERROR, "Error while finding targets for mixin {}", var1, var5);
         }

         return null;
      }

      private boolean reApplyMixins(List<String> var1) {
         IMixinService var2 = MixinService.getService();

         for (String var4 : var1) {
            String var5 = var4.replace('/', '.');
            MixinAgent.log(Level.DEBUG, "Re-transforming target class {}", var4);

            try {
               Class var6 = var2.getClassProvider().findClass(var5);
               byte[] var7 = MixinAgent.classLoader.getOriginalTargetBytecode(var5);
               if (var7 == null) {
                  MixinAgent.log(Level.ERROR, "Target class {} bytecode is not registered", var5);
                  return false;
               }

               var7 = MixinAgent.this.classTransformer.transformClassBytes(null, var5, var7);
               MixinAgent.instrumentation.redefineClasses(new ClassDefinition(var6, var7));
            } catch (Throwable var8) {
               MixinAgent.log(Level.ERROR, "Error while re-transforming target class {}", var4, var8);
               return false;
            }
         }

         return true;
      }
   }
}
