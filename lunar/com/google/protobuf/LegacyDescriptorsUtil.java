package com.google.protobuf;

public final class LegacyDescriptorsUtil {
   private LegacyDescriptorsUtil() {
   }

   public static final class LegacyFieldDescriptor {
      public static boolean hasOptionalKeyword(Descriptors.FieldDescriptor var0) {
         return var0.hasOptionalKeyword();
      }

      private LegacyFieldDescriptor() {
      }
   }

   public static final class LegacyFileDescriptor {
      public static LegacyDescriptorsUtil.LegacyFileDescriptor.Syntax getSyntax(Descriptors.FileDescriptor var0) {
         switch (var0.getSyntax()) {
            case UNKNOWN:
               return LegacyDescriptorsUtil.LegacyFileDescriptor.Syntax.UNKNOWN;
            case PROTO2:
               return LegacyDescriptorsUtil.LegacyFileDescriptor.Syntax.PROTO2;
            case PROTO3:
               return LegacyDescriptorsUtil.LegacyFileDescriptor.Syntax.PROTO3;
            default:
               throw new IllegalArgumentException("Unexpected syntax");
         }
      }

      private LegacyFileDescriptor() {
      }

      public enum Syntax {
         UNKNOWN("unknown"),
         PROTO2("proto2"),
         PROTO3("proto3");

         final String name;

         Syntax(String var3) {
            this.name = var3;
         }
      }
   }

   public static final class LegacyOneofDescriptor {
      public static boolean isSynthetic(Descriptors.OneofDescriptor var0) {
         return var0.isSynthetic();
      }

      private LegacyOneofDescriptor() {
      }
   }
}
