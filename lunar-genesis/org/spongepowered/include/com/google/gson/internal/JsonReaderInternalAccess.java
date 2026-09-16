package org.spongepowered.include.com.google.gson.internal;

import org.spongepowered.include.com.google.gson.stream.JsonReader;

public abstract class JsonReaderInternalAccess {
   public static JsonReaderInternalAccess INSTANCE;

   public abstract void promoteNameToValue(JsonReader var1);
}
