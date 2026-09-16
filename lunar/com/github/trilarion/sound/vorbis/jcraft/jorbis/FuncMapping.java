package com.github.trilarion.sound.vorbis.jcraft.jorbis;

import com.github.trilarion.sound.vorbis.jcraft.jogg.Buffer;
import java.util.logging.Logger;

abstract class FuncMapping {
   private static final Logger LOG = Logger.getLogger(FuncMapping.class.getName());
   public static FuncMapping[] mapping_P = new FuncMapping[]{new Mapping0()};

   abstract void pack(Info var1, Object var2, Buffer var3);

   abstract Object unpack(Info var1, Buffer var2);

   abstract Object look(DspState var1, InfoMode var2, Object var3);

   abstract void free_info(Object var1);

   abstract void free_look(Object var1);

   abstract int inverse(Block var1, Object var2);
}
