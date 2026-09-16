package org.spongepowered.tools.obfuscation.mirror;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.IntersectionType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import org.objectweb.asm.Type;
import org.spongepowered.asm.util.Bytecode;
import org.spongepowered.asm.util.SignaturePrinter;

public abstract class TypeUtils {
   private TypeUtils() {
   }

   public static PackageElement getPackage(TypeMirror var0) {
      return !(var0 instanceof DeclaredType) ? null : getPackage((TypeElement)((DeclaredType)var0).asElement());
   }

   public static PackageElement getPackage(TypeElement var0) {
      Element var1 = var0.getEnclosingElement();

      while (var1 != null && !(var1 instanceof PackageElement)) {
         var1 = var1.getEnclosingElement();
      }

      return (PackageElement)var1;
   }

   public static String getElementType(Element var0) {
      if (var0 instanceof TypeElement) {
         return "TypeElement";
      } else if (var0 instanceof ExecutableElement) {
         return "ExecutableElement";
      } else if (var0 instanceof VariableElement) {
         return "VariableElement";
      } else if (var0 instanceof PackageElement) {
         return "PackageElement";
      } else {
         return var0 instanceof TypeParameterElement ? "TypeParameterElement" : var0.getClass().getSimpleName();
      }
   }

   public static String stripGenerics(String var0) {
      StringBuilder var1 = new StringBuilder();
      int var2 = 0;
      int var3 = 0;

      while (var2 < var0.length()) {
         char var4 = var0.charAt(var2);
         if (var4 == '<') {
            var3++;
         }

         if (var3 == 0) {
            var1.append(var4);
         } else if (var4 == '>') {
            var3--;
         }

         var2++;
      }

      return var1.toString();
   }

   public static String getName(VariableElement var0) {
      return var0 != null ? var0.getSimpleName().toString() : null;
   }

   public static String getName(ExecutableElement var0) {
      return var0 != null ? var0.getSimpleName().toString() : null;
   }

   public static String getJavaSignature(Element var0) {
      if (var0 == null) {
         return "";
      }

      if (var0 instanceof ExecutableElement) {
         ExecutableElement var1 = (ExecutableElement)var0;
         StringBuilder var2 = new StringBuilder().append("(");
         boolean var3 = false;

         for (TypeUtils.TypeName var5 : getAllParameterTypes(var1)) {
            if (var3) {
               var2.append(',');
            }

            var2.append(var5.name);
            var3 = true;
         }

         var2.append(')').append(getTypeName(var1.getReturnType()));
         return var2.toString();
      } else {
         return getTypeName(var0.asType());
      }
   }

   public static String getJavaSignature(String var0) {
      return !var0.contains("(")
         ? SignaturePrinter.getTypeName(Type.getType(var0), false, true)
         : new SignaturePrinter("", var0).setFullyQualified(true).toDescriptor();
   }

   public static String getSimpleName(TypeMirror var0) {
      String var1 = getTypeName(var0);
      int var2 = var1.lastIndexOf(46);
      return var2 > 0 ? var1.substring(var2 + 1) : var1;
   }

   public static String getTypeName(TypeMirror var0) {
      switch (var0.getKind()) {
         case ARRAY:
            return getTypeName(((ArrayType)var0).getComponentType()) + "[]";
         case DECLARED:
            return getTypeName((DeclaredType)var0);
         case TYPEVAR:
            return getTypeName(getUpperBound(var0));
         case ERROR:
            return "java.lang.Object";
         default:
            return var0.toString();
      }
   }

   public static String getTypeName(DeclaredType var0) {
      return var0 == null ? "java.lang.Object" : getInternalName((TypeElement)var0.asElement()).replace('/', '.');
   }

   public static String getDescriptor(Element var0) {
      if (var0 instanceof ExecutableElement) {
         return getDescriptor((ExecutableElement)var0);
      } else {
         return var0 instanceof VariableElement ? getInternalName((VariableElement)var0) : getInternalName(var0.asType());
      }
   }

   public static String getDescriptor(ExecutableElement var0) {
      if (var0 == null) {
         return null;
      }

      StringBuilder var1 = new StringBuilder();

      for (TypeUtils.TypeName var3 : getAllParameterTypes(var0)) {
         var1.append(var3.descriptor);
      }

      String var4 = getInternalName(var0.getReturnType());
      return String.format("(%s)%s", var1, var4);
   }

   public static String getInternalName(VariableElement var0) {
      return var0 == null ? null : getInternalName(var0.asType());
   }

