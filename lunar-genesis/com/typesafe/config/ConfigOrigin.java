package com.typesafe.config;

import java.net.URL;
import java.util.List;

public interface ConfigOrigin {
   String description();

   String filename();

   URL url();

   String resource();

   int lineNumber();

   List<String> comments();

   ConfigOrigin withComments(List<String> var1);

   ConfigOrigin withLineNumber(int var1);
}
