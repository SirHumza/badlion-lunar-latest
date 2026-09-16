package com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.ShowEntity;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.ShowItem;
import com.moonsworth.lunar.lib.adventure.text.serializer.gson.LegacyHoverEventSerializer;
import com.moonsworth.lunar.lib.adventure.text.serializer.legacy.LegacyComponentSerializer;
import com.moonsworth.lunar.lib.adventure.text.serializer.plain.PlainTextComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Codec;
import com.moonsworth.lunar.lib.adventure.util.Codec.Decoder;
import com.moonsworth.lunar.lib.adventure.util.Codec.Encoder;
import java.io.IOException;
import java.util.UUID;
import lombok.NonNull;
import net.minecraft.item.Item;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements LegacyHoverEventSerializer {
   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH RRCIRIRROHRCOOHCIOCHHIIOOCHCRO = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private static final Codec<NBTTagCompound, String, NBTException, RuntimeException> IRCICHORROHHOCOCCRRHOCICORHIOH = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION
         >= 1
      ? Codec.codec(JsonToNBT::getTagFromJson$v1_8, NBTBase::toString)
      : Codec.codec(IRCIIHHICIHRCOCRROCOICRIHHCCHH::CORROIRHRRIHCRHIROHHORCCHIIRCO, NBTBase::toString);
   static final String IHHOIIOORORIRCHHRHHHRCRHCRICCC = "id";
   static final String HCHRCHORRCRIOCHORRHOHOORHCIIOH = "Count";
   static final String IIOOCCIICORIRORHCOCIRHOOIRIIRI = "tag";
   static final String ROIOIRHOHRROHIIORRCCOCICRCCRCO = "name";
   static final String ICOICRIHRHIRRIRHHCIOCRROHOIIHI = "type";
   static final String OHOHRICRIOICHROICCOHOOHOIOHHIC = "id";

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   private static NBTTagCompound CORROIRHRRIHCRHIROHHORCCHIIRCO(String var0) {
      return (NBTTagCompound)JsonToNBT.func_150315_a$v1_7(var0);
   }

   public ShowItem deserializeShowItem(Component var1) {
      String var2 = LegacyComponentSerializer.legacySection().serialize(var1);

      try {
         NBTTagCompound var3 = (NBTTagCompound)IRCICHORROHHOCOCCRRHOCICORHIOH.decode(var2);
         NBTTagCompound var4 = var3.getCompoundTag("tag");
         boolean var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5
            ? var4.isEmpty$v1_12()
            : (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0 ? var4.hasNoTags$v1_7() : var4.hasNoTags$v1_8());
         return ShowItem.showItem(
            Key.key(var3.getString("id")),
            var3.hasKey("Count") ? var3.getByte("Count") : 1,
            var5 ? null : BinaryTagHolder.encode(var4, IRCICHORROHHOCOCCRRHOCICORHIOH)
         );
      } catch (NBTException var6) {
         throw new IOException(var6);
      }
   }

   public @NonNull ShowEntity deserializeShowEntity(Component var1, Decoder<Component, String, ? extends RuntimeException> var2) {
      String var3 = PlainTextComponentSerializer.plainText().serialize(var1);

      try {
         NBTTagCompound var4 = (NBTTagCompound)IRCICHORROHHOCOCCRRHOCICORHIOH.decode(var3);
         return ShowEntity.showEntity(Key.key(var4.getString("type")), UUID.fromString(var4.getString("id")), Component.text(var4.getString("name")));
      } catch (NBTException var5) {
         throw new IOException(var5);
      }
   }

   @NonNull
   public Component serializeShowItem(@NonNull ShowItem var1) {
      if (var1 == null) {
         throw new NullPointerException("input is marked non-null but is null");
      }

      NBTTagCompound var2 = new NBTTagCompound();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var2.setString("id", var1.item().asString());
      } else {
         Item var3 = (Item)Item.itemRegistry$v1_7.getObject(var1.item().value());
         if (var3 != null) {
            var2.setShort("id", (short)Item.getIdFromItem(var3));
         }
      }

      var2.setByte("Count", (byte)var1.count());
      if (var1.nbt() != null) {
         try {
            var2.setTag("tag", (NBTBase)var1.nbt().get(IRCICHORROHHOCOCCRRHOCICORHIOH));
         } catch (NBTException var4) {
            throw new IOException(var4);
         }
      }

      return Component.text((String)IRCICHORROHHOCOCCRRHOCICORHIOH.encode(var2));
   }

   @NonNull
   public Component serializeShowEntity(ShowEntity var1, Encoder<Component, String, ? extends RuntimeException> var2) {
      NBTTagCompound var3 = new NBTTagCompound();
      var3.setString("id", var1.id().toString());
      var3.setString("type", var1.type().asString());
      if (var1.name() != null) {
         var3.setString("name", PlainTextComponentSerializer.plainText().serialize(var1.name()));
      }

      return Component.text((String)IRCICHORROHHOCOCCRRHOCICORHIOH.encode(var3));
   }
}
