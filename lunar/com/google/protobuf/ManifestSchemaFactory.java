package com.google.protobuf;

@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {
   private final MessageInfoFactory messageInfoFactory;
   private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() {
      @Override
      public boolean isSupported(Class<?> var1) {
         return false;
      }

      @Override
      public MessageInfo messageInfoFor(Class<?> var1) {
         throw new IllegalStateException("This should never be called.");
      }
   };

   public ManifestSchemaFactory() {
      this(getDefaultMessageInfoFactory());
   }

   private ManifestSchemaFactory(MessageInfoFactory var1) {
      this.messageInfoFactory = Internal.checkNotNull(var1, "messageInfoFactory");
   }

   @Override
   public <T> Schema<T> createSchema(Class<T> var1) {
      SchemaUtil.requireGeneratedMessage(var1);
      MessageInfo var2 = this.messageInfoFactory.messageInfoFor(var1);
      if (var2.isMessageSetWireFormat()) {
         return GeneratedMessageLite.class.isAssignableFrom(var1)
            ? MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), var2.getDefaultInstance())
            : MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetFullSchema(), ExtensionSchemas.full(), var2.getDefaultInstance());
      } else {
         return newSchema(var1, var2);
      }
   }

   private static <T> Schema<T> newSchema(Class<T> var0, MessageInfo var1) {
      if (GeneratedMessageLite.class.isAssignableFrom(var0)) {
         return allowExtensions(var1)
            ? MessageSchema.newSchema(
               var0,
               var1,
               NewInstanceSchemas.lite(),
               ListFieldSchema.lite(),
               SchemaUtil.unknownFieldSetLiteSchema(),
               ExtensionSchemas.lite(),
               MapFieldSchemas.lite()
            )
            : MessageSchema.newSchema(
               var0, var1, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), null, MapFieldSchemas.lite()
            );
      } else {
         return allowExtensions(var1)
            ? MessageSchema.newSchema(
               var0,
               var1,
               NewInstanceSchemas.full(),
               ListFieldSchema.full(),
               SchemaUtil.unknownFieldSetFullSchema(),
               ExtensionSchemas.full(),
               MapFieldSchemas.full()
            )
            : MessageSchema.newSchema(
               var0, var1, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.unknownFieldSetFullSchema(), null, MapFieldSchemas.full()
            );
      }
   }

   private static boolean allowExtensions(MessageInfo var0) {
      switch (var0.getSyntax()) {
         case PROTO3:
            return false;
         default:
            return true;
      }
   }

   private static MessageInfoFactory getDefaultMessageInfoFactory() {
      return new ManifestSchemaFactory.CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
   }

   private static MessageInfoFactory getDescriptorMessageInfoFactory() {
      try {
         Class var0 = Class.forName("com.google.protobuf.DescriptorMessageInfoFactory");
         return (MessageInfoFactory)var0.getDeclaredMethod("getInstance").invoke(null);
      } catch (Exception var1) {
         return EMPTY_FACTORY;
      }
   }

   private static class CompositeMessageInfoFactory implements MessageInfoFactory {
      private MessageInfoFactory[] factories;

      CompositeMessageInfoFactory(MessageInfoFactory... var1) {
         this.factories = var1;
      }

      @Override
      public boolean isSupported(Class<?> var1) {
         for (MessageInfoFactory var5 : this.factories) {
            if (var5.isSupported(var1)) {
               return true;
            }
         }

         return false;
      }

      @Override
      public MessageInfo messageInfoFor(Class<?> var1) {
         for (MessageInfoFactory var5 : this.factories) {
            if (var5.isSupported(var1)) {
               return var5.messageInfoFor(var1);
            }
         }

         throw new UnsupportedOperationException("No factory is available for message type: " + var1.getName());
      }
   }
}
