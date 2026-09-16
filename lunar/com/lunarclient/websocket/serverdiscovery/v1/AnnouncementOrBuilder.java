package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface AnnouncementOrBuilder extends MessageOrBuilder {
   String getText();

   ByteString getTextBytes();

   boolean hasCountDownTo();

   Timestamp getCountDownTo();

   TimestampOrBuilder getCountDownToOrBuilder();

   boolean hasCountUpFrom();

   Timestamp getCountUpFrom();

   TimestampOrBuilder getCountUpFromOrBuilder();

   Announcement.TimerCase getTimerCase();
}
