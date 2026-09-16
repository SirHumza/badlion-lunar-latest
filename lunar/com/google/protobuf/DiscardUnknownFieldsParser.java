package com.google.protobuf;

public final class DiscardUnknownFieldsParser {
   public static final <T extends Message> Parser<T> wrap(final Parser<T> var0) {
      return new AbstractParser<T>() {
         public T parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            try {
               var1.discardUnknownFields();
               return (T)var0.parsePartialFrom(var1, var2);
            } finally {
               var1.unsetDiscardUnknownFields();
            }
         }
      };
   }

   private DiscardUnknownFieldsParser() {
   }
}
