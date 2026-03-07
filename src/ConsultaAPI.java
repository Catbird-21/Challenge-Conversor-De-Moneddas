import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsultaAPI {
    public DatosConversion buscarTasa(String base, String target, double cantidad) {
        String apiKey = "f15cefa852686e1f4baf3397";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base + "/" + target + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DatosConversion.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión.");
        }
    }
}
