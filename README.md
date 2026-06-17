# Banking API Gateway

[![CI](https://github.com/koketseraphasha/banking-api-gateway/actions/workflows/ci.yml/badge.svg)](https://github.com/koketseraphasha/banking-api-gateway/actions/workflows/ci.yml)

API gateway for banking microservices with authentication, rate limiting, request validation, and monitoring.

## Features
- Request routing
- Authentication & authorization
- Rate limiting
- Request/response logging
- Health monitoring

## Stack
Java 21, Spring Boot, Spring Security, PostgreSQL, Docker

## Quick Start
```bash
docker compose up -d
```

## Deployment & Architecture

This project is designed with cloud-ready principles:

- **Containerized** using Docker for consistent deployment
- **Environment-based configuration** — no hardcoded secrets
- **Modular structure** for independent scaling
- **Stateless design** where applicable
- **Separation of concerns** for maintainability

### Run Locally

`ash
docker-compose up --build
`

---

*Part of the Kirov Dynamics Technology portfolio — backend engineering focused on security, scalability, and system design.*
