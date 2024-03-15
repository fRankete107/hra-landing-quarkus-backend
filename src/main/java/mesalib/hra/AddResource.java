package mesalib.hra;

import mesalib.hra.mensaje.application.Add;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import mesalib.hra.mensaje.application.shared.MensajeDto;
import mesalib.hra.utils.JsonResponse;
import mesalib.hra.utils.ResponseException;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;


@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class AddResource {
    @Inject
    Add add;

    @POST
    @Path("/mensajes")
    public Response add(@RequestBody MensajeDto request) {
        try {
            var response = add.addMensaje(request);
            return Response.ok().entity(new JsonResponse<>(JsonResponse.OK, response)).build();
        } catch(ResponseException re) {
            return Response.ok().entity(new JsonResponse<>(JsonResponse.ERROR, re.getCode(), re.getMessage(), re.getException())).build();
        }
    }
}
