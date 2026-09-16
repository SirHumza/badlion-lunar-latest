package net.minecraftforge.client.model.pipeline;

public interface IVertexConsumer {
   bmu getVertexFormat();

   void setQuadTint(int var1);

   void setQuadOrientation(cq var1);

   void setQuadColored();

   void put(int var1, float... var2);
}
