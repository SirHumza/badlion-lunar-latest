package org.objectweb.asm.util;

import java.util.EnumSet;
import org.objectweb.asm.signature.SignatureVisitor;

public class CheckSignatureAdapter extends SignatureVisitor {
   public static final int CLASS_SIGNATURE = 0;
   public static final int METHOD_SIGNATURE = 1;
   public static final int TYPE_SIGNATURE = 2;
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_FORMAL_TYPE_PARAMETER_STATES = EnumSet.of(
      CheckSignatureAdapter.State.EMPTY, CheckSignatureAdapter.State.FORMAL, CheckSignatureAdapter.State.BOUND
   );
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_CLASS_BOUND_STATES = EnumSet.of(CheckSignatureAdapter.State.FORMAL);
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_INTERFACE_BOUND_STATES = EnumSet.of(
      CheckSignatureAdapter.State.FORMAL, CheckSignatureAdapter.State.BOUND
   );
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_SUPER_CLASS_STATES = EnumSet.of(
      CheckSignatureAdapter.State.EMPTY, CheckSignatureAdapter.State.FORMAL, CheckSignatureAdapter.State.BOUND
   );
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_INTERFACE_STATES = EnumSet.of(CheckSignatureAdapter.State.SUPER);
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_PARAMETER_TYPE_STATES = EnumSet.of(
      CheckSignatureAdapter.State.EMPTY, CheckSignatureAdapter.State.FORMAL, CheckSignatureAdapter.State.BOUND, CheckSignatureAdapter.State.PARAM
   );
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_RETURN_TYPE_STATES = EnumSet.of(
      CheckSignatureAdapter.State.EMPTY, CheckSignatureAdapter.State.FORMAL, CheckSignatureAdapter.State.BOUND, CheckSignatureAdapter.State.PARAM
   );
   private static final EnumSet<CheckSignatureAdapter.State> VISIT_EXCEPTION_TYPE_STATES = EnumSet.of(CheckSignatureAdapter.State.RETURN);
   private static final String INVALID = "Invalid ";
   private final int type;
   private CheckSignatureAdapter.State state;
   private boolean canBeVoid;
   private final SignatureVisitor signatureVisitor;

   public CheckSignatureAdapter(int var1, SignatureVisitor var2) {
      this(589824, var1, var2);
   }

   protected CheckSignatureAdapter(int var1, int var2, SignatureVisitor var3) {
      super(var1);
      this.type = var2;
      this.state = CheckSignatureAdapter.State.EMPTY;
      this.signatureVisitor = var3;
   }

