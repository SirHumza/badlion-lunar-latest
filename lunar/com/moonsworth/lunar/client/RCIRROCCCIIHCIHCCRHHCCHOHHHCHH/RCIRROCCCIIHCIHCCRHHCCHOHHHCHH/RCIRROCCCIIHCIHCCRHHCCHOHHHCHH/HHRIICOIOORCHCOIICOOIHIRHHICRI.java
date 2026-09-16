package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.staffmod.v1.DisableStaffModsMessage;
import com.lunarclient.apollo.staffmod.v1.EnableStaffModsMessage;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Set;

public class HHRIICOIOORCHCOIICOOIHIRHHICRI
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public HHRIICOIOORCHCOIICOOIHIRHHICRI() {
      super("staff_mod", "Staff Mod");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(EnableStaffModsMessage.class, DisableStaffModsMessage.class);
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         EnableStaffModsMessage.class,
         var0 -> {
            List var1x = var0.getStaffModsList().stream().map(Enum::ordinal).toList();
            boolean var2 = var0.getEnabledByDefault();

            for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = var4.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOIOOIIOHHHIIIOIOROCIICOCHCOHR
               );
               if (var1x.contains(var5.getOrdinal())) {
                  var5.ORHHIRCCIHCRCHHRHORICCIORRHHCO(true);
                  if (var2) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = var4.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                     );
                     if (var6 != null) {
                        var6.setEnabled(true);
                     }
                  }
               }
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisableStaffModsMessage.class,
         var0 -> {
            List var1x = var0.getStaffModsList().stream().map(Enum::ordinal).toList();

            for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var3.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOIOOIIOHHHIIIOIOROCIICOCHCOHR
               );
               if (var1x.contains(var4.getOrdinal())) {
                  var4.ORHHIRCCIHCRCHHRHORICCIORRHHCO(false);
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR var5 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH
                  );
                  if (var5 != null) {
                     var5.setEnabled(false);
                  }
               }
            }
         }
      );
   }
}
