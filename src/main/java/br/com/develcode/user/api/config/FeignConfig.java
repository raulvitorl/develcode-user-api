package br.com.develcode.user.api.config;

import java.util.Collections;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.develcode.user.api.exception.BusinessException;
import br.com.develcode.user.api.exception.ExceptionResponse;
import feign.Response;
import feign.codec.ErrorDecoder;

@Configuration
public class FeignConfig implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        try {
            Integer status = response.status();
            String body = response.body().toString();
            ExceptionResponse exceptionResponse = new ObjectMapper().readValue(body, ExceptionResponse.class);
            return new BusinessException(status,HttpStatus.valueOf(status).getReasonPhrase(),exceptionResponse.getDetails());
        } catch (JsonProcessingException exp) {
            return new BusinessException(HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),Collections.singletonList(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
        }
    }

}
