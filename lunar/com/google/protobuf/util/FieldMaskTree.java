package com.google.protobuf.util;

import com.google.common.base.Splitter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.logging.Logger;

final class FieldMaskTree {
   private static final Logger logger = Logger.getLogger(FieldMaskTree.class.getName());
   private static final String FIELD_PATH_SEPARATOR_REGEX = "\\.";
   private final FieldMaskTree.Node root = new FieldMaskTree.Node();

   FieldMaskTree() {
   }

   FieldMaskTree(FieldMask var1) {
      this.mergeFromFieldMask(var1);
   }

   @Override
   public String toString() {
      return FieldMaskUtil.toString(this.toFieldMask());
   }

   @CanIgnoreReturnValue
   FieldMaskTree addFieldPath(String var1) {
      String[] var2 = var1.split("\\.");
      if (var2.length == 0) {
         return this;
      }

      FieldMaskTree.Node var3 = this.root;
      boolean var4 = false;

      for (String var8 : var2) {
         if (!var4 && var3 != this.root && var3.children.isEmpty()) {
            return this;
         }

         if (var3.children.containsKey(var8)) {
            var3 = var3.children.get(var8);
         } else {
            var4 = true;
            FieldMaskTree.Node var9 = new FieldMaskTree.Node();
            var3.children.put(var8, var9);
            var3 = var9;
         }
      }

      var3.children.clear();
      return this;
   }

   @CanIgnoreReturnValue
   FieldMaskTree mergeFromFieldMask(FieldMask var1) {
      for (String var3 : var1.getPathsList()) {
         this.addFieldPath(var3);
      }

      return this;
   }

   @CanIgnoreReturnValue
   FieldMaskTree removeFieldPath(String var1) {
      List var2 = Splitter.onPattern("\\.").splitToList(var1);
      if (var2.isEmpty()) {
         return this;
      }

      removeFieldPath(this.root, var2, 0);
      return this;
   }

   @CanIgnoreReturnValue
   private static boolean removeFieldPath(FieldMaskTree.Node var0, List<String> var1, int var2) {
      String var3 = (String)var1.get(var2);
      if (!var0.children.containsKey(var3)) {
         return false;
      }

      if (var2 == var1.size() - 1) {
         var0.children.remove(var3);
         return var0.children.isEmpty();
      }

      if (removeFieldPath(var0.children.get(var3), var1, var2 + 1)) {
         var0.children.remove(var3);
      }

      return var0.children.isEmpty();
   }

   @CanIgnoreReturnValue
   FieldMaskTree removeFromFieldMask(FieldMask var1) {
      for (String var3 : var1.getPathsList()) {
         this.removeFieldPath(var3);
      }

      return this;
   }

   FieldMask toFieldMask() {
      if (this.root.children.isEmpty()) {
         return FieldMask.getDefaultInstance();
      }

      ArrayList var1 = new ArrayList();
      getFieldPaths(this.root, "", var1);
      return FieldMask.newBuilder().addAllPaths(var1).build();
   }

   private static void getFieldPaths(FieldMaskTree.Node var0, String var1, List<String> var2) {
      if (var0.children.isEmpty()) {
         var2.add(var1);
      } else {
         for (Entry var4 : var0.children.entrySet()) {
            String var5 = var1.isEmpty() ? (String)var4.getKey() : var1 + "." + (String)var4.getKey();
            getFieldPaths((FieldMaskTree.Node)var4.getValue(), var5, var2);
         }
      }
   }

   void intersectFieldPath(String var1, FieldMaskTree var2) {
      if (!this.root.children.isEmpty()) {
         String[] var3 = var1.split("\\.");
         if (var3.length != 0) {
            FieldMaskTree.Node var4 = this.root;

            for (String var8 : var3) {
               if (var4 != this.root && var4.children.isEmpty()) {
                  var2.addFieldPath(var1);
                  return;
               }

               if (!var4.children.containsKey(var8)) {
                  return;
               }

               var4 = var4.children.get(var8);
            }

            ArrayList var9 = new ArrayList();
            getFieldPaths(var4, var1, var9);

            for (String var11 : var9) {
               var2.addFieldPath(var11);
            }
         }
      }
   }

   void merge(Message var1, Message.Builder var2, FieldMaskUtil.MergeOptions var3) {
      if (var1.getDescriptorForType() != var2.getDescriptorForType()) {
         throw new IllegalArgumentException("Cannot merge messages of different types.");
      }

      if (!this.root.children.isEmpty()) {
         merge(this.root, var1, var2, var3);
      }
   }

   private static void merge(FieldMaskTree.Node var0, Message var1, Message.Builder var2, FieldMaskUtil.MergeOptions var3) {
      if (var1.getDescriptorForType() != var2.getDescriptorForType()) {
         throw new IllegalArgumentException(
            String.format(
               "source (%s) and destination (%s) descriptor must be equal",
               var1.getDescriptorForType().getFullName(),
               var2.getDescriptorForType().getFullName()
            )
         );
      }

      Descriptors.Descriptor var4 = var1.getDescriptorForType();

      for (Entry var6 : var0.children.entrySet()) {
         Descriptors.FieldDescriptor var7 = var4.findFieldByName((String)var6.getKey());
         if (var7 == null) {
            logger.warning("Cannot find field \"" + (String)var6.getKey() + "\" in message type " + var4.getFullName());
         } else if (!((FieldMaskTree.Node)var6.getValue()).children.isEmpty()) {
            if (var7.isRepeated() || var7.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
               logger.warning("Field \"" + var7.getFullName() + "\" is not a singular message field and cannot have sub-fields.");
            } else if (var1.hasField(var7) || var2.hasField(var7)) {
               Message.Builder var10 = var2 instanceof GeneratedMessage.Builder ? var2.getFieldBuilder(var7) : ((Message)var2.getField(var7)).toBuilder();
               merge((FieldMaskTree.Node)var6.getValue(), (Message)var1.getField(var7), var10, var3);
               var2.setField(var7, var10.buildPartial());
            }
         } else if (var7.isRepeated()) {
            if (var3.replaceRepeatedFields()) {
               var2.setField(var7, var1.getField(var7));
            } else {
               for (Object var9 : (List)var1.getField(var7)) {
                  var2.addRepeatedField(var7, var9);
               }
            }
         } else if (var7.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            if (var3.replaceMessageFields()) {
               if (!var1.hasField(var7)) {
                  var2.clearField(var7);
               } else {
                  var2.setField(var7, var1.getField(var7));
               }
            } else if (var1.hasField(var7)) {
               var2.setField(var7, ((Message)var2.getField(var7)).toBuilder().mergeFrom((Message)var1.getField(var7)).build());
            }
         } else if (!var1.hasField(var7) && var3.replacePrimitiveFields()) {
            var2.clearField(var7);
         } else {
            var2.setField(var7, var1.getField(var7));
         }
      }
   }

   private static final class Node {
      final SortedMap<String, FieldMaskTree.Node> children = new TreeMap<>();

      private Node() {
      }
   }
}
