package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.ItemStackIcon;
import com.lunarclient.apollo.common.v1.ItemStackIconOrBuilder;

public interface ItemTargetOrBuilder extends MessageOrBuilder {
   boolean hasItemStack();

   ItemStackIcon getItemStack();

   ItemStackIconOrBuilder getItemStackOrBuilder();
}
