package br.senac.go.resource;

import br.senac.go.interfaces.IResource;

import br.senac.go.model.Carteira;
import br.senac.go.service.CarteiraService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j //fazer log das requisições
@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/api/carteira")
@Tag(name = "carteira", description = "documentação ao resource carteira")
/*@Tags({
        @Tag(name = "carteira", description = "documentação ao resource carteira"),
        @Tag(name = "investimento", description = "documentação para carteira de investimento")
})*/

//@AllArgsConstructor(onConstructor = @__(@Autowired)) //forma 03
public class CarteiraResource implements IResource<Carteira, Integer> {

    CarteiraService carteiraService;

    public CarteiraResource (CarteiraService carteiraService) { this.carteiraService = carteiraService; }

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    @Operation(
            summary = "Cria uma carteira",
            description = "Método responsável para criar uma carteira no sistema",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira create(@Valid @RequestBody Carteira entity) {
        log.info("Executado método CarteiraResource.create");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.create | valores: %s",entity.toString()));

        Carteira carteira = carteiraService.create(entity);

        return carteira;
    }

    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera uma carteira",
            description = "Método responsável para recuperar uma carteira no sistema",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira read(@Valid @RequestBody Carteira entity) throws Exception {
        log.info("Executado método CarteiraResource.read");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.read | valores: %s",entity.toString()));

        Carteira carteira = carteiraService.read((entity));

        return carteira;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera uma carteira baseado em um identificador",
            description = "Método responsável para recuperar uma carteira no sistema baseado no identificador",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método CarteiraResource.readById");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.readById | valores: %d",id));

        Carteira carteira = carteiraService.readById(id);

        return carteira;
    }

    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza uma carteira",
            description = "Método responsável para atualizar uma carteira.",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira update(@Valid @RequestBody Carteira entity) {
        log.info("Executado método CarteiraResource.update");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.update | valores: %s",entity.toString()));

        Carteira carteira = carteiraService.update(entity);

        return carteira;
    }

    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza parte de uma carteira",
            description = "Método responsável para atualizar parte de uma carteira.",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira updatePart(@PathVariable Integer id, @Valid @RequestBody Carteira entity) throws Exception {
        log.info("Executado método CarteiraResource.updatePart");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.updatePart | valores: %d, %s",id, entity.toString()));

        Carteira carteira = carteiraService.updatePart(id,entity);
        return carteira;
    }

    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza todos os dados de uma carteira",
            description = "Método responsável para atualizar todos os dados de uma carteira.",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Carteira updateFull(@PathVariable Integer id, @Valid @RequestBody Carteira entity) {
        log.info("Executado método CarteiraResource.updateFull");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.updateFull | valores: %d, %s",id, entity.toString()));

        Carteira carteira = carteiraService.updateFull(id, entity);
        return carteira;
    }

    @Override
    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete uma carteira com base no identificador.",
            description = "Método responsável para deletar uma carteira com base no identificador",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void delete(@PathVariable Integer id) {
        log.info("Executado método CarteiraResource.delete");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.delete | valores: %d",id));

        carteiraService.deleteById(id);
    }

    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Delete uma carteira com base no objeto informado.",
            description = "Método responsável para deletar uma carteira com base no objeto informado.",
            tags = {"carteira"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Carteira.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void deleteByEntity(@Valid @RequestBody Carteira entity) {
        log.info("Executado método CarteiraResource.deleteByEntity");
        //log.debug("Executado método CarteiraResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método CarteiraResource.deleteByEntity | valores: %s",entity.toString()));

        carteiraService.delete(entity);
    }
}

