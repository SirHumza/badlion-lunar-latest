package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Long> {
   private long value;
   private long IRRHICRCRIOOHORIRCRIHCRIIICOOC;

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Long> var2,
      long var3
   ) {
      super(var1, var2);
      this.value = this.IRRHICRCRIOOHORIRCRIHCRIIICOOC = var3;
   }

   public final long RCOICOIIOICCIIHRHHIRIIIOOOOIOI() {
      return this.IRRHICRCRIOOHORIRCRIHCRIIICOOC;
   }

   public final void ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(long var1) {
      this.IRRHICRCRIOOHORIRCRIHCRIIICOOC = var1;
   }

   public final long getLongValue() {
      return this.value;
   }

   public final void CHHIICHRIIROIOHIHIIROICOCCROCI(long var1) {
      this.value = var1;
   }

   @Deprecated
   public final Long ORRRRIOHOCOCCCCOOCIOIICOIHICRI() {
      return this.IRRHICRCRIOOHORIRCRIHCRIIICOOC;
   }

   @Deprecated
   public final void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Long var1) {
      this.IRRHICRCRIOOHORIRCRIHCRIIICOOC = var1;
   }

   @Deprecated
   public final Long COHOIOOORRHCCHRCOHCOIRHIRHRHIC() {
      return this.value;
   }

   @Deprecated
   protected final void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Long var1) {
      this.value = var1;
   }
}
