package net.optifine.entity.model;

public class ModelAdapterEnderman extends ModelAdapterBiped {
   public ModelAdapterEnderman() {
      super(vo.class, "enderman", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bbd(0.0F);
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bis render = new bis(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
