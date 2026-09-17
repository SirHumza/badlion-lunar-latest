package com.lunarclient.websocket.server.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CheckAuthorizedFeaturesResponseOrBuilder extends MessageOrBuilder {
   List<String> getScopesList();

   int getScopesCount();

   String getScopes(int var1);

   ByteString getScopesBytes(int var1);

   List<Integer> getAssociatedCosmeticIdsList();

   int getAssociatedCosmeticIdsCount();

   int getAssociatedCosmeticIds(int var1);

   List<Integer> getAssociatedEmoteIdsList();

   int getAssociatedEmoteIdsCount();

   int getAssociatedEmoteIds(int var1);

   List<Integer> getAssociatedSprayIdsList();

   int getAssociatedSprayIdsCount();

   int getAssociatedSprayIds(int var1);
}
