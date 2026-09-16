package org.spongepowered.asm.util;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.signature.SignatureWriter;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.util.asm.ASM;

public class ClassSignature {
   protected static final String OBJECT = "java/lang/Object";
   private final Map<ClassSignature.TypeVar, ClassSignature.TokenHandle> types = new LinkedHashMap<>();
   private ClassSignature.Token superClass = new ClassSignature.Token("java/lang/Object");
   private final List<ClassSignature.Token> interfaces = new ArrayList<>();
   private final Deque<String> rawInterfaces = new LinkedList<>();

   ClassSignature() {
   }

   private ClassSignature read(String var1) {
      if (var1 != null) {
         try {
            new SignatureReader(var1).accept(new ClassSignature.SignatureParser());
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

      return this;
   }

   protected ClassSignature.TypeVar getTypeVar(String var1) {
      for (ClassSignature.TypeVar var3 : this.types.keySet()) {
         if (var3.matches(var1)) {
            return var3;
         }
      }

      return null;
   }

   protected ClassSignature.TokenHandle getType(String var1) {
      for (ClassSignature.TypeVar var3 : this.types.keySet()) {
         if (var3.matches(var1)) {
            return this.types.get(var3);
         }
      }

      ClassSignature.TokenHandle var4 = new ClassSignature.TokenHandle();
      this.types.put(new ClassSignature.TypeVar(var1), var4);
      return var4;
   }

   protected String getTypeVar(ClassSignature.TokenHandle var1) {
      for (Entry var3 : this.types.entrySet()) {
         ClassSignature.TypeVar var4 = (ClassSignature.TypeVar)var3.getKey();
         ClassSignature.TokenHandle var5 = (ClassSignature.TokenHandle)var3.getValue();
         if (var1 == var5 || var1.asToken() == var5.asToken()) {
            return "T" + var4 + ";";
         }
      }

      return var1.token.asType();
   }

   protected void addTypeVar(ClassSignature.TypeVar var1, ClassSignature.TokenHandle var2) {
      if (this.types.containsKey(var1)) {
         throw new IllegalArgumentException("TypeVar " + var1 + " is already present on " + this);
      }

      this.types.put(var1, var2);
   }

   protected void setSuperClass(ClassSignature.Token var1) {
      this.superClass = var1;
   }

   public String getSuperClass() {
      return this.superClass.asType(true);
   }

   protected void addInterface(ClassSignature.Token var1) {
      if (!var1.isRaw()) {
         String var2 = var1.asType(true);
         ListIterator var3 = this.interfaces.listIterator();

         while (var3.hasNext()) {
            ClassSignature.Token var4 = (ClassSignature.Token)var3.next();
            if (var4.isRaw() && var4.asType(true).equals(var2)) {
               var3.set(var1);
               return;
            }
         }
      }

      this.interfaces.add(var1);
   }

   public void addInterface(String var1) {
      this.rawInterfaces.add(var1);
   }

   protected void addRawInterface(String var1) {
      ClassSignature.Token var2 = new ClassSignature.Token(var1);
      String var3 = var2.asType(true);

      for (ClassSignature.Token var5 : this.interfaces) {
         if (var5.asType(true).equals(var3)) {
            return;
         }
      }

      this.interfaces.add(var2);
   }

   public void merge(ClassSignature var1) {
      try {
         HashSet var2 = new HashSet();

         for (ClassSignature.TypeVar var4 : this.types.keySet()) {
            var2.add(var4.toString());
         }

         var1.conform(var2);
      } catch (IllegalStateException var5) {
         var5.printStackTrace();
         return;
      }

      for (Entry var8 : var1.types.entrySet()) {
         this.addTypeVar((ClassSignature.TypeVar)var8.getKey(), (ClassSignature.TokenHandle)var8.getValue());
      }

      for (ClassSignature.Token var9 : var1.interfaces) {
         this.addInterface(var9);
      }
   }

   private void conform(Set<String> var1) {
      for (ClassSignature.TypeVar var3 : this.types.keySet()) {
         String var4 = this.findUniqueName(var3.getOriginalName(), var1);
         var3.rename(var4);
         var1.add(var4);
      }
   }

   private String findUniqueName(String var1, Set<String> var2) {
      if (!var2.contains(var1)) {
         return var1;
      }

      if (var1.length() == 1) {
         String var3 = this.findOffsetName(var1.charAt(0), var2);
         if (var3 != null) {
            return var3;
         }
      }

      String var4 = this.findOffsetName('T', var2, "", var1);
      if (var4 != null) {
         return var4;
      } else {
         var4 = this.findOffsetName('T', var2, var1, "");
         if (var4 != null) {
            return var4;
         } else {
            var4 = this.findOffsetName('T', var2, "T", var1);
            if (var4 != null) {
               return var4;
            } else {
               var4 = this.findOffsetName('T', var2, "", var1 + "Type");
               if (var4 != null) {
                  return var4;
               } else {
                  throw new IllegalStateException("Failed to conform type var: " + var1);
               }
            }
         }
      }
   }

   private String findOffsetName(char var1, Set<String> var2) {
      return this.findOffsetName(var1, var2, "", "");
   }

   private String findOffsetName(char var1, Set<String> var2, String var3, String var4) {
      String var5 = String.format("%s%s%s", var3, var1, var4);
      if (!var2.contains(var5)) {
         return var5;
      }

      if (var1 > '@' && var1 < '[') {
         for (int var6 = var1 - '@'; var6 + 65 != var1; var6 = ++var6 % 26) {
            var5 = String.format("%s%s%s", var3, (char)(var6 + 65), var4);
            if (!var2.contains(var5)) {
               return var5;
            }
         }
      }

      return null;
   }

   public SignatureVisitor getRemapper() {
      return new ClassSignature.SignatureRemapper();
   }

   @Override
   public String toString() {
      while (this.rawInterfaces.size() > 0) {
         this.addRawInterface(this.rawInterfaces.remove());
      }

      StringBuilder var1 = new StringBuilder();
      if (this.types.size() > 0) {
         boolean var2 = false;
         StringBuilder var3 = new StringBuilder();

         for (Entry var5 : this.types.entrySet()) {
            String var6 = ((ClassSignature.TokenHandle)var5.getValue()).asBound();
            if (!var6.isEmpty()) {
               var3.append(var5.getKey()).append(':').append(var6);
               var2 = true;
            }
         }

         if (var2) {
            var1.append('<').append(var3).append('>');
         }
      }

      var1.append(this.superClass.asType());

      for (ClassSignature.Token var8 : this.interfaces) {
         var1.append(var8.asType());
      }

      return var1.toString();
   }

   public ClassSignature wake() {
      return this;
   }

   public static ClassSignature of(String var0) {
      return new ClassSignature().read(var0);
   }

   public static ClassSignature of(ClassNode var0) {
      return var0.signature != null ? of(var0.signature) : generate(var0);
   }

   public static ClassSignature ofLazy(ClassNode var0) {
      return var0.signature != null ? new ClassSignature.Lazy(var0.signature) : generate(var0);
   }

   private static ClassSignature generate(ClassNode var0) {
      ClassSignature var1 = new ClassSignature();
      var1.setSuperClass(new ClassSignature.Token(var0.superName != null ? var0.superName : "java/lang/Object"));

      for (String var3 : var0.interfaces) {
         var1.addInterface(new ClassSignature.Token(var3));
      }

      return var1;
   }

   interface IToken {
      String asType();

      ClassSignature.Token asToken();

      ClassSignature.IToken setArray(boolean var1);

      ClassSignature.IToken setWildcard(char var1);
   }

   static class Lazy extends ClassSignature {
      private final String sig;
      private ClassSignature generated;

      Lazy(String var1) {
         this.sig = var1;
      }

      @Override
      public ClassSignature wake() {
         if (this.generated == null) {
            this.generated = ClassSignature.of(this.sig);
         }

         return this.generated;
      }
   }

   class SignatureParser extends SignatureVisitor {
      private ClassSignature.SignatureParser.FormalParamElement param;

      SignatureParser() {
         super(ASM.API_VERSION);
      }

      @Override
      public void visitFormalTypeParameter(String var1) {
         this.param = new ClassSignature.SignatureParser.FormalParamElement(var1);
      }

      @Override
      public SignatureVisitor visitClassBound() {
         return this.param.visitClassBound();
      }

      @Override
      public SignatureVisitor visitInterfaceBound() {
         return this.param.visitInterfaceBound();
      }

      @Override
      public SignatureVisitor visitSuperclass() {
         return new ClassSignature.SignatureParser.SuperClassElement();
      }

      @Override
      public SignatureVisitor visitInterface() {
         return new ClassSignature.SignatureParser.InterfaceElement();
      }

      class BoundElement extends ClassSignature.SignatureParser.TokenElement {
         private final ClassSignature.SignatureParser.TokenElement type;
         private final boolean classBound;

         BoundElement(ClassSignature.SignatureParser.TokenElement var2, boolean var3) {
            this.type = var2;
            this.classBound = var3;
         }

         @Override
         public void visitClassType(String var1) {
            this.token = this.type.token.addBound(var1, this.classBound);
         }

         @Override
         public void visitTypeArgument() {
            this.token.addTypeArgument('*');
         }

         @Override
         public SignatureVisitor visitTypeArgument(char var1) {
            return SignatureParser.this.new TypeArgElement(this, var1);
         }
      }

      class FormalParamElement extends ClassSignature.SignatureParser.TokenElement {
         private final ClassSignature.TokenHandle handle;

         FormalParamElement(String var2) {
            this.handle = ClassSignature.this.getType(var2);
            this.token = this.handle.asToken();
         }
      }

      class InterfaceElement extends ClassSignature.SignatureParser.TokenElement {
         @Override
         public void visitEnd() {
            ClassSignature.this.addInterface(this.token);
         }
      }

      abstract class SignatureElement extends SignatureVisitor {
         public SignatureElement() {
            super(ASM.API_VERSION);
         }
      }

      class SuperClassElement extends ClassSignature.SignatureParser.TokenElement {
         @Override
         public void visitEnd() {
            ClassSignature.this.setSuperClass(this.token);
         }
      }

      abstract class TokenElement extends ClassSignature.SignatureParser.SignatureElement {
         protected ClassSignature.Token token;
         private boolean array;

         public ClassSignature.Token getToken() {
            if (this.token == null) {
               this.token = new ClassSignature.Token();
            }

            return this.token;
         }

         protected void setArray() {
            this.array = true;
         }

         private boolean getArray() {
            boolean var1 = this.array;
            this.array = false;
            return var1;
         }

         @Override
         public void visitClassType(String var1) {
            this.getToken().setType(var1);
         }

         @Override
         public SignatureVisitor visitClassBound() {
            this.getToken();
            return SignatureParser.this.new BoundElement(this, true);
         }

         @Override
         public SignatureVisitor visitInterfaceBound() {
            this.getToken();
            return SignatureParser.this.new BoundElement(this, false);
         }

         @Override
         public void visitInnerClassType(String var1) {
            this.token.addInnerClass(var1);
         }

         @Override
         public SignatureVisitor visitArrayType() {
            this.setArray();
            return this;
         }

         @Override
         public SignatureVisitor visitTypeArgument(char var1) {
            return SignatureParser.this.new TypeArgElement(this, var1);
         }

         ClassSignature.IToken addTypeArgument(char var1) {
            return this.token.addTypeArgument(var1).setArray(this.getArray());
         }

         ClassSignature.IToken addTypeArgument(String var1) {
            return this.token.addTypeArgument(var1).setArray(this.getArray());
         }

         ClassSignature.IToken addTypeArgument(ClassSignature.TokenHandle var1) {
            return this.token.addTypeArgument(var1).setArray(this.getArray());
         }
      }

      class TypeArgElement extends ClassSignature.SignatureParser.TokenElement {
         private final ClassSignature.SignatureParser.TokenElement type;
         private final char wildcard;

         TypeArgElement(ClassSignature.SignatureParser.TokenElement var2, char var3) {
            this.type = var2;
            this.wildcard = var3;
         }

         @Override
         public SignatureVisitor visitArrayType() {
            this.type.setArray();
            return this;
         }

         @Override
         public void visitBaseType(char var1) {
            this.token = this.type.addTypeArgument(var1).asToken();
         }

         @Override
         public void visitTypeVariable(String var1) {
            ClassSignature.TokenHandle var2 = ClassSignature.this.getType(var1);
            this.token = this.type.addTypeArgument(var2).setWildcard(this.wildcard).asToken();
         }

         @Override
         public void visitClassType(String var1) {
            this.token = this.type.addTypeArgument(var1).setWildcard(this.wildcard).asToken();
         }

         @Override
         public void visitTypeArgument() {
            this.token.addTypeArgument('*');
         }

         @Override
         public SignatureVisitor visitTypeArgument(char var1) {
            return SignatureParser.this.new TypeArgElement(this, var1);
         }

         @Override
         public void visitEnd() {
         }
      }
   }

   class SignatureRemapper extends SignatureWriter {
      private final Set<String> localTypeVars = new HashSet<>();

      @Override
      public void visitFormalTypeParameter(String var1) {
         this.localTypeVars.add(var1);
         super.visitFormalTypeParameter(var1);
      }

      @Override
      public void visitTypeVariable(String var1) {
         if (!this.localTypeVars.contains(var1)) {
            ClassSignature.TypeVar var2 = ClassSignature.this.getTypeVar(var1);
            if (var2 != null) {
               super.visitTypeVariable(var2.toString());
               return;
            }
         }

         super.visitTypeVariable(var1);
      }
   }

   static class Token implements ClassSignature.IToken {
      private final boolean inner;
      private boolean array;
      private char symbol = 0;
      private String type;
      private List<ClassSignature.Token> classBound;
      private List<ClassSignature.Token> ifaceBound;
      private List<ClassSignature.IToken> signature;
      private List<ClassSignature.IToken> suffix;
      private ClassSignature.Token tail;

      Token() {
         this(false);
      }

      Token(String var1) {
         this(var1, false);
      }

      Token(char var1) {
         this();
         this.symbol = var1;
      }

      Token(boolean var1) {
         this(null, var1);
      }

      Token(String var1, boolean var2) {
         this.inner = var2;
         this.type = var1;
      }

      ClassSignature.Token setSymbol(char var1) {
         if (this.symbol == 0 && "+-*".indexOf(var1) > -1) {
            this.symbol = var1;
         }

         return this;
      }

      ClassSignature.Token setType(String var1) {
         if (this.type == null) {
            this.type = var1;
         }

         return this;
      }

      @Override
      public ClassSignature.IToken setArray(boolean var1) {
         this.array |= var1;
         return this;
      }

      @Override
      public ClassSignature.IToken setWildcard(char var1) {
         return "+-".indexOf(var1) == -1 ? this : this.setSymbol(var1);
      }

      private List<ClassSignature.Token> getClassBound() {
         if (this.classBound == null) {
            this.classBound = new ArrayList<>();
         }

         return this.classBound;
      }

      private List<ClassSignature.Token> getIfaceBound() {
         if (this.ifaceBound == null) {
            this.ifaceBound = new ArrayList<>();
         }

         return this.ifaceBound;
      }

      private List<ClassSignature.IToken> getSignature() {
         if (this.signature == null) {
            this.signature = new ArrayList<>();
         }

         return this.signature;
      }

      private List<ClassSignature.IToken> getSuffix() {
         if (this.suffix == null) {
            this.suffix = new ArrayList<>();
         }

         return this.suffix;
      }

      ClassSignature.IToken addTypeArgument(char var1) {
         if (this.tail != null) {
            return this.tail.addTypeArgument(var1);
         }

         ClassSignature.Token var2 = new ClassSignature.Token(var1);
         this.getSignature().add(var2);
         return var2;
      }

      ClassSignature.IToken addTypeArgument(String var1) {
         if (this.tail != null) {
            return this.tail.addTypeArgument(var1);
         }

         ClassSignature.Token var2 = new ClassSignature.Token(var1);
         this.getSignature().add(var2);
         return var2;
      }

      ClassSignature.IToken addTypeArgument(ClassSignature.TokenHandle var1) {
         if (this.tail != null) {
            return this.tail.addTypeArgument(var1);
         }

         ClassSignature.TokenHandle var2 = var1.clone();
         this.getSignature().add(var2);
         return var2;
      }

      ClassSignature.Token addBound(String var1, boolean var2) {
         return var2 ? this.addClassBound(var1) : this.addInterfaceBound(var1);
      }

      ClassSignature.Token addClassBound(String var1) {
         ClassSignature.Token var2 = new ClassSignature.Token(var1);
         this.getClassBound().add(var2);
         return var2;
      }

      ClassSignature.Token addInterfaceBound(String var1) {
         ClassSignature.Token var2 = new ClassSignature.Token(var1);
         this.getIfaceBound().add(var2);
         return var2;
      }

      ClassSignature.Token addInnerClass(String var1) {
         this.tail = new ClassSignature.Token(var1, true);
         this.getSuffix().add(this.tail);
         return this.tail;
      }

      @Override
      public String toString() {
         return this.asType();
      }

      public String asBound() {
         StringBuilder var1 = new StringBuilder();
         if (this.type != null) {
            var1.append(this.type);
         }

         if (this.classBound != null) {
            for (ClassSignature.Token var3 : this.classBound) {
               var1.append(var3.asType());
            }
         }

         if (this.ifaceBound != null) {
            for (ClassSignature.Token var5 : this.ifaceBound) {
               var1.append(':').append(var5.asType());
            }
         }

         return var1.toString();
      }

      @Override
      public String asType() {
         return this.asType(false);
      }

      public String asType(boolean var1) {
         StringBuilder var2 = new StringBuilder();
         if (this.array) {
            var2.append('[');
         }

         if (this.symbol != 0) {
            var2.append(this.symbol);
         }

         if (this.type == null) {
            return var2.toString();
         }

         if (!this.inner) {
            var2.append('L');
         }

         var2.append(this.type);
         if (!var1) {
            if (this.signature != null) {
               var2.append('<');

               for (ClassSignature.IToken var4 : this.signature) {
                  var2.append(var4.asType());
               }

               var2.append('>');
            }

            if (this.suffix != null) {
               for (ClassSignature.IToken var6 : this.suffix) {
                  var2.append('.').append(var6.asType());
               }
            }
         }

         if (!this.inner) {
            var2.append(';');
         }

         return var2.toString();
      }

      boolean isRaw() {
         return this.signature == null;
      }

      @Override
      public ClassSignature.Token asToken() {
         return this;
      }
   }

   class TokenHandle implements ClassSignature.IToken {
      final ClassSignature.Token token;
      boolean array;
      char wildcard;

      TokenHandle() {
         this(new ClassSignature.Token());
      }

      TokenHandle(ClassSignature.Token var2) {
         this.token = var2;
      }

      @Override
      public ClassSignature.IToken setArray(boolean var1) {
         this.array |= var1;
         return this;
      }

      @Override
      public ClassSignature.IToken setWildcard(char var1) {
         if ("+-".indexOf(var1) > -1) {
            this.wildcard = var1;
         }

         return this;
      }

      public String asBound() {
         return this.token.asBound();
      }

      @Override
      public String asType() {
         StringBuilder var1 = new StringBuilder();
         if (this.wildcard > 0) {
            var1.append(this.wildcard);
         }

         if (this.array) {
            var1.append('[');
         }

         return var1.append(ClassSignature.this.getTypeVar(this)).toString();
      }

      @Override
      public ClassSignature.Token asToken() {
         return this.token;
      }

      @Override
      public String toString() {
         return this.token.toString();
      }

      public ClassSignature.TokenHandle clone() {
         return ClassSignature.this.new TokenHandle(this.token);
      }
   }

   static class TypeVar implements Comparable<ClassSignature.TypeVar> {
      private final String originalName;
      private String currentName;

      TypeVar(String var1) {
         this.currentName = this.originalName = var1;
      }

      public int compareTo(ClassSignature.TypeVar var1) {
         return this.currentName.compareTo(var1.currentName);
      }

      @Override
      public String toString() {
         return this.currentName;
      }

      String getOriginalName() {
         return this.originalName;
      }

      void rename(String var1) {
         this.currentName = var1;
      }

      public boolean matches(String var1) {
         return this.originalName.equals(var1);
      }

      @Override
      public boolean equals(Object var1) {
         return this.currentName.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.currentName.hashCode();
      }
   }
}
