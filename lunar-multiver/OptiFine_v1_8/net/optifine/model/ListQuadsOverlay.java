package net.optifine.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuadsOverlay {
   private List<bgg> listQuads = new ArrayList<>();
   private List<alz> listBlockStates = new ArrayList<>();
   private List<bgg> listQuadsSingle = Arrays.asList();

   public void addQuad(bgg quad, alz blockState) {
      if (quad != null) {
         this.listQuads.add(quad);
         this.listBlockStates.add(blockState);
      }
   }

   public int size() {
      return this.listQuads.size();
   }

   public bgg getQuad(int index) {
      return this.listQuads.get(index);
   }

   public alz getBlockState(int index) {
      return index >= 0 && index < this.listBlockStates.size() ? this.listBlockStates.get(index) : afi.a.Q();
   }

   public List<bgg> getListQuadsSingle(bgg quad) {
      this.listQuadsSingle.set(0, quad);
      return this.listQuadsSingle;
   }

   public void clear() {
      this.listQuads.clear();
      this.listBlockStates.clear();
   }
}
