package org.spongepowered.tools.obfuscation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import javax.tools.Diagnostic.Kind;
import org.objectweb.asm.Type;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.util.ITokenProvider;
import org.spongepowered.asm.util.VersionNumber;
import org.spongepowered.asm.util.logging.MessageRouter;
import org.spongepowered.include.com.google.common.collect.ImmutableList;
import org.spongepowered.tools.obfuscation.interfaces.IJavadocProvider;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IMixinValidator;
import org.spongepowered.tools.obfuscation.interfaces.IObfuscationManager;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import org.spongepowered.tools.obfuscation.mirror.TypeHandleASM;
import org.spongepowered.tools.obfuscation.mirror.TypeHandleSimulated;
import org.spongepowered.tools.obfuscation.mirror.TypeReference;
import org.spongepowered.tools.obfuscation.mirror.TypeUtils;
import org.spongepowered.tools.obfuscation.struct.InjectorRemap;
import org.spongepowered.tools.obfuscation.validation.ParentValidator;
import org.spongepowered.tools.obfuscation.validation.TargetValidator;

final class AnnotatedMixins implements ITokenProvider, IJavadocProvider, IMixinAnnotationProcessor, ITypeHandleProvider {
   private static Map<ProcessingEnvironment, AnnotatedMixins> instances = new HashMap<>();
   private final IMixinAnnotationProcessor.CompilerEnvironment env;
   private final ProcessingEnvironment processingEnv;
   private final Map<String, AnnotatedMixin> mixins = new HashMap<>();
   private final List<AnnotatedMixin> mixinsForPass = new ArrayList<>();
   private final IObfuscationManager obf;
   private final List<IMixinValidator> validators;
   private final Map<String, Integer> tokenCache = new HashMap<>();
   private final TargetMap targets;
   private Properties properties;

   private AnnotatedMixins(ProcessingEnvironment var1) {
      this.env = IMixinAnnotationProcessor.CompilerEnvironment.detect(var1);
      this.processingEnv = var1;
      IMessagerEx.MessageType.applyOptions(this.env, this);
      MessageRouter.setMessager(var1.getMessager());
      String var2 = this.checkPluginVersion(this.getOption("pluginVersion"));
      String var3 = var2 != null ? String.format(" (MixinGradle Version=%s)", var2) : "";
      this.printMessage(IMessagerEx.MessageType.INFO, "SpongePowered MIXIN Annotation Processor Version=0.8.7" + var3);
      this.targets = this.initTargetMap();
      this.obf = new ObfuscationManager(this);
      this.obf.init();
      this.validators = ImmutableList.of(new ParentValidator(this), new TargetValidator(this));
      this.initTokenCache(this.getOption("tokens"));
   }

   private String checkPluginVersion(String var1) {
      if (var1 == null) {
         return null;
      }

      VersionNumber var2 = VersionNumber.parse(var1);
      VersionNumber var3 = VersionNumber.parse("0.7");
      if (var2.compareTo(var3) < 0) {
         this.printMessage(Kind.WARNING, String.format("MixinGradle version %s is out of date. Update to the recommended version %s", var2, var3));
      }

      return var2.toString();
   }

   protected TargetMap initTargetMap() {
      TargetMap var1 = TargetMap.create(System.getProperty("fabric.mixin.target.mapid"));
      System.setProperty("fabric.mixin.target.mapid", var1.getSessionId());
      String var2 = this.getOption("dependencyTargetsFile");
      if (var2 != null) {
         try {
            var1.readImports(new File(var2));
         } catch (IOException var4) {
            this.printMessage(Kind.WARNING, "Could not read from specified imports file: " + var2);
         }
      }

      return var1;
   }

   private void initTokenCache(String var1) {
      if (var1 != null) {
         Pattern var2 = Pattern.compile("^([A-Z0-9\\-_\\.]+)=([0-9]+)$");
         String[] var3 = var1.replaceAll("\\s", "").toUpperCase(Locale.ROOT).split("[;,]");

         for (String var7 : var3) {
            Matcher var8 = var2.matcher(var7);
            if (var8.matches()) {
               this.tokenCache.put(var8.group(1), Integer.parseInt(var8.group(2)));
            }
         }
      }
   }

   @Override
   public ITypeHandleProvider getTypeProvider() {
      return this;
   }

