package org.spongepowered.asm.mixin.injection.selectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.util.Handles;
import org.spongepowered.include.com.google.common.base.Strings;

public abstract class ElementNode<TNode> {
   public boolean isField() {
      return false;
   }

   public abstract ElementNode.NodeType getType();

   public MethodNode getMethod() {
      return null;
   }

   public FieldNode getField() {
      return null;
   }

   public AbstractInsnNode getInsn() {
      return null;
   }

   public abstract String getOwner();

   public abstract String getName();

   public String getSyntheticName() {
      return this.getName();
   }

   public abstract String getDesc();

   public String getDelegateDesc() {
      return this.getDesc();
   }

   public String getImplDesc() {
      return this.getDesc();
   }

   public abstract String getSignature();

   public abstract TNode get();

   @Override
   public String toString() {
      String var1 = Strings.nullToEmpty(this.getDesc());
      if (!var1.isEmpty() && this.isField()) {
         var1 = ":" + var1;
      }

      String var2 = Strings.nullToEmpty(this.getOwner());
      if (!var2.isEmpty()) {
         var2 = "L" + var2 + ";";
      }

      return String.format("%s%s%s", var2, Strings.nullToEmpty(this.getName()), var1);
   }

   public static ElementNode<MethodNode> of(ClassNode var0, MethodNode var1) {
      return new ElementNode.ElementNodeMethod(var0, var1);
   }

   public static ElementNode<FieldNode> of(ClassNode var0, FieldNode var1) {
      return new ElementNode.ElementNodeField(var0, var1);
   }

   public static <TNode> ElementNode<TNode> of(ClassNode var0, TNode var1) {
      if (var1 instanceof ElementNode) {
         return (ElementNode<TNode>)var1;
      } else if (var1 instanceof MethodNode) {
         return new ElementNode.ElementNodeMethod(var0, (MethodNode)var1);
      } else if (var1 instanceof FieldNode) {
         return new ElementNode.ElementNodeField(var0, (FieldNode)var1);
      } else if (var1 instanceof MethodInsnNode) {
         return new ElementNode.ElementNodeMethodInsn((MethodInsnNode)var1);
      } else if (var1 instanceof InvokeDynamicInsnNode) {
         return new ElementNode.ElementNodeInvokeDynamicInsn((InvokeDynamicInsnNode)var1);
      } else if (var1 instanceof FieldInsnNode) {
         return new ElementNode.ElementNodeFieldInsn((FieldInsnNode)var1);
      } else {
         throw new IllegalArgumentException("Could not create ElementNode for unknown node type: " + var1.getClass().getName());
      }
   }

   public static <TNode extends AbstractInsnNode> ElementNode<TNode> of(TNode var0) {
      if (var0 instanceof MethodInsnNode) {
         return new ElementNode.ElementNodeMethodInsn((MethodInsnNode)var0);
      } else if (var0 instanceof InvokeDynamicInsnNode) {
         return new ElementNode.ElementNodeInvokeDynamicInsn((InvokeDynamicInsnNode)var0);
      } else {
         return var0 instanceof FieldInsnNode ? new ElementNode.ElementNodeFieldInsn((FieldInsnNode)var0) : null;
      }
   }

   public static <TNode> List<ElementNode<TNode>> listOf(ClassNode var0, List<TNode> var1) {
      ArrayList var2 = new ArrayList();

      for (Object var4 : var1) {
         var2.add(of(var0, var4));
      }

      return var2;
   }

   public static List<ElementNode<FieldNode>> fieldList(ClassNode var0) {
      ArrayList var1 = new ArrayList();

      for (FieldNode var3 : var0.fields) {
         var1.add(new ElementNode.ElementNodeField(var0, var3));
      }

      return var1;
   }

   public static List<ElementNode<MethodNode>> methodList(ClassNode var0) {
      ArrayList var1 = new ArrayList();

      for (MethodNode var3 : var0.methods) {
         var1.add(new ElementNode.ElementNodeMethod(var0, var3));
      }

      return var1;
   }

