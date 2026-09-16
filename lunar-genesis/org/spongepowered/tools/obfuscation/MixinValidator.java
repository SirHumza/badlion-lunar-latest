package org.spongepowered.tools.obfuscation;

import java.util.Collection;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import org.spongepowered.asm.util.asm.IAnnotationHandle;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerSuppressible;
import org.spongepowered.tools.obfuscation.interfaces.IMixinAnnotationProcessor;
import org.spongepowered.tools.obfuscation.interfaces.IMixinValidator;
import org.spongepowered.tools.obfuscation.interfaces.IOptionProvider;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;
import org.spongepowered.tools.obfuscation.mirror.TypeHandle;

public abstract class MixinValidator implements IMixinValidator {
   protected final ProcessingEnvironment processingEnv;
   protected final IMessagerSuppressible messager;
   protected final IOptionProvider options;
   protected final ITypeHandleProvider typeHandleProvider;
   protected final IMixinValidator.ValidationPass pass;

   public MixinValidator(IMixinAnnotationProcessor var1, IMixinValidator.ValidationPass var2) {
      this.processingEnv = var1.getProcessingEnvironment();
      this.messager = var1;
      this.options = var1;
      this.typeHandleProvider = var1.getTypeProvider();
      this.pass = var2;
   }

   @Override
   public final boolean validate(IMixinValidator.ValidationPass var1, TypeElement var2, IAnnotationHandle var3, Collection<TypeHandle> var4) {
      return var1 != this.pass ? true : this.validate(var2, var3, var4);
   }

   protected abstract boolean validate(TypeElement var1, IAnnotationHandle var2, Collection<TypeHandle> var3);

   protected final Collection<TypeHandle> getMixinsTargeting(TypeHandle var1) {
      return AnnotatedMixins.getMixinsForEnvironment(this.processingEnv).getMixinsTargeting(var1);
   }
}
