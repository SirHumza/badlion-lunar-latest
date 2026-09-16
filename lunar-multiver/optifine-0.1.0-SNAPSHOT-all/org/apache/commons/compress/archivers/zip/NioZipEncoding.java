package org.apache.commons.compress.archivers.zip;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

class NioZipEncoding implements ZipEncoding {
   private final Charset charset;

   public NioZipEncoding(Charset var1) {
      this.charset = var1;
   }

   @Override
   public boolean canEncode(String var1) {
      CharsetEncoder var2 = this.charset.newEncoder();
      var2.onMalformedInput(CodingErrorAction.REPORT);
      var2.onUnmappableCharacter(CodingErrorAction.REPORT);
      return var2.canEncode(var1);
   }

   @Override
   public ByteBuffer encode(String var1) {
      CharsetEncoder var2 = this.charset.newEncoder();
      var2.onMalformedInput(CodingErrorAction.REPORT);
      var2.onUnmappableCharacter(CodingErrorAction.REPORT);
      CharBuffer var3 = CharBuffer.wrap(var1);
      ByteBuffer var4 = ByteBuffer.allocate(var1.length() + (var1.length() + 1) / 2);

      while (var3.remaining() > 0) {
         CoderResult var5 = var2.encode(var3, var4, true);
         if (!var5.isUnmappable() && !var5.isMalformed()) {
            if (var5.isOverflow()) {
               var4 = ZipEncodingHelper.growBuffer(var4, 0);
            } else if (var5.isUnderflow()) {
               var2.flush(var4);
               break;
            }
         } else {
            if (var5.length() * 6 > var4.remaining()) {
               var4 = ZipEncodingHelper.growBuffer(var4, var4.position() + var5.length() * 6);
            }

            for (int var6 = 0; var6 < var5.length(); var6++) {
               ZipEncodingHelper.appendSurrogate(var4, var3.get());
            }
         }
      }

      ((Buffer)var4).limit(var4.position());
      ((Buffer)var4).rewind();
      return var4;
   }

   @Override
   public String decode(byte[] var1) {
      return this.charset
         .newDecoder()
         .onMalformedInput(CodingErrorAction.REPORT)
         .onUnmappableCharacter(CodingErrorAction.REPORT)
         .decode(ByteBuffer.wrap(var1))
         .toString();
   }
}