   public static Iterable<ElementNode<AbstractInsnNode>> insnList(InsnList var0) {
      return new ElementNode.ElementNodeIterable(var0, false);
   }

   public static Iterable<ElementNode<AbstractInsnNode>> dynamicInsnList(InsnList var0) {
      return new ElementNode.ElementNodeIterable(var0, true);
   }

   static class ElementNodeField extends ElementNode<FieldNode> {
      private final ClassNode owner;
      private final FieldNode field;

      ElementNodeField(ClassNode var1, FieldNode var2) {
         this.owner = var1;
         this.field = var2;
      }

      @Override
      public ElementNode.NodeType getType() {
         return ElementNode.NodeType.FIELD;
      }

      @Override
      public boolean isField() {
         return true;
      }

      @Override
      public FieldNode getField() {
         return this.field;
      }

      @Override
      public String getOwner() {
         return this.owner != null ? this.owner.name : null;
      }

      @Override
      public String getName() {
         return this.field.name;
      }

      @Override
      public String getDesc() {
         return this.field.desc;
      }

      @Override
      public String getSignature() {
         return this.field.signature;
      }

      public FieldNode get() {
         return this.field;
      }

      @Override
      public boolean equals(Object var1) {
         return this.field.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.field.hashCode();
      }
   }

   static class ElementNodeFieldInsn extends ElementNode<FieldInsnNode> {
      private FieldInsnNode insn;

      ElementNodeFieldInsn(FieldInsnNode var1) {
         this.insn = var1;
      }

      @Override
      public ElementNode.NodeType getType() {
         return ElementNode.NodeType.FIELD_INSN;
      }

      @Override
      public boolean isField() {
         return true;
      }

      @Override
      public AbstractInsnNode getInsn() {
         return this.insn;
      }

      @Override
      public String getOwner() {
         return this.insn.owner;
      }

      @Override
      public String getName() {
         return this.insn.name;
      }

      @Override
      public String getDesc() {
         return this.insn.desc;
      }

      @Override
      public String getSignature() {
         return null;
      }

      public FieldInsnNode get() {
         return this.insn;
      }

      @Override
      public boolean equals(Object var1) {
         return this.insn.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.insn.hashCode();
      }
   }

   static class ElementNodeInvokeDynamicInsn extends ElementNode<InvokeDynamicInsnNode> {
      private InvokeDynamicInsnNode insn;
      private Type samMethodType;
      private Handle implMethod;
      private Type instantiatedMethodType;

      ElementNodeInvokeDynamicInsn(InvokeDynamicInsnNode var1) {
         this.insn = var1;
         if (var1.bsmArgs != null && var1.bsmArgs.length > 1) {
            Object var2 = var1.bsmArgs[0];
            Object var3 = var1.bsmArgs[1];
            Object var4 = var1.bsmArgs[2];
            if (var2 instanceof Type && var3 instanceof Handle && var4 instanceof Type) {
               this.samMethodType = (Type)var2;
               this.implMethod = (Handle)var3;
               this.instantiatedMethodType = (Type)var4;
            }
         }
      }

      @Override
      public ElementNode.NodeType getType() {
         return ElementNode.NodeType.INVOKEDYNAMIC_INSN;
      }

      @Override
      public boolean isField() {
         return this.implMethod != null && Handles.isField(this.implMethod);
      }

      @Override
      public AbstractInsnNode getInsn() {
         return this.insn;
      }

      @Override
      public String getOwner() {
         return this.implMethod != null ? this.implMethod.getOwner() : this.insn.name;
      }

      @Override
      public String getName() {
         return this.insn.name;
      }

      @Override
      public String getSyntheticName() {
         return this.implMethod != null ? this.implMethod.getName() : this.insn.name;
      }

      @Override
      public String getDesc() {
         return this.implMethod != null ? this.implMethod.getDesc() : this.insn.desc;
      }

      @Override
      public String getDelegateDesc() {
         return this.samMethodType != null ? this.samMethodType.getDescriptor() : this.getDesc();
      }

