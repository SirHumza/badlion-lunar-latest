package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CustomModelDataOrBuilder extends MessageOrBuilder {
   List<Float> getFloatsList();

   int getFloatsCount();

   float getFloats(int var1);

   List<Boolean> getFlagsList();

   int getFlagsCount();

   boolean getFlags(int var1);

   List<String> getStringsList();

   int getStringsCount();

   String getStrings(int var1);

   ByteString getStringsBytes(int var1);

   List<Integer> getColorsList();

   int getColorsCount();

   int getColors(int var1);
}
