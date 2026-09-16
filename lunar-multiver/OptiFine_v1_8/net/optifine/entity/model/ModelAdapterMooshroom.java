package net.optifine.entity.model;

public class ModelAdapterMooshroom extends ModelAdapterQuadruped {
   public ModelAdapterMooshroom() {
      super(tr.class, "mooshroom", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bbb();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bjp(renderManager, modelBase, shadowSize);
   }
}
