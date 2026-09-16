package org.objectweb.asm.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

public final class TraceSignatureVisitor extends SignatureVisitor {
   private static final String COMMA_SEPARATOR = ", ";
   private static final String EXTENDS_SEPARATOR = " extends ";
   private static final String IMPLEMENTS_SEPARATOR = " implements ";
   private static final Map<Character, String> BASE_TYPES;
   private final boolean isInterface;
   private final StringBuilder declaration;
   private StringBuilder returnType;
   private StringBuilder exceptions;
   private boolean formalTypeParameterVisited;
   private boolean interfaceBoundVisited;
   private boolean parameterTypeVisited;
   private boolean interfaceVisited;
   private ArrayList<TraceSignatureVisitor.Task> pendingTasks = new ArrayList<>();
   private String separator = "";

   public TraceSignatureVisitor(int var1) {
      super(589824);
      this.isInterface = (var1 & 512) != 0;
      this.declaration = new StringBuilder();
   }

   private TraceSignatureVisitor(StringBuilder var1) {
      super(589824);
      this.isInterface = false;
      this.declaration = var1;
   }

   @Override
   public void visitFormalTypeParameter(String var1) {
      this.declaration.append(this.formalTypeParameterVisited ? ", " : "<").append(var1);
      this.formalTypeParameterVisited = true;
      this.interfaceBoundVisited = false;
   }

   @Override
   public SignatureVisitor visitClassBound() {
      this.separator = " extends ";
      return this;
   }

   @Override
   public SignatureVisitor visitInterfaceBound() {
      this.separator = this.interfaceBoundVisited ? ", " : " extends ";
      this.interfaceBoundVisited = true;
      return this;
   }

   @Override
   public SignatureVisitor visitSuperclass() {
      this.endFormals();
      this.separator = " extends ";
      return this;
   }

   @Override
   public SignatureVisitor visitInterface() {
      if (this.interfaceVisited) {
         this.separator = ", ";
      } else {
         this.separator = this.isInterface ? " extends " : " implements ";
         this.interfaceVisited = true;
      }

      return this;
   }

   @Override
   public SignatureVisitor visitParameterType() {
      this.endFormals();
      if (this.parameterTypeVisited) {
         this.declaration.append(", ");
      } else {
         this.declaration.append('(');
         this.parameterTypeVisited = true;
      }

      return this;
   }

   @Override
   public SignatureVisitor visitReturnType() {
      this.endFormals();
      if (this.parameterTypeVisited) {
         this.parameterTypeVisited = false;
      } else {
         this.declaration.append('(');
      }

      this.declaration.append(')');
      this.returnType = new StringBuilder();
      return new TraceSignatureVisitor(this.returnType);
   }

   @Override
   public SignatureVisitor visitExceptionType() {
      if (this.exceptions == null) {
         this.exceptions = new StringBuilder();
      } else {
         this.exceptions.append(", ");
      }

      return new TraceSignatureVisitor(this.exceptions);
   }

   @Override
   public void visitBaseType(char var1) {
      String var2 = BASE_TYPES.get(var1);
      if (var2 == null) {
         throw new IllegalArgumentException();
      }

      this.declaration.append(var2);
      this.endType();
   }

   @Override
   public void visitTypeVariable(String var1) {
      this.declaration.append(this.separator).append(var1);
      this.separator = "";
      this.endType();
   }

   @Override
   public SignatureVisitor visitArrayType() {
      this.pendingTasks.add(TraceSignatureVisitor.Task.END_ARRAY_TYPE);
      return this;
   }

   @Override
   public void visitClassType(String var1) {
      if ("java/lang/Object".equals(var1)) {
         boolean var2 = !this.pendingTasks.isEmpty()
               && this.pendingTasks.get(this.pendingTasks.size() - 1) == TraceSignatureVisitor.Task.END_NON_EMPTY_TYPE_ARGUMENTS
            || this.parameterTypeVisited;
         if (var2) {
            this.declaration.append(this.separator).append(var1.replace('/', '.'));
         }
      } else {
         this.declaration.append(this.separator).append(var1.replace('/', '.'));
      }

      this.separator = "";
      this.pendingTasks.add(TraceSignatureVisitor.Task.END_EMPTY_TYPE_ARGUMENTS);
   }

   @Override
   public void visitInnerClassType(String var1) {
      this.endTypeArguments();
      this.declaration.append('.').append(this.separator).append(var1.replace('/', '.'));
      this.pendingTasks.add(TraceSignatureVisitor.Task.END_EMPTY_TYPE_ARGUMENTS);
      this.separator = "";
   }

   @Override
   public void visitTypeArgument() {
      int var1 = this.pendingTasks.size() - 1;
      if (this.pendingTasks.get(var1) == TraceSignatureVisitor.Task.END_EMPTY_TYPE_ARGUMENTS) {
         this.pendingTasks.set(var1, TraceSignatureVisitor.Task.END_NON_EMPTY_TYPE_ARGUMENTS);
         this.declaration.append('<');
      } else {
         this.declaration.append(", ");
      }

      this.declaration.append('?');
   }

   @Override
   public SignatureVisitor visitTypeArgument(char var1) {
      int var2 = this.pendingTasks.size() - 1;
      if (this.pendingTasks.get(var2) == TraceSignatureVisitor.Task.END_EMPTY_TYPE_ARGUMENTS) {
         this.pendingTasks.set(var2, TraceSignatureVisitor.Task.END_NON_EMPTY_TYPE_ARGUMENTS);
         this.declaration.append('<');
      } else {
         this.declaration.append(", ");
      }

      if (var1 == '+') {
         this.declaration.append("? extends ");
      } else if (var1 == '-') {
         this.declaration.append("? super ");
      }

      return this;
   }

   @Override
   public void visitEnd() {
      this.endTypeArguments();
      this.endType();
   }

   public String getDeclaration() {
      return this.declaration.toString();
   }

   public String getReturnType() {
      return this.returnType == null ? null : this.returnType.toString();
   }

   public String getExceptions() {
      return this.exceptions == null ? null : this.exceptions.toString();
   }

   private void endFormals() {
      if (this.formalTypeParameterVisited) {
         this.declaration.append('>');
         this.formalTypeParameterVisited = false;
      }
   }

   private void endTypeArguments() {
      if (this.pendingTasks.remove(this.pendingTasks.size() - 1) == TraceSignatureVisitor.Task.END_NON_EMPTY_TYPE_ARGUMENTS) {
         this.declaration.append('>');
      }
   }

   private void endType() {
      int var1 = this.pendingTasks.size();

      while (var1 > 0) {
         if (this.pendingTasks.get(--var1) != TraceSignatureVisitor.Task.END_ARRAY_TYPE) {
            break;
         }

         this.declaration.append("[]");
         this.pendingTasks.remove(var1);
      }
   }

   static {
      HashMap var0 = new HashMap();
      var0.put('Z', "boolean");
      var0.put('B', "byte");
      var0.put('C', "char");
      var0.put('S', "short");
      var0.put('I', "int");
      var0.put('J', "long");
      var0.put('F', "float");
      var0.put('D', "double");
      var0.put('V', "void");
      BASE_TYPES = Collections.unmodifiableMap(var0);
   }

   enum Task {
      END_ARRAY_TYPE,
      END_EMPTY_TYPE_ARGUMENTS,
      END_NON_EMPTY_TYPE_ARGUMENTS;
   }
}
