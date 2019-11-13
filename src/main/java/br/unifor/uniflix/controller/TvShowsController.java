package br.unifor.uniflix.controller;

import br.unifor.uniflix.model.Filme;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/tvshows")
public class TvShowsController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response airingToday() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3" + "/tv/airing_today?api_key=<API-KEY-AQUI>")
                .build();

        Call call = client.newCall(request);

        okhttp3.Response response = call.execute();
        if (response.isSuccessful()) {
            JSONObject jsonResponse = new  JSONObject(response.body().string());
            JSONArray result = jsonResponse.getJSONArray("results");
            
            return Response.ok("").build();
        }
        return Response.serverError().build();
    }
}
