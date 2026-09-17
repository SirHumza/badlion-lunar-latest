package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   p720("720p", 1280, 720),
   p1080("1080p", 1920, 1080),
   p1440("1440p", 2560, 1440),
   p2160("4k", 3840, 2160),
   CUSTOM("custom", 0, 0);

   private final String id;
   private final int width;
   private final int height;

   @Override
   public String id() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, int var4, int var5) {
      this.id = var3;
      this.width = var4;
      this.height = var5;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public int getWidth() {
      return this.width;
   }

   @Generated
   public int getHeight() {
      return this.height;
   }
}
