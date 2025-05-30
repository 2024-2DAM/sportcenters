## Endpoints
Los endpoints van a ser las url que mi aplicación va a poder atender. Son peticiones HTTP de tipo GET, POST, PUT y DELETE.

- `GET /sportcenter`: devuelve todos los polideportivos
- `GET /sportcenter/{name}`: devuelve el polideportivo con ese name
- `POST /sportcenter`: inserta un polideportivo que le pasamos en el cuerpo de la petición HTTP en formato JSON.
- `PUT /sportcenter/{name}`: modifico el polideportivo con ese name con los datos del cuerpo de la petición HTTP.
- `DELETE /sportcenter`: necesito la variable de la url name, y elimina ese polideportivo. Ejemplo: localhost:3030/sportcenter?name=2
- `GET /sportcenter/capacity`: con variables min y max. EJ: localhost:3030//sportcenter/capacity?min=XX&max=ZZ

### Endpoints para la clase Address
- `GET /adress`: devuelve todas las direcciones
- `GET /address/{id}`: devuelve la dirección con ese id
- `POST /address`: inserta la dirección del cuerpo de la petición http
- `PUT /address/{id}`: actualiza la dirección con id con la info del cuerpo de la petición
- `DELETE /address/{id}`: la elimina
- `GET /address/search?city=XXX&street=YYY`: devuelve las direcciones de esa ciudad o (OR) de esa calle
- `GET /address/numbers/{number}`: devuelve las direcciones con el número del endpoint.