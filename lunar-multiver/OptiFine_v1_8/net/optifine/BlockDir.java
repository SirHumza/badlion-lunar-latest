package net.optifine;

public enum BlockDir {
   DOWN(cq.a),
   UP(cq.b),
   NORTH(cq.c),
   SOUTH(cq.d),
   WEST(cq.e),
   EAST(cq.f),
   NORTH_WEST(cq.c, cq.e),
   NORTH_EAST(cq.c, cq.f),
   SOUTH_WEST(cq.d, cq.e),
   SOUTH_EAST(cq.d, cq.f),
   DOWN_NORTH(cq.a, cq.c),
   DOWN_SOUTH(cq.a, cq.d),
   UP_NORTH(cq.b, cq.c),
   UP_SOUTH(cq.b, cq.d),
   DOWN_WEST(cq.a, cq.e),
   DOWN_EAST(cq.a, cq.f),
   UP_WEST(cq.b, cq.e),
   UP_EAST(cq.b, cq.f);

   private cq facing1;
   private cq facing2;

   BlockDir(cq facing1) {
      this.facing1 = facing1;
   }

   BlockDir(cq facing1, cq facing2) {
      this.facing1 = facing1;
      this.facing2 = facing2;
   }

   public cq getFacing1() {
      return this.facing1;
   }

   public cq getFacing2() {
      return this.facing2;
   }

   cj offset(cj pos) {
      pos = pos.a(this.facing1, 1);
      if (this.facing2 != null) {
         pos = pos.a(this.facing2, 1);
      }

      return pos;
   }

   public int getOffsetX() {
      int offset = this.facing1.g();
      if (this.facing2 != null) {
         offset += this.facing2.g();
      }

      return offset;
   }

   public int getOffsetY() {
      int offset = this.facing1.h();
      if (this.facing2 != null) {
         offset += this.facing2.h();
      }

      return offset;
   }

   public int getOffsetZ() {
      int offset = this.facing1.i();
      if (this.facing2 != null) {
         offset += this.facing2.i();
      }

      return offset;
   }

   public boolean isDouble() {
      return this.facing2 != null;
   }
}
