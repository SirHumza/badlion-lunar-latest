package com.moonsworth.lunar.client.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;
import lombok.Generated;
import org.apache.commons.io.FilenameUtils;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements FilenameFilter {
   private final Set<String> OCIRHIHHRIHOCRIIROCHHOHHHCCHRR;

   @Override
   public boolean accept(File var1, String var2) {
      return this.OCIRHIHHRIHOCRIIROCHHOHHHCCHRR.contains(FilenameUtils.getExtension(var2));
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH CRHROHHHCIHHCOHCOORCRIHHIICROR(String... var0) {
      return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(Set.of(var0));
   }

   @Generated
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH(Set<String> var1) {
      this.OCIRHIHHRIHOCRIIROCHHOHHHCCHRR = var1;
   }
}
