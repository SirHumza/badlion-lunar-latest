package com.google.protobuf;

@CheckReturnValue
final class RawMessageInfo implements MessageInfo {
   private static final int IS_PROTO2_BIT = 1;
   private static final int IS_EDITION_BIT = 4;
   private final MessageLite defaultInstance;
   private final String info;
   private final Object[] objects;
   private final int flags;

   RawMessageInfo(MessageLite var1, String var2, Object[] var3) {
      this.defaultInstance = var1;
      this.info = var2;
      this.objects = var3;
      int var4 = 0;
      char var5 = var2.charAt(var4++);
      if (var5 < '\ud800') {
         this.flags = var5;
      } else {
         int var6 = var5 & 8191;

         byte var7;
         for (var7 = 13; (var5 = var2.charAt(var4++)) >= '\ud800'; var7 += 13) {
            var6 |= (var5 & 8191) << var7;
         }

         this.flags = var6 | var5 << var7;
      }
   }

   String getStringInfo() {
      return this.info;
   }

   Object[] getObjects() {
      return this.objects;
   }

   @Override
   public MessageLite getDefaultInstance() {
      return this.defaultInstance;
   }

   @Override
   public ProtoSyntax getSyntax() {
      if ((this.flags & 1) != 0) {
         return ProtoSyntax.PROTO2;
      } else {
         return (this.flags & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
      }
   }

   @Override
   public boolean isMessageSetWireFormat() {
      return (this.flags & 2) == 2;
   }
}
