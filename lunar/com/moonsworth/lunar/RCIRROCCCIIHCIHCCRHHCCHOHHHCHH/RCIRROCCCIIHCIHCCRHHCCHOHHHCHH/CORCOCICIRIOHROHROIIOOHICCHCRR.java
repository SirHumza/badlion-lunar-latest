package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class CORCOCICIRIOHROHROIIOOHICCHCRR extends RequestBody {
   private final RequestBody RHRCRCIOIOICRHRCCROIICCRRCOOOI;
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HORHCHIIOCRROHOHRCORCCICCRCCHO;

   public CORCOCICIRIOHROHROIIOOHICCHCRR(RequestBody var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      this.RHRCRCIOIOICRHRCCROIICCRRCOOOI = var1;
      this.HORHCHIIOCRROHOHRCORCCICCRCCHO = var2;
   }

   public MediaType contentType() {
      return this.RHRCRCIOIOICRHRCCROIICCRRCOOOI.contentType();
   }

   public long contentLength() {
      return this.RHRCRCIOIOICRHRCCROIICCRRCOOOI.contentLength();
   }

   public void writeTo(BufferedSink var1) {
      BufferedSink var2 = Okio.buffer(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1));
      this.RHRCRCIOIOICRHRCCROIICCRRCOOOI.writeTo(var2);
      var2.flush();
   }

   private Sink RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Sink var1) {
      return new ForwardingSink(var1) {
         long bytesWritten = 0L;
         long contentLength = 0L;

         public void write(Buffer var1, long var2) {
            super.write(var1, var2);
            if (this.contentLength == 0L) {
               this.contentLength = CORCOCICIRIOHROHROIIOOHICCHCRR.this.contentLength();
            }

            this.bytesWritten += var2;
            CORCOCICIRIOHROHROIIOOHICCHCRR.this.HORHCHIIOCRROHOHRCORCCICCRCCHO
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bytesWritten, this.contentLength, this.bytesWritten == this.contentLength);
         }
      };
   }
}
