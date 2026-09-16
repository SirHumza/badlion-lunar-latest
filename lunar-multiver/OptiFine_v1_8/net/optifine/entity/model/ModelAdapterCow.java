package net.optifine.entity.model;

public class ModelAdapterCow extends ModelAdapterQuadruped {
   public ModelAdapterCow() {
      super(to.class, "cow", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bbb();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bin(renderManager, modelBase, shadowSize);
   }
}
