package br.com.develcode.user.api.usecase.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.UsuarioRepository;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {RecuperarUsuarioPorCodigoUseCaseImpl.class})
@ExtendWith(SpringExtension.class)
class RecuperarUsuarioPorCodigoUseCaseImplTest {
    @Autowired
    private RecuperarUsuarioPorCodigoUseCaseImpl recuperarUsuarioPorCodigoUseCaseImpl;

    @MockBean
    private UsuarioRepository usuarioRepository;

    /**
     * Method under test: {@link RecuperarUsuarioPorCodigoUseCaseImpl#execute(String)}
     */
    @Test
    void testExecute() throws ParseException {
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

        Usuario usuario1 = new Usuario();
        String codigo1 = "Codigo";
        usuario1.setCodigo(codigo1);
        int year1 = 1970;
        int month1 = 1;
        int dayOfMonth1 = 1;
        LocalDateTime atStartOfDayResult1 = LocalDate.of(year1, month1, dayOfMonth1).atStartOfDay();
        String zoneId1 = "UTC";
        usuario1.setDataNascimento(Date.from(atStartOfDayResult1.atZone(ZoneId.of(zoneId1)).toInstant()));
        long id1 = 123L;
        usuario1.setId(id1);
        String nome1 = "Nome";
        usuario1.setNome(nome1);
        when(usuarioRepository.save((Usuario) any())).thenReturn(usuario1);
        when(usuarioRepository.findByCodigo((String) any())).thenReturn(usuario);
        String codigo2 = "Codigo";

        // Act
        ResponseEntity<?> actualExecuteResult = recuperarUsuarioPorCodigoUseCaseImpl.execute(codigo2);

        // Assert
        boolean expectedHasBodyResult = true;
        assertEquals(expectedHasBodyResult, actualExecuteResult.hasBody());
        boolean expectedIsEmptyResult = true;
        assertEquals(expectedIsEmptyResult, actualExecuteResult.getHeaders().isEmpty());
        HttpStatus expectedStatusCode = HttpStatus.OK;
        assertEquals(expectedStatusCode, actualExecuteResult.getStatusCode());
        verify(usuarioRepository).findByCodigo((String) any());
        verify(usuarioRepository).save((Usuario) any());
    }
}