   @Override
   public ITokenProvider getTokenProvider() {
      return this;
   }

   @Override
   public IObfuscationManager getObfuscationManager() {
      return this.obf;
   }

   @Override
   public IJavadocProvider getJavadocProvider() {
      return this;
   }

   @Override
   public ProcessingEnvironment getProcessingEnvironment() {
      return this.processingEnv;
   }

   @Override
   public IMixinAnnotationProcessor.CompilerEnvironment getCompilerEnvironment() {
      return this.env;
   }

   @Override
   public Integer getToken(String var1) {
      if (this.tokenCache.containsKey(var1)) {
         return this.tokenCache.get(var1);
      }

      String var2 = this.getOption(var1);
      Integer var3 = null;

      try {
         var3 = Integer.parseInt(var2);
      } catch (Exception var5) {
      }

      this.tokenCache.put(var1, var3);
      return var3;
   }

   @Override
   public String getOption(String var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = this.processingEnv.getOptions().get(var1);
      return var2 != null ? var2 : this.getProperties().getProperty(var1);
   }

   @Override
   public String getOption(String var1, String var2) {
      String var3 = this.getOption(var1);
      return var3 != null ? var3 : var2;
   }

   @Override
   public boolean getOption(String var1, boolean var2) {
      String var3 = this.getOption(var1);
      return var3 != null ? Boolean.parseBoolean(var3) : var2;
   }

   @Override
   public List<String> getOptions(String var1) {
      ImmutableList.Builder var2 = ImmutableList.builder();
      String var3 = this.getOption(var1);
      if (var3 != null) {
         for (String var7 : var3.split(",")) {
            var2.add(var7);
         }
      }

      return var2.build();
   }

   public Properties getProperties() {
      if (this.properties == null) {
         this.properties = new Properties();

         try {
            Filer var1 = this.processingEnv.getFiler();
            FileObject var2 = var1.getResource(StandardLocation.SOURCE_PATH, "", "mixin.properties");
            if (var2 != null) {
               InputStream var3 = var2.openInputStream();
               this.properties.load(var3);
               var3.close();
            }
         } catch (Exception var4) {
         }
      }

      return this.properties;
   }

   public void writeMappings() {
      this.obf.writeMappings();
   }

   public void writeReferences() {
      this.obf.writeReferences();
   }

   public void registerMixin(TypeElement var1) {
      String var2 = var1.getQualifiedName().toString();
      if (!this.mixins.containsKey(var2)) {
         AnnotatedMixin var3 = new AnnotatedMixin(this, var1);
         this.targets.registerTargets(var3);
         var3.runValidators(IMixinValidator.ValidationPass.EARLY, this.validators);
         this.mixins.put(var2, var3);
         this.mixinsForPass.add(var3);
      }
   }

   public AnnotatedMixin getMixin(TypeElement var1) {
      return this.getMixin(var1.getQualifiedName().toString());
   }

   public AnnotatedMixin getMixin(String var1) {
      return this.mixins.get(var1);
   }

   public Collection<TypeHandle> getMixinsTargeting(TypeHandle var1) {
      ArrayList var2 = new ArrayList();

      for (TypeReference var4 : this.targets.getMixinsTargeting(var1)) {
         TypeHandle var5 = var4.getHandle(this);
         if (var5 != null) {
            var2.add(var5);
         }
      }

      return var2;
   }

   public void registerAccessor(TypeElement var1, ExecutableElement var2) {
      AnnotatedMixin var3 = this.getMixin(var1);
      if (var3 == null) {
         this.printMessage(IMessagerEx.MessageType.ACCESSOR_ON_NON_MIXIN_METHOD, "Found @Accessor annotation on a non-mixin method", var2);
      } else {
         AnnotationHandle var4 = AnnotationHandle.of(var2, Accessor.class);
         var3.registerAccessor(var2, var4, shouldRemap(var3, var4));
      }
   }

   public void registerInvoker(TypeElement var1, ExecutableElement var2) {
      AnnotatedMixin var3 = this.getMixin(var1);
      if (var3 == null) {
         this.printMessage(IMessagerEx.MessageType.ACCESSOR_ON_NON_MIXIN_METHOD, "Found @Invoker annotation on a non-mixin method", var2);
      } else {
         AnnotationHandle var4 = AnnotationHandle.of(var2, Invoker.class);
         var3.registerInvoker(var2, var4, shouldRemap(var3, var4));
      }
   }

