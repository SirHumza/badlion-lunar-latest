package org.apache.commons.cli;

public interface CommandLineParser {
   CommandLine parse(Options var1, String[] var2);

   CommandLine parse(Options var1, String[] var2, boolean var3);
}
