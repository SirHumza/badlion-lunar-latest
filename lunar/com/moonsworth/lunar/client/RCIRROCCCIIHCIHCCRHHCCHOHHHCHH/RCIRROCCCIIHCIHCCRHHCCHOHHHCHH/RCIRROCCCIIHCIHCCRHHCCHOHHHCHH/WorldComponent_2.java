package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.team.v1.ResetTeamMembersMessage;
import com.lunarclient.apollo.team.v1.TeamMember;
import com.lunarclient.apollo.team.v1.UpdateTeamMembersMessage;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO() {
      super("team", "Team");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(UpdateTeamMembersMessage.class);
   }

   @Override
   protected void onEnable() {
      this.CCIHRIOOOHIORICIRRRRIHCOCIHIRC();
   }

   @Override
   protected void onDisable() {
      this.CCIHRIOOOHIORICIRRRRIHCOCIHIRC();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         UpdateTeamMembersMessage.class,
         var0 -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1x = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR();
               CRHROHHHCIHHCOHCOORCRIHHIICROR var2 = var1x.RHIIORHOIHHICHORHRIRHIIROCHOHO();
               Map var3 = var2.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
               List var4 = var0.getMembersList();
               HashSet var5 = new HashSet(var4.size());
               UUID var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID();

               for (TeamMember var8 : var4) {
                  if (var8.hasPlayerUuid()) {
                     UUID var9 = NetworkTypes.fromProtobuf(var8.getPlayerUuid());
                     com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = (com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(
                        var9
                     );
                     boolean var11 = var9.equals(var6);
                     if (var11) {
                        var10 = var1x.RROHIIOHORHICRHIHCCRRRHIHCHRCC();
                     }

                     if (var10 == null) {
                        var10 = new com.moonsworth.lunar.client.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9);
                        var2.CRRRICCRROCOHHOHIICIHORCOORRRH(var10);
                     }

                     String var12 = var8.getAdventureJsonPlayerName();
                     if (!var12.isEmpty()) {
                        Component var13 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
                           var12
                        );
                        if (var13 != null) {
                           var10.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var13);
                        }
                     }

                     if (var8.hasMarkerColor()) {
                        var10.CORCOCICIRIOHROHROIIOOHICCHCRR(var8.getMarkerColor().getColor());
                     }

                     if (!var11) {
                        if (var8.hasLocation()) {
                           ApolloLocation var16 = NetworkTypes.fromProtobuf(var8.getLocation());
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR var14 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                              var16.getX(), var16.getY(), var16.getZ()
                           );
                           String var15 = var16.getWorld();
                           var10.RRHOOICIIHOCROIHCHRRORRORHHROH(var15.isEmpty() ? null : var15);
                           var10.RICRIRRCOHRCOCRRHHCRHRROOIOHHR(var14);
                        } else {
                           var10.COOOHIRRCCRCIHRCHHIHORIIHHIORO();
                        }
                     }

                     var5.add(var9);
                  }
               }

               var3.entrySet().stream().filter(var1xx -> !var5.contains(var1xx.getKey())).forEach(var1xx -> var3.remove(var1xx.getKey()));
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetTeamMembersMessage.class, var1x -> this.CCIHRIOOOHIORICIRRRRIHCOCIHIRC());
   }

   private void CCIHRIOOOHIORICIRRRRIHCOCIHIRC() {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().RHIIORHOIHHICHORHRIRHIIROCHOHO().clear();
   }
}
