package com.llamalad7.mixinextras.lib.antlr.runtime;

import java.nio.Buffer;
import java.nio.CharBuffer;

public final class CharStreams {
   public static CodePointCharStream fromString(String var0) {
      return fromString(var0, "<unknown>");
   }

   public static CodePointCharStream fromString(String var0, String var1) {
      CodePointBuffer.Builder var2 = CodePointBuffer.builder(var0.length());
      CharBuffer var3 = CharBuffer.allocate(var0.length());
      var3.put(var0);
      ((Buffer)var3).flip();
      var2.append(var3);
      return CodePointCharStream.fromBuffer(var2.build(), var1);
   }
}
