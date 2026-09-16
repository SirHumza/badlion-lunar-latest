package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.MixinExtrasBootstrap;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.launch.platform.container.ContainerHandleURI;
import org.spongepowered.asm.launch.platform.container.ContainerHandleVirtual;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.transformer.MixinProxyImpl;
import org.spongepowered.asm.service.IAdviceProvider;
import org.spongepowered.asm.service.IClassBytecodeProvider;
import org.spongepowered.asm.service.IClassProvider;
import org.spongepowered.asm.service.IClassTracker;
import org.spongepowered.asm.service.IFeatureValidator;
import org.spongepowered.asm.service.IMixinAuditTrail;
import org.spongepowered.asm.service.ITransformerProvider;
import org.spongepowered.asm.service.MixinServiceAbstract;

public class CRRRICCRROCOHHOHIICIHORCOORRRH extends MixinServiceAbstract {
   private static final OCOHORHCROHICRRIHCIHHRRCIHICRI IRICCRHCRRCCCCOOHCRHCHCCOIRIRC = new OCOHORHCROHICRRIHCIHHRRCIHICRI("Genesis/IchorMixinService");
   private final com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH CRRICHOCHIRHRIOCHOCCCHIRIROICC;
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH CCOHCOHHHOCCCIIIORHRRHORICOCCC;
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH ICRHRHCHHHCICIIHCCORIIHCOHCIIC;

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      ClassLoader var1 = this.getClass().getClassLoader();
      if (var1 instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         this.CRRICHOCHIRHRIOCHOCCCHIRIROICC = var2.IHIIOIIICRCHHHCOIRIIICIRIRIICO();
         this.CCOHCOHHHOCCCIIIORHRRHORICOCCC = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
         this.ICRHRHCHHHCICIIHCCORIIHCOHCIIC = new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.CRRICHOCHIRHRIOCHOCCCHIRIROICC);
      } else {
         throw new IllegalStateException("Loading IchorMixinService outside of an IchorPipeline? " + var1.getClass().getName());
      }
   }

   @Override
   public String getName() {
      return "Ichor";
   }

   @Override
   public boolean isValid() {
      return MixinBootstrap.class.getClassLoader() instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
   }

   @Override
   public void prepare() {
      try {
         Field var1 = this.getClass().getSuperclass().getDeclaredField("sideName");
         var1.setAccessible(true);
         var1.set(this, MixinEnvironment.Side.CLIENT.name());
      } catch (Throwable var2) {
         throw var2;
      }
   }

   @Override
   public MixinEnvironment.Phase getInitialPhase() {
      return MixinEnvironment.Phase.PREINIT;
   }

   @Override
   public void init() {
      super.init();
      Mixins.registerErrorHandlerClass(com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getName());
      this.CRRICHOCHIRHRIOCHOCCCHIRIROICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new MixinProxyImpl(this.CRRICHOCHIRHRIOCHOCCCHIRIROICC));
      IRICCRHCRRCCCCOOHCRHCHCCOIRIRC.info("Initializing MixinExtras " + MixinExtrasBootstrap.getVersion() + " in " + this.getClass().getClassLoader().getName());
      MixinExtrasBootstrap.init();
   }

   @Override
   public IClassProvider getClassProvider() {
      return this.CCOHCOHHHOCCCIIIORHRRHORICOCCC;
   }

   @Override
   public IClassBytecodeProvider getBytecodeProvider() {
      return this.ICRHRHCHHHCICIIHCCORIIHCOHCIIC;
   }

   @Override
   public ITransformerProvider getTransformerProvider() {
      return null;
   }

   @Override
   public IClassTracker getClassTracker() {
      return null;
   }

   @Override
   public IMixinAuditTrail getAuditTrail() {
      return null;
   }

   @Override
   public IFeatureValidator getFeatureValidator() {
      return IFeatureValidator.ALLOW_ALL;
   }

   @Override
   public IAdviceProvider getAdviceProvider() {
      return IAdviceProvider.GENERIC;
   }

   @Override
   public Collection<String> getPlatformAgents() {
      return new ArrayList<>();
   }

   @Override
   public IContainerHandle getPrimaryContainer() {
      try {
         URL var1 = this.getClass().getProtectionDomain().getCodeSource().getLocation();
         if (var1 != null) {
            URI var2 = var1.toURI();

            try {
               Paths.get(var2);
            } catch (FileSystemNotFoundException var6) {
               try {
                  FileSystems.newFileSystem(var2, new HashMap<>());
                  IRICCRHCRRCCCCOOHCRHCHCCOIRIRC.info("Making file system for %s", var2);
               } catch (IOException var5) {
                  IRICCRHCRRCCCCOOHCRHCHCCOIRIRC.warn("Failed to make file system for %s", var2);
               }
            }

            return new ContainerHandleURI(var2);
         }
      } catch (URISyntaxException var7) {
      }

      return new ContainerHandleVirtual(this.getName());
   }

   @Override
   public InputStream getResourceAsStream(String var1) {
      return MixinBootstrap.class.getClassLoader().getResourceAsStream(var1);
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMinCompatibilityLevel() {
      return this.getMaxCompatibilityLevel();
   }

   @Override
   public MixinEnvironment.CompatibilityLevel getMaxCompatibilityLevel() {
      return MixinEnvironment.CompatibilityLevel.JAVA_21;
   }

   @Override
   protected ILogger createLogger(String var1) {
      ClassLoader var2 = MixinBootstrap.class.getClassLoader();
      if (var2 instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3) {
         return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("Ichor/" + var1, var3.IHIIOIIICRCHHHCOIRIIICIRIRIICO().OCOIIRHCCOOHRHHCOCHIHIICRORRHR());
      } else {
         throw new IllegalStateException("Loading IchorMixinService outside of an IchorPipeline? " + var2.getClass().getName());
      }
   }
}