   public void registerOverwrite(TypeElement var1, ExecutableElement var2) {
      AnnotatedMixin var3 = this.getMixin(var1);
      if (var3 == null) {
         this.printMessage(IMessagerEx.MessageType.OVERWRITE_ON_NON_MIXIN_METHOD, "Found @Overwrite annotation on a non-mixin method", var2);
      } else {
         AnnotationHandle var4 = AnnotationHandle.of(var2, Overwrite.class);
         var3.registerOverwrite(var2, var4, shouldRemap(var3, var4));
      }
   }

   public void registerShadow(TypeElement var1, VariableElement var2, AnnotationHandle var3) {
      AnnotatedMixin var4 = this.getMixin(var1);
      if (var4 == null) {
         this.printMessage(IMessagerEx.MessageType.SHADOW_ON_NON_MIXIN_ELEMENT, "Found @Shadow annotation on a non-mixin field", var2);
      } else {
         var4.registerShadow(var2, var3, shouldRemap(var4, var3));
      }
   }

   public void registerShadow(TypeElement var1, ExecutableElement var2, AnnotationHandle var3) {
      AnnotatedMixin var4 = this.getMixin(var1);
      if (var4 == null) {
         this.printMessage(IMessagerEx.MessageType.SHADOW_ON_NON_MIXIN_ELEMENT, "Found @Shadow annotation on a non-mixin method", var2);
      } else {
         var4.registerShadow(var2, var3, shouldRemap(var4, var3));
      }
   }

   public void registerInjector(TypeElement var1, ExecutableElement var2, AnnotationHandle var3) {
      AnnotatedMixin var4 = this.getMixin(var1);
      if (var4 == null) {
         this.printMessage(IMessagerEx.MessageType.INJECTOR_ON_NON_MIXIN_METHOD, "Found " + var3 + " annotation on a non-mixin method", var2);
      } else {
         InjectorRemap var5 = new InjectorRemap(shouldRemap(var4, var3));
         var4.registerInjector(var2, var3, var5);
         var5.dispatchPendingMessages(this);
      }
   }

   public void registerSoftImplements(TypeElement var1, AnnotationHandle var2) {
      AnnotatedMixin var3 = this.getMixin(var1);
      if (var3 == null) {
         this.printMessage(IMessagerEx.MessageType.SOFT_IMPLEMENTS_ON_NON_MIXIN, "Found @Implements annotation on a non-mixin class");
      } else {
         var3.registerSoftImplements(var2);
      }
   }

   public void onPassStarted() {
      this.mixinsForPass.clear();
   }

   public void onPassCompleted(RoundEnvironment var1) {
      if (!"true".equalsIgnoreCase(this.getOption("disableTargetExport"))) {
         this.targets.write(true);
      }

      for (AnnotatedMixin var3 : var1.processingOver() ? this.mixins.values() : this.mixinsForPass) {
         var3.runValidators(var1.processingOver() ? IMixinValidator.ValidationPass.FINAL : IMixinValidator.ValidationPass.LATE, this.validators);
      }
   }

   private static boolean shouldRemap(AnnotatedMixin var0, AnnotationHandle var1) {
      return var1.getBoolean("remap", var0.remap());
   }

