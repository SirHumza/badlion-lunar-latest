package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.function.Function;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   ZLIB("zlib", false),
   ZSTD("zstd", true),
   LZ4("lz4", true),
   DYNAMIC("dynamic", true, var0 -> var0 >= CRICCOOHHHCHOORCICOCOHIHOIRHOO.IIHOHROOICCOHCOHOCIOCRIOCHHROC ? ZSTD : LZ4);

   private final String name;
   private final boolean storesUncompressedSize;
   private final Function<Integer, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> dynamicCompressor;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, boolean var4) {
      this.name = var3;
      this.storesUncompressedSize = var4;
      this.dynamicCompressor = var1x -> this;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public boolean isStoresUncompressedSize() {
      return this.storesUncompressedSize;
   }

   @Generated
   public Function<Integer, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> getDynamicCompressor() {
      return this.dynamicCompressor;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, boolean var4, Function<Integer, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var5) {
      this.name = var3;
      this.storesUncompressedSize = var4;
      this.dynamicCompressor = var5;
   }
}
