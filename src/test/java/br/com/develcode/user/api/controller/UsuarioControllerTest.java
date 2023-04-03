package br.com.develcode.user.api.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import br.com.develcode.user.api.usecase.CadastrarUsuarioUseCase;
import br.com.develcode.user.api.usecase.RecuperarUsuarioPorCodigoUseCase;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.multipart.MultipartFile;

@ContextConfiguration(classes = {UsuarioController.class})
@ExtendWith(SpringExtension.class)
class UsuarioControllerTest {
    @MockBean
    private CadastrarUsuarioUseCase cadastrarUsuarioUseCase;

    @MockBean
    private RecuperarUsuarioPorCodigoUseCase recuperarUsuarioPorCodigoUseCase;

    @Autowired
    private UsuarioController usuarioController;

    /**
     * Method under test: {@link UsuarioController#cadastrarUsuario(String, String, String, MultipartFile, HttpServletRequest)}
     */
    @Test
    void quandoCadastrarUsuarioComFormularioInvalidoDeveRetornar415() throws Exception {
        // Arrange
        String urlTemplate = "/usuario/v1/cadastrar";
        String name = "codigo";
        String string = "foo";
        String name1 = "dataNascimento";
        String string1 = "foo";
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.post(urlTemplate)
                .param(name, string)
                .param(name1, string1);
        String name2 = "foto";
        MultipartFile obj = null;
        String name3 = "nome";
        String string2 = "foo";
        MockHttpServletRequestBuilder requestBuilder = paramResult.param(name2, String.valueOf(obj)).param(name3, string2);

        // Act
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(usuarioController)
                .build()
                .perform(requestBuilder);

        // Assert
        int status = 415;
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(status));
    }

    /**
     * Method under test: {@link UsuarioController#recperarUsuarioPorCodigo(String)}
     */
    @Test
    void recuperarUsuarioNaoExistenteRetornaNotFound() throws Exception {
        // Arrange
        HttpStatus statusCode = HttpStatus.NOT_FOUND;
        when((ResponseEntity<Object>) recuperarUsuarioPorCodigoUseCase.execute((String) any()))
                .thenReturn(new ResponseEntity<>(statusCode));
        String urlTemplate = "/usuario/v1/recuperar/{codigo}";
        String string = "00000";
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get(urlTemplate, string);

        // Act
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(usuarioController)
                .build()
                .perform(requestBuilder);

        // Assert
        int status = 404;
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(status));
    }
}

