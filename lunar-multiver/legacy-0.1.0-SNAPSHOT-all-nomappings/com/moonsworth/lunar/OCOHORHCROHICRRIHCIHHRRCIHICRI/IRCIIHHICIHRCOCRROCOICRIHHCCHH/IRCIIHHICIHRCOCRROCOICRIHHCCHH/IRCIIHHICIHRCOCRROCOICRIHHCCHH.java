package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.Session;
import net.minecraft.world.World;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends EntityClientPlayerMP implements IHIRRIIORRHORHRORIHOROIRCORCOO {
   private com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH dummyPlayerType = com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SELF;
   private boolean renderNametag;
   private GameProfile customGameProfile = Minecraft.getMinecraft().getSession().getProfile();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Minecraft var1, World var2) {
      super(
         var1,
         var2,
         new Session(Minecraft.getMinecraft().session.username, UUID.randomUUID().toString(), Minecraft.getMinecraft().session.token, "mojang"),
         new com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true),
         new StatFileWriter()
      );
      var1.skinManager.func_152790_a(this.customGameProfile, this, true);
   }

   public void entityInit() {
      super.entityInit();
      if (!this.dataWatcher.watchedObjects.containsKey(10)) {
         this.dataWatcher.addObject(10, "");
      }
   }

   public boolean getAlwaysRenderNameTagForRender() {
      return false;
   }

   public ItemStack getCurrentArmor(int var1) {
      return null;
   }

   public void incrementTicksExisted() {
      this.ticksExisted++;
   }

   public com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getDummyPlayerType() {
      return this.dummyPlayerType;
   }

   public void setDummyPlayerType(com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.dummyPlayerType = var1;
   }

   public void setRenderNametag(boolean var1) {
      this.renderNametag = var1;
   }

   public boolean shouldRenderNametag() {
      return this.renderNametag;
   }

   public void setGameProfile(GameProfile var1) {
      ((com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this)
         .bridge$setGameProfile(var1);
      if (this instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var2) {
         var2.lunar$onNameTagUpdate();
      }
   }

   @Generated
   public GameProfile getCustomGameProfile() {
      return this.customGameProfile;
   }

   @Generated
   public void setCustomGameProfile(GameProfile var1) {
      this.customGameProfile = var1;
   }
}
