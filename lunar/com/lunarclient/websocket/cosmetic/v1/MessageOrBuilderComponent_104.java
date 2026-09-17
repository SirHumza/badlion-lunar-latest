package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoadTabLogosResponseOrBuilder extends MessageOrBuilder {
   List<LoadTabLogosResponse.TabLogo> getTabLogosList();

   LoadTabLogosResponse.TabLogo getTabLogos(int var1);

   int getTabLogosCount();

   List<? extends LoadTabLogosResponse.TabLogoOrBuilder> getTabLogosOrBuilderList();

   LoadTabLogosResponse.TabLogoOrBuilder getTabLogosOrBuilder(int var1);
}
