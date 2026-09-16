package com.llamalad7.mixinextras.service;

import com.llamalad7.mixinextras.expression.impl.point.ExpressionInjectionPoint;
import com.llamalad7.mixinextras.expression.impl.wrapper.ExpressionInjectorWrapperInjectionInfo;
import com.llamalad7.mixinextras.injector.LateInjectionApplicatorExtension;
import com.llamalad7.mixinextras.injector.ModifyExpressionValueInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReceiverInjectionInfo;
import com.llamalad7.mixinextras.injector.ModifyReturnValueInjectionInfo;
import com.llamalad7.mixinextras.injector.WrapWithConditionV1InjectionInfo;
import com.llamalad7.mixinextras.injector.v2.WrapWithConditionInjectionInfo;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethodApplicatorExtension;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethodInjectionInfo;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationInjectionInfo;
import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import com.llamalad7.mixinextras.sugar.impl.SugarPostProcessingExtension;
import com.llamalad7.mixinextras.sugar.impl.SugarWrapperInjectionInfo;
import com.llamalad7.mixinextras.transformer.MixinTransformerExtension;
import com.llamalad7.mixinextras.utils.MixinExtrasLogger;
import com.llamalad7.mixinextras.utils.MixinInternals;
import com.llamalad7.mixinextras.wrapper.factory.FactoryRedirectWrapperInjectionInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo;
import org.spongepowered.asm.mixin.transformer.ext.IExtension;

public class MixinExtrasServiceImpl implements MixinExtrasService {
   private static final MixinExtrasLogger LOGGER = MixinExtrasLogger.get("Service");
   private final List<Versioned<String>> offeredPackages = new ArrayList<>();
   private final List<Versioned<IExtension>> offeredExtensions = new ArrayList<>();
   private final List<Versioned<Class<? extends InjectionInfo>>> offeredInjectors = new ArrayList<>();
   private final List<Versioned<Class<? extends InjectionPoint>>> offeredPoints = new ArrayList<>();
   private final String ownPackage = StringUtils.substringBefore(this.getClass().getName(), ".service.");
   private final List<Versioned<String>> allPackages = new ArrayList<>(Collections.singletonList(new Versioned<>(this.getVersion(), this.ownPackage)));
   private final List<IExtension> ownExtensions = Arrays.asList(
      new MixinTransformerExtension(),
      new ServiceInitializationExtension(this),
      new LateInjectionApplicatorExtension(),
      new SugarPostProcessingExtension(),
      new WrapMethodApplicatorExtension()
   );
   private final List<Class<? extends InjectionInfo>> ownInjectors = Arrays.asList(
      ModifyExpressionValueInjectionInfo.class,
      ModifyReceiverInjectionInfo.class,
      ModifyReturnValueInjectionInfo.class,
      WrapOperationInjectionInfo.class,
      WrapWithConditionV1InjectionInfo.class
   );
   private final List<Versioned<Class<? extends InjectionInfo>>> ownGatedInjectors = Arrays.asList(
      new Versioned<>(MixinExtrasVersion.V0_3_4.getNumber(), WrapWithConditionInjectionInfo.class),
      new Versioned<>(MixinExtrasVersion.V0_4_0_BETA_1.getNumber(), WrapMethodInjectionInfo.class)
   );
   private final List<Class<? extends InjectionPoint>> ownPoints = Arrays.asList(ExpressionInjectionPoint.class);
   private final List<Class<? extends InjectionInfo>> internalInjectors = Arrays.asList(
      SugarWrapperInjectionInfo.class, FactoryRedirectWrapperInjectionInfo.class, ExpressionInjectorWrapperInjectionInfo.class
   );
   private final List<String> registeredInjectors = new ArrayList<>();
   boolean initialized;

   @Override
   public int getVersion() {
      return MixinExtrasVersion.LATEST.getNumber();
   }

   @Override
   public boolean shouldReplace(Object var1) {
      return this.getVersion() > MixinExtrasService.getFrom(var1).getVersion();
   }

