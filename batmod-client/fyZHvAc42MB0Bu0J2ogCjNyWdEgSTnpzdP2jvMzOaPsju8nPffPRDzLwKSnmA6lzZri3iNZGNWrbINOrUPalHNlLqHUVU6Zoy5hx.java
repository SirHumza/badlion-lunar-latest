import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx {
   private static final Logger spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv = LogManager.getLogger();
   private static final Gson K664Hzgm2u4k0ypaVNYdaf5aIMS4VsJqTdT1fRKtwzU040sK8ILjlC6jPHhGKx7G8uLKIkHaz26alD5WvEAwk3bPjWWLIoZiOjWA = new Gson();
   private static final ParameterizedType TiXRJPDmCp8VesCujodQnrIM1TP59UIgCTgRhHQo7uv40d1mw2MMhcr6KjFADvF4aiHNqXYRA5AQC5I1QnfEgku5e8qJ8ld7LZFt = new JxM9Ts9jbImJsbEeV6d5VI5qJzZTClHf8dG0rTUJx6MdlInfJikavD8P3Nq9OBGxsBJcU0bT0vWI42GIYgP636Rbe11Yilf7k8();
   private static final String[] PSbmi7DsXyIuFXivj6mvdDgvGyY3sGlOGGlPumxT07XEfE8EQ5MCyaidc4Nte0U8n4WS7xuCkb3ffKV0PPTvhQHlL0xSrhuIcBMC = new String[]{
      "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"
   };
   private static final String[] KsH0MwtfYAhEJlUF862jwiMy2pZEUv1ulZ8QRYVaiZ1gV0RKcoEhsFeba78SXzBSE7VWRpWjcjuUnvLs6Bwc1kNeIuoaH3Z1Yia8 = new String[]{
      "options.particles.all", "options.particles.decreased", "options.particles.minimal"
   };
   private static final String[] Qo72Syi22HIVUiiAdd9NXNBsvIlxiW5cQG47cRiwhTMa7tlaxuMdiPUuEBClxWZED3Fyw0QKHlt5AN4qomMXAWIfvIK0tNjcJMUF = new String[]{
      "options.ao.off", "options.ao.min", "options.ao.max"
   };
   private static final String[] ZhnNhTXe9crzzTUylC0JahHDfGNPCyEnOb2OqkvbH7Bar057g7DRjrVEMJHug4xSrC5wvpJSxULjVuY8Pq7gjZFa1I7RDupfHBlk = new String[]{
      "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"
   };
   private static final String[] YtRK8BjzsTggjXOD6DkCjcXC8CXCXKdAQEX8FrueJBaXhjlPRb1xLyBdP4MsdO976zQBZ26fDqwDavPi90Lnj92GleUXQwPSQsSu = new String[]{
      "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"
   };
   private static final String[] MslRoVEB2kSbxcg7IXSCe4LFLFC97mmJ9f4o2C87S1yJ4n5xWehfY82YTaAg91VonNq71K1xA68TrD8BRJYxjNJ6SpqzNrwdo3pI = new String[]{
      "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"
   };
   private static final String[] NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9 = new String[]{
      "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"
   };
   private static final String[] NFEXvfzASCBo1uoADfO7B6Zd2HFrS9cQLXZ1j8I7xQ7tcvlH6T1xCQUszLrHp4Q2bcUEXEGvrIjfFqgn1Lq9961mMvBMiUdNnRz = new String[]{
      "options.off", "options.graphics.fast", "options.graphics.fancy"
   };
   public float BatModClient = 0.5F;
   public boolean Button;
   public int CustomSpinner = -1;
   public boolean ButtonAction = true;
   public boolean Spinner;
   public boolean Checkbox = true;
   public int ProgressBar = 120;
   public int BatModProgressBar = 2;
   public boolean ColorChooser = true;
   public int IntegerSpinner = 2;
   public List TextField = Lists.newArrayList();
   public List ColorTextPane = Lists.newArrayList();
   public UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k BatModInstallerMain = UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k.BatModClient;
   public boolean aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = true;
   public boolean LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = true;
   public boolean G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = true;
   public float iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = 1.0F;
   public boolean bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = true;
   public boolean RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
   public boolean Downloader = true;
   public boolean InstallationLogger = false;
   public boolean RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = true;
   public boolean K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = false;
   public boolean ExitCode;
   public boolean BatModJson;
   public boolean z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = true;
   private final Set WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd = Sets.newHashSet(
      t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N.values()
   );
   public boolean LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
   public int xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa;
   public int o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4;
   public boolean K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = true;
   public float sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = 1.0F;
   public float GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = 1.0F;
   public float OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = 0.44366196F;
   public float f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = 1.0F;
   public boolean fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = true;
   public int z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = 4;
   private Map zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh = Maps.newEnumMap(
      chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj.class
   );
   public float N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = 0.5F;
   public float EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = 1.0F;
   public float KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = 1.0F;
   public float WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = 0.5412844F;
   public float OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = 0.31690142F;
   public int vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = 1;
   public boolean ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = true;
   public String ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = "";
   public int fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = 0;
   public int dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = 0;
   public int GsonTypeAdapter = 0;
   public boolean mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = true;
   public boolean xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = true;
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.forward", 17, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3 = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.left", 30, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.back", 31, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.right", 32, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.jump", 57, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.sneak", 42, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.sprint", 29, "key.categories.movement"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.inventory", 18, "key.categories.inventory"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9 = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.use", -99, "key.categories.gameplay"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.drop", 16, "key.categories.gameplay"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.attack", -100, "key.categories.gameplay"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.pickItem", -98, "key.categories.gameplay"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.chat", 20, "key.categories.multiplayer"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.playerlist", 15, "key.categories.multiplayer"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1 = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.command", 53, "key.categories.multiplayer"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.screenshot", 60, "key.categories.misc"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.togglePerspective", 63, "key.categories.misc"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.smoothCamera", 0, "key.categories.misc"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.fullscreen", 87, "key.categories.misc"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
      "key.spectatorOutlines", 0, "key.categories.misc"
   );
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[] aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[]{
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.1", 2, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.2", 3, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.3", 4, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.4", 5, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.5", 6, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.6", 7, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.7", 8, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.8", 9, "key.categories.inventory"),
      new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW("key.hotbar.9", 10, "key.categories.inventory")
   };
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[] HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn;
   protected AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj;
   private File idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1;
   public jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE;
   public boolean QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR;
   public int jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2;
   public boolean Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o;
   public boolean nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n;
   public boolean BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv;
   public String ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82;
   public boolean H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr;
   public boolean fdWwz8f4KFCqAE9dJn6mau1WTLndFo20uW0xKGHrGzxKLLekdm6Au5JckJN97q44pOxYege3lGXnjUzxAOzU02jeru5UtgB2VOo4;
   public float U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi;
   public float J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1;
   public float I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK;
   public int KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g;
   public int syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB;
   public String fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x;
   public boolean NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc;
   private static final String kwTceg0Lmk5JOtoX6vCsrlwiEUv9uulgwvySV4b7AkyFej7hggXLV46koFdtzItzq3zxZAbUHqk2OtOxeQXyLygkTQHysD0WhqHJ = "CL_00000650";
   public int q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 1;
   public float g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = 0.8F;
   public int j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ = 0;
   public boolean waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW = false;
   public boolean tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 = false;
   public boolean g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz();
   public boolean QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz();
   public float JavaVersion = 1.0F;
   public int DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = 0;
   public int E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = 1;
   public int wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 = 0;
   public float hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae = 0.0F;
   public int A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX = 0;
   public int y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz = 0;
   public int b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX = 0;
   public int DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR = 3;
   public int hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz = 4000;
   public boolean VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw = false;
   public boolean jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6 = false;
   public boolean RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI = false;
   public boolean LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP = true;
   public boolean PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG = true;
   public boolean mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB = true;
   public boolean sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju = true;
   public int Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI = 0;
   public int fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 = 1;
   public boolean Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV = false;
   public int jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 = 0;
   public boolean avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq = false;
   public boolean Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B = false;
   public String KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = "Default";
   public boolean VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe = true;
   public boolean sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc = true;
   public boolean NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1 = true;
   public boolean v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ = true;
   public boolean YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf = true;
   public boolean TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ = true;
   public boolean QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6 = true;
   public int BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb = 2;
   public boolean oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns = true;
   public boolean atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 = false;
   public boolean kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO = false;
   public boolean xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i = true;
   public int ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 0;
   public boolean br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP = true;
   public int nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn = 3;
   public int D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = 0;
   public int jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = 0;
   public boolean TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B = true;
   public boolean eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u = true;
   public boolean CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 = true;
   public boolean S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 = true;
   public boolean WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl = true;
   public boolean g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza = true;
   public boolean s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj = true;
   public boolean EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D = true;
   public boolean S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF = true;
   public boolean uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5 = true;
   public boolean C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0 = true;
   public boolean UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f = true;
   public boolean DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI = true;
   public boolean Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8 = true;
   public boolean OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC = true;
   public static final int Tq2MQ6CZyhehDC7Grz6IQZFM8yePoNVztp7WzhNOtapxjId8bXGysoEDMLcIQMZgKoCv2tfyMCYTwVxf85RFnUKqW9aUOUY10sI = 0;
   public static final int WRajDndsIiuZtkfIuKL52DrNyEBRENzabNP9AnUvVD5gfpz8V5ixASsfyUaeBbADSxbANowvk9hX83zAePoYZegLiKviOLWJbjr = 1;
   public static final int Y2eSY64r61E45dd0u1KEApLKH5W0lfB2BwtaVU9ZonTT3MG9EtFGOEc3PfdOwYRxX6ZefazMMcbCcmxhovFzfRUIyMDbN7xU1Z = 2;
   public static final int dP0wbpCFya7Qd0mnIASGNZXbsXnC8wRsxjffpRGLfvPp9P08Q6QQV75HEMOafWighPcQRaFPgqQCYkLhhDha6R2FM4MiPNvL5hKk = 3;
   public static final int Z8zyajFHGKd16lbI3cME4a5v6Xk8mrrhC7wUevpdvWivCblw1ULgEU8julxgqWsfC33PgtAA6DuofRNn5iXQ13jfeZIvhLDoNEuv = 4;
   public static final int pv41yB51QYKpb20FF9W9XSAvKS671krPqtx0SkvW8ZsADYdd666r2fOX3h9Tlsy51klNJcpTEDFkgshcExe3e0c2S5GCK6IBZKEi = 0;
   public static final int y3KqHzPVHj6VXlZV2YsOJkcBAwgUucIug8A693vpCaBLoEhK6NjumkjBg8U9s52ADy8BL2FSaShSZKK3XcG4aXtryW1Kzppujfim = 1;
   public static final int wufOd0J1RrShzPraueKsmBqKMFkvbXZbd39F2hU6oy2YVNkQUqxCOizJfPR3yDoAYFpi4FQUdMsTcyAkdQU9jwqrCdAJnnsVMQYp = 2;
   public static final String oVUlF2kimA5AgzoC6vC0JayzmSTXZm5cvWsXrpitO7ZkmGEYfnJOFbfvNwsUJYd9Pklbx4OeWIQVuNGBlTcUyuWlZCpyW2q9djct = "Default";
   private static final int[] vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh = new int[]{0, 1, 4, 2};
   private static final int[] oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn = new int[]{3, 1, 2};
   private static final String[] jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt = new String[]{
      "options.off", "options.graphics.fast", "options.graphics.fancy"
   };
   public QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p;
   private File DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87;

   public fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx(
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1, File var2
   ) {
      this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[])ArrayUtils.addAll(
         new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[]{
            this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh,
            this.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9,
            this.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc,
            this.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3,
            this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ,
            this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP,
            this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV,
            this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf,
            this.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj,
            this.oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS,
            this.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY,
            this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W,
            this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz,
            this.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI,
            this.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1,
            this.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF,
            this.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C,
            this.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk,
            this.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl,
            this.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I
         },
         this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
      );
      this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE = jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.CustomSpinner;
      this.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 = "";
      this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = 70.0F;
      this.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x = "en_US";
      this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc = false;
      this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj = var1;
      this.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1 = new File(var2, "options.txt");
      this.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87 = new File(var2, "optionsof.txt");
      this.ProgressBar = (int)kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
         .Spinner();
      this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p = new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW(
         "of.key.zoom", 46, "key.categories.misc"
      );
      this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[])ArrayUtils.add(
         this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn,
         this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p
      );
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
         .BatModClient(32.0F);
      this.CustomSpinner = 8;
      this.BatModClient();
      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
         this
      );
   }

   public fyZHvAc42MB0Bu0J2ogCjNyWdEgSTnpzdP2jvMzOaPsju8nPffPRDzLwKSnmA6lzZri3iNZGNWrbINOrUPalHNlLqHUVU6Zoy5hx() {
      this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn = (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[])ArrayUtils.addAll(
         new QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW[]{
            this.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh,
            this.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9,
            this.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc,
            this.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3,
            this.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ,
            this.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP,
            this.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV,
            this.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf,
            this.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj,
            this.oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS,
            this.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY,
            this.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W,
            this.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz,
            this.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI,
            this.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1,
            this.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF,
            this.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C,
            this.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk,
            this.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl,
            this.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I
         },
         this.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
      );
      this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE = jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.CustomSpinner;
      this.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 = "";
      this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = 70.0F;
      this.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x = "en_US";
      this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc = false;
   }

   public static String BatModClient(int var0) {
      return var0 < 0
         ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            "key.mouseButton", var0 + 101
         )
         : (var0 < 256 ? Keyboard.getKeyName(var0) : String.format("%c", (char)(var0 - 256)).toUpperCase());
   }

   public static boolean BatModClient(
      QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW var0
   ) {
      int var1 = var0.IntegerSpinner();
      return var1 < -100 || var1 > 255
         ? false
         : (
            var0.IntegerSpinner() == 0
               ? false
               : (
                  var0.IntegerSpinner() < 0
                     ? Mouse.isButtonDown(var0.IntegerSpinner() + 100)
                     : Keyboard.isKeyDown(var0.IntegerSpinner())
               )
         );
   }

   public void BatModClient(
      QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW var1, int var2
   ) {
      var1.Button(var2);
      this.Button();
   }

   public void BatModClient(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1, float var2
   ) {
      this.Button(var1, var2);
      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Button
         )
       {
         this.BatModClient = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.CustomSpinner
         )
       {
         this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ButtonAction
         )
       {
         this.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
         )
       {
         this.ProgressBar = (int)var2;
         this.Downloader = false;
         if (this.ProgressBar <= 0) {
            this.ProgressBar = (int)kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
               .Spinner();
            this.Downloader = true;
         }

         this.IntegerSpinner();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
         )
       {
         this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            .ButtonAction()
            .Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
         )
       {
         this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            .ButtonAction()
            .Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
         )
       {
         this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            .ButtonAction()
            .Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
         )
       {
         this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            .ButtonAction()
            .Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
         )
       {
         this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
            .ButtonAction()
            .Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL
         )
       {
         int var3 = this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m;
         this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = (int)var2;
         if (var3 != var2) {
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i()
               .BatModClient(
                  this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
               );
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt()
               .BatModClient(
                  seh8dF7MVL4b5yxwwcAiszh8LXBDhUSdECTFRKjqLZLC7X2udGeJLCdlbKzxO8bVn3kwv0IUAU1jRBNRjsV0e2utdWrMnhWbUBRs.Button
               );
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i()
               .BatModClient(
                  false, this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m > 0
               );
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP();
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
         )
       {
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = !this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
         )
       {
         this.CustomSpinner = (int)var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .TextField();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
         )
       {
         this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
         )
       {
         this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc()
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
         )
       {
         this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc()
            .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
         )
       {
         this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
         )
       {
         this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = var2;
      }
   }

   public void BatModClient(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1, int var2
   ) {
      this.Button(var1, var2);
      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModClient
         )
       {
         this.Button = !this.Button;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         )
       {
         this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g = this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g
               + var2
            & 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         )
       {
         this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB = (
               this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB + var2
            )
            % 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ProgressBar
         )
       {
         this.ButtonAction = !this.ButtonAction;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.TextField
         )
       {
         this.BatModProgressBar = (
               this.BatModProgressBar + var2
            )
            % 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
         )
       {
         this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc = !this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ColorTextPane
            .BatModClient(
               this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
                     .ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV()
                     .BatModClient()
                  || this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.IntegerSpinner
         )
       {
         this.Checkbox = !this.Checkbox;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModProgressBar
         )
       {
         if (!this.Spinner
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.an.shaders1"
               ),
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.an.shaders2"
               )
            );
            return;
         }

         this.Spinner = !this.Spinner;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .Spinner();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorTextPane
         )
       {
         this.ColorChooser = !this.ColorChooser;
         this.TextField();
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModInstallerMain
         )
       {
         this.IntegerSpinner = (
               this.IntegerSpinner + var2
            )
            % 3;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         )
       {
         this.BatModInstallerMain = UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k.BatModClient(
            (
                  this.BatModInstallerMain
                        .BatModClient()
                     + var2
               )
               % 3
         );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
         )
       {
         this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = (
               this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP + var2
            )
            % 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
         )
       {
         this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = !this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
         )
       {
         this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = (
               this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i + var2
            )
            % 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
         )
       {
         this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = (
               this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 + var2
            )
            % 3;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
         )
       {
         this.GsonTypeAdapter = (
               this.GsonTypeAdapter + var2
            )
            % 2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
         )
       {
         this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = !this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ
         )
       {
         this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = !this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Downloader
         )
       {
         this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = !this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.InstallationLogger
         )
       {
         this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = !this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModJson
         )
       {
         this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = !this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM
         )
       {
         this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = !this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
         if (this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m()
            != this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB) {
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF();
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
         )
       {
         this.Downloader = !this.Downloader;
         Display.setVSyncEnabled(this.Downloader);
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ExitCode
         )
       {
         this.InstallationLogger = !this.InstallationLogger;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
         )
       {
         this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = !this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu
         )
       {
         this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = !this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV
         )
       {
         this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = !this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
      }

      this.Button();
   }

   public float BatModClient(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1
   ) {
      return var1
            == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         ? this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
         : (
            var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY
               ? this.JavaVersion
               : (
                  var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06
                     ? this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu
                     : (
                        var1
                              == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.JavaVersion
                           ? this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb
                           : (
                              var1
                                    == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GsonTypeAdapter
                                 ? this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ
                                 : (
                                    var1
                                          == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                                       ? (
                                          this.ProgressBar
                                                   == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                                                      .Spinner()
                                                && this.Downloader
                                             ? 0.0F
                                             : this.ProgressBar
                                       )
                                       : (
                                          var1
                                                == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.CustomSpinner
                                             ? this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi
                                             : (
                                                var1
                                                      == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ButtonAction
                                                   ? this.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1
                                                   : (
                                                      var1
                                                            == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Spinner
                                                         ? this.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK
                                                         : (
                                                            var1
                                                                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Button
                                                               ? this.BatModClient
                                                               : (
                                                                  var1
                                                                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
                                                                     ? this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF
                                                                     : (
                                                                        var1
                                                                              == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                                                                           ? this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
                                                                           : (
                                                                              var1
                                                                                    == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                                                                                 ? this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
                                                                                 : (
                                                                                    var1
                                                                                          == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP
                                                                                       ? this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr
                                                                                       : (
                                                                                          var1
                                                                                                == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                                                                                             ? this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                                                                                             : (
                                                                                                var1
                                                                                                      == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                                                                                                   ? this.ProgressBar
                                                                                                   : (
                                                                                                      var1
                                                                                                            == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL
                                                                                                         ? this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
                                                                                                         : (
                                                                                                            var1
                                                                                                                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
                                                                                                               ? this.CustomSpinner
                                                                                                               : (
                                                                                                                  var1
                                                                                                                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                                                                                                                     ? this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
                                                                                                                     : (
                                                                                                                        var1
                                                                                                                              == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF
                                                                                                                           ? this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
                                                                                                                           : (
                                                                                                                              var1
                                                                                                                                    == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb
                                                                                                                                 ? this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
                                                                                                                                 : (
                                                                                                                                    var1
                                                                                                                                          == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
                                                                                                                                       ? this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
                                                                                                                                       : (
                                                                                                                                          var1
                                                                                                                                                == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
                                                                                                                                             ? this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
                                                                                                                                             : 0.0F
                                                                                                                                       )
                                                                                                                                 )
                                                                                                                           )
                                                                                                                     )
                                                                                                               )
                                                                                                         )
                                                                                                   )
                                                                                             )
                                                                                       )
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   public boolean Button(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1
   ) {
      switch (aDxXN5Rd1gluJTXot6ncosUjGLjxP92y6aH8XEeqX4Wu6pTxQEAFxzK2uQF81QA8Xil2UmXq3KQoSaZ2jylgcom2I6p453gnKyq.BatModClient[var1.ordinal()]) {
         case 1:
            return this.Button;
         case 2:
            return this.ButtonAction;
         case 3:
            return this.Spinner;
         case 4:
            return this.Checkbox;
         case 5:
            return this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA;
         case 6:
            return this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN;
         case 7:
            return this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr;
         case 8:
            return this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ;
         case 9:
            return this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB;
         case 10:
            return this.Downloader;
         case 11:
            return this.InstallationLogger;
         case 12:
            return this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8;
         case 13:
            return this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu;
         case 14:
            return this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc;
         case 15:
            return this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM;
         case 16:
            return this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY;
         case 17:
            return this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02;
         default:
            return false;
      }
   }

   private static String BatModClient(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
         var0[var1]
      );
   }

   public String CustomSpinner(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1
   ) {
      String var2 = this.ButtonAction(var1);
      if (var2 != null) {
         return var2;
      }

      String var3 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            var1.ButtonAction()
         )
         + ": ";
      if (var1.BatModClient()) {
         float var7 = this.BatModClient(var1);
         float var5 = var1.Button(var7);
         return var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Button
            ? (
               var5 == 0.0F
                  ? var3
                     + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                        "options.sensitivity.min"
                     )
                  : (
                     var5 == 1.0F
                        ? var3
                           + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                              "options.sensitivity.max"
                           )
                        : var3 + (int)(var5 * 200.0F) + "%"
                  )
            )
            : (
               var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.CustomSpinner
                  ? (
                     var7 == 70.0F
                        ? var3
                           + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                              "options.fov.min"
                           )
                        : (
                           var7 == 110.0F
                              ? var3
                                 + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                    "options.fov.max"
                                 )
                              : var3 + (int)var7
                        )
                  )
                  : (
                     var1
                           == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                        ? (
                           var7
                                 == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModClient(
                                    var1
                                 )
                              ? var3
                                 + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                    "options.framerateLimit.max"
                                 )
                              : var3 + (int)var7 + " fps"
                        )
                        : (
                           var1
                                 == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.TextField
                              ? (
                                 var7
                                       == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Button(
                                          var1
                                       )
                                    ? var3
                                       + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                          "options.cloudHeight.min"
                                       )
                                    : var3 + ((int)var7 + 128)
                              )
                              : (
                                 var1
                                       == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ButtonAction
                                    ? (
                                       var5 == 0.0F
                                          ? var3
                                             + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                                "options.gamma.min"
                                             )
                                          : (
                                             var5 == 1.0F
                                                ? var3
                                                   + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                                      "options.gamma.max"
                                                   )
                                                : var3 + "+" + (int)(var5 * 100.0F) + "%"
                                          )
                                    )
                                    : (
                                       var1
                                             == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Spinner
                                          ? var3 + (int)(var5 * 400.0F) + "%"
                                          : (
                                             var1
                                                   == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB
                                                ? var3 + (int)(var5 * 90.0F + 10.0F) + "%"
                                                : (
                                                   var1
                                                         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
                                                      ? var3
                                                         + kUGGsFqpsSP5RuH2I5x0khGCIEnuraaroUzGyFWTcAxPBXDSIPm7qrodZib1rbeDITlwIy9zsW87qIvf9dcA03Y1sSk93VxEM0yj.Button(
                                                            var5
                                                         )
                                                         + "px"
                                                      : (
                                                         var1
                                                               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa
                                                            ? var3
                                                               + kUGGsFqpsSP5RuH2I5x0khGCIEnuraaroUzGyFWTcAxPBXDSIPm7qrodZib1rbeDITlwIy9zsW87qIvf9dcA03Y1sSk93VxEM0yj.Button(
                                                                  var5
                                                               )
                                                               + "px"
                                                            : (
                                                               var1
                                                                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8
                                                                  ? var3
                                                                     + kUGGsFqpsSP5RuH2I5x0khGCIEnuraaroUzGyFWTcAxPBXDSIPm7qrodZib1rbeDITlwIy9zsW87qIvf9dcA03Y1sSk93VxEM0yj.BatModClient(
                                                                        var5
                                                                     )
                                                                     + "px"
                                                                  : (
                                                                     var1
                                                                           == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
                                                                        ? var3 + (int)var7 + " chunks"
                                                                        : (
                                                                           var1
                                                                                 == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL
                                                                              ? (
                                                                                 var7 == 0.0F
                                                                                    ? var3
                                                                                       + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                                                                          "options.off"
                                                                                       )
                                                                                    : var3 + (int)var7
                                                                              )
                                                                              : (
                                                                                 var1
                                                                                       == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m
                                                                                    ? var3
                                                                                       + TCPMvsuxtKkaYNzMqWOqWsj19d1GXxpk5mzej5Trx1XBojM6aNHAp7JynUSe1WOwsGMDEVnh0CSgFWx4lImIqBiJf2BiB2eTcKw.BatModClient(
                                                                                          var5
                                                                                       )
                                                                                       + " fps"
                                                                                    : (
                                                                                       var1
                                                                                             == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
                                                                                          ? var3
                                                                                             + TCPMvsuxtKkaYNzMqWOqWsj19d1GXxpk5mzej5Trx1XBojM6aNHAp7JynUSe1WOwsGMDEVnh0CSgFWx4lImIqBiJf2BiB2eTcKw.Button(
                                                                                                var5
                                                                                             )
                                                                                             + " Kbps"
                                                                                          : (
                                                                                             var1
                                                                                                   == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj
                                                                                                ? var3
                                                                                                   + String.format(
                                                                                                      "%.3f bpp",
                                                                                                      TCPMvsuxtKkaYNzMqWOqWsj19d1GXxpk5mzej5Trx1XBojM6aNHAp7JynUSe1WOwsGMDEVnh0CSgFWx4lImIqBiJf2BiB2eTcKw.CustomSpinner(
                                                                                                         var5
                                                                                                      )
                                                                                                   )
                                                                                                : (
                                                                                                   var5 == 0.0F
                                                                                                      ? var3
                                                                                                         + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                                                                                            "options.off"
                                                                                                         )
                                                                                                      : var3 + (int)(var5 * 100.0F) + "%"
                                                                                                )
                                                                                          )
                                                                                    )
                                                                              )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            );
      }

      if (var1.Button()) {
         boolean var6 = this.Button(var1);
         return var6
            ? var3
               + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "options.on"
               )
            : var3
               + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "options.off"
               );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         )
       {
         return var3
            + BatModClient(
               PSbmi7DsXyIuFXivj6mvdDgvGyY3sGlOGGlPumxT07XEfE8EQ5MCyaidc4Nte0U8n4WS7xuCkb3ffKV0PPTvhQHlL0xSrhuIcBMC,
               this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
         )
       {
         return var3
            + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               this.BatModInstallerMain
                  .Button()
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         )
       {
         return var3
            + BatModClient(
               KsH0MwtfYAhEJlUF862jwiMy2pZEUv1ulZ8QRYVaiZ1gV0RKcoEhsFeba78SXzBSE7VWRpWjcjuUnvLs6Bwc1kNeIuoaH3Z1Yia8,
               this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModInstallerMain
         )
       {
         return var3
            + BatModClient(
               Qo72Syi22HIVUiiAdd9NXNBsvIlxiW5cQG47cRiwhTMa7tlaxuMdiPUuEBClxWZED3Fyw0QKHlt5AN4qomMXAWIfvIK0tNjcJMUF,
               this.IntegerSpinner
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
         )
       {
         return var3
            + BatModClient(
               ZhnNhTXe9crzzTUylC0JahHDfGNPCyEnOb2OqkvbH7Bar057g7DRjrVEMJHug4xSrC5wvpJSxULjVuY8Pq7gjZFa1I7RDupfHBlk,
               this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
         )
       {
         return var3
            + BatModClient(
               YtRK8BjzsTggjXOD6DkCjcXC8CXCXKdAQEX8FrueJBaXhjlPRb1xLyBdP4MsdO976zQBZ26fDqwDavPi90Lnj92GleUXQwPSQsSu,
               this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o
         )
       {
         return var3
            + BatModClient(
               MslRoVEB2kSbxcg7IXSCe4LFLFC97mmJ9f4o2C87S1yJ4n5xWehfY82YTaAg91VonNq71K1xA68TrD8BRJYxjNJ6SpqzNrwdo3pI,
               this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt
         )
       {
         return var3
            + BatModClient(
               NZVtMZSkmHhpRsktkfvGU6AzjRMXV6Zy5dCYKetAOLX2hlQvbqzHsVoKbZtWRJQ33NB1mbsQrvYD7xyLmf3JTnTNvGB2Lhkjxtc9,
               this.GsonTypeAdapter
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.TextField
         )
       {
         return var3
            + BatModClient(
               NFEXvfzASCBo1uoADfO7B6Zd2HFrS9cQLXZ1j8I7xQ7tcvlH6T1xCQUszLrHp4Q2bcUEXEGvrIjfFqgn1Lq9961mMvBMiUdNnRz,
               this.BatModProgressBar
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorTextPane
         )
       {
         if (this.ColorChooser) {
            return var3
               + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                  "options.graphics.fancy"
               );
         }

         String var4 = "options.graphics.fast";
         return var3
            + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "options.graphics.fast"
            );
      } else {
         return var3;
      }
   }

   public void BatModClient() {
      try {
         if (!this.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(
            new FileReader(this.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1)
         );
         String var2 = "";
         this.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh.clear();

         while ((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if (var3[0].equals("mouseSensitivity")) {
                  this.BatModClient = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("fov")) {
                  this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = this.BatModClient(
                           var3[1]
                        )
                        * 40.0F
                     + 70.0F;
               }

               if (var3[0].equals("gamma")) {
                  this.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("saturation")) {
                  this.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("invertYMouse")) {
                  this.Button = var3[1].equals("true");
               }

               if (var3[0].equals("renderDistance")) {
                  this.CustomSpinner = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("guiScale")) {
                  this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("particles")) {
                  this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("bobView")) {
                  this.ButtonAction = var3[1].equals("true");
               }

               if (var3[0].equals("anaglyph3d")) {
                  this.Spinner = var3[1].equals("true");
               }

               if (var3[0].equals("maxFps")) {
                  this.ProgressBar = Integer.parseInt(var3[1]);
                  this.Downloader = false;
                  if (this.ProgressBar <= 0) {
                     this.ProgressBar = (int)kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                        .Spinner();
                     this.Downloader = true;
                  }

                  this.IntegerSpinner();
               }

               if (var3[0].equals("fboEnable")) {
                  this.Checkbox = var3[1].equals("true");
               }

               if (var3[0].equals("difficulty")) {
                  this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE = jU5SKygBmC9G3i6deYOdNk31B6ak8YxCox0bCzIvxxEtf941jU22o1i0I2EaPMhoaIbK7gtrBzFQfRNCvhsISY6fLxjUH5u5GxQi.BatModClient(
                     Integer.parseInt(var3[1])
                  );
               }

               if (var3[0].equals("fancyGraphics")) {
                  this.ColorChooser = var3[1].equals("true");
                  this.TextField();
               }

               if (var3[0].equals("ao")) {
                  if (var3[1].equals("true")) {
                     this.IntegerSpinner = 2;
                  } else if (var3[1].equals("false")) {
                     this.IntegerSpinner = 0;
                  } else {
                     this.IntegerSpinner = Integer.parseInt(var3[1]);
                  }
               }

               if (var3[0].equals("renderClouds")) {
                  if (var3[1].equals("true")) {
                     this.BatModProgressBar = 2;
                  } else if (var3[1].equals("false")) {
                     this.BatModProgressBar = 0;
                  } else if (var3[1].equals("fast")) {
                     this.BatModProgressBar = 1;
                  }
               }

               if (var3[0].equals("resourcePacks")) {
                  this.TextField = (List)K664Hzgm2u4k0ypaVNYdaf5aIMS4VsJqTdT1fRKtwzU040sK8ILjlC6jPHhGKx7G8uLKIkHaz26alD5WvEAwk3bPjWWLIoZiOjWA.fromJson(
                     var2.substring(var2.indexOf(58) + 1), TiXRJPDmCp8VesCujodQnrIM1TP59UIgCTgRhHQo7uv40d1mw2MMhcr6KjFADvF4aiHNqXYRA5AQC5I1QnfEgku5e8qJ8ld7LZFt
                  );
                  if (this.TextField == null) {
                     this.TextField = Lists.newArrayList();
                  }
               }

               if (var3[0].equals("incompatibleResourcePacks")) {
                  this.ColorTextPane = (List)K664Hzgm2u4k0ypaVNYdaf5aIMS4VsJqTdT1fRKtwzU040sK8ILjlC6jPHhGKx7G8uLKIkHaz26alD5WvEAwk3bPjWWLIoZiOjWA.fromJson(
                     var2.substring(var2.indexOf(58) + 1), TiXRJPDmCp8VesCujodQnrIM1TP59UIgCTgRhHQo7uv40d1mw2MMhcr6KjFADvF4aiHNqXYRA5AQC5I1QnfEgku5e8qJ8ld7LZFt
                  );
                  if (this.ColorTextPane == null) {
                     this.ColorTextPane = Lists.newArrayList();
                  }
               }

               if (var3[0].equals("lastServer") && var3.length >= 2) {
                  this.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82 = var2.substring(
                     var2.indexOf(58) + 1
                  );
               }

               if (var3[0].equals("lang") && var3.length >= 2) {
                  this.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x = var3[1];
               }

               if (var3[0].equals("chatVisibility")) {
                  this.BatModInstallerMain = UVJYAEvvNl2oY35BYaXPX7TcJAwjxpKnDPLip8Rfml3syFF6nnNjQQiZZhP1NOArwxZn72FjOuxpLtzMjquKR3VM66efPIe2Gt7k.BatModClient(
                     Integer.parseInt(var3[1])
                  );
               }

               if (var3[0].equals("chatColors")) {
                  this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA = var3[1].equals("true");
               }

               if (var3[0].equals("chatLinks")) {
                  this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN = var3[1].equals("true");
               }

               if (var3[0].equals("chatLinksPrompt")) {
                  this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = var3[1].equals("true");
               }

               if (var3[0].equals("chatOpacity")) {
                  this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("snooperEnabled")) {
                  this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ = var3[1].equals("true");
               }

               if (var3[0].equals("fullscreen")) {
                  this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB = var3[1].equals("true");
               }

               if (var3[0].equals("enableVsync")) {
                  this.Downloader = var3[1].equals("true");
                  this.IntegerSpinner();
               }

               if (var3[0].equals("useVbo")) {
                  this.InstallationLogger = var3[1].equals("true");
               }

               if (var3[0].equals("hideServerAddress")) {
                  this.ExitCode = var3[1].equals("true");
               }

               if (var3[0].equals("advancedItemTooltips")) {
                  this.BatModJson = var3[1].equals("true");
               }

               if (var3[0].equals("pauseOnLostFocus")) {
                  this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP = var3[1].equals("true");
               }

               if (var3[0].equals("touchscreen")) {
                  this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8 = var3[1].equals("true");
               }

               if (var3[0].equals("overrideHeight")) {
                  this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4 = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("overrideWidth")) {
                  this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("heldItemTooltips")) {
                  this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = var3[1].equals("true");
               }

               if (var3[0].equals("chatHeightFocused")) {
                  this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("chatHeightUnfocused")) {
                  this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("chatScale")) {
                  this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("chatWidth")) {
                  this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("showInventoryAchievementHint")) {
                  this.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee = var3[1].equals("true");
               }

               if (var3[0].equals("mipmapLevels")) {
                  this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("streamBytesPerPixel")) {
                  this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("streamMicVolume")) {
                  this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("streamSystemVolume")) {
                  this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("streamKbps")) {
                  this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("streamFps")) {
                  this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt = this.BatModClient(
                     var3[1]
                  );
               }

               if (var3[0].equals("streamCompression")) {
                  this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("streamSendMetadata")) {
                  this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu = var3[1].equals("true");
               }

               if (var3[0].equals("streamPreferredServer") && var3.length >= 2) {
                  this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV = var2.substring(
                     var2.indexOf(58) + 1
                  );
               }

               if (var3[0].equals("streamChatEnabled")) {
                  this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("streamChatUserFilter")) {
                  this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11 = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("streamMicToggleBehavior")) {
                  this.GsonTypeAdapter = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("forceUnicodeFont")) {
                  this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc = var3[1].equals("true");
               }

               if (var3[0].equals("allowBlockAlternatives")) {
                  this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = var3[1].equals("true");
               }

               if (var3[0].equals("reducedDebugInfo")) {
                  this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY = var3[1].equals("true");
               }

               if (var3[0].equals("useNativeTransport")) {
                  this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv = var3[1].equals("true");
               }

               if (var3[0].equals("entityShadows")) {
                  this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02 = var3[1].equals("true");
               }

               for (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW var7 : this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn) {
                  if (var3[0].equals("key_" + var7.BatModProgressBar())) {
                     var7.Button(Integer.parseInt(var3[1]));
                  }
               }

               for (chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj var17 : chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj.values()) {
                  if (var3[0]
                     .equals("soundCategory_" + var17.BatModClient())) {
                     this.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh
                        .put(var17, this.BatModClient(var3[1]));
                  }
               }

               for (t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N var18 : t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N.values()) {
                  if (var3[0]
                     .equals("modelPart_" + var18.CustomSpinner())) {
                     this.BatModClient(var18, var3[1].equals("true"));
                  }
               }
            } catch (Exception var8) {
               spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv.warn("Skipping bad option: " + var2);
               var8.printStackTrace();
            }
         }

         QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW.Button();
         var1.close();
      } catch (Exception var9) {
         spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv.error("Failed to load options", var9);
      }

      this.ProgressBar();
   }

   private float BatModClient(String var1) {
      return var1.equals("true") ? 1.0F : (var1.equals("false") ? 0.0F : Float.parseFloat(var1));
   }

   public void Button() {
      if (uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl
         .Button()) {
         Object var1 = uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.ProgressBar(
            uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj
         );
         if (var1 != null
            && uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.Button(
               var1,
               uQpUHzk33HkerRPB5y6QVBEwABFWfj3zZp543kzaXurWKLao3uXJOznTBzfIfAIAJbxNu4aTRtVVr3z7ujduJm4Z3OZVm4GkDFvs.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ
            )) {
            return;
         }
      }

      try {
         PrintWriter var7 = new PrintWriter(
            new FileWriter(this.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1)
         );
         var7.println("invertYMouse:" + this.Button);
         var7.println("mouseSensitivity:" + this.BatModClient);
         var7.println("fov:" + (this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi - 70.0F) / 40.0F);
         var7.println("gamma:" + this.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1);
         var7.println("saturation:" + this.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK);
         var7.println("renderDistance:" + this.CustomSpinner);
         var7.println("guiScale:" + this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g);
         var7.println("particles:" + this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB);
         var7.println("bobView:" + this.ButtonAction);
         var7.println("anaglyph3d:" + this.Spinner);
         var7.println("maxFps:" + this.ProgressBar);
         var7.println("fboEnable:" + this.Checkbox);
         var7.println(
            "difficulty:"
               + this.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE
                  .BatModClient()
         );
         var7.println("fancyGraphics:" + this.ColorChooser);
         var7.println("ao:" + this.IntegerSpinner);
         switch (this.BatModProgressBar) {
            case 0:
               var7.println("renderClouds:false");
               break;
            case 1:
               var7.println("renderClouds:fast");
               break;
            case 2:
               var7.println("renderClouds:true");
         }

         var7.println(
            "resourcePacks:"
               + K664Hzgm2u4k0ypaVNYdaf5aIMS4VsJqTdT1fRKtwzU040sK8ILjlC6jPHhGKx7G8uLKIkHaz26alD5WvEAwk3bPjWWLIoZiOjWA.toJson(
                  this.TextField
               )
         );
         var7.println(
            "incompatibleResourcePacks:"
               + K664Hzgm2u4k0ypaVNYdaf5aIMS4VsJqTdT1fRKtwzU040sK8ILjlC6jPHhGKx7G8uLKIkHaz26alD5WvEAwk3bPjWWLIoZiOjWA.toJson(
                  this.ColorTextPane
               )
         );
         var7.println("lastServer:" + this.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82);
         var7.println("lang:" + this.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x);
         var7.println(
            "chatVisibility:"
               + this.BatModInstallerMain
                  .BatModClient()
         );
         var7.println("chatColors:" + this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA);
         var7.println("chatLinks:" + this.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN);
         var7.println("chatLinksPrompt:" + this.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr);
         var7.println("chatOpacity:" + this.iqUTQzLcr4G7USt8ebV7HMxRVMQTEhVv1BlKhZ05FrJWtrkI4tRVE2dUtW1rbbFBZXTBxCSqbCdWhG7174B3Wp0lQbulAtm3IxpF);
         var7.println("snooperEnabled:" + this.bSALqmlxUoCEmKEx0a3lwGaLLejprOUkOjofxF0C0KpuhqUxhXAQfVMVMmCuFk2RMebQ12SqEyYOMBErHDyC9L41L7WH5mqOh2XJ);
         var7.println("fullscreen:" + this.RJxtuOpLMN8mSKJWtvecVUwMWfHoALW9TctPAw3uJN6reYIN8yZ86a1E9HvVWiWyP17F4DFZZEtdTXh6yUvuiQW9Qn21bMtOriEB);
         var7.println("enableVsync:" + this.Downloader);
         var7.println("useVbo:" + this.InstallationLogger);
         var7.println("hideServerAddress:" + this.ExitCode);
         var7.println("advancedItemTooltips:" + this.BatModJson);
         var7.println("pauseOnLostFocus:" + this.z7lTVWrJFQErSVaWQUypzdDKtRsB8j4hFRVFYaes8wFA6xkO90K8wzhwgYCkNyaHlSSd7Xrxdd1Dom3qC2bkkQ787ofxVXSEbugP);
         var7.println("touchscreen:" + this.LWeUCrSXI0X1TUSj3kdgMZPNXDQMtGVdjYlcuoX3IGlg52ZVXAu55sn6CTBfNGVXG21VO7VkvZoUJZJcydbKeN99pg7F35Nxhf8);
         var7.println("overrideWidth:" + this.xCcvUDSp5KiPSF2iTiVGJefIchpG9vXsmGR8kcgRaeZeGBmaNItWp46MocozUb0pEBosC5pJ23qOcHVFIRQUBWcsIz7jZSWmtuGa);
         var7.println("overrideHeight:" + this.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4);
         var7.println("heldItemTooltips:" + this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL);
         var7.println("chatHeightFocused:" + this.f4NjjuH3UAaMkYDKg4JjKVIV1PiNsOM4T4HUFyWQ5CaEXleTtHn67zbCvMaD8qyMLvZeLv4QkzyMQOIJpmOQimLZV283D81hMfb);
         var7.println("chatHeightUnfocused:" + this.OVft42XaDrpCid053XFq1EPZ8CkxDYortlwtRX4zTf4L5KT5wFCJrMIQs1I0or0K1OcKP82y3PpnybjZEMRPyyEezZIs1zuJDGFF);
         var7.println("chatScale:" + this.sv3zyZxD3xWlWeYYLSruuAtLQlLVOZKZqSxLVzG6LIkZdnBFYCEMpWDCJcCIGmpZLZXeGEhykSNrDIB7ylGQaaBiJWzGovTp1Wyr);
         var7.println("chatWidth:" + this.GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj);
         var7.println(
            "showInventoryAchievementHint:" + this.fDoAJ9W9bXAT89550qV528PlQ3xBSnLnpyVbFpWqc5e8BN9pOqCYta3tS7TuKU1dJl7tt01b3fzVmBCmYvz5SizTFbmamdEnbpee
         );
         var7.println("mipmapLevels:" + this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m);
         var7.println("streamBytesPerPixel:" + this.N5r9mmyiJl9qupxUc6jnbCbAi8OipFTHPUatcuhJZKK1QroIswJzBmJGD2jp3T7EQQmX6UJR9N33K8bXoQt1sEEcM5TBuaKTmmHl);
         var7.println("streamMicVolume:" + this.EqJOiVUYvxDiM8gkwzd1iAfp2jiTGASKxdvBdBMco7cmruIFNVOcqHRMTIOkziggLeP5CAxJrERCwdMX8uh2BleTLP9S00DEbPcj);
         var7.println("streamSystemVolume:" + this.KJBpBZrx7SYvQE6hwF79jvgDw9Qlz9lGaNqke5SLNyatfks2bDEP2RzrTdcCxGBVUCKpMn0F6Yj3QA8UgwBq9umx3CDU4lw8R1rQ);
         var7.println("streamKbps:" + this.WkHLtxh0OBE988n6Z0s69VckSEH7sjJ2sJEkoBxEnB9TRCVCnrzX8qoWr1JeSS1QxNVIPsIB8QiJnFqynvUoIajlh0Sg8n21w13o);
         var7.println("streamFps:" + this.OXiHn4yUSlOUP4kAV8kog6OFjXxn0PRuO4COz26Lq0ilLnotGRRNuaBnh7uhZgmQElMCcIzA31DVhxqMomb5cN7KXGc0anrqbaJt);
         var7.println("streamCompression:" + this.vc1vcQvCMb57ohl4fnHncmfADNI2HiLhnbvKDKbyboq1tjQYZTJWWhxnvRflDZG2Ua8cyVLVIyIjEdfHKjYk6i05W15bM39R7XzP);
         var7.println("streamSendMetadata:" + this.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu);
         var7.println("streamPreferredServer:" + this.ww31cPhIzaBGCu7C6N9NLUlcKVAo5KLtAV5pEaRayswjNp6ENrQSkaNKjj9WE47YcT5DbyyiazfM1ex0Mp9CnKjyju3jPzOVeaxV);
         var7.println("streamChatEnabled:" + this.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i);
         var7.println("streamChatUserFilter:" + this.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11);
         var7.println("streamMicToggleBehavior:" + this.GsonTypeAdapter);
         var7.println("forceUnicodeFont:" + this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc);
         var7.println("allowBlockAlternatives:" + this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM);
         var7.println("reducedDebugInfo:" + this.K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY);
         var7.println("useNativeTransport:" + this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv);
         var7.println("entityShadows:" + this.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02);

         for (QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW var5 : this.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn) {
            var7.println(
               "key_"
                  + var5.BatModProgressBar()
                  + ":"
                  + var5.IntegerSpinner()
            );
         }

         for (chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj var14 : chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj.values()) {
            var7.println(
               "soundCategory_"
                  + var14.BatModClient()
                  + ":"
                  + this.BatModClient(var14)
            );
         }

         for (t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N var15 : t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N.values()) {
            var7.println(
               "modelPart_"
                  + var15.CustomSpinner()
                  + ":"
                  + this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd.contains(var15)
            );
         }

         var7.close();
      } catch (Exception var6) {
         spKz6Mi5xqQI6JvJCkVWBVyFUEf6R5VQYuAh8hN67QteSi5fGxq3k4GLUhcuUlkhIJphTtNmIIHDnYmmH1hWP7Wq8qe3nIUNGzJv.error("Failed to save options", var6);
      }

      this.BatModProgressBar();
      this.CustomSpinner();
   }

   public float BatModClient(
      chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj var1
   ) {
      return this.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh.containsKey(var1)
         ? (Float)this.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh.get(var1)
         : 1.0F;
   }

   public void BatModClient(
      chmqCA1Nj68N7DHD92MSPUwnBcLJoROCH70ogCuBq9PtmDaolmDKosHNDw0YSCyJJCJw30d27Iwk46gAJPnKtZLSiaAcT7TbRJUj var1, float var2
   ) {
      this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
         .mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv()
         .BatModClient(var1, var2);
      this.zygWP4YGkzyk4lX1h7EFyuhaQ7oL3V9xsYSJxHg9UezitlqMrbAoiEN8FBdVHucNtDJNmzO3NZ8HN5GiUXZT0nt7S1B5jn33SEh.put(var1, var2);
   }

   public void CustomSpinner() {
      if (this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj.BatModProgressBar
         != null) {
         int var1 = 0;

         for (Object var3 : this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd) {
            var1 |= ((t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N)var3)
               .BatModClient();
         }

         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .BatModProgressBar
            .BatModClient
            .BatModClient(
               new BAnNL3HqnioCTvoed4xxtnkvnsAfuMAZGF3blYGO0UJru2f1McYHkms8V6t0c5ivS3wWyDUtnbulAYLoLzRQJHeNs71054alCXmk(
                  this.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x,
                  this.CustomSpinner,
                  this.BatModInstallerMain,
                  this.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA,
                  var1
               )
            );
      }
   }

   public Set ButtonAction() {
      return ImmutableSet.copyOf(this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd);
   }

   public void BatModClient(
      t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N var1, boolean var2
   ) {
      if (var2) {
         this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd.add(var1);
      } else {
         this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd.remove(var1);
      }

      this.CustomSpinner();
   }

   public void BatModClient(
      t8LquVaxdvaiUw0ZeXpjQ7hnZfPhAhFIDKp8Q6eWHo1FNlclAq9T4udj41MmEj9mWyuveO5XKYR7tkRwUPbRQVneq2TjuXUdHr5N var1
   ) {
      if (!this.ButtonAction().contains(var1)) {
         this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd.add(var1);
      } else {
         this.WZYwnEmMeJly4ZCK06YCG4FOYNhwxSHZKxZk2vu44J3hxMriq3YGZi5vzBZKAACP45lDwpt4is0m69vMkOJuVa8TGSWlkNnj1AFd.remove(var1);
      }

      this.CustomSpinner();
   }

   public int Spinner() {
      return this.CustomSpinner >= 4
         ? this.BatModProgressBar
         : 0;
   }

   public boolean Checkbox() {
      return this.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv;
   }

   private void Button(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1, float var2
   ) {
      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.kVSwPN5YPc7nU3ChYwQtBMffk4HNpHuscDQqSvPZGoac7kd6VRigFVEe0A1NEsd4k6qTKXBQ1UgcrbAuHLHPEye9s8kWvw7ksgcc
         )
       {
         this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae = var2;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.amn2nKWHy3tKP1me3vWZAo3kCxxPLsyRXVgXMbtDm2IVfNnNvbVZG9g76zrNiHKMhz8BB70vWV6eB6u7sCEWciPBDCHg1XecGpY
         )
       {
         this.JavaVersion = var2;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06
         )
       {
         int var3 = (int)var2;
         if (var3 > 0
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.aa.shaders1"
               ),
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.aa.shaders2"
               )
            );
            return;
         }

         int[] var4 = new int[]{0, 2, 4, 6, 8, 12, 16};
         this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = 0;

         for (int var5 = 0; var5 < var4.length; var5++) {
            if (var3 >= var4[var5]) {
               this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = var4[var5];
            }
         }

         this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu, 0, 16
         );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.JavaVersion
         )
       {
         int var6 = (int)var2;
         if (var6 > 1
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.af.shaders1"
               ),
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.af.shaders2"
               )
            );
            return;
         }

         this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = 1;

         while (this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb * 2 <= var6) {
            this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb *= 2;
         }

         this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb, 1, 16
         );
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .Spinner();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GsonTypeAdapter
         )
       {
         int var7 = (int)var2;
         this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
            var7, 0, 3
         );
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .Spinner();
      }
   }

   private void Button(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1, int var2
   ) {
      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
         )
       {
         switch (this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx) {
            case 1:
               this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 2;
               if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Spinner()
                  )
                {
                  this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 3;
               }
               break;
            case 2:
               this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 3;
               break;
            case 3:
               this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 1;
               break;
            default:
               this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 1;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11
         )
       {
         this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 += 0.2F;
         if (this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 > 0.81F) {
            this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = 0.2F;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv
         )
       {
         this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 = !this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
         )
       {
         this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM = !this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM;
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.ColorTextPane();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02
         )
       {
         this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68++;
         if (this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 > 3) {
            this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 = 0;
         }

         this.TextField();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
         )
       {
         this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX = BatModClient(
            this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX,
            vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh
         );
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
         )
       {
         this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX++;
         if (this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX > 2) {
            this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
         )
       {
         this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz++;
         if (this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz > 3) {
            this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP
         )
       {
         this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt++;
         if (this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt == 1) {
            this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt++;
         }

         if (this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt > 2) {
            this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
         )
       {
         this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD++;
         if (this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD == 1) {
            this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD++;
         }

         if (this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD > 2) {
            this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf
         )
       {
         this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B = !this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj
         )
       {
         this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u = !this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W
         )
       {
         this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 = !this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz
         )
       {
         this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 = !this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1
         )
       {
         this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl = !this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF
         )
       {
         this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza = !this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
         )
       {
         this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj = !this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
         )
       {
         this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D = !this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82
         )
       {
         this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5 = !this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr
         )
       {
         this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0 = !this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fdWwz8f4KFCqAE9dJn6mau1WTLndFo20uW0xKGHrGzxKLLekdm6Au5JckJN97q44pOxYege3lGXnjUzxAOzU02jeru5UtgB2VOo4
         )
       {
         this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f = !this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1
         )
       {
         this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI = !this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB
         )
       {
         this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8 = !this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu
         )
       {
         this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC = !this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv
         )
       {
         this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF = !this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9
         )
       {
         this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw = !this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS
         )
       {
         this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI = !this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
         )
       {
         this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz *= 10;
         if (this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz > 40000) {
            this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz = 40;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI
         )
       {
         this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR++;
         if (this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR > 3) {
            this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR = 1;
         }

         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5
         )
       {
         this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb++;
         if (this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb > 3) {
            this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb = 1;
         }

         if (this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb != 2) {
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .Spinner();
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C
         )
       {
         this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP = !this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk
         )
       {
         this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG = !this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl
         )
       {
         this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB = !this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I
         )
       {
         this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju = !this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
         )
       {
         this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI++;
         if (this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI > 2) {
            this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn
         )
       {
         this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4++;
         if (this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 > 5) {
            this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 = 1;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
         )
       {
         this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV = !this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE
         )
       {
         this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2++;
         if (this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 > 2) {
            this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 = 0;
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
         )
       {
         this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq = !this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq;
         this.ColorTextPane();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi
         )
       {
         this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6 = !this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK
         )
       {
         this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B = !this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x
         )
       {
         this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe = !this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe;
         lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button();
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc
         )
       {
         this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc = !this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc;
         xPuAtUT6z6M1r3eYhSWDTuNhaZTHagaHHRO19BVSI0IhpDBX2TDpdlTmWNxbu7giFxHBRVoTFgyQTt2NMSWd0u4vXP6GdOgGYOxo.BatModClient();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx
         )
       {
         this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1 = !this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1;
         lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.Button();
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9
         )
       {
         this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ = !this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ColorTextPane
            .BatModClient(
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
            );
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .BatModInstallerMain
            .BatModClient(
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV()
            );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ
         )
       {
         this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf = !this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf;
         lNNqOLzvzcA8FfPsgNjBhvgM43UBACuRZ2pr4tH344QTdGZVvQi2XSLORyETE3McQLpkMODP0slgvG3kEMzWPNO9xzT6xhFW9ljV.BatModClient();
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM
         )
       {
         this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns = !this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns;
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .Spinner();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz
         )
       {
         this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ = !this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ;
         tbAdtjrVjTZnDNn67UBl9ovZNe5ulWEncmbDdjnupGrmQTMNmgLzPAIyD0xCV8FHIXTNfUaCKS8OEBoei8FbYSZSdtsBoi5hx2Ru.Button();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW
         )
       {
         this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6 = !this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb
         )
       {
         this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 = !this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15;
         D9m3CWO7lnOl3Z9XCw1yItlneOj7JFVkLYzZUzazDhuz4rcvLjNP8PTCbvGi8K8P42enQZArxWGY9b3brk5PYLGupeinzA7StVrz.BatModClient();
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX
         )
       {
         this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO = !this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO;
         u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox = this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR
         )
       {
         if (!this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i
            && xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68()
            )
          {
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.CustomSpinner(
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.fr.shaders1"
               ),
               FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                  "of.message.fr.shaders2"
               )
            );
            return;
         }

         this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i = !this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i;
         if (this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i) {
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr
               .Button();
         }

         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz
         )
       {
         if (this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq == 0) {
            this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 1;
         } else if (this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq == 1) {
            this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 2;
         } else if (this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq == 2) {
            this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 0;
         } else {
            this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 0;
         }

         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX
         )
       {
         this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06 = !this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06;
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR();
         if (!xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz()
            )
          {
            this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06 = false;
         }

         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .ProgressBar
            .ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g
         )
       {
         List var3 = Arrays.asList(
            xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK()
         );
         if (this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7.equals("Default")) {
            this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = (String)var3.get(0);
         } else {
            int var4 = var3.indexOf(this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7);
            if (var4 < 0) {
               this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = "Default";
            } else if (++var4 >= var3.size()) {
               this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = "Default";
            } else {
               this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = (String)var3.get(var4);
            }
         }
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw
         )
       {
         this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP = !this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP;
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6
         )
       {
         this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn = BatModClient(
            this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn,
            oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
         );
         uiPCoYrdWwm2JOc0cS2dcByuBVa7vUrWj8xExFwVTySunRgnqdco98FWp2jCxd1ikrXdXXMnkEhPFBYLKMogeDGH1fHqjKIf5NAo.Button(
            this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj.ProgressBar
         );
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68
         )
       {
         this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = !this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL;
      }
   }

   private String ButtonAction(
      kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa var1
   ) {
      String var2 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            var1.ButtonAction()
         )
         + ": ";
      if (var2 == null) {
         var2 = var1.ButtonAction();
      }

      if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Checkbox
         )
       {
         int var10 = (int)this.BatModClient(var1);
         String var4 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
            "options.renderDistance.tiny"
         );
         byte var5 = 2;
         if (var10 >= 4) {
            var4 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "options.renderDistance.short"
            );
            var5 = 4;
         }

         if (var10 >= 8) {
            var4 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "options.renderDistance.normal"
            );
            var5 = 8;
         }

         if (var10 >= 16) {
            var4 = rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
               "options.renderDistance.far"
            );
            var5 = 16;
         }

         if (var10 >= 32) {
            var4 = FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
               "of.options.renderDistance.extreme"
            );
            var5 = 32;
         }

         int var6 = this.CustomSpinner - var5;
         String var7 = var4;
         if (var6 > 0) {
            var7 = var4 + "+";
         }

         return var2 + var10 + " " + var7 + "";
      } else if (var1
         == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fez8AdP0jZfhB7lOIa9sS59KIuwi3YNx1M2p0aMHKri55lbVVbxnvGDY6kCd6lzwl9tAxTxZusJ5gNakHQVVByOcQttcc1sIoC0i
         )
       {
         switch (this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx) {
            case 1:
               return var2
                  + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
            case 2:
               return var2
                  + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
            case 3:
               return var2
                  + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
            default:
               return var2
                  + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
         }
      } else {
         if (var1
            == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.dt1RCwtidkkY41F4ZY7G1aeJE8wTlGMPusya4jQ85B0YQr9TNzFbJB2Kin7CtBGtJ5yBTgb8BBgW8FMAh09eULomEIdKZYJ6eW11
            )
          {
            return var2 + this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9;
         }

         if (var1
            == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GsonTypeAdapter
            )
          {
            switch (this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ) {
               case 0:
                  return var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                        "of.options.mipmap.nearest"
                     );
               case 1:
                  return var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                        "of.options.mipmap.linear"
                     );
               case 2:
                  return var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                        "of.options.mipmap.bilinear"
                     );
               case 3:
                  return var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                        "of.options.mipmap.trilinear"
                     );
               default:
                  return var2 + "of.options.mipmap.nearest";
            }
         } else {
            if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv
               )
             {
               return this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5
                  ? var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                  : var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
            }

            if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2
               )
             {
               return this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM
                  ? var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                  : var2
                     + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
            }

            if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.xYb9nF2jGaP2YVrbgJeVIqgthxK5HsfptD48p5v1PvM4CU5ywwZ7Z0u5y5fXFtP9EVWkjPoxqIy5PuE38hifTU4Jx0t7vTuytM02
               )
             {
               switch (this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                  case 3:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox();
               }
            } else if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.zZGv4q9CNyyaAAHHsvxmUcurRLnM0QnAh5iUzPTgBncwxq2oBU0CH0hlNCyKDhK1RajZSlwiyFibhPu9ql309DvDblAnFXaX5TN3
               )
             {
               switch (this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                  case 3:
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox();
                  case 4:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                           "of.general.smart"
                        );
               }
            } else if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae
               )
             {
               switch (this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox();
               }
            } else if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.TwGyDnjIchVF0l2DPnylUfwFmpuX5QluyfslAcoyZKDd5hWYAc87NT6rLEbCFsiFEh7FhBYFtHRsxz9hcgl3tcdGWLwuka6ooUxJ
               )
             {
               switch (this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                  case 3:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox();
               }
            } else if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.kRgnDZ05QynRaP5naeoBgLM5HcwcEUBIzV3fGokcRxXNQGK55onbwDUfE1NjdZHPihnA6UQTIo61LSmBeRu0p8ugNkLKSI9NVScP
               )
             {
               switch (this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                           "of.options.animation.dynamic"
                        );
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button();
               }
            } else if (var1
               == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.FADAUWHNNvc5mYdDF7YdrF9AmOze4NuwJ3NivSAzsjyItTcM7ajimsBzoFCEBmmF58pGBtjJstkda9HiIkgMchNVE0K6LObhqwuV
               )
             {
               switch (this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD) {
                  case 1:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                           "of.options.animation.dynamic"
                        );
                  case 2:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  default:
                     return var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button();
               }
            } else {
               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.sYnUURIAVBn5alv5OIWfx1VLlOfT3WWU56uCbgwb5jFQGu2Mx1vpkVOFNd6tNSVUTz961VTROqHcMITzDqQXPBvp6LdlJFJxhNQf
                  )
                {
                  return this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.SVmetKctmg5Lm2zqsZSqcw7YNSPVjkttADUKnhKFcbxpTMy11LmW4T1UuO7yE0RmFHU4zMWdkyr2hzo1Ipx0bu4BfmWNP2SuRkBj
                  )
                {
                  return this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.GTTFIpW7LKqGKoWGA47cvb3R5ReJdfyazRf94cakcY1SpiFs1VSJHig8p3R2L4mCl8t4FvUCnwW4eVIoXQeKbwTt7D90bMhTto7W
                  )
                {
                  return this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.reBVl7yfwB6jG1tjPNyF5dLNOL952zqPCpbgvinOK5i60q4az9065mMTV6lTqaa7To8zXm5MC4ThCJhwvxhorIlHXClWOr1Ec3Hz
                  )
                {
                  return this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.UuzPUP8V6ljrsbiRuiHGoCof0stQ6uZVxe53TG9NGrArBTaaDyMWMg51xyblfCVDr3TCm2K19SVldxX3JU4dmo1TclFkmKhVcqH1
                  )
                {
                  return this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.AFZqwomB5IiIT5JcKtpFSLwJ0DUWrsDs2kcs3HqwmJXrB1Q2GCH2a6QYnXWLNJMRsyseQaZzgaog9wGINziifkVRBArINmlyLYF
                  )
                {
                  return this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o
                  )
                {
                  return this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n
                  )
                {
                  return this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ujUvuz4WyO6KoH1kqyAYetKlhzPeqhJYrlcw4WEnxC5xzhepgcfvLGNVE3iaZoqsbxiWt1wSduLhMcgeZzoiKvZye9DJRdI2yr82
                  )
                {
                  return this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.H5AfuPi6A5dR1CMugDXgAoLQyJOF06VOkDTd7xZhA4PQTQa65SGEWInSjIFDT4he5MqClJs80ceNMzYDIqSK0srjcdqq9co84vr
                  )
                {
                  return this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fdWwz8f4KFCqAE9dJn6mau1WTLndFo20uW0xKGHrGzxKLLekdm6Au5JckJN97q44pOxYege3lGXnjUzxAOzU02jeru5UtgB2VOo4
                  )
                {
                  return this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1
                  )
                {
                  return this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB
                  )
                {
                  return this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu
                  )
                {
                  return this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BGJk2IUiOBY8ec5KrYntsraFMINNKbNXHEIybI4nCnm7YXZ8HYrZYh6DNJsm4OOGik3A33iazvmTdVQYBSFyI7igcey5MxTDZkUv
                  )
                {
                  return this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.keMzg5IFkNFDG0vnOBOkmhCjema56TImwNe7PCGtt3KuLrBlGB4zwGMf69bN45k5obJa5gOYmGtBg8R2mtNnqxxhni2TOanJzop9
                  )
                {
                  return this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.oRBfDoSicac5NqLpCnXYvCdc1TeeKDZ8McXElEJTjVX66dtWnX3Rak5OPebywmc5bgUlZJUrCXAicNCEybsow6E74VNPVD8KzS
                  )
                {
                  return this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                     : var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.JRX61gzwOzWiu4l0VeUKDdjnv5wotDlpxO8vcnCaLlV5BECGPBqixi6vk9enie9tZFu4e3JVLux3SrFL5JIYxKf5lb45cfTjoGOh
                  )
                {
                  return this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz <= 40
                     ? var2
                        + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                           "of.options.save.default"
                        )
                     : (
                        this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz <= 400
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                 "of.options.save.20s"
                              )
                           : (
                              this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz <= 4000
                                 ? var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                       "of.options.save.3min"
                                    )
                                 : var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                       "of.options.save.30min"
                                    )
                           )
                     );
               }

               if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Cg2oCTxHXPp28ppSuJJV9GWg6aduGKf1avntN6JebEnu4gm3oT3O7gDbjvCTmsSkieYdMi9CVQz2TxvBZ5Bx07QxIz2MP7UVyFI
                  )
                {
                  switch (this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR) {
                     case 1:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                     case 2:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                     default:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }
               } else if (var1
                  == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5
                  )
                {
                  switch (this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb) {
                     case 1:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                     case 2:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                     default:
                        return var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }
               } else {
                  if (var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.gUyxxfEjXoDLNAgHHUnP1AMzZ8ioixY9BAypjiusQEsJz9UHusz3wCxRyuPTmNoGYvgKCMk4SmLTZozyxCaTcETlvh2e1rGmV1C
                     )
                   {
                     return this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP
                        ? var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                        : var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }

                  if (var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.G9TE2qID2CrD7fIK0uBLyYE9xKN19FMGiULTDdqjDFmDfGUMjvSjc9eeoEyh7VW7es8akQ9kZHkiD9JxwtJgPDRGtVkS2dITyPSk
                     )
                   {
                     return this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG
                        ? var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                        : var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }

                  if (var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.LZfWw69seswzCwS2aLIETt9adtos81ZGbTny7x0uDxh11SiJvs3dE4IVvvAdj1kYIXCSG2jM9iYWTS1QAV94bWfSJkmTzhgsaLyl
                     )
                   {
                     return this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB
                        ? var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                        : var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }

                  if (var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.AhJmxLgoYUHtXqEsXuAO10GGPI1adOTRWWQW3c9ENa2fWdAVPasdqyNzQGetsLHGzC9GIpZXvmI22tJBxqoZw7u1SGfguYwRKd0I
                     )
                   {
                     return this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju
                        ? var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                        : var2
                           + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                  }

                  if (var1
                     == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.aDDhjWj969sz6IzgOMTkzXNC2CnicjlTllf19oeduNo3K8AyvcmWQFlzs9tD0AIeTR1i4EX7JPcBR2B0QHhCq7mYm9pgZ3DZ1UAH
                     )
                   {
                     switch (this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI) {
                        case 1:
                           return var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction();
                        case 2:
                           return var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner();
                        default:
                           return var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox();
                     }
                  } else {
                     if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.HIcIxKl1ySwMm70kI5Z7Ey7bZ11qFTYMmoRGkmweVrhs5fhV5N27WSwlIbSHqHycux8EyXiUr8ggbJzHd3Gjf6Yag83nRt11OyLn
                        )
                      {
                        return var2 + this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4;
                     }

                     if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
                        )
                      {
                        return this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     }

                     if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE
                        )
                      {
                        return this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 == 1
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                 "of.options.time.dayOnly"
                              )
                           : (
                              this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 == 2
                                 ? var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                       "of.options.time.nightOnly"
                                    )
                                 : var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox()
                           );
                     }

                     if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR
                        )
                      {
                        return this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     }

                     if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06
                        )
                      {
                        String var9 = "";
                        if (this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu
                           != xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR()
                           )
                         {
                           var9 = " ("
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                 "of.general.restart"
                              )
                              + ")";
                        }

                        return this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu == 0
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner()
                              + var9
                           : var2 + this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu + var9;
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.JavaVersion
                        )
                      {
                        return this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb == 1
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner()
                           : var2 + this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb;
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi
                        )
                      {
                        return this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.I6LkhDoyobAZpUWR7u8TLy96BaEzLD6NsEfZ1WToN49InL8ZmXzTR7xLAiP8QMALeyDHn6dbCQa1qdSAuOjVLAu5yoLQUJN6UcxK
                        )
                      {
                        return this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.fLmGOkwOPmHOap4nPTkouovf2QA5jja1joaM8iQnhYAAvE9eWq7nXGgibwTZ8mII2fyn3iqZSpaM47p9AIjhmoIqHu0IlGjSnJ9x
                        )
                      {
                        return this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc
                        )
                      {
                        return this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx
                        )
                      {
                        return this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9
                        )
                      {
                        return this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ
                        )
                      {
                        return this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz
                        )
                      {
                        return this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW
                        )
                      {
                        return this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM
                        )
                      {
                        return this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb
                        )
                      {
                        return this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX
                        )
                      {
                        return this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR
                        )
                      {
                        return this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz
                        )
                      {
                        return this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq == 1
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.ButtonAction()
                           : (
                              this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq == 2
                                 ? var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Spinner()
                                 : var2
                                    + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox()
                           );
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX
                        )
                      {
                        return this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw
                        )
                      {
                        return this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6
                        )
                      {
                        int var8 = CustomSpinner(
                           this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn,
                           oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                        );
                        return var2
                           + BatModClient(
                              jTgLJTOpvAM1u131hq6rfe11RPpvVuFMGqZHlmyAC5jkqmHR6hMpdYG2OEFByo232WIM2mP1sH2XkGod4iMSIP9fZWBGoNmwPADt, var8
                           );
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g
                        )
                      {
                        return this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7.equals("Default")
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Checkbox()
                           : var2 + this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7;
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68
                        )
                      {
                        return this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.Button()
                           : var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.CustomSpinner();
                     } else if (var1
                        == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
                        )
                      {
                        float var3 = this.BatModClient(var1);
                        return var3 == 0.0F
                           ? var2
                              + FLnl2zjuTJaJY1kNjjMM6nZS55eciKlmOVQtCP6W2G7fDRN79ex2Gwwc2ykG2r2FA74tLSFAfiGjnQe9SxOnYgUN1e5aIsYWwaZb.BatModClient(
                                 "of.options.framerateLimit.vsync"
                              )
                           : (
                              var3
                                    == kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.BatModClient(
                                       var1
                                    )
                                 ? var2
                                    + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.BatModClient(
                                       "options.framerateLimit.max"
                                    )
                                 : var2 + (int)var3 + " fps"
                           );
                     } else {
                        return null;
                     }
                  }
               }
            }
         }
      }
   }

   public void ProgressBar() {
      try {
         File var1 = this.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87;
         if (!var1.exists()) {
            var1 = this.idbKPFfckI2cKE2PslPTY8nRPqbajONaMxHzaxEFVLgTv7NTJ7ILQb5mZKskQ0XMpTmG7oJYCbCgmU7OWZNCsi7sNGXLvuWuL1Z1;
         }

         if (!var1.exists()) {
            return;
         }

         BufferedReader var2 = new BufferedReader(new FileReader(var1));
         String var3 = "";

         while ((var3 = var2.readLine()) != null) {
            try {
               String[] var4 = var3.split(":");
               if (var4[0].equals("ofRenderDistanceChunks") && var4.length >= 2) {
                  this.CustomSpinner = Integer.valueOf(var4[1]);
                  this.CustomSpinner = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.CustomSpinner, 2, 32
                  );
               }

               if (var4[0].equals("ofFogType") && var4.length >= 2) {
                  this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = Integer.valueOf(var4[1]);
                  this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx, 1, 3
                  );
               }

               if (var4[0].equals("ofFogStart") && var4.length >= 2) {
                  this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = Float.valueOf(var4[1]);
                  if (this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 < 0.2F) {
                     this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = 0.2F;
                  }

                  if (this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 > 0.81F) {
                     this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = 0.8F;
                  }
               }

               if (var4[0].equals("ofMipmapType") && var4.length >= 2) {
                  this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ = Integer.valueOf(var4[1]);
                  this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ, 0, 3
                  );
               }

               if (var4[0].equals("ofOcclusionFancy") && var4.length >= 2) {
                  this.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothFps") && var4.length >= 2) {
                  this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothWorld") && var4.length >= 2) {
                  this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAoLevel") && var4.length >= 2) {
                  this.JavaVersion = Float.valueOf(var4[1]);
                  this.JavaVersion = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.JavaVersion, 0.0F, 1.0F
                  );
               }

               if (var4[0].equals("ofClouds") && var4.length >= 2) {
                  this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 = Integer.valueOf(var4[1]);
                  this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68, 0, 3
                  );
                  this.TextField();
               }

               if (var4[0].equals("ofCloudsHeight") && var4.length >= 2) {
                  this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae = Float.valueOf(var4[1]);
                  this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae, 0.0F, 1.0F
                  );
               }

               if (var4[0].equals("ofTrees") && var4.length >= 2) {
                  this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX = Integer.valueOf(var4[1]);
                  this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX = Button(
                     this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX,
                     vi6ZoxPFtBAYfPzYPuP5xJvSB09JzfFrtyDr1gVxTJ4bZ46hsVZLuUedPuVtDM4vqDigpJsouFBiNufhwqZU7X4t5siQEO3kPYSh
                  );
               }

               if (var4[0].equals("ofDroppedItems") && var4.length >= 2) {
                  this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX = Integer.valueOf(var4[1]);
                  this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX, 0, 2
                  );
               }

               if (var4[0].equals("ofRain") && var4.length >= 2) {
                  this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz = Integer.valueOf(var4[1]);
                  this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz, 0, 3
                  );
               }

               if (var4[0].equals("ofAnimatedWater") && var4.length >= 2) {
                  this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = Integer.valueOf(var4[1]);
                  this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt, 0, 2
                  );
               }

               if (var4[0].equals("ofAnimatedLava") && var4.length >= 2) {
                  this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = Integer.valueOf(var4[1]);
                  this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD, 0, 2
                  );
               }

               if (var4[0].equals("ofAnimatedFire") && var4.length >= 2) {
                  this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedPortal") && var4.length >= 2) {
                  this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedRedstone") && var4.length >= 2) {
                  this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedExplosion") && var4.length >= 2) {
                  this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedFlame") && var4.length >= 2) {
                  this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedSmoke") && var4.length >= 2) {
                  this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVoidParticles") && var4.length >= 2) {
                  this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofWaterParticles") && var4.length >= 2) {
                  this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPortalParticles") && var4.length >= 2) {
                  this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPotionParticles") && var4.length >= 2) {
                  this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFireworkParticles") && var4.length >= 2) {
                  this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDrippingWaterLava") && var4.length >= 2) {
                  this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTerrain") && var4.length >= 2) {
                  this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTextures") && var4.length >= 2) {
                  this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRainSplash") && var4.length >= 2) {
                  this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLagometer") && var4.length >= 2) {
                  this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowFps") && var4.length >= 2) {
                  this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAutoSaveTicks") && var4.length >= 2) {
                  this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz = Integer.valueOf(var4[1]);
                  this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz, 40, 40000
                  );
               }

               if (var4[0].equals("ofBetterGrass") && var4.length >= 2) {
                  this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR = Integer.valueOf(var4[1]);
                  this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR, 1, 3
                  );
               }

               if (var4[0].equals("ofConnectedTextures") && var4.length >= 2) {
                  this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb = Integer.valueOf(var4[1]);
                  this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb, 1, 3
                  );
               }

               if (var4[0].equals("ofWeather") && var4.length >= 2) {
                  this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSky") && var4.length >= 2) {
                  this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofStars") && var4.length >= 2) {
                  this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSunMoon") && var4.length >= 2) {
                  this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVignette") && var4.length >= 2) {
                  this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI = Integer.valueOf(var4[1]);
                  this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI, 0, 2
                  );
               }

               if (var4[0].equals("ofChunkUpdates") && var4.length >= 2) {
                  this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 = Integer.valueOf(var4[1]);
                  this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4, 1, 5
                  );
               }

               if (var4[0].equals("ofChunkUpdatesDynamic") && var4.length >= 2) {
                  this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTime") && var4.length >= 2) {
                  this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 = Integer.valueOf(var4[1]);
                  this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2, 0, 2
                  );
               }

               if (var4[0].equals("ofClearWater") && var4.length >= 2) {
                  this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq = Boolean.valueOf(var4[1]);
                  this.ColorTextPane();
               }

               if (var4[0].equals("ofAaLevel") && var4.length >= 2) {
                  this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = Integer.valueOf(var4[1]);
                  this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu, 0, 16
                  );
               }

               if (var4[0].equals("ofAfLevel") && var4.length >= 2) {
                  this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = Integer.valueOf(var4[1]);
                  this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb, 1, 16
                  );
               }

               if (var4[0].equals("ofProfiler") && var4.length >= 2) {
                  this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBetterSnow") && var4.length >= 2) {
                  this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSwampColors") && var4.length >= 2) {
                  this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRandomMobs") && var4.length >= 2) {
                  this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothBiomes") && var4.length >= 2) {
                  this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomFonts") && var4.length >= 2) {
                  this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomColors") && var4.length >= 2) {
                  this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomItems") && var4.length >= 2) {
                  this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomSky") && var4.length >= 2) {
                  this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowCapes") && var4.length >= 2) {
                  this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofNaturalTextures") && var4.length >= 2) {
                  this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLazyChunkLoading") && var4.length >= 2) {
                  this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicFov") && var4.length >= 2) {
                  this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicLights") && var4.length >= 2) {
                  this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn = Integer.valueOf(var4[1]);
                  this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn = Button(
                     this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn,
                     oBQpWXgPWEU9ZvZHLxoDU7ODXty0aw4FyAPByhnckeYCzOeNadzTFRxid3AqTUkGjDiWvsQQfUjDg1mIB0MQw3hKplhTw1JjnRTn
                  );
               }

               if (var4[0].equals("ofFullscreenMode") && var4.length >= 2) {
                  this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = var4[1];
               }

               if (var4[0].equals("ofFastMath") && var4.length >= 2) {
                  this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO = Boolean.valueOf(var4[1]);
                  u4L2raCRW4IaxQDTMTkLSzlPPuZcdlIz0ZOemtSZ590eQlF5phhjcz9AjgDml3JLkKDI91FuMRnQzu4nUzDxPrtX19Vazyl9vOfr.Checkbox = this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO;
               }

               if (var4[0].equals("ofFastRender") && var4.length >= 2) {
                  this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTranslucentBlocks") && var4.length >= 2) {
                  this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = Integer.valueOf(var4[1]);
                  this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                     this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq, 0, 2
                  );
               }

               if (var4[0]
                  .equals(
                     "key_"
                        + this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p
                           .BatModProgressBar()
                  )) {
                  this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p
                     .Button(Integer.parseInt(var4[1]));
               }
            } catch (Exception var5) {
               xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.BatModClient(
                  "Skipping bad option: " + var3
               );
               var5.printStackTrace();
            }
         }

         QKovA4oaZ0chc9PjLSQ8yZv9Wbhle7c2rATTaAHKZdPEofkSiU03oWhoOUuHIC64BN6BnjkIV0yEgYrAKfDAbXDFA4uEfDPmevW.Button();
         var2.close();
      } catch (Exception var6) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Failed to load options"
         );
         var6.printStackTrace();
      }
   }

   public void BatModProgressBar() {
      try {
         PrintWriter var1 = new PrintWriter(
            new FileWriter(this.DuENgPBjcPXO1Y0rUhrxc56mrSMQBz4tv38VGvS5Cz2L9gRsNRfqHZZJjYrzEbWUU0TAiRDDE0avLyYB1kes0d6p0kJRvWkOsv87)
         );
         var1.println("ofRenderDistanceChunks:" + this.CustomSpinner);
         var1.println("ofFogType:" + this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx);
         var1.println("ofFogStart:" + this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9);
         var1.println("ofMipmapType:" + this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ);
         var1.println("ofOcclusionFancy:" + this.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW);
         var1.println("ofSmoothFps:" + this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5);
         var1.println("ofSmoothWorld:" + this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM);
         var1.println("ofAoLevel:" + this.JavaVersion);
         var1.println("ofClouds:" + this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68);
         var1.println("ofCloudsHeight:" + this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae);
         var1.println("ofTrees:" + this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX);
         var1.println("ofDroppedItems:" + this.b3NHK0RgJKZw5fPcxkySBhTqIQ8bauZtj1IlJTbVF5f8A3KPbUlb5bXIUzQO52rVdzAw8tHzzrx8s8Z1WzMQAUU0SQD8AmyN4AKX);
         var1.println("ofRain:" + this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz);
         var1.println("ofAnimatedWater:" + this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt);
         var1.println("ofAnimatedLava:" + this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD);
         var1.println("ofAnimatedFire:" + this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B);
         var1.println("ofAnimatedPortal:" + this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u);
         var1.println("ofAnimatedRedstone:" + this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0);
         var1.println("ofAnimatedExplosion:" + this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1);
         var1.println("ofAnimatedFlame:" + this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl);
         var1.println("ofAnimatedSmoke:" + this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza);
         var1.println("ofVoidParticles:" + this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj);
         var1.println("ofWaterParticles:" + this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D);
         var1.println("ofPortalParticles:" + this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5);
         var1.println("ofPotionParticles:" + this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0);
         var1.println("ofFireworkParticles:" + this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f);
         var1.println("ofDrippingWaterLava:" + this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI);
         var1.println("ofAnimatedTerrain:" + this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8);
         var1.println("ofAnimatedTextures:" + this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC);
         var1.println("ofRainSplash:" + this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF);
         var1.println("ofLagometer:" + this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw);
         var1.println("ofShowFps:" + this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI);
         var1.println("ofAutoSaveTicks:" + this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz);
         var1.println("ofBetterGrass:" + this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR);
         var1.println("ofConnectedTextures:" + this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb);
         var1.println("ofWeather:" + this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP);
         var1.println("ofSky:" + this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG);
         var1.println("ofStars:" + this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB);
         var1.println("ofSunMoon:" + this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju);
         var1.println("ofVignette:" + this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI);
         var1.println("ofChunkUpdates:" + this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4);
         var1.println("ofChunkUpdatesDynamic:" + this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV);
         var1.println("ofTime:" + this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2);
         var1.println("ofClearWater:" + this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq);
         var1.println("ofAaLevel:" + this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu);
         var1.println("ofAfLevel:" + this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb);
         var1.println("ofProfiler:" + this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6);
         var1.println("ofBetterSnow:" + this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B);
         var1.println("ofSwampColors:" + this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe);
         var1.println("ofRandomMobs:" + this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc);
         var1.println("ofSmoothBiomes:" + this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1);
         var1.println("ofCustomFonts:" + this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ);
         var1.println("ofCustomColors:" + this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf);
         var1.println("ofCustomItems:" + this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns);
         var1.println("ofCustomSky:" + this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ);
         var1.println("ofShowCapes:" + this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6);
         var1.println("ofNaturalTextures:" + this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15);
         var1.println("ofLazyChunkLoading:" + this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06);
         var1.println("ofDynamicFov:" + this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP);
         var1.println("ofDynamicLights:" + this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn);
         var1.println("ofFullscreenMode:" + this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7);
         var1.println("ofFastMath:" + this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO);
         var1.println("ofFastRender:" + this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i);
         var1.println("ofTranslucentBlocks:" + this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq);
         var1.println(
            "key_"
               + this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p
                  .BatModProgressBar()
               + ":"
               + this.DjdSwbSu3B544IpZcuAXHO8OGNZSIuUxcywlmbZ41naAZIP13jBxDCGk37dVqtqtQ2xPOKQZeXvKTyh9pkdAPCbQlATdVMZcwv7p
                  .IntegerSpinner()
         );
         var1.close();
      } catch (Exception var2) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.Button(
            "Failed to save options"
         );
         var2.printStackTrace();
      }
   }

   private void TextField() {
      switch (this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68) {
         case 1:
            this.BatModProgressBar = 1;
            break;
         case 2:
            this.BatModProgressBar = 2;
            break;
         case 3:
            this.BatModProgressBar = 0;
            break;
         default:
            if (this.ColorChooser) {
               this.BatModProgressBar = 2;
            } else {
               this.BatModProgressBar = 1;
            }
      }
   }

   public void ColorChooser() {
      this.CustomSpinner = 8;
      this.ButtonAction = true;
      this.Spinner = false;
      this.ProgressBar = (int)kVPXZfM75OnCGSE6SXblWMhomlNeBYGl2m0rSB6BxDjGDH1f1xImp651XQfEqcbEGUkeBBWcvmdpX2egUqWUNaehcYFMF3jMmZDa.ColorChooser
         .Spinner();
      this.Downloader = false;
      this.IntegerSpinner();
      this.z9XArWABEqRRKMkN8RxcNAPyZ3rqye0J7ObmPJZOV3a3QxwGkekbC4XPNvly0sMMXUMhsGrJQsUrRONf93Yw0SNKiIme3EpGeO2m = 4;
      this.ColorChooser = true;
      this.IntegerSpinner = 2;
      this.BatModProgressBar = 2;
      this.U6YdgALLoLmkuNoSN8o2dRLyN7wSv1wvyjFCXyN8OBYuTUbKZPvqEjwcaMZLS8aIvONsZmtJWdQ2wVtMDU7OVlNurFC162XCTuFi = 70.0F;
      this.J3gqUwkDP9cGFNTz5r2DW1enqStsbYCDRDN2hW4S1R2MWHXCc33hHe08AO7ksEDK8j7sik5gPxEJJytAqWHatyjelrqjXSk2qoz1 = 0.0F;
      this.KwEKVNeYQRw1Vi07mCZoiFXURtYhbsgNDCYomGOrLdHhkqHqgyPLLpAN6X1CA0vdJHt98sSV8xUtdYZsn8T3ArOXhWJdjpf73g = 0;
      this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB = 0;
      this.K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL = true;
      this.InstallationLogger = false;
      this.RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM = true;
      this.NSnOtzyiZeShzg3vOfkhTvOpoWwhmfRxSwOSwl4saovfEDdmgpWexTiITT4OC3J9QdcdZfIk8bx3pGomzAY0Uows4dRxUHCa5Wzc = false;
      this.q0bNg2o0c9hwiB0x2AQ2xzLWHTOpmgRt9RtHvVfuq0qDtooHBzovSV4ctkaeNoP3dgHwRja7Z8yDN8lu0jA5XPLlSI6EjcHpdUVx = 1;
      this.g7yE7D4sTPDndNl7DEsAAowflKyClZYS2EdyTvvscn0hduwY8YDaOFWZFBNiGrjHy6ocH8sn2y3gLt3VWOcy0dS1bmudkdZpkNd9 = 0.8F;
      this.j3Z5lwG4SNHjKei0IHIcNVOOIlN6ZVCTLFZG3RlWKJfCNflTXVXwKXdCQzRvcErvCn1Fxsdret6ptDdorb2Cb1fX27sBoFeh0JcZ = 0;
      this.waWVgBUPQS8EAUX93yDggem31UoZvkYOaNdejOnNZRLnVVxQ8EvQe4qFI915etxu7MY85v5LlqtnuqBf9N6BWDFBimix9U985fuW = false;
      this.tRQaYXSNntij6PV4DcSlupxEkxcVsOBLXFv4nOK3Ol9pSA4cNxTlBkPP8sq20V2QKgHsBqlNwlCA2DuXXPBdDvFX73z7oxq5m5m5 = false;
      xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR();
      this.g6KrhtdaGJw9IQDg5JSwTUxCUYQAfOdquARWkpzMjWdmtoUQHRLC08guUVkQppWHIXpM2rjWs4ia6Sx3wNtAdg64M6tvgkBp1LaM = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz();
      this.QUfwuIpwJdpMYqp9TtLAsZV4wZf4qlsjQYG9BTlYS9I7KD8y3MhRw4oulwjQwhFGAxktU3NGTvuDyehgVCMBD5Pbwp77LxcjxY06 = xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz();
      this.kzTirpjGBxF6lMXnU3OtSQut8uc2l77qvnA8ubdIFDZhFGEdeA5pNXRls2AFRAdjJOPlXmmIolAi7gqMVppUpc9wEXGNY3nXOehO = false;
      this.xFhWfuM81RsOAWLOnTVH3q4upiZtEissmNfUCs23PVKyy4WMDHlOc7sKhILqy4etnF3QHoBp0ESVLtu42PfYJHbTgnlLS8yujG9i = false;
      this.ChoB8BeMt2tIFKRjmem2AQo5CRSSMb5bK38NLmDrQ0qT1pRi7oDs7qFFmJ4ItTFAfvWI0Hpcm0J0YDHAyEYb8YXEyRqBiE1h5kq = 0;
      this.br0slGdmlicKbMZ0XmbXGJZ7L0qs1DJymzcMu19mDoCV6yFH0hebtRS4h0YnugvZhkMa9vw517ROzBgX47iKPX7lT3cw8kfAGlCP = true;
      this.nuZoJynJ2Nq9uVTcpftga9lA38Vi6tSINgR3cYrc8L8eXpjIOvEo4ESkIsNity10x5LnnFQQpr1woIQcw6mUO0BhIljJEtbheWyn = 3;
      this.JavaVersion = 1.0F;
      this.DzZdm7sbj5fc0LWuJIkMDtY5EmVUQLuOf9nW7lw5s8hBRACLJjtDkGIjnETQNSv6YRbKeOd7aP0GEbYYwZrLxwLcGZvM9sZ5MDJu = 0;
      this.E9FnR5p0ebmCMjr9gvrr4LsoQMw9pTyIKGUBB27Wvs7bVIy2iFra5NJU5C4VLO6qyVTLtsUuHQT7GrSb1Kv0ocJbAWplb1tQ8zvb = 1;
      this.wX3R7BkV4rlSinjJGAkKzn2yEOJbq8aj8GAK5ELavlGRCoE6oBVtZlLxNm4q45YujY9xSJNINuti8I7BNZobS1sk7Ejc0kAcjA68 = 0;
      this.hSMlYe7503LeA7CbbVALz1jC9M8HB8zgNQY4LHkAnfyLgjvXzBsumpLcUY5Rcsl1recYw4lCY6oIVOA5xVfKlGQzbM1m6WJ9Zuae = 0.0F;
      this.A9tYVs0tKN6mpnVVz6eiPoVfhvRx7x9U01ako5iiwg5MLVmY1KT6hRAMFXDOvejzhT51PyqZxfcjNrNnDF6aAbbO0ugM7CbXcdvX = 0;
      this.y0wc3OvlwgjlmkWhXcQlXU2W22q3u9VqU9IFMkYdy7jLGRuTYnlitSxyBJLY5IRmi1scxDBbrAdVllb4r9vBZBroRf4xDkO8eWOz = 0;
      this.DOeN5YGsuCtYWV38DVwgapAkq3IMHFcb2eb3VOCMuNVnUS2rLmkstq7BdQengUa2FQWi6EmfilkTPVhhapjDd5qq2UT91oWstjR = 3;
      this.hh6NfSOcvrJcohnkEYFQflfFbpj7L33fhItKozfbgYdXfIRjZT5LnHeONniSQQSVOlU9nEo0XOvcPkywU5SIuzgmxquzhmq3yTAz = 4000;
      this.VWNwPzzYYgxk8asyqiTkn2fTvjZg3VnJJxEoDLJT4ZT9vhJf5gQw8hmMWDYpxhsAoM1OQfXVMqnjhbbqruPrt4GW2WaVT11lCoDw = false;
      this.RUqkw82jraWSCIGF2QNaQFhXL4wZ8CWwofw2zR229DRg5nDAjg7StqUaeMQrcARH5DltmswNkDOzUmD4AXNdBgQwUeqHUAuADUgI = false;
      this.jQWYRgcF7nzT5CIx7EVCKn1qaqsaq3mNMkMJNBs5aNRbZB91o1ZcuSPxb5ZY4n0xrzlK5X3C9daHtzKUhHrgXCts6FT2kQKMHIL6 = false;
      this.LTQwE0DrNKFDjmvx0fe8LpzggEMbyrNsjGxF9MSkTuiCRDJkRIuJ7MTRryUkPshBnTbPg4NTBAjHSn2k3rTwfLgb6HE9s7OE5rZP = true;
      this.PHC3PfXHfxNGhxr8qlmbwBgtFDAWis9MAjn8V7e7oXLSmezow4dZwTzrRYSwXzSWMtUii0JBu08E1JkvATKm8VH3vWAEeRNxaDVG = true;
      this.mRFNfHc3kblqdqWsLwzqRGIU02m0p9aXYDFmGNsAIxA7DlTNJQQ7y31t5ejW8Afe9z2InSkbKDnci9jD6eSnC1Tpsb6h3uVe4NBB = true;
      this.sPfEvBw4z42MuLNAJ3fjm44CtXlgBeqNcKzqAhN29y4psTiNTtwcTEgefZXj4FzI5UhTxUzVtAB0NIEofW0oY05Hpq9dLFiB8Ju = true;
      this.Idoukv4iAWw5oSAGknnDxFGc1PFg6zIgz3jnu2LWSgwso2586fVizxaNtB3tJvx7IBfqppxHQ2mc3f5N1ZZpaKWAxc7EVY34sulI = 0;
      this.fADDKPP9dGbU0vQDmyPL1IKWS9tPMG4xAexsD9axiIcV4LTn2JVMH0lN56Yi7DYwKeTn9bW8uUU2nN3V66awfcBJQ79mxiZbwo4 = 1;
      this.Q748HPpAbUSWyCwB8iKCbko2qRaLzXr4Q6pZFLmToxDljmN5Z1C6UwxMgK1PwOYyKxdoTC8kAtnHc7i6cvSUejTyyvxCwBSZ0ssV = false;
      this.jjkuV1HwQ5MnHWlymwOyACAG5WDldp5g6GlndD8c4S82SIU85mQCIn7S5vML3lh80FZXsgJueLhB59wIx6EiYwc4545L3gcwusb2 = 0;
      this.avIx9Z1GrWIa0z1gxAQZthC65WWr6UkFWqtJD2718QqJTWUtPP69vneu2NglhF5gFqt2MCtxb16VXl2MgBqthLbKrCYpy2FClIlq = false;
      this.Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B = false;
      this.KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 = "Default";
      this.VuBHKpL8HD24blvyQeU8yXcbGyxW64reqNqPzuPffAuFuCn5pFfYH6OE0Vw1vcG4wwKAEo6bdPfya6LTElkzp3EzlUKHQvBNGbe = true;
      this.sNaKXdeZMMw7u98taqZWzr0sZ1Keas4a8VLy6LojchdOZwb4E4D9bX7hNjSWrO2GOxkSsIRXnBNlImsA140QIo3NaNT2MCQLs6vc = true;
      this.NpI1RS9zVzSSEoeV6Ex4Au29JDIyfRXbBoiFoc9eE2rlDbEaJGExj9RN6MHJgB3LxtjmFHQvCFQefqyJ2el0yh7HMx6oDeKCCXb1 = true;
      this.v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ = true;
      this.YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf = true;
      this.oSVSSWilJ9xmGoebJMjpmYiiidiOVVbNhlIIdvsZvXwChyJRH7OLXgys3pqryxkyodG5uk33bGW4S8sovu5ZYyxmeRXBjv9B21ns = true;
      this.TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ = true;
      this.QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6 = true;
      this.BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb = 2;
      this.atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15 = false;
      this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = 0;
      this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = 0;
      this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B = true;
      this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u = true;
      this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 = true;
      this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 = true;
      this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl = true;
      this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza = true;
      this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj = true;
      this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D = true;
      this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF = true;
      this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5 = true;
      this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0 = true;
      this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f = true;
      this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI = true;
      this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8 = true;
      this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC = true;
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.BatModClient(
         shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.rh7QDOSFg05fyydW5Gz5bwQnsrzM4KKmWUYAblghq24rfoLdGbX36bDfT2c90YOYYsaUm5iZJUPvplKrZ9BWqLfVdpJy4eWDaPHB
      );
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.ang1ruqFyU0rHE0JHLcty9GpKnlvaxCVl8B5Ov2VcZkP1j3qsrN4kDKPhAm4p973XMNP8msK0zmRz6BD6EUECs7i3LMjVJE8Td0u = 0;
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Downloader();
      shadersmod.client.mT4H8qpjr3K6mhbf9Pam0AP2YP1sTYGnvPD3wfHgfFZVvGjpI2ZdBsqiFfs9Rv0oFLlyx4nZpP6TITqRmJak428iQhhocwQiV8qv.Button();
      this.ColorTextPane();
      this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
         .Spinner();
      this.Button();
   }

   public void IntegerSpinner() {
      Display.setVSyncEnabled(this.Downloader);
   }

   private void ColorTextPane() {
      if (this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
            .K3xIIKuansJDsNpUbxdGFQOW7ziqP9U19c78A63CpbBZjLSHxNriRDpAObixCLzkOrF62HK8YpIH3YDfQC1PdPMNAtRybku3jLjL()
         && this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj
               .GpDFKWkpAtoLQB0W2XCV5bHrfhV8v60U9eVAz8acb1obB7yclvZIoJJBby5GbawXebsAfQocYajpCi0D7X4qgixSfAmUGJnoMIBj()
            != null) {
         xBYa9uNWziOSJdNzZI2TTXICLd4Bpw2tJDSeuOZv1cZbtJlLnXpVpRYSf6QHMBs0ZNE3u1OYk9qvdsAbuC49UFImqyyXHvohKe0q.G0rcuynoQrTk4Mlm1W4cvUs7IiESq1BrFuSO7kHX35743ulZsGy0aD8sXKTYCemKzVH381ngFOLPu19GPJvmjFGptlFYSbCdIcvr = true;
      }

      RSQQcxUkrMjjgtkOewiFsb8QCHLDrhduE7BEjTPqZtflLrvCP7eFbdU7jKXj6qP2SqivDCFDuJ90sJ5GVf2P0YMdGQ6bpzV8V7Wx.BatModClient(
         this,
         this.SfmuZc1SobSZlHKCJucMVLA3DNMH6XACv7sE1WtGIL3Xu4YxuDOLGGkf37LRd8VzPhqiGdzutSvpKXc8AQwyZCDLNzOun6VymdGj.Checkbox
      );
   }

   public void BatModClient(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.D1k6enCWuCdM0dAQzAzkA1PTH11O24d6G8TJ5jSTut4YCRhe9fq7Oszp7PTxWgby8VG8RFG58cvpXHH5b5XYwPgwuYOrM1E5UlKt = var2;
      this.jy6GtEzWsFxqrzHNTIpuJdqHeRM4SKooghxbC9wW9iihGrSyrFZPJQ03iXTbBAjCW0FWYBYMiG9O3UdGUxEXSxxLXp2XAZckX0DD = var2;
      this.TOOyKL0RyQHGTfzcyeaTDGCxoZMmRr0X1VFdNKYZMyuGlNaXaE1yGWbJmtafvad4FhgOtwapHbL05x1qXbrbHSSrGdLQXr9IIM9B = var1;
      this.eXbgCpP5lUfFvUJWyVafz7sS9inkbzm9IJb10VzFRCYMC7CBeSWi0iiNHVGA5maCFjQTXOW3pR7NfCrRgHhlld6tBTrZBa125e9u = var1;
      this.CQUTsM3ZaOm9xIC60Otfp3ZYWeYeI3uergjZaxZOxG50hIuesu7dyPgosTLyoJBRJmB1hTmtuAvzgqrArTXyshN2KgTP1HC2rqF0 = var1;
      this.S8GLXLm5KazhYzi6YG4eZRFbep3nPU8AfQS0GEyFo8GZV2b49sjJWYH9MohJFtlZesTTdbPjPReu6KiQcdERSN1d7jRRmIjb62g1 = var1;
      this.WG5ncRD8g8g6NorTXxWQM402xSBZyMIxlkwYemdIYKsd88vmaVDD0pjYmiQzRLBia394jYSCDpju8uaXpZwxFfsaFRksE7wWOeGl = var1;
      this.g9grDpgp9Q2L4fyYFWCzIBwHil9xF6vb7mzmmd03cP4YwRaNZn58LxrZPCtISHYOHFoge9IrFn06Wru29OLvzhbOMA4rf7o3nbza = var1;
      this.s857KWyIDojH7xVL6faaCWAtRKSQY0DoYMS6voW8nIorimo6R2cstMCxoXgTjzjSuep34Kboj3ZGRJrLRjMaHCMtoH5RHXSI2Htj = var1;
      this.EWabrQtPquk8qdEItHBwbJjOzlKgnHqSFhtU6ccvybB9d0CfLyQ96dLE8hevi2lCt0AN5RJ6baO3or0VMMtA1qSUHPn99dTY7u4D = var1;
      this.S4vtFCkd9FN55UhuOr39A9bal5W6ygnK2uYAZrpEvFGgxWXgW10IuYigT7AXjOAwS6RL4HfnLJfLP29NlbMDgjF4rKktwNqWf5nF = var1;
      this.uJO6Tfgp5hLZ2rvJ1BObOrMTB7FHsTE4qhiR7gMSGus9m3vQyRp2K2roFo15AVf4eRsTRSRzwayayszkJZR3BR78ktYTs59aFVT5 = var1;
      this.C5cMttwG6kF4Wh24MOebWX8h6LOqlO1cOH6lLE2QZVooD5Lvz4eHU8b1wcTzNH55ZWDx7R3roOJASj2IIHLEoLIMVZxlxLJopKs0 = var1;
      this.UZ3iGZ7MXjyfPWWW7NQNV5ZMQeEgTMzYQeHJGCbAWdgD3q5b3ra5T6R6EmHiDBusWXvauVH4LBOAP8T0Yk0GfYft4tvV5zaNa9f = var1;
      this.syL6UWLnUMtPFIFKx7WRaPksbi53tc4HSA9aITKYhLi6eHO9gnbwY2VzSEAYb3Vah02mC31TFJUWNlsV49WTYiTtvXvWICjgQoUB = var1 ? 0 : 2;
      this.DbrdF8vWhqXtjGHmYQWyBoXSPt7w8p3FMNrWz6ShKbwcHnvBcOr8QDLdtw2kzPGAg4OvCmX5JYNbAbkXVn7vASkGkGEnMbPwN8cI = var1;
      this.Zu9ariGMObcLrsc5xhkikKoD4HjcVgNV3E3J4HsWmlEwrZ4XyAkSyv444wChkFluHMIG9V7gaRZwVXjzDwKnsQka4POVbGfn3xu8 = var1;
      this.OSjBgdCUvxnMloWtQKpr5HJPf98chaNooh4kkrYJFJMGyVl19rA3lHK3IVf1FbP4ufrRhek69Ygbg9V0uUoD9jth2JsjSVgqcfC = var1;
   }

   private static int BatModClient(int var0, int[] var1) {
      int var2 = CustomSpinner(var0, var1);
      if (var2 < 0) {
         return var1[0];
      }

      if (++var2 >= var1.length) {
         var2 = 0;
      }

      return var1[var2];
   }

   private static int Button(int var0, int[] var1) {
      int var2 = CustomSpinner(var0, var1);
      return var2 < 0 ? var1[0] : var0;
   }

   private static int CustomSpinner(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }
}
