package org.spongepowered.tools.obfuscation.interfaces;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic.Kind;

public interface IMessagerEx extends Messager {
   void printMessage(IMessagerEx.MessageType var1, CharSequence var2);

   void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3);

   void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4);

   void printMessage(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5);

   enum MessageType {
      INFO(Kind.NOTE),
      NOTE(Kind.NOTE),
      ERROR(Kind.ERROR),
      WARNING(Kind.WARNING),
      MIXIN_ON_INVALID_TYPE(Kind.ERROR),
      MIXIN_SOFT_TARGET_NOT_FOUND(Kind.ERROR),
      MIXIN_SOFT_TARGET_NOT_RESOLVED(Kind.WARNING),
      MIXIN_SOFT_TARGET_IS_PUBLIC(Kind.WARNING),
      MIXIN_NO_TARGETS(Kind.ERROR),
      PARENT_VALIDATOR(Kind.ERROR),
      TARGET_VALIDATOR(Kind.ERROR),
      ACCESSOR_ATTACH_ERROR(Kind.ERROR),
      ACCESSOR_TARGET_NOT_FOUND(Kind.ERROR),
      ACCESSOR_TYPE_UNSUPPORTED(Kind.WARNING),
      ACCESSOR_NAME_UNRESOLVED(Kind.WARNING),
      INVOKER_RAW_RETURN_TYPE(Kind.WARNING),
      FACTORY_INVOKER_GENERIC_ARGS(Kind.ERROR),
      FACTORY_INVOKER_RETURN_TYPE(Kind.ERROR),
      FACTORY_INVOKER_NONSTATIC(Kind.ERROR),
      CONSTRAINT_VIOLATION(Kind.ERROR),
      INVALID_CONSTRAINT(Kind.WARNING),
      ACCESSOR_MAPPING_CONFLICT(Kind.ERROR),
      INJECTOR_MAPPING_CONFLICT(Kind.ERROR),
      OVERWRITE_MAPPING_CONFLICT(Kind.ERROR),
      SHADOW_MAPPING_CONFLICT(Kind.ERROR),
      INJECTOR_IN_INTERFACE(Kind.ERROR),
      INJECTOR_ON_NON_METHOD_ELEMENT(Kind.WARNING),
      OVERWRITE_ON_NON_METHOD_ELEMENT(Kind.ERROR),
      ACCESSOR_ON_NON_METHOD_ELEMENT(Kind.ERROR),
      SHADOW_ON_INVALID_ELEMENT(Kind.ERROR),
      INJECTOR_ON_NON_MIXIN_METHOD(Kind.ERROR),
      OVERWRITE_ON_NON_MIXIN_METHOD(Kind.ERROR),
      ACCESSOR_ON_NON_MIXIN_METHOD(Kind.ERROR),
      SHADOW_ON_NON_MIXIN_ELEMENT(Kind.ERROR),
      SOFT_IMPLEMENTS_ON_INVALID_TYPE(Kind.ERROR),
      SOFT_IMPLEMENTS_ON_NON_MIXIN(Kind.ERROR),
      SOFT_IMPLEMENTS_EMPTY(Kind.WARNING),
      TARGET_SELECTOR_VALIDATION(Kind.ERROR),
      INJECTOR_TARGET_NOT_FULLY_QUALIFIED(Kind.ERROR),
      MISSING_INJECTOR_DESC_MULTITARGET(Kind.ERROR),
      MISSING_INJECTOR_DESC_SINGLETARGET(Kind.WARNING),
      MISSING_INJECTOR_DESC_SIMULATED(Kind.OTHER),
      TARGET_ELEMENT_NOT_FOUND(Kind.WARNING),
      METHOD_VISIBILITY(Kind.WARNING),
      NO_OBFDATA_FOR_ACCESSOR(Kind.WARNING),
      NO_OBFDATA_FOR_CLASS(Kind.WARNING),
      NO_OBFDATA_FOR_TARGET(Kind.ERROR),
      NO_OBFDATA_FOR_CTOR(Kind.WARNING),
      NO_OBFDATA_FOR_OVERWRITE(Kind.ERROR),
      NO_OBFDATA_FOR_STATIC_OVERWRITE(Kind.WARNING),
      NO_OBFDATA_FOR_FIELD(Kind.WARNING),
      NO_OBFDATA_FOR_METHOD(Kind.WARNING),
      NO_OBFDATA_FOR_SHADOW(Kind.WARNING),
      NO_OBFDATA_FOR_SIMULATED_SHADOW(Kind.WARNING),
      NO_OBFDATA_FOR_SOFT_IMPLEMENTS(Kind.ERROR),
      BARE_REFERENCE(Kind.WARNING),
      OVERWRITE_DOCS(Kind.WARNING);

      private static boolean decorate = false;
      private static String prefix = "";
      private final Kind originalKind;
      private Kind kind;
      private boolean enabled = true;
      private boolean setByUser = false;

      MessageType(Kind var3) {
         this.originalKind = this.kind = var3;
      }

      public boolean isError() {
         return this.kind == Kind.ERROR;
      }

      public Kind getKind() {
         return this.kind;
      }

      public void setKind(Kind var1) {
         this.kind = var1;
         this.setByUser = true;
      }

      public void quench(Kind var1) {
         if (!this.setByUser && var1.ordinal() > this.kind.ordinal()) {
            this.kind = var1;
         }
      }

      public boolean isEnabled() {
         return this.enabled;
      }

      public void setEnabled(boolean var1) {
         this.enabled = var1;
         this.setByUser = true;
      }

      public void reset() {
         this.kind = this.originalKind;
         this.enabled = true;
         this.setByUser = false;
      }

      public CharSequence decorate(CharSequence var1) {
         return decorate ? String.format("%s[%s] %s", prefix, this.name(), var1) : prefix + var1;
      }

      public static void setDecoration(boolean var0) {
         decorate = var0;
      }

      public static void setPrefix(String var0) {
         prefix = var0;
      }

      public static Set<String> getSupportedOptions() {
         HashSet var0 = new HashSet();

         for (IMessagerEx.MessageType var4 : values()) {
            var0.add("MSG_" + var4.name());
         }

         return var0;
      }

      public static void applyOptions(IMixinAnnotationProcessor.CompilerEnvironment var0, IOptionProvider var1) {
         setDecoration("true".equalsIgnoreCase(var1.getOption("showMessageTypes")));
         INFO.setEnabled(!var0.isDevelopmentEnvironment() && !"true".equalsIgnoreCase(var1.getOption("quiet")));
         INJECTOR_IN_INTERFACE.setEnabled(var1.getOption("disableInterfaceMixins", false));
         if ("error".equalsIgnoreCase(var1.getOption("overwriteErrorLevel"))) {
            OVERWRITE_DOCS.setKind(Kind.ERROR);
         }

         for (IMessagerEx.MessageType var5 : values()) {
            String var6 = var1.getOption("MSG_" + var5.name());
            if (var6 != null) {
               if ("note".equalsIgnoreCase(var6)) {
                  var5.setKind(Kind.NOTE);
               } else if ("warning".equalsIgnoreCase(var6)) {
                  var5.setKind(Kind.WARNING);
               } else if ("error".equalsIgnoreCase(var6)) {
                  var5.setKind(Kind.ERROR);
               } else if ("disabled".equalsIgnoreCase(var6)) {
                  var5.setEnabled(false);
               }
            }
         }
      }
   }
}
