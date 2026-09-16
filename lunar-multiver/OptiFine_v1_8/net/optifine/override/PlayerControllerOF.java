package net.optifine.override;

public class PlayerControllerOF extends bda {
   private boolean acting = false;
   private cj lastClickBlockPos = null;
   private pk lastClickEntity = null;

   public PlayerControllerOF(ave mcIn, bcy netHandler) {
      super(mcIn, netHandler);
   }

   public boolean b(cj loc, cq face) {
      this.acting = true;
      this.lastClickBlockPos = loc;
      boolean res = super.b(loc, face);
      this.acting = false;
      return res;
   }

   public boolean c(cj posBlock, cq directionFacing) {
      this.acting = true;
      this.lastClickBlockPos = posBlock;
      boolean res = super.c(posBlock, directionFacing);
      this.acting = false;
      return res;
   }

   public boolean a(wn player, adm worldIn, zx stack) {
      this.acting = true;
      boolean res = super.a(player, worldIn, stack);
      this.acting = false;
      return res;
   }

   public boolean a(bew p_178890_1, bdb p_178890_2, zx p_178890_3, cj p_178890_4, cq p_178890_5, aui p_178890_6) {
      this.acting = true;
      this.lastClickBlockPos = p_178890_4;
      boolean res = super.a(p_178890_1, p_178890_2, p_178890_3, p_178890_4, p_178890_5, p_178890_6);
      this.acting = false;
      return res;
   }

   public boolean b(wn player, pk target) {
      this.lastClickEntity = target;
      return super.b(player, target);
   }

   public boolean a(wn player, pk target, auh ray) {
      this.lastClickEntity = target;
      return super.a(player, target, ray);
   }

   public boolean isActing() {
      return this.acting;
   }

   public cj getLastClickBlockPos() {
      return this.lastClickBlockPos;
   }

   public pk getLastClickEntity() {
      return this.lastClickEntity;
   }
}
