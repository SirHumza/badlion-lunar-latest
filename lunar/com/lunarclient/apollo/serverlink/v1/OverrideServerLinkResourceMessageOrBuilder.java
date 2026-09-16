package com.lunarclient.apollo.serverlink.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.ResourceLocationIcon;
import com.lunarclient.apollo.common.v1.ResourceLocationIconOrBuilder;

public interface OverrideServerLinkResourceMessageOrBuilder extends MessageOrBuilder {
   boolean hasIcon();

   ResourceLocationIcon getIcon();

   ResourceLocationIconOrBuilder getIconOrBuilder();
}
