package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ComponentProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Component_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Component_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Component_descriptor, new String[]{"Content", "Color", "Decorators", "Children"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ComponentProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n,lunarclient/apollo/common/v1/component.proto\u0012\u001clunarclient.apollo.common.v1\u001a(lunarclient/apollo/common/v1/color.proto\"Æ\u0003\n\tComponent\u0012\u0018\n\u0007content\u0018\u0001 \u0001(\tR\u0007content\u00129\n\u0005color\u0018\u0002 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u0012U\n\ndecorators\u0018\u0003 \u0003(\u000e25.lunarclient.apollo.common.v1.Component.TextDecoratorR\ndecorators\u0012C\n\bchildren\u0018\u0004 \u0003(\u000b2'.lunarclient.apollo.common.v1.ComponentR\bchildren\"Ã\u0001\n\rTextDecorator\u0012\u001e\n\u001aTEXT_DECORATOR_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019TEXT_DECORATOR_OBFUSCATED\u0010\u0001\u0012\u0017\n\u0013TEXT_DECORATOR_BOLD\u0010\u0002\u0012 \n\u001cTEXT_DECORATOR_STRIKETHROUGH\u0010\u0003\u0012\u001d\n\u0019TEXT_DECORATOR_UNDERLINED\u0010\u0004\u0012\u0019\n\u0015TEXT_DECORATOR_ITALIC\u0010\u0005:\u0002\u0018\u0001BÅ\u0001\n com.lunarclient.apollo.common.v1B\u000eComponentProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor()});
      ColorProto.getDescriptor();
   }
}
