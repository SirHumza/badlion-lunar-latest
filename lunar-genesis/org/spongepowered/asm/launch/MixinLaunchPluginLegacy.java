package org.spongepowered.asm.launch;

import cpw.mods.modlauncher.api.IEnvironment;
import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import cpw.mods.modlauncher.serviceapi.ILaunchPluginService.ITransformerLoader;
import cpw.mods.modlauncher.serviceapi.ILaunchPluginService.Phase;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Consumer;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.platform.CommandLineOptions;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IMixinService;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.service.modlauncher.MixinServiceModLauncher;
import org.spongepowered.asm.service.modlauncher.ModLauncherAuditTrail;
import org.spongepowered.asm.transformers.MixinClassReader;
import org.spongepowered.include.com.google.common.io.Resources;

public class MixinLaunchPluginLegacy implements ILaunchPluginService, IClassBytecodeProvider {
   public static final String NAME = "mixin";
   private final List<IClassProcessor> processors = new ArrayList<>();
   private List<String> commandLineMixins;
   private ITransformerLoader transformerLoader;
   private MixinServiceModLauncher service;
   private ModLauncherAuditTrail auditTrail;

   public String name() {
      return "mixin";
   }

   public EnumSet<Phase> handlesClass(Type var1, boolean var2) {
      throw new IllegalStateException("Outdated ModLauncher");
   }

   public boolean processClass(Phase var1, ClassNode var2, Type var3) {
      throw new IllegalStateException("Outdated ModLauncher");
   }

   public EnumSet<Phase> handlesClass(Type var1, boolean var2, String var3) {
      if ("mixin".equals(var3)) {
         return Phases.NONE;
      }

      EnumSet var4 = EnumSet.noneOf(Phase.class);
      synchronized (this.processors) {
         for (IClassProcessor var7 : this.processors) {
            EnumSet var8 = var7.handlesClass(var1, var2, var3);
            if (var8 != null) {
               var4.addAll(var8);
            }
         }

         return var4;
      }
   }

   public boolean processClass(Phase var1, ClassNode var2, Type var3, String var4) {
      boolean var5 = false;
      synchronized (this.processors) {
         for (IClassProcessor var8 : this.processors) {
            var5 |= var8.processClass(var1, var2, var3, var4);
         }

         return var5;
      }
   }

   void init(IEnvironment var1, List<String> var2) {
      IMixinService var3 = MixinService.getService();
      if (!(var3 instanceof MixinServiceModLauncher)) {
         throw new IllegalStateException("Unsupported service type for ModLauncher Mixin Service");
      }

      this.service = (MixinServiceModLauncher)var3;
      this.auditTrail = (ModLauncherAuditTrail)this.service.getAuditTrail();
      synchronized (this.processors) {
         this.processors.addAll(this.service.getProcessors());
      }

      this.commandLineMixins = var2;
      this.service.onInit(this);
   }

   public void customAuditConsumer(String var1, Consumer<String[]> var2) {
      if (this.auditTrail != null) {
         this.auditTrail.setConsumer(var1, var2);
      }
   }

   @Deprecated
   public void addResource(Path var1, String var2) {
      this.service.getPrimaryContainer().addResource(var2, var1);
   }

   public void offerResource(Path var1, String var2) {
      this.service.getPrimaryContainer().addResource(var2, var1);
   }

   public void addResources(List var1) {
      this.service.getPrimaryContainer().addResources(var1);
   }

   public <T> T getExtension() {
      return null;
   }

   public void initializeLaunch(ITransformerLoader var1, Path[] var2) {
      this.initializeLaunch(var1);
   }

   protected void initializeLaunch(ITransformerLoader var1) {
      this.transformerLoader = var1;
      MixinBootstrap.doInit(CommandLineOptions.of(this.commandLineMixins));
      MixinBootstrap.inject();
      this.service.onStartup();
   }

   @Override
   public ClassNode getClassNode(String var1) {
      return this.getClassNode(var1, true, 0);
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2) {
      return this.getClassNode(var1, var2, 8);
   }

   @Override
   public ClassNode getClassNode(String var1, boolean var2, int var3) {
      if (!var2) {
         throw new IllegalArgumentException("ModLauncher service does not currently support retrieval of untransformed bytecode");
      }

      String var4 = var1.replace('/', '.');
      String var5 = var1.replace('.', '/');

      byte[] var6;
      try {
         var6 = this.transformerLoader.buildTransformedClassNodeFor(var4);
      } catch (ClassNotFoundException var15) {
         URL var8 = Thread.currentThread().getContextClassLoader().getResource(var5 + ".class");
         if (var8 == null) {
            throw var15;
         }

         try {
            var6 = Resources.asByteSource(var8).read();
         } catch (IOException var13) {
            throw var15;
         }
      }

      if (var6 != null && var6.length != 0) {
         ClassNode var16 = new ClassNode();
         MixinClassReader var18 = new MixinClassReader(var6, var4);
         var18.accept(var16, var3);
         return var16;
      }

      Type var7 = Type.getObjectType(var5);
      synchronized (this.processors) {
         for (IClassProcessor var10 : this.processors) {
            if (var10.generatesClass(var7)) {
               ClassNode var11 = new ClassNode();
               if (var10.generateClass(var7, var11)) {
                  return var11;
               }
            }
         }
      }

      throw new ClassNotFoundException(var4);
   }
}
