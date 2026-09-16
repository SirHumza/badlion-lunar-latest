import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class uBMlMKyXwmX0EK0kfsijZNTp4hBUYFfRWKJefXsPH5ivKSSRJfU3L3LDkO7zU6NlrKIEe3qCdknVdKZ4HcZJIorv59e9TNi5jaQf {
   public static final String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = "grass_top";
   public static final String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = "stone";
   public static final String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5 = "dirt";
   public static final String PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u = "coarse_dirt";
   public static final String uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590 = "grass_side";
   public static final String QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0 = "stone_slab_side";
   public static final String kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ = "stone_slab_top";
   public static final String y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY = "bedrock";
   public static final String sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9 = "sand";
   public static final String lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ = "gravel";
   public static final String agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x = "log_oak";
   public static final String uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk = "log_big_oak";
   public static final String Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ = "log_acacia";
   public static final String aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = "log_spruce";
   public static final String LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = "log_birch";
   public static final String G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = "log_jungle";
   public static final String iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = "log_oak_top";
   public static final String bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = "log_big_oak_top";
   public static final String RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = "log_acacia_top";
   public static final String J1VLLIBCcZYqsaZhGKUiJoLcHFU1EJaCZvLl4QFMTqn7fzHDGkkCKNDFKU4XbeFyk8njwMcgfY6j93jLeZs8jAC6Xw2vjgswnn40 = "log_spruce_top";
   public static final String zYsFhXndsTXpBULV9SbQRAPo7Eko9Z3Zs5nhhj1ndgHpLTUagG4wFepuFXrzHesiyrTZAHxS9VR68lIK48usZWN38KwLp7RwGH1t = "log_birch_top";
   public static final String RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = "log_jungle_top";
   public static final String K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = "leaves_oak";
   public static final String CLN0iQxTW30J248Fxg16Bugujy6a3ZiEgudmbjRU3IbkRT7YZU3jIYed7LCKoRRICKjJIVig9YZZItorQ2IeFMP2gWElNbTNVZgl = "leaves_big_oak";
   public static final String HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU = "leaves_acacia";
   public static final String z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = "leaves_birch";
   public static final String LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = "leaves_spruce";
   public static final String xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = "leaves_jungle";
   public static final String o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = "gold_ore";
   public static final String K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = "iron_ore";
   public static final String sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = "coal_ore";
   public static final String GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = "obsidian";
   public static final String OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = "grass_side_overlay";
   public static final String f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = "snow";
   public static final String fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = "grass_side_snowed";
   public static final String z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = "mycelium_side";
   public static final String N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = "mycelium_top";
   public static final String EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = "diamond_ore";
   public static final String KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = "redstone_ore";
   public static final String WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = "lapis_ore";
   public static final String OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = "cactus_side";
   public static final String vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = "clay";
   public static final String ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = "farmland_wet";
   public static final String ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = "farmland_dry";
   public static final String fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = "netherrack";
   public static final String dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = "soul_sand";
   public static final String lXnIKHX4LL4UVZqpHxViO6OjyXkTlTDY0epCVxu6ttLtuKke8pmpW0wcG0kcTCIzpgn9rnvQu9HzpRoIlINbDt0LmkQkzj7PO192 = "glowstone";
   public static final String mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = "leaves_spruce";
   public static final String xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = "leaves_spruce_opaque";
   public static final String kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc = "end_stone";
   public static final String zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 = "sandstone_top";
   public static final String TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ = "sandstone_bottom";
   public static final String kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP = "redstone_lamp_off";
   public static final String FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = "redstone_lamp_on";
   public static final String sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = "water_still";
   public static final String SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj = "water_flow";
   public static final String amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY = "lava_still";
   public static final String keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9 = "lava_flow";
   public static final String oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS = "fire_layer_0";
   public static final String JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh = "fire_layer_1";
   public static final String Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI = "portal";
   public static final String GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W = "glass";
   public static final String reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz = "glass_pane_top";
   public static final String UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1 = "compass";
   public static final String AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF = "clock";
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD fdWwz8f4KFCqAE9dJn6mau1WTLndFo20uW0xKGHrGzxKLLekdm6Au5JckJN97q44pOxYege3lGXnjUzxAOzU02jeru5UtgB2VOo4;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi;
   public static NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1;
   public static final String I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK = "minecraft:blocks/";
   public static final String KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g = "minecraft:items/";
   private static IntBuffer syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(
      256
   );

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var0 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      if (var0 != null) {
         String var1 = "minecraft:blocks/";
         gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "grass_top"
         );
         G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "grass_side"
         );
         LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "grass_side_overlay"
         );
         AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "snow"
         );
         aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "grass_side_snowed"
         );
         HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "mycelium_side"
         );
         SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "mycelium_top"
         );
         Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "water_still"
         );
         QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "water_flow"
         );
         jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2 = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "lava_still"
         );
         Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "lava_flow"
         );
         BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "fire_layer_0"
         );
         ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "fire_layer_1"
         );
         nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "portal"
         );
         H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "glass"
         );
         fdWwz8f4KFCqAE9dJn6mau1WTLndFo20uW0xKGHrGzxKLLekdm6Au5JckJN97q44pOxYege3lGXnjUzxAOzU02jeru5UtgB2VOo4 = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var1 + "glass_pane_top"
         );
         String var2 = "minecraft:items/";
         U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var2 + "compass"
         );
         J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = var0.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
            var2 + "clock"
         );
      }
   }

   public static BufferedImage Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0, BufferedImage var1
   ) {
      if (var0.startsWith("/mob/zombie") || var0.startsWith("/mob/pigzombie")) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if (var2 == var3 * 2) {
            BufferedImage var4 = new BufferedImage(var2, var3 * 2, 2);
            Graphics2D var5 = var4.createGraphics();
            var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var5.drawImage(var1, 0, 0, var2, var3, (ImageObserver)null);
            return var4;
         }
      }

      return var1;
   }

   public static int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(int var0) {
      byte var1 = 1;

      while (var1 < var0) {
         var1 *= 2;
      }

      return var1;
   }

   public static int BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(int var0) {
      byte var1 = 1;

      int var2;
      for (var2 = 0; var1 < var0; var2++) {
         var1 *= 2;
      }

      return var2;
   }

   public static int vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(int var0) {
      byte var1 = 1;

      for (int var2 = 0; var2 < var0; var2++) {
         var1 *= 2;
      }

      return var1;
   }

   public static sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var0
   ) {
      sO4unvUzKVnXz5ASLN05f2QDMjYlVODr5N2Wzbj3c5xh2wCAPPdAxcze8P8lA9STTeFADPcIX11vfGwWNGQmF4VZ4BCW5WqpCMIc var1 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP()
         .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0);
      if (var1 != null) {
         return var1;
      }

      if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
         var0
      )) {
         return null;
      }

      qHELC04VlnVcd80WVzOLVDZ5wgLMhtOULCiFdFuPPnMrmESeYtQhr1wVPqKmzqUuMGchXpqO2UIT88sH2l19iD0HrNpRhzXR6erB var2 = new qHELC04VlnVcd80WVzOLVDZ5wgLMhtOULCiFdFuPPnMrmESeYtQhr1wVPqKmzqUuMGchXpqO2UIT88sH2l19iD0HrNpRhzXR6erB(
         var0
      );
      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var2);
      return var2;
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0
   ) {
      if (BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() != null) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            "*** Reloading custom textures ***"
         );
         tbAdtjrVjTZnDNn67UBl9ovZNe5ulWEncmbDdjnupGrmQTMNmgLzPAIyD0xCV8FHIXTNfUaCKS8OEBoei8FbYSZSdtsBoi5hx2Ru.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         GTka5tuAxO4TMIfcOjUYeL2pePCOHThKmoneuyRPHSH1brJeCeypisosAiQ2xbWtFXUT0ggewgbgQZ9RT62nCbum4L1lAl6WJf.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         D9m3CWO7lnOl3Z9XCw1yItlneOj7JFVkLYzZUzazDhuz4rcvLjNP8PTCbvGi8K8P42enQZArxWGY9b3brk5PYLGupeinzA7StVrz.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         NCF4yCCo7Y3FaAZiAGlhWJegtVAnKgLg9NEcaQLlm01PzNz1iKqkYvRQuQFy0lyhK7zeLDGOG47xrMCWVmHstd3ando9nj3vaACm.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         zoUSWc3ANlMCY1DmHwCnohMroouCUKw0HPfEccyeYCz5K05Qmm8H3DPFXu2CjDb2cDK1JV4RQKv7aRS8qPbsqTtWUiYVmmhyt4vs.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         GTka5tuAxO4TMIfcOjUYeL2pePCOHThKmoneuyRPHSH1brJeCeypisosAiQ2xbWtFXUT0ggewgbgQZ9RT62nCbum4L1lAl6WJf.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         tbAdtjrVjTZnDNn67UBl9ovZNe5ulWEncmbDdjnupGrmQTMNmgLzPAIyD0xCV8FHIXTNfUaCKS8OEBoei8FbYSZSdtsBoi5hx2Ru.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
         xPuAtUT6z6M1r3eYhSWDTuNhaZTHagaHHRO19BVSI0IhpDBX2TDpdlTmWNxbu7giFxHBRVoTFgyQTt2NMSWd0u4vXP6GdOgGYOxo.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         WyAuEQO7C9ykNgIkZGRSyAkZznhxEWTa2sRoJtZBnAahveAPrhfBSeaeNHeQK212WfKyI6lD6ANXWHMLcIls3ylNjbLlsdJNb12i.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n();
         FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4();
         MXLYDWCyhVY3c8o7z7mQRzW9DTKb2V6zAg8XwOq4WV7VYm85IarbkLwhsQwSLIIx0jufZpxevDWPAW95IxL5o8uzeTrIu85edUJS.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP()
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
      }
   }

   public static seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      return AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU()
         .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i();
   }

   public static void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var0 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV();
      if (var0 instanceof huiuMA2Lcjaz9njJ2CfhmbCjGj2TYMYTyHCJQZlsnReWBP0vODyemkId6DJxL44fWe5U28nbMbBbRiaWi2i8coOMYrPLmpydCert) {
         huiuMA2Lcjaz9njJ2CfhmbCjGj2TYMYTyHCJQZlsnReWBP0vODyemkId6DJxL44fWe5U28nbMbBbRiaWi2i8coOMYrPLmpydCert var1 = (huiuMA2Lcjaz9njJ2CfhmbCjGj2TYMYTyHCJQZlsnReWBP0vODyemkId6DJxL44fWe5U28nbMbBbRiaWi2i8coOMYrPLmpydCert)var0;
         EGkXhz5pS9cF70byJMatQ7DV6yY8HIVGX8YoTxnSfJir1NA74xDToqjLQDXeJmXUDSndnPdCbacLEzHA72yvqDH7zBh7hw0idRYR var2 = new EGkXhz5pS9cF70byJMatQ7DV6yY8HIVGX8YoTxnSfJir1NA74xDToqjLQDXeJmXUDSndnPdCbacLEzHA72yvqDH7zBh7hw0idRYR();
         var1.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      }

      HKXmHozkQCOImsVxIXoMpq0Y0j3hG8Xxb2S4XXpivuBwIltPecYji6uEuMZoBOCfS9WECMO3PgHEBiiJdOMRG3ewWRZk5XCOFfxa var3 = new HKXmHozkQCOImsVxIXoMpq0Y0j3hG8Xxb2S4XXpivuBwIltPecYji6uEuMZoBOCfS9WECMO3PgHEBiiJdOMRG3ewWRZk5XCOFfxa();
      p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var4 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
         "optifine/TickableTextures"
      );
      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP()
         .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var4, var3);
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0, String var1) {
      String var2 = "assets/minecraft/";
      if (var0.startsWith(var2)) {
         return var0.substring(var2.length());
      }

      if (var0.startsWith("./")) {
         var0 = var0.substring(2);
         if (!var1.endsWith("/")) {
            var1 = var1 + "/";
         }

         return var1 + var0;
      } else {
         if (var0.startsWith("/~")) {
            var0 = var0.substring(1);
         }

         String var3 = "mcpatcher/";
         if (var0.startsWith("~/")) {
            var0 = var0.substring(2);
            return var3 + var0;
         } else {
            return var0.startsWith("/") ? var3 + var0.substring(1) : var0;
         }
      }
   }

   public static String Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0 ? "" : var0.substring(0, var1);
   }

   public static void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
         float var0 = GL11.glGetFloat(34047);
         float var1 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj();
         var1 = Math.min(var1, var0);
         GL11.glTexParameterf(3553, 34046, var1);
      }
   }

   public static void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(int var0) {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9(
         var0
      );
   }

   public static boolean uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(int var0) {
      int var1 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var0
      );
      return var1 == var0;
   }

   public static BufferedImage Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      BufferedImage var0, int var1
   ) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = var3 * var1 / var2;
      BufferedImage var5 = new BufferedImage(var1, var4, 2);
      Graphics2D var6 = var5.createGraphics();
      Object var7 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (var1 < var2 || var1 % var2 != 0) {
         var7 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var7);
      var6.drawImage(var0, 0, 0, var1, var4, (ImageObserver)null);
      return var5;
   }

   public static BufferedImage BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      BufferedImage var0, int var1
   ) {
      if (var0 == null) {
         return var0;
      }

      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int var4 = Math.max(var2, var1);
      var4 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
         var4
      );
      if (var4 == var2) {
         return var0;
      }

      int var5 = var3 * var4 / var2;
      BufferedImage var6 = new BufferedImage(var4, var5, 2);
      Graphics2D var7 = var6.createGraphics();
      Object var8 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (var4 % var2 != 0) {
         var8 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
      }

      var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var8);
      var7.drawImage(var0, 0, 0, var4, var5, (ImageObserver)null);
      return var6;
   }

   public static BufferedImage vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(
      BufferedImage var0, int var1
   ) {
      if (var0 == null) {
         return var0;
      }

      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      if (var2 >= var1) {
         return var0;
      }

      int var4 = var2;

      while (var4 < var1) {
         var4 *= 2;
      }

      int var5 = var3 * var4 / var2;
      BufferedImage var6 = new BufferedImage(var4, var5, 2);
      Graphics2D var7 = var6.createGraphics();
      Object var8 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      var7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, var8);
      var7.drawImage(var0, 0, 0, var4, var5, (ImageObserver)null);
      return var6;
   }

   public static Dimension Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(InputStream var0, String var1) {
      Iterator var2 = ImageIO.getImageReadersBySuffix(var1);

      while (var2.hasNext()) {
         ImageReader var3 = (ImageReader)var2.next();

         Dimension var4;
         try {
            ImageInputStream var5 = ImageIO.createImageInputStream(var0);
            var3.setInput(var5);
            int var6 = var3.getWidth(var3.getMinIndex());
            int var7 = var3.getHeight(var3.getMinIndex());
            var4 = new Dimension(var6, var7);
         } catch (IOException var11) {
            continue;
         } finally {
            var3.dispose();
         }

         return var4;
      }

      return null;
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var0
   ) {
      int[][] var1 = var0.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(0);

      for (int var2 = 0; var2 < var1.length; var2++) {
         int[] var3 = var1[var2];
         if (var3 == null) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "" + var2 + ": " + var3
            );
         } else {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "" + var2 + ": " + var3.length
            );
         }
      }
   }

   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      String var0, int var1, int var2, int var3, int var4
   ) {
      PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var1);
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      File var5 = new File(var0);
      File var6 = var5.getParentFile();
      if (var6 != null) {
         var6.mkdirs();
      }

      for (int var7 = 0; var7 < 16; var7++) {
         File var8 = new File(var0 + "_" + var7 + ".png");
         var8.delete();
      }

      for (int var17 = 0; var17 <= var2; var17++) {
         File var18 = new File(var0 + "_" + var17 + ".png");
         int var9 = var3 >> var17;
         int var10 = var4 >> var17;
         int var11 = var9 * var10;
         IntBuffer var12 = BufferUtils.createIntBuffer(var11);
         int[] var13 = new int[var11];
         GL11.glGetTexImage(3553, var17, 32993, 33639, var12);
         var12.get(var13);
         BufferedImage var14 = new BufferedImage(var9, var10, 2);
         var14.setRGB(0, 0, var9, var10, var13, 0, var9);

         try {
            ImageIO.write(var14, "png", var18);
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "Exported: " + var18
            );
         } catch (Exception var16) {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               "Error writing: " + var18
            );
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
               "" + var16.getClass().getName() + ": " + var16.getMessage()
            );
         }
      }
   }

   public static int uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      for (int var0 = 65536; var0 > 0; var0 >>= 1) {
         GL11.glTexImage2D(32868, 0, 6408, var0, var0, 0, 6408, 5121, (IntBuffer)null);
         int var1 = GL11.glGetError();
         int var2 = GL11.glGetTexLevelParameteri(32868, 0, 4096);
         if (var2 != 0) {
            return var0;
         }
      }

      return -1;
   }
}
