package com.typesafe.config;

import java.util.List;

public interface ConfigList extends ConfigValue, List<ConfigValue> {
   List<Object> unwrapped();

   ConfigList withOrigin(ConfigOrigin var1);
}
