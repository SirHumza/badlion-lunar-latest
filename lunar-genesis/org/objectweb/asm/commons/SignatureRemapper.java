package org.objectweb.asm.commons;

import java.util.ArrayList;
import org.objectweb.asm.signature.SignatureVisitor;

public class SignatureRemapper extends SignatureVisitor {
   private final SignatureVisitor signatureVisitor;
   private final Remapper remapper;
   private ArrayList<String> classNames = new ArrayList<>();

   public SignatureRemapper(SignatureVisitor var1, Remapper var2) {
      this(589824, var1, var2);
   }

   protected SignatureRemapper(int var1, SignatureVisitor var2, Remapper var3) {
      super(var1);
      this.signatureVisitor = var2;
      this.remapper = var3;
   }

   @Override
   public void visitClassType(String var1) {
      this.classNames.add(var1);
      this.signatureVisitor.visitClassType(this.remapper.mapType(var1));
   }

   @Override
   public void visitInnerClassType(String var1) {
      String var2 = this.classNames.remove(this.classNames.size() - 1);
      String var3 = stringConcat$0(var2, var1);
      this.classNames.add(var3);
      String var4 = stringConcat$1(this.remapper.mapType(var2));
      String var5 = this.remapper.mapType(var3);
      int var6 = var5.startsWith(var4) ? var4.length() : var5.lastIndexOf(36) + 1;
      this.signatureVisitor.visitInnerClassType(var5.substring(var6));
   }

   @Override
   public void visitFormalTypeParameter(String var1) {
      this.signatureVisitor.visitFormalTypeParameter(var1);
   }

   @Override
   public void visitTypeVariable(String var1) {
      this.signatureVisitor.visitTypeVariable(var1);
   }

   @Override
   public SignatureVisitor visitArrayType() {
      this.signatureVisitor.visitArrayType();
      return this;
   }

   @Override
   public void visitBaseType(char var1) {
      this.signatureVisitor.visitBaseType(var1);
   }

   @Override
   public SignatureVisitor visitClassBound() {
      this.signatureVisitor.visitClassBound();
      return this;
   }

   @Override
   public SignatureVisitor visitExceptionType() {
      this.signatureVisitor.visitExceptionType();
      return this;
   }

   @Override
   public SignatureVisitor visitInterface() {
      this.signatureVisitor.visitInterface();
      return this;
   }

   @Override
   public SignatureVisitor visitInterfaceBound() {
      this.signatureVisitor.visitInterfaceBound();
      return this;
   }

   @Override
   public SignatureVisitor visitParameterType() {
      this.signatureVisitor.visitParameterType();
      return this;
   }

   @Override
   public SignatureVisitor visitReturnType() {
      this.signatureVisitor.visitReturnType();
      return this;
   }

   @Override
   public SignatureVisitor visitSuperclass() {
      this.signatureVisitor.visitSuperclass();
      return this;
   }

   @Override
   public void visitTypeArgument() {
      this.signatureVisitor.visitTypeArgument();
   }

   @Override
   public SignatureVisitor visitTypeArgument(char var1) {
      this.signatureVisitor.visitTypeArgument(var1);
      return this;
   }

   @Override
   public void visitEnd() {
      this.signatureVisitor.visitEnd();
      this.classNames.remove(this.classNames.size() - 1);
   }
}
