package net.minecraft.client.renderer;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C
   implements UpOyfyeXZqewS5PEJ48JnLscDTm7T3LJT7LHWvMLv6WPVGmjLpXQ5krYrpDWA8OP3PRbTXxGDdiHEai3cbf7EO5TvGQsYtoCV4V5,
   mRdJhgBKL2Y5rYyXTwCEnpECfGJA7CWvG2HETuKzXsJAHiMTKga3OnTaZEnxOa0CtrHD3PG2Z6at4wXhdr4Uiv1CrnnE6ivakwuC {
   private static final Logger BatModProgressBar = LogManager.getLogger();
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD ColorChooser = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/environment/moon_phases.png"
   );
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD IntegerSpinner = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/environment/sun.png"
   );
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD TextField = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/environment/clouds.png"
   );
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD ColorTextPane = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/environment/end_sky.png"
   );
   private static final p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD BatModInstallerMain = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
      "textures/misc/forcefield.png"
   );
   public final AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB BatModClient;
   private final falnvbnON9Yos1uc5Fb8Ya024Nj6kT8CIeZPcJ2aRWmnl3ydNppGk0tR5f0fVfO8Hx5dYDe9saJ4vN81axRqHk1dN0O0Np0uRlke aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
   private final fDy4F0oyD7SbTL7tPfQwCtq7gvYpu4JMtNRgYVmbHJh4WxX1qytXhVuNou0SaGcmQzdRXEfSFUmX4jmJTtlRqj1eUh9RwGtGQBKa LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
   private NteFd9HVJdwzXTrwPP9DzZdYpirUKP5pYzkC03lPx8N7W97p10Vq9iIcaWkKXAqVMB9lsyaG8A1eVjg3qfvn4o4eKR9hXeM56nBP G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
   private Set iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = Sets.newLinkedHashSet();
   private List bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = Lists.newArrayListWithCapacity(69696);
   private final Set RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = Sets.newHashSet();
   private net.minecraft.client.renderer.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv Downloader;
   private int InstallationLogger = -1;
   private int RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = -1;
   private int K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = -1;
   private Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ ExitCode;
   private JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu BatModJson;
   private JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP;
   private JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
   private int xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
   public final Map Button = Maps.newHashMap();
   private final Map o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = Maps.newHashMap();
   private final NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD[] K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = new NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD[10];
   private APCKnku8IKcywFvxNIRdlcHeXrfvE2KtW0ZVyADnx7KP5vrbyvp7LqGhEDr6uRUeKT8fzPNNzFUcKHk2wOIBCjyugCRylHYOGOHH sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr;
   private yAn3ZNwuV2FqZ0hD87bsEQIyaux98KqcoAjafFSKfeHh6SCSx9m36ApO0PEqh4u03MkMeeisbZoacd07oTTlecTSM8jKOt4Y46vp GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj;
   private double OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = Double.MIN_VALUE;
   private double f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = Double.MIN_VALUE;
   private double fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = Double.MIN_VALUE;
   private int z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = Integer.MIN_VALUE;
   private int N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = Integer.MIN_VALUE;
   private int EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = Integer.MIN_VALUE;
   private double KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = Double.MIN_VALUE;
   private double WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = Double.MIN_VALUE;
   private double OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = Double.MIN_VALUE;
   private double vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = Double.MIN_VALUE;
   private double ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = Double.MIN_VALUE;
   private final cxcE8GxXZbqKxssg8vl5L7KfydWYJTr2MQB1Ep9nWbJw1rKKCqoiv47pf2Ln2TeGFr0CRgm3uoCsPPRsCJKhC4vHKxDYWFCuQtzp ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = new cxcE8GxXZbqKxssg8vl5L7KfydWYJTr2MQB1Ep9nWbJw1rKKCqoiv47pf2Ln2TeGFr0CRgm3uoCsPPRsCJKhC4vHKxDYWFCuQtzp();
   private net.minecraft.client.renderer.Downloader fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i;
   private int dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = -1;
   private int GsonTypeAdapter = 2;
   private int mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv;
   private int xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
   private int kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc;
   private boolean zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 = false;
   private Yy0XW9CNJzYU3noXLE9EbioOPpMetWb83TCqAIBfMXWRetDEEZuNar3rlpkbkW3ZwfwmNuOfqAKTJgfyuCP0e3tuZ4rGG9Ad13yy TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ;
   private final Vector4f[] kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP = new Vector4f[8];
   private final eHG4vdUfwRZFqL8MJki05dqL4LGVj3caANIODUk2sXx5hkc3lqSdfegil3wNi0jVLeNbg1maKAem7lwPRuLWFqKOR2nPcW8W2Di FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = new eHG4vdUfwRZFqL8MJki05dqL4LGVj3caANIODUk2sXx5hkc3lqSdfegil3wNi0jVLeNbg1maKAem7lwPRuLWFqKOR2nPcW8W2Di();
   private boolean sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = false;
   BK6PxO5O1zsAhVfm2igzkRn6VGzjRmpZIydM6weCuSn439OQilbp1kqmFMRleTLeoNMaehlxBqrUg7DSB81E3PgjSjJsQhd9C1w4 CustomSpinner;
   private double SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj;
   private double amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY;
   private double keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9;
   public boolean ButtonAction = true;
   private static final String oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS = "CL_00000954";
   private s7nxx8drUU4cpiipNHBFKTyB9G830DIxHYTg4Wv4K3J2QPP9NcrbPIlaUP4MupK7miqQa0XNsjiepInFE0JRiM70Cl7FlPXAF63a JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh;
   public Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM Spinner;
   public Set Checkbox = new LinkedHashSet();
   public Set ProgressBar = new LinkedHashSet();
   private Deque Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI = new ArrayDeque();
   private List GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W = new ArrayList(1024);
   private List reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz = new ArrayList(1024);
   private List UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1 = new ArrayList(1024);
   private List AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF = new ArrayList(1024);
   private List gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C = new ArrayList(1024);
   private List G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk = new ArrayList(1024);
   private List LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl = new ArrayList(1024);
   private List AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I = new ArrayList(1024);
   private int aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH = 0;
   private int HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = 0;
   private static final Set SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj = Collections.unmodifiableSet(
      new HashSet<>(
         Arrays.asList(
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ProgressBar
         )
      )
   );
   private int Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE;
   private g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR = new g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM(
      0.0F, 200.0F
   );
   private g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2 = new g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM(
      0.0F, 200.0F
   );
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o;
   private q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n;

   public gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1
   ) {
      this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh = new s7nxx8drUU4cpiipNHBFKTyB9G830DIxHYTg4Wv4K3J2QPP9NcrbPIlaUP4MupK7miqQa0XNsjiepInFE0JRiM70Cl7FlPXAF63a(
         var1
      );
      this.BatModClient = var1;
      this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = var1.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY();
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = var1.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .BatModClient(
            BatModInstallerMain
         );
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser(
         0
      );
      this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
      this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Checkbox();
      if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
         this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = new net.minecraft.client.renderer.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o();
         this.CustomSpinner = new el8Uhl2ReNONY1geHYSbSajnRMA9AMyScuoAQCSxuXcpDLX0xwR5UxryMeXDUQ8lY1tjs7ZGJkIuCjCBLNE5L6oMsUlOut8AxzKs();
      } else {
         this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = new net.minecraft.client.renderer.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn();
         this.CustomSpinner = new pCHrFuEyawvY0Zd7NSU24Saj1l11PrSQzrNzFkFd669hKvz5rfUqTzMhKQmravnhYhjIJIepqEf0oPT3yVvTrte2HTJ8eRmbZez1();
      }

      this.ExitCode = new Od0zy1VzCwcnJYGsoqTccqZjRdVc13HsCnkfH7M3KwO8x3AiK7YVZlB4vz5TEFFaFGT6jmCAdPSY4WP0kLSC652FlLd7HT5FbxLZ();
      this.ExitCode
         .BatModClient(
            new HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa(
               0,
               E3m2US9F56PD3ZlmVNv7gXDceU4Nes1aICknJWdjpztCABQvNASpLHhLsp5RLrW9lExrxfRLXdovaEGTTSGrIOWwhzT6XU7OSOIO.BatModClient,
               lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6.BatModClient,
               3
            )
         );
      this.InstallationLogger();
      this.Downloader();
      this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB();
   }

   @Override
   public void BatModClient(
      nLK7ggr72JCMQAkNhlEZI1loJkpbLeNtbvky2vwkTBBwzYOIDypvHnBT7HlGQKJlFC4smVv14MzvvHNuiQ2ntsWFYuxyYaPA3iI8 var1
   ) {
      this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
   }

   private void bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ() {
      seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs var1 = this.BatModClient
         .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i();

      for (int var2 = 0; var2 < this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL.length; var2++) {
         this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL[var2] = var1.BatModClient(
            "minecraft:blocks/destroy_stage_" + var2
         );
      }
   }

   public void BatModClient() {
      if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
         )
       {
         if (UrNmlUXGAnk3T3zDPB4jhPHYOXqrbnL2RzezS8fnQTyVmBiiw1nYEIM87E6wRMeAtAlmz9WqIXIeOrnYGiNMOZLYiGFBtmQbNRSB.Button()
            == null) {
            UrNmlUXGAnk3T3zDPB4jhPHYOXqrbnL2RzezS8fnQTyVmBiiw1nYEIM87E6wRMeAtAlmz9WqIXIeOrnYGiNMOZLYiGFBtmQbNRSB.BatModClient();
         }

         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var1 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
            "shaders/post/entity_outline.json"
         );

         try {
            this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = new yAn3ZNwuV2FqZ0hD87bsEQIyaux98KqcoAjafFSKfeHh6SCSx9m36ApO0PEqh4u03MkMeeisbZoacd07oTTlecTSM8jKOt4Y46vp(
               this.BatModClient
                  .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
               this.BatModClient
                  .vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP(),
               this.BatModClient
                  .Button(),
               var1
            );
            this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
               .BatModClient(
                  this.BatModClient.ButtonAction,
                  this.BatModClient.Spinner
               );
            this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
               .BatModClient("final");
         } catch (IOException var3) {
            BatModProgressBar.warn("Failed to load shader: " + var1, var3);
            this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = null;
            this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = null;
         } catch (JsonSyntaxException var4) {
            BatModProgressBar.warn("Failed to load shader: " + var1, var4);
            this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = null;
            this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = null;
         }
      } else {
         this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = null;
         this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = null;
      }
   }

   public void Button() {
      if (this.CustomSpinner()) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 771, 0, 1
         );
         this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
            .BatModClient(
               this.BatModClient.ButtonAction,
               this.BatModClient.Spinner,
               false
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
      }
   }

   protected boolean CustomSpinner() {
      return !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2()
         ? this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr != null
            && this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj != null
            && this.BatModClient.BatModProgressBar
               != null
            && this.BatModClient
               .BatModProgressBar
               .e_()
            && this.BatModClient
               .InstallationLogger
               .AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I
               .ButtonAction()
         : false;
   }

   private void RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB() {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2 = var1.CustomSpinner();
      if (this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 != null) {
         this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            .CustomSpinner();
      }

      if (this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY >= 0) {
         net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Button(
            this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
         );
         this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = -1;
      }

      if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
         this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = new JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu(
            this.ExitCode
         );
         this.BatModClient(var2, -16.0F, true);
         var2.Checkbox();
         var2.CustomSpinner();
         this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            .BatModClient(
               var2.ProgressBar()
            );
      } else {
         this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.BatModClient(
            1
         );
         GL11.glNewList(this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY, 4864);
         this.BatModClient(var2, -16.0F, true);
         var1.Button();
         GL11.glEndList();
      }
   }

   private void Downloader() {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2 = var1.CustomSpinner();
      if (this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP != null) {
         this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            .CustomSpinner();
      }

      if (this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM >= 0) {
         net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Button(
            this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         );
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = -1;
      }

      if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
         this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = new JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu(
            this.ExitCode
         );
         this.BatModClient(var2, 16.0F, false);
         var2.Checkbox();
         var2.CustomSpinner();
         this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            .BatModClient(
               var2.ProgressBar()
            );
      } else {
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.BatModClient(
            1
         );
         GL11.glNewList(this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM, 4864);
         this.BatModClient(var2, 16.0F, false);
         var1.Button();
         GL11.glEndList();
      }
   }

   private void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1,
      float var2,
      boolean var3
   ) {
      boolean var4 = true;
      boolean var5 = true;
      var1.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Spinner
      );

      for (short var6 = -384; var6 <= 384; var6 += 64) {
         for (short var7 = -384; var7 <= 384; var7 += 64) {
            float var8 = var6;
            float var9 = var6 + 64;
            if (var3) {
               var9 = var6;
               var8 = var6 + 64;
            }

            var1.Button(var8, var2, var7)
               .Spinner();
            var1.Button(var9, var2, var7)
               .Spinner();
            var1.Button(var9, var2, var7 + 64)
               .Spinner();
            var1.Button(var8, var2, var7 + 64)
               .Spinner();
         }
      }
   }

   private void InstallationLogger() {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2 = var1.CustomSpinner();
      if (this.BatModJson != null) {
         this.BatModJson
            .CustomSpinner();
      }

      if (this.InstallationLogger >= 0) {
         net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.Button(
            this.InstallationLogger
         );
         this.InstallationLogger = -1;
      }

      if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
         this.BatModJson = new JuVYch7lf4S6UIMGIPmXKfd0sWU182o0NHHFU56EkyB2wv9qxn9yu208xDn91G9oFXWlk6d7J97APXK5PcfrrNhMQOT5efmiv3Pu(
            this.ExitCode
         );
         this.BatModClient(var2);
         var2.Checkbox();
         var2.CustomSpinner();
         this.BatModJson
            .BatModClient(
               var2.ProgressBar()
            );
      } else {
         this.InstallationLogger = net.minecraft.client.renderer.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee.BatModClient(
            1
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         GL11.glNewList(this.InstallationLogger, 4864);
         this.BatModClient(var2);
         var1.Button();
         GL11.glEndList();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      }
   }

   private void BatModClient(
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var1
   ) {
      Random var2 = new Random(10842L);
      var1.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Spinner
      );

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = var2.nextFloat() * 2.0F - 1.0F;
         double var6 = var2.nextFloat() * 2.0F - 1.0F;
         double var8 = var2.nextFloat() * 2.0F - 1.0F;
         double var10 = 0.15F + var2.nextFloat() * 0.1F;
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = 0.0;
               double var41 = ((var38 & 2) - 1) * var10;
               double var43 = ((var38 + 1 & 2) - 1) * var10;
               double var45 = 0.0;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var51 = var47 * var28 + 0.0 * var30;
               double var53 = 0.0 * var28 - var47 * var30;
               double var55 = var53 * var22 - var49 * var24;
               double var57 = var49 * var22 + var53 * var24;
               var1.Button(
                     var14 + var55, var16 + var51, var18 + var57
                  )
                  .Spinner();
            }
         }
      }
   }

   public void BatModClient(
      NteFd9HVJdwzXTrwPP9DzZdYpirUKP5pYzkC03lPx8N7W97p10Vq9iIcaWkKXAqVMB9lsyaG8A1eVjg3qfvn4o4eKR9hXeM56nBP var1
   ) {
      if (this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr != null) {
         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .Button(this);
      }

      this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = Double.MIN_VALUE;
      this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = Double.MIN_VALUE;
      this.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = Double.MIN_VALUE;
      this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = Integer.MIN_VALUE;
      this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = Integer.MIN_VALUE;
      this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = Integer.MIN_VALUE;
      this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         .BatModClient(var1);
      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var1;
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc()
         )
       {
         uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.BatModClient();
      }

      if (var1 != null) {
         var1.BatModClient(this);
         this.ButtonAction();
      }
   }

   public void ButtonAction() {
      if (this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr != null) {
         this.ButtonAction = true;
         fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.Downloader
            .Button(
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr()
            );
         fjTmmqSsZED0Quce5L2uiRkXlUvTxobqZQQLKtQCEfpkCpo2EBl8Znhs2ME7pKps4B0QFBco0DiLYL8M5rwIsjvXbiKu69mgXWo.InstallationLogger
            .Button(
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr()
            );
         net.minecraft.client.renderer.CustomSpinner.BatModClient();
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc()
            )
          {
            uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.BatModClient();
         }

         this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = this.BatModClient
            .InstallationLogger
            .CustomSpinner;
         this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH = this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11
            * 16;
         this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
            * this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH;
         boolean var1 = this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf;
         this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Checkbox();
         if (var1 && !this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
            this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = new net.minecraft.client.renderer.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn();
            this.CustomSpinner = new pCHrFuEyawvY0Zd7NSU24Saj1l11PrSQzrNzFkFd669hKvz5rfUqTzMhKQmravnhYhjIJIepqEf0oPT3yVvTrte2HTJ8eRmbZez1();
         } else if (!var1 && this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
            this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = new net.minecraft.client.renderer.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o();
            this.CustomSpinner = new el8Uhl2ReNONY1geHYSbSajnRMA9AMyScuoAQCSxuXcpDLX0xwR5UxryMeXDUQ8lY1tjs7ZGJkIuCjCBLNE5L6oMsUlOut8AxzKs();
         }

         if (var1 != this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
            this.InstallationLogger();
            this.Downloader();
            this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB();
         }

         if (this.Downloader != null) {
            this.Downloader
               .BatModClient();
         }

         this.Spinner();
         Set var3 = this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
         synchronized (this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB) {
            this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.clear();
         }

         this.Downloader = new net.minecraft.client.renderer.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv(
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
            this.BatModClient
               .InstallationLogger
               .CustomSpinner,
            this,
            this.CustomSpinner
         );
         if (this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr != null) {
            Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var6 = this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV();
            if (var6 != null) {
               this.Downloader
                  .BatModClient(
                     var6.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                     var6.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                  );
            }
         }

         this.GsonTypeAdapter = 2;
      }
   }

   protected void Spinner() {
      this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.clear();
      this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
         .Button();
   }

   public void BatModClient(int var1, int var2) {
      if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
         && this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj != null) {
         this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
            .BatModClient(var1, var2);
      }
   }

   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1,
      RlUfXhjsSb5XvbgQUgsn5Oe3NSkIsEEfUAVL1HgSOd8p1Sn6pNVdbttOXdYhInXTgIL0KLLFPwmww4MFSGJ8HQM6PW60tNoZCBe var2,
      float var3
   ) {
      int var4 = 0;
      if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv
         .Button()) {
         var4 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.CustomSpinner(
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv
         );
      }

      if (this.GsonTypeAdapter > 0) {
         if (var4 > 0) {
            return;
         }

         this.GsonTypeAdapter--;
      } else {
         double var5 = var1.ExitCode
            + (
                  var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                     - var1.ExitCode
               )
               * var3;
         double var7 = var1.BatModJson
            + (
                  var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                     - var1.BatModJson
               )
               * var3;
         double var9 = var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
            + (
                  var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                     - var1.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
               )
               * var3;
         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ExitCode
            .BatModClient("prepare");
         ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient
            .BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
               this.BatModClient
                  .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt(),
               this.BatModClient.ColorTextPane,
               this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
               var3
            );
         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            .BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
               this.BatModClient.ColorTextPane,
               this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
               this.BatModClient.ColorChooser,
               this.BatModClient.InstallationLogger,
               var3
            );
         if (var4 == 0) {
            this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = 0;
            this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = 0;
            this.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc = 0;
            this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE = 0;
         }

         Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var11 = this.BatModClient
            .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV();
         double var12 = var11.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
            + (
                  var11.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                     - var11.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
               )
               * var3;
         double var14 = var11.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
            + (
                  var11.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                     - var11.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
               )
               * var3;
         double var16 = var11.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            + (
                  var11.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                     - var11.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
               )
               * var3;
         ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.Button = var12;
         ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.CustomSpinner = var14;
         ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.ButtonAction = var16;
         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            .BatModClient(var12, var14, var16);
         this.BatModClient
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ColorChooser();
         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ExitCode
            .CustomSpinner("global");
         List var18 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .InstallationLogger();
         if (var4 == 0) {
            this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = var18.size();
         }

         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.InstallationLogger()
            && this.BatModClient
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ColorTextPane) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Downloader();
         }

         boolean var19 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
            .Button();
         boolean var20 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb
            .Button();

         for (int var21 = 0;
            var21
               < this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .ProgressBar
                  .size();
            var21++
         ) {
            Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var22 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ProgressBar
               .get(var21);
            if (!var19
               || uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                  var22,
                  uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH,
                  var4
               )) {
               this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02++;
               if (var22.BatModProgressBar(var5, var7, var9)) {
                  this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                     .BatModClient(var22, var3);
               }
            }
         }

         if (this.CustomSpinner()) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               519
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Downloader();
            this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
               .Checkbox();
            this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
               .BatModClient(false);
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ExitCode
               .CustomSpinner("entityOutlines");
            net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.BatModClient();
            this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               .CustomSpinner(true);

            for (int var37 = 0; var37 < var18.size(); var37++) {
               Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var39 = (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM)var18.get(
                  var37
               );
               if (!var19
                  || uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                     var39,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH,
                     var4
                  )) {
                  boolean var23 = this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV() instanceof B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R
                     && ((B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R)this.BatModClient
                           .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV())
                        .y3KqHzPVHj6VXlZV2YsOJkcBAwgUucIug8A693vpCaBLoEhK6NjumkjBg8U9s52ADy8BL2FSaShSZKK3XcG4aXtryW1Kzppujfim();
                  boolean var24 = var39.BatModProgressBar(var5, var7, var9)
                     && (
                        var39.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn
                           || var2.BatModClient(
                              var39.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5()
                           )
                           || var39.Downloader
                              == this.BatModClient.BatModProgressBar
                     )
                     && var39 instanceof EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u;
                  if ((
                        var39
                              != this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                           || this.BatModClient
                                 .InstallationLogger
                                 .jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                              != 0
                           || var23
                     )
                     && var24) {
                     this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                        .BatModClient(var39, var3);
                  }
               }
            }

            this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
               .CustomSpinner(false);
            net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.Button();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
               false
            );
            this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
               .BatModClient(var3);
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.TextField();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
               true
            );
            this.BatModClient
               .Button()
               .BatModClient(false);
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               515
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
         }

         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ExitCode
            .CustomSpinner("entities");
         boolean var38 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68();
         if (var38) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ();
         }

         Iterator var40 = this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W.iterator();
         boolean var41 = this.BatModClient
            .InstallationLogger
            .ColorChooser;
         this.BatModClient
            .InstallationLogger
            .ColorChooser = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb();

         while (var40.hasNext()) {
            net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var42 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var40.next();
            WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var25 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ProgressBar(
                  var42.BatModClient
                     .ColorChooser()
               );
            TVcUgaRmMSxV8nzp5N7epWp1tIz2OKuxgvhGopcjercOOCFnVjBmtpeEC2Qup9LmFAYEJM33T4NQAq1rFp4bWcnoAVlJ65CZPRO var26 = var25.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB()[var42.BatModClient
                  .ColorChooser()
                  .ColorChooser()
               / 16];
            if (!var26.isEmpty()) {
               for (Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var28 : var26) {
                  if (!var19
                     || uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                        var28,
                        uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH,
                        var4
                     )) {
                     boolean var29 = this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .BatModClient(var28, var2, var5, var7, var9)
                        || var28.Downloader
                           == this.BatModClient.BatModProgressBar;
                     if (var29) {
                        boolean var30 = this.BatModClient
                              .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV() instanceof B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R
                           ? ((B8VluaHYQkPrm0MSgTEiIG0moKrZyV3SVKON7lYumKjWCHtPeWFtSQWKdPmgKNhRe1stPLbU4GTATRWfN8OYB1phO1ALYKttKG1R)this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV())
                              .y3KqHzPVHj6VXlZV2YsOJkcBAwgUucIug8A693vpCaBLoEhK6NjumkjBg8U9s52ADy8BL2FSaShSZKK3XcG4aXtryW1Kzppujfim()
                           : false;
                        if (var28
                                 == this.BatModClient
                                    .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                              && this.BatModClient
                                    .InstallationLogger
                                    .jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                                 == 0
                              && !var30
                           || !(var28.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa < 0.0)
                              && !(var28.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa >= 256.0)
                              && !this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                                 .Checkbox(
                                    new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(var28)
                                 )) {
                           continue;
                        }

                        this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02++;
                        if (var28.getClass() == OvUujot6oh3kXdEZZ1wwlbipUHlxSTzK4EP9kbh2bTD3XSc9doloOdhbCd5bQj07VbsjrjitM3zasIJ7xZYJGjvKg3RuJjR31Se9.class) {
                           var28.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = 0.06;
                        }

                        this.Spinner = var28;
                        if (var38) {
                           shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
                              var28
                           );
                        }

                        this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .BatModClient(var28, var3);
                        this.Spinner = null;
                     }

                     if (!var29 && var28 instanceof X4vn6YippgloJmK4eXWFBTa0f9Nc0u8DonYvgy5VukUdSVIHq3P7AJ7bX5G7qzlhxl6zjx6DxbswWNwNYj3hZrk2QQombK9iIn6p) {
                        if (var38) {
                           shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
                              var28
                           );
                        }

                        this.BatModClient
                           .amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY()
                           .Button(var28, var3);
                     }
                  }
               }
            }
         }

         this.BatModClient
            .InstallationLogger
            .ColorChooser = var41;
         UuNRPdngxLJ1piSbtVWTy5d1r0yYnVPdrWVdJIzhO5AWQSs4oLD4MB0wnDcMfN6xGgAGeksJvSQysKaZzGku3I7UiwUCohf4THta var43 = ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient
            .BatModClient();
         if (var38) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt();
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV();
         }

         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ExitCode
            .CustomSpinner("blockentities");
         net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.Button();
         if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15
            .Button()) {
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
               ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15
            );
         }

         for (Object var46 : this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz) {
            net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var49 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var46;
            List var52 = var49.BatModClient
               .ProgressBar()
               .Button();
            if (!var52.isEmpty()) {
               for (gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var59 : var52) {
                  if (var20) {
                     if (!uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                        var59,
                        uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb,
                        var4
                     )) {
                        continue;
                     }

                     rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var31 = (rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT)uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
                        var59,
                        uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ
                     );
                     if (var31 != null && !var2.BatModClient(var31)) {
                        continue;
                     }
                  }

                  Class var63 = var59.getClass();
                  if (var63 == dhG69zFoSW1qJlp08LZptdfLxV5f5nrYnDe8DAxtqiygNZGlH57pbgM6COLtbpbDA10gV51ML6eNhmX0h5VTTe0KNZ98NrEJkgQr.class
                     && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                     )
                   {
                     jBb4iOy4W9C3gprH1KDK0WJXBox5IsCBRN7MdvIFV8k37cgHtwqw5spPpwei9zItAyFEbxftKtQCumw2TcwnhdJUQU1XGYqff3xm var32 = this.BatModClient
                        .BatModProgressBar;
                     double var33 = var59.BatModClient(
                        var32.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                        var32.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
                        var32.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                     );
                     if (var33 > 256.0) {
                        var43.TextField = false;
                     }
                  }

                  if (var38) {
                     shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
                        var59
                     );
                  }

                  ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient
                     .BatModClient(var59, var3, -1);
                  this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE++;
                  var43.TextField = true;
               }
            }
         }

         Set var47 = this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
         synchronized (this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB) {
            for (Object var53 : this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB) {
               if (var20) {
                  if (!uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                     var53,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb,
                     var4
                  )) {
                     continue;
                  }

                  rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var56 = (rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT)uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
                     var53,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ
                  );
                  if (var56 != null && !var2.BatModClient(var56)) {
                     continue;
                  }
               }

               Class var57 = var53.getClass();
               if (var57 == dhG69zFoSW1qJlp08LZptdfLxV5f5nrYnDe8DAxtqiygNZGlH57pbgM6COLtbpbDA10gV51ML6eNhmX0h5VTTe0KNZ98NrEJkgQr.class
                  && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  )
                {
                  jBb4iOy4W9C3gprH1KDK0WJXBox5IsCBRN7MdvIFV8k37cgHtwqw5spPpwei9zItAyFEbxftKtQCumw2TcwnhdJUQU1XGYqff3xm var60 = this.BatModClient
                     .BatModProgressBar;
                  double var64 = ((gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI)var53)
                     .BatModClient(
                        var60.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                        var60.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa,
                        var60.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                     );
                  if (var64 > 256.0) {
                     var43.TextField = false;
                  }
               }

               if (var38) {
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
                     (gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI)var53
                  );
               }

               ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient
                  .BatModClient(
                     (gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI)var53, var3, -1
                  );
               var43.TextField = true;
            }
         }

         if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO
            .Button()) {
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
               ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO,
               var4
            );
         }

         this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();

         for (Object var51 : this.Button.values()) {
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var54 = ((net.minecraft.client.renderer.InstallationLogger)var51)
               .BatModClient();
            gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var58 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(var54);
            if (var58 instanceof TlrXLJ3oNoTYiIUsNmzBRN3d4JvpelDrebTR42InvZArJlPETNc2dFuodNa3cbgUIssXmaJUgxcE7HbLOjpWNg2sPcUw25ecle16) {
               TlrXLJ3oNoTYiIUsNmzBRN3d4JvpelDrebTR42InvZArJlPETNc2dFuodNa3cbgUIssXmaJUgxcE7HbLOjpWNg2sPcUw25ecle16 var61 = (TlrXLJ3oNoTYiIUsNmzBRN3d4JvpelDrebTR42InvZArJlPETNc2dFuodNa3cbgUIssXmaJUgxcE7HbLOjpWNg2sPcUw25ecle16)var58;
               if (var61.BatModProgressBar != null) {
                  var54 = var54.BatModClient(
                     NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.Spinner
                  );
                  var58 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .BatModClient(var54);
               } else if (var61.Checkbox != null) {
                  var54 = var54.BatModClient(
                     NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.CustomSpinner
                  );
                  var58 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .BatModClient(var54);
               }
            }

            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var62 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .Button(var54)
               .CustomSpinner();
            boolean var65;
            if (var20) {
               var65 = false;
               if (var58 != null
                  && uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                     var58,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb,
                     var4
                  )
                  && uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                     var58,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf
                  )) {
                  rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var66 = (rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT)uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
                     var58,
                     uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ
                  );
                  if (var66 != null) {
                     var65 = var2.BatModClient(var66);
                  }
               }
            } else {
               var65 = var58 != null
                  && (
                     var62 instanceof tT1i9IilgIOKWllzPDqTytNsRTEXURyNxDbx2tbANhZGmlhvmkvMVBUbRFKvy04eqRDhgAHv3e8AHZyRNoIiCMLBenyGA1W1D4v2
                        || var62 instanceof Nj9RSVzbeiV6nT31SiZe0gz8xLP7vNlUCcgyLW4vzad33kVFxLHTVztbwfzMFekeRCm4SXgAwM00KdXTTGV1GB0DktUrcWpxX5qU
                        || var62 instanceof s0oLX1eZt7TFsiRyCpwn1iPgjLyg14p4L9wrULjpQCM48CvZizV6P16h0tf1BnjQWbjAd2SqNHXi11b71tdv4J7Tq07vAtiGpGy0
                        || var62 instanceof IdBu4qdbtKQxWQrR8E2qMgjz7f8Rqc9Qxo0f0vgAzf3KwzjPmfUJBv12NbjyWnjKw1vI3erakgAPHjLUiCdyVaqIwYjd4SXwvPq
                  );
            }

            if (var65) {
               if (var38) {
                  shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
                     var58
                  );
               }

               ySqnn3rMFjRw9JNsF7PHra7O7KEjUG7mQxCvdRfXV2S8n9x4OAdGir42U37tSxn9hNlfFKDbK7kgh2Wb8GZFNci6Dzjkhhkksdss.BatModClient
                  .BatModClient(
                     var58,
                     var3,
                     ((net.minecraft.client.renderer.InstallationLogger)var51)
                        .Button()
                  );
            }
         }

         this.ExitCode();
         this.BatModClient
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .BatModProgressBar();
         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            .Button();
      }
   }

   public int Checkbox() {
      int var1 = 0;
      if (this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ == null) {
         return 0;
      }

      CopyOnWriteArrayList var2 = Lists.newCopyOnWriteArrayList();
      var2.addAll(this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ);

      for (Object var4 : var2) {
         net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var5 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var4;
         if (var5 == null) {
            return 0;
         }

         if (var5.BatModClient == null) {
            return 0;
         }

         if (var5.BatModClient.Button
            == null) {
            return 0;
         }

         VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ var6 = var5.BatModClient
            .Button;
         if (var6
               != VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ.BatModClient
            && !var6.BatModClient()) {
            var1++;
         }
      }

      return var1;
   }

   public String ProgressBar() {
      int var1 = this.Downloader.Checkbox.length;
      int var2 = 0;

      for (Object var4 : this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ) {
         net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var5 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var4;
         VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ var6 = var5.BatModClient
            .Button;
         if (var6
               != VRSEfKxgOkKR81ksNQDxJf8BUx6f498JzG7JC0vK3m49YW5QnWu8ZYlgJqT84t1862o0GIwNFrN8yd74yU5Ye7qPTFwV8CzwprMJ.BatModClient
            && !var6.BatModClient()) {
            var2++;
         }
      }

      return String.format(
         "C: %d/%d %sD: %d, %s",
         var2,
         var1,
         this.BatModClient.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
            ? "(s) "
            : "",
         this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11,
         this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
            .BatModClient()
      );
   }

   public String BatModProgressBar() {
      return "E: "
         + this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02
         + "/"
         + this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv
         + ", B: "
         + this.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         + ", I: "
         + (
            this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv
               - this.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
               - this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02
         )
         + ", "
         + xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button();
   }

   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1,
      double var2,
      RlUfXhjsSb5XvbgQUgsn5Oe3NSkIsEEfUAVL1HgSOd8p1Sn6pNVdbttOXdYhInXTgIL0KLLFPwmww4MFSGJ8HQM6PW60tNoZCBe var4,
      int var5,
      boolean var6
   ) {
      if (this.BatModClient
            .InstallationLogger
            .CustomSpinner
         != this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11) {
         this.ButtonAction();
      }

      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ExitCode
         .BatModClient("camera");
      double var7 = var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
         - this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF;
      double var9 = var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         - this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb;
      double var11 = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
         - this.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee;
      if (this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
            != var1.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF
         || this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
            != var1.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C
         || this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
            != var1.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk
         || var7 * var7 + var9 * var9 + var11 * var11 > 16.0) {
         this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
         this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
         this.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
         this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = var1.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF;
         this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = var1.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C;
         this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = var1.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk;
         this.Downloader
            .BatModClient(
               var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
               var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            );
      }

      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc()
         )
       {
         uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.BatModClient(
            this
         );
      }

      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ExitCode
         .CustomSpinner("renderlistcamera");
      double var13 = var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         + (
               var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  - var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
            )
            * var2;
      double var15 = var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
         + (
               var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                  - var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
            )
            * var2;
      double var17 = var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
         + (
               var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                  - var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            )
            * var2;
      this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
         .BatModClient(var13, var15, var17);
      this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ExitCode
         .CustomSpinner("cull");
      if (this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ != null) {
         pzwfTHC6WoykLIkIIXsfVXxzHc3KNk8THxy6YTQPI0ffSEDhk7v4vDqzXHfedwEoM0tVvAgAF7mrtNE8nk9FZ43VN2TrG4HGy2Kb var19 = new pzwfTHC6WoykLIkIIXsfVXxzHc3KNk8THxy6YTQPI0ffSEDhk7v4vDqzXHfedwEoM0tVvAgAF7mrtNE8nk9FZ43VN2TrG4HGy2Kb(
            this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
         );
         var19.BatModClient(
            this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.BatModClient,
            this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.Button,
            this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.CustomSpinner
         );
         var4 = var19;
      }

      this.BatModClient
         .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         .CustomSpinner("culling");
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var35 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         var13, var15 + var1.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM(), var17
      );
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var20 = this.Downloader
         .BatModClient(var35);
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var21 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var13 / 16.0
            )
            * 16,
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var15 / 16.0
            )
            * 16,
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var17 / 16.0
            )
            * 16
      );
      this.ButtonAction = this.ButtonAction
         || !this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.isEmpty()
         || var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            != this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
         || var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            != this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
         || var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            != this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
         || var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
            != this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
         || var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
            != this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu;
      this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
      this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
      this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
      this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb;
      this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF;
      if (this.BatModClient
         .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .BatModClient) {
         this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
            + this.BatModClient
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .CustomSpinner;
         this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu
            + this.BatModClient
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .Button;
      }

      boolean var22 = this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ != null;
      PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.Checkbox
         .BatModClient();
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         )
       {
         this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = this.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk;
         this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W = this.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl;
         this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz = this.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I;
         if (!var22 && this.ButtonAction) {
            this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.clear();
            this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W.clear();
            this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.clear();
            nlqEypFdOGoYmgyo1KFsfxi6mUvkle307dxCoHeNXr37Mrv0BqNLmHx7kY3HAWhIYjUmbdCkRpCggQ3tOxqenXxQePvbU5VjeIs var23 = new nlqEypFdOGoYmgyo1KFsfxi6mUvkle307dxCoHeNXr37Mrv0BqNLmHx7kY3HAWhIYjUmbdCkRpCggQ3tOxqenXxQePvbU5VjeIs();
            Iterator var24 = shadersmod.client.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ.BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
               var2,
               var1,
               this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11,
               this.Downloader
            );

            while (var24.hasNext()) {
               KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var25 = (KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ)var24.next();
               if (var25 != null) {
                  var23.BatModClient(var25);
                  if (!var25.Button
                        .BatModClient()
                     || var25.IntegerSpinner()) {
                     this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
                        .add(var23.Button());
                  }

                  q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var26 = var25.ColorChooser();
                  if (Yr5kxkdTeKg2dm49FmVwlgadgGbgxaZxIEA5d4RJnyzs93soCvReysg7U536iQBZlrYPLVLPZqbBmyHNIBAtyiwjCXj2ab3SsjI1.BatModClient(
                     this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                        .ProgressBar(var26)
                  )) {
                     this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W
                        .add(var23.Button());
                  }

                  if (var25.ProgressBar()
                        .Button()
                        .size()
                     > 0) {
                     this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz
                        .add(var23.Button());
                  }
               }
            }
         }
      } else {
         this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = this.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1;
         this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W = this.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF;
         this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz = this.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C;
      }

      if (!var22
         && this.ButtonAction
         && !shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         )
       {
         this.ButtonAction = false;
         this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.clear();
         this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W.clear();
         this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.clear();
         this.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI.clear();
         Deque var36 = this.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI;
         boolean var38 = this.BatModClient.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee;
         if (var20 != null) {
            boolean var41 = false;
            net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var45 = new net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl(
               var20, (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)null, 0, null
            );
            Set var48 = SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj;
            if (var48.size() == 1) {
               Vector3f var50 = this.BatModClient(var1, var2);
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var29 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.BatModClient(
                     var50.x, var50.y, var50.z
                  )
                  .Spinner();
               var48.remove(var29);
            }

            if (var48.isEmpty()) {
               var41 = true;
            }

            if (var41 && !var6) {
               this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.add(var45);
            } else {
               if (var6
                  && this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .Button(var35)
                     .CustomSpinner()
                     .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()) {
                  var38 = false;
               }

               var20.BatModClient(var5);
               var36.add(var45);
            }
         } else {
            int var40 = var35.ColorChooser() > 0 ? 248 : 8;

            for (int var44 = -this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11;
               var44 <= this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11;
               var44++
            ) {
               for (int var27 = -this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11;
                  var27 <= this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11;
                  var27++
               ) {
                  KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var28 = this.Downloader
                     .BatModClient(
                        new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
                           (var44 << 4) + 8, var40, (var27 << 4) + 8
                        )
                     );
                  if (var28 != null
                     && var4.BatModClient(
                        var28.CustomSpinner
                     )) {
                     var28.BatModClient(var5);
                     var36.add(
                        new net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl(
                           var28, (NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn)null, 0, null
                        )
                     );
                  }
               }
            }
         }

         NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn[] var42 = NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn.ProgressBar;
         int var46 = var42.length;

         while (!var36.isEmpty()) {
            net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var49 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var36.poll();
            KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var51 = var49.BatModClient;
            NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var52 = var49.Button;
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var30 = var51.ColorChooser();
            if (!var51.Button
                  .BatModClient()
               || var51.IntegerSpinner()) {
               this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.add(var49);
            }

            if (Yr5kxkdTeKg2dm49FmVwlgadgGbgxaZxIEA5d4RJnyzs93soCvReysg7U536iQBZlrYPLVLPZqbBmyHNIBAtyiwjCXj2ab3SsjI1.BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .ProgressBar(var30)
            )) {
               this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W.add(var49);
            }

            if (var51.ProgressBar()
                  .Button()
                  .size()
               > 0) {
               this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.add(var49);
            }

            for (int var31 = 0; var31 < var46; var31++) {
               NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var32 = var42[var31];
               if ((
                     !var38
                        || !var49.CustomSpinner
                           .contains(var32.Spinner())
                  )
                  && (
                     !var38
                        || var52 == null
                        || var51.ProgressBar()
                           .BatModClient(
                              var52.Spinner(), var32
                           )
                  )) {
                  KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var33 = this.BatModClient(
                     var35, var51, var32
                  );
                  if (var33 != null
                     && var33.BatModClient(var5)
                     && var4.BatModClient(
                        var33.CustomSpinner
                     )) {
                     net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var34 = new net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl(
                        var33, var32, var49.ButtonAction + 1, null
                     );
                     var34.CustomSpinner
                        .addAll(var49.CustomSpinner);
                     var34.CustomSpinner.add(var32);
                     var36.add(var34);
                  }
               }
            }
         }
      }

      if (this.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3) {
         this.BatModClient(var13, var15, var17);
         this.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 = false;
      }

      PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.Checkbox
         .Button();
      if (shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         )
       {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE();
      } else {
         this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
            .Spinner();
         Set var37 = this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF;
         this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = Sets.newLinkedHashSet();
         Iterator var39 = this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.iterator();
         PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.Spinner
            .BatModClient();

         while (var39.hasNext()) {
            net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var43 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var39.next();
            KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var47 = var43.BatModClient;
            if (var47.IntegerSpinner() || var37.contains(var47)) {
               this.ButtonAction = true;
               if (this.BatModClient(
                  var21, var43.BatModClient
               )) {
                  if (!var47.TextField()) {
                     this.ProgressBar.add(var47);
                  } else {
                     this.BatModClient
                        .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                        .BatModClient("build near");
                     this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
                        .Button(var47);
                     var47.BatModClient(false);
                     this.BatModClient
                        .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                        .Button();
                  }
               } else {
                  this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.add(var47);
               }
            }
         }

         PYVSfnivtmqUso9TowOWG87ucf6g5t79vM2TAXkyOihpBUmSzFS27VdOi3xE3RxWEK0heY2qmQl5mgsfH5fVezJFaV5lMbqt9zV.Spinner
            .Button();
         this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.addAll(var37);
         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            .Button();
      }
   }

   private boolean BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var2
   ) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = var2.ColorChooser();
      return u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
               var1.BatModProgressBar()
                  - var3.BatModProgressBar()
            )
            > 16
         ? false
         : (
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                     var1.ColorChooser()
                        - var3.ColorChooser()
                  )
                  > 16
               ? false
               : u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                     var1.IntegerSpinner()
                        - var3.IntegerSpinner()
                  )
                  <= 16
         );
   }

   private Set ButtonAction(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      qpMiJccKir0zxp7RsQeI0MCcc8M3kXUDlH8b0FlczmxkrI4wltEJtWGUbgaiXmOBYmmmlaYHH2zCyqKnts4vdY1wMl11yip3ZMod var2 = new qpMiJccKir0zxp7RsQeI0MCcc8M3kXUDlH8b0FlczmxkrI4wltEJtWGUbgaiXmOBYmmmlaYHH2zCyqKnts4vdY1wMl11yip3ZMod();
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = new q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW(
         var1.BatModProgressBar() >> 4 << 4,
         var1.ColorChooser() >> 4 << 4,
         var1.IntegerSpinner() >> 4 << 4
      );
      WFM9Cm1dG5UM75egPVZKJjH3pNRWEk1nnNZXHR3nmOshD2xHlIeqhy8gYUsp6Jq8ZYaCBjgFr5iPawSvAOR4XvcV98SmSU6NECpj var4 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ProgressBar(var3);

      for (ylSfcWKRkKAdTzwagatDMI4oqlbFRATxQqPDJvnC4xsn2r5CgY7jERHfJfBxgspEAOCvnOSkRVNZgXroLW2VBLJuYJlwrHgVPIyS var6 : q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW.Button(
         var3, var3.BatModClient(15, 15, 15)
      )) {
         if (var4.CustomSpinner(var6)
            .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN()) {
            var2.BatModClient(var6);
         }
      }

      return var2.Button(var1);
   }

   private KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1,
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var2,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var3
   ) {
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var4 = var2.Button(
         var3
      );
      if (var4.ColorChooser() >= 0
         && var4.ColorChooser() < 256) {
         int var5 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var1.BatModProgressBar()
               - var4.BatModProgressBar()
         );
         int var6 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
            var1.IntegerSpinner()
               - var4.IntegerSpinner()
         );
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.InstallationLogger()
            )
          {
            if (var5 > this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
               || var6 > this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH) {
               return null;
            }
         } else {
            int var7 = var5 * var5 + var6 * var6;
            if (var7 > this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn) {
               return null;
            }
         }

         return this.Downloader
            .BatModClient(var4);
      } else {
         return null;
      }
   }

   private void BatModClient(double var1, double var3, double var5) {
      this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ = new uUTmRIKbOu9TOD1nBLMP0Z0Wm2iNHtObm1oAX6pm4TchMCTZIm3eGubVgwT4u0t0uBTkfPa0WbzT446iMk1GF29DGe5IdWWaIKb2();
      ((uUTmRIKbOu9TOD1nBLMP0Z0Wm2iNHtObm1oAX6pm4TchMCTZIm3eGubVgwT4u0t0uBTkfPa0WbzT446iMk1GF29DGe5IdWWaIKb2)this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ)
         .Button();
      gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd var7 = new gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd(
         this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ.CustomSpinner
      );
      var7.transpose();
      gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd var8 = new gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd(
         this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ.Button
      );
      var8.transpose();
      gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd var9 = new gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd();
      gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd.mul(var8, var7, var9);
      var9.invert();
      this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.BatModClient = var1;
      this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.Button = var3;
      this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV.CustomSpinner = var5;
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int var10 = 0; var10 < 8; var10++) {
         gw37Hm66UDk4uxz4m39uxobPgmk4V1Kmcb1spwiXKvo6FrY7U8JJdiGxQqRUWbNRoIIGKtq2V8y7D35s6eaZj6f3GnGOJbmMstBd.transform(
            var9,
            this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10],
            this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10]
         );
         this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].x = this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10]
               .x
            / this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].w;
         this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].y = this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10]
               .y
            / this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].w;
         this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].z = this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10]
               .z
            / this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].w;
         this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP[var10].w = 1.0F;
      }
   }

   protected Vector3f BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1, double var2
   ) {
      float var4 = (float)(
         var1.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
            + (
                  var1.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
                     - var1.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
               )
               * var2
      );
      float var5 = (float)(
         var1.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
            + (
                  var1.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
                     - var1.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
               )
               * var2
      );
      if (this.BatModClient
         .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .BatModClient) {
         var4 += this.BatModClient
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .CustomSpinner;
         var5 += this.BatModClient
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .Button;
      }

      if (AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.BatModJson()
            .InstallationLogger
            .jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
         == 2) {
         var4 += 180.0F;
      }

      float var6 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         -var5 * (float) (Math.PI / 180.0) - (float) Math.PI
      );
      float var7 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         -var5 * (float) (Math.PI / 180.0) - (float) Math.PI
      );
      float var8 = -u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
         -var4 * (float) (Math.PI / 180.0)
      );
      float var9 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
         -var4 * (float) (Math.PI / 180.0)
      );
      return new Vector3f(var7 * var8, var9, var6 * var8);
   }

   public int BatModClient(
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var1,
      double var2,
      int var4,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var5
   ) {
      net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.BatModClient();
      if (var1
         == ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi.ButtonAction
         )
       {
         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            .BatModClient("translucent_sort");
         double var6 = var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            - this.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj;
         double var8 = var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            - this.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY;
         double var10 = var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            - this.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9;
         if (var6 * var6 + var8 * var8 + var10 * var10 > 1.0) {
            this.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj = var5.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
            this.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY = var5.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
            this.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9 = var5.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
            int var12 = 0;
            Iterator var13 = this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.iterator();
            this.Checkbox.clear();

            while (var13.hasNext()) {
               net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl var14 = (net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)var13.next();
               if (var14.BatModClient
                     .Button
                     .ButtonAction(var1)
                  && var12++ < 15) {
                  this.Checkbox
                     .add(var14.BatModClient);
               }
            }
         }

         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            .Button();
      }

      this.BatModClient
         .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         .BatModClient("filterempty");
      int var15 = 0;
      boolean var7 = var1
         == ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi.ButtonAction;
      int var16 = var7 ? this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.size() - 1 : 0;
      int var9 = var7 ? -1 : this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.size();
      int var17 = var7 ? -1 : 1;

      for (int var11 = var16; var11 != var9; var11 += var17) {
         KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var18 = ((net.minecraft.client.renderer.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl)this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
               .get(var11))
            .BatModClient;
         if (!var18.ProgressBar()
            .Button(var1)) {
            var15++;
            this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
               .BatModClient(var18, var1);
         }
      }

      if (var15 == 0) {
         this.BatModClient
            .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            .Button();
         return var15;
      }

      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.InstallationLogger()
         && this.BatModClient
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ColorTextPane) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Downloader();
      }

      this.BatModClient
         .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         .CustomSpinner("render_" + var1);
      this.BatModClient(var1);
      this.BatModClient
         .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         .Button();
      return var15;
   }

   private void BatModClient(
      ketOqBRvbaV3Nohf97dopqEJvi13l48SKGHfjkInJMa6TwLQvT3SVR8akHfeVpPs7XYrLQ0Lp14HOVYpCHXuUGk90tvv0nuMweBi var1
   ) {
      this.BatModClient
         .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ColorChooser();
      if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Checkbox()
         )
       {
         GL11.glEnableClientState(32884);
         net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorTextPane(
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         );
         GL11.glEnableClientState(32888);
         net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorTextPane(
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
         );
         GL11.glEnableClientState(32888);
         net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorTextPane(
            net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         );
         GL11.glEnableClientState(32886);
      }

      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         )
       {
         shadersmod.client.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc.BatModClient(
            var1
         );
      }

      this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
         .BatModClient(var1);
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         )
       {
         shadersmod.client.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc.Button(
            var1
         );
      }

      if (net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.Checkbox()
         )
       {
         for (HwZRSIPMKdQ2lKwGAYEqC3YeosRsco0eCmpzdHDxNgUhmcGiOU3nENa5aQ73P7tzqxuY52HHAQ3agHR8ohqsdKQJivTi7XywLAYa var3 : EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.BatModClient
            .BatModProgressBar()) {
            lRwRkVk04lbVD3GKTAQRu2LB7ZyMv7Bju5Hr8sa1zemrDMXkNPG0iFVHRolDLxqnbguvyK7YQKi4oXRECzp0d9Is3ZgQwBMCNj6 var4 = var3.Button();
            int var5 = var3.ButtonAction();
            switch (net.minecraft.client.renderer.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I.BatModClient[var4.ordinal()]) {
               case 1:
                  GL11.glDisableClientState(32884);
                  break;
               case 2:
                  net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorTextPane(
                     net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                        + var5
                  );
                  GL11.glDisableClientState(32888);
                  net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.ColorTextPane(
                     net.minecraft.client.renderer.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                  );
                  break;
               case 3:
                  GL11.glDisableClientState(32886);
                  net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
            }
         }
      }

      this.BatModClient
         .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .BatModProgressBar();
   }

   private void BatModClient(Iterator var1) {
      while (var1.hasNext()) {
         net.minecraft.client.renderer.InstallationLogger var2 = (net.minecraft.client.renderer.InstallationLogger)var1.next();
         int var3 = var2.CustomSpinner();
         if (this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa - var3 > 400) {
            var1.remove();
         }
      }
   }

   public void ColorChooser() {
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         && Keyboard.isKeyDown(61)
         && Keyboard.isKeyDown(19)) {
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.CustomSpinner();
      }

      this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa++;
      if (this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa % 20 == 0) {
         this.BatModClient(
            this.Button.values().iterator()
         );
      }
   }

   private void RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM() {
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W()
         )
       {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Downloader();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 771, 1, 0
         );
         net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.BatModClient();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            false
         );
         this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            .BatModClient(
               ColorTextPane
            );
         net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
         net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2 = var1.CustomSpinner();

         for (int var3 = 0; var3 < 6; var3++) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
            if (var3 == 1) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
                  90.0F, 1.0F, 0.0F, 0.0F
               );
            }

            if (var3 == 2) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
                  -90.0F, 1.0F, 0.0F, 0.0F
               );
            }

            if (var3 == 3) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
                  180.0F, 1.0F, 0.0F, 0.0F
               );
            }

            if (var3 == 4) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
                  90.0F, 0.0F, 0.0F, 1.0F
               );
            }

            if (var3 == 5) {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
                  -90.0F, 0.0F, 0.0F, 1.0F
               );
            }

            var2.BatModClient(
               7,
               EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ColorChooser
            );
            var2.Button(-100.0, -100.0, -100.0)
               .BatModClient(0.0, 0.0)
               .Button(40, 40, 40, 255)
               .Spinner();
            var2.Button(-100.0, -100.0, 100.0)
               .BatModClient(0.0, 16.0)
               .Button(40, 40, 40, 255)
               .Spinner();
            var2.Button(100.0, -100.0, 100.0)
               .BatModClient(16.0, 16.0)
               .Button(40, 40, 40, 255)
               .Spinner();
            var2.Button(100.0, -100.0, -100.0)
               .BatModClient(16.0, 0.0)
               .Button(40, 40, 40, 255)
               .Spinner();
            var1.Button();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            true
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
      }
   }

   public void BatModClient(float var1, int var2) {
      if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0
         .Button()) {
         yMnigY3u7ccbWVr3u5h1dfMYS4RxHxDOh4ifymvT6atESWbEtdvSdDp453kq6kwCDocAVWDcHL3RafiPJ18zJFL075EAfM06vlgT var3 = this.BatModClient
            .Checkbox
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
         Object var4 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
            var3,
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0
         );
         if (var4 != null) {
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
               var4,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0,
               var1,
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
               this.BatModClient
            );
            return;
         }
      }

      if (this.BatModClient
            .Checkbox
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF()
         == 1) {
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM();
      } else if (this.BatModClient
         .Checkbox
         .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .ButtonAction()) {
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
         boolean var20 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz();
         }

         qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var21 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .BatModClient(
               this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV(),
               var1
            );
         var21 = lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.BatModClient(
            var21,
            this.BatModClient.Checkbox,
            this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
            this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                  .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
               + 1.0,
            this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
         );
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
               var21
            );
         }

         float var5 = (float)var21.BatModClient;
         float var6 = (float)var21.Button;
         float var7 = (float)var21.CustomSpinner;
         if (var2 != 2) {
            float var8 = (var5 * 30.0F + var6 * 59.0F + var7 * 11.0F) / 100.0F;
            float var9 = (var5 * 30.0F + var6 * 70.0F) / 100.0F;
            float var10 = (var5 * 30.0F + var7 * 70.0F) / 100.0F;
            var5 = var8;
            var6 = var9;
            var7 = var10;
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            var5, var6, var7
         );
         net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var23 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
         net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var24 = var23.CustomSpinner();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            false
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            var5, var6, var7
         );
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF();
         }

         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W()
            )
          {
            if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
               this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                  .BatModClient();
               GL11.glEnableClientState(32884);
               GL11.glVertexPointer(3, 5126, 12, 0L);
               this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                  .BatModClient(7);
               this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                  .Button();
               GL11.glDisableClientState(32884);
            } else {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain(
                  this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
               );
            }
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Downloader();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 771, 1, 0
         );
         net.minecraft.client.renderer.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH.BatModClient();
         float[] var25 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .CustomSpinner(var1),
               var1
            );
         if (var25 != null
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz()
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
            if (var20) {
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz();
            }

            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner(
               7425
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               90.0F, 1.0F, 0.0F, 0.0F
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                        this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .ButtonAction(var1)
                     )
                     < 0.0F
                  ? 180.0F
                  : 0.0F,
               0.0F,
               0.0F,
               1.0F
            );
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               90.0F, 0.0F, 0.0F, 1.0F
            );
            float var11 = var25[0];
            float var12 = var25[1];
            float var13 = var25[2];
            if (var2 != 2) {
               float var14 = (var11 * 30.0F + var12 * 59.0F + var13 * 11.0F) / 100.0F;
               float var15 = (var11 * 30.0F + var12 * 70.0F) / 100.0F;
               float var16 = (var11 * 30.0F + var13 * 70.0F) / 100.0F;
               var11 = var14;
               var12 = var15;
               var13 = var16;
            }

            var24.BatModClient(
               6,
               EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
            );
            var24.Button(0.0, 100.0, 0.0)
               .BatModClient(var11, var12, var13, var25[3])
               .Spinner();
            boolean var31 = true;

            for (int var34 = 0; var34 <= 16; var34++) {
               float var36 = var34 * (float) Math.PI * 2.0F / 16.0F;
               float var17 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.BatModClient(
                  var36
               );
               float var18 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Button(
                  var36
               );
               var24.Button(
                     (double)(var17 * 120.0F), (double)(var18 * 120.0F), (double)(-var18 * 40.0F * var25[3])
                  )
                  .BatModClient(var25[0], var25[1], var25[2], 0.0F)
                  .Spinner();
            }

            var23.Button();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner(
               7424
            );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 1, 1, 0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         float var26 = 1.0F
            - this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .IntegerSpinner(var1);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, var26
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            -90.0F, 0.0F, 1.0F, 0.0F
         );
         tbAdtjrVjTZnDNn67UBl9ovZNe5ulWEncmbDdjnupGrmQTMNmgLzPAIyD0xCV8FHIXTNfUaCKS8OEBoei8FbYSZSdtsBoi5hx2Ru.BatModClient(
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA,
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .CustomSpinner(var1),
            var26
         );
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ExitCode();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .CustomSpinner(var1)
               * 360.0F,
            1.0F,
            0.0F,
            0.0F
         );
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModJson();
         }

         float var27 = 30.0F;
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1()
            )
          {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  IntegerSpinner
               );
            var24.BatModClient(
               7,
               EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
            );
            var24.Button(-var27, 100.0, -var27)
               .BatModClient(0.0, 0.0)
               .Spinner();
            var24.Button(var27, 100.0, -var27)
               .BatModClient(1.0, 0.0)
               .Spinner();
            var24.Button(var27, 100.0, var27)
               .BatModClient(1.0, 1.0)
               .Spinner();
            var24.Button(-var27, 100.0, var27)
               .BatModClient(0.0, 1.0)
               .Spinner();
            var23.Button();
         }

         var27 = 20.0F;
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF()
            )
          {
            this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
               .BatModClient(
                  ColorChooser
               );
            int var29 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModInstallerMain();
            int var32 = var29 % 4;
            int var35 = var29 / 4 % 2;
            float var37 = (var32 + 0) / 4.0F;
            float var39 = (var35 + 0) / 2.0F;
            float var41 = (var32 + 1) / 4.0F;
            float var19 = (var35 + 1) / 2.0F;
            var24.BatModClient(
               7,
               EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
            );
            var24.Button(-var27, -100.0, var27)
               .BatModClient(var41, var19)
               .Spinner();
            var24.Button(var27, -100.0, var27)
               .BatModClient(var37, var19)
               .Spinner();
            var24.Button(var27, -100.0, -var27)
               .BatModClient(var37, var39)
               .Spinner();
            var24.Button(-var27, -100.0, -var27)
               .BatModClient(var41, var39)
               .Spinner();
            var23.Button();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz();
         }

         float var30 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .ProgressBar(var1)
            * var26;
         if (var30 > 0.0F
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk()
            && !tbAdtjrVjTZnDNn67UBl9ovZNe5ulWEncmbDdjnupGrmQTMNmgLzPAIyD0xCV8FHIXTNfUaCKS8OEBoei8FbYSZSdtsBoi5hx2Ru.BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            )) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               var30, var30, var30, var30
            );
            if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
               this.BatModJson
                  .BatModClient();
               GL11.glEnableClientState(32884);
               GL11.glVertexPointer(3, 5126, 12, 0L);
               this.BatModJson
                  .BatModClient(7);
               this.BatModJson
                  .Button();
               GL11.glDisableClientState(32884);
            } else {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain(
                  this.InstallationLogger
               );
            }
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            1.0F, 1.0F, 1.0F, 1.0F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            0.0F, 0.0F, 0.0F
         );
         double var33 = this.BatModClient
               .BatModProgressBar
               .ProgressBar(var1)
               .Button
            - this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
         if (var33 < 0.0) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
               0.0F, 12.0F, 0.0F
            );
            if (this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf) {
               this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  .BatModClient();
               GL11.glEnableClientState(32884);
               GL11.glVertexPointer(3, 5126, 12, 0L);
               this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  .BatModClient(7);
               this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  .Button();
               GL11.glDisableClientState(32884);
            } else {
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain(
                  this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
               );
            }

            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
            float var38 = 1.0F;
            float var40 = -((float)(var33 + 65.0));
            float var42 = -1.0F;
            var24.BatModClient(
               7,
               EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
            );
            var24.Button(-1.0, var40, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, var40, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, var40, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, var40, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, var40, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, var40, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, var40, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, var40, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(-1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, 1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var24.Button(1.0, -1.0, -1.0)
               .Button(0, 0, 0, 255)
               .Spinner();
            var23.Button();
         }

         if (this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ProgressBar()) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F
            );
         } else {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               var5, var6, var7
            );
         }

         if (this.BatModClient
               .InstallationLogger
               .CustomSpinner
            <= 4) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
               this.BatModClient
                  .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .ProgressBar,
               this.BatModClient
                  .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .BatModProgressBar,
               this.BatModClient
                  .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .ColorChooser
            );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.Button(
            0.0F, -((float)(var33 - 16.0)), 0.0F
         );
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W()
            )
          {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModInstallerMain(
               this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
            );
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
         if (var20) {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            true
         );
      }
   }

   public void Button(float var1, int var2) {
      if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa()
         )
       {
         if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u
            .Button()) {
            yMnigY3u7ccbWVr3u5h1dfMYS4RxHxDOh4ifymvT6atESWbEtdvSdDp453kq6kwCDocAVWDcHL3RafiPJ18zJFL075EAfM06vlgT var3 = this.BatModClient
               .Checkbox
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
            Object var4 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
               var3,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u
            );
            if (var4 != null) {
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.BatModClient(
                  var4,
                  uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0,
                  var1,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
                  this.BatModClient
               );
               return;
            }
         }

         if (this.BatModClient
            .Checkbox
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .ButtonAction()) {
            if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
               )
             {
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
            }

            if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8()
               )
             {
               this.CustomSpinner(var1, var2);
            } else {
               this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                  .BatModClient(
                     false, this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa, var1
                  );
               var1 = 0.0F;
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM();
               float var27 = (float)(
                  this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                        .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
                     + (
                           this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                              - this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
                        )
                        * var1
               );
               boolean var28 = true;
               boolean var5 = true;
               net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var6 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
               net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var7 = var6.CustomSpinner();
               this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                  .BatModClient(
                     TextField
                  );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
                  770, 771, 1, 0
               );
               if (this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                  .BatModClient()) {
                  this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                     .Button();
                  qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var8 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .Spinner(var1);
                  float var9 = (float)var8.BatModClient;
                  float var10 = (float)var8.Button;
                  float var11 = (float)var8.CustomSpinner;
                  if (var2 != 2) {
                     float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
                     float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
                     float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
                     var9 = var12;
                     var10 = var13;
                     var11 = var14;
                  }

                  float var29 = 4.8828125E-4F;
                  double var30 = this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa + var1;
                  double var15 = this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                        .ExitCode
                     + (
                           this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                              - this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .ExitCode
                        )
                        * var1
                     + var30 * 0.03F;
                  double var17 = this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                        .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                     + (
                           this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                              - this.BatModClient
                                 .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                                 .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                        )
                        * var1;
                  int var19 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var15 / 2048.0
                  );
                  int var20 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
                     var17 / 2048.0
                  );
                  var15 -= var19 * 2048;
                  var17 -= var20 * 2048;
                  float var21 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                        .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                        .Checkbox()
                     - var27
                     + 0.33F;
                  var21 += this.BatModClient
                        .InstallationLogger
                        .hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
                     * 128.0F;
                  float var22 = (float)(var15 * 4.8828125E-4);
                  float var23 = (float)(var17 * 4.8828125E-4);
                  var7.BatModClient(
                     7,
                     EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ColorChooser
                  );

                  for (short var24 = -256; var24 < 256; var24 += 32) {
                     for (short var25 = -256; var25 < 256; var25 += 32) {
                        var7.Button(var24 + 0, var21, var25 + 32)
                           .BatModClient(
                              (var24 + 0) * 4.8828125E-4F + var22, (var25 + 32) * 4.8828125E-4F + var23
                           )
                           .BatModClient(var9, var10, var11, 0.8F)
                           .Spinner();
                        var7.Button(var24 + 32, var21, var25 + 32)
                           .BatModClient(
                              (var24 + 32) * 4.8828125E-4F + var22, (var25 + 32) * 4.8828125E-4F + var23
                           )
                           .BatModClient(var9, var10, var11, 0.8F)
                           .Spinner();
                        var7.Button(var24 + 32, var21, var25 + 0)
                           .BatModClient(
                              (var24 + 32) * 4.8828125E-4F + var22, (var25 + 0) * 4.8828125E-4F + var23
                           )
                           .BatModClient(var9, var10, var11, 0.8F)
                           .Spinner();
                        var7.Button(var24 + 0, var21, var25 + 0)
                           .BatModClient(
                              (var24 + 0) * 4.8828125E-4F + var22, (var25 + 0) * 4.8828125E-4F + var23
                           )
                           .BatModClient(var9, var10, var11, 0.8F)
                           .Spinner();
                     }
                  }

                  var6.Button();
                  this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                     .CustomSpinner();
               }

               this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                  .ButtonAction();
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
                  1.0F, 1.0F, 1.0F, 1.0F
               );
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
               net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.InstallationLogger();
            }

            if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
               )
             {
               shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj();
            }
         }
      }
   }

   public boolean BatModClient(
      double var1, double var3, double var5, float var7
   ) {
      return false;
   }

   private void CustomSpinner(float var1, int var2) {
      this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
         .BatModClient(
            true, this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa, var1
         );
      var1 = 0.0F;
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM();
      float var3 = (float)(
         this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
            + (
                  this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                        .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                     - this.BatModClient
                        .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                        .zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
               )
               * var1
      );
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var4 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var5 = var4.CustomSpinner();
      float var6 = 12.0F;
      float var7 = 4.0F;
      double var8 = this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa + var1;
      double var10 = (
            this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                  .ExitCode
               + (
                     this.BatModClient
                           .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                           .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                        - this.BatModClient
                           .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                           .ExitCode
                  )
                  * var1
               + var8 * 0.03F
         )
         / 12.0;
      double var12 = (
               this.BatModClient
                     .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                     .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                  + (
                        this.BatModClient
                              .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                              .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                           - this.BatModClient
                              .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                              .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                     )
                     * var1
            )
            / 12.0
         + 0.33F;
      float var14 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .Checkbox()
         - var3
         + 0.33F;
      var14 += this.BatModClient
            .InstallationLogger
            .hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
         * 128.0F;
      int var15 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var10 / 2048.0
      );
      int var16 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
         var12 / 2048.0
      );
      var10 -= var15 * 2048;
      var12 -= var16 * 2048;
      this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         .BatModClient(
            TextField
         );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         770, 771, 1, 0
      );
      qBIxC0AeCV9CVk1xko5Fd3619M30uxk84gK7ODtvoVZLg61w7Dg9edsCfVS3NGSZ1H2yJqQahNe93sMnJ3IwzcwzWHm14IwRhSuD var17 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .Spinner(var1);
      float var18 = (float)var17.BatModClient;
      float var19 = (float)var17.Button;
      float var20 = (float)var17.CustomSpinner;
      if (var2 != 2) {
         float var21 = (var18 * 30.0F + var19 * 59.0F + var20 * 11.0F) / 100.0F;
         float var22 = (var18 * 30.0F + var19 * 70.0F) / 100.0F;
         float var23 = (var18 * 30.0F + var20 * 70.0F) / 100.0F;
         var18 = var21;
         var19 = var22;
         var20 = var23;
      }

      float var49 = var18 * 0.9F;
      float var50 = var19 * 0.9F;
      float var51 = var20 * 0.9F;
      float var24 = var18 * 0.7F;
      float var25 = var19 * 0.7F;
      float var26 = var20 * 0.7F;
      float var27 = var18 * 0.8F;
      float var28 = var19 * 0.8F;
      float var29 = var20 * 0.8F;
      float var30 = 0.00390625F;
      float var31 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var10
         )
         * 0.00390625F;
      float var32 = u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
            var12
         )
         * 0.00390625F;
      float var33 = (float)(
         var10
            - u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var10
            )
      );
      float var34 = (float)(
         var12
            - u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var12
            )
      );
      boolean var35 = true;
      boolean var36 = true;
      float var37 = 9.765625E-4F;
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         12.0F, 1.0F, 12.0F
      );

      for (int var38 = 0; var38 < 2; var38++) {
         if (var38 == 0) {
            net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
               false, false, false, false
            );
         } else {
            switch (var2) {
               case 0:
                  net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
                     false, true, true, true
                  );
                  break;
               case 1:
                  net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
                     true, false, false, true
                  );
                  break;
               case 2:
                  net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
                     true, true, true, true
                  );
            }
         }

         this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
            .ButtonAction();
      }

      if (this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
         .BatModClient()) {
         this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
            .Button();

         for (int var52 = -3; var52 <= 4; var52++) {
            for (int var39 = -3; var39 <= 4; var39++) {
               var5.BatModClient(
                  7,
                  EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ColorTextPane
               );
               float var40 = var52 * 8;
               float var41 = var39 * 8;
               float var42 = var40 - var33;
               float var43 = var41 - var34;
               if (var14 > -5.0F) {
                  var5.Button(
                        (double)(var42 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + 8.0F)
                     )
                     .BatModClient(
                        (var40 + 0.0F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var24, var25, var26, 0.8F)
                     .CustomSpinner(0.0F, -1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 8.0F), (double)(var14 + 0.0F), (double)(var43 + 8.0F)
                     )
                     .BatModClient(
                        (var40 + 8.0F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var24, var25, var26, 0.8F)
                     .CustomSpinner(0.0F, -1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 8.0F), (double)(var14 + 0.0F), (double)(var43 + 0.0F)
                     )
                     .BatModClient(
                        (var40 + 8.0F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var24, var25, var26, 0.8F)
                     .CustomSpinner(0.0F, -1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + 0.0F)
                     )
                     .BatModClient(
                        (var40 + 0.0F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var24, var25, var26, 0.8F)
                     .CustomSpinner(0.0F, -1.0F, 0.0F)
                     .Spinner();
               }

               if (var14 <= 5.0F) {
                  var5.Button(
                        (double)(var42 + 0.0F), (double)(var14 + 4.0F - 9.765625E-4F), (double)(var43 + 8.0F)
                     )
                     .BatModClient(
                        (var40 + 0.0F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var18, var19, var20, 0.8F)
                     .CustomSpinner(0.0F, 1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 8.0F), (double)(var14 + 4.0F - 9.765625E-4F), (double)(var43 + 8.0F)
                     )
                     .BatModClient(
                        (var40 + 8.0F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var18, var19, var20, 0.8F)
                     .CustomSpinner(0.0F, 1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 8.0F), (double)(var14 + 4.0F - 9.765625E-4F), (double)(var43 + 0.0F)
                     )
                     .BatModClient(
                        (var40 + 8.0F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var18, var19, var20, 0.8F)
                     .CustomSpinner(0.0F, 1.0F, 0.0F)
                     .Spinner();
                  var5.Button(
                        (double)(var42 + 0.0F), (double)(var14 + 4.0F - 9.765625E-4F), (double)(var43 + 0.0F)
                     )
                     .BatModClient(
                        (var40 + 0.0F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                     )
                     .BatModClient(var18, var19, var20, 0.8F)
                     .CustomSpinner(0.0F, 1.0F, 0.0F)
                     .Spinner();
               }

               if (var52 > -1) {
                  for (int var44 = 0; var44 < 8; var44++) {
                     var5.Button(
                           (double)(var42 + var44 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + 8.0F)
                        )
                        .BatModClient(
                           (var40 + var44 + 0.5F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(-1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var44 + 0.0F), (double)(var14 + 4.0F), (double)(var43 + 8.0F)
                        )
                        .BatModClient(
                           (var40 + var44 + 0.5F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(-1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var44 + 0.0F), (double)(var14 + 4.0F), (double)(var43 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + var44 + 0.5F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(-1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var44 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + var44 + 0.5F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(-1.0F, 0.0F, 0.0F)
                        .Spinner();
                  }
               }

               if (var52 <= 1) {
                  for (int var53 = 0; var53 < 8; var53++) {
                     var5.Button(
                           (double)(var42 + var53 + 1.0F - 9.765625E-4F), (double)(var14 + 0.0F), (double)(var43 + 8.0F)
                        )
                        .BatModClient(
                           (var40 + var53 + 0.5F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var53 + 1.0F - 9.765625E-4F), (double)(var14 + 4.0F), (double)(var43 + 8.0F)
                        )
                        .BatModClient(
                           (var40 + var53 + 0.5F) * 0.00390625F + var31, (var41 + 8.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var53 + 1.0F - 9.765625E-4F), (double)(var14 + 4.0F), (double)(var43 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + var53 + 0.5F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(1.0F, 0.0F, 0.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + var53 + 1.0F - 9.765625E-4F), (double)(var14 + 0.0F), (double)(var43 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + var53 + 0.5F) * 0.00390625F + var31, (var41 + 0.0F) * 0.00390625F + var32
                        )
                        .BatModClient(var49, var50, var51, 0.8F)
                        .CustomSpinner(1.0F, 0.0F, 0.0F)
                        .Spinner();
                  }
               }

               if (var39 > -1) {
                  for (int var54 = 0; var54 < 8; var54++) {
                     var5.Button(
                           (double)(var42 + 0.0F), (double)(var14 + 4.0F), (double)(var43 + var54 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + 0.0F) * 0.00390625F + var31, (var41 + var54 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, -1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 8.0F), (double)(var14 + 4.0F), (double)(var43 + var54 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + 8.0F) * 0.00390625F + var31, (var41 + var54 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, -1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 8.0F), (double)(var14 + 0.0F), (double)(var43 + var54 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + 8.0F) * 0.00390625F + var31, (var41 + var54 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, -1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + var54 + 0.0F)
                        )
                        .BatModClient(
                           (var40 + 0.0F) * 0.00390625F + var31, (var41 + var54 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, -1.0F)
                        .Spinner();
                  }
               }

               if (var39 <= 1) {
                  for (int var55 = 0; var55 < 8; var55++) {
                     var5.Button(
                           (double)(var42 + 0.0F), (double)(var14 + 4.0F), (double)(var43 + var55 + 1.0F - 9.765625E-4F)
                        )
                        .BatModClient(
                           (var40 + 0.0F) * 0.00390625F + var31, (var41 + var55 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, 1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 8.0F), (double)(var14 + 4.0F), (double)(var43 + var55 + 1.0F - 9.765625E-4F)
                        )
                        .BatModClient(
                           (var40 + 8.0F) * 0.00390625F + var31, (var41 + var55 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, 1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 8.0F), (double)(var14 + 0.0F), (double)(var43 + var55 + 1.0F - 9.765625E-4F)
                        )
                        .BatModClient(
                           (var40 + 8.0F) * 0.00390625F + var31, (var41 + var55 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, 1.0F)
                        .Spinner();
                     var5.Button(
                           (double)(var42 + 0.0F), (double)(var14 + 0.0F), (double)(var43 + var55 + 1.0F - 9.765625E-4F)
                        )
                        .BatModClient(
                           (var40 + 0.0F) * 0.00390625F + var31, (var41 + var55 + 0.5F) * 0.00390625F + var32
                        )
                        .BatModClient(var27, var28, var29, 0.8F)
                        .CustomSpinner(0.0F, 0.0F, 1.0F)
                        .Spinner();
                  }
               }

               var4.Button();
            }
         }

         this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
            .CustomSpinner();
      }

      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
         1.0F, 1.0F, 1.0F, 1.0F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.InstallationLogger();
   }

   public void BatModClient(long var1) {
      var1 = (long)(var1 + 1.0E8);
      this.ButtonAction = this.ButtonAction
         | this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
            .BatModClient(var1);
      if (this.ProgressBar.size() > 0) {
         Iterator var3 = this.ProgressBar.iterator();

         while (var3.hasNext()) {
            KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var4 = (KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ)var3.next();
            if (!this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
               .BatModClient(var4)) {
               break;
            }

            var4.BatModClient(false);
            var3.remove();
            this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.remove(var4);
            this.Checkbox.remove(var4);
         }
      }

      if (this.Checkbox.size() > 0) {
         Iterator var9 = this.Checkbox.iterator();
         if (var9.hasNext()) {
            KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var11 = (KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ)var9.next();
            if (this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
               .CustomSpinner(var11)) {
               var9.remove();
            }
         }
      }

      int var10 = 0;
      int var12 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();
      int var5 = var12 * 2;
      Iterator var6 = this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF.iterator();

      while (var6.hasNext()) {
         KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var7 = (KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ)var6.next();
         if (!this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
            .BatModClient(var7)) {
            break;
         }

         var7.BatModClient(false);
         var6.remove();
         if (var7.ProgressBar()
               .BatModClient()
            && var12 < var5) {
            var12++;
         }

         if (++var10 >= var12) {
            break;
         }
      }
   }

   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1, float var2
   ) {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var3 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var4 = var3.CustomSpinner();
      iL9DMubSJAcTZxqaOwpybtlSRVLtmD9ZvxkTuVp126kpYWECDLGjfieR0jHXh8lhKYz1pOKOXVv54oy1hzwdxFmcVWt5UJgpSRT var5 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         .dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11();
      double var6 = this.BatModClient
            .InstallationLogger
            .CustomSpinner
         * 16;
      if (var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            >= var5.Checkbox() - var6
         || var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            <= var5.ButtonAction() + var6
         || var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            >= var5.ProgressBar() - var6
         || var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            <= var5.Spinner() + var6) {
         double var8 = 1.0 - var5.BatModClient(var1) / var6;
         var8 = Math.pow(var8, 4.0);
         double var10 = var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
            + (
                  var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                     - var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
               )
               * var2;
         double var12 = var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
            + (
                  var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                     - var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
               )
               * var2;
         double var14 = var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            + (
                  var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                     - var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
               )
               * var2;
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 1, 1, 0
         );
         this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            .BatModClient(
               BatModInstallerMain
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            false
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
         int var16 = var5.CustomSpinner()
            .BatModClient();
         float var17 = (var16 >> 16 & 0xFF) / 255.0F;
         float var18 = (var16 >> 8 & 0xFF) / 255.0F;
         float var19 = (var16 & 0xFF) / 255.0F;
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            var17, var18, var19, (float)var8
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            -3.0F, -3.0F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            516, 0.1F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM();
         float var20 = (float)(
               AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee()
                  % 3000L
            )
            / 3000.0F;
         float var21 = 0.0F;
         float var22 = 0.0F;
         float var23 = 128.0F;
         var4.BatModClient(
            7,
            EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.ProgressBar
         );
         var4.CustomSpinner(-var10, -var12, -var14);
         double var24 = Math.max(
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var14 - var6
            ),
            var5.Spinner()
         );
         double var26 = Math.min(
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox(
               var14 + var6
            ),
            var5.ProgressBar()
         );
         if (var10 > var5.Checkbox() - var6) {
            float var28 = 0.0F;

            for (double var29 = var24; var29 < var26; var28 += 0.5F) {
               double var31 = Math.min(1.0, var26 - var29);
               float var33 = (float)var31 * 0.5F;
               var4.Button(
                     var5.Checkbox(), 256.0, var29
                  )
                  .BatModClient(var20 + var28, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var5.Checkbox(), 256.0, var29 + var31
                  )
                  .BatModClient(var20 + var33 + var28, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var5.Checkbox(), 0.0, var29 + var31
                  )
                  .BatModClient(var20 + var33 + var28, var20 + 128.0F)
                  .Spinner();
               var4.Button(
                     var5.Checkbox(), 0.0, var29
                  )
                  .BatModClient(var20 + var28, var20 + 128.0F)
                  .Spinner();
               var29++;
            }
         }

         if (var10 < var5.ButtonAction() + var6) {
            float var37 = 0.0F;

            for (double var40 = var24; var40 < var26; var37 += 0.5F) {
               double var43 = Math.min(1.0, var26 - var40);
               float var46 = (float)var43 * 0.5F;
               var4.Button(
                     var5.ButtonAction(), 256.0, var40
                  )
                  .BatModClient(var20 + var37, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var5.ButtonAction(), 256.0, var40 + var43
                  )
                  .BatModClient(var20 + var46 + var37, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var5.ButtonAction(), 0.0, var40 + var43
                  )
                  .BatModClient(var20 + var46 + var37, var20 + 128.0F)
                  .Spinner();
               var4.Button(
                     var5.ButtonAction(), 0.0, var40
                  )
                  .BatModClient(var20 + var37, var20 + 128.0F)
                  .Spinner();
               var40++;
            }
         }

         var24 = Math.max(
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.CustomSpinner(
               var10 - var6
            ),
            var5.ButtonAction()
         );
         var26 = Math.min(
            u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox(
               var10 + var6
            ),
            var5.Checkbox()
         );
         if (var14 > var5.ProgressBar() - var6) {
            float var38 = 0.0F;

            for (double var41 = var24; var41 < var26; var38 += 0.5F) {
               double var44 = Math.min(1.0, var26 - var41);
               float var47 = (float)var44 * 0.5F;
               var4.Button(
                     var41, 256.0, var5.ProgressBar()
                  )
                  .BatModClient(var20 + var38, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var41 + var44, 256.0, var5.ProgressBar()
                  )
                  .BatModClient(var20 + var47 + var38, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var41 + var44, 0.0, var5.ProgressBar()
                  )
                  .BatModClient(var20 + var47 + var38, var20 + 128.0F)
                  .Spinner();
               var4.Button(
                     var41, 0.0, var5.ProgressBar()
                  )
                  .BatModClient(var20 + var38, var20 + 128.0F)
                  .Spinner();
               var41++;
            }
         }

         if (var14 < var5.Spinner() + var6) {
            float var39 = 0.0F;

            for (double var42 = var24; var42 < var26; var39 += 0.5F) {
               double var45 = Math.min(1.0, var26 - var42);
               float var48 = (float)var45 * 0.5F;
               var4.Button(
                     var42, 256.0, var5.Spinner()
                  )
                  .BatModClient(var20 + var39, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var42 + var45, 256.0, var5.Spinner()
                  )
                  .BatModClient(var20 + var48 + var39, var20 + 0.0F)
                  .Spinner();
               var4.Button(
                     var42 + var45, 0.0, var5.Spinner()
                  )
                  .BatModClient(var20 + var48 + var39, var20 + 128.0F)
                  .Spinner();
               var4.Button(
                     var42, 0.0, var5.Spinner()
                  )
                  .BatModClient(var20 + var39, var20 + 128.0F)
                  .Spinner();
               var42++;
            }
         }

         var3.Button();
         var4.CustomSpinner(0.0, 0.0, 0.0);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.InstallationLogger();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            0.0F, 0.0F
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ExitCode();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            true
         );
      }
   }

   private void K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY() {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         774, 768, 1, 0
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
         1.0F, 1.0F, 1.0F, 0.5F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         -3.0F, -3.0F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         516, 0.1F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m();
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         )
       {
         shadersmod.client.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc.ProgressBar();
      }
   }

   private void ExitCode() {
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ColorChooser();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         0.0F, 0.0F
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.ExitCode();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.IntegerSpinner();
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
         true
      );
      net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl();
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
         )
       {
         shadersmod.client.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc.BatModProgressBar();
      }
   }

   public void BatModClient(
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1,
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2,
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var3,
      float var4
   ) {
      double var5 = var3.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         + (
               var3.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  - var3.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
            )
            * var4;
      double var7 = var3.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
         + (
               var3.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                  - var3.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
            )
            * var4;
      double var9 = var3.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
         + (
               var3.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                  - var3.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
            )
            * var4;
      if (!this.Button.isEmpty()) {
         this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
            .BatModClient(
               seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Button
            );
         this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY();
         var2.BatModClient(
            7,
            EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.BatModClient
         );
         var2.CustomSpinner(-var5, -var7, -var9);
         var2.ButtonAction();
         Iterator var11 = this.Button.values().iterator();

         while (var11.hasNext()) {
            net.minecraft.client.renderer.InstallationLogger var12 = (net.minecraft.client.renderer.InstallationLogger)var11.next();
            q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var13 = var12.BatModClient();
            double var14 = var13.BatModProgressBar() - var5;
            double var16 = var13.ColorChooser() - var7;
            double var18 = var13.IntegerSpinner() - var9;
            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var20 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .Button(var13)
               .CustomSpinner();
            boolean var21;
            if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf
               .Button()) {
               boolean var22 = var20 instanceof tT1i9IilgIOKWllzPDqTytNsRTEXURyNxDbx2tbANhZGmlhvmkvMVBUbRFKvy04eqRDhgAHv3e8AHZyRNoIiCMLBenyGA1W1D4v2
                  || var20 instanceof Nj9RSVzbeiV6nT31SiZe0gz8xLP7vNlUCcgyLW4vzad33kVFxLHTVztbwfzMFekeRCm4SXgAwM00KdXTTGV1GB0DktUrcWpxX5qU
                  || var20 instanceof s0oLX1eZt7TFsiRyCpwn1iPgjLyg14p4L9wrULjpQCM48CvZizV6P16h0tf1BnjQWbjAd2SqNHXi11b71tdv4J7Tq07vAtiGpGy0
                  || var20 instanceof IdBu4qdbtKQxWQrR8E2qMgjz7f8Rqc9Qxo0f0vgAzf3KwzjPmfUJBv12NbjyWnjKw1vI3erakgAPHjLUiCdyVaqIwYjd4SXwvPq;
               if (!var22) {
                  gtGE6LocuFDdpGo7Ztit0jDTALhhsciqopFJRTnM4jMDQKQo2BnUicuyc16m8NUxtZTHbiL2EWn9Ed9RfL00fyp5LkUoYqAiVOVI var23 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .BatModClient(var13);
                  if (var23 != null) {
                     var22 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
                        var23,
                        uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf
                     );
                  }
               }

               var21 = !var22;
            } else {
               var21 = !(var20 instanceof tT1i9IilgIOKWllzPDqTytNsRTEXURyNxDbx2tbANhZGmlhvmkvMVBUbRFKvy04eqRDhgAHv3e8AHZyRNoIiCMLBenyGA1W1D4v2)
                  && !(var20 instanceof Nj9RSVzbeiV6nT31SiZe0gz8xLP7vNlUCcgyLW4vzad33kVFxLHTVztbwfzMFekeRCm4SXgAwM00KdXTTGV1GB0DktUrcWpxX5qU)
                  && !(var20 instanceof s0oLX1eZt7TFsiRyCpwn1iPgjLyg14p4L9wrULjpQCM48CvZizV6P16h0tf1BnjQWbjAd2SqNHXi11b71tdv4J7Tq07vAtiGpGy0)
                  && !(var20 instanceof IdBu4qdbtKQxWQrR8E2qMgjz7f8Rqc9Qxo0f0vgAzf3KwzjPmfUJBv12NbjyWnjKw1vI3erakgAPHjLUiCdyVaqIwYjd4SXwvPq);
            }

            if (var21) {
               if (var14 * var14 + var16 * var16 + var18 * var18 > 1024.0) {
                  var11.remove();
               } else {
                  jfbpd0kp1QEJJMd5cKOo0MgyHaqrgeaYoTLTse3y0ldrAiXTN7OrPJfu5yBfixhCqmdWDYWOZidiavQVW5Qe7WjmXy5eN8CC8fSS var26 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .Button(var13);
                  if (var26.CustomSpinner()
                        .Checkbox()
                     != wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
                     )
                   {
                     int var27 = var12.Button();
                     NbxJeOA4v8pDaO69APzkLeftsiXkfAtBjBW9A3s5xsRgujGLKiBHV37kJo2pYS96PpIDxkLlzuqYo9LIMJKydwA0cLB8mUiHsEtD var24 = this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL[var27];
                     net.minecraft.client.renderer.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ var25 = this.BatModClient
                        .SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj();
                     var25.BatModClient(
                        var26, var13, var24, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     );
                  }
               }
            }
         }

         var1.Button();
         var2.CustomSpinner(0.0, 0.0, 0.0);
         this.ExitCode();
      }
   }

   public void BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      tr5q0GOmD0yw0kez9WIWiwusnJR8KXYXx5G1VkLWqLsRMTT9JhhAeVCOzwkc1jYFYNDNES03f87QEbOZZGRpGQfyo0cDCbDpqH var2,
      int var3,
      float var4
   ) {
      if (var3 == 0
         && var2.BatModClient
            == UywWVp5vXxoP0d8SqQiCv4pX37LqLO0dnJQDeqNxT3MI4ISVY9FZ3ftD7KL06zrJOY85R80pJlkheVAfR83wPKaLTqK78Fttb6bN.Button
         )
       {
         y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY var5 = BatModClient.BatModClient()
            .ProgressBar();
         boolean var6 = var5.blockOverlay
            && (
               var5.blockOverlayMode
                     == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[0]
                  || var5.blockOverlayMode
                     == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[2]
            );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ();
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            770, 771, 1, 0
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.CustomSpinner(
            0.0F, 0.0F, 0.0F, 0.4F
         );
         GL11.glLineWidth(var6 ? var5.blockOverlayOutlineWidth : 2.0F);
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa();
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            false
         );
         q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var7 = var2.BatModClient();
         c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var8 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
            .Button(var7)
            .CustomSpinner();
         if (var8.Checkbox()
               != wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
            && this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
               .BatModClient(var7)) {
            if (var5.blockOverlayFadeAnimation) {
               if (this.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o == null
                  || !this.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
                     .equals(var2.BatModClient())) {
                  this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n = this.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o;
                  this.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o = var2.BatModClient();
                  this.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                     .BatModClient(
                        this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                           .CustomSpinner()
                     );
                  this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                     .ButtonAction();
               }

               this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                  .BatModClient(true);
            }

            var8.CustomSpinner(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var7
            );
            double var9 = var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
               + (
                     var1.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                        - var1.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
                  )
                  * var4;
            double var11 = var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
               + (
                     var1.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                        - var1.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
                  )
                  * var4;
            double var13 = var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
               + (
                     var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                        - var1.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
                  )
                  * var4;
            if (!var5.blockOverlay) {
               BatModClient(
                  var8.CustomSpinner(
                        this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var7
                     )
                     .Button(0.002F, 0.002F, 0.002F)
                     .CustomSpinner(-var9, -var11, -var13)
               );
            } else {
               if (var5.blockOverlayMode
                     == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[0]
                  || var5.blockOverlayMode
                     == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[1]) {
                  this.BatModClient(
                     var8.CustomSpinner(
                           this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var7
                        )
                        .Button(0.002F, 0.002F, 0.002F)
                        .CustomSpinner(-var9, -var11, -var13),
                     var5.blockOverlayFillColor.BatModClient().getRed(),
                     var5.blockOverlayFillColor
                        .BatModClient()
                        .getGreen(),
                     var5.blockOverlayFillColor
                        .BatModClient()
                        .getBlue(),
                     (int)(
                        (
                              var5.blockOverlayFadeAnimation
                                 ? this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                                    .BatModClient()
                                 : 1.0
                           )
                           * var5.blockOverlayFillColor
                              .BatModClient()
                              .getAlpha()
                     )
                  );
               }

               if (var6) {
                  Button(
                     var8.CustomSpinner(
                           this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var7
                        )
                        .Button(0.002F, 0.002F, 0.002F)
                        .CustomSpinner(-var9, -var11, -var13),
                     var5.blockOverlayOutlineColor
                        .BatModClient()
                        .getRed(),
                     var5.blockOverlayOutlineColor
                        .BatModClient()
                        .getGreen(),
                     var5.blockOverlayOutlineColor
                        .BatModClient()
                        .getBlue(),
                     (int)(
                        (
                              var5.blockOverlayFadeAnimation
                                 ? this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                                    .BatModClient()
                                 : 1.0
                           )
                           * var5.blockOverlayOutlineColor
                              .BatModClient()
                              .getAlpha()
                     )
                  );
               }

               c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var15 = null;
               if (var5.blockOverlayFadeAnimation
                  && this.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                        .CustomSpinner()
                     > 0.0F
                  && this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n != null) {
                  var15 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .Button(
                        this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
                     )
                     .CustomSpinner();
                  var15.CustomSpinner(
                     this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
                     this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
                  );
               }

               if (var15 != null
                  && var15.Checkbox()
                     != wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
                  )
                {
                  if (var5.blockOverlayMode
                        == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[0]
                     || var5.blockOverlayMode
                        == y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY.BLOCK_OVERLAY_MODE[1]) {
                     this.BatModClient(
                        var15.CustomSpinner(
                              this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
                              this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
                           )
                           .Button(0.002F, 0.002F, 0.002F)
                           .CustomSpinner(-var9, -var11, -var13),
                        var5.blockOverlayFillColor
                           .BatModClient()
                           .getRed(),
                        var5.blockOverlayFillColor
                           .BatModClient()
                           .getGreen(),
                        var5.blockOverlayFillColor
                           .BatModClient()
                           .getBlue(),
                        (int)(
                           (
                                 var5.blockOverlayFadeAnimation
                                    ? this.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                                       .BatModClient()
                                    : 1.0
                              )
                              * var5.blockOverlayFillColor
                                 .BatModClient()
                                 .getAlpha()
                        )
                     );
                  }

                  if (var6) {
                     Button(
                        var15.CustomSpinner(
                              this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr,
                              this.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
                           )
                           .Button(0.002F, 0.002F, 0.002F)
                           .CustomSpinner(-var9, -var11, -var13),
                        var5.blockOverlayOutlineColor
                           .BatModClient()
                           .getRed(),
                        var5.blockOverlayOutlineColor
                           .BatModClient()
                           .getGreen(),
                        var5.blockOverlayOutlineColor
                           .BatModClient()
                           .getBlue(),
                        (int)(
                           (
                                 var5.blockOverlayFadeAnimation
                                    ? this.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
                                       .BatModClient()
                                    : 1.0
                              )
                              * var5.blockOverlayOutlineColor
                                 .BatModClient()
                                 .getAlpha()
                        )
                     );
                  }
               }
            }
         } else {
            this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
               .BatModClient(false);
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.BatModClient(
            true
         );
         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8();
         if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W();
         }

         net.minecraft.client.renderer.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
         GL11.glLineWidth(2.0F);
      } else {
         this.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
            .BatModClient(false);
      }

      this.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
         .BatModClient(false);
   }

   public void BatModClient(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var1, int var2, int var3, int var4, int var5
   ) {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var6 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var7 = var6.CustomSpinner();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
      var7.BatModClient(
         7,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.BatModClient,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.CustomSpinner
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Spinner,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var7.Button(
            var1.ButtonAction,
            var1.Button,
            var1.Checkbox
         )
         .Button(var2, var3, var4, var5)
         .Spinner();
      var6.Button();
   }

   public static void BatModClient(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var0
   ) {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var1 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var2 = var1.CustomSpinner();
      var2.BatModClient(
         3,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Spinner
      );
      var2.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Button,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Button,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Button,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Spinner();
      var1.Button();
      var2.BatModClient(
         3,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Spinner
      );
      var2.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Spinner();
      var1.Button();
      var2.BatModClient(
         1,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Spinner
      );
      var2.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Button,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Button,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Button,
            var0.Checkbox
         )
         .Spinner();
      var2.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.Checkbox
         )
         .Spinner();
      var1.Button();
   }

   public static void Button(
      rMcDsHAGrjrEOCBuKEh0Q5LxfAC6cuZ85B6g60Fyy4MSniKFsCESPLCL6GD34AOxmg8xaf9PuIaEBFVwsyZnyXwpdCqNyuOZNaT var0, int var1, int var2, int var3, int var4
   ) {
      net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE var5 = net.minecraft.client.renderer.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.BatModClient();
      net.minecraft.client.renderer.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 var6 = var5.CustomSpinner();
      var6.BatModClient(
         3,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var6.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Button,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Button,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Button,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var5.Button();
      var6.BatModClient(
         3,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var6.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var5.Button();
      var6.BatModClient(
         1,
         EXgtTwfSeUU9ZO9p1P20VWoONA7YpdZy4KWyvLUXfNaMT3ULputGaazKvP0lRsHg7NrmTb7HwaZWgavsWVgxXJuhn6tYdP4UUWMR.Checkbox
      );
      var6.Button(
            var0.BatModClient,
            var0.Button,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Button,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.CustomSpinner
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Button,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.ButtonAction,
            var0.Spinner,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Button,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var6.Button(
            var0.BatModClient,
            var0.Spinner,
            var0.Checkbox
         )
         .Button(var1, var2, var3, var4)
         .Spinner();
      var5.Button();
   }

   private void Button(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      this.Downloader
         .BatModClient(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void BatModClient(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      int var2 = var1.BatModProgressBar();
      int var3 = var1.ColorChooser();
      int var4 = var1.IntegerSpinner();
      this.Button(
         var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1
      );
   }

   @Override
   public void Button(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      int var2 = var1.BatModProgressBar();
      int var3 = var1.ColorChooser();
      int var4 = var1.IntegerSpinner();
      this.Button(
         var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1
      );
   }

   @Override
   public void BatModClient(
      int var1, int var2, int var3, int var4, int var5, int var6
   ) {
      this.Button(
         var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1
      );
   }

   @Override
   public void BatModClient(
      String var1, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2
   ) {
      n2Z5aXa0yVImdhqzF8fvi4xQbR2GbiSfmh1ufk1TdqaXZTsyLv29Msew9Rvc0GlINhKPWPqoMqU1PU8eUmz00MSIpWSkc9wWdCiM var3 = (n2Z5aXa0yVImdhqzF8fvi4xQbR2GbiSfmh1ufk1TdqaXZTsyLv29Msew9Rvc0GlINhKPWPqoMqU1PU8eUmz00MSIpWSkc9wWdCiM)this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
         .get(var2);
      if (var3 != null) {
         this.BatModClient
            .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()
            .Button(var3);
         this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4.remove(var2);
      }

      if (var1 != null) {
         D4RNb78jm74ZUiFXr5TFTxgVk3YbvZirUr8swdhQ09nTKq76FeePZjMlpTHtIwiLYEKJL1lusopGv9vz7xBr9kb1MUUzP7rNCQ1r var4 = D4RNb78jm74ZUiFXr5TFTxgVk3YbvZirUr8swdhQ09nTKq76FeePZjMlpTHtIwiLYEKJL1lusopGv9vz7xBr9kb1MUUzP7rNCQ1r.ButtonAction(
            var1
         );
         if (var4 != null) {
            this.BatModClient
               .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
               .BatModClient(
                  var4.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ()
               );
         }

         p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD var5 = null;
         if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B
               .Button()
            && var4 != null) {
            var5 = (p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD)uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
               var4,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B,
               var1
            );
         }

         if (var5 == null) {
            var5 = new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(var1);
         }

         CV0EZoWdhrRYDvOo6smFif8msBV9p0cOxv5q78CBboRaq4FY9IXRuv5BxwvAC7HBZQT1PFRhZcXKCjv2oRzSEylxDOw0VXijWtDu var6 = CV0EZoWdhrRYDvOo6smFif8msBV9p0cOxv5q78CBboRaq4FY9IXRuv5BxwvAC7HBZQT1PFRhZcXKCjv2oRzSEylxDOw0VXijWtDu.BatModClient(
            var5,
            var2.BatModProgressBar(),
            var2.ColorChooser(),
            var2.IntegerSpinner()
         );
         this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4.put(var2, var6);
         this.BatModClient
            .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()
            .BatModClient(var6);
      }
   }

   @Override
   public void BatModClient(
      String var1, double var2, double var4, double var6, float var8, float var9
   ) {
   }

   @Override
   public void BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      String var2,
      double var3,
      double var5,
      double var7,
      float var9,
      float var10
   ) {
   }

   @Override
   public void BatModClient(
      int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15
   ) {
      try {
         this.Button(
            var1, var2, var3, var5, var7, var9, var11, var13, var15
         );
      } catch (Throwable var19) {
         dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK var17 = dYRU8kZZi9iCpYQ5cTFEJaOYxItWxAoHj02DIqn4ES0X0sIZCbd2emwajjqvW8TMMCUz6wNmhhl1AN75TGrnvdi963hCekgbLQrK.BatModClient(
            var19, "Exception while adding particle"
         );
         jbxQDpKgBIWhE7pHauqynFQUvqYDUW7OzHk8ctp7Peb6M6NLNn5fDAVGaQZ4c0p8H8lwFv3PPamtrehe3GqDwAfLrtdMNVCHOgsZ var18 = var17.BatModClient(
            "Particle being added"
         );
         var18.BatModClient("ID", var1);
         if (var15 != null) {
            var18.BatModClient("Parameters", var15);
         }

         var18.BatModClient(
            "Position",
            new net.minecraft.client.renderer.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk(
               this, var3, var5, var7
            )
         );
         throw new Dc41HPIq0a1xWB4dC16xLjPSVijfmvpwZZouM5QYeWBIDiJ7WTMw2Brq92CF9bQXihBiepW7oz9feFpGQHEnHZYJW7ADgayaEHgg(var17);
      }
   }

   private void BatModClient(
      bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      int... var14
   ) {
      this.BatModClient(
         var1.CustomSpinner(),
         var1.Spinner(),
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var14
      );
   }

   private lLtIdTHPn95IaShFmaMaUWBmhkYF5cU0Rl39AfGh1zkuInd4yKtwlUfYMlpiQGjbxwqFvM1JXedDGKbjoKKmsetbespzSvjOrMB4 Button(
      int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15
   ) {
      if (this.BatModClient != null
         && this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
            != null
         && this.BatModClient.IntegerSpinner
            != null) {
         int var16 = this.BatModClient
            .InstallationLogger
            .syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB;
         if (var16 == 1
            && this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  .nextInt(3)
               == 0) {
            var16 = 2;
         }

         double var17 = this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
            - var3;
         double var19 = this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
            - var5;
         double var21 = this.BatModClient
               .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            - var7;
         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.CustomSpinner
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.Button
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModClient
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModProgressBar
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.ColorChooser
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.ColorTextPane
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModInstallerMain
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModJson
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.Downloader
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv()
            )
          {
            return null;
         }

         if (var1
               == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.ButtonAction
                  .CustomSpinner()
            && !xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc()
            )
          {
            return null;
         }

         if (var2) {
            return this.BatModClient
               .IntegerSpinner
               .BatModClient(
                  var1, var3, var5, var7, var9, var11, var13, var15
               );
         }

         double var23 = 16.0;
         double var25 = 256.0;
         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.IntegerSpinner
               .CustomSpinner()) {
            var25 = 38416.0;
         }

         if (var17 * var17 + var19 * var19 + var21 * var21 > var25) {
            return null;
         }

         if (var16 > 1) {
            return null;
         }

         lLtIdTHPn95IaShFmaMaUWBmhkYF5cU0Rl39AfGh1zkuInd4yKtwlUfYMlpiQGjbxwqFvM1JXedDGKbjoKKmsetbespzSvjOrMB4 var27 = this.BatModClient
            .IntegerSpinner
            .BatModClient(
               var1, var3, var5, var7, var9, var11, var13, var15
            );
         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.Spinner
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button(
               var27, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var3, var5, var7
            );
         }

         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.Checkbox
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button(
               var27, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var3, var5, var7
            );
         }

         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button(
               var27, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var3, var5, var7
            );
         }

         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button(
               var27
            );
         }

         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModJson
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.BatModClient(
               var27
            );
         }

         if (var1
            == bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
               .CustomSpinner()) {
            lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.BatModClient(
               var27, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var3, var5, var7
            );
         }

         return var27;
      } else {
         return null;
      }
   }

   @Override
   public void BatModClient(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      xPuAtUT6z6M1r3eYhSWDTuNhaZTHagaHHRO19BVSI0IhpDBX2TDpdlTmWNxbu7giFxHBRVoTFgyQTt2NMSWd0u4vXP6GdOgGYOxo.BatModClient(
         var1, this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
      );
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc()
         )
       {
         uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.BatModClient(
            var1, this
         );
      }
   }

   @Override
   public void Button(
      Ibgu3NUIYBBc6s3EWu2hIRSSyI1fhkukbKq2Tcv51OCVAH6AapdNHEHyH4veH4voo2KdtG0Doz1K73vVFStW8OO0WPVe252N5epM var1
   ) {
      if (xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc()
         )
       {
         uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.Button(
            var1, this
         );
      }
   }

   public void IntegerSpinner() {
   }

   @Override
   public void BatModClient(
      int var1, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2, int var3
   ) {
      switch (var1) {
         case 1013:
         case 1018:
            if (this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
               != null) {
               double var4 = var2.BatModProgressBar()
                  - this.BatModClient
                     .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                     .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
               double var6 = var2.ColorChooser()
                  - this.BatModClient
                     .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                     .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
               double var8 = var2.IntegerSpinner()
                  - this.BatModClient
                     .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                     .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
               double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
               double var12 = this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                  .LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
               double var14 = this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                  .xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
               double var16 = this.BatModClient
                  .FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
                  .o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
               if (var10 > 0.0) {
                  var12 += var4 / var10 * 2.0;
                  var14 += var6 / var10 * 2.0;
                  var16 += var8 / var10 * 2.0;
               }

               if (var1 == 1013) {
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .BatModClient(
                        var12, var14, var16, "mob.wither.spawn", 1.0F, 1.0F, false
                     );
               } else {
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                     .BatModClient(
                        var12, var14, var16, "mob.enderdragon.end", 5.0F, 1.0F, false
                     );
               }
            }
      }
   }

   @Override
   public void BatModClient(
      EiOGTpOuNvp5WsKk6jGR2jglsq9JaB2IWjuipLa7gU6vDDYOtqWblwLscEr9nhr3XGEIpYHMHSqPgq2F6xpysdofz60nmyg8x8u var1,
      int var2,
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3,
      int var4
   ) {
      Random var5 = this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
      switch (var2) {
         case 1000:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(var3, "random.click", 1.0F, 1.0F, false);
            break;
         case 1001:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(var3, "random.click", 1.0F, 1.2F, false);
            break;
         case 1002:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(var3, "random.bow", 1.0F, 1.2F, false);
            break;
         case 1003:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "random.door_open",
                  1.0F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 1004:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "random.fizz", 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false
               );
            break;
         case 1005:
            if (q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
               var4
            ) instanceof D4RNb78jm74ZUiFXr5TFTxgVk3YbvZirUr8swdhQ09nTKq76FeePZjMlpTHtIwiLYEKJL1lusopGv9vz7xBr9kb1MUUzP7rNCQ1r) {
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .BatModClient(
                     var3,
                     "records."
                        + ((D4RNb78jm74ZUiFXr5TFTxgVk3YbvZirUr8swdhQ09nTKq76FeePZjMlpTHtIwiLYEKJL1lusopGv9vz7xBr9kb1MUUzP7rNCQ1r)q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
                              var4
                           ))
                           .ProgressBar
                  );
            } else {
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .BatModClient(var3, (String)null);
            }
            break;
         case 1006:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "random.door_close",
                  1.0F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 1007:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.ghast.charge", 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1008:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.ghast.fireball", 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1009:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.ghast.fireball", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1010:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.zombie.wood", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1011:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.zombie.metal", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1012:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.zombie.woodbreak", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1014:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.wither.shoot", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1015:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.bat.takeoff", 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1016:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.zombie.infect", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1017:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3, "mob.zombie.unfect", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false
               );
            break;
         case 1020:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "random.anvil_break",
                  1.0F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 1021:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "random.anvil_use",
                  1.0F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 1022:
            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "random.anvil_land",
                  0.3F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 2000:
            int var6 = var4 % 3 - 1;
            int var7 = var4 / 3 % 3 - 1;
            double var8 = var3.BatModProgressBar() + var6 * 0.6 + 0.5;
            double var10 = var3.ColorChooser() + 0.5;
            double var12 = var3.IntegerSpinner() + var7 * 0.6 + 0.5;

            for (int var39 = 0; var39 < 10; var39++) {
               double var40 = var5.nextDouble() * 0.2 + 0.01;
               double var41 = var8 + var6 * 0.01 + (var5.nextDouble() - 0.5) * var7 * 0.5;
               double var42 = var10 + (var5.nextDouble() - 0.5) * 0.5;
               double var44 = var12 + var7 * 0.01 + (var5.nextDouble() - 0.5) * var6 * 0.5;
               double var45 = var6 * var40 + var5.nextGaussian() * 0.01;
               double var46 = -0.03 + var5.nextGaussian() * 0.01;
               double var48 = var7 * var40 + var5.nextGaussian() * 0.01;
               this.BatModClient(
                  bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.ColorTextPane,
                  var41,
                  var42,
                  var44,
                  var45,
                  var46,
                  var48
               );
            }

            return;
         case 2001:
            c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G var14 = c2oMn9P79Sau4CuYIA2cLQLt3KoM1Y67PHvtoBgPr2g6Oy5HzqcC9jfK5sgjIn7nXpGQhcd6OIXsJWNXSgt47agiqfonfVYpqz1G.BatModClient(
               var4 & 4095
            );
            if (var14.Checkbox()
               != wrWzf43CgVtAVZ1fRw9f5EeOX2awWPqkiOOzM9NBeGOkKeHUGxJGSbBgaRlMmokj4Wr4yG2BsJj5tSd9CZ7IyeywOQ9MmPXeIbis.BatModClient
               )
             {
               this.BatModClient
                  .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()
                  .BatModClient(
                     new CV0EZoWdhrRYDvOo6smFif8msBV9p0cOxv5q78CBboRaq4FY9IXRuv5BxwvAC7HBZQT1PFRhZcXKCjv2oRzSEylxDOw0VXijWtDu(
                        new p7gEHzChZANgQTeNDHf2DAoeS21e8yfozPsoQrJSpLJJ9JfwEWgpYu5TcTH8c9gihFUypwDhyTu5lUWfPRwIg44Mb23hTD8FR2KD(
                           var14.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                              .BatModClient()
                        ),
                        (
                              var14.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                                    .ButtonAction()
                                 + 1.0F
                           )
                           / 2.0F,
                        var14.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                              .Spinner()
                           * 0.8F,
                        var3.BatModProgressBar() + 0.5F,
                        var3.ColorChooser() + 0.5F,
                        var3.IntegerSpinner() + 0.5F
                     )
                  );
            }

            this.BatModClient
               .IntegerSpinner
               .BatModClient(
                  var3, var14.CustomSpinner(var4 >> 12 & 0xFF)
               );
            break;
         case 2002:
            double var15 = var3.BatModProgressBar();
            double var17 = var3.ColorChooser();
            double var19 = var3.IntegerSpinner();

            for (int var21 = 0; var21 < 8; var21++) {
               this.BatModClient(
                  bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl,
                  var15,
                  var17,
                  var19,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15,
                  q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
                     PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO
                  ),
                  var4
               );
            }

            int var43 = PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO
               .ProgressBar(var4);
            float var22 = (var43 >> 16 & 0xFF) / 255.0F;
            float var23 = (var43 >> 8 & 0xFF) / 255.0F;
            float var24 = (var43 >> 0 & 0xFF) / 255.0F;
            bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI var25 = bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
            if (PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO
               .BatModProgressBar(var4)) {
               var25 = bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
            }

            for (int var47 = 0; var47 < 100; var47++) {
               double var27 = var5.nextDouble() * 4.0;
               double var29 = var5.nextDouble() * Math.PI * 2.0;
               double var31 = Math.cos(var29) * var27;
               double var51 = 0.01 + var5.nextDouble() * 0.5;
               double var52 = Math.sin(var29) * var27;
               lLtIdTHPn95IaShFmaMaUWBmhkYF5cU0Rl39AfGh1zkuInd4yKtwlUfYMlpiQGjbxwqFvM1JXedDGKbjoKKmsetbespzSvjOrMB4 var53 = this.Button(
                  var25.CustomSpinner(),
                  var25.Spinner(),
                  var15 + var31 * 0.1,
                  var17 + 0.3,
                  var19 + var52 * 0.1,
                  var31,
                  var51,
                  var52
               );
               if (var53 != null) {
                  float var38 = 0.75F + var5.nextFloat() * 0.25F;
                  var53.BatModClient(
                     var22 * var38, var23 * var38, var24 * var38
                  );
                  var53.ButtonAction((float)var27);
               }
            }

            this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .BatModClient(
                  var3,
                  "game.potion.smash",
                  1.0F,
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                           .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           .nextFloat()
                        * 0.1F
                     + 0.9F,
                  false
               );
            break;
         case 2003:
            double var26 = var3.BatModProgressBar() + 0.5;
            double var28 = var3.ColorChooser();
            double var30 = var3.IntegerSpinner() + 0.5;

            for (int var49 = 0; var49 < 8; var49++) {
               this.BatModClient(
                  bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl,
                  var26,
                  var28,
                  var30,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15,
                  q6zOAdToZN7TAI74vSRTyYYq0gEOsY62OU4TS97eZ2nT1um0QNOTmHPkkr9sp0WCGrGJUIwKoSx3mDL4BlHBXG0xsXNf5tKvoZg2.BatModClient(
                     PQv5Bfmc3YgYFvAC2dTnUn4Di1xPI6iL6HyB7PFNLFxAoip71NusUPE2c3nBlPseU8qI9uFV111SHY6yVG0uWx8HL7qy9GXeQgzJ.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u
                  )
               );
            }

            for (double var50 = 0.0; var50 < Math.PI * 2; var50 += Math.PI / 20) {
               this.BatModClient(
                  bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModJson,
                  var26 + Math.cos(var50) * 5.0,
                  var28 - 0.4,
                  var30 + Math.sin(var50) * 5.0,
                  Math.cos(var50) * -5.0,
                  0.0,
                  Math.sin(var50) * -5.0
               );
               this.BatModClient(
                  bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.BatModJson,
                  var26 + Math.cos(var50) * 5.0,
                  var28 - 0.4,
                  var30 + Math.sin(var50) * 5.0,
                  Math.cos(var50) * -7.0,
                  0.0,
                  Math.sin(var50) * -7.0
               );
            }

            return;
         case 2004:
            for (int var32 = 0; var32 < 20; var32++) {
               double var33 = var3.BatModProgressBar()
                  + 0.5
                  + (
                        this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                              .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                              .nextFloat()
                           - 0.5
                     )
                     * 2.0;
               double var35 = var3.ColorChooser()
                  + 0.5
                  + (
                        this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                              .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                              .nextFloat()
                           - 0.5
                     )
                     * 2.0;
               double var37 = var3.IntegerSpinner()
                  + 0.5
                  + (
                        this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                              .LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                              .nextFloat()
                           - 0.5
                     )
                     * 2.0;
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .BatModClient(
                     bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.ColorTextPane,
                     var33,
                     var35,
                     var37,
                     0.0,
                     0.0,
                     0.0
                  );
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
                  .BatModClient(
                     bqktTrhqNeUUmZPZfzUoRuX7dYKrygZ4FhCjqPxLbarsoXXSEqX7P1VISvjg9LXpKiPPnNKnKFfBv1wcZ5u2xzVFXz5CuBu3R6OI.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8,
                     var33,
                     var35,
                     var37,
                     0.0,
                     0.0,
                     0.0
                  );
            }

            return;
         case 2005:
            GOJjsKNqy8Fhmg52WlYGxO5BRNjTasF5jL7nMuIauqb3jQNyyZjBwvCggnx0aLxYWQRiEGYXlXUz443jbMwwIpgOZ8oQ1aj65f0g.BatModClient(
               this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr, var3, var4
            );
      }
   }

   @Override
   public void Button(
      int var1, q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var2, int var3
   ) {
      if (var3 >= 0 && var3 < 10) {
         net.minecraft.client.renderer.InstallationLogger var4 = (net.minecraft.client.renderer.InstallationLogger)this.Button
            .get(var1);
         if (var4 == null
            || var4.BatModClient()
                  .BatModProgressBar()
               != var2.BatModProgressBar()
            || var4.BatModClient()
                  .ColorChooser()
               != var2.ColorChooser()
            || var4.BatModClient()
                  .IntegerSpinner()
               != var2.IntegerSpinner()) {
            var4 = new net.minecraft.client.renderer.InstallationLogger(
               var1, var2
            );
            this.Button.put(var1, var4);
         }

         var4.BatModClient(var3);
         var4.Button(
            this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         );
      } else {
         this.Button.remove(var1);
      }
   }

   public void TextField() {
      this.ButtonAction = true;
   }

   public void ColorTextPane() {
      this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
         .Spinner();
   }

   public int BatModInstallerMain() {
      return this.Downloader.Checkbox.length;
   }

   public int aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA() {
      return this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ.size();
   }

   public int LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN() {
      return this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
   }

   public int G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr() {
      return this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE;
   }

   public KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ CustomSpinner(
      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var1
   ) {
      return this.Downloader
         .BatModClient(var1);
   }

   public KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ BatModClient(
      KrdiIVNufX6VedxjjHjjuK3CZHW4fmhCImQ1l3NVc3R9iPhRFjCczLKgGhlmDB1r546iBORgSSrAkIm3oCzhs0C87WNpxdPhOZFJ var1,
      NHdPV7EbBaVDxWqHTdOYYUetwLLQ90s6RiwdYGLFq46biS0BE3s5HgVDKtK2eE0r70IUVxhCka3tOW7Lk8ko3Ctp9Rv80MTaxFZn var2
   ) {
      if (var1 == null) {
         return null;
      }

      q15Hrb7HPiXUZJsH3CBPEgtS2dBsU3MPPT72hjpoKm9nktzO32O8rewmFT7fqIM36QFgzptSfVW7TW1sEMV8VoaK1YvNABwRXVW var3 = var1.BatModClient(
         var2
      );
      return this.Downloader
         .BatModClient(var3);
   }

   public NteFd9HVJdwzXTrwPP9DzZdYpirUKP5pYzkC03lPx8N7W97p10Vq9iIcaWkKXAqVMB9lsyaG8A1eVjg3qfvn4o4eKR9hXeM56nBP iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF() {
      return this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
   }

   public void BatModClient(Collection var1, Collection var2) {
      Set var4 = this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
      synchronized (this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB) {
         this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.removeAll(var1);
         this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB.addAll(var2);
      }
   }
}
