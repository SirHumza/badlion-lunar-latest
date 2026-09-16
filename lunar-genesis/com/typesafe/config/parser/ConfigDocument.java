package com.typesafe.config.parser;

import com.typesafe.config.ConfigValue;

public interface ConfigDocument {
   ConfigDocument withValueText(String var1, String var2);

   ConfigDocument withValue(String var1, ConfigValue var2);

   ConfigDocument withoutPath(String var1);

   boolean hasPath(String var1);

   String render();
}