   @Override
   public void takeControlFrom(Object var1) {
      LOGGER.debug("{} is taking over from {}", this, var1);
      this.ownExtensions
         .forEach(var0 -> MixinInternals.registerExtension(var0, var0 instanceof ServiceInitializationExtension || var0 instanceof MixinTransformerExtension));
      this.ownInjectors.forEach(var1x -> this.registerInjector((Class<? extends InjectionInfo>)var1x, this.ownPackage));
      this.ownGatedInjectors.forEach(var1x -> this.registerInjector(var1x.value, this.ownPackage));
   }

   @Override
   public void concedeTo(Object var1, boolean var2) {
      this.requireNotInitialized();
      LOGGER.debug("{} is conceding to {}", this, var1);
      MixinExtrasService var3 = MixinExtrasService.getFrom(var1);
      if (var2) {
         this.deInitialize();
      }

      this.offeredPackages.forEach(var1x -> var3.offerPackage(var1x.version, var1x.value));
      var3.offerPackage(this.getVersion(), this.ownPackage);
      this.offeredExtensions.forEach(var1x -> var3.offerExtension(var1x.version, var1x.value));
      this.ownExtensions.forEach(var2x -> var3.offerExtension(this.getVersion(), var2x));
      this.offeredInjectors.forEach(var1x -> var3.offerInjector(var1x.version, var1x.value));
      this.ownInjectors.forEach(var2x -> var3.offerInjector(this.getVersion(), (Class<? extends InjectionInfo>)var2x));
      this.offeredPoints.forEach(var1x -> var3.offerInjectionPoint(var1x.version, var1x.value));
      this.ownPoints.forEach(var2x -> var3.offerInjectionPoint(this.getVersion(), (Class<? extends InjectionPoint>)var2x));
   }

   @Override
   public void offerPackage(int var1, String var2) {
      this.requireNotInitialized();
      this.offeredPackages.add(new Versioned<>(var1, var2));
      this.allPackages.add(new Versioned<>(var1, var2));
      this.ownInjectors.forEach(var2x -> this.registerInjector((Class<? extends InjectionInfo>)var2x, var2));

      for (Versioned var4 : this.ownGatedInjectors) {
         if (var1 >= var4.version) {
            this.registerInjector((Class<? extends InjectionInfo>)var4.value, var2);
         }
      }
   }

   @Override
   public void offerExtension(int var1, IExtension var2) {
      this.requireNotInitialized();
      this.offeredExtensions.add(new Versioned<>(var1, var2));
   }

   @Override
   public void offerInjector(int var1, Class<? extends InjectionInfo> var2) {
      this.requireNotInitialized();
      this.offeredInjectors.add(new Versioned<>(var1, var2));
   }

   @Override
   public void offerInjectionPoint(int var1, Class<? extends InjectionPoint> var2) {
      this.requireNotInitialized();
      this.offeredPoints.add(new Versioned<>(var1, var2));
   }

   @Override
   public String toString() {
      return String.format("%s(version=%s)", this.getClass().getName(), MixinExtrasVersion.LATEST);
   }

   @Override
   public void initialize() {
      this.requireNotInitialized();
      LOGGER.info("Initializing MixinExtras via {}.", this);
      this.detectBetaPackages();
      this.internalInjectors.forEach(InjectionInfo::register);
      this.ownPoints.forEach(MixinInternals::registerInjectionPoint);
      this.initialized = true;
   }

   private void deInitialize() {
      for (IExtension var2 : this.ownExtensions) {
         MixinInternals.unregisterExtension(var2);
      }

      this.registeredInjectors.forEach(MixinInternals::unregisterInjector);
   }

   private void registerInjector(Class<? extends InjectionInfo> var1, String var2) {
      String var3 = var1.getAnnotation(InjectionInfo.AnnotationType.class).value().getName();
      String var4 = StringUtils.removeStart(var3, this.ownPackage);
      this.registeredInjectors.add(var2 + var4);
      MixinInternals.registerInjector(var2 + var4, var1);
   }

