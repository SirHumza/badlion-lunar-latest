package com.typesafe.config.parser;

import com.typesafe.config.ConfigParseOptions;
import com.typesafe.config.impl.Parseable;
import java.io.File;
import java.io.Reader;

public final class ConfigDocumentFactory {
   public static ConfigDocument parseReader(Reader var0, ConfigParseOptions var1) {
      return Parseable.newReader(var0, var1).parseConfigDocument();
   }

   public static ConfigDocument parseReader(Reader var0) {
      return parseReader(var0, ConfigParseOptions.defaults());
   }

   public static ConfigDocument parseFile(File var0, ConfigParseOptions var1) {
      return Parseable.newFile(var0, var1).parseConfigDocument();
   }

   public static ConfigDocument parseFile(File var0) {
      return parseFile(var0, ConfigParseOptions.defaults());
   }

   public static ConfigDocument parseString(String var0, ConfigParseOptions var1) {
      return Parseable.newString(var0, var1).parseConfigDocument();
   }

   public static ConfigDocument parseString(String var0) {
      return parseString(var0, ConfigParseOptions.defaults());
   }
}