   public static String getInternalName(TypeMirror var0) {
      switch (var0.getKind()) {
         case ARRAY:
            return "[" + getInternalName(((ArrayType)var0).getComponentType());
         case DECLARED:
            return "L" + getInternalName((DeclaredType)var0) + ";";
         case TYPEVAR:
            return "L" + getInternalName(getUpperBound(var0)) + ";";
         case ERROR:
            return "Ljava/lang/Object;";
         case BOOLEAN:
            return "Z";
         case BYTE:
            return "B";
         case CHAR:
            return "C";
         case DOUBLE:
            return "D";
         case FLOAT:
            return "F";
         case INT:
            return "I";
         case LONG:
            return "J";
         case SHORT:
            return "S";
         case VOID:
            return "V";
         default:
            throw new IllegalArgumentException("Unable to parse type symbol " + var0 + " with " + var0.getKind() + " to equivalent bytecode type");
      }
   }

   public static String getInternalName(DeclaredType var0) {
      return var0 == null ? "java/lang/Object" : getInternalName((TypeElement)var0.asElement());
   }

   public static String getInternalName(TypeElement var0) {
      if (var0 == null) {
         return null;
      }

      StringBuilder var1 = new StringBuilder();
      var1.append(var0.getSimpleName());

      for (Element var2 = var0.getEnclosingElement(); var2 != null; var2 = var2.getEnclosingElement()) {
         if (var2 instanceof TypeElement) {
            var1.insert(0, "$").insert(0, var2.getSimpleName());
         } else if (var2 instanceof PackageElement) {
            var1.insert(0, "/").insert(0, ((PackageElement)var2).getQualifiedName().toString().replace('.', '/'));
         }
      }

      return var1.toString();
   }

   private static DeclaredType getUpperBound(TypeMirror var0) {
      try {
         return getUpperBound0(var0, 5);
      } catch (IllegalStateException var2) {
         throw new IllegalArgumentException("Type symbol \"" + var0 + "\" is too complex", var2);
      } catch (IllegalArgumentException var3) {
         throw new IllegalArgumentException("Unable to compute upper bound of type symbol " + var0, var3);
      }
   }

   private static DeclaredType getUpperBound0(TypeMirror var0, int var1) {
      if (var1 == 0) {
         throw new IllegalStateException("Generic symbol \"" + var0 + "\" is too complex, exceeded " + 5 + " iterations attempting to determine upper bound");
      }

      if (var0 instanceof IntersectionType) {
         TypeMirror var8 = ((IntersectionType)var0).getBounds().get(0);
         return getUpperBound0(var8, --var1);
      }

      if (var0 instanceof DeclaredType) {
         return (DeclaredType)var0;
      }

      if (var0 instanceof TypeVariable) {
         try {
            TypeMirror var2 = ((TypeVariable)var0).getUpperBound();
            return getUpperBound0(var2, --var1);
         } catch (IllegalStateException var3) {
            throw var3;
         } catch (IllegalArgumentException var4) {
            throw var4;
         } catch (Exception var5) {
            throw new IllegalArgumentException("Unable to compute upper bound of type symbol " + var0);
         }
      } else {
         return null;
      }
   }

   private static String describeGenericBound(TypeMirror var0) {
      if (var0 instanceof TypeVariable) {
         StringBuilder var1 = new StringBuilder("<");
         TypeVariable var2 = (TypeVariable)var0;
         var1.append(var2.toString());
         TypeMirror var3 = var2.getLowerBound();
         if (var3.getKind() != TypeKind.NULL) {
            var1.append(" super ").append(var3);
         }

         TypeMirror var4 = var2.getUpperBound();
         if (var4.getKind() != TypeKind.NULL) {
            var1.append(" extends ").append(var4);
         }

         return var1.append(">").toString();
      } else {
         return var0.toString();
      }
   }

   public static boolean isAssignable(ProcessingEnvironment var0, TypeMirror var1, TypeMirror var2) {
      boolean var3 = var0.getTypeUtils().isAssignable(var1, var2);
      if (!var3 && var1 instanceof DeclaredType && var2 instanceof DeclaredType) {
         TypeMirror var4 = toRawType(var0, (DeclaredType)var1);
         TypeMirror var5 = toRawType(var0, (DeclaredType)var2);
         return var0.getTypeUtils().isAssignable(var4, var5);
      } else {
         return var3;
      }
   }