      @Override
      public String getImplDesc() {
         return this.instantiatedMethodType != null ? this.instantiatedMethodType.getDescriptor() : this.getDesc();
      }

      @Override
      public String getSignature() {
         return null;
      }

      public InvokeDynamicInsnNode get() {
         return this.insn;
      }

      @Override
      public boolean equals(Object var1) {
         return this.insn.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.insn.hashCode();
      }
   }

   static class ElementNodeIterable implements Iterable<ElementNode<AbstractInsnNode>> {
      private final Iterable<AbstractInsnNode> iterable;
      private final boolean filterDynamic;

      public ElementNodeIterable(Iterable<AbstractInsnNode> var1, boolean var2) {
         this.iterable = var1;
         this.filterDynamic = var2;
      }

      @Override
      public Iterator<ElementNode<AbstractInsnNode>> iterator() {
         return new ElementNode.ElementNodeIterator(this.iterable.iterator(), this.filterDynamic);
      }
   }

   static class ElementNodeIterator implements Iterator<ElementNode<AbstractInsnNode>> {
      private final Iterator<AbstractInsnNode> iter;
      private final boolean filterDynamic;

      ElementNodeIterator(Iterator<AbstractInsnNode> var1, boolean var2) {
         this.iter = var1;
         this.filterDynamic = var2;
      }

      @Override
      public boolean hasNext() {
         return this.iter.hasNext();
      }

      public ElementNode<AbstractInsnNode> next() {
         AbstractInsnNode var1 = this.iter.next();
         return this.filterDynamic && (var1 == null || var1.getOpcode() != 186) ? null : ElementNode.of(var1);
      }
   }

   static class ElementNodeMethod extends ElementNode<MethodNode> {
      private final ClassNode owner;
      private final MethodNode method;

      ElementNodeMethod(ClassNode var1, MethodNode var2) {
         this.owner = var1;
         this.method = var2;
      }

      @Override
      public ElementNode.NodeType getType() {
         return ElementNode.NodeType.METHOD;
      }

      @Override
      public MethodNode getMethod() {
         return this.method;
      }

      @Override
      public String getOwner() {
         return this.owner != null ? this.owner.name : null;
      }

      @Override
      public String getName() {
         return this.method.name;
      }

      @Override
      public String getDesc() {
         return this.method.desc;
      }

      @Override
      public String getSignature() {
         return this.method.signature;
      }

      public MethodNode get() {
         return this.method;
      }

      @Override
      public boolean equals(Object var1) {
         return this.method.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.method.hashCode();
      }
   }

   static class ElementNodeMethodInsn extends ElementNode<MethodInsnNode> {
      private MethodInsnNode insn;

      ElementNodeMethodInsn(MethodInsnNode var1) {
         this.insn = var1;
      }

      @Override
      public ElementNode.NodeType getType() {
         return ElementNode.NodeType.METHOD_INSN;
      }

      @Override
      public AbstractInsnNode getInsn() {
         return this.insn;
      }

      @Override
      public String getOwner() {
         return this.insn.owner;
      }

      @Override
      public String getName() {
         return this.insn.name;
      }

      @Override
      public String getDesc() {
         return this.insn.desc;
      }

      @Override
      public String getSignature() {
         return null;
      }

      public MethodInsnNode get() {
         return this.insn;
      }

      @Override
      public boolean equals(Object var1) {
         return this.insn.equals(var1);
      }

      @Override
      public int hashCode() {
         return this.insn.hashCode();
      }
   }

   public enum NodeType {
      UNDEFINED(false, false, false),
      METHOD(true, false, false),
      FIELD(false, true, false),
      METHOD_INSN(false, false, true),
      FIELD_INSN(false, false, true),
      INVOKEDYNAMIC_INSN(false, false, true);

      public final boolean hasMethod;
      public final boolean hasField;
      public final boolean hasInsn;

      NodeType(boolean var3, boolean var4, boolean var5) {
         this.hasMethod = var3;
         this.hasField = var4;
         this.hasInsn = var5;
      }
   }
}
