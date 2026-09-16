package com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import lombok.Generated;
import org.jspecify.annotations.Nullable;

public enum IIHRRHORCRCROCHHOHORCHCROCIHRO {
   MOVE_TO_OWNER("move_to_owner", CORCOCICIRIOHROHROIIOOHICCHCRR.class),
   TELEPORT_TO_OWNER("teleport_to_owner", OCOHORHCROHICRRIHCIHHRRCIHICRI.class),
   RANDOM_WANDER("random_wander", CRICCOOHHHCHOORCICOCOHIHOIRHOO.class),
   ATTACH_TO_OWNER("attach_to_owner", RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class),
   LOOK_AT_OWNER("look_at_owner", RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class),
   LOOK_AT_BLOCK("look_at_block", RRCRRCORICCHOHHIRCHIROOHIIOHCO.class),
   LOOK_AT_TARGET("look_at_target", HRCHROOHRIHCRCRHRIIROCIRHOIRHH.class),
   LOOK_AT("look_at", OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class);

   private final String id;
   private final Class<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> taskClass;

   public static @Nullable Class<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> fromId(String var0) {
      for (IIHRRHORCRCROCHHOHORCHCROCIHRO var4 : values()) {
         if (var4.id.equals(var0)) {
            return var4.taskClass;
         }
      }

      return null;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public Class<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> getTaskClass() {
      return this.taskClass;
   }

   @Generated
   IIHRRHORCRCROCHHOHORCHCROCIHRO(String var3, Class<? extends HICHRCOHCCRHOHCICOOCHOIHCCHIRI> var4) {
      this.id = var3;
      this.taskClass = var4;
   }
}
