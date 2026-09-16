package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(GuiPlayerInfo.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Final
   @Shadow
   public String name;
   @Shadow
   public int responseTime;
   @Unique
   private UUID lunar$profileTextureUuid = null;
   @Unique
   private GameProfile lunar$gameProfile = null;
   @Unique
   private String lunar$previousName = null;
   @Unique
   private String lunar$previousTeamStrippedName = null;

   public Component bridge$getDisplayName() {
      return this.name == null ? Component.empty() : RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(this.name);
   }

   public GameProfile bridge$getGameProfile() {
      ScorePlayerTeam var1 = Minecraft.getMinecraft().world.getScoreboard().getPlayersTeam(this.name);
      boolean var2 = Minecraft.getMinecraft().fontRenderer.getStringWidth(this.name) == 0;
      String var3 = ScorePlayerTeam.formatPlayerName(var1, var2 ? "" : this.name);
      String var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
         var3
      );
      if (this.lunar$gameProfile != null && Objects.equals(this.lunar$previousName, this.name) && Objects.equals(this.lunar$previousTeamStrippedName, var4)) {
         return this.lunar$gameProfile;
      }

      if (Minecraft.getMinecraft().world != null && this.name != null) {
         this.lunar$gameProfile = null;
         this.lunar$previousName = this.name;
         this.lunar$previousTeamStrippedName = var4;
         EntityPlayer var5 = Minecraft.getMinecraft()
            .world
            .getPlayerEntityByName(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
                  this.name
               )
            );
         if (var5 == null) {
            var4 = var4.replaceAll("[^a-zA-Z0-9_]", "");
            if (var4.length() > 16) {
               var4 = var4.substring(var4.length() - 16);
            }

            var5 = Minecraft.getMinecraft().world.getPlayerEntityByName(var4);
         }

         if (var5 == null) {
            return null;
         }

         this.lunar$gameProfile = var5.getGameProfile();
         this.lunar$profileTextureUuid = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.lunar$gameProfile);
         if (this.lunar$profileTextureUuid == null) {
            this.lunar$profileTextureUuid = this.lunar$gameProfile.getId();
         }

         return this.lunar$gameProfile;
      } else {
         return null;
      }
   }

   public UUID bridge$getProfileTextureId() {
      return this.lunar$profileTextureUuid;
   }

   public boolean bridge$hasMismatchedId() {
      return this.lunar$profileTextureUuid != null && this.lunar$gameProfile != null
         ? !this.lunar$profileTextureUuid.equals(this.lunar$gameProfile.getId())
         : false;
   }

   public int bridge$getLatency() {
      return this.responseTime;
   }

   public Component bridge$formatName() {
      ScorePlayerTeam var1 = Minecraft.getMinecraft().world.getScoreboard().getPlayersTeam(this.name);
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(ScorePlayerTeam.formatPlayerName(var1, this.name));
   }
}
