package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class CRICCOOHHHCHOORCICOCOHIHOIRHOO extends ResponseBody {
   private final ResponseBody HOCCCIICRCIIIIRHHICOCOOIICHIOR;
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO;
   private BufferedSource CCHHRHRHCRHIHIHRIOICROHCHIIIHI;

   public CRICCOOHHHCHOORCICOCOHIHOIRHOO(ResponseBody var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      this.HOCCCIICRCIIIIRHHICOCOOIICHIOR = var1;
      this.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO = var2;
   }

   public MediaType contentType() {
      return this.HOCCCIICRCIIIIRHHICOCOOIICHIOR.contentType();
   }

   public long contentLength() {
      return this.HOCCCIICRCIIIIRHHICOCOOIICHIOR.contentLength();
   }

   public BufferedSource source() {
      if (this.CCHHRHRHCRHIHIHRIOICROHCHIIIHI == null) {
         this.CCHHRHRHCRHIHIHRIOICROHCHIIIHI = Okio.buffer(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HOCCCIICRCIIIIRHHICOCOOIICHIOR.source()));
      }

      return this.CCHHRHRHCRHIHIHRIOICROHCHIIIHI;
   }

   private Source RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Source var1) {
      return new ForwardingSource(var1) {
         long OHRRIORRCRIRORHRIOOCORIIRRRRRO = 0L;

         public long read(Buffer var1, long var2) {
            long var4 = super.read(var1, var2);
            this.OHRRIORRCRIRORHRIOOCORIIRRRRRO += var4 != -1L ? var4 : 0L;
            CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  this.OHRRIORRCRIRORHRIOOCORIIRRRRRO, CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.HOCCCIICRCIIIIRHHICOCOOIICHIOR.contentLength(), var4 == -1L
               );
            return var4;
         }
      };
   }
}
