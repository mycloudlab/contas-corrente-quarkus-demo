package br.com.bb.conta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contas")
public class ContaCorrenteResource {

  Set<ContaCorrente> contas = new HashSet<>();

  public ContaCorrenteResource(){
    contas.add(new ContaCorrente("00045789100", "001", "145784-X", BigDecimal.valueOf(1500.00)));
  }
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Set<ContaCorrente> list() {
    return contas;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{cpf}")
  public Response retrive(@PathParam("cpf") String cpf) {
    List<ContaCorrente> contas = this.contas.stream().filter((p)->cpf.equals(p.getCpf()))  .collect(Collectors
        .toCollection(ArrayList::new));

    return Response.ok(contas).build();
  }


}
