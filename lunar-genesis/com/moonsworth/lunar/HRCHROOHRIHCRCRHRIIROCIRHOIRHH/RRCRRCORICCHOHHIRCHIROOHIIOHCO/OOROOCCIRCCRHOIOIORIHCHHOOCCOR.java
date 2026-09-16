package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;
import org.cadixdev.lorenz.io.MappingFormat;
import org.cadixdev.lorenz.io.MappingsReader;
import org.cadixdev.lorenz.io.MappingsWriter;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public static MappingFormat IIRORROHOCCHCICCCRIRCHRHROCIIC = new MappingFormat() {
      @Override
      public MappingsReader createReader(InputStream var1) {
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1);
      }

      @Override
      public MappingsWriter createWriter(OutputStream var1) {
         return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      }

      @Override
      public Optional<String> getStandardFileExtension() {
         return Optional.of("kin");
      }
   };
}
