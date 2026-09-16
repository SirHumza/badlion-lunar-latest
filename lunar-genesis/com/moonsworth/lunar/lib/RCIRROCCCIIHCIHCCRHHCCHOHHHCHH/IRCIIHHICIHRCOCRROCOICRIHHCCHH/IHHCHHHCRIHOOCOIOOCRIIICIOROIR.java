package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class IHHCHHHCRIHOOCOIOOCRIIICIOROIR extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final long HHHCIOOHRIRCOHRCHORORORICIROOR = 123L;
   protected HICHRCOHCCRHOHCICOOCHOIHCCHIRI OICORCRIIIHRHHICIOIORHIOOCOCHO;

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2, Throwable var3) {
      super(var1, var3);
      this.OICORCRIIIHRHHICIOIORHIOOCOCHO = var2;
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1) {
      super(var1);
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2) {
      this(var1, var2, null);
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(String var1, Throwable var2) {
      this(var1, null, var2);
   }

   protected IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Throwable var1) {
      this(null, null, var1);
   }

   @Override
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCHCIHHIHOHOIROIIROHHIOOICIRIO() {
      return this.OICORCRIIIHRHHICIOIORHIOOCOCHO;
   }

   public void COOOHIRRCCRCIHRCHHIHORIIHHIORO() {
      this.OICORCRIIIHRHHICIOIORHIOOCOCHO = null;
   }

   @Override
   public String ICHOCIOOCIORHHOCCCORRRCIHCOCCR() {
      return super.getMessage();
   }

   @Override
   public Object HHCCHHCHHICRHRHOHOCCHCIRHCCOHO() {
      return null;
   }

   protected String ROHOORRCIORHOROOCIOICRRIRHOORR() {
      return null;
   }

   @Override
   public String getMessage() {
      String var1 = super.getMessage();
      if (var1 == null) {
         var1 = "N/A";
      }

      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2 = this.RCHCIHHIHOHOIROIIROHHIOOICIRIO();
      String var3 = this.ROHOORRCIORHOROOCIOICRRIRHOORR();
      if (var2 != null || var3 != null) {
         StringBuilder var4 = new StringBuilder(100);
         var4.append(var1);
         if (var3 != null) {
            var4.append(var3);
         }

         if (var2 != null) {
            var4.append('\n');
            var4.append(" at ");
            var4.append(var2.toString());
         }

         var1 = var4.toString();
      }

      return var1;
   }

   @Override
   public String toString() {
      return this.getClass().getName() + ": " + this.getMessage();
   }
}
