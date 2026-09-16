package com.github.trilarion.sound.util;

import java.util.logging.Logger;

public class SoundException extends Exception {
   private static final Logger LOG = Logger.getLogger(SoundException.class.getName());

   public SoundException(String var1) {
      super("Vorbis exception " + var1);
   }
}
