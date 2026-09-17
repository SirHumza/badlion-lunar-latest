package com.lunarclient.websocket.jam.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<OwnedJam> getOwnedJamsList();

   OwnedJam getOwnedJams(int var1);

   int getOwnedJamsCount();

   List<? extends OwnedJamOrBuilder> getOwnedJamsOrBuilderList();

   OwnedJamOrBuilder getOwnedJamsOrBuilder(int var1);
}
