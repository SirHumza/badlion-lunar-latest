package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.annotations.SerializedName;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3i;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @SerializedName("fairySouls")
   private final Map<CRRRICCRROCOHHOHIICIHORCOORRRH, Set<Vector3i>> CRICOHHOHHRCHHHRCHHIRCHOOOCOOC;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      this.CRICOHHOHHRCHHHRCHHIRCHOOOCOOC = new EnumMap<>(CRRRICCRROCOHHOHIICIHORCOORRRH.class);
   }

   @NotNull
   public Set<Vector3i> HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return this.OCROOIOCOIHIHCRICHOIROHCCHOROI().getOrDefault(var1, new HashSet<>());
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, Vector3i var2) {
      Set var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (var3.add(var2)) {
         this.OCROOIOCOIHIHCRICHOIROHCCHOROI().put(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, Set<Vector3i> var2) {
      Set var3 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (var3.addAll(var2)) {
         this.OCROOIOCOIHIHCRICHOIROHCCHOROI().put(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Map<CRRRICCRROCOHHOHIICIHORCOORRRH, Set<Vector3i>> var1) {
      this.CRICOHHOHHRCHHHRCHHIRCHOOOCOOC = var1;
   }

   @Generated
   public Map<CRRRICCRROCOHHOHIICIHORCOORRRH, Set<Vector3i>> OCROOIOCOIHIHCRICHOIROHCCHOROI() {
      return this.CRICOHHOHHRCHHHRCHHIRCHOOOCOOC;
   }
}
