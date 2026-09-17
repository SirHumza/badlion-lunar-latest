package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.List;
import java.util.Map;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RuntimeException {
   private static final long IOHOOIOHCHICOCHIICHCICCOHRCIII = 1L;
   private int code = 0;
   private Map<String, List<String>> IHORRHOROHHHIORCCHRCRIRRHHCCCO = null;
   private String CRHHOOCRCOHHRHOOOCHCROOHIOOCOH = null;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Throwable var1) {
      super(var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1) {
      super(var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, Throwable var2, int var3, Map<String, List<String>> var4, String var5) {
      super(var1, var2);
      this.code = var3;
      this.IHORRHOROHHHIORCCHRCRIRRHHCCCO = var4;
      this.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH = var5;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, int var2, Map<String, List<String>> var3, String var4) {
      this(var1, (Throwable)null, var2, var3, var4);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, Throwable var2, int var3, Map<String, List<String>> var4) {
      this(var1, var2, var3, var4, null);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, Map<String, List<String>> var2, String var3) {
      this("Response Code: " + var1 + " Response Body: " + var3, (Throwable)null, var1, var2, var3);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, String var2) {
      super(var2);
      this.code = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, String var2, Map<String, List<String>> var3, String var4) {
      this(var1, var2);
      this.IHORRHOROHHHIORCCHRCRIRRHHCCCO = var3;
      this.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH = var4;
   }

   public int getCode() {
      return this.code;
   }

   public Map<String, List<String>> RIIHIHHCRHCHRCICHOROHCHIIHCICH() {
      return this.IHORRHOROHHHIORCCHRCRIRRHHCCCO;
   }

   public String IHIIIRHOOCHRCCCCIORIROCOIRRHCC() {
      return this.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
   }

   @Override
   public String getMessage() {
      return String.format(
         "Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
         super.getMessage(),
         this.getCode(),
         this.IHIIIRHOOCHRCCCCIORIROCOIRRHCC(),
         this.RIIHIHHCRHCHRCICHOROHCHIIHCICH()
      );
   }
}
