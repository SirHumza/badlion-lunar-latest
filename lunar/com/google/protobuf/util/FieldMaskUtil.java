package com.google.protobuf.util;

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.Nullable;

public final class FieldMaskUtil {
   private static final String FIELD_PATH_SEPARATOR = ",";
   private static final String FIELD_PATH_SEPARATOR_REGEX = ",";
   private static final String FIELD_SEPARATOR_REGEX = "\\.";

   private FieldMaskUtil() {
   }

   public static String toString(FieldMask var0) {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = true;

      for (String var4 : var0.getPathsList()) {
         if (!var4.isEmpty()) {
            if (var2) {
               var2 = false;
            } else {
               var1.append(",");
            }

            var1.append(var4);
         }
      }

      return var1.toString();
   }

   public static FieldMask fromString(String var0) {
      return fromStringList(Arrays.asList(var0.split(",")));
   }

   public static FieldMask fromString(Class<? extends Message> var0, String var1) {
      return fromStringList(var0, Arrays.asList(var1.split(",")));
   }

   public static FieldMask fromStringList(Class<? extends Message> var0, Iterable<String> var1) {
      return fromStringList(Internal.<Message>getDefaultInstance(var0).getDescriptorForType(), var1);
   }

   public static FieldMask fromStringList(Descriptors.Descriptor var0, Iterable<String> var1) {
      return fromStringList(Optional.of(var0), var1);
   }

   public static FieldMask fromStringList(Iterable<String> var0) {
      return fromStringList(Optional.absent(), var0);
   }

   private static FieldMask fromStringList(Optional<Descriptors.Descriptor> var0, Iterable<String> var1) {
      FieldMask.Builder var2 = FieldMask.newBuilder();

      for (String var4 : var1) {
         if (!var4.isEmpty()) {
            if (var0.isPresent() && !isValid((Descriptors.Descriptor)var0.get(), var4)) {
               throw new IllegalArgumentException(var4 + " is not a valid path for " + ((Descriptors.Descriptor)var0.get()).getFullName());
            }

            var2.addPaths(var4);
         }
      }

      return var2.build();
   }

   public static FieldMask fromFieldNumbers(Class<? extends Message> var0, int... var1) {
      return fromFieldNumbers(var0, Ints.asList(var1));
   }

   public static FieldMask fromFieldNumbers(Class<? extends Message> var0, Iterable<Integer> var1) {
      Descriptors.Descriptor var2 = Internal.<Message>getDefaultInstance(var0).getDescriptorForType();
      FieldMask.Builder var3 = FieldMask.newBuilder();

      for (Integer var5 : var1) {
         Descriptors.FieldDescriptor var6 = var2.findFieldByNumber(var5);
         Preconditions.checkArgument(var6 != null, String.format("%s is not a valid field number for %s.", var5, var0));
         var3.addPaths(var6.getName());
      }

      return var3.build();
   }

   public static String toJsonString(FieldMask var0) {
      ArrayList var1 = new ArrayList(var0.getPathsCount());

      for (String var3 : var0.getPathsList()) {
         if (!var3.isEmpty()) {
            var1.add(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, var3));
         }
      }

      return Joiner.on(",").join(var1);
   }

   public static FieldMask fromJsonString(String var0) {
      Iterable var1 = Splitter.on(",").split(var0);
      FieldMask.Builder var2 = FieldMask.newBuilder();

      for (String var4 : var1) {
         if (!var4.isEmpty()) {
            var2.addPaths(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, var4));
         }
      }

      return var2.build();
   }

   public static boolean isValid(Class<? extends Message> var0, FieldMask var1) {
      Descriptors.Descriptor var2 = Internal.<Message>getDefaultInstance(var0).getDescriptorForType();
      return isValid(var2, var1);
   }

   public static boolean isValid(Descriptors.Descriptor var0, FieldMask var1) {
      for (String var3 : var1.getPathsList()) {
         if (!isValid(var0, var3)) {
            return false;
         }
      }

      return true;
   }

   public static boolean isValid(Class<? extends Message> var0, String var1) {
      Descriptors.Descriptor var2 = Internal.<Message>getDefaultInstance(var0).getDescriptorForType();
      return isValid(var2, var1);
   }

   public static boolean isValid(@Nullable Descriptors.Descriptor var0, String var1) {
      String[] var2 = var1.split("\\.");
      if (var2.length == 0) {
         return false;
      }

      for (String var6 : var2) {
         if (var0 == null) {
            return false;
         }

         Descriptors.FieldDescriptor var7 = var0.findFieldByName(var6);
         if (var7 == null) {
            return false;
         }

         if (!var7.isRepeated() && var7.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            var0 = var7.getMessageType();
         } else {
            var0 = null;
         }
      }

      return true;
   }

   public static FieldMask normalize(FieldMask var0) {
      return new FieldMaskTree(var0).toFieldMask();
   }

   public static FieldMask union(FieldMask var0, FieldMask var1, FieldMask... var2) {
      FieldMaskTree var3 = new FieldMaskTree(var0).mergeFromFieldMask(var1);

      for (FieldMask var7 : var2) {
         var3.mergeFromFieldMask(var7);
      }

      return var3.toFieldMask();
   }

   public static FieldMask subtract(FieldMask var0, FieldMask var1, FieldMask... var2) {
      FieldMaskTree var3 = new FieldMaskTree(var0).removeFromFieldMask(var1);

      for (FieldMask var7 : var2) {
         var3.removeFromFieldMask(var7);
      }

      return var3.toFieldMask();
   }

   public static FieldMask intersection(FieldMask var0, FieldMask var1) {
      FieldMaskTree var2 = new FieldMaskTree(var0);
      FieldMaskTree var3 = new FieldMaskTree();

      for (String var5 : var1.getPathsList()) {
         var2.intersectFieldPath(var5, var3);
      }

      return var3.toFieldMask();
   }

   public static void merge(FieldMask var0, Message var1, Message.Builder var2, FieldMaskUtil.MergeOptions var3) {
      new FieldMaskTree(var0).merge(var1, var2, var3);
   }

   public static void merge(FieldMask var0, Message var1, Message.Builder var2) {
      merge(var0, var1, var2, new FieldMaskUtil.MergeOptions());
   }

   public static <P extends Message> P trim(FieldMask var0, P var1) {
      Message.Builder var2 = var1.newBuilderForType();
      merge(var0, var1, var2);
      return (P)var2.build();
   }

   public static final class MergeOptions {
      private boolean replaceMessageFields = false;
      private boolean replaceRepeatedFields = false;
      private boolean replacePrimitiveFields = false;

      public boolean replaceMessageFields() {
         return this.replaceMessageFields;
      }

      public boolean replaceRepeatedFields() {
         return this.replaceRepeatedFields;
      }

      public boolean replacePrimitiveFields() {
         return this.replacePrimitiveFields;
      }

      @CanIgnoreReturnValue
      public FieldMaskUtil.MergeOptions setReplaceMessageFields(boolean var1) {
         this.replaceMessageFields = var1;
         return this;
      }

      @CanIgnoreReturnValue
      public FieldMaskUtil.MergeOptions setReplaceRepeatedFields(boolean var1) {
         this.replaceRepeatedFields = var1;
         return this;
      }

      @CanIgnoreReturnValue
      public FieldMaskUtil.MergeOptions setReplacePrimitiveFields(boolean var1) {
         this.replacePrimitiveFields = var1;
         return this;
      }
   }
}