   @Override
   public void visitFormalTypeParameter(String var1) {
      if (this.type != 2 && VISIT_FORMAL_TYPE_PARAMETER_STATES.contains(this.state)) {
         this.checkIdentifier(var1, "formal type parameter");
         this.state = CheckSignatureAdapter.State.FORMAL;
         if (this.signatureVisitor != null) {
            this.signatureVisitor.visitFormalTypeParameter(var1);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitClassBound() {
      if (this.type != 2 && VISIT_CLASS_BOUND_STATES.contains(this.state)) {
         this.state = CheckSignatureAdapter.State.BOUND;
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitClassBound());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitInterfaceBound() {
      if (this.type != 2 && VISIT_INTERFACE_BOUND_STATES.contains(this.state)) {
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitInterfaceBound());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitSuperclass() {
      if (this.type == 0 && VISIT_SUPER_CLASS_STATES.contains(this.state)) {
         this.state = CheckSignatureAdapter.State.SUPER;
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitSuperclass());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitInterface() {
      if (this.type == 0 && VISIT_INTERFACE_STATES.contains(this.state)) {
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitInterface());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitParameterType() {
      if (this.type == 1 && VISIT_PARAMETER_TYPE_STATES.contains(this.state)) {
         this.state = CheckSignatureAdapter.State.PARAM;
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitParameterType());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitReturnType() {
      if (this.type == 1 && VISIT_RETURN_TYPE_STATES.contains(this.state)) {
         this.state = CheckSignatureAdapter.State.RETURN;
         CheckSignatureAdapter var1 = new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitReturnType());
         var1.canBeVoid = true;
         return var1;
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitExceptionType() {
      if (this.type == 1 && VISIT_EXCEPTION_TYPE_STATES.contains(this.state)) {
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitExceptionType());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void visitBaseType(char var1) {
      if (this.type == 2 && this.state == CheckSignatureAdapter.State.EMPTY) {
         if (var1 == 'V') {
            if (!this.canBeVoid) {
               throw new IllegalArgumentException("Base type descriptor can't be V");
            }
         } else if ("ZCBSIFJD".indexOf(var1) == -1) {
            throw new IllegalArgumentException("Base type descriptor must be one of ZCBSIFJD");
         }

         this.state = CheckSignatureAdapter.State.SIMPLE_TYPE;
         if (this.signatureVisitor != null) {
            this.signatureVisitor.visitBaseType(var1);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void visitTypeVariable(String var1) {
      if (this.type == 2 && this.state == CheckSignatureAdapter.State.EMPTY) {
         this.checkIdentifier(var1, "type variable");
         this.state = CheckSignatureAdapter.State.SIMPLE_TYPE;
         if (this.signatureVisitor != null) {
            this.signatureVisitor.visitTypeVariable(var1);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public SignatureVisitor visitArrayType() {
      if (this.type == 2 && this.state == CheckSignatureAdapter.State.EMPTY) {
         this.state = CheckSignatureAdapter.State.SIMPLE_TYPE;
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitArrayType());
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void visitClassType(String var1) {
      if (this.type == 2 && this.state == CheckSignatureAdapter.State.EMPTY) {
         this.checkClassName(var1, "class name");
         this.state = CheckSignatureAdapter.State.CLASS_TYPE;
         if (this.signatureVisitor != null) {
            this.signatureVisitor.visitClassType(var1);
         }
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void visitInnerClassType(String var1) {
      if (this.state != CheckSignatureAdapter.State.CLASS_TYPE) {
         throw new IllegalStateException();
      }

      this.checkIdentifier(var1, "inner class name");
      if (this.signatureVisitor != null) {
         this.signatureVisitor.visitInnerClassType(var1);
      }
   }

   @Override
   public void visitTypeArgument() {
      if (this.state != CheckSignatureAdapter.State.CLASS_TYPE) {
         throw new IllegalStateException();
      }

      if (this.signatureVisitor != null) {
         this.signatureVisitor.visitTypeArgument();
      }
   }

   @Override
   public SignatureVisitor visitTypeArgument(char var1) {
      if (this.state != CheckSignatureAdapter.State.CLASS_TYPE) {
         throw new IllegalStateException();
      } else if ("+-=".indexOf(var1) == -1) {
         throw new IllegalArgumentException("Wildcard must be one of +-=");
      } else {
         return new CheckSignatureAdapter(2, this.signatureVisitor == null ? null : this.signatureVisitor.visitTypeArgument(var1));
      }
   }

   @Override
   public void visitEnd() {
      if (this.state != CheckSignatureAdapter.State.CLASS_TYPE) {
         throw new IllegalStateException();
      }

      this.state = CheckSignatureAdapter.State.END;
      if (this.signatureVisitor != null) {
         this.signatureVisitor.visitEnd();
      }
   }

   private void checkClassName(String var1, String var2) {
      if (var1 != null && var1.length() != 0) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            if (".;[<>:".indexOf(var1.charAt(var3)) != -1) {
               throw new IllegalArgumentException(stringConcat$1(var2, var1));
            }
         }
      } else {
         throw new IllegalArgumentException(stringConcat$0(var2));
      }
   }

   private void checkIdentifier(String var1, String var2) {
      if (var1 != null && var1.length() != 0) {
         for (int var3 = 0; var3 < var1.length(); var3++) {
            if (".;[/<>:".indexOf(var1.charAt(var3)) != -1) {
               throw new IllegalArgumentException(stringConcat$3(var2, var1));
            }
         }
      } else {
         throw new IllegalArgumentException(stringConcat$2(var2));
      }
   }

   private enum State {
      EMPTY,
      FORMAL,
      BOUND,
      SUPER,
      PARAM,
      RETURN,
      SIMPLE_TYPE,
      CLASS_TYPE,
      END;
   }
}
