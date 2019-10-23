package br.unifor.uniflix.controller;

import br.unifor.uniflix.model.Filme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Path("/filmes")
public class FilmesController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listTopRated() {
        return Response.ok(Arrays.asList(new Filme(), new Filme())).build();
    }
}
