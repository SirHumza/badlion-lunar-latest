package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   int getDefaultUploadPrivacyValue();

   ScreenshotPrivacy getDefaultUploadPrivacy();
}
