package com.typesafe.config;

import com.typesafe.config.impl.ConfigBeanImpl;

public class ConfigBeanFactory {
   public static <T> T create(Config var0, Class<T> var1) {
      return ConfigBeanImpl.createInternal(var0, var1);
   }
}
