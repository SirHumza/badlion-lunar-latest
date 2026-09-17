package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.module.serverlink.ServerLinkModule;
import com.lunarclient.apollo.module.serverlink.pausemenu.LegacyServerLinkPlacement;
import com.lunarclient.apollo.module.serverlink.pausemenu.ModernServerLinkPlacement;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.serverlink.v1.AddServerLinkMessage;
import com.lunarclient.apollo.serverlink.v1.OverrideServerLinkResourceMessage;
import com.lunarclient.apollo.serverlink.v1.RemoveServerLinkMessage;
import com.lunarclient.apollo.serverlink.v1.ResetServerLinkResourceMessage;
import com.lunarclient.apollo.serverlink.v1.ResetServerLinksMessage;
import com.lunarclient.apollo.serverlink.v1.ServerLink;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.net.URI;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class IHIRRIIORRHORHRORIHOROIRCORCOO
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Nullable
   private RCIROOOOICRHCCRRCIORHHIRCOIIIC CROCOCOOOIOIHOHHRHIOHOOCCOHOIO;
   private final Map<String, IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROIHIHCOHOIRHORHOROHHOICOIOHRC = new LinkedHashMap<>();

   public IHIRRIIORRHORHRORIHOROIRCORCOO() {
      super("server_link", "Server Link");
   }

   @Override
   protected void onDisable() {
      this.CHRRHOHOCOOOIHHIICOIOICCHOHCOI();
      this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = null;
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(ServerLinkModule.LEGACY_BUTTON_PLACEMENT, ServerLinkModule.MODERN_BUTTON_PLACEMENT);
   }

   public LegacyServerLinkPlacement RORHCHROOIOCCRRCOICHCIIRCHOIOI() {
      LegacyServerLinkPlacement var1 = this.getOptions().get(ServerLinkModule.LEGACY_BUTTON_PLACEMENT);
      return var1 != null ? var1 : LegacyServerLinkPlacement.NEW_ROW;
   }

   public ModernServerLinkPlacement ICOHIRORHOCOHHHIIROOHIOOHIIHIH() {
      ModernServerLinkPlacement var1 = this.getOptions().get(ServerLinkModule.MODERN_BUTTON_PLACEMENT);
      return var1 != null ? var1 : ModernServerLinkPlacement.REPLACE_REPORT_BUGS;
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(
         OverrideServerLinkResourceMessage.class,
         ResetServerLinkResourceMessage.class,
         AddServerLinkMessage.class,
         RemoveServerLinkMessage.class,
         ResetServerLinksMessage.class
      );
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OverrideServerLinkResourceMessage.class, var1x -> {
         if (var1x.hasIcon()) {
            String var2 = NetworkTypes.fromProtobuf(var1x.getIcon()).getResourceLocation();
            if (var2 != null) {
               this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var2);
            }
         }
      });
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetServerLinkResourceMessage.class, var1x -> this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO = null);
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         AddServerLinkMessage.class,
         var1x -> var1x.getServerLinksList()
            .stream()
            .map(this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
            .filter(Objects::nonNull)
            .forEach(this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RemoveServerLinkMessage.class, var1x -> var1x.getServerLinkIdsList().forEach(this::ORCORCRRIRIROIORRCCCCHRHRCOHOH));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetServerLinksMessage.class, var1x -> this.CHRRHOHOCOOOIHHIICOIOICCHOHCOI());
   }

   private IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ServerLink var1) {
      Component var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(
         var1.getDisplayNameAdventureJsonLines()
      );
      if (var2 == null) {
         return null;
      }

      URI var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORICICIICROCRICRHRHHRCHHRCRHOR(
         var1.getUrl()
      );
      return var3 == null ? null : new IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getId(), var2, var3);
   }

   public Collection<IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CICCCRHCRIOIRCCORORICCICICRCRO() {
      return this.ROIHIHCOHOIRHORHOROHHOICOIOHRC.values();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ROIHIHCOHOIRHORHOROHHOICOIOHRC.put(var1.id(), var1);
   }

   public void ORCORCRRIRIROIORRCCCCHRHRCOHOH(String var1) {
      this.ROIHIHCOHOIRHORHOROHHOICOIOHRC.remove(var1);
   }

   public void CHRRHOHOCOOOIHHIICOIOICCHOHCOI() {
      this.ROIHIHCOHOIRHORHOROHHOICOIOHRC.clear();
   }

   @Nullable
   @Generated
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC getResource() {
      return this.CROCOCOOOIOIHOHHRHIOHOOCCOHOIO;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String CHCCHCHORCHRIHHOHRHCRRRRIHOHCO;
      private final Component HHHRCRCRIICCIHCCOOHOHOCIIRIHHC;
      private final URI uri;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Component var2, URI var3) {
         this.CHCCHCHORCHRIHHOHRHCRRRRIHOHCO = var1;
         this.HHHRCRCRIICCIHCCOOHOHOCIIRIHHC = var2;
         this.uri = var3;
      }

      public String id() {
         return this.CHCCHCHORCHRIHHOHRHCRRRRIHOHCO;
      }

      public Component IIRCRORCCCHRHHICHOHOOCIICCCHOR() {
         return this.HHHRCRCRIICCIHCCOOHOHOCIIRIHHC;
      }
   }
}
