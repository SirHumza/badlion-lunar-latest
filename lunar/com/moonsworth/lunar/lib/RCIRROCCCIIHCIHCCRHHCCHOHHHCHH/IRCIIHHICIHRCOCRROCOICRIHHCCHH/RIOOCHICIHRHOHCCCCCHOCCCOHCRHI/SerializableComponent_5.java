package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements Serializable {
   private static final long CCHOCRCRCICHIRICHRCRRICICCHCHI = 1L;
   protected static final RRCRRCORICCHOHHIRCHIROOHIIOHCO HHIHHIRROOOHHIHCHHCCRIRRRCOHRR = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(false, null);
   public static final int HCCHIROHCRHIOCRCHOROCRHOCIHHHI = 500;
   protected final transient Object CORCICRRRCHIIHOROOHORICICCHCRC;
   protected final int RCICRCRHOCCICCOCIOOHCRIHOICRIO;
   protected final int COCORRIOCRHOCIOIHIHOROCHHHOOHC;
   protected final boolean ORRIOIIRCIOHRRRCOIOOHIICROCHRH;

   protected RRCRRCORICCHOHHIRCHIROOHIIOHCO(boolean var1, Object var2) {
      this(var1, var2, -1, -1);
   }

   protected RRCRRCORICCHOHHIRCHIROOHIIOHCO(boolean var1, Object var2, int var3, int var4) {
      this.ORRIOIIRCIOHRRRCOIOOHIICROCHRH = var1;
      this.CORCICRRRCHIIHOROOHORICICCHCRC = var2;
      this.RCICRCRHOCCICCOCIOOHCRIHOICRIO = var3;
      this.COCORRIOCRHOCIOIHIHOROCHHHOOHC = var4;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO HIHRCIHOOIRRIIOICOHHROIHOIIORH() {
      return HHIHHIRROOOHHIHCHHCCRIRRRCOHRR;
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var0, Object var1) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1);
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var0, Object var1, int var2, int var3) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1, var2, var3);
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO HHCCIRHCCCIIRHCROHIORHIRHHIORH(boolean var0, Object var1) {
      return var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO ? (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1 : new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0, var1);
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO HICRCHHRCHOIRCOHROCIHHORHIOOCH(Object var0) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(false, var0);
   }

   private void readObject(ObjectInputStream var1) {
   }

   private void writeObject(ObjectOutputStream var1) {
   }

   protected Object readResolve() {
      return HHIHHIRROOOHHIHCHHCCRIRRRCOHRR;
   }

   public boolean HRCIORHRIOHIIHCRHRCRIICOOHIHHO() {
      return this.ORRIOIIRCIOHRRRCOIOOHIICROCHRH;
   }

   public Object IIRCOIHCCRROIORCICROIHCOHHCOHR() {
      return this.CORCICRRRCHIIHOROOHORICICCHCRC;
   }

   public int OIRIORRIOOHRCHCIIICICRIROOOROI() {
      return this.RCICRCRHOCCICCOCIOOHCRIHOICRIO;
   }

   public int RCORCRRORIOHCIHHHOIHHHIOOROHOR() {
      return this.COCORRIOCRHOCIOIHIHOROCHHHOOHC;
   }

   protected int CROHOHHCICHOOCIIIIHRIHHOIHHRIO() {
      return 500;
   }

   public String RHROROIHROHCHHRRRCRIHCHOIOHCIO() {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(new StringBuilder(200)).toString();
   }

   public StringBuilder CRRRICCRROCOHHOHIICIHORCOORRRH(StringBuilder var1) {
      Object var2 = this.IIRCOIHCCRROIORCICROIHCOHHCOHR();
      if (var2 == null) {
         var1.append("UNKNOWN");
         return var1;
      }

      Class var3 = var2 instanceof Class ? (Class)var2 : var2.getClass();
      String var4 = var3.getName();
      if (var4.startsWith("java.")) {
         var4 = var3.getSimpleName();
      } else if (var2 instanceof byte[]) {
         var4 = "byte[]";
      } else if (var2 instanceof char[]) {
         var4 = "char[]";
      }

      var1.append('(').append(var4).append(')');
      if (this.HRCIORHRIOHIIHCRHRCRIICOOHIHHO()) {
         String var5 = " chars";
         int var7 = this.CROHOHHCICHOOCIIIIHRIHHOIHHRIO();
         int[] var8 = new int[]{this.OIRIORRIOOHRCHCIIICICRIROOOROI(), this.RCORCRRORIOHCIHHHOIHHHIOOROHOR()};
         String var6;
         if (var2 instanceof CharSequence) {
            var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CharSequence)var2, var8, var7);
         } else if (var2 instanceof char[]) {
            var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((char[])var2, var8, var7);
         } else if (var2 instanceof byte[]) {
            var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((byte[])var2, var8, var7);
            var5 = " bytes";
         } else {
            var6 = null;
         }

         if (var6 != null) {
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var6);
            if (var8[1] > var7) {
               var1.append("[truncated ").append(var8[1] - var7).append(var5).append(']');
            }
         }
      } else if (var2 instanceof byte[]) {
         int var9 = this.RCORCRRORIOHCIHHHOIHHHIOOROHOR();
         if (var9 < 0) {
            var9 = ((byte[])var2).length;
         }

         var1.append('[').append(var9).append(" bytes]");
      }

      return var1;
   }

   protected String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CharSequence var1, int[] var2, int var3) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1.length());
      int var4 = var2[0];
      int var5 = Math.min(var2[1], var3);
      return var1.subSequence(var4, var4 + var5).toString();
   }

   protected String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1, int[] var2, int var3) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1.length);
      int var4 = var2[0];
      int var5 = Math.min(var2[1], var3);
      return new String(var1, var4, var5);
   }

   protected String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, int[] var2, int var3) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1.length);
      int var4 = var2[0];
      int var5 = Math.min(var2[1], var3);
      return new String(var1, var4, var5, StandardCharsets.UTF_8);
   }

   protected void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int[] var1, int var2) {
      int var3 = var1[0];
      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= var2) {
         var3 = var2;
      }

      var1[0] = var3;
      int var4 = var1[1];
      int var5 = var2 - var3;
      if (var4 < 0 || var4 > var5) {
         var1[1] = var5;
      }
   }

   protected int CRRRICCRROCOHHOHIICIHORCOORRRH(StringBuilder var1, String var2) {
      var1.append('"');
      int var3 = 0;

      for (int var4 = var2.length(); var3 < var4; var3++) {
         char var5 = var2.charAt(var3);
         if (!Character.isISOControl(var5) || !this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var5)) {
            var1.append(var5);
         }
      }

      var1.append('"');
      return var2.length();
   }

   protected boolean CRRRICCRROCOHHOHIICIHORCOORRRH(StringBuilder var1, int var2) {
      if (var2 != 13 && var2 != 10) {
         var1.append('\\');
         var1.append('u');
         var1.append(HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOIIRRRCCHRIOOHCIIROOOHOIOOHOI(var2 >> 12 & 15));
         var1.append(HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOIIRRRCCHRIOOHCIIROOOHOIOOHOI(var2 >> 8 & 15));
         var1.append(HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOIIRRRCCHRIOOHCIIROOOHOIOOHOI(var2 >> 4 & 15));
         var1.append(HHCCIRHCCCIIRHCROHIORHIRHHIORH.HOIIRRRCCHRIOOHCIIROOOHOIOOHOI(var2 & 15));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof RRCRRCORICCHOHHIRCHIROOHIIOHCO)) {
         return false;
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = (RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1;
      if (this.RCICRCRHOCCICCOCIOOHCRIHOICRIO == var2.RCICRCRHOCCICCOCIOOHCRIHOICRIO
         && this.COCORRIOCRHOCIOIHIHOROCHHHOOHC == var2.COCORRIOCRHOCIOIHIHOROCHHHOOHC) {
         Object var3 = var2.CORCICRRRCHIIHOROOHORICICCHCRC;
         if (this.CORCICRRRCHIIHOROOHORICICCHCRC == null) {
            return var3 == null;
         } else if (var3 == null) {
            return false;
         } else {
            return !(this.CORCICRRRCHIIHOROOHORICICCHCRC instanceof File)
                  && !(this.CORCICRRRCHIIHOROOHORICICCHCRC instanceof URL)
                  && !(this.CORCICRRRCHIIHOROOHORICICCHCRC instanceof URI)
               ? this.CORCICRRRCHIIHOROOHORICICCHCRC == var2.CORCICRRRCHIIHOROOHORICICCHCRC
               : this.CORCICRRRCHIIHOROOHORICICCHCRC.equals(var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.CORCICRRRCHIIHOROOHORICICCHCRC);
   }
}
