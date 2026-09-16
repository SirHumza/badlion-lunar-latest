package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.PacketBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PacketBuffer.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends ByteBuf
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public abstract ByteBuf writeInt(int var1);

   @Shadow
   public abstract ByteBuf writeLong(long var1);

   @Shadow
   public abstract long readLong();

   @Shadow
   public abstract boolean readBoolean();

   @Shadow
   public abstract ByteBuf writeShort(int var1);

   @Shadow
   public abstract short readShort();

   @Shadow
   public abstract ByteBuf writeBytes(byte[] var1);

   @Shadow
   public abstract ByteBuf readBytes(int var1);

   @Shadow
   public abstract float readFloat();

   @Shadow
   public abstract ByteBuf writeBoolean(boolean var1);

   public ByteBuf bridge$writeInt(int var1) {
      return this.writeInt(var1);
   }

   public int bridge$readInt() {
      return this.readInt();
   }

   public void bridge$writeString(String var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.writeString$v1_8(var1);
      } else {
         this.writeStringToBuffer$v1_7(var1);
      }
   }

   public String bridge$readStringFromBuffer(int var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.readString$v1_12(var1) : this.readStringFromBuffer$v1_7(var1);
   }

   public ByteBuf bridge$writeLong(long var1) {
      return this.writeLong(var1);
   }

   public long bridge$readLong() {
      return this.readLong();
   }

   public boolean bridge$readBoolean() {
      return this.readBoolean();
   }

   public void bridge$writeVarIntToBuffer(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.writeVarInt$v1_12(var1);
      } else {
         this.writeVarIntToBuffer$v1_7(var1);
      }
   }

   public int bridge$readVarIntFromBuffer() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.readVarInt$v1_12() : this.readVarIntFromBuffer$v1_7();
   }

   public ByteBuf bridge$writeShort(int var1) {
      return this.writeShort(var1);
   }

   public short bridge$readShort() {
      return this.readShort();
   }

   public ByteBuf bridge$writeBytes(byte[] var1) {
      return this.writeBytes(var1);
   }

   public ByteBuf bridge$readBytes(byte[] var1) {
      return this.readBytes(var1);
   }

   public float bridge$readFloat() {
      return this.readFloat();
   }

   public ByteBuf bridge$writeBoolean(boolean var1) {
      return this.writeBoolean(var1);
   }

   @Shadow
   public abstract int readableBytes();

   public int bridge$readableBytes() {
      return this.readableBytes();
   }

   @Shadow
   public abstract boolean release();

   @Shadow
   public abstract PacketBuffer writeString$v1_8(String var1);

   @Shadow
   public abstract void writeStringToBuffer$v1_7(String var1);

   @Shadow
   public abstract String readString$v1_12(int var1);

   @Shadow
   public abstract String readStringFromBuffer$v1_7(int var1);

   @Shadow
   public abstract PacketBuffer writeVarInt$v1_12(int var1);

   @Shadow
   public abstract void writeVarIntToBuffer$v1_7(int var1);

   @Shadow
   public abstract int readVarInt$v1_12();

   @Shadow
   public abstract int readVarIntFromBuffer$v1_7();

   public boolean bridge$release() {
      return this.release();
   }

   public ByteBuf bridge$writeFloat(float var1) {
      return this.writeFloat(var1);
   }
}
