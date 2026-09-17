package com.lunarclient.apollo.configurable.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface OverrideConfigurableSettingsMessageOrBuilder extends MessageOrBuilder {
   List<ConfigurableSettings> getConfigurableSettingsList();

   ConfigurableSettings getConfigurableSettings(int var1);

   int getConfigurableSettingsCount();

   List<? extends ConfigurableSettingsOrBuilder> getConfigurableSettingsOrBuilderList();

   ConfigurableSettingsOrBuilder getConfigurableSettingsOrBuilder(int var1);
}
