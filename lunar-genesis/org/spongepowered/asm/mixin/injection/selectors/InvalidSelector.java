package org.spongepowered.asm.mixin.injection.selectors;

public class InvalidSelector implements ITargetSelector {
   private String input;
   private Throwable cause;

   public InvalidSelector(Throwable var1) {
      this(var1, null);
   }

   public InvalidSelector(String var1) {
      this(null, var1);
   }

   public InvalidSelector(Throwable var1, String var2) {
      this.input = var2;
      this.cause = var1;
   }

   @Override
   public String toString() {
      return this.cause != null ? String.format("%s: %s", this.cause.getClass().getName(), this.cause.getMessage()) : this.input;
   }

   @Override
   public ITargetSelector next() {
      return null;
   }

   @Override
   public ITargetSelector configure(ITargetSelector.Configure var1, String... var2) {
      return this;
   }

   @Override
   public ITargetSelector validate() {
      if (this.cause instanceof InvalidSelectorException) {
         throw (InvalidSelectorException)this.cause;
      }

      String var1 = "Error parsing target selector";
      if (this.input != null) {
         var1 = var1 + ", the input was in an unexpected format: " + this.input;
      }

      if (this.cause != null) {
         throw new InvalidSelectorException(var1, this.cause);
      } else {
         throw new InvalidSelectorException(var1);
      }
   }

   @Override
   public ITargetSelector attach(ISelectorContext var1) {
      return this;
   }

   @Override
   public int getMinMatchCount() {
      return 0;
   }

   @Override
   public int getMaxMatchCount() {
      return 0;
   }

   @Override
   public <TNode> MatchResult match(ElementNode<TNode> var1) {
      this.validate();
      return MatchResult.NONE;
   }
}
