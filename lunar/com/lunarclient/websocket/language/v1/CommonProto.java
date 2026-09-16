package com.lunarclient.websocket.language.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_language_v1_Language_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_language_v1_Language_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_language_v1_Language_descriptor, new String[]{"Iso6393Code", "MinecraftCode", "Language"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n.lunarclient/websocket/language/v1/common.proto\u0012!lunarclient.websocket.language.v1\"f\n\bLanguage\u0012%\n\u000eiso_639_3_code\u0018\u0001 \u0001(\tH\u0000R\u000biso6393Code\u0012'\n\u000eminecraft_code\u0018\u0002 \u0001(\tH\u0000R\rminecraftCodeB\n\n\blanguageBÛ\u0001\n%com.lunarclient.websocket.language.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWLª\u0002!Lunarclient.Websocket.Language.V1Ê\u0002!Lunarclient\\Websocket\\Language\\V1â\u0002-Lunarclient\\Websocket\\Language\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Language::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
