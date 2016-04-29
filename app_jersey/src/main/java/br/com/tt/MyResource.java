package br.com.tt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("/pessoa")
    @Produces(MediaType.TEXT_PLAIN)
    public String pessoa() throws JsonProcessingException {
    	Pessoa pessoa = new Pessoa();
    	pessoa.setNome("eee");
    	ObjectMapper mapper = new ObjectMapper();
    	
    	return mapper.writeValueAsString(pessoa);
    	
    }
}
