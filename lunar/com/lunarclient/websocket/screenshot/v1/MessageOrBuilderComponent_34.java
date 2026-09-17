package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RecordScreenshotRequestOrBuilder extends MessageOrBuilder {
   boolean hasScreenshot();

   ScreenshotMessage getScreenshot();

   ScreenshotMessageOrBuilder getScreenshotOrBuilder();
}
