package net.optifine.entity.model;

public class ModelAdapterSheep extends ModelAdapterQuadruped {
   public ModelAdapterSheep() {
      super(tv.class, "sheep", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bbw();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bjv(renderManager, modelBase, shadowSize);
   }
}
