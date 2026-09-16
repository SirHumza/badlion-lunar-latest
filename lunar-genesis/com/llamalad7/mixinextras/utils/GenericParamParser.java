package com.llamalad7.mixinextras.utils;

import com.llamalad7.mixinextras.lib.apache.commons.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.spongepowered.asm.util.asm.ASM;

public class GenericParamParser extends SignatureVisitor {
   private final List<Type> results = new ArrayList<>();

   private GenericParamParser() {
      super(ASM.API_VERSION);
   }

   public static List<Type> getParameterGenerics(String var0, String var1) {
      if (var1 != null && !var1.isEmpty()) {
         GenericParamParser var2 = new GenericParamParser();
         new SignatureReader(var1).accept(var2);
         return var2.results;
      } else {
         return Collections.nCopies(Type.getArgumentTypes(var0).length, null);
      }
   }

   @Override
   public SignatureVisitor visitParameterType() {
      final int var1 = this.results.size();
      this.results.add(null);
      return new SignatureVisitor(this.api) {
         @Override
         public SignatureVisitor visitTypeArgument(char var1x) {
            return var1x != '=' ? this : new SignatureVisitor(this.api) {
               private int depth;
               private int arrayDimensions;
               private String internalName;

               @Override
               public SignatureVisitor visitArrayType() {
                  if (this.depth == 0) {
                     this.arrayDimensions++;
                  }

                  return this;
               }

               @Override
               public void visitBaseType(char var1x) {
                  if (this.depth == 0) {
                     GenericParamParser.this.results.set(var1, Type.getType(StringUtils.repeat('[', this.arrayDimensions) + var1x));
                  }
               }

               @Override
               public void visitClassType(String var1x) {
                  if (++this.depth == 1) {
                     this.internalName = var1x;
                  }
               }

               @Override
               public void visitInnerClassType(String var1x) {
                  if (this.depth == 1) {
                     this.internalName = this.internalName + '$' + var1x;
                  }
               }

               @Override
               public void visitEnd() {
                  this.depth--;
                  String var1xx = StringUtils.repeat('[', this.arrayDimensions);
                  GenericParamParser.this.results.set(var1, Type.getType(var1xx + Type.getObjectType(this.internalName).getDescriptor()));
               }
            };
         }
      };
   }
}
