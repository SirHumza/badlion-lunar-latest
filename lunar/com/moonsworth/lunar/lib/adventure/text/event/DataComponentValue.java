package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.NotNull;

public interface DataComponentValue extends Examinable {
   static DataComponentValue.@NotNull Removed removed() {
      return RemovedDataComponentValueImpl.REMOVED;
   }

   interface Removed extends DataComponentValue {
   }

   interface TagSerializable extends DataComponentValue {
      @NotNull
      BinaryTagHolder asBinaryTag();
   }
}
