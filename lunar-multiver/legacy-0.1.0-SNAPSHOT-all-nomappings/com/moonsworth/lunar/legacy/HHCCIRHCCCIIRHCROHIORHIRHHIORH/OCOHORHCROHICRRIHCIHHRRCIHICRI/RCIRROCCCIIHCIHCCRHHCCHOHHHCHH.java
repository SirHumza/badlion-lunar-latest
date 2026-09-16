package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import java.util.Set;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagCompound.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public Map<String, NBTBase> tagMap;

   @Shadow
   public abstract long getLong(String var1);

   @Shadow
   public abstract byte getByte(String var1);

   @Shadow
   public abstract int getInteger(String var1);

   @Shadow
   public abstract String getString(String var1);

   @Shadow
   public abstract float getFloat(String var1);

   @Shadow
   public abstract double getDouble(String var1);

   @Shadow
   public abstract short getShort(String var1);

   @Shadow
   public abstract boolean getBoolean(String var1);

   @Shadow
   public abstract NBTTagCompound getCompoundTag(String var1);

   @Shadow
   public abstract void setString(String var1, String var2);

   @Shadow
   public abstract boolean hasKey(String var1, int var2);

   @Shadow
   public abstract boolean isEmpty$v1_12();

   @Shadow
   public abstract NBTTagList getTagList(String var1, int var2);

   @Shadow
   public abstract Set<String> getKeySet();

   @Shadow
   public abstract void setTag(String var1, NBTBase var2);

   @Shadow
   public abstract byte[] getByteArray(String var1);

   public long bridge$getLong(String var1) {
      return this.getLong(var1);
   }

   public byte bridge$getByte(String var1) {
      return this.getByte(var1);
   }

   public byte[] bridge$getByteArray(String var1) {
      return this.getByteArray(var1);
   }

   public int bridge$getInteger(String var1) {
      return this.getInteger(var1);
   }

   public String bridge$getString(String var1) {
      return this.getString(var1);
   }

   public float bridge$getFloat(String var1) {
      return this.getFloat(var1);
   }

   public double bridge$getDouble(String var1) {
      return this.getDouble(var1);
   }

   public short bridge$getShort(String var1) {
      return this.getShort(var1);
   }

   public boolean bridge$getBoolean(String var1) {
      return this.getBoolean(var1);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getList(
      String var1, int var2
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getTagList(var1, var2);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getCompoundTag(String var1) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getCompoundTag(var1);
   }

   public void bridge$putString(@NotNull String var1, String var2) {
      this.setString(var1, var2);
   }

   public void bridge$putCompound(
      String var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.setTag(var1, (NBTBase)var2);
   }

   public Set<String> bridge$getAllKeys() {
      return this.getKeySet();
   }

   public boolean bridge$contains(String var1, int var2) {
      return this.hasKey(var1, var2);
   }

   public boolean bridge$isEmpty() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.isEmpty$v1_12() : this.tagMap.isEmpty();
   }
}
