package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.analysis.InheritanceType;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements InheritanceProvider {
   private final int HOICHRRCIOHHCOHRHRCIOCRRCOIHHC;
   private final ClassProvider HOOHRROIIIIIHOIOHHRCIROHHOCRII;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, ClassProvider var2) {
      this.HOICHRRCIOHHCOHRHRCIOCRRCOIHHC = var1;
      this.HOOHRROIIIIIHOIOHHRCIROHHOCRII = var2;
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(ClassProvider var1) {
      this(458752, var1);
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      byte[] var2 = this.HOOHRROIIIIIHOIOHHRCIROHHOCRII.get(var1);
      if (var2 == null) {
         return Optional.empty();
      }

      ClassReader var3 = new ClassReader(var2);
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.HOICHRRCIOHHCOHRHRCIOCRRCOIHHC
      );
      var3.accept(var4, 7);
      return Optional.of(var4.create());
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends InheritanceProvider.ClassInfo.Abstract implements InheritanceProvider.ClassInfo {
      protected final String RIOCIROCOOIHIOOIHCRCHCIOROHRCC;
      protected final boolean CHRICHHHROCIROIIIHIIRIHOIOOHHI;
      protected final String CCORHCHHIIOCOHOOIOCRHRRHOCOHCO;
      protected final List<String> ROHRHCOOCOICCORRCHICCCROCRCRIH;
      protected final Map<FieldSignature, InheritanceType> CROIIOHIRRORIHRIHHROIRIHHIHIRI;
      protected final Map<String, InheritanceType> RICHCICOHHCOROHIHOIHORHHOICRRO;
      protected final Map<MethodSignature, InheritanceType> IHCCICHIHCOICCCROOROHIROIIRCIO;
      protected Set<InheritanceProvider.ClassInfo> parents;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         String var1,
         boolean var2,
         String var3,
         List<String> var4,
         Map<FieldSignature, InheritanceType> var5,
         Map<String, InheritanceType> var6,
         Map<MethodSignature, InheritanceType> var7
      ) {
         this.RIOCIROCOOIHIOOIHCRCHCIOROHRCC = var1;
         this.CHRICHHHROCIROIIIHIIRIHOIOOHHI = var2;
         this.CCORHCHHIIOCOHOOIOCRHRRHOCOHCO = var3 != null ? var3 : "";
         this.ROHRHCOOCOICCORRCHICCCROCRCRIH = Collections.unmodifiableList(var4);
         this.CROIIOHIRRORIHRIHHROIRIHHIHIRI = Collections.unmodifiableMap(var5);
         this.RICHCICOHHCOROHIHOIHORHHOICRRO = Collections.unmodifiableMap(var6);
         this.IHCCICHIHCOICCCROOROHIROIIRCIO = Collections.unmodifiableMap(var7);
      }

      @Override
      public String getName() {
         return this.RIOCIROCOOIHIOOIHCRCHCIOROHRCC;
      }

      @Override
      public boolean isInterface() {
         return this.CHRICHHHROCIROIIIHIIRIHOIOOHHI;
      }

      @Override
      public String getSuperName() {
         return this.CCORHCHHIIOCOHOOIOCRHRRHOCOHCO;
      }

      @Override
      public List<String> getInterfaces() {
         return this.ROHRHCOOCOICCORRCHICCCROCRCRIH;
      }

      @Override
      public Map<FieldSignature, InheritanceType> getFields() {
         return this.CROIIOHIRRORIHRIHHROIRIHHIHIRI;
      }

      @Override
      public Map<String, InheritanceType> getFieldsByName() {
         return this.RICHCICOHHCOROHIHOIHORHHOICRRO;
      }

      @Override
      public Map<MethodSignature, InheritanceType> getMethods() {
         return this.IHCCICHIHCOICCCROOROHIROIIRCIO;
      }

      @Override
      public Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
         LinkedHashSet var2 = new LinkedHashSet();
         this.provideParents(var1, var2);
         return Collections.unmodifiableSet(var2);
      }

      @Override
      public void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
         var1.provide(this.getSuperName()).ifPresent(var2x -> {
            var2.add(var2x);
            var2x.provideParents(var1, var2);
         });

         for (String var4 : this.getInterfaces()) {
            var1.provide(var4).ifPresent(var2x -> {
               var2.add(var2x);
               var2x.provideParents(var1, var2);
            });
         }
      }

      @Override
      public InheritanceProvider.ClassInfo lazy() {
         return this;
      }
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ClassVisitor {
      private String name;
      private boolean isInterface;
      private String superName;
      private List<String> interfaces = Collections.emptyList();
      private final Map<FieldSignature, InheritanceType> IIIROHOHRHHIHRCCOROOCCIHCOIOII = new HashMap<>();
      private final Map<String, InheritanceType> fieldsByName = new HashMap<>();
      private final Map<MethodSignature, InheritanceType> ROHRCROIOOIHHRRICHOCHIOOOIOHHI = new HashMap<>();

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         super(var1);
      }

      InheritanceProvider.ClassInfo create() {
         return new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            this.name,
            this.isInterface,
            this.superName,
            this.interfaces,
            this.IIIROHOHRHHIHRCCOROOCCIHCOIOII,
            this.fieldsByName,
            this.ROHRCROIOOIHHRRICHOCHIOOOIOHHI
         );
      }

      @Override
      public void visit(int var1, int var2, String var3, String var4, String var5, String[] var6) {
         this.name = var3;
         this.isInterface = (var2 & 512) != 0;
         this.superName = var5;
         this.interfaces = Arrays.asList(var6);
      }

      @Override
      public FieldVisitor visitField(int var1, String var2, String var3, String var4, Object var5) {
         InheritanceType var6 = InheritanceType.fromModifiers(var1);
         this.IIIROHOHRHHIHRCCOROOCCIHCOIOII.put(FieldSignature.of(var2, var3), var6);
         this.fieldsByName.put(var2, var6);
         return null;
      }

      @Override
      public MethodVisitor visitMethod(int var1, String var2, String var3, String var4, String[] var5) {
         this.ROHRCROIOOIHHRRICHOCHIOOOIOHHI.put(MethodSignature.of(var2, var3), InheritanceType.fromModifiers(var1));
         return null;
      }
   }
}
