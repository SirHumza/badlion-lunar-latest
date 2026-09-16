package net.optifine.entity.model;

public class ModelAdapterPig extends ModelAdapterQuadruped {
   public ModelAdapterPig() {
      super(tt.class, "pig", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bbq();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bjs(renderManager, modelBase, shadowSize);
   }
}
