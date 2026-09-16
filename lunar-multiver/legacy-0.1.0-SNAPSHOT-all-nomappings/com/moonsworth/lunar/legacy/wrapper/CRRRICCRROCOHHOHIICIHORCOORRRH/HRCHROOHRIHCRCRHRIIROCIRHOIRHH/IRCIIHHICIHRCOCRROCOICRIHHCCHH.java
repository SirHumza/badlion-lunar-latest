package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.io.File;
import net.minecraft.client.resources.FolderResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends FolderResourcePack {
   public final String CIHOHRCIOCHCIHRROOHHCCOCHOHIIH;
   public final String IIHRHCHHCIRORICRROOCRHIOOORCIH;
   public final String IRIOHOCRHOCHRCOHHHIIHCCOROCRHI;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, String var3, File var4) {
      super(var4);
      this.CIHOHRCIOCHCIHRROOHHCCOCHOHIIH = var1;
      this.IIHRHCHHCIRORICRROOCRHIOOORCIH = var2;
      this.IRIOHOCRHOCHRCOHHHIIHCCOROCRHI = var3;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public IMetadataSection getPackMetadata$v1_7(MetadataSerializer var1, String var2) {
      return var2.equals("pack") ? new PackMetadataSection((IChatComponent)(new TextComponentString(this.IRIOHOCRHOCHRCOHHHIIHCCOROCRHI)), 1) : null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public <T extends IMetadataSection> T getPackMetadata$v1_8(MetadataSerializer var1, String var2) {
      return (T)(var2.equals("pack") ? new PackMetadataSection((ITextComponent)(new TextComponentString(this.IRIOHOCRHOCHRCOHHHIIHCCOROCRHI)), 1) : null);
   }
}