   public Type changePackage(Class<?> var1, Type var2, Class<?> var3) {
      String var4 = StringUtils.substringAfter(var3.getName(), this.ownPackage);
      String var5 = StringUtils.substringBefore(var2.getClassName(), var4);
      return Type.getObjectType((var5 + StringUtils.substringAfter(var1.getName(), this.ownPackage)).replace('.', '/'));
   }

   public Set<String> getAllClassNames(String var1) {
      return this.getAllClassNamesAtLeast(var1, Integer.MIN_VALUE);
   }

   public Set<String> getAllClassNamesAtLeast(String var1, MixinExtrasVersion var2) {
      return this.getAllClassNamesAtLeast(var1, var2.getNumber());
   }

   private Set<String> getAllClassNamesAtLeast(String var1, int var2) {
      String var3 = var1.replace('/', '.');
      return this.allPackages
         .stream()
         .filter(var1x -> var1x.version >= var2)
         .map(var0 -> var0.value)
         .map(var2x -> StringUtils.replaceOnce(var3, this.ownPackage, var2x))
         .collect(Collectors.toSet());
   }

   public boolean isClassOwned(String var1) {
      return this.allPackages.stream().map(var0 -> var0.value).anyMatch(var1::startsWith);
   }

   private void requireNotInitialized() {
      if (this.initialized) {
         throw new IllegalStateException("The MixinExtras service has already been selected and is initialized!");
      }
   }

   private void detectBetaPackages() {
      for (IExtension var2 : MixinInternals.getExtensions().getActiveExtensions()) {
         String var3 = var2.getClass().getName();
         String var4 = ".sugar.impl.SugarApplicatorExtension";
         if (var3.endsWith(var4) && !this.isClassOwned(var3)) {
            String var5 = StringUtils.removeEnd(var3, var4);
            MixinExtrasVersion var6 = this.getBetaVersion(var5);
            this.allPackages.add(new Versioned<>(var6.getNumber(), var5));
            LOGGER.warn("Found problematic active MixinExtras instance at {} (version {})", var5, var6);
            LOGGER.warn("Versions from 0.2.0-beta.1 to 0.2.0-beta.9 have limited support and it is strongly recommended to update.");
         }
      }
   }

   private MixinExtrasVersion getBetaVersion(String var1) {
      String var2 = var1 + ".MixinExtrasBootstrap";

      try {
         Class var3 = Class.forName(var2);
         Field var4 = var3.getDeclaredField("VERSION");
         var4.setAccessible(true);
         String var5 = (String)var4.get(null);
         switch (var5) {
            case "0.2.0-beta.1":
               return MixinExtrasVersion.V0_2_0_BETA_1;
            case "0.2.0-beta.2":
               return MixinExtrasVersion.V0_2_0_BETA_2;
            case "0.2.0-beta.3":
               return MixinExtrasVersion.V0_2_0_BETA_3;
            case "0.2.0-beta.4":
               return MixinExtrasVersion.V0_2_0_BETA_4;
            case "0.2.0-beta.5":
               return MixinExtrasVersion.V0_2_0_BETA_5;
            case "0.2.0-beta.6":
               return MixinExtrasVersion.V0_2_0_BETA_6;
            case "0.2.0-beta.7":
               return MixinExtrasVersion.V0_2_0_BETA_7;
            case "0.2.0-beta.8":
               return MixinExtrasVersion.V0_2_0_BETA_8;
            case "0.2.0-beta.9":
               return MixinExtrasVersion.V0_2_0_BETA_9;
            default:
               throw new IllegalArgumentException("Unrecognized version " + var5);
         }
      } catch (Exception var8) {
         LOGGER.error(String.format("Failed to determine version of MixinExtras instance at %s, assuming 0.2.0-beta.1", var1), var8);
         return MixinExtrasVersion.V0_2_0_BETA_1;
      }
   }
}
