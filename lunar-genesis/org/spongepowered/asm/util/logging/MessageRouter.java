package org.spongepowered.asm.util.logging;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic.Kind;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.logging.Level;
import org.spongepowered.asm.service.MixinService;

public final class MessageRouter {
   private static Messager messager;

   private MessageRouter() {
   }

   public static Messager getMessager() {
      if (messager == null) {
         messager = new MessageRouter.LoggingMessager();
      }

      return messager;
   }

   public static void setMessager(Messager var0) {
      messager = var0 == null ? null : new MessageRouter.DebugInterceptingMessager(var0);
   }

   static class DebugInterceptingMessager implements Messager {
      private final Messager wrapped;

      DebugInterceptingMessager(Messager var1) {
         this.wrapped = var1;
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2) {
         if (var1 != Kind.OTHER) {
            this.wrapped.printMessage(var1, var2);
         }
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3) {
         if (var1 != Kind.OTHER) {
            this.wrapped.printMessage(var1, var2, var3);
         }
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4) {
         if (var1 != Kind.OTHER) {
            this.wrapped.printMessage(var1, var2, var3, var4);
         }
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
         if (var1 != Kind.OTHER) {
            this.wrapped.printMessage(var1, var2, var3, var4, var5);
         }
      }
   }

   static class LoggingMessager implements Messager {
      private static final ILogger logger = MixinService.getService().getLogger("mixin");

      @Override
      public void printMessage(Kind var1, CharSequence var2) {
         logger.log(messageKindToLoggingLevel(var1), var2.toString());
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3) {
         logger.log(messageKindToLoggingLevel(var1), var2.toString());
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4) {
         logger.log(messageKindToLoggingLevel(var1), var2.toString());
      }

      @Override
      public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
         logger.log(messageKindToLoggingLevel(var1), var2.toString());
      }

      private static Level messageKindToLoggingLevel(Kind var0) {
         switch (var0) {
            case ERROR:
               return Level.ERROR;
            case WARNING:
            case MANDATORY_WARNING:
               return Level.WARN;
            case NOTE:
               return Level.INFO;
            case OTHER:
            default:
               return Level.DEBUG;
         }
      }
   }
}
