package com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   int IOHCHROOHOCIHHHHIRROHIHOCICRHI();

   String RRCRRCORICCHOHHIRCHIROOHIIOHCO(Object... var1);

   <T> String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Function<T, String> var1, T... var2);

   static com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICROOCRRHOOICOOIOCOHCHOHOIOOOH(
      String var0
   ) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   static com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHCIOHOCROCRRCHRROCCHCIRRORHIC() {
      return new com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final List<Object> IOCRROCIHIHIROIIRIORIHOCCOHHOH = new ArrayList<>();
      private List<Object> IHIRRHRHRRROIIOROOHHRRHOIORIIO = null;
      private String RROOIOHCIHHICICIIRRRCCRRRIICRI = "";
      private boolean RRCRCROIHIRICHRHHOIHRICCOCHIRH = false;

      public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHIIIIIRHIOORRRIIORICIRCOHIIHI(
         String var1
      ) {
         this.RROOIOHCIHHICICIIRRRCCRRRIICRI = this.RROOIOHCIHHICICIIRRRCCRRRIICRI + var1;
         return this;
      }

      public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRIHOOHROHICCHHIIHRHCORHIOHR(
         Supplier<?> var1
      ) {
         if (var1 == null) {
            return this;
         }

         if (this.IHIRRHRHRRROIIOROOHHRRHOIORIIO == null) {
            this.IHIRRHRHRRROIIOROOHHRRHOIORIIO = new ArrayList<>();
         }

         if (!this.RROOIOHCIHHICICIIRRRCCRRRIICRI.isEmpty()) {
            this.IHIRRHRHRRROIIOROOHHRRHOIORIIO.add(this.RROOIOHCIHHICICIIRRRCCRRRIICRI);
            this.RROOIOHCIHHICICIIRRRCCRRRIICRI = "";
         }

         this.RRCRCROIHIRICHRHHOIHRICCOCHIRH = true;
         this.IHIRRHRHRRROIIOROOHHRRHOIORIIO.add(var1);
         return this;
      }

      public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCCRRHCRRCIHCCORCHIHHHHCCHRIHO() {
         if (this.IHIRRHRHRRROIIOROOHHRRHOIORIIO != null) {
            this.ICICRCCRRRRROOIOOORHOHIRHHOCIH();
         } else {
            this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.add(this.RROOIOHCIHHICICIIRRRCCRRRIICRI);
         }

         this.RROOIOHCIHHICICIIRRRCCRRRIICRI = "";
         return this;
      }

      private void ICICRCCRRRRROOIOOORHOHIRHHOCIH() {
         if (!this.RROOIOHCIHHICICIIRRRCCRRRIICRI.isEmpty()) {
            this.IHIRRHRHRRROIIOROOHHRRHOIORIIO.add(this.RROOIOHCIHHICICIIRRRCCRRRIICRI);
         }

         Object[] var1 = this.IHIRRHRHRRROIIOROOHHRRHOIORIIO.toArray();
         this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.add((Supplier<String>)() -> {
            StringBuilder var1x = new StringBuilder();

            for (Object var5 : var1) {
               if (var5 instanceof Supplier var6) {
                  var1x.append(var6.get().toString());
               } else {
                  var1x.append(var5.toString());
               }
            }

            return var1x.toString();
         });
         this.IHIRRHRHRRROIIOROOHHRRHOIORIIO = null;
      }

      public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCOORCOIIORORRHHOIIOHIRROHRHOR() {
         if (!this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.isEmpty() || this.IHIRRHRHRRROIIOROOHHRRHOIORIIO != null && !this.IHIRRHRHRRROIIOROOHHRRHOIORIIO.isEmpty()) {
            if (this.IHIRRHRHRRROIIOROOHHRRHOIORIIO != null) {
               this.ICICRCCRRRRROOIOOORHOHIRHHOCIH();
            } else if (!this.RROOIOHCIHHICICIIRRRCCRRRIICRI.isEmpty()) {
               this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.add(this.RROOIOHCIHHICICIIRRRCCRRRIICRI);
            }

            return this.RRCRCROIHIRICHRHHOIHRICCOCHIRH
               ? new IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.toArray())
               : new HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.IOCRROCIHIHIROIIRIORIHOCCOHHOH.toArray(new String[0]));
         } else if (this.RROOIOHCIHHICICIIRRRCCRRRIICRI.isEmpty()) {
            throw new RuntimeException("CachedReplacement.Builder created with nothing set!");
         } else {
            return new CRRRICCRROCOHHOHIICIHORCOORRRH(this.RROOIOHCIHHICICIIRRRCCRRRIICRI);
         }
      }

      @Generated
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }
   }
}
