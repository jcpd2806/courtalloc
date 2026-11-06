# 📋 Roadmap y Progreso: CourtAlloc API

Esta checklist detalla los pasos para construir la API desde cero hasta dejarla lista para la nube. Marca las casillas reemplazando `[ ]` con `[x]`.

## Fase 1: Configuración Inicial (Setup)
- [x] Generar el proyecto en Spring Initializr (Java 21, Spring Boot 4.1.2).
- [x] Configurar dependencias (Web, Data JPA, PostgreSQL, Validation, Lombok, Actuator).
- [x] Crear el archivo `docker-compose.yml` para la base de datos PostgreSQL.
- [x] Configurar la conexión a la base de datos en `application.yml`.
- [x] Levantar el proyecto y verificar el healthcheck en `/actuator/health`.
- [x] Crear la estructura base de paquetes (`model`, `repository`, `dto`, `exception`, `service`, `controller`).

## Fase 2: Modelado de Dominio (Capa JPA)
- [ ] Crear la entidad `Tournament` (Torneo) con `@Entity`.
- [ ] Crear la entidad `Team` (Equipo) con sus atributos básicos.
- [ ] Crear la entidad `Court` (Cancha) especificando disponibilidad.
- [ ] Crear la entidad `Match` (Partido) con horario de inicio y fin.
- [ ] Definir las relaciones entre entidades (`@OneToMany`, `@ManyToOne`).

## Fase 3: Acceso a Datos (Capa Repository)
- [ ] Crear `TournamentRepository` extendiendo de `JpaRepository`.
- [ ] Crear `TeamRepository` extendiendo de `JpaRepository`.
- [ ] Crear `CourtRepository` extendiendo de `JpaRepository`.
- [ ] Crear `MatchRepository` con consultas personalizadas (ej. verificar si una cancha está ocupada en cierto horario).

## Fase 4: Contratos de la API (Capa DTO)
- [ ] Crear DTOs de entrada (`TournamentRequest`, `MatchScheduleRequest`).
- [ ] Crear DTOs de salida (`TournamentResponse`, `MatchResponse`).
- [ ] Agregar anotaciones de `Jakarta Validation` (`@NotNull`, `@Future`, `@Min`) a los DTOs de entrada.

## Fase 5: Manejo de Errores Corporativo
- [ ] Crear excepciones personalizadas (ej. `ResourceConflictException`, `ResourceNotFoundException`).
- [ ] Crear la clase `GlobalExceptionHandler` anotada con `@RestControllerAdvice`.
- [ ] Mapear excepciones a códigos HTTP estándar (400 Bad Request, 404 Not Found, 409 Conflict).

## Fase 6: Lógica de Negocio (Capa Service)
- [ ] Crear `TournamentService` para el CRUD básico de torneos.
- [ ] Crear `TournamentSchedulerService` para alojar el algoritmo principal.
- [ ] Implementar validación de disponibilidad de canchas.
- [ ] Implementar la generación del calendario asegurando transaccionalidad (`@Transactional`).

## Fase 7: Exposición de la API (Capa Controller)
- [ ] Crear `TournamentController` con mapeo base `/api/v1/tournaments`.
- [ ] Implementar endpoint `POST` para crear un torneo.
- [ ] Implementar endpoint `POST` para agregar equipos y canchas.
- [ ] Implementar endpoint `POST` para disparar la calendarización automática.
- [ ] Implementar endpoint `GET` para consultar el calendario generado.

## Fase 8: Control de Versiones y Despliegue
- [ ] Inicializar repositorio Git y hacer el primer commit.
- [ ] Subir el código a GitHub.
- [ ] Crear el `Dockerfile` definitivo (Multi-stage build).