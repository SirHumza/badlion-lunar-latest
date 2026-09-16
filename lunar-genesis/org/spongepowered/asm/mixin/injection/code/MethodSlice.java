package org.spongepowered.asm.mixin.injection.code;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.logging.ILogger;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointAnnotationContext;
import org.spongepowered.asm.mixin.injection.struct.Target;
import org.spongepowered.asm.mixin.injection.throwables.InjectionError;
import org.spongepowered.asm.mixin.injection.throwables.InvalidSliceException;
import org.spongepowered.asm.service.MixinService;
import org.spongepowered.asm.util.Annotations;
import org.spongepowered.include.com.google.common.base.Strings;

public final class MethodSlice {
   private static final ILogger logger = MixinService.getService().getLogger("mixin");
   private final ISliceContext owner;
   private final String id;
   private final InjectionPoint from;
   private final InjectionPoint to;
   private final String name;
   private int successCountFrom;
   private int successCountTo;

   private MethodSlice(ISliceContext var1, String var2, InjectionPoint var3, InjectionPoint var4) {
      if (var3 == null && var4 == null) {
         throw new InvalidSliceException(var1, String.format("%s is redundant. No 'from' or 'to' value specified", this));
      }

      this.owner = var1;
      this.id = Strings.nullToEmpty(var2);
      this.from = var3;
      this.to = var4;
      this.name = getSliceName(var2);
   }

   public String getId() {
      return this.id;
   }

   public InsnListReadOnly getSlice(Target var1) {
      int var2 = var1.insns.size() - 1;
      int var3 = this.find(var1, this.from, 0, 0, "from");
      int var4 = this.find(var1, this.to, var2, var3, "to");
      if (var3 > var4) {
         throw new InvalidSliceException(this.owner, String.format("%s is negative size. Range(%d -> %d)", this.describe(), var3, var4));
      } else if (var3 < 0 || var4 < 0 || var3 > var2 || var4 > var2) {
         throw new InjectionError("Unexpected critical error in " + this + ": out of bounds start=" + var3 + " end=" + var4 + " lim=" + var2);
      } else {
         return var3 == 0 && var4 == var2 ? new InsnListEx(var1) : new MethodSlice.InsnListSlice(var1, var3, var4);
      }
   }

   private int find(Target var1, InjectionPoint var2, int var3, int var4, String var5) {
      if (var2 == null) {
         return var3;
      }

      String var6 = String.format("%s(%s)", this.name, var5);
      LinkedList var7 = new LinkedList();
      InsnListEx var8 = new InsnListEx(var1);
      boolean var9 = var2.find(var1.getDesc(), var8, var7);
      InjectionPoint.Specifier var10 = var2.getSpecifier(InjectionPoint.Specifier.FIRST);
      if (var10 == InjectionPoint.Specifier.ALL) {
         throw new InvalidSliceException(this.owner, String.format("ALL is not a valid specifier for slice %s", this.describe(var6)));
      }

      if (var7.size() != 1 && var10 == InjectionPoint.Specifier.ONE) {
         throw new InvalidSliceException(this.owner, String.format("%s requires 1 result but found %d", this.describe(var6), var7.size()));
      }

      if (!var9) {
         return var4;
      }

      if ("from".equals(var5)) {
         this.successCountFrom++;
      } else {
         this.successCountTo++;
      }

      return var1.indexOf(var10 == InjectionPoint.Specifier.FIRST ? (AbstractInsnNode)var7.getFirst() : (AbstractInsnNode)var7.getLast());
   }

   public void postInject() {
      if (this.owner.getMixin().getOption(MixinEnvironment.Option.DEBUG_VERBOSE)) {
         if (this.from != null && this.successCountFrom == 0) {
            logger.warn("{} did not match any instructions", this.describe(this.name + "(from)"));
         }

         if (this.to != null && this.successCountTo == 0) {
            logger.warn("{} did not match any instructions", this.describe(this.name + "(to)"));
         }
      }
   }

   @Override
   public String toString() {
      return this.describe();
   }

   private String describe() {
      return this.describe(this.name);
   }

   private String describe(String var1) {
      return describeSlice(var1, this.owner);
   }

   private static String describeSlice(String var0, ISliceContext var1) {
      String var2 = Annotations.getSimpleName(var1.getAnnotationNode());
      MethodNode var3 = var1.getMethod();
      return String.format("%s->%s(%s)::%s%s", var1.getMixin(), var2, var0, var3.name, var3.desc);
   }