   public static TypeUtils.EquivalencyResult isEquivalentType(ProcessingEnvironment var0, TypeMirror var1, TypeMirror var2) {
      if (var1 != null && var2 != null) {
         if (var0.getTypeUtils().isSameType(var1, var2)) {
            return TypeUtils.EquivalencyResult.EQUIVALENT;
         }

         if (var1 instanceof TypeVariable && var2 instanceof TypeVariable) {
            var1 = getUpperBound(var1);
            var2 = getUpperBound(var2);
            if (var0.getTypeUtils().isSameType(var1, var2)) {
               return TypeUtils.EquivalencyResult.EQUIVALENT;
            }
         }

         if (var1 instanceof DeclaredType && var2 instanceof DeclaredType) {
            DeclaredType var3 = (DeclaredType)var1;
            DeclaredType var4 = (DeclaredType)var2;
            TypeMirror var5 = toRawType(var0, var3);
            TypeMirror var6 = toRawType(var0, var4);
            if (!var0.getTypeUtils().isSameType(var5, var6)) {
               return TypeUtils.EquivalencyResult.notEquivalent("Base types %s and %s are not compatible", var5, var6);
            }

            List var7 = var3.getTypeArguments();
            List var8 = var4.getTypeArguments();
            if (var7.size() != var8.size()) {
               if (var7.size() == 0) {
                  return TypeUtils.EquivalencyResult.equivalentButRaw(1);
               } else {
                  return var8.size() == 0
                     ? TypeUtils.EquivalencyResult.equivalentButRaw(2)
                     : TypeUtils.EquivalencyResult.notEquivalent(
                        "Mismatched generic argument counts %s<[%d]> and %s<[%d]>", var5, var7.size(), var6, var8.size()
                     );
               }
            } else {
               for (int var9 = 0; var9 < var7.size(); var9++) {
                  TypeMirror var10 = (TypeMirror)var7.get(var9);
                  TypeMirror var11 = (TypeMirror)var8.get(var9);
                  if (isEquivalentType(var0, var10, var11).type != TypeUtils.Equivalency.EQUIVALENT) {
                     return TypeUtils.EquivalencyResult.boundsMismatch(
                        "Generic bounds mismatch between %s and %s", describeGenericBound(var10), describeGenericBound(var11)
                     );
                  }
               }

               return TypeUtils.EquivalencyResult.EQUIVALENT;
            }
         } else {
            return TypeUtils.EquivalencyResult.notEquivalent("%s and %s do not match", var1, var2);
         }
      } else {
         return TypeUtils.EquivalencyResult.notEquivalent("Invalid types supplied: %s, %s", var1, var2);
      }
   }

   private static TypeMirror toRawType(ProcessingEnvironment var0, DeclaredType var1) {
      if (var1.getKind() == TypeKind.INTERSECTION) {
         return var1;
      }

      Name var2 = ((TypeElement)var1.asElement()).getQualifiedName();
      TypeElement var3 = var0.getElementUtils().getTypeElement(var2);
      return var3 != null ? var3.asType() : var1;
   }

   public static Bytecode.Visibility getVisibility(Element var0) {
      if (var0 == null) {
         return null;
      }

      for (Modifier var2 : var0.getModifiers()) {
         switch (var2) {
            case PUBLIC:
               return Bytecode.Visibility.PUBLIC;
            case PROTECTED:
               return Bytecode.Visibility.PROTECTED;
            case PRIVATE:
               return Bytecode.Visibility.PRIVATE;
         }
      }

      return Bytecode.Visibility.PACKAGE;
   }

   private static List<TypeUtils.TypeName> getAllParameterTypes(ExecutableElement var0) {
      ArrayList var1 = new ArrayList();
      if (var0.getKind() == ElementKind.CONSTRUCTOR && var0.getEnclosingElement().getKind() == ElementKind.ENUM) {
         var1.add(new TypeUtils.TypeName("java.lang.String", "Ljava/lang/String;"));
         var1.add(new TypeUtils.TypeName("int", "I"));
      }

      for (VariableElement var3 : var0.getParameters()) {
         var1.add(new TypeUtils.TypeName(var3.asType()));
      }

      return var1;
   }

   public enum Equivalency {
      NOT_EQUIVALENT,
      EQUIVALENT_BUT_RAW,
      BOUNDS_MISMATCH,
      EQUIVALENT;
   }

   public static class EquivalencyResult {
      static final TypeUtils.EquivalencyResult EQUIVALENT = new TypeUtils.EquivalencyResult(TypeUtils.Equivalency.EQUIVALENT, "", 0);
      public final TypeUtils.Equivalency type;
      public final String detail;
      public final int rawType;

      EquivalencyResult(TypeUtils.Equivalency var1, String var2, int var3) {
         this.type = var1;
         this.detail = var2;
         this.rawType = var3;
      }

      @Override
      public String toString() {
         return this.detail;
      }

      static TypeUtils.EquivalencyResult notEquivalent(String var0, Object... var1) {
         return new TypeUtils.EquivalencyResult(TypeUtils.Equivalency.NOT_EQUIVALENT, String.format(var0, var1), 0);
      }

      static TypeUtils.EquivalencyResult boundsMismatch(String var0, Object... var1) {
         return new TypeUtils.EquivalencyResult(TypeUtils.Equivalency.BOUNDS_MISMATCH, String.format(var0, var1), 0);
      }

      static TypeUtils.EquivalencyResult equivalentButRaw(int var0) {
         return new TypeUtils.EquivalencyResult(TypeUtils.Equivalency.EQUIVALENT_BUT_RAW, String.format("Type %d is raw", var0), var0);
      }
   }

   private static class TypeName {
      final String name;
      final String descriptor;

      public TypeName(String var1, String var2) {
         this.name = var1;
         this.descriptor = var2;
      }

      public TypeName(TypeMirror var1) {
         this(TypeUtils.getTypeName(var1), TypeUtils.getInternalName(var1));
      }
   }
}
