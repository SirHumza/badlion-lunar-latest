package net.optifine.render;

import bgf.b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.optifine.BlockPosM;
import net.optifine.model.ListQuadsOverlay;

public class RenderEnv {
   private alz blockState;
   private cj blockPos;
   private int blockId = -1;
   private int metadata = -1;
   private int breakingAnimation = -1;
   private int smartLeaves = -1;
   private float[] quadBounds = new float[cq.n.length * 2];
   private BitSet boundsFlags = new BitSet(3);
   private b aoFace = new b();
   private BlockPosM colorizerBlockPosM = null;
   private boolean[] borderFlags = null;
   private boolean[] borderFlags2 = null;
   private boolean[] borderFlags3 = null;
   private cq[] borderDirections = null;
   private List<bgg> listQuadsCustomizer = new ArrayList<>();
   private List<bgg> listQuadsCtmMultipass = new ArrayList<>();
   private bgg[] arrayQuadsCtm1 = new bgg[1];
   private bgg[] arrayQuadsCtm2 = new bgg[2];
   private bgg[] arrayQuadsCtm3 = new bgg[3];
   private bgg[] arrayQuadsCtm4 = new bgg[4];
   private bfg regionRenderCacheBuilder = null;
   private ListQuadsOverlay[] listsQuadsOverlay = new ListQuadsOverlay[adf.values().length];
   private boolean overlaysRendered = false;
   private static final int UNKNOWN = -1;
   private static final int FALSE = 0;
   private static final int TRUE = 1;

   public RenderEnv(alz blockState, cj blockPos) {
      this.blockState = blockState;
      this.blockPos = blockPos;
   }

   public void reset(alz blockStateIn, cj blockPosIn) {
      if (this.blockState != blockStateIn || this.blockPos != blockPosIn) {
         this.blockState = blockStateIn;
         this.blockPos = blockPosIn;
         this.blockId = -1;
         this.metadata = -1;
         this.breakingAnimation = -1;
         this.smartLeaves = -1;
         this.boundsFlags.clear();
      }
   }

   public int getBlockId() {
      if (this.blockId < 0) {
         if (this.blockState instanceof aly) {
            aly bsb = (aly)this.blockState;
            this.blockId = bsb.getBlockId();
         } else {
            this.blockId = afh.a(this.blockState.c());
         }
      }

      return this.blockId;
   }

   public int getMetadata() {
      if (this.metadata < 0) {
         if (this.blockState instanceof aly) {
            aly bsb = (aly)this.blockState;
            this.metadata = bsb.getMetadata();
         } else {
            this.metadata = this.blockState.c().c(this.blockState);
         }
      }

      return this.metadata;
   }

   public float[] getQuadBounds() {
      return this.quadBounds;
   }

   public BitSet getBoundsFlags() {
      return this.boundsFlags;
   }

   public b getAoFace() {
      return this.aoFace;
   }

   public boolean isBreakingAnimation(List listQuads) {
      if (this.breakingAnimation == -1 && listQuads.size() > 0) {
         if (listQuads.get(0) instanceof bgn) {
            this.breakingAnimation = 1;
         } else {
            this.breakingAnimation = 0;
         }
      }

      return this.breakingAnimation == 1;
   }

   public boolean isBreakingAnimation(bgg quad) {
      if (this.breakingAnimation < 0) {
         if (quad instanceof bgn) {
            this.breakingAnimation = 1;
         } else {
            this.breakingAnimation = 0;
         }
      }

      return this.breakingAnimation == 1;
   }

   public boolean isBreakingAnimation() {
      return this.breakingAnimation == 1;
   }

   public alz getBlockState() {
      return this.blockState;
   }

   public BlockPosM getColorizerBlockPosM() {
      if (this.colorizerBlockPosM == null) {
         this.colorizerBlockPosM = new BlockPosM(0, 0, 0);
      }

      return this.colorizerBlockPosM;
   }

   public boolean[] getBorderFlags() {
      if (this.borderFlags == null) {
         this.borderFlags = new boolean[4];
      }

      return this.borderFlags;
   }

   public boolean[] getBorderFlags2() {
      if (this.borderFlags2 == null) {
         this.borderFlags2 = new boolean[4];
      }

      return this.borderFlags2;
   }

   public boolean[] getBorderFlags3() {
      if (this.borderFlags3 == null) {
         this.borderFlags3 = new boolean[4];
      }

      return this.borderFlags3;
   }

   public cq[] getBorderDirections() {
      if (this.borderDirections == null) {
         this.borderDirections = new cq[4];
      }

      return this.borderDirections;
   }

   public cq[] getBorderDirections(cq dir0, cq dir1, cq dir2, cq dir3) {
      cq[] dirs = this.getBorderDirections();
      dirs[0] = dir0;
      dirs[1] = dir1;
      dirs[2] = dir2;
      dirs[3] = dir3;
      return dirs;
   }

   public boolean isSmartLeaves() {
      if (this.smartLeaves == -1) {
         if (Config.isTreesSmart() && this.blockState.c() instanceof ahs) {
            this.smartLeaves = 1;
         } else {
            this.smartLeaves = 0;
         }
      }

      return this.smartLeaves == 1;
   }

   public List<bgg> getListQuadsCustomizer() {
      return this.listQuadsCustomizer;
   }

   public bgg[] getArrayQuadsCtm(bgg quad) {
      this.arrayQuadsCtm1[0] = quad;
      return this.arrayQuadsCtm1;
   }

   public bgg[] getArrayQuadsCtm(bgg quad0, bgg quad1) {
      this.arrayQuadsCtm2[0] = quad0;
      this.arrayQuadsCtm2[1] = quad1;
      return this.arrayQuadsCtm2;
   }

   public bgg[] getArrayQuadsCtm(bgg quad0, bgg quad1, bgg quad2) {
      this.arrayQuadsCtm3[0] = quad0;
      this.arrayQuadsCtm3[1] = quad1;
      this.arrayQuadsCtm3[2] = quad2;
      return this.arrayQuadsCtm3;
   }

   public bgg[] getArrayQuadsCtm(bgg quad0, bgg quad1, bgg quad2, bgg quad3) {
      this.arrayQuadsCtm4[0] = quad0;
      this.arrayQuadsCtm4[1] = quad1;
      this.arrayQuadsCtm4[2] = quad2;
      this.arrayQuadsCtm4[3] = quad3;
      return this.arrayQuadsCtm4;
   }

   public List<bgg> getListQuadsCtmMultipass(bgg[] quads) {
      this.listQuadsCtmMultipass.clear();
      if (quads != null) {
         for (int i = 0; i < quads.length; i++) {
            bgg quad = quads[i];
            this.listQuadsCtmMultipass.add(quad);
         }
      }

      return this.listQuadsCtmMultipass;
   }

   public bfg getRegionRenderCacheBuilder() {
      return this.regionRenderCacheBuilder;
   }

   public void setRegionRenderCacheBuilder(bfg regionRenderCacheBuilder) {
      this.regionRenderCacheBuilder = regionRenderCacheBuilder;
   }

   public ListQuadsOverlay getListQuadsOverlay(adf layer) {
      ListQuadsOverlay list = this.listsQuadsOverlay[layer.ordinal()];
      if (list == null) {
         list = new ListQuadsOverlay();
         this.listsQuadsOverlay[layer.ordinal()] = list;
      }

      return list;
   }

   public boolean isOverlaysRendered() {
      return this.overlaysRendered;
   }

   public void setOverlaysRendered(boolean overlaysRendered) {
      this.overlaysRendered = overlaysRendered;
   }
}
