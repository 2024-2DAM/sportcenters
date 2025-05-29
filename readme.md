## Endpoints
Los endpoints van a ser las url que mi aplicación va a poder atender. Son peticiones HTTP de tipo GET, POST, PUT y DELETE.

- `GET /sportcenter`: devuelve todos los polideportivos
- `GET /sportcenter/{name}`: devuelve el polideportivo con ese id
- `POST /sportcenter`: inserta un polideportivo que le pasamos en el cuerpo de la petición HTTP en formato JSON.
- `PUT /sportcenter/{id}`: modifico el polideportivo con ese id con los datos del cuerpo de la petición HTTP.
- `DELETE /sportcenter`: necesito la variable de la url id, y elimina ese polideportivo. Ejemplo: localhost:3030/sportcenter?id=2
- `GET /sportcenter/capacity`: con variables min y max. EJ: localhost:3030//sportcenter/capacity?min=XX&max=ZZ