   private static boolean shouldSuppress(Element var0, SuppressedBy var1) {
      if (var0 != null && var1 != null) {
         return AnnotationHandle.of(var0, SuppressWarnings.class).getList().contains(var1.getToken()) ? true : shouldSuppress(var0.getEnclosingElement(), var1);
      } else {
         return false;
      }
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2));
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2) {
      this.processingEnv.getMessager().printMessage(var1, var2);
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3) {
      this.processingEnv.getMessager().printMessage(var1, var2, var3);
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, SuppressedBy var4) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3, var4);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, SuppressedBy var4) {
      if (var1 != Kind.WARNING || !shouldSuppress(var3, var4)) {
         this.processingEnv.getMessager().printMessage(var1, var2, var3);
      }
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3, var4);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4) {
      this.processingEnv.getMessager().printMessage(var1, var2, var3, var4);
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4, SuppressedBy var5) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3, var4, var5);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, SuppressedBy var5) {
      if (var1 != Kind.WARNING || !shouldSuppress(var3, var5)) {
         this.processingEnv.getMessager().printMessage(var1, var2, var3, var4);
      }
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3, var4, var5);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
      this.processingEnv.getMessager().printMessage(var1, var2, var3, var4, var5);
   }

   @Override
   public void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5, SuppressedBy var6) {
      if (var1.isEnabled()) {
         this.printMessage(var1.getKind(), var1.decorate(var2), var3, var4, var5, var6);
      }
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5, SuppressedBy var6) {
      if (var1 != Kind.WARNING || !shouldSuppress(var3, var6)) {
         this.processingEnv.getMessager().printMessage(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public TypeHandle getTypeHandle(String var1) {
      var1 = var1.replace('/', '.');
      Elements var2 = this.processingEnv.getElementUtils();
      PackageElement var3 = null;
      int var4 = var1.lastIndexOf(46);
      if (var4 > -1) {
         String var5 = var1.substring(0, var4);
         var3 = var2.getPackageElement(var5);
      }

      if (var3 != null) {
         TypeHandle var9 = TypeHandleASM.of(var3, var1.substring(var4 + 1), this);
         if (var9 != null) {
            return var9;
         }
      }

      TypeElement var10 = this.getTypeElement(var1, var2);
      if (var10 != null) {
         try {
            return new TypeHandle(var10, this);
         } catch (NullPointerException var7) {
         }
      }

      return var3 != null ? new TypeHandle(var3, var1, this) : null;
   }

   @Override
   public TypeHandle getTypeHandle(Object var1) {
      if (var1 instanceof TypeHandle) {
         return (TypeHandle)var1;
      } else if (var1 instanceof DeclaredType) {
         return this.getTypeHandle(TypeUtils.getInternalName((DeclaredType)var1));
      } else if (var1 instanceof Type) {
         return this.getTypeHandle(((Type)var1).getClassName());
      } else if (var1 instanceof TypeElement) {
         return this.getTypeHandle(TypeUtils.getInternalName((TypeElement)var1));
      } else {
         return var1 instanceof String ? this.getTypeHandle(var1.toString()) : null;
      }
   }

   private TypeElement getTypeElement(String var1, Elements var2) {
      TypeElement var3 = var2.getTypeElement(var1);
      if (var3 == null && var1.indexOf(36) >= 0) {
         int var4 = var1.lastIndexOf(46);
         String var5 = var4 > -1 ? var1.substring(0, var4) : "";
         var1 = var1.substring(var5.length());
         var3 = var2.getTypeElement(var5 + var1.replace('$', '.'));
         if (var3 != null) {
            return var3;
         }

         char[] var6 = var1.toCharArray();
         char[] var7 = new char[var6.length];
         int var8 = 0;

         for (int var9 = 0; var9 < var6.length; var9++) {
            if (var6[var9] == '$') {
               var8++;
            }
         }

         if (var8 <= 10 && var8 >= 2) {
            for (int var14 = 1; var14 < 1 << var8 && var3 == null; var14++) {
               int var10 = var6.length - 1;
               int var11 = 0;

               while (var10 >= 0) {
                  var7[var10] = var6[var10] == '$' && (var14 & 1 << var11++) != 0 ? '.' : var6[var10];
                  var10--;
               }

               var3 = var2.getTypeElement(var5 + new String(var7));
            }

            return var3;
         } else {
            return null;
         }
      } else {
         return var3;
      }
   }

   @Override
   public TypeHandle getSimulatedHandle(String var1, TypeMirror var2) {
      var1 = var1.replace('/', '.');
      int var3 = var1.lastIndexOf(46);
      if (var3 > -1) {
         String var4 = var1.substring(0, var3);
         PackageElement var5 = this.processingEnv.getElementUtils().getPackageElement(var4);
         if (var5 != null) {
            return new TypeHandleSimulated(var5, var1, var2, this);
         }
      }

      return new TypeHandleSimulated(var1, var2, this);
   }

   @Override
   public String getJavadoc(Element var1) {
      Elements var2 = this.processingEnv.getElementUtils();
      return var2.getDocComment(var1);
   }

   public static AnnotatedMixins getMixinsForEnvironment(ProcessingEnvironment var0) {
      AnnotatedMixins var1 = instances.get(var0);
      if (var1 == null) {
         var1 = new AnnotatedMixins(var0);
         instances.put(var0, var1);
      }

      return var1;
   }
}
