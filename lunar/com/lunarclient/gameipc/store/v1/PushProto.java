package com.lunarclient.gameipc.store.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_store_v1_StartStorePreviewSessionPush_descriptor, new String[]{"BasketIdent", "Currency", "PackageId"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n'lunarclient/gameipc/store/v1/push.proto\u0012\u001clunarclient.gameipc.store.v1\"\u0090\u0001\n\u001cStartStorePreviewSessionPush\u0012!\n\fbasket_ident\u0018\u0001 \u0001(\tR\u000bbasketIdent\u0012\u001a\n\bcurrency\u0018\u0003 \u0001(\tR\bcurrency\u0012\"\n\npackage_id\u0018\u0002 \u0001(\u0005H\u0000R\tpackageId\u0088\u0001\u0001B\r\n\u000b_package_idBÀ\u0001\n com.lunarclient.gameipc.store.v1B\tPushProtoP\u0001¢\u0002\u0003LGSª\u0002\u001cLunarclient.Gameipc.Store.V1Ê\u0002\u001cLunarclient\\Gameipc\\Store\\V1â\u0002(Lunarclient\\Gameipc\\Store\\V1\\GPBMetadataê\u0002\u001fLunarclient::Gameipc::Store::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
