package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UserSocial;
import com.lunarclient.common.v1.UserSocialOrBuilder;
import java.util.List;

public interface FriendSocialsOrBuilder extends MessageOrBuilder {
   boolean getHidden();

   List<UserSocial> getLinkedList();

   UserSocial getLinked(int var1);

   int getLinkedCount();

   List<? extends UserSocialOrBuilder> getLinkedOrBuilderList();

   UserSocialOrBuilder getLinkedOrBuilder(int var1);
}
