package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public abstract class AdviceAdapter extends GeneratorAdapter implements Opcodes {
   private static final Object UNINITIALIZED_THIS = new Object();
   private static final Object OTHER = new Object();
   private static final String INVALID_OPCODE = "Invalid opcode ";
   protected int methodAccess;
   protected String methodDesc;
   private final boolean isConstructor;
   private boolean superClassConstructorCalled;
   private List<Object> stackFrame;
   private Map<Label, List<Object>> forwardJumpStackFrames;

   protected AdviceAdapter(int var1, MethodVisitor var2, int var3, String var4, String var5) {
      super(var1, var2, var3, var4, var5);
      this.methodAccess = var3;
      this.methodDesc = var5;
      this.isConstructor = "<init>".equals(var4);
   }

   @Override
   public void visitCode() {
      super.visitCode();
      if (this.isConstructor) {
         this.stackFrame = new ArrayList<>();
         this.forwardJumpStackFrames = new HashMap<>();
      } else {
         this.onMethodEnter();
      }
   }

   @Override
   public void visitLabel(Label var1) {
      super.visitLabel(var1);
      if (this.isConstructor && this.forwardJumpStackFrames != null) {
         List var2 = this.forwardJumpStackFrames.get(var1);
         if (var2 != null) {
            this.stackFrame = var2;
            this.superClassConstructorCalled = false;
            this.forwardJumpStackFrames.remove(var1);
         }
      }
   }

   @Override
   public void visitInsn(int var1) {
      if (this.isConstructor && !this.superClassConstructorCalled) {
         switch (var1) {
            case 0:
            case 47:
            case 49:
            case 116:
            case 117:
            case 118:
            case 119:
            case 134:
            case 138:
            case 139:
            case 143:
            case 145:
            case 146:
            case 147:
            case 190:
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 133:
            case 135:
            case 140:
            case 141:
               this.pushValue(OTHER);
               break;
            case 9:
            case 10:
            case 14:
            case 15:
               this.pushValue(OTHER);
               this.pushValue(OTHER);
               break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 132:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 192:
            case 193:
            default:
               throw new IllegalArgumentException(stringConcat$0(var1));
            case 46:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 87:
            case 96:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 108:
            case 110:
            case 112:
            case 114:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 130:
            case 136:
            case 137:
            case 142:
            case 144:
            case 149:
            case 150:
            case 194:
            case 195:
               this.popValue();
               break;
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
            case 148:
            case 151:
            case 152:
               this.popValue();
               this.popValue();
               this.popValue();
               break;
            case 80:
            case 82:
               this.popValue();
               this.popValue();
               this.popValue();
               this.popValue();
               break;
            case 88:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 127:
            case 129:
            case 131:
               this.popValue();
               this.popValue();
               break;
            case 89:
               this.pushValue(this.peekValue());
               break;
            case 90:
               int var7 = this.stackFrame.size();
               this.stackFrame.add(var7 - 2, this.stackFrame.get(var7 - 1));
               break;
            case 91:
               int var6 = this.stackFrame.size();
               this.stackFrame.add(var6 - 3, this.stackFrame.get(var6 - 1));
               break;
            case 92:
               int var5 = this.stackFrame.size();
               this.stackFrame.add(var5 - 2, this.stackFrame.get(var5 - 1));
               this.stackFrame.add(var5 - 2, this.stackFrame.get(var5 - 1));
               break;
            case 93:
               int var4 = this.stackFrame.size();
               this.stackFrame.add(var4 - 3, this.stackFrame.get(var4 - 1));
               this.stackFrame.add(var4 - 3, this.stackFrame.get(var4 - 1));
               break;
            case 94:
               int var3 = this.stackFrame.size();
               this.stackFrame.add(var3 - 4, this.stackFrame.get(var3 - 1));
               this.stackFrame.add(var3 - 4, this.stackFrame.get(var3 - 1));
               break;
            case 95:
               int var2 = this.stackFrame.size();
               this.stackFrame.add(var2 - 2, this.stackFrame.get(var2 - 1));
               this.stackFrame.remove(var2);
               break;
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
               throw new IllegalArgumentException("Invalid return in constructor");
            case 177:
               this.onMethodExit(var1);
               this.endConstructorBasicBlockWithoutSuccessor();
               break;
            case 191:
               this.popValue();
               this.onMethodExit(var1);
               this.endConstructorBasicBlockWithoutSuccessor();
         }
      } else {
         switch (var1) {
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 191:
               this.onMethodExit(var1);
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
         }
      }

      super.visitInsn(var1);
   }

   @Override
   public void visitVarInsn(int var1, int var2) {
      super.visitVarInsn(var1, var2);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         switch (var1) {
            case 21:
            case 23:
               this.pushValue(OTHER);
               break;
            case 22:
            case 24:
               this.pushValue(OTHER);
               this.pushValue(OTHER);
               break;
            case 25:
               this.pushValue(var2 == 0 ? UNINITIALIZED_THIS : OTHER);
               break;
            case 54:
            case 56:
            case 58:
               this.popValue();
               break;
            case 55:
            case 57:
               this.popValue();
               this.popValue();
               break;
            case 169:
               this.endConstructorBasicBlockWithoutSuccessor();
               break;
            default:
               throw new IllegalArgumentException(stringConcat$1(var1));
         }
      }
   }

   @Override
   public void visitFieldInsn(int var1, String var2, String var3, String var4) {
      super.visitFieldInsn(var1, var2, var3, var4);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         char var5 = var4.charAt(0);
         boolean var6 = var5 == 'J' || var5 == 'D';
         switch (var1) {
            case 178:
               this.pushValue(OTHER);
               if (var6) {
                  this.pushValue(OTHER);
               }
               break;
            case 179:
               this.popValue();
               if (var6) {
                  this.popValue();
               }
               break;
            case 180:
               if (var6) {
                  this.pushValue(OTHER);
               }
               break;
            case 181:
               this.popValue();
               this.popValue();
               if (var6) {
                  this.popValue();
               }
               break;
            default:
               throw new IllegalArgumentException(stringConcat$2(var1));
         }
      }
   }

   @Override
   public void visitIntInsn(int var1, int var2) {
      super.visitIntInsn(var1, var2);
      if (this.isConstructor && !this.superClassConstructorCalled && var1 != 188) {
         this.pushValue(OTHER);
      }
   }

   @Override
   public void visitLdcInsn(Object var1) {
      super.visitLdcInsn(var1);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         this.pushValue(OTHER);
         if (var1 instanceof Double || var1 instanceof Long || var1 instanceof ConstantDynamic && ((ConstantDynamic)var1).getSize() == 2) {
            this.pushValue(OTHER);
         }
      }
   }

   @Override
   public void visitMultiANewArrayInsn(String var1, int var2) {
      super.visitMultiANewArrayInsn(var1, var2);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         for (int var3 = 0; var3 < var2; var3++) {
            this.popValue();
         }

         this.pushValue(OTHER);
      }
   }

   @Override
   public void visitTypeInsn(int var1, String var2) {
      super.visitTypeInsn(var1, var2);
      if (this.isConstructor && !this.superClassConstructorCalled && var1 == 187) {
         this.pushValue(OTHER);
      }
   }

   @Override
   public void visitMethodInsn(int var1, String var2, String var3, String var4, boolean var5) {
      if (this.api < 327680 && (var1 & 256) == 0) {
         super.visitMethodInsn(var1, var2, var3, var4, var5);
      } else {
         super.visitMethodInsn(var1, var2, var3, var4, var5);
         int var6 = var1 & -257;
         this.doVisitMethodInsn(var6, var3, var4);
      }
   }

   private void doVisitMethodInsn(int var1, String var2, String var3) {
      if (this.isConstructor && !this.superClassConstructorCalled) {
         for (Type var7 : Type.getArgumentTypes(var3)) {
            this.popValue();
            if (var7.getSize() == 2) {
               this.popValue();
            }
         }

         switch (var1) {
            case 182:
            case 185:
               this.popValue();
               break;
            case 183:
               Object var8 = this.popValue();
               if (var8 == UNINITIALIZED_THIS && !this.superClassConstructorCalled && var2.equals("<init>")) {
                  this.superClassConstructorCalled = true;
                  this.onMethodEnter();
               }
            case 184:
         }

         Type var9 = Type.getReturnType(var3);
         if (var9 != Type.VOID_TYPE) {
            this.pushValue(OTHER);
            if (var9.getSize() == 2) {
               this.pushValue(OTHER);
            }
         }
      }
   }

   @Override
   public void visitInvokeDynamicInsn(String var1, String var2, Handle var3, Object... var4) {
      super.visitInvokeDynamicInsn(var1, var2, var3, var4);
      this.doVisitMethodInsn(186, var1, var2);
   }

   @Override
   public void visitJumpInsn(int var1, Label var2) {
      super.visitJumpInsn(var1, var2);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         switch (var1) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 198:
            case 199:
               this.popValue();
               break;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
               this.popValue();
               this.popValue();
               break;
            case 167:
               this.endConstructorBasicBlockWithoutSuccessor();
               break;
            case 168:
               this.pushValue(OTHER);
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
         }

         this.addForwardJump(var2);
      }
   }

   @Override
   public void visitLookupSwitchInsn(Label var1, int[] var2, Label[] var3) {
      super.visitLookupSwitchInsn(var1, var2, var3);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         this.popValue();
         this.addForwardJumps(var1, var3);
         this.endConstructorBasicBlockWithoutSuccessor();
      }
   }

   @Override
   public void visitTableSwitchInsn(int var1, int var2, Label var3, Label... var4) {
      super.visitTableSwitchInsn(var1, var2, var3, var4);
      if (this.isConstructor && !this.superClassConstructorCalled) {
         this.popValue();
         this.addForwardJumps(var3, var4);
         this.endConstructorBasicBlockWithoutSuccessor();
      }
   }

   @Override
   public void visitTryCatchBlock(Label var1, Label var2, Label var3, String var4) {
      super.visitTryCatchBlock(var1, var2, var3, var4);
      if (this.isConstructor && !this.forwardJumpStackFrames.containsKey(var3)) {
         ArrayList var5 = new ArrayList();
         var5.add(OTHER);
         this.forwardJumpStackFrames.put(var3, var5);
      }
   }

   private void addForwardJumps(Label var1, Label[] var2) {
      this.addForwardJump(var1);

      for (Label var6 : var2) {
         this.addForwardJump(var6);
      }
   }

   private void addForwardJump(Label var1) {
      if (!this.forwardJumpStackFrames.containsKey(var1)) {
         this.forwardJumpStackFrames.put(var1, new ArrayList<>(this.stackFrame));
      }
   }

   private void endConstructorBasicBlockWithoutSuccessor() {
      this.superClassConstructorCalled = true;
   }

   private Object popValue() {
      return this.stackFrame.remove(this.stackFrame.size() - 1);
   }

   private Object peekValue() {
      return this.stackFrame.get(this.stackFrame.size() - 1);
   }

   private void pushValue(Object var1) {
      this.stackFrame.add(var1);
   }

   protected void onMethodEnter() {
   }

   protected void onMethodExit(int var1) {
   }
}
