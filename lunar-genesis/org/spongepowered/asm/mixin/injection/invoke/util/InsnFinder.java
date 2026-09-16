package org.spongepowered.asm.mixin.injection.invoke.util;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.service.MixinService;

public class InsnFinder {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");

   public AbstractInsnNode findPopInsn(Target var1, AbstractInsnNode var2) {
      try {
         new InsnFinder.PopAnalyzer(var2).analyze(var1.classNode.name, var1.method);
      } catch (AnalyzerException var4) {
         if (var4.getCause() instanceof InsnFinder.AnalysisResultException) {
            return ((InsnFinder.AnalysisResultException)var4.getCause()).getResult();
         }

         logger.catching(var4);
      }

      return null;
   }

   static class AnalysisResultException extends RuntimeException {
      private AbstractInsnNode result;

      public AnalysisResultException(AbstractInsnNode var1) {
         this.result = var1;
      }

      public AbstractInsnNode getResult() {
         return this.result;
      }
   }

   enum AnalyzerState {
      SEARCH,
      ANALYSE,
      COMPLETE;
   }

   static class PopAnalyzer extends Analyzer<BasicValue> {
      protected final AbstractInsnNode node;

      public PopAnalyzer(AbstractInsnNode var1) {
         super(new BasicInterpreter());
         this.node = var1;
      }

      @Override
      protected Frame<BasicValue> newFrame(int var1, int var2) {
         return new InsnFinder.PopAnalyzer.PopFrame(var1, var2);
      }

      class PopFrame extends Frame<BasicValue> {
         private AbstractInsnNode current;
         private InsnFinder.AnalyzerState state = InsnFinder.AnalyzerState.SEARCH;
         private int depth = 0;

         public PopFrame(int var2, int var3) {
            super(var2, var3);
         }

         @Override
         public void execute(AbstractInsnNode var1, Interpreter<BasicValue> var2) {
            this.current = var1;
            super.execute(var1, var2);
         }

         public void push(BasicValue var1) {
            if (this.current == PopAnalyzer.this.node && this.state == InsnFinder.AnalyzerState.SEARCH) {
               this.state = InsnFinder.AnalyzerState.ANALYSE;
               this.depth++;
            } else if (this.state == InsnFinder.AnalyzerState.ANALYSE) {
               this.depth++;
            }

            super.push(var1);
         }

         public BasicValue pop() {
            if (this.state == InsnFinder.AnalyzerState.ANALYSE && --this.depth == 0) {
               this.state = InsnFinder.AnalyzerState.COMPLETE;
               throw new InsnFinder.AnalysisResultException(this.current);
            } else {
               return (BasicValue)super.pop();
            }
         }
      }
   }
}
