package com.lunarclient.apollo.limb.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.util.List;

public interface HideArmorPiecesMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   List<ArmorPiece> getArmorPiecesList();

   int getArmorPiecesCount();

   ArmorPiece getArmorPieces(int var1);

   List<Integer> getArmorPiecesValueList();

   int getArmorPiecesValue(int var1);
}
