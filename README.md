![alt text](https://www.develcode.com.br/img/bannertop.jpg "Develcode")
# DEVELCODE USER API
Aplicação para cadastro básico de usuarios.

## Testando a aplicação
Abrir o diretorio raiz do projeto, executar o comando:

```
docker build .
```
Ao concluir a build da imagem, execute:
```
docker image ls
```
Procure pelo IMAGE_ID da imagem mais a data de criação mais recente (a que acabou de ser gerada) e então execute:
```
docker run -p 8080:8080 IMAGE_ID
```

Acessar a interface do swagger:

http://localhost:8080/swagger-ui.html#/

Apenas classes onde houve necessidade de implementação lógica e das regras solicitadas foram testadas.