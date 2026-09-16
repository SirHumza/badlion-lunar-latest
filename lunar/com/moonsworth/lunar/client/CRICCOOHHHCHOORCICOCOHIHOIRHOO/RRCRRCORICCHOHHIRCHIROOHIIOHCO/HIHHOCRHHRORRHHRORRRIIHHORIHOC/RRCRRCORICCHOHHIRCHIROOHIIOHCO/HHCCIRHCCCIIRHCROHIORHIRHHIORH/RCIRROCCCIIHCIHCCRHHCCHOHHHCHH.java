package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.protobuf.Any;
import com.lunarclient.apollo.configurable.v1.OverrideConfigurableSettingsMessage;
import java.util.ArrayList;
import lombok.NonNull;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @NonNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, @NonNull HHCCIRHCCCIIRHCROHIORHIRHHIORH var2, @NonNull HRCHROOHRIHCRCRHRIIROCIRHOIRHH var3
   ) {
      if (var1 == null) {
         throw new NullPointerException("recorder is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("world is marked non-null but is null");
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH();
      ArrayList var5 = new ArrayList();

      for (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var4.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
         .values()) {
         var5.add(var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7));
      }

      OverrideConfigurableSettingsMessage var8 = OverrideConfigurableSettingsMessage.newBuilder().addAllConfigurableSettings(var5).build();
      var1.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Any.pack(var8));
   }
}
