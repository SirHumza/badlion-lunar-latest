package com.lunarclient.apollo.button.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ButtonContentOrBuilder extends MessageOrBuilder {
   List<ButtonContentPart> getPartsList();

   ButtonContentPart getParts(int var1);

   int getPartsCount();

   List<? extends ButtonContentPartOrBuilder> getPartsOrBuilderList();

   ButtonContentPartOrBuilder getPartsOrBuilder(int var1);

   float getScale();
}
