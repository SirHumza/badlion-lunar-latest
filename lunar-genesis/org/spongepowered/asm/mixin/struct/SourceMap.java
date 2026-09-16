package org.spongepowered.asm.mixin.struct;

import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.Bytecode;

public class SourceMap {
   private final String sourceFile;
   private final Map<String, SourceMap.Stratum> strata = new LinkedHashMap<>();
   private int nextLineOffset = 1;
   private String defaultStratum = "Mixin";

   public SourceMap(String var1) {
      this.sourceFile = var1;
   }

   public String getSourceFile() {
      return this.sourceFile;
   }

   public String getPseudoGeneratedSourceFile() {
      return this.sourceFile.replace(".java", "$mixin.java");
   }

   public SourceMap.File addFile(ClassNode var1) {
      return this.addFile(this.defaultStratum, var1);
   }

   public SourceMap.File addFile(String var1, ClassNode var2) {
      return this.addFile(var1, var2.sourceFile, var2.name + ".java", Bytecode.getMaxLineNumber(var2, 500, 50));
   }

   public SourceMap.File addFile(String var1, String var2, int var3) {
      return this.addFile(this.defaultStratum, var1, var2, var3);
   }

   public SourceMap.File addFile(String var1, String var2, String var3, int var4) {
      SourceMap.Stratum var5 = this.strata.get(var1);
      if (var5 == null) {
         var5 = new SourceMap.Stratum(var1);
         this.strata.put(var1, var5);
      }

      SourceMap.File var6 = var5.addFile(this.nextLineOffset, var4, var2, var3);
      this.nextLineOffset += var4;
      return var6;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.appendTo(var1);
      return var1.toString();
   }

   private void appendTo(StringBuilder var1) {
      var1.append("SMAP").append("\n");
      var1.append(this.getSourceFile()).append("\n");
      var1.append(this.defaultStratum).append("\n");

      for (SourceMap.Stratum var3 : this.strata.values()) {
         var3.appendTo(var1);
      }

      var1.append("*E").append("\n");
   }

   public static class File {
      public final int id;
      public final int lineOffset;
      public final int size;
      public final String sourceFileName;
      public final String sourceFilePath;

      public File(int var1, int var2, int var3, String var4) {
         this(var1, var2, var3, var4, null);
      }

      public File(int var1, int var2, int var3, String var4, String var5) {
         this.id = var1;
         this.lineOffset = var2;
         this.size = var3;
         this.sourceFileName = var4;
         this.sourceFilePath = var5;
      }

      public void applyOffset(ClassNode var1) {
         for (MethodNode var3 : var1.methods) {
            this.applyOffset(var3);
         }
      }

      public void applyOffset(MethodNode var1) {
         for (AbstractInsnNode var3 : var1.instructions) {
            if (var3 instanceof LineNumberNode) {
               ((LineNumberNode)var3).line = ((LineNumberNode)var3).line + (this.lineOffset - 1);
            }
         }
      }

      void appendFile(StringBuilder var1) {
         if (this.sourceFilePath != null) {
            var1.append("+ ").append(this.id).append(" ").append(this.sourceFileName).append("\n");
            var1.append(this.sourceFilePath).append("\n");
         } else {
            var1.append(this.id).append(" ").append(this.sourceFileName).append("\n");
         }
      }

      public void appendLines(StringBuilder var1) {
         var1.append("1#").append(this.id).append(",").append(this.size).append(":").append(this.lineOffset).append("\n");
      }
   }

   static class Stratum {
      public final String name;
      private final Map<String, SourceMap.File> files = new LinkedHashMap<>();

      public Stratum(String var1) {
         this.name = var1;
      }

      public SourceMap.File addFile(int var1, int var2, String var3, String var4) {
         SourceMap.File var5 = this.files.get(var4);
         if (var5 == null) {
            var5 = new SourceMap.File(this.files.size() + 1, var1, var2, var3, var4);
            this.files.put(var4, var5);
         }

         return var5;
      }

      void appendTo(StringBuilder var1) {
         var1.append("*S").append(" ").append(this.name).append("\n");
         var1.append("*F").append("\n");

         for (SourceMap.File var3 : this.files.values()) {
            var3.appendFile(var1);
         }

         var1.append("*L").append("\n");

         for (SourceMap.File var5 : this.files.values()) {
            var5.appendLines(var1);
         }
      }
   }
}
