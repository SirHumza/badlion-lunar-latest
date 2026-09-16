package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface IconOrBuilder extends MessageOrBuilder {
   boolean hasItemStack();

   ItemStackIcon getItemStack();

   ItemStackIconOrBuilder getItemStackOrBuilder();

   boolean hasSimpleResourceLocation();

   SimpleResourceLocationIcon getSimpleResourceLocation();

   SimpleResourceLocationIconOrBuilder getSimpleResourceLocationOrBuilder();

   boolean hasAdvancedResourceLocation();

   AdvancedResourceLocationIcon getAdvancedResourceLocation();

   AdvancedResourceLocationIconOrBuilder getAdvancedResourceLocationOrBuilder();

   boolean hasResourceLocation();

   ResourceLocationIcon getResourceLocation();

   ResourceLocationIconOrBuilder getResourceLocationOrBuilder();

   Icon.ContentsCase getContentsCase();
}
