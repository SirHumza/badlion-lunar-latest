package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends EntityLivingBase {
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(World var1) {
      super(var1);
      this.setInvisible(true);
      this.noClip = true;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.setEntityInvulnerable$v1_12(true);
         this.setNoGravity$v1_12(true);
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public float getEyeHeight$v1_7() {
      return 0.12F;
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public float getEyeHeight() {
      return 1.62F;
   }

   public ItemStack getHeldItem$v1_7() {
      return null;
   }

   public ItemStack getEquipmentInSlot$v1_7(int var1) {
      return null;
   }

   public void setCurrentItemOrArmor$v1_7(int var1, ItemStack var2) {
   }

   public ItemStack[] getInventory$v1_7() {
      return new ItemStack[0];
   }

   public ItemStack getCurrentArmor$v1_8(int var1) {
      return null;
   }

   public Iterable<ItemStack> getArmorInventoryList$v1_12() {
      return List.of();
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public ItemStack getItemStackFromSlot$v1_12(EntityEquipmentSlot var1) {
      return ItemStack.EMPTY$v1_12;
   }

   public void setItemStackToSlot$v1_12(EntityEquipmentSlot var1, ItemStack var2) {
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public EnumHandSide getPrimaryHand$v1_12() {
      return EnumHandSide.RIGHT;
   }
}
