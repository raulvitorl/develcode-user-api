package br.com.develcode.user.api.usecase.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.develcode.user.api.exception.ApiErrorResponse;
import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.UsuarioRepository;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.multipart.MultipartFile;

@ContextConfiguration(classes = {CadastrarUsuarioUseCaseImpl.class})
@ExtendWith(SpringExtension.class)
class CadastrarUsuarioUseCaseImplTest {
    @Autowired
    private CadastrarUsuarioUseCaseImpl cadastrarUsuarioUseCaseImpl;

    @MockBean
    private UsuarioRepository usuarioRepository;

    /**
     * Method under test: {@link CadastrarUsuarioUseCaseImpl#execute(String, String, String, MultipartFile, HttpServletRequest)}
     */
    @Test
    void quandoCadastrarUsuarioComCodigoRepetidoDeveRetornarErro() throws UnsupportedEncodingException, ParseException {
        // Arrange
        Usuario usuario = new Usuario();
        String codigo = "Codigo";
        usuario.setCodigo(codigo);
        int year = 1970;
        int month = 1;
        int dayOfMonth = 1;
        LocalDateTime atStartOfDayResult = LocalDate.of(year, month, dayOfMonth).atStartOfDay();
        String zoneId = "UTC";
        usuario.setDataNascimento(Date.from(atStartOfDayResult.atZone(ZoneId.of(zoneId)).toInstant()));
        long id = 123L;
        usuario.setId(id);
        String nome = "Nome";
        usuario.setNome(nome);
        when(usuarioRepository.findByCodigo((String) any())).thenReturn(usuario);
        String codigo1 = "Codigo";
        String nome1 = "Nome";
        String dataNascimento = "alice.liddell@example.org";
        String name = "Name";
        String string = "AAAAAAAA";
        String charsetName = "UTF-8";
        MockMultipartFile foto = new MockMultipartFile(name, string.getBytes(charsetName));

        // Act
        ResponseEntity<?> actualExecuteResult = cadastrarUsuarioUseCaseImpl.execute(codigo1, nome1, dataNascimento, foto,
                new MockHttpServletRequest());

        // Assert
        boolean expectedHasBodyResult = true;
        assertEquals(expectedHasBodyResult, actualExecuteResult.hasBody());
        boolean expectedIsEmptyResult = true;
        assertEquals(expectedIsEmptyResult, actualExecuteResult.getHeaders().isEmpty());
        HttpStatus expectedStatusCode = HttpStatus.CONFLICT;
        assertEquals(expectedStatusCode, actualExecuteResult.getStatusCode());
        String expectedMessage = "Já existe um usuário cadastrado com este código.";
        assertEquals(expectedMessage, ((ApiErrorResponse) actualExecuteResult.getBody()).getMessage());
        Object expectedError = null;
        assertEquals(expectedError, ((ApiErrorResponse) actualExecuteResult.getBody()).getError());
        String expectedPath = "/usuario/v1/cadastrar";
        assertEquals(expectedPath, ((ApiErrorResponse) actualExecuteResult.getBody()).getPath());
        int expectedStatus = 409;
        assertEquals(expectedStatus, ((ApiErrorResponse) actualExecuteResult.getBody()).getStatus());
        verify(usuarioRepository).findByCodigo((String) any());
    }
}

