package com.lunarclient.apollo.button.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.hud.v1.HudPositionOrBuilder;

public interface ButtonOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasPosition();

   HudPosition getPosition();

   HudPositionOrBuilder getPositionOrBuilder();

   boolean hasSize();

   ButtonSize getSize();

   ButtonSizeOrBuilder getSizeOrBuilder();

   int getShapeValue();

   ButtonShape getShape();

   boolean hasBackgroundColor();

   Color getBackgroundColor();

   ColorOrBuilder getBackgroundColorOrBuilder();

   boolean hasBorderColor();

   Color getBorderColor();

   ColorOrBuilder getBorderColorOrBuilder();

   boolean hasContent();

   ButtonContent getContent();

   ButtonContentOrBuilder getContentOrBuilder();

   boolean hasTooltip();

   ButtonTooltip getTooltip();

   ButtonTooltipOrBuilder getTooltipOrBuilder();

   boolean hasRunCommand();

   String getRunCommand();

   ByteString getRunCommandBytes();

   boolean hasOpenUrl();

   String getOpenUrl();

   ByteString getOpenUrlBytes();

   boolean hasClientAction();

   int getClientActionValue();

   ButtonClientAction getClientAction();

   boolean hasHoveredBackgroundColor();

   Color getHoveredBackgroundColor();

   ColorOrBuilder getHoveredBackgroundColorOrBuilder();

   boolean hasHoveredBorderColor();

   Color getHoveredBorderColor();

   ColorOrBuilder getHoveredBorderColorOrBuilder();

   Button.OnClickCase getOnClickCase();
}
