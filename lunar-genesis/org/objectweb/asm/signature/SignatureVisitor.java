package org.objectweb.asm.signature;

public abstract class SignatureVisitor {
   public static final char EXTENDS = '+';
   public static final char SUPER = '-';
   public static final char INSTANCEOF = '=';
   protected final int api;

   protected SignatureVisitor(int var1) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {
         throw new IllegalArgumentException(stringConcat$0(var1));
      }

      this.api = var1;
   }

   public void visitFormalTypeParameter(String var1) {
   }

   public SignatureVisitor visitClassBound() {
      return this;
   }

   public SignatureVisitor visitInterfaceBound() {
      return this;
   }

   public SignatureVisitor visitSuperclass() {
      return this;
   }

   public SignatureVisitor visitInterface() {
      return this;
   }

   public SignatureVisitor visitParameterType() {
      return this;
   }

   public SignatureVisitor visitReturnType() {
      return this;
   }

   public SignatureVisitor visitExceptionType() {
      return this;
   }

   public void visitBaseType(char var1) {
   }

   public void visitTypeVariable(String var1) {
   }

   public SignatureVisitor visitArrayType() {
      return this;
   }

   public void visitClassType(String var1) {
   }

   public void visitInnerClassType(String var1) {
   }

   public void visitTypeArgument() {
   }

   public SignatureVisitor visitTypeArgument(char var1) {
      return this;
   }

   public void visitEnd() {
   }
}
