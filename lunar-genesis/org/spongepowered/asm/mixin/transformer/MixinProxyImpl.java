package org.spongepowered.asm.mixin.transformer;

import com.llamalad7.mixinextras.utils.ClassGenUtils;
import com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.MixinEnvProxy;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.mixin.transformer.throwables.IllegalClassLoadError;
import org.spongepowered.asm.util.asm.ASM;

public class MixinProxyImpl implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final boolean TEST_BACKUP_MIXIN_CLASSES = Boolean.parseBoolean(System.getProperty("ichor.backupMixinClasses", "true"));
   private static final Object MIXIN_APPLY_LOCK = new Object();
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH ichorClassLoader;
   private final String stage;
   private final MixinTransformer transformer = new MixinTransformer();
   private MixinProcessor processor;
   private final ThreadLocal<Boolean> handlingMixinError = ThreadLocal.withInitial(() -> false);

   public MixinProxyImpl(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.ichorClassLoader = var1;
      this.stage = var1.OCOIIRHCCOOHRHHCOCHIHIICRORRHR().name();
   }

   @Override
   public ClassNode transformClassNode(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, String var3, @Nullable ClassNode var4) {
      try {
         byte[] var5 = null;
         if (TEST_BACKUP_MIXIN_CLASSES && var4 != null) {
            try {
               boolean var6 = var1.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH().get("computeFrames") == Boolean.TRUE;
               var5 = var1.CHIOHRROCCRCCHHCCRRHCROOOICCOI().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.ichorClassLoader, var4, var6);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var4, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5, var6 ? 0 : 8)
               );
            } catch (Exception var12) {
               new IllegalStateException("Failed to backup " + var2 + " before Mixin application", var12).printStackTrace();
            }
         }

         try {
            long var15 = System.currentTimeMillis();
            MixinEnvironment var8 = MixinEnvironment.getCurrentEnvironment();
            synchronized (MIXIN_APPLY_LOCK) {
               if (var4 == null) {
                  var4 = createEmptyClass(var2);
                  if (!this.transformer.generateClass(var8, var2, var4)) {
                     var4 = null;
                  }
               } else {
                  this.transformer.transformClass(var8, var3, var4);
               }
            }

            long var16 = System.currentTimeMillis() - var15;
            if (OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HOCHROOCRIRCRIORCOCIHICRIIIIHH) {
               var1.ICRRROORIRORIHIOHCRCIIIHOORCIO().CIICOHCCHCCICCRRORHOIICCHHIRRH.compute(var3, (var2x, var3x) -> var3x == null ? var16 : var3x + var16);
            }

            return var4;
         } catch (Throwable var13) {
            String var7 = var13.getMessage();
            if (!(var13 instanceof IllegalClassLoadError)
               || !var7.contains("Illegal classload request for") && !var7.endsWith("and cannot be referenced directly")) {
               if (TEST_BACKUP_MIXIN_CLASSES && var5 != null) {
                  OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CHOCCCRCHIOCCOOICCOHOOIHROHIHI.info("Restoring " + var2 + " to backup before Mixin application");
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5, 0));
               }

               if (!this.handlingMixinError.get()) {
                  this.handlingMixinError.set(true);
                  var1.CCHORCOOOCRRRHHCRCRRCIHIICICCH().CIOHHCORHRCCRICCCORIHCRHCCCRRR(var13);
                  this.handlingMixinError.set(false);
               }

               var13.printStackTrace();
               throw new com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  "Failed to apply Mixins to " + var3 + ".", var13
               );
            } else {
               return var4;
            }
         }
      } catch (Throwable var14) {
         throw var14;
      }
   }

   @Override
   public void registerMixins(List<String> var1) {
      for (String var3 : var1) {
         try {
            ClassLoader var4 = MixinProxyImpl.class.getClassLoader();
            InputStream var5 = var4.getResourceAsStream(var3);
            if (var5 != null) {
               var5.close();
               if (System.getProperties().containsKey("ichor.debug.mixinConfigs")) {
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR.info("Loading Mixin config " + var3 + " in " + var4.getName());
               }

               Mixins.addConfiguration(var3);
            } else {
               OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR.info("Mixin config " + var3 + " doesn't exist in " + var4.getName());
            }
         } catch (IOException var6) {
            OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ERROR, "Error loading Mixin config " + var3);
            var6.printStackTrace();
         }
      }
   }

   @Override
   public void setMixinDecorations(List<String> var1, Map<String, Object> var2) {
      for (String var4 : var1) {
         for (Config var6 : Mixins.getConfigs()) {
            if (Objects.equals(var4, var6.getName())) {
               var2.forEach((var1x, var2x) -> {
                  if (!var6.getConfig().hasDecoration(var1x)) {
                     var6.getConfig().decorate(var1x, var2x);
                  }
               });
            }
         }
      }
   }

   @Override
   public void gotoDefaultPhase() {
      try {
         MixinEnvProxy.gotoDefaultPhase();
         MixinEnvironment var1 = MixinEnvironment.getCurrentEnvironment();
         Method var2 = this.getProcessor().getClass().getDeclaredMethod("checkSelect", MixinEnvironment.class);
         var2.setAccessible(true);
         var2.invoke(this.getProcessor(), var1);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   public MixinProcessor getProcessor() {
      try {
         if (this.processor == null) {
            Field var1 = this.transformer.getClass().getDeclaredField("processor");
            var1.setAccessible(true);
            this.processor = (MixinProcessor)var1.get(this.transformer);
         }

         return this.processor;
      } catch (Throwable var2) {
         throw var2;
      }
   }

   private List<MixinConfig> getConfigs() {
      try {
         MixinProcessor var1 = this.getProcessor();
         Field var2 = var1.getClass().getDeclaredField("configs");
         var2.setAccessible(true);
         return (List<MixinConfig>)var2.get(var1);
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @Override
   public Set<String> getMixinAndTargetClasses() {
      try {
         Field var1 = this.processor.getClass().getDeclaredField("configs");
         var1.setAccessible(true);
         List var2 = (List)var1.get(this.processor);
         HashSet var3 = new HashSet();

         for (MixinConfig var5 : var2) {
            for (String var7 : var5.getTargets()) {
               var3.add(var7);

               for (MixinInfo var9 : var5.getMixinsFor(var7)) {
                  var3.add(var9.getClassName());
               }
            }
         }

         Field var12 = MixinCoprocessorNestHost.class.getDeclaredField("nestHosts");
         var12.setAccessible(true);
         Field var13 = this.processor.getClass().getDeclaredField("coprocessors");
         var13.setAccessible(true);

         for (MixinCoprocessor var16 : (MixinCoprocessors)var13.get(this.processor)) {
            if (var16 instanceof MixinCoprocessorNestHost var17) {
               Map var10 = (Map)var12.get(var17);
               var10.forEach((var1x, var2x) -> var2x.forEach(var3::add));
            }
         }

         return var3;
      } catch (Throwable var11) {
         throw var11;
      }
   }

   @Override
   public Set<String> getSyntheticClasses() {
      try {
         Field var1 = this.transformer.getClass().getDeclaredField("syntheticClassRegistry");
         var1.setAccessible(true);
         SyntheticClassRegistry var2 = (SyntheticClassRegistry)var1.get(this.transformer);
         Field var3 = var2.getClass().getDeclaredField("classes");
         var3.setAccessible(true);
         Map var4 = (Map)var3.get(var2);
         return var4.keySet();
      } catch (ReflectiveOperationException var5) {
         var5.printStackTrace();
         return new HashSet<>();
      }
   }

   @Override
   public Map<String, byte[]> getExtraClassDefinitions() {
      return ClassGenUtils.getDefinitions();
   }

   public IMixinInfo getMixin(String var1, String var2) {
      ClassInfo var3 = ClassInfo.fromCache(var1);
      if (var3 == null) {
         return null;
      }

      Set var4 = var3.getAppliedMixins();
      IMixinInfo var5 = null;

      for (IMixinInfo var7 : var4) {
         ClassNode var8 = var7.getClassNode(0);

         for (MethodNode var10 : var8.methods) {
            if (var2.contains(var10.name)) {
               var5 = var7;
               break;
            }
         }
      }

      return var5;
   }

   @Override
   public void audit(ClassLoader var1) {
      for (MixinConfig var3 : this.getConfigs()) {
         for (String var7 : var3.getUnhandledTargets().toArray(String[]::new)) {
            try {
               Class.forName(var7, true, var1);
            } catch (NoClassDefFoundError | ClassNotFoundException | UnsatisfiedLinkError var9) {
               System.out.println("Failed to load target " + var7);
            }
         }
      }
   }

   @Override
   public String toString() {
      return "MixinProxyImpl{" + this.stage + "}";
   }

   public static ClassNode createEmptyClass(String var0) {
      ClassNode var1 = new ClassNode(ASM.API_VERSION);
      var1.name = var0.replace('.', '/');
      var1.version = MixinEnvironment.getCompatibilityLevel().getClassVersion();
      var1.superName = "java/lang/Object";
      return var1;
   }
}
