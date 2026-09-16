package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public final class LexerChannelAction implements LexerAction {
   private final int channel;

   public LexerChannelAction(int var1) {
      this.channel = var1;
   }

   public LexerActionType getActionType() {
      return LexerActionType.CHANNEL;
   }

   @Override
   public boolean isPositionDependent() {
      return false;
   }

   @Override
   public void execute(Lexer var1) {
      var1.setChannel(this.channel);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.getActionType().ordinal());
      var1 = MurmurHash.update(var1, this.channel);
      return MurmurHash.finish(var1, 2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof LexerChannelAction) ? false : this.channel == ((LexerChannelAction)var1).channel;
      }
   }

   @Override
   public String toString() {
      return String.format("channel(%d)", this.channel);
   }
}