   private static String getSliceName(String var0) {
      return String.format("@Slice[%s]", Strings.nullToEmpty(var0));
   }

   public static MethodSlice parse(ISliceContext var0, Slice var1) {
      String var2 = var1.id();
      At var3 = var1.from();
      At var4 = var1.to();
      InjectionPoint var5 = var3 != null ? InjectionPoint.parse(var0, var3) : null;
      InjectionPoint var6 = var4 != null ? InjectionPoint.parse(var0, var4) : null;
      return new MethodSlice(var0, var2, var5, var6);
   }

   public static MethodSlice parse(ISliceContext var0, AnnotationNode var1) {
      String var2 = Annotations.getValue(var1, "id");
      String var3 = "slice";
      if (!Strings.isNullOrEmpty(var2)) {
         var3 = var3 + "." + var2;
      }

      InjectionPointAnnotationContext var4 = new InjectionPointAnnotationContext(var0, var1, var3);
      AnnotationNode var5 = Annotations.getValue(var1, "from");
      AnnotationNode var6 = Annotations.getValue(var1, "to");
      InjectionPoint var7 = var5 != null ? InjectionPoint.parse(new InjectionPointAnnotationContext(var4, var5, "from"), var5) : null;
      InjectionPoint var8 = var6 != null ? InjectionPoint.parse(new InjectionPointAnnotationContext(var4, var6, "to"), var6) : null;
      return new MethodSlice(var0, var2, var7, var8);
   }

   static final class InsnListSlice extends InsnListEx {
      private final int start;
      private final int end;

      protected InsnListSlice(Target var1, int var2, int var3) {
         super(var1);
         this.start = var2;
         this.end = var3;
      }

      @Override
      public ListIterator<AbstractInsnNode> iterator() {
         return this.iterator(0);
      }

      @Override
      public ListIterator<AbstractInsnNode> iterator(int var1) {
         return new MethodSlice.InsnListSlice.SliceIterator(super.iterator(this.start + var1), this.start, this.end, this.start + var1);
      }

      @Override
      public AbstractInsnNode[] toArray() {
         AbstractInsnNode[] var1 = super.toArray();
         AbstractInsnNode[] var2 = new AbstractInsnNode[this.size()];
         System.arraycopy(var1, this.start, var2, 0, var2.length);
         return var2;
      }

      @Override
      public int size() {
         return this.end - this.start + 1;
      }

      @Override
      public AbstractInsnNode getFirst() {
         return super.get(this.start);
      }

      @Override
      public AbstractInsnNode getLast() {
         return super.get(this.end);
      }

      @Override
      public AbstractInsnNode get(int var1) {
         return super.get(this.start + var1);
      }

      @Override
      public boolean contains(AbstractInsnNode var1) {
         if (var1 == null) {
            return false;
         }

         for (AbstractInsnNode var5 : this.toArray()) {
            if (var5 == var1) {
               return true;
            }
         }

         return false;
      }

      @Override
      public int indexOf(AbstractInsnNode var1) {
         int var2 = super.indexOf(var1);
         return var2 >= this.start && var2 <= this.end ? var2 - this.start : -1;
      }

      static class SliceIterator implements ListIterator<AbstractInsnNode> {
         private final ListIterator<AbstractInsnNode> iter;
         private int start;
         private int end;
         private int index;

         public SliceIterator(ListIterator<AbstractInsnNode> var1, int var2, int var3, int var4) {
            this.iter = var1;
            this.start = var2;
            this.end = var3;
            this.index = var4;
         }

         @Override
         public boolean hasNext() {
            return this.index <= this.end && this.iter.hasNext();
         }

         public AbstractInsnNode next() {
            if (this.index > this.end) {
               throw new NoSuchElementException();
            }

            this.index++;
            return this.iter.next();
         }

         @Override
         public boolean hasPrevious() {
            return this.index > this.start;
         }

         public AbstractInsnNode previous() {
            if (this.index <= this.start) {
               throw new NoSuchElementException();
            }

            this.index--;
            return this.iter.previous();
         }

         @Override
         public int nextIndex() {
            return this.index - this.start;
         }

         @Override
         public int previousIndex() {
            return this.index - this.start - 1;
         }

         @Override
         public void remove() {
            throw new UnsupportedOperationException("Cannot remove insn from slice");
         }

         public void set(AbstractInsnNode var1) {
            throw new UnsupportedOperationException("Cannot set insn using slice");
         }

         public void add(AbstractInsnNode var1) {
            throw new UnsupportedOperationException("Cannot add insn using slice");
         }
      }
   }
}
