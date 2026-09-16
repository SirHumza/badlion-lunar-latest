package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<LinkedSocial> getLinkedSocialsList();

   LinkedSocial getLinkedSocials(int var1);

   int getLinkedSocialsCount();

   List<? extends LinkedSocialOrBuilder> getLinkedSocialsOrBuilderList();

   LinkedSocialOrBuilder getLinkedSocialsOrBuilder(int var1);

   int getSocialsVisibilityValue();

   SocialsVisibility getSocialsVisibility();
}
