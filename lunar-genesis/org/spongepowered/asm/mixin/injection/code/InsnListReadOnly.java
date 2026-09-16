package org.spongepowered.asm.mixin.injection.code;

import java.util.ListIterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;

public abstract class InsnListReadOnly extends InsnList {
   private InsnList insnList;

   public InsnListReadOnly(InsnList var1) {
      this.insnList = var1;
   }

   void dispose() {
      this.insnList = null;
   }

   @Override
   public final void set(AbstractInsnNode var1, AbstractInsnNode var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void add(AbstractInsnNode var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void add(InsnList var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insert(AbstractInsnNode var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insert(InsnList var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insert(AbstractInsnNode var1, AbstractInsnNode var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insert(AbstractInsnNode var1, InsnList var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insertBefore(AbstractInsnNode var1, AbstractInsnNode var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void insertBefore(AbstractInsnNode var1, InsnList var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void remove(AbstractInsnNode var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public AbstractInsnNode[] toArray() {
      return this.insnList.toArray();
   }

   @Override
   public int size() {
      return this.insnList.size();
   }

   @Override
   public AbstractInsnNode getFirst() {
      return this.insnList.getFirst();
   }

   @Override
   public AbstractInsnNode getLast() {
      return this.insnList.getLast();
   }

   @Override
   public AbstractInsnNode get(int var1) {
      return this.insnList.get(var1);
   }

   @Override
   public boolean contains(AbstractInsnNode var1) {
      return var1 == null ? false : this.insnList.contains(var1);
   }

   @Override
   public int indexOf(AbstractInsnNode var1) {
      return this.insnList.indexOf(var1);
   }

   @Override
   public ListIterator<AbstractInsnNode> iterator() {
      return this.insnList.iterator();
   }

   @Override
   public ListIterator<AbstractInsnNode> iterator(int var1) {
      return this.insnList.iterator(var1);
   }

   @Override
   public final void resetLabels() {
      this.insnList.resetLabels();
   }
}
