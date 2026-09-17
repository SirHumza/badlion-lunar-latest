package com.lunarclient.apollo.configurable.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Value;
import java.util.Map;

public interface ConfigurableSettingsOrBuilder extends MessageOrBuilder {
   boolean hasLunarClientMod();

   String getLunarClientMod();

   ByteString getLunarClientModBytes();

   boolean hasApolloModule();

   String getApolloModule();

   ByteString getApolloModuleBytes();

   boolean getEnable();

   int getPropertiesCount();

   boolean containsProperties(String var1);

   @Deprecated
   Map<String, Value> getProperties();

   Map<String, Value> getPropertiesMap();

   Value getPropertiesOrDefault(String var1, Value var2);

   Value getPropertiesOrThrow(String var1);

   ConfigurableSettings.TargetCase getTargetCase();
}
