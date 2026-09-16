package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class GuiProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OpenGuiMessage_descriptor, new String[]{"GuiType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_CloseGuiMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_CloseGuiMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_CloseGuiMessage_descriptor, new String[]{"GuiType"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private GuiProto() {
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
         "\n$lunarclient/apollo/evnt/v1/gui.proto\u0012\u001alunarclient.apollo.evnt.v1\"P\n\u000eOpenGuiMessage\u0012>\n\bgui_type\u0018\u0001 \u0001(\u000e2#.lunarclient.apollo.evnt.v1.GuiTypeR\u0007guiType\"Q\n\u000fCloseGuiMessage\u0012>\n\bgui_type\u0018\u0001 \u0001(\u000e2#.lunarclient.apollo.evnt.v1.GuiTypeR\u0007guiType*¼\u0001\n\u0007GuiType\u0012\u0018\n\u0014GUI_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rGUI_TYPE_SUIT\u0010\u0001\u0012 \n\u001cGUI_TYPE_CHARACTER_SELECTION\u0010\u0002\u0012\u0018\n\u0014GUI_TYPE_OBSERVER_UI\u0010\u0003\u0012\u0017\n\u0013GUI_TYPE_WELCOME_UI\u0010\u0004\u0012\u0010\n\fGUI_TYPE_ESC\u0010\u0005\u0012\u001d\n\u0019GUI_TYPE_PLAYER_INVENTORY\u0010\u0006Bµ\u0001\n\u001ecom.lunarclient.apollo.evnt.v1B\bGuiProtoP\u0001¢\u0002\u0003LAEª\u0002\u001aLunarclient.Apollo.Evnt.V1Ê\u0002\u001aLunarclient\\Apollo\\Evnt\\V1â\u0002&Lunarclient\\Apollo\\Evnt\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Evnt::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
