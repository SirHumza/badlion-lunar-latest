package org.objectweb.asm.signature;

public class SignatureWriter extends SignatureVisitor {
   private final StringBuilder stringBuilder;
   private boolean hasFormals;
   private boolean hasParameters;
   private int argumentStack = 1;

   public SignatureWriter() {
      this(new StringBuilder());
   }

   private SignatureWriter(StringBuilder var1) {
      super(589824);
      this.stringBuilder = var1;
   }

   @Override
   public void visitFormalTypeParameter(String var1) {
      if (!this.hasFormals) {
         this.hasFormals = true;
         this.stringBuilder.append('<');
      }

      this.stringBuilder.append(var1).append(':');
   }

   @Override
   public SignatureVisitor visitClassBound() {
      return this;
   }

   @Override
   public SignatureVisitor visitInterfaceBound() {
      this.stringBuilder.append(':');
      return this;
   }

   @Override
   public SignatureVisitor visitSuperclass() {
      this.endFormals();
      return this;
   }

   @Override
   public SignatureVisitor visitInterface() {
      return this;
   }

   @Override
   public SignatureVisitor visitParameterType() {
      this.endFormals();
      if (!this.hasParameters) {
         this.hasParameters = true;
         this.stringBuilder.append('(');
      }

      return this;
   }

   @Override
   public SignatureVisitor visitReturnType() {
      this.endFormals();
      if (!this.hasParameters) {
         this.stringBuilder.append('(');
      }

      this.stringBuilder.append(')');
      return this;
   }

   @Override
   public SignatureVisitor visitExceptionType() {
      this.stringBuilder.append('^');
      return this;
   }

   @Override
   public void visitBaseType(char var1) {
      this.stringBuilder.append(var1);
   }

   @Override
   public void visitTypeVariable(String var1) {
      this.stringBuilder.append('T').append(var1).append(';');
   }

   @Override
   public SignatureVisitor visitArrayType() {
      this.stringBuilder.append('[');
      return this;
   }

   @Override
   public void visitClassType(String var1) {
      this.stringBuilder.append('L').append(var1);
      this.argumentStack <<= 1;
   }

   @Override
   public void visitInnerClassType(String var1) {
      this.endArguments();
      this.stringBuilder.append('.').append(var1);
      this.argumentStack <<= 1;
   }

   @Override
   public void visitTypeArgument() {
      if ((this.argumentStack & 1) == 0) {
         this.argumentStack |= 1;
         this.stringBuilder.append('<');
      }

      this.stringBuilder.append('*');
   }

   @Override
   public SignatureVisitor visitTypeArgument(char var1) {
      if ((this.argumentStack & 1) == 0) {
         this.argumentStack |= 1;
         this.stringBuilder.append('<');
      }

      if (var1 != '=') {
         this.stringBuilder.append(var1);
      }

      return (this.argumentStack & -2147483648) == 0 ? this : new SignatureWriter(this.stringBuilder);
   }

   @Override
   public void visitEnd() {
      this.endArguments();
      this.stringBuilder.append(';');
   }

   @Override
   public String toString() {
      return this.stringBuilder.toString();
   }

   private void endFormals() {
      if (this.hasFormals) {
         this.hasFormals = false;
         this.stringBuilder.append('>');
      }
   }

   private void endArguments() {
      if ((this.argumentStack & 1) == 1) {
         this.stringBuilder.append('>');
      }

      this.argumentStack >>>= 1;
   }
}
