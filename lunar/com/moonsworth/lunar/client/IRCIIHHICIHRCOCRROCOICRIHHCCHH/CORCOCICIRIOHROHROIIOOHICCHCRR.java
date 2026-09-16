package com.moonsworth.lunar.client.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.websocket.friend.v1.OnlineFriendStatus;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;

public enum CORCOCICIRIOHROHROIIOOHICCHCRR {
   ONLINE("Online", true, OnlineFriendStatus.ONLINE_FRIEND_STATUS_ONLINE),
   AWAY("Away", false, OnlineFriendStatus.ONLINE_FRIEND_STATUS_AWAY),
   BUSY("Busy", false, OnlineFriendStatus.ONLINE_FRIEND_STATUS_BUSY),
   INVISIBLE("Invisible", true, OnlineFriendStatus.ONLINE_FRIEND_STATUS_INVISIBLE),
   OFFLINE("Offline", true, OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED);

   private static final Map<OnlineFriendStatus, CORCOCICIRIOHROHROIIOOHICCHCRR> protobufToEnum = new HashMap<>();
   private final String name;
   private final boolean showNotifications;
   private final OnlineFriendStatus protobuf;

   public static CORCOCICIRIOHROHROIIOOHICCHCRR fromProtobuf(OnlineFriendStatus var0) {
      return protobufToEnum.getOrDefault(var0, OFFLINE);
   }

   CORCOCICIRIOHROHROIIOOHICCHCRR(String var3, boolean var4, OnlineFriendStatus var5) {
      this.name = var3;
      this.showNotifications = var4;
      this.protobuf = var5;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public boolean isShowNotifications() {
      return this.showNotifications;
   }

   @Generated
   public OnlineFriendStatus getProtobuf() {
      return this.protobuf;
   }

   static {
      for (CORCOCICIRIOHROHROIIOOHICCHCRR var3 : values()) {
         protobufToEnum.put(var3.getProtobuf(), var3);
      }
   }
}
