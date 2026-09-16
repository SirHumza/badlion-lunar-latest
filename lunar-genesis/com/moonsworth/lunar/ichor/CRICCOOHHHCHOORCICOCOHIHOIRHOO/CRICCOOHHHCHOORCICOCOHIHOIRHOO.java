package com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import org.objectweb.asm.Type;

public interface CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   String getDescriptor();

   default int getOpcode(int var1) {
      return Type.getType(this.getDescriptor()).getOpcode(var1);
   }

   default int getSize() {
      return Type.getType(this.getDescriptor()).getSize();
   }
}
