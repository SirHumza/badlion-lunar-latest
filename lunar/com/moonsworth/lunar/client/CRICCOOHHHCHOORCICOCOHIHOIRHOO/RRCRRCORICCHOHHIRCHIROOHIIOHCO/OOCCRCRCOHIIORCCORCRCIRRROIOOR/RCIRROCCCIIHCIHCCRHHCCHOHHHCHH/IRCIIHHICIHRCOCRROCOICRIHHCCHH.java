package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   LEFT("leftHand", false),
   RIGHT("rightHand", true);

   public final String id;
   public final boolean enabledByDefault;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH opposite() {
      return this == LEFT ? RIGHT : LEFT;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, boolean var4) {
      this.id = var3;
      this.enabledByDefault = var4;
   }
}